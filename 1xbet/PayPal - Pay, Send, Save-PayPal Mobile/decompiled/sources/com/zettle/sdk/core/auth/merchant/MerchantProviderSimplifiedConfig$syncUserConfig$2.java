package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig", f = "MerchantProviderSimplifiedConfig.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "syncUserConfig", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$syncUserConfig$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$syncUserConfig(this.Camera2StreamConfigurationMap, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderSimplifiedConfig$syncUserConfig$2(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$2> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = merchantProviderSimplifiedConfig;
    }
}
