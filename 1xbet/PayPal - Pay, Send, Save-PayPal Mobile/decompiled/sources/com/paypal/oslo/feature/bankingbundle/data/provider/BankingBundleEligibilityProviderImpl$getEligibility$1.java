package com.paypal.oslo.feature.bankingbundle.data.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl", f = "BankingBundleEligibilityProviderImpl.kt", i = {0, 0, 1, 1, 1}, l = {82, 40}, m = "getEligibility", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BankingBundleEligibilityProviderImpl$getEligibility$2"}, nl = {83, 84}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class BankingBundleEligibilityProviderImpl$getEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.getEligibility(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankingBundleEligibilityProviderImpl$getEligibility$1(com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl bankingBundleEligibilityProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$getEligibility$1> continuation) {
        super(continuation);
        this.getOutputFormats = bankingBundleEligibilityProviderImpl;
    }
}
