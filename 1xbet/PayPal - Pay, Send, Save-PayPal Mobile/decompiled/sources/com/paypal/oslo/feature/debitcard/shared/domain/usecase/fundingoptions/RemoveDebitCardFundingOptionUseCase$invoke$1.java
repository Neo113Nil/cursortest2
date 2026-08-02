package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase", f = "RemoveDebitCardFundingOptionUseCase.kt", i = {0}, l = {29}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class RemoveDebitCardFundingOptionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionResult>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveDebitCardFundingOptionUseCase$invoke$1(com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase removeDebitCardFundingOptionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = removeDebitCardFundingOptionUseCase;
    }
}
