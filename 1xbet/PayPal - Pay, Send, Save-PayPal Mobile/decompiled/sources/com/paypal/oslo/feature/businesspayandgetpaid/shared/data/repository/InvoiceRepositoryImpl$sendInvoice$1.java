package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl", f = "InvoiceRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {51, 68}, m = "sendInvoice", n = {com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "createInvoiceMutation", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "createInvoiceMutation", "createInvoiceResult", "invoiceUrl", "invoiceId", "sendInvoiceMutation"}, nl = {55, 73}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class InvoiceRepositoryImpl$sendInvoice$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.sendInvoice(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceRepositoryImpl$sendInvoice$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendInvoice$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = invoiceRepositoryImpl;
    }
}
