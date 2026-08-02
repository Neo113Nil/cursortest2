package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase", f = "SendInvoiceUseCase.kt", i = {0}, l = {24}, m = "invoke", n = {com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice}, nl = {25}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class SendInvoiceUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendInvoiceUseCase$invoke$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase sendInvoiceUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = sendInvoiceUseCase;
    }
}
