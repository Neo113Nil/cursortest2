package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl", f = "PaymentRequestSettingsRepositoryImpl.kt", i = {0, 0, 1, 1}, l = {50, 51}, m = "updateTaxSettings", n = {"isTaxInclusive", "isTaxCalculatedAfterDiscount", "isTaxInclusive", "isTaxCalculatedAfterDiscount"}, nl = {51, 52}, s = {"Z$0", "Z$1", "Z$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updateTaxSettings(false, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl paymentRequestSettingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = paymentRequestSettingsRepositoryImpl;
    }
}
