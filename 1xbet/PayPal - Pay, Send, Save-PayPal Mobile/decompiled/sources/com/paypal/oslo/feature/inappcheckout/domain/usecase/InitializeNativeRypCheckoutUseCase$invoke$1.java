package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase", f = "InitializeNativeRypCheckoutUseCase.kt", i = {0, 0, 1, 1, 1, 1}, l = {46, 50}, m = "invoke", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", "result", "response"}, nl = {47, 51}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class InitializeNativeRypCheckoutUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeNativeRypCheckoutUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase initializeNativeRypCheckoutUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = initializeNativeRypCheckoutUseCase;
    }
}
