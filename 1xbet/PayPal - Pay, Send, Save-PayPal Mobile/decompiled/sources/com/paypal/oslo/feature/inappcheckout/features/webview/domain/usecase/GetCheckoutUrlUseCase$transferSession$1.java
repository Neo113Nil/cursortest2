package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase", f = "GetCheckoutUrlUseCase.kt", i = {}, l = {67}, m = "transferSession", n = {}, nl = {84}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class GetCheckoutUrlUseCase$transferSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCheckoutUrlUseCase$transferSession$1(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$transferSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = getCheckoutUrlUseCase;
    }
}
