package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig", f = "MerchantProviderSimplifiedConfig.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "getCachedUserConfig", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$getCachedUserConfig$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderSimplifiedConfig$getCachedUserConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getCachedUserConfig$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = merchantProviderSimplifiedConfig;
    }
}
