package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase", f = "GetDebitCardWidgetUseCase.kt", i = {0}, l = {68}, m = "invoke", n = {"request"}, nl = {69}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class GetDebitCardWidgetUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetDebitCardWidgetUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getDebitCardWidgetUseCase;
    }
}
