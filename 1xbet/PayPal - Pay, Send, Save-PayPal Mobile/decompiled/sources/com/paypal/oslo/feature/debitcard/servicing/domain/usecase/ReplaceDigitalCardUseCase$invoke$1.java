package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase", f = "ReplaceDigitalCardUseCase.kt", i = {0}, l = {37}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ReplaceDigitalCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReplaceDigitalCardUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase replaceDigitalCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = replaceDigitalCardUseCase;
    }
}
