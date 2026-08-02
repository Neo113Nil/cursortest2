package com.paypal.oslo.feature.taptopay.domain.usecase.sdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl", f = "InitializeTapToPaySdkUseCaseImpl.kt", i = {0, 0}, l = {35}, m = "invoke", n = {"baseUrl", "paymentActivity"}, nl = {44}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class InitializeTapToPaySdkUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeTapToPaySdkUseCaseImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl initializeTapToPaySdkUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = initializeTapToPaySdkUseCaseImpl;
    }
}
