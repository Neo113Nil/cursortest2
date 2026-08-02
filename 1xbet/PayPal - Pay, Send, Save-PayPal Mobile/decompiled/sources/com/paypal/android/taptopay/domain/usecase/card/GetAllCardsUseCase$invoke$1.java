package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase", f = "GetAllCardsUseCase.kt", i = {0, 0, 1, 1, 1}, l = {45, 49}, m = "invoke", n = {"this", "getCardArt", "this", "destination$iv$iv", "card"}, s = {"L$0", "Z$0", "L$0", "L$1", "L$3"})
/* loaded from: classes10.dex */
final class GetAllCardsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(false, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAllCardsUseCase$invoke$1(com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = getAllCardsUseCase;
    }
}
