package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase", f = "GetDefaultCardUseCase.kt", i = {0, 1, 1, 1}, l = {39, 43}, m = "invoke", n = {"this", "this", "getDefaultCardResult", "card"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes10.dex */
final class GetDefaultCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetDefaultCardUseCase$invoke$1(com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = getDefaultCardUseCase;
    }
}
