package com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase", f = "ProvisionDebitInstrumentUseCase.kt", i = {0}, l = {35}, m = "invoke", n = {"request"}, nl = {36}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ProvisionDebitInstrumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisionDebitInstrumentUseCase$invoke$1(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase provisionDebitInstrumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = provisionDebitInstrumentUseCase;
    }
}
