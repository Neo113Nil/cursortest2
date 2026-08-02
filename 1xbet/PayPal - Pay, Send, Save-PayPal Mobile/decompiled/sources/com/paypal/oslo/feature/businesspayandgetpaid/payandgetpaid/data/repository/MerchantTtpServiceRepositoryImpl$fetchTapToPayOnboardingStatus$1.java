package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl", f = "MerchantTtpServiceRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {35}, m = "fetchTapToPayOnboardingStatus", n = {"raise$iv$iv$iv", "$this$fetchTapToPayOnboardingStatus_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$2"}, nl = {39}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.fetchTapToPayOnboardingStatus(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl merchantTtpServiceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = merchantTtpServiceRepositoryImpl;
    }
}
