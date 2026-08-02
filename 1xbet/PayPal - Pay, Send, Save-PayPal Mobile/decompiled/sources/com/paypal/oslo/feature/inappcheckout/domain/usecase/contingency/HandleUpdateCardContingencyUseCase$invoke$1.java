package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase", f = "HandleUpdateCardContingencyUseCase.kt", i = {0}, l = {28}, m = "invoke", n = {"contingencyInput"}, nl = {30}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class HandleUpdateCardContingencyUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandleUpdateCardContingencyUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase handleUpdateCardContingencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = handleUpdateCardContingencyUseCase;
    }
}
