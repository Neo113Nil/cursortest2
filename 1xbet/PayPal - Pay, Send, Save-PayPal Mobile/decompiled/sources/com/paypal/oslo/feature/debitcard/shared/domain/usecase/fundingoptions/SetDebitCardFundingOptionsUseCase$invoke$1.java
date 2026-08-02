package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase", f = "SetDebitCardFundingOptionsUseCase.kt", i = {0}, l = {28}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class SetDebitCardFundingOptionsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetDebitCardFundingOptionsUseCase$invoke$1(com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase setDebitCardFundingOptionsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = setDebitCardFundingOptionsUseCase;
    }
}
