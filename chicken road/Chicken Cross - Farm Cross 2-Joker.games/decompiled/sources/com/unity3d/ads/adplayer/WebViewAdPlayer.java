package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import com.google.protobuf.ByteString;
import com.ironsource.C4352c8;
import com.ironsource.U3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* compiled from: WebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010-\u001a\u00020\u001a2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/H\u0096@¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u001aH\u0016J\u001c\u00103\u001a\u00020\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:H\u0096@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010>J\u0016\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010>J\u0016\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010>J\u000e\u0010C\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ\u0016\u0010N\u001a\u00020\u001a2\u0006\u00109\u001a\u00020,H\u0096@¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "bridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;)V", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "isCompletedManually", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "storageEventCallback", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "onOfferwallEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "getOnOfferwallEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "onLoadEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onBroadcastEvents", "", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "sendEvent", "getEvent", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOfferwallEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVisibilityChange", C4352c8.k, "sendFocusChange", "isFocused", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onBroadcastEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final CoroutineDispatcher dispatcher;
    private final MutableStateFlow<Boolean> isCompletedManually;
    private final Flow<String> onBroadcastEvents;
    private final Flow<LoadEvent> onLoadEvent;
    private final Flow<OfferwallShowEvent.Show> onOfferwallEvent;
    private final SharedFlow<ShowEvent> onShowEvent;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Function1<StorageEventInfo, Unit> storageEventCallback;
    private final WebViewContainer webViewContainer;

    public WebViewAdPlayer(WebViewBridge bridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CoroutineDispatcher dispatcher, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, CoroutineScope adPlayerScope) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this.isCompletedManually = MutableStateFlow;
        Function1<StorageEventInfo, Unit> function1 = new Function1() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit storageEventCallback$lambda$0;
                storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0(WebViewAdPlayer.this, (StorageEventInfo) obj);
                return storageEventCallback$lambda$0;
            }
        };
        this.storageEventCallback = function1;
        this.scope = CoroutineScopeKt.plus(CoroutineScopeKt.plus(adPlayerScope, dispatcher), new CoroutineName("WebViewAdPlayer"));
        final SharedFlow<Invocation> onInvocation = bridge.getOnInvocation();
        final Flow<Invocation> flow = new Flow<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (ArraysKt.contains(new String[]{ExposedFunctionLocation.SHOW_OFFERWALL_AD}, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Invocation> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        this.onOfferwallEvent = new Flow<OfferwallShowEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                if (Intrinsics.areEqual(invocation.getLocation(), ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                                    OfferwallShowEvent.Show show = OfferwallShowEvent.Show.INSTANCE;
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(show, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    throw new IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OfferwallShowEvent.Show> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        final SharedFlow<Invocation> onInvocation2 = bridge.getOnInvocation();
        final Flow<Invocation> flow2 = new Flow<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    String[] strArr;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                strArr = WebViewAdPlayerKt.SHOW_EVENTS;
                                if (ArraysKt.contains(strArr, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Invocation> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        this.onShowEvent = FlowKt.shareIn(FlowKt.flowCombine(new Flow<ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x010a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ShowEvent showEvent;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                String location = invocation.getLocation();
                                switch (location.hashCode()) {
                                    case -1250843874:
                                        if (location.equals(ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                            showEvent = ShowEvent.CancelTimeout.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -928612193:
                                        if (location.equals(ExposedFunctionLocation.COMPLETED)) {
                                            Object first = ArraysKt.first(invocation.getParameters());
                                            String str = first instanceof String ? (String) first : null;
                                            showEvent = new ShowEvent.Completed(Intrinsics.areEqual(str, "COMPLETED") ? ShowStatus.COMPLETED : Intrinsics.areEqual(str, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR, null, null, 6, null);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -707523043:
                                        if (location.equals(ExposedFunctionLocation.LEFT_APPLICATION)) {
                                            showEvent = ShowEvent.LeftApplication.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -497639557:
                                        if (location.equals(ExposedFunctionLocation.CLICKED)) {
                                            showEvent = ShowEvent.Clicked.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -92323172:
                                        if (location.equals(ExposedFunctionLocation.RECEIVED_REWARD)) {
                                            showEvent = ShowEvent.ReceivedReward.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1039618005:
                                        if (location.equals(ExposedFunctionLocation.STARTED)) {
                                            showEvent = ShowEvent.Started.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1306610281:
                                        if (location.equals(ExposedFunctionLocation.FAILED)) {
                                            Object first2 = ArraysKt.first(invocation.getParameters());
                                            Intrinsics.checkNotNull(first2, "null cannot be cast to non-null type org.json.JSONObject");
                                            JSONObject jSONObject = (JSONObject) first2;
                                            int optInt = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
                                            String optString = jSONObject.optString("message");
                                            Intrinsics.checkNotNull(optString);
                                            showEvent = new ShowEvent.Error(optString, optInt, "adviewer");
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    default:
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                }
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShowEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, MutableStateFlow, new WebViewAdPlayer$onShowEvent$3(null)), getScope(), SharingStarted.INSTANCE.getEagerly(), 10);
        final SharedFlow<Invocation> onInvocation3 = bridge.getOnInvocation();
        final Flow<Invocation> flow3 = new Flow<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Invocation> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    String[] strArr;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                strArr = WebViewAdPlayerKt.LOAD_EVENTS;
                                if (ArraysKt.contains(strArr, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.onLoadEvent = FlowKt.take(FlowKt.shareIn(new Flow<LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super LoadEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    LoadEvent loadEvent;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                if (Intrinsics.areEqual(invocation.getLocation(), ExposedFunctionLocation.LOAD_ERROR)) {
                                    Object first = ArraysKt.first(invocation.getParameters());
                                    Intrinsics.checkNotNull(first, "null cannot be cast to non-null type org.json.JSONObject");
                                    JSONObject jSONObject = (JSONObject) first;
                                    int optInt = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
                                    String optString = jSONObject.optString("message");
                                    Intrinsics.checkNotNull(optString);
                                    loadEvent = new LoadEvent.Error(optString, optInt);
                                } else {
                                    loadEvent = LoadEvent.Completed.INSTANCE;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(loadEvent, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, getScope(), SharingStarted.INSTANCE.getEagerly(), 1), 1);
        final SharedFlow<Invocation> onInvocation4 = bridge.getOnInvocation();
        final Flow<Invocation> flow4 = new Flow<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Invocation> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (Intrinsics.areEqual(((Invocation) obj).getLocation(), ExposedFunctionLocation.BROADCAST_EVENT)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        Flow<String> flow5 = new Flow<String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String obj3 = ArraysKt.first(((Invocation) obj).getParameters()).toString();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.onBroadcastEvents = flow5;
        Storage.INSTANCE.addStorageEventCallback(function1);
        JobKt.getJob(adPlayerScope.getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$9;
                _init_$lambda$9 = WebViewAdPlayer._init_$lambda$9(WebViewAdPlayer.this, (Throwable) obj);
                return _init_$lambda$9;
            }
        });
        FlowKt.launchIn(FlowKt.onEach(flow5, new AnonymousClass2(AdPlayer.INSTANCE.getBroadcastEventChannel())), getScope());
        FlowKt.launchIn(FlowKt.onEach(AdPlayer.INSTANCE.getBroadcastEventChannel(), new AnonymousClass3(this)), getScope());
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(Continuation<? super Unit> continuation) {
        return AdPlayer.DefaultImpls.destroy(this, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit storageEventCallback$lambda$0(WebViewAdPlayer webViewAdPlayer, StorageEventInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(webViewAdPlayer.getScope(), null, null, new WebViewAdPlayer$storageEventCallback$1$1(webViewAdPlayer, it, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<OfferwallShowEvent.Show> getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public SharedFlow<ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(WebViewAdPlayer webViewAdPlayer, Throwable th) {
        Storage.INSTANCE.removeStorageEventCallback(webViewAdPlayer.storageEventCallback);
        return Unit.INSTANCE;
    }

    /* compiled from: WebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass2(Object obj) {
            super(2, obj, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((MutableSharedFlow) this.receiver).emit(str, continuation);
        }
    }

    /* compiled from: WebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<String, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestShow(Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        WebViewAdPlayer$requestShow$1 webViewAdPlayer$requestShow$1;
        Object coroutine_suspended;
        int i;
        JSONObject jSONObject;
        String str;
        Map<String, ? extends Object> map2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Object privacyFsm;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        Map<String, ? extends Object> map3;
        String str2;
        JSONObject jSONObject6;
        if (continuation instanceof WebViewAdPlayer$requestShow$1) {
            webViewAdPlayer$requestShow$1 = (WebViewAdPlayer$requestShow$1) continuation;
            if ((webViewAdPlayer$requestShow$1.label & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$requestShow$1.label -= Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$requestShow$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewAdPlayer$requestShow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                    jSONObject = new JSONObject();
                    jSONObject.put(U3.i.n, this.deviceInfoRepository.getOrientation());
                    jSONObject.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
                    jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
                    jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
                    SessionRepository sessionRepository = this.sessionRepository;
                    webViewAdPlayer$requestShow$1.L$0 = map;
                    webViewAdPlayer$requestShow$1.L$1 = jSONObject;
                    webViewAdPlayer$requestShow$1.L$2 = jSONObject;
                    str = ShareConstants.WEB_DIALOG_PARAM_PRIVACY;
                    webViewAdPlayer$requestShow$1.L$3 = ShareConstants.WEB_DIALOG_PARAM_PRIVACY;
                    webViewAdPlayer$requestShow$1.L$4 = jSONObject;
                    webViewAdPlayer$requestShow$1.label = 1;
                    obj = sessionRepository.getPrivacy(webViewAdPlayer$requestShow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map;
                    jSONObject2 = jSONObject;
                    jSONObject3 = jSONObject2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        jSONObject6 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                        str2 = (String) webViewAdPlayer$requestShow$1.L$3;
                        jSONObject4 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                        jSONObject5 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                        map3 = (Map) webViewAdPlayer$requestShow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                        ByteString byteString = this.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                        Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
                        jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                        if (map3 != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                                if (!Intrinsics.areEqual(entry.getKey(), "objectId")) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
                            }
                        }
                        webViewAdPlayer$requestShow$1.L$0 = null;
                        webViewAdPlayer$requestShow$1.L$1 = null;
                        webViewAdPlayer$requestShow$1.L$2 = null;
                        webViewAdPlayer$requestShow$1.L$3 = null;
                        webViewAdPlayer$requestShow$1.L$4 = null;
                        webViewAdPlayer$requestShow$1.label = 3;
                        if (this.bridge.request(U3.i.K, "show", new Object[]{jSONObject5}, webViewAdPlayer$requestShow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    jSONObject2 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                    String str3 = (String) webViewAdPlayer$requestShow$1.L$3;
                    JSONObject jSONObject7 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    jSONObject3 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                    map2 = (Map) webViewAdPlayer$requestShow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = str3;
                    jSONObject = jSONObject7;
                }
                jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                SessionRepository sessionRepository2 = this.sessionRepository;
                webViewAdPlayer$requestShow$1.L$0 = map2;
                webViewAdPlayer$requestShow$1.L$1 = jSONObject3;
                webViewAdPlayer$requestShow$1.L$2 = jSONObject;
                webViewAdPlayer$requestShow$1.L$3 = "privacyFsm";
                webViewAdPlayer$requestShow$1.L$4 = jSONObject;
                webViewAdPlayer$requestShow$1.label = 2;
                privacyFsm = sessionRepository2.getPrivacyFsm(webViewAdPlayer$requestShow$1);
                if (privacyFsm != coroutine_suspended) {
                    return coroutine_suspended;
                }
                jSONObject4 = jSONObject;
                jSONObject5 = jSONObject3;
                map3 = map2;
                str2 = "privacyFsm";
                obj = privacyFsm;
                jSONObject6 = jSONObject4;
                jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                ByteString byteString2 = this.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                Intrinsics.checkNotNullExpressionValue(byteString2, "toByteString(...)");
                jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
                if (map3 != null) {
                }
                webViewAdPlayer$requestShow$1.L$0 = null;
                webViewAdPlayer$requestShow$1.L$1 = null;
                webViewAdPlayer$requestShow$1.L$2 = null;
                webViewAdPlayer$requestShow$1.L$3 = null;
                webViewAdPlayer$requestShow$1.L$4 = null;
                webViewAdPlayer$requestShow$1.label = 3;
                if (this.bridge.request(U3.i.K, "show", new Object[]{jSONObject5}, webViewAdPlayer$requestShow$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        webViewAdPlayer$requestShow$1 = new WebViewAdPlayer$requestShow$1(this, continuation);
        Object obj2 = webViewAdPlayer$requestShow$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewAdPlayer$requestShow$1.label;
        if (i != 0) {
        }
        jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) obj2, false, 1, null));
        SessionRepository sessionRepository22 = this.sessionRepository;
        webViewAdPlayer$requestShow$1.L$0 = map2;
        webViewAdPlayer$requestShow$1.L$1 = jSONObject3;
        webViewAdPlayer$requestShow$1.L$2 = jSONObject;
        webViewAdPlayer$requestShow$1.L$3 = "privacyFsm";
        webViewAdPlayer$requestShow$1.L$4 = jSONObject;
        webViewAdPlayer$requestShow$1.label = 2;
        privacyFsm = sessionRepository22.getPrivacyFsm(webViewAdPlayer$requestShow$1);
        if (privacyFsm != coroutine_suspended) {
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEvent(Function0<? extends WebViewEvent> function0, Continuation<? super Unit> continuation) {
        WebViewAdPlayer$sendEvent$1 webViewAdPlayer$sendEvent$1;
        int i;
        Function0<? extends WebViewEvent> function02;
        LoadEvent loadEvent;
        if (continuation instanceof WebViewAdPlayer$sendEvent$1) {
            webViewAdPlayer$sendEvent$1 = (WebViewAdPlayer$sendEvent$1) continuation;
            if ((webViewAdPlayer$sendEvent$1.label & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$sendEvent$1.label -= Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$sendEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewAdPlayer$sendEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<LoadEvent> onLoadEvent = getOnLoadEvent();
                    function02 = function0;
                    webViewAdPlayer$sendEvent$1.L$0 = function02;
                    webViewAdPlayer$sendEvent$1.label = 1;
                    obj = FlowKt.single(onLoadEvent, webViewAdPlayer$sendEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    function02 = (Function0) webViewAdPlayer$sendEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                loadEvent = (LoadEvent) obj;
                if (!(loadEvent instanceof LoadEvent.Error)) {
                    LoadEvent.Error error = (LoadEvent.Error) loadEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "bridge_send_event_failed", (Double) null, MapsKt.mapOf(TuplesKt.to("reason", "adviewer"), TuplesKt.to("reason_debug", error.getMessage()), TuplesKt.to("reason_code", String.valueOf(error.getErrorCode()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    return Unit.INSTANCE;
                }
                WebViewEvent invoke = function02.invoke();
                WebViewBridge webViewBridge = this.bridge;
                webViewAdPlayer$sendEvent$1.L$0 = null;
                webViewAdPlayer$sendEvent$1.label = 2;
                if (webViewBridge.sendEvent(invoke, webViewAdPlayer$sendEvent$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        webViewAdPlayer$sendEvent$1 = new WebViewAdPlayer$sendEvent$1(this, continuation);
        Object obj2 = webViewAdPlayer$sendEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewAdPlayer$sendEvent$1.label;
        if (i != 0) {
        }
        loadEvent = (LoadEvent) obj2;
        if (!(loadEvent instanceof LoadEvent.Error)) {
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(final OfferwallEvent offerwallEvent, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendOfferwallEvent$lambda$13;
                sendOfferwallEvent$lambda$13 = WebViewAdPlayer.sendOfferwallEvent$lambda$13(OfferwallEvent.this);
                return sendOfferwallEvent$lambda$13;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendOfferwallEvent$lambda$13(OfferwallEvent offerwallEvent) {
        return new OnOfferwallEvent(offerwallEvent);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(final boolean z, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendMuteChange$lambda$14;
                sendMuteChange$lambda$14 = WebViewAdPlayer.sendMuteChange$lambda$14(z);
                return sendMuteChange$lambda$14;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendMuteChange$lambda$14(boolean z) {
        return new OnMuteChangeEvent(z);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(final boolean z, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendVisibilityChange$lambda$15;
                sendVisibilityChange$lambda$15 = WebViewAdPlayer.sendVisibilityChange$lambda$15(z);
                return sendVisibilityChange$lambda$15;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendVisibilityChange$lambda$15(boolean z) {
        return new OnVisibilityChangeEvent(z);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(final boolean z, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendFocusChange$lambda$16;
                sendFocusChange$lambda$16 = WebViewAdPlayer.sendFocusChange$lambda$16(z);
                return sendFocusChange$lambda$16;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendFocusChange$lambda$16(boolean z) {
        return new OnFocusChangeEvent(z);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendActivityDestroyed$lambda$17;
                sendActivityDestroyed$lambda$17 = WebViewAdPlayer.sendActivityDestroyed$lambda$17();
                return sendActivityDestroyed$lambda$17;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendActivityDestroyed$lambda$17() {
        return new OnActivityDestroyedEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(final double d, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendVolumeChange$lambda$18;
                sendVolumeChange$lambda$18 = WebViewAdPlayer.sendVolumeChange$lambda$18(d);
                return sendVolumeChange$lambda$18;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendVolumeChange$lambda$18(double d) {
        return new OnVolumeChangeEvent(d);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(final byte[] bArr, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendUserConsentChange$lambda$19;
                sendUserConsentChange$lambda$19 = WebViewAdPlayer.sendUserConsentChange$lambda$19(bArr);
                return sendUserConsentChange$lambda$19;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendUserConsentChange$lambda$19(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return new OnUserConsentChangeEvent(encodeToString);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(final byte[] bArr, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendPrivacyFsmChange$lambda$20;
                sendPrivacyFsmChange$lambda$20 = WebViewAdPlayer.sendPrivacyFsmChange$lambda$20(bArr);
                return sendPrivacyFsmChange$lambda$20;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendPrivacyFsmChange$lambda$20(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return new OnPrivacyFsmChangeEvent(encodeToString);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(final String str, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent onBroadcastEvent$lambda$21;
                onBroadcastEvent$lambda$21 = WebViewAdPlayer.onBroadcastEvent$lambda$21(str);
                return onBroadcastEvent$lambda$21;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onBroadcastEvent$lambda$21(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("eventType");
        String optString = jSONObject.optString("data");
        Intrinsics.checkNotNull(string);
        return new OnBroadcastEvent(string, optString);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(final byte[] bArr, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new Function0() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent onAllowedPiiChange$lambda$22;
                onAllowedPiiChange$lambda$22 = WebViewAdPlayer.onAllowedPiiChange$lambda$22(bArr);
                return onAllowedPiiChange$lambda$22;
            }
        }, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onAllowedPiiChange$lambda$22(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return new OnAllowedPiiChangeEvent(encodeToString);
    }
}
