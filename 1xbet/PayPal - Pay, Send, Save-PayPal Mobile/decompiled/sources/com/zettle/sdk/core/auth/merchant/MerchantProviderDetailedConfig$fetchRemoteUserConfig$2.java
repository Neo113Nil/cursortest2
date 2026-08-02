package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2", f = "MerchantProviderDetailedConfig.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$fetchRemoteUserConfig$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.DetailedUserConfig>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ okhttp3.Request getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        com.zettle.sdk.core.network.NetworkModule networkModule;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig = this.Camera2StreamConfigurationMap;
                okhttp3.Request request = this.getHighSpeedVideoFpsRanges;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                networkModule = merchantProviderDetailedConfig.Camera2StreamConfigurationMap;
                okhttp3.OkHttpClient getOutputFormats = networkModule.getGetOutputFormats();
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.access$refreshConfig(merchantProviderDetailedConfig, request, getOutputFormats, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((com.zettle.sdk.core.network.HttpPayload) obj);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            com.zettle.sdk.core.log.LogKt.warn$default(this.Camera2StreamConfigurationMap, "refreshConfig is failure: ".concat(java.lang.String.valueOf(com.izettle.android.core.data.result.ResultKt.asFailure(kotlin.Result.m23435boximpl(m23436constructorimpl)))), null, 2, null);
            return null;
        }
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig2 = this.Camera2StreamConfigurationMap;
        com.zettle.sdk.core.network.HttpPayload httpPayload = (com.zettle.sdk.core.network.HttpPayload) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        com.zettle.sdk.core.log.LogKt.debug(merchantProviderDetailedConfig2, "user config result -> ".concat(java.lang.String.valueOf(httpPayload != null ? (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) httpPayload.getBody() : null)));
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(200, 299);
        com.zettle.sdk.core.network.HttpPayload httpPayload2 = (com.zettle.sdk.core.network.HttpPayload) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        java.lang.Integer boxInt = httpPayload2 != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(httpPayload2.getCode()) : null;
        if (boxInt != null && intRange.contains(boxInt.intValue())) {
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            com.zettle.sdk.core.network.HttpPayload httpPayload3 = (com.zettle.sdk.core.network.HttpPayload) m23436constructorimpl;
            com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = httpPayload3 != null ? (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) httpPayload3.getBody() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(detailedUserConfig);
            return detailedUserConfig;
        }
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig3 = this.Camera2StreamConfigurationMap;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        com.zettle.sdk.core.network.HttpPayload httpPayload4 = (com.zettle.sdk.core.network.HttpPayload) m23436constructorimpl;
        com.zettle.sdk.core.log.LogKt.warn$default(merchantProviderDetailedConfig3, "Error refreshing tokens: ".concat(java.lang.String.valueOf(httpPayload4 != null ? httpPayload4.getRawBody() : null)), null, 2, null);
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.DetailedUserConfig> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2 merchantProviderDetailedConfig$fetchRemoteUserConfig$2 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        merchantProviderDetailedConfig$fetchRemoteUserConfig$2.getHighSpeedVideoSizes = obj;
        return merchantProviderDetailedConfig$fetchRemoteUserConfig$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$fetchRemoteUserConfig$2(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, okhttp3.Request request, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = merchantProviderDetailedConfig;
        this.getHighSpeedVideoFpsRanges = request;
    }
}
