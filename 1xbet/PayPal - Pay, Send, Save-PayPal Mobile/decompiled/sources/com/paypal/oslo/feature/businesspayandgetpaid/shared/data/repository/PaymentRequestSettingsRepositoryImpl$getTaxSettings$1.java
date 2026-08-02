package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl", f = "PaymentRequestSettingsRepositoryImpl.kt", i = {}, l = {42, 43}, m = "getTaxSettings", n = {}, nl = {43, 41}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PaymentRequestSettingsRepositoryImpl$getTaxSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getTaxSettings(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRequestSettingsRepositoryImpl$getTaxSettings$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl paymentRequestSettingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$getTaxSettings$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = paymentRequestSettingsRepositoryImpl;
    }
}
