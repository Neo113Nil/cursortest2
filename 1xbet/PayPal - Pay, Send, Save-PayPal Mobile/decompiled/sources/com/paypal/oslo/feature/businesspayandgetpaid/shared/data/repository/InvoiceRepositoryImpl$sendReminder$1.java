package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl", f = "InvoiceRepositoryImpl.kt", i = {0, 0, 0}, l = {116}, m = "sendReminder", n = {"invoiceId", "saveReminderMutation", "sendToInvoicer"}, nl = {120}, s = {"L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class InvoiceRepositoryImpl$sendReminder$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.sendReminder(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvoiceRepositoryImpl$sendReminder$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendReminder$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = invoiceRepositoryImpl;
    }
}
