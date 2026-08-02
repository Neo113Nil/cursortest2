package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase", f = "GetStatesUseCase.kt", i = {0}, l = {36}, m = "invoke", n = {"config"}, nl = {37}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class GetStatesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetStatesUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase getStatesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getStatesUseCase;
    }
}
