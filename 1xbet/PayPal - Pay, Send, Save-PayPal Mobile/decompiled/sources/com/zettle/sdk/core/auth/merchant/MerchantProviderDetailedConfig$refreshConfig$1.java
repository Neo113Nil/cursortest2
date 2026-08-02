package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig", f = "MerchantProviderDetailedConfig.kt", i = {0, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m = "refreshConfig", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$refreshConfig$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.access$refreshConfig(this.Camera2StreamConfigurationMap, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$refreshConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = merchantProviderDetailedConfig;
    }
}
