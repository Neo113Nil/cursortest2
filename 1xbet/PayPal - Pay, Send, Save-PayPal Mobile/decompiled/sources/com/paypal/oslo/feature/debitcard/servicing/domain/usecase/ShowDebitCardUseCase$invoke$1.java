package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase", f = "ShowDebitCardUseCase.kt", i = {0}, l = {26}, m = "invoke", n = {"request"}, nl = {27}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ShowDebitCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowDebitCardUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase showDebitCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = showDebitCardUseCase;
    }
}
