package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase", f = "SaveAddressUseCase.kt", i = {0}, l = {50}, m = "invoke", n = {"request"}, nl = {51}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class SaveAddressUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<kotlin.Unit>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveAddressUseCase$invoke$1(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase saveAddressUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = saveAddressUseCase;
    }
}
