package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1", f = "MerchantProviderSimplifiedConfig.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 197}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r6 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (((com.zettle.sdk.core.auth.ZettleService) r6).refreshServices(r1.getGetOutputFormats(), r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.auth.merchant.UserConfigRepository userConfigRepository;
        kotlin.Unit unit;
        com.zettle.sdk.commons.state.MutableState mutableState;
        com.zettle.sdk.core.auth.ServiceProvider serviceProvider;
        com.zettle.sdk.core.network.NetworkModule networkModule;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            try {
                try {
                } catch (java.lang.Exception e) {
                    com.zettle.sdk.core.log.LogKt.warn(this.getHighSpeedVideoFpsRangesFor, "Failed to perform automatic login", e);
                }
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.invoke();
                throw th;
            }
        } catch (java.lang.Exception e2) {
            com.zettle.sdk.core.log.LogKt.warn(this.getHighSpeedVideoFpsRangesFor, "Failed to refresh service urls", e2);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.zettle.sdk.core.log.LogKt.log(this.getHighSpeedVideoFpsRangesFor, "Execute service urls are up to date");
            serviceProvider = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(serviceProvider, "");
            networkModule = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                final com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) obj;
                if (userConfig != null) {
                    com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig = this.getHighSpeedVideoFpsRangesFor;
                    mutableState = merchantProviderSimplifiedConfig.getHighSpeedVideoFpsRangesFor;
                    mutableState.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig2) {
                            return com.zettle.sdk.core.user.userconfig.UserConfig.this;
                        }

                        {
                            super(1);
                        }
                    });
                    merchantProviderSimplifiedConfig.Camera2StreamConfigurationMap = userConfig;
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    com.zettle.sdk.core.log.LogKt.log(this.getHighSpeedVideoFpsRangesFor, "cannot perform automatic login");
                }
                this.getHighSpeedVideoSizes.invoke();
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        userConfigRepository = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = userConfigRepository.fetchRemoteUserConfig(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = merchantProviderSimplifiedConfig;
        this.getHighSpeedVideoSizes = function0;
    }
}
