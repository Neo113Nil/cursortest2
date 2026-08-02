package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase", f = "GetInvoiceUseCase.kt", i = {0}, l = {37}, m = "invoke", n = {"invoiceId"}, nl = {87}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetInvoiceUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetInvoiceUseCase$invoke$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase getInvoiceUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getInvoiceUseCase;
    }
}
