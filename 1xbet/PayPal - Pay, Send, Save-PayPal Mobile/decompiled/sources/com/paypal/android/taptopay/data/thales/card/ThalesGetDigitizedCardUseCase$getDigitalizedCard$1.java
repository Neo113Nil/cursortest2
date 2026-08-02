package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase", f = "ThalesGetDigitizedCardUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 55, 59}, m = "getDigitalizedCard", n = {"this", "tokenizedCardId", "digitalizedCard", "this", "tokenizedCardId", "digitalizedCard", "details", "this", "tokenizedCardId", "digitalizedCard", "details", "isDefault"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes4.dex */
final class ThalesGetDigitizedCardUseCase$getDigitalizedCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesGetDigitizedCardUseCase$getDigitalizedCard$1(com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$getDigitalizedCard$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = thalesGetDigitizedCardUseCase;
    }
}
