package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase", f = "GetInstantBankConfirmationAggregatorUseCase.kt", i = {0}, l = {50}, m = "invoke", n = {"instantBankConfirmationAggregatorParams"}, nl = {49}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetInstantBankConfirmationAggregatorUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetInstantBankConfirmationAggregatorUseCase$invoke$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase getInstantBankConfirmationAggregatorUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getInstantBankConfirmationAggregatorUseCase;
    }
}
