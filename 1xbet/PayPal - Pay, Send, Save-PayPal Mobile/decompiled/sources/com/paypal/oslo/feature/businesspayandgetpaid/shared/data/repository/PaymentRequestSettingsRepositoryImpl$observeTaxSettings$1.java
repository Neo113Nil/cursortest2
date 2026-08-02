package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "isTaxInclusive", "", "isTaxCalculatedAfterDiscount"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1", f = "PaymentRequestSettingsRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) this.getHighSpeedVideoFpsRanges;
        java.lang.Boolean bool2 = (java.lang.Boolean) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : true);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1 paymentRequestSettingsRepositoryImpl$observeTaxSettings$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1(continuation);
        paymentRequestSettingsRepositoryImpl$observeTaxSettings$1.getHighSpeedVideoFpsRanges = bool;
        paymentRequestSettingsRepositoryImpl$observeTaxSettings$1.Camera2StreamConfigurationMap = bool2;
        return paymentRequestSettingsRepositoryImpl$observeTaxSettings$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1> continuation) {
        super(3, continuation);
    }
}
