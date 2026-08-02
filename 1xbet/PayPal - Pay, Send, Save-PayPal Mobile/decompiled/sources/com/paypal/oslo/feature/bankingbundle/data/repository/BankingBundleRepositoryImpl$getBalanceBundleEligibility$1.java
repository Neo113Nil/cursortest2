package com.paypal.oslo.feature.bankingbundle.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl", f = "BankingBundleRepositoryImpl.kt", i = {0, 0}, l = {58}, m = "getBalanceBundleEligibility", n = {com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "query"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class BankingBundleRepositoryImpl$getBalanceBundleEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getBalanceBundleEligibility(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankingBundleRepositoryImpl$getBalanceBundleEligibility$1(com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl bankingBundleRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = bankingBundleRepositoryImpl;
    }
}
