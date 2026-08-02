package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake", f = "InvoiceRepositoryFake.kt", i = {0, 1}, l = {88, 91}, m = "getInvoiceConditionalRules", n = {"invoiceId", "invoiceId"}, nl = {89, 93}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes11.dex */
final class InvoiceRepositoryFake$getInvoiceConditionalRules$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getInvoiceConditionalRules(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceRepositoryFake$getInvoiceConditionalRules$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake invoiceRepositoryFake, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceConditionalRules$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = invoiceRepositoryFake;
    }
}
