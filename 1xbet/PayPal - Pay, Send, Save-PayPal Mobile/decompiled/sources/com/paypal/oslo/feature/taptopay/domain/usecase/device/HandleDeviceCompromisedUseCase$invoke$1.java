package com.paypal.oslo.feature.taptopay.domain.usecase.device;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase", f = "HandleDeviceCompromisedUseCase.kt", i = {}, l = {40}, m = "invoke", n = {}, nl = {41}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class HandleDeviceCompromisedUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandleDeviceCompromisedUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase handleDeviceCompromisedUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = handleDeviceCompromisedUseCase;
    }
}
