package com.paypal.oslo.feature.settings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl", f = "SettingsRepositoryImpl.kt", i = {}, l = {167}, m = "isPayPalBalanceEnabled", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsRepositoryImpl$isPayPalBalanceEnabled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.isPayPalBalanceEnabled(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsRepositoryImpl$isPayPalBalanceEnabled$1(com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl settingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$isPayPalBalanceEnabled$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = settingsRepositoryImpl;
    }
}
