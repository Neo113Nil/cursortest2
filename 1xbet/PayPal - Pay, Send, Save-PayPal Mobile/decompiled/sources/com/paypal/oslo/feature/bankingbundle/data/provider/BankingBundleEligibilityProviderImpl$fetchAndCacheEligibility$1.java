package com.paypal.oslo.feature.bankingbundle.data.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl", f = "BankingBundleEligibilityProviderImpl.kt", i = {}, l = {44}, m = "fetchAndCacheEligibility", n = {}, nl = {45}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1(com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl bankingBundleEligibilityProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = bankingBundleEligibilityProviderImpl;
    }
}
