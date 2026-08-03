package com.unity3d.ads.adplayer;

/* compiled from: WebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010-\u001a\u00020*H\u0016J\u0019\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J)\u00105\u001a\u00020*2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u000107H\u0096@ø\u0001\u0000¢\u0006\u0002\u00109J\u0011\u0010:\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010;J\u001f\u0010<\u001a\u00020*2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0019\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u0019\u0010D\u001a\u00020*2\u0006\u00103\u001a\u00020EH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u0019\u0010I\u001a\u00020*2\u0006\u00103\u001a\u00020JH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010KJ\u0019\u0010L\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u0010M\u001a\u00020*2\u0006\u00103\u001a\u00020NH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0019\u0010P\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u0019\u0010S\u001a\u00020*2\u0006\u0010T\u001a\u00020UH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010VR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "bridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;)V", "isCompletedManually", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onBroadcastEvents", "Lkotlinx/coroutines/flow/Flow;", "", "onLoadEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "getOnOfferwallEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "getOnScarEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "storageEventCallback", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "getEvent", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFocusChange", "isFocused", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGmaEvent", "Lcom/unity3d/scar/adapter/common/GMAEvent;", "(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendScarBannerEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "sendVisibilityChange", com.ironsource.C3023e8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer {
    private final com.unity3d.ads.adplayer.WebViewBridge bridge;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isCompletedManually;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> onBroadcastEvents;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.OfferwallShowEvent.Show> onOfferwallEvent;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ScarEvent.Show> onScarEvent;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> onShowEvent;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> storageEventCallback;
    private final com.unity3d.ads.adplayer.WebViewContainer webViewContainer;

    public WebViewAdPlayer(com.unity3d.ads.adplayer.WebViewBridge bridge, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.adplayer.WebViewContainer webViewContainer, kotlinx.coroutines.CoroutineScope adPlayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "bridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.isCompletedManually = MutableStateFlow;
        kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1
            {
                super(1);
            }

            /* compiled from: WebViewAdPlayer.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.unity3d.services.core.device.StorageEventInfo $it;
                int label;
                final /* synthetic */ com.unity3d.ads.adplayer.WebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, com.unity3d.services.core.device.StorageEventInfo storageEventInfo, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = webViewAdPlayer;
                    this.$it = storageEventInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.unity3d.ads.adplayer.WebViewBridge webViewBridge;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        webViewBridge = this.this$0.bridge;
                        this.label = 1;
                        if (webViewBridge.sendEvent(new com.unity3d.ads.adplayer.model.OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue()), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.unity3d.services.core.device.StorageEventInfo storageEventInfo) {
                invoke2(storageEventInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.unity3d.services.core.device.StorageEventInfo it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.unity3d.ads.adplayer.WebViewAdPlayer.this.getScope(), null, null, new com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1(com.unity3d.ads.adplayer.WebViewAdPlayer.this, it, null), 3, null);
            }
        };
        this.storageEventCallback = function1;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, dispatcher), new kotlinx.coroutines.CoroutineName("WebViewAdPlayer"));
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (kotlin.collections.ArraysKt.contains(new java.lang.String[]{com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_SCAR_AD}, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.onScarEvent = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ScarEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = this.$this_unsafeFlow;
                                invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = invocation;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                                flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_SCAR_AD)) {
                                throw new java.lang.IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                            }
                            com.unity3d.ads.core.data.model.ScarEvent.Show show = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(show, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_SCAR_AD)) {
                    }
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ScarEvent.Show> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation2 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow2 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (kotlin.collections.ArraysKt.contains(new java.lang.String[]{com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_OFFERWALL_AD}, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.onOfferwallEvent = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.OfferwallShowEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = this.$this_unsafeFlow;
                                invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = invocation;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                                flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                                throw new java.lang.IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                            }
                            com.unity3d.ads.core.data.model.OfferwallShowEvent.Show show = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(show, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                    }
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.OfferwallShowEvent.Show> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation3 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow3 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.String[] strArr;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                strArr = com.unity3d.ads.adplayer.WebViewAdPlayerKt.SHOW_EVENTS;
                                if (kotlin.collections.ArraysKt.contains(strArr, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.onShowEvent = kotlinx.coroutines.flow.FlowKt.flowCombine(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", i = {0}, l = {244, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {androidx.core.app.NotificationCompat.CATEGORY_EVENT}, s = {"L$1"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:19:0x011c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x010e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object coroutine_suspended;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout cancelTimeout;
                    com.unity3d.ads.core.data.model.ShowEvent showEvent;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = this.$this_unsafeFlow;
                                com.unity3d.ads.adplayer.Invocation invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                                java.lang.String location = invocation.getLocation();
                                switch (location.hashCode()) {
                                    case -1250843874:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                            cancelTimeout = com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout.INSTANCE;
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                                showEvent = cancelTimeout;
                                                break;
                                            } else {
                                                return coroutine_suspended;
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -928612193:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.COMPLETED)) {
                                            java.lang.Object first = kotlin.collections.ArraysKt.first(invocation.getParameters());
                                            java.lang.String str = first instanceof java.lang.String ? (java.lang.String) first : null;
                                            cancelTimeout = new com.unity3d.ads.core.data.model.ShowEvent.Completed(kotlin.jvm.internal.Intrinsics.areEqual(str, "COMPLETED") ? com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED : kotlin.jvm.internal.Intrinsics.areEqual(str, "SKIPPED") ? com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED : com.unity3d.ads.adplayer.model.ShowStatus.ERROR, null, null, 6, null);
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -707523043:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.LEFT_APPLICATION)) {
                                            cancelTimeout = com.unity3d.ads.core.data.model.ShowEvent.LeftApplication.INSTANCE;
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -497639557:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.CLICKED)) {
                                            cancelTimeout = com.unity3d.ads.core.data.model.ShowEvent.Clicked.INSTANCE;
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1039618005:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.STARTED)) {
                                            cancelTimeout = com.unity3d.ads.core.data.model.ShowEvent.Started.INSTANCE;
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1306610281:
                                        if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.FAILED)) {
                                            java.lang.Object first2 = kotlin.collections.ArraysKt.first(invocation.getParameters());
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(first2, "null cannot be cast to non-null type org.json.JSONObject");
                                            org.json.JSONObject jSONObject = (org.json.JSONObject) first2;
                                            int optInt = jSONObject.optInt("code");
                                            java.lang.String errorMessage = jSONObject.optString("message");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "errorMessage");
                                            cancelTimeout = new com.unity3d.ads.core.data.model.ShowEvent.Error(errorMessage, optInt, "adviewer");
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.L$1 = cancelTimeout;
                                            anonymousClass1.label = 1;
                                            if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                            }
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    default:
                                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                                }
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            showEvent = (com.unity3d.ads.core.data.model.ShowEvent) anonymousClass1.L$1;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, MutableStateFlow, new com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3(null));
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation4 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow4 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.String[] strArr;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                strArr = com.unity3d.ads.adplayer.WebViewAdPlayerKt.LOAD_EVENTS;
                                if (kotlin.collections.ArraysKt.contains(strArr, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.onLoadEvent = kotlinx.coroutines.flow.FlowKt.take(kotlinx.coroutines.flow.FlowKt.shareIn(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object coroutine_suspended;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    com.unity3d.ads.adplayer.model.LoadEvent loadEvent;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = this.$this_unsafeFlow;
                                invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = invocation;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                                flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.LOAD_ERROR)) {
                                loadEvent = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE;
                            } else {
                                java.lang.Object first = kotlin.collections.ArraysKt.first(invocation.getParameters());
                                kotlin.jvm.internal.Intrinsics.checkNotNull(first, "null cannot be cast to non-null type org.json.JSONObject");
                                org.json.JSONObject jSONObject = (org.json.JSONObject) first;
                                int optInt = jSONObject.optInt("code");
                                java.lang.String errorMessage = jSONObject.optString("message");
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "errorMessage");
                                loadEvent = new com.unity3d.ads.adplayer.model.LoadEvent.Error(errorMessage, optInt);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(loadEvent, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.LOAD_ERROR)) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(loadEvent, anonymousClass1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.model.LoadEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, getScope(), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), 1), 1);
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation5 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow5 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.unity3d.ads.adplayer.Invocation) obj).getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.BROADCAST_EVENT)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        kotlinx.coroutines.flow.Flow<java.lang.String> flow6 = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object coroutine_suspended;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    java.lang.String obj2;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj3 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                flowCollector = this.$this_unsafeFlow;
                                invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = invocation;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj3);
                                    return kotlin.Unit.INSTANCE;
                                }
                                invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                                flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            obj2 = kotlin.collections.ArraysKt.first(invocation.getParameters()).toString();
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    obj2 = kotlin.collections.ArraysKt.first(invocation.getParameters()).toString();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.onBroadcastEvents = flow6;
        com.unity3d.services.core.device.Storage.INSTANCE.addStorageEventCallback(function1);
        kotlinx.coroutines.JobKt.getJob(adPlayerScope.getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                com.unity3d.services.core.device.Storage.INSTANCE.removeStorageEventCallback(com.unity3d.ads.adplayer.WebViewAdPlayer.this.storageEventCallback);
            }
        });
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(flow6, new com.unity3d.ads.adplayer.WebViewAdPlayer.AnonymousClass2(com.unity3d.ads.adplayer.AdPlayer.INSTANCE.getBroadcastEventChannel())), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(com.unity3d.ads.adplayer.AdPlayer.INSTANCE.getBroadcastEventChannel(), new com.unity3d.ads.adplayer.WebViewAdPlayer.AnonymousClass3(this)), getScope());
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(this, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(com.unity3d.ads.adplayer.ShowOptions showOptions) {
        com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ScarEvent.Show> getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.OfferwallShowEvent.Show> getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    /* compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass2(java.lang.Object obj) {
            super(2, obj, kotlinx.coroutines.flow.MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.MutableSharedFlow) this.receiver).emit(str, continuation);
        }
    }

    /* compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass3(java.lang.Object obj) {
            super(2, obj, com.unity3d.ads.adplayer.WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.WebViewAdPlayer) this.receiver).onBroadcastEvent(str, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1 webViewAdPlayer$requestShow$1;
        java.lang.Object coroutine_suspended;
        int i;
        org.json.JSONObject jSONObject;
        java.lang.String str;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        java.lang.Object privacyFsm;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map3;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer2;
        java.lang.String str2;
        org.json.JSONObject jSONObject6;
        com.unity3d.ads.adplayer.WebViewBridge webViewBridge;
        java.lang.Object[] objArr;
        if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1) {
            webViewAdPlayer$requestShow$1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1) continuation;
            if ((webViewAdPlayer$requestShow$1.label & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$requestShow$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webViewAdPlayer$requestShow$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewAdPlayer$requestShow$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                    jSONObject = new org.json.JSONObject();
                    jSONObject.put("orientation", this.deviceInfoRepository.getOrientation());
                    jSONObject.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
                    jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
                    jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
                    com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
                    webViewAdPlayer$requestShow$1.L$0 = this;
                    webViewAdPlayer$requestShow$1.L$1 = map;
                    webViewAdPlayer$requestShow$1.L$2 = jSONObject;
                    webViewAdPlayer$requestShow$1.L$3 = jSONObject;
                    str = com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY;
                    webViewAdPlayer$requestShow$1.L$4 = com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY;
                    webViewAdPlayer$requestShow$1.L$5 = jSONObject;
                    webViewAdPlayer$requestShow$1.label = 1;
                    obj = sessionRepository.getPrivacy(webViewAdPlayer$requestShow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    webViewAdPlayer = this;
                    map2 = map;
                    jSONObject2 = jSONObject;
                    jSONObject3 = jSONObject2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        jSONObject6 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$5;
                        str2 = (java.lang.String) webViewAdPlayer$requestShow$1.L$4;
                        jSONObject4 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$3;
                        jSONObject5 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$2;
                        map3 = (java.util.Map) webViewAdPlayer$requestShow$1.L$1;
                        webViewAdPlayer2 = (com.unity3d.ads.adplayer.WebViewAdPlayer) webViewAdPlayer$requestShow$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        jSONObject6.put(str2, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) obj, false, 1, null));
                        com.google.protobuf.ByteString byteString = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "deviceInfoRepository.all…dPii.value.toByteString()");
                        jSONObject4.put("allowedPii", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                        if (map3 != null) {
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map3.entrySet()) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), "objectId")) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                jSONObject4.put("showOptions", new org.json.JSONObject(linkedHashMap));
                            }
                        }
                        webViewBridge = webViewAdPlayer2.bridge;
                        objArr = new java.lang.Object[]{jSONObject5};
                        webViewAdPlayer$requestShow$1.L$0 = null;
                        webViewAdPlayer$requestShow$1.L$1 = null;
                        webViewAdPlayer$requestShow$1.L$2 = null;
                        webViewAdPlayer$requestShow$1.L$3 = null;
                        webViewAdPlayer$requestShow$1.L$4 = null;
                        webViewAdPlayer$requestShow$1.L$5 = null;
                        webViewAdPlayer$requestShow$1.label = 3;
                        if (webViewBridge.request(com.ironsource.X3.i.K, com.ironsource.C3232q2.v, objArr, webViewAdPlayer$requestShow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    jSONObject2 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$5;
                    java.lang.String str3 = (java.lang.String) webViewAdPlayer$requestShow$1.L$4;
                    org.json.JSONObject jSONObject7 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$3;
                    jSONObject3 = (org.json.JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    map2 = (java.util.Map) webViewAdPlayer$requestShow$1.L$1;
                    webViewAdPlayer = (com.unity3d.ads.adplayer.WebViewAdPlayer) webViewAdPlayer$requestShow$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str3;
                    jSONObject = jSONObject7;
                }
                jSONObject2.put(str, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) obj, false, 1, null));
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = webViewAdPlayer.sessionRepository;
                webViewAdPlayer$requestShow$1.L$0 = webViewAdPlayer;
                webViewAdPlayer$requestShow$1.L$1 = map2;
                webViewAdPlayer$requestShow$1.L$2 = jSONObject3;
                webViewAdPlayer$requestShow$1.L$3 = jSONObject;
                webViewAdPlayer$requestShow$1.L$4 = "privacyFsm";
                webViewAdPlayer$requestShow$1.L$5 = jSONObject;
                webViewAdPlayer$requestShow$1.label = 2;
                privacyFsm = sessionRepository2.getPrivacyFsm(webViewAdPlayer$requestShow$1);
                if (privacyFsm != coroutine_suspended) {
                    return coroutine_suspended;
                }
                jSONObject4 = jSONObject;
                jSONObject5 = jSONObject3;
                map3 = map2;
                webViewAdPlayer2 = webViewAdPlayer;
                str2 = "privacyFsm";
                obj = privacyFsm;
                jSONObject6 = jSONObject4;
                jSONObject6.put(str2, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) obj, false, 1, null));
                com.google.protobuf.ByteString byteString2 = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "deviceInfoRepository.all…dPii.value.toByteString()");
                jSONObject4.put("allowedPii", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
                if (map3 != null) {
                }
                webViewBridge = webViewAdPlayer2.bridge;
                objArr = new java.lang.Object[]{jSONObject5};
                webViewAdPlayer$requestShow$1.L$0 = null;
                webViewAdPlayer$requestShow$1.L$1 = null;
                webViewAdPlayer$requestShow$1.L$2 = null;
                webViewAdPlayer$requestShow$1.L$3 = null;
                webViewAdPlayer$requestShow$1.L$4 = null;
                webViewAdPlayer$requestShow$1.L$5 = null;
                webViewAdPlayer$requestShow$1.label = 3;
                if (webViewBridge.request(com.ironsource.X3.i.K, com.ironsource.C3232q2.v, objArr, webViewAdPlayer$requestShow$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        webViewAdPlayer$requestShow$1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1(this, continuation);
        java.lang.Object obj2 = webViewAdPlayer$requestShow$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewAdPlayer$requestShow$1.label;
        if (i != 0) {
        }
        jSONObject2.put(str, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) obj2, false, 1, null));
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository22 = webViewAdPlayer.sessionRepository;
        webViewAdPlayer$requestShow$1.L$0 = webViewAdPlayer;
        webViewAdPlayer$requestShow$1.L$1 = map2;
        webViewAdPlayer$requestShow$1.L$2 = jSONObject3;
        webViewAdPlayer$requestShow$1.L$3 = jSONObject;
        webViewAdPlayer$requestShow$1.L$4 = "privacyFsm";
        webViewAdPlayer$requestShow$1.L$5 = jSONObject;
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendEvent(kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.model.WebViewEvent> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 webViewAdPlayer$sendEvent$1;
        int i;
        kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.model.WebViewEvent> function02;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent;
        if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) {
            webViewAdPlayer$sendEvent$1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) continuation;
            if ((webViewAdPlayer$sendEvent$1.label & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$sendEvent$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webViewAdPlayer$sendEvent$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewAdPlayer$sendEvent$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent = getOnLoadEvent();
                    webViewAdPlayer$sendEvent$1.L$0 = this;
                    function02 = function0;
                    webViewAdPlayer$sendEvent$1.L$1 = function02;
                    webViewAdPlayer$sendEvent$1.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent, webViewAdPlayer$sendEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    webViewAdPlayer = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function02 = (kotlin.jvm.functions.Function0) webViewAdPlayer$sendEvent$1.L$1;
                    webViewAdPlayer = (com.unity3d.ads.adplayer.WebViewAdPlayer) webViewAdPlayer$sendEvent$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj;
                if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                    com.unity3d.ads.adplayer.model.LoadEvent.Error error = (com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(webViewAdPlayer.sendDiagnosticEvent, "bridge_send_event_failed", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "adviewer"), kotlin.TuplesKt.to("reason_debug", error.getMessage()), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(error.getErrorCode()))), null, null, null, 58, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.unity3d.ads.adplayer.model.WebViewEvent invoke = function02.invoke();
                com.unity3d.ads.adplayer.WebViewBridge webViewBridge = webViewAdPlayer.bridge;
                webViewAdPlayer$sendEvent$1.L$0 = null;
                webViewAdPlayer$sendEvent$1.L$1 = null;
                webViewAdPlayer$sendEvent$1.label = 2;
                if (webViewBridge.sendEvent(invoke, webViewAdPlayer$sendEvent$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        webViewAdPlayer$sendEvent$1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1(this, continuation);
        java.lang.Object obj2 = webViewAdPlayer$sendEvent$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewAdPlayer$sendEvent$1.label;
        if (i != 0) {
        }
        loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj2;
        if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendScarBannerEvent(final com.unity3d.services.banners.bridge.BannerBridge.BannerEvent bannerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendScarBannerEvent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnScarBannerEvent(com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.this);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendGmaEvent(final com.unity3d.scar.adapter.common.GMAEvent gMAEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendGmaEvent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnGmaEvent(com.unity3d.scar.adapter.common.GMAEvent.this);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendOfferwallEvent(final com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendOfferwallEvent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnOfferwallEvent(com.unity3d.services.ads.offerwall.OfferwallEvent.this);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendMuteChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendMuteChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnMuteChangeEvent(z);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVisibilityChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVisibilityChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent(z);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendFocusChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendFocusChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnFocusChangeEvent(z);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendActivityDestroyed$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent();
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVolumeChange(final double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVolumeChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnVolumeChangeEvent(d);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendUserConsentChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendUserConsentChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent(encodeToString);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendPrivacyFsmChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$sendPrivacyFsmChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent(encodeToString);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onBroadcastEvent(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$onBroadcastEvent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.String eventType = jSONObject.getString("eventType");
                java.lang.String optString = jSONObject.optString("data");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventType, "eventType");
                return new com.unity3d.ads.adplayer.model.OnBroadcastEvent(eventType, optString);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onAllowedPiiChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$onAllowedPiiChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent(encodeToString);
            }
        }, continuation);
        return sendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : kotlin.Unit.INSTANCE;
    }
}
