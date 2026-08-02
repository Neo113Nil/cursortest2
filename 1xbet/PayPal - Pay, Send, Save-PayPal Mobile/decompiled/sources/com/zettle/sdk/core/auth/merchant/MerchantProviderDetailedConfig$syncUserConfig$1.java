package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig", f = "MerchantProviderDetailedConfig.kt", i = {0}, l = {159}, m = "syncUserConfig", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$syncUserConfig$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.access$syncUserConfig(this.getHighSpeedVideoFpsRanges, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$syncUserConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = merchantProviderDetailedConfig;
    }
}
