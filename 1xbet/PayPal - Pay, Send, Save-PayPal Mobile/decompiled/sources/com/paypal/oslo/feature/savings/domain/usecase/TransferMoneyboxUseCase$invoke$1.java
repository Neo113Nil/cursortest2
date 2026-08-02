package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase", f = "TransferMoneyboxUseCase.kt", i = {0, 1}, l = {49, 58}, m = "invoke", n = {"request", "request"}, nl = {55, 64}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes14.dex */
final class TransferMoneyboxUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferMoneyboxUseCase$invoke$1(com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase transferMoneyboxUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = transferMoneyboxUseCase;
    }
}
