package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase", f = "GetCardUseCase.kt", i = {0, 0, 1, 1}, l = {49, 57}, m = "invoke", n = {"this", "getCardArt", "this", "card"}, s = {"L$0", "Z$0", "L$0", "L$1"})
/* loaded from: classes10.dex */
final class GetCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardUseCase$invoke$1(com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = getCardUseCase;
    }
}
