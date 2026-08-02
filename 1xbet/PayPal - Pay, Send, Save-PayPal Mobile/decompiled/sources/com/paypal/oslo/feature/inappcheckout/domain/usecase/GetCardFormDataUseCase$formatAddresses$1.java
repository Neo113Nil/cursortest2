package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase", f = "GetCardFormDataUseCase.kt", i = {0, 0}, l = {36}, m = "formatAddresses", n = {"cardFormData", "addresses"}, nl = {37}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class GetCardFormDataUseCase$formatAddresses$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardFormDataUseCase$formatAddresses$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$formatAddresses$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getCardFormDataUseCase;
    }
}
