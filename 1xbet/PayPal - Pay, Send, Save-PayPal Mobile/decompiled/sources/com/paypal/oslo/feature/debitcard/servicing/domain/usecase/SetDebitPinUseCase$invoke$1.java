package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase", f = "SetDebitPinUseCase.kt", i = {0}, l = {31}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class SetDebitPinUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetDebitPinUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = setDebitPinUseCase;
    }
}
