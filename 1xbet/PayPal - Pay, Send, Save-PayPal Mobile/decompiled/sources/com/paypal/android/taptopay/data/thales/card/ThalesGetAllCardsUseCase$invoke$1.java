package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase", f = "ThalesGetAllCardsUseCase.kt", i = {0, 1, 1, 1}, l = {43, 47}, m = "invoke", n = {"this", "this", "destination$iv$iv", "$this$forEach$iv$iv$iv"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class ThalesGetAllCardsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase getInputFormats;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesGetAllCardsUseCase$invoke$1(com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = thalesGetAllCardsUseCase;
    }
}
