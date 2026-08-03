package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidOpenMeasurementRepository$startSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    final /* synthetic */ com.unity3d.ads.core.data.model.OmidOptions $options;
    final /* synthetic */ android.webkit.WebView $webView;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository this$0;

    /* compiled from: AndroidOpenMeasurementRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.iab.omid.library.unity3d.adsession.CreativeType.values().length];
            try {
                iArr[com.iab.omid.library.unity3d.adsession.CreativeType.HTML_DISPLAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.iab.omid.library.unity3d.adsession.CreativeType.VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$startSession$2(com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository androidOpenMeasurementRepository, com.google.protobuf.ByteString byteString, com.unity3d.ads.core.data.model.OmidOptions omidOptions, android.webkit.WebView webView, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2> continuation) {
        super(2, continuation);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.unity3d.ads.core.data.manager.OmidManager omidManager;
        com.unity3d.ads.core.data.manager.OmidManager omidManager2;
        com.iab.omid.library.unity3d.adsession.Partner partner;
        com.iab.omid.library.unity3d.adsession.AdSessionContext createHtmlAdSessionContext;
        com.unity3d.ads.core.data.manager.OmidManager omidManager3;
        com.unity3d.ads.core.data.manager.OmidManager omidManager4;
        com.iab.omid.library.unity3d.adsession.Partner partner2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            if (this.this$0.isOMActive()) {
                mutableStateFlow = this.this$0.activeSessions;
                if (((java.util.Map) mutableStateFlow.getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                com.iab.omid.library.unity3d.adsession.CreativeType creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                omidManager = this.this$0.omidManager;
                com.iab.omid.library.unity3d.adsession.ImpressionType impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = com.iab.omid.library.unity3d.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
                }
                com.iab.omid.library.unity3d.adsession.ImpressionType impressionType2 = impressionType;
                com.iab.omid.library.unity3d.adsession.Owner impressionOwner = this.$options.getImpressionOwner();
                if (impressionOwner == null) {
                    impressionOwner = com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
                }
                com.iab.omid.library.unity3d.adsession.Owner owner = impressionOwner;
                com.iab.omid.library.unity3d.adsession.Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
                }
                com.iab.omid.library.unity3d.adsession.AdSessionConfiguration createAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int i = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2.WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                if (i == 1) {
                    omidManager2 = this.this$0.omidManager;
                    partner = this.this$0.partner;
                    createHtmlAdSessionContext = omidManager2.createHtmlAdSessionContext(partner, this.$webView, null, this.$options.getCustomReferenceData());
                } else if (i == 2) {
                    omidManager4 = this.this$0.omidManager;
                    partner2 = this.this$0.partner;
                    createHtmlAdSessionContext = omidManager4.createJavaScriptAdSessionContext(partner2, this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("om_creative_type_invalid", null, 2, null);
                }
                omidManager3 = this.this$0.omidManager;
                com.iab.omid.library.unity3d.adsession.AdSession createAdSession = omidManager3.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
                createAdSession.registerAdView(this.$webView);
                createAdSession.start();
                this.this$0.addSession(this.$opportunityId, createAdSession);
                return com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
            }
            return new com.unity3d.ads.core.data.model.OMResult.Failure("om_not_active", null, 2, null);
        } catch (java.lang.Throwable th) {
            return new com.unity3d.ads.core.data.model.OMResult.Failure("uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
        }
    }
}
