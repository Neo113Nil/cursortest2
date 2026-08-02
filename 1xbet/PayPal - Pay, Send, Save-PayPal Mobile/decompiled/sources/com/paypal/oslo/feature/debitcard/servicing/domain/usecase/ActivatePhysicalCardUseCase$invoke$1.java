package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase", f = "ActivatePhysicalCardUseCase.kt", i = {0}, l = {36}, m = "invoke", n = {"request"}, nl = {37}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ActivatePhysicalCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivatePhysicalCardUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = activatePhysicalCardUseCase;
    }
}
