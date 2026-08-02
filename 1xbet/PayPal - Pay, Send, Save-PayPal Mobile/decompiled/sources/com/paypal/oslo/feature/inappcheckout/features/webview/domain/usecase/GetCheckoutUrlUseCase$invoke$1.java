package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase", f = "GetCheckoutUrlUseCase.kt", i = {0, 1, 1, 1, 1, 1}, l = {49, 56}, m = "invoke", n = {"checkoutToken", "checkoutToken", "this_$iv", "authorizationCode", "$i$f$fold", "$i$a$-fold-GetCheckoutUrlUseCase$invoke$3"}, nl = {84, 85}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class GetCheckoutUrlUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCheckoutUrlUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = getCheckoutUrlUseCase;
    }
}
