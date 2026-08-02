package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase", f = "GetOneShotCheckoutUrlUseCase.kt", i = {0}, l = {63}, m = "invoke", n = {"checkoutToken"}, nl = {84}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class GetOneShotCheckoutUrlUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOneShotCheckoutUrlUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase getOneShotCheckoutUrlUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getOneShotCheckoutUrlUseCase;
    }
}
