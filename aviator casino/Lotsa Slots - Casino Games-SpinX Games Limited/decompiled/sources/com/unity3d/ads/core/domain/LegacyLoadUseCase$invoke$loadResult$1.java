package com.unity3d.ads.core.domain;

/* compiled from: LegacyLoadUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", i = {1, 1}, l = {130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138}, m = "invokeSuspend", n = {"opportunityIdByteString", "headerBiddingAdMarkup"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class LegacyLoadUseCase$invoke$loadResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult>, java.lang.Object> {
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ gatewayprotocol.v1.AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ java.lang.String $opportunityId;
    final /* synthetic */ java.lang.String $placement;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyLoadUseCase this$0;

    /* compiled from: LegacyLoadUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.core.data.model.InitializationState.values().length];
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$invoke$loadResult$1(java.lang.String str, java.lang.String str2, com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, android.content.Context context, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1> continuation) {
        super(2, continuation);
        this.$placement = str;
        this.$opportunityId = str2;
        this.this$0 = legacyLoadUseCase;
        this.$context = context;
        this.$gatewayBannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.$opportunityId, this.this$0, this.$context, this.$gatewayBannerSize, this.$loadOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
        return ((com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.repository.AdRepository adRepository;
        java.lang.String str;
        gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
        com.unity3d.ads.core.domain.Load load;
        java.lang.Object invoke;
        com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization;
        java.lang.Object invoke$default;
        com.google.protobuf.ByteString byteString;
        gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        int i;
        com.unity3d.ads.core.domain.Load load2;
        java.lang.Object invoke2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$placement == null) {
                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, "placement_null", null, false, 52, null);
            }
            java.util.UUID fromString = java.util.UUID.fromString(this.$opportunityId);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
            com.google.protobuf.ByteString byteString2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString);
            this.this$0.opportunity = byteString2;
            adRepository = this.this$0.adRepository;
            if (adRepository.hasOpportunityId(byteString2)) {
                new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, false, 52, null);
            }
            com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase = this.this$0;
            str = legacyLoadUseCase.adMarkup;
            headerBiddingAdMarkup = legacyLoadUseCase.getHeaderBiddingAdMarkup(str);
            if (headerBiddingAdMarkup != null) {
                getInitializationState = this.this$0.getInitializationState;
                int i3 = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0[com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(getInitializationState, false, 1, null).ordinal()];
                if (i3 == 1) {
                    load = this.this$0.load;
                    this.label = 1;
                    invoke = load.invoke(this.$context, this.$placement, byteString2, headerBiddingAdMarkup, this.$gatewayBannerSize, this.$loadOptions, this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (com.unity3d.ads.core.data.model.LoadResult) invoke;
                }
                if (i3 == 2 || i3 == 3) {
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
                }
                if (i3 == 4) {
                    awaitInitialization = this.this$0.awaitInitialization;
                    this.L$0 = byteString2;
                    this.L$1 = headerBiddingAdMarkup;
                    this.label = 2;
                    invoke$default = com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
                    if (invoke$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteString = byteString2;
                    headerBiddingAdMarkup2 = headerBiddingAdMarkup;
                    com.unity3d.ads.core.data.model.InitializationState initializationState = (com.unity3d.ads.core.data.model.InitializationState) invoke$default;
                    if (initializationState != null) {
                    }
                    if (i == 1) {
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_AD_MARKUP_PARSING, null, "invalid_admarkup", null, false, 52, null);
            }
        } else {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                invoke = obj;
                return (com.unity3d.ads.core.data.model.LoadResult) invoke;
            }
            if (i2 == 2) {
                gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = (gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                com.google.protobuf.ByteString byteString3 = (com.google.protobuf.ByteString) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                headerBiddingAdMarkup2 = headerBiddingAdMarkup3;
                byteString = byteString3;
                invoke$default = obj;
                com.unity3d.ads.core.data.model.InitializationState initializationState2 = (com.unity3d.ads.core.data.model.InitializationState) invoke$default;
                i = initializationState2 != null ? -1 : com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0[initializationState2.ordinal()];
                if (i == 1) {
                    if (i == 2) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
                    }
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT, com.unity3d.ads.core.data.model.LoadResult.MSG_TIMEOUT + this.$placement, null, "timeout_initialization", null, false, 52, null);
                }
                load2 = this.this$0.load;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                invoke2 = load2.invoke(this.$context, this.$placement, byteString, headerBiddingAdMarkup2, this.$gatewayBannerSize, this.$loadOptions, this);
                if (invoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                invoke2 = obj;
            }
        }
        return (com.unity3d.ads.core.data.model.LoadResult) invoke2;
    }
}
