package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake", f = "InvoiceRepositoryFake.kt", i = {0, 1}, l = {61, 64}, m = "getInvoiceDetails", n = {"invoiceId", "invoiceId"}, nl = {62, 66}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes11.dex */
final class InvoiceRepositoryFake$getInvoiceDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getInvoiceDetails(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceRepositoryFake$getInvoiceDetails$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake invoiceRepositoryFake, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = invoiceRepositoryFake;
    }
}
