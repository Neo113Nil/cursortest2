package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* compiled from: AndroidShow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", i = {0, 0, 0}, l = {45, 84}, m = "invokeSuspend", n = {"$this$flow", "opportunityId", "ad"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class AndroidShow$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super ShowEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, Continuation<? super AndroidShow$invoke$1> continuation) {
        super(2, continuation);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, continuation);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Continuation<? super Unit> continuation) {
        return ((AndroidShow$invoke$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.unity3d.ads.core.data.model.AdObject] */
    /* JADX WARN: Type inference failed for: r6v26, types: [T, com.unity3d.ads.core.data.model.AdObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final FlowCollector flowCollector;
        ByteString opportunityId;
        AdRepository adRepository;
        Ref.ObjectRef objectRef;
        SendDiagnosticEvent sendDiagnosticEvent;
        HandleGatewayAdResponse handleGatewayAdResponse;
        Context context;
        Object invoke;
        ByteString byteString;
        Ref.ObjectRef objectRef2;
        ShowConfigurationInternal showConfigurationInternal;
        ValidateExtrasSize validateExtrasSize;
        SendDiagnosticEvent sendDiagnosticEvent2;
        AdPlayer adPlayer;
        AdRepository adRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.$adObject.getOpportunityId().isEmpty()) {
                throw new IllegalArgumentException("No opportunityId".toString());
            }
            opportunityId = this.$adObject.getOpportunityId();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            adRepository = this.this$0.adRepository;
            ?? ad = adRepository.getAd(opportunityId);
            if (ad == 0) {
                throw new IllegalStateException("No ad associated with opportunityId");
            }
            objectRef3.element = ad;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            if (unityAdsShowOptions != null && (showConfigurationInternal = unityAdsShowOptions.showConfiguration) != null) {
                AndroidShow androidShow = this.this$0;
                AdObject adObject = this.$adObject;
                validateExtrasSize = androidShow.validateExtrasSize;
                validateExtrasSize.invoke(showConfigurationInternal.getExtras(), "show", adObject);
            }
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = ((AdObject) objectRef3.element).getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData != null) {
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_less_show_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                UnityAdsLoadOptions loadOptions = ((AdObject) objectRef3.element).getLoadOptions();
                AdResponseOuterClass.AdResponse adResponse = webViewLessLoadingRequiredData.getAdResponse();
                context = this.this$0.context;
                this.L$0 = flowCollector;
                this.L$1 = opportunityId;
                this.L$2 = objectRef3;
                this.label = 1;
                invoke = handleGatewayAdResponse.invoke(loadOptions, opportunityId, adResponse, context, ((AdObject) objectRef3.element).getPlacementId(), ((AdObject) objectRef3.element).getAdType(), ((AdObject) objectRef3.element).isHeaderBidding(), true, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteString = opportunityId;
                objectRef2 = objectRef3;
            } else {
                objectRef = objectRef3;
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                adPlayer = ((AdObject) objectRef.element).getAdPlayer();
                if (adPlayer != null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (FlowKt.transformWhile(FlowKt.onCompletion(FlowKt.onStart(adPlayer.getOnShowEvent(), new AnonymousClass4(objectRef, this.this$0, this.$adObject, adPlayer, this.$showOptions, null)), new AnonymousClass5(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass6(null)).collect(new FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.7
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ShowEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ShowEvent showEvent, Continuation<? super Unit> continuation) {
                        Object emit = flowCollector.emit(showEvent, continuation);
                        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            objectRef2 = (Ref.ObjectRef) this.L$2;
            byteString = (ByteString) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        if (((LoadResult) invoke) instanceof LoadResult.Success) {
            adRepository2 = this.this$0.adRepository;
            ?? ad2 = adRepository2.getAd(byteString);
            if (ad2 != 0) {
                objectRef2.element = ad2;
                objectRef = objectRef2;
                opportunityId = byteString;
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                adPlayer = ((AdObject) objectRef.element).getAdPlayer();
                if (adPlayer != null) {
                }
            } else {
                throw new IllegalStateException("Webview less Load - No ad after deferred WebView load".toString());
            }
        } else {
            throw new IllegalStateException("Webview less Load - WebView load fail".toString());
        }
    }

    /* compiled from: AndroidShow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<FlowCollector<? super ShowEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdObject> $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AdPlayer $adPlayer;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Ref.ObjectRef<AdObject> objectRef, AndroidShow androidShow, AdObject adObject, AdPlayer adPlayer, UnityAdsShowOptions unityAdsShowOptions, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$ad = objectRef;
            this.this$0 = androidShow;
            this.$adObject = adObject;
            this.$adPlayer = adPlayer;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$ad, this.this$0, this.$adObject, this.$adPlayer, this.$showOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GameServerIdReader gameServerIdReader;
            JSONObject data;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdObject adObject = this.$ad.element;
            gameServerIdReader = this.this$0.gameServerIdReader;
            GameServerIdReader gameServerIdReader2 = gameServerIdReader;
            Object playerServerId = this.$ad.element.getPlayerServerId();
            Object obj2 = gameServerIdReader2.getJsonStorage().get(gameServerIdReader2.getKey());
            if (obj2 != null) {
                boolean z = obj2 instanceof String;
                Object obj3 = obj2;
                if (!z) {
                    obj3 = playerServerId;
                }
                if (obj3 != null) {
                    playerServerId = obj3;
                }
            }
            if (gameServerIdReader2.getJsonStorage().get(gameServerIdReader2.getKey()) != null) {
                gameServerIdReader2.getJsonStorage().delete(gameServerIdReader2.getKey());
            }
            adObject.setPlayerServerId((String) playerServerId);
            this.$adObject.getState().setValue(AdObjectState.SHOWING);
            AdPlayer adPlayer = this.$adPlayer;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            adPlayer.show(new AndroidShowOptions((unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null) ? null : JSONObjectExtensionsKt.toBuiltInMap(data), this.$ad.element.getPlacementId(), this.$ad.element.isOfferwallAd(), this.$ad.element.getOfferwallPlacementName()));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidShow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function3<FlowCollector<? super ShowEvent>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(AdObject adObject, AndroidShow androidShow, ByteString byteString, Continuation<? super AnonymousClass5> continuation) {
            super(3, continuation);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass5(this.$adObject, this.this$0, this.$opportunityId, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AdRepository adRepository;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$adObject.getState().setValue(AdObjectState.COMPLETED);
            adRepository = this.this$0.adRepository;
            adRepository.removeAd(this.$opportunityId);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidShow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function3<FlowCollector<? super ShowEvent>, ShowEvent, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, ShowEvent showEvent, Continuation<? super Boolean> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(continuation);
            anonymousClass6.L$0 = flowCollector;
            anonymousClass6.L$1 = showEvent;
            return anonymousClass6.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ShowEvent showEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ShowEvent showEvent2 = (ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                if (flowCollector.emit(showEvent2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                showEvent = showEvent2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                showEvent = (ShowEvent) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
        }
    }
}
