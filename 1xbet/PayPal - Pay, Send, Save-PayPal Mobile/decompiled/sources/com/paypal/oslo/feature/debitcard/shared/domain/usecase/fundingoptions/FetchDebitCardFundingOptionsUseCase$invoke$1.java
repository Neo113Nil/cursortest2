package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase", f = "FetchDebitCardFundingOptionsUseCase.kt", i = {0}, l = {26}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class FetchDebitCardFundingOptionsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchDebitCardFundingOptionsUseCase$invoke$1(com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase fetchDebitCardFundingOptionsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = fetchDebitCardFundingOptionsUseCase;
    }
}
