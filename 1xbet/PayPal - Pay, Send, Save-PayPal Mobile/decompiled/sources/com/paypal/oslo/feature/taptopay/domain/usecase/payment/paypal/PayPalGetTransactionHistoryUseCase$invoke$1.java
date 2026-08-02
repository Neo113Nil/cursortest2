package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase", f = "PayPalGetTransactionHistoryUseCase.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {46, 47, 50, 62}, m = "invoke", n = {"id", "from", "id", "from", "cardIdGroup", "$i$a$-let-PayPalGetTransactionHistoryUseCase$invoke$2", "id", "from", "cardIdGroup", "result", "transactions", "$i$a$-let-PayPalGetTransactionHistoryUseCase$invoke$2", "id", "from", "cardIdGroup", "result", "$i$a$-let-PayPalGetTransactionHistoryUseCase$invoke$2"}, nl = {47, 48, 52, 90}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalGetTransactionHistoryUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalGetTransactionHistoryUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase payPalGetTransactionHistoryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = payPalGetTransactionHistoryUseCase;
    }
}
