package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig", f = "MerchantProviderDetailedConfig.kt", i = {0, 0}, l = {151}, m = "cacheUserConfig", n = {"this", "config"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$cacheUserConfig$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$cacheUserConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$cacheUserConfig$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = merchantProviderDetailedConfig;
    }
}
