package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase", f = "SetAsDefaultIfNeededUsecase.kt", i = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5}, l = {67, 69, 79, 83, 87, 101}, m = "setAsDefaultIfNeeded", n = {"this", "$this$setAsDefaultIfNeeded", "state", "cardActivated", "$this$setAsDefaultIfNeeded", "cardActivated", "cardActivated", "setDefaultCardResult", "cardActivated", "setDefaultCardResult", "cardActivated", "setDefaultCardResult", "cardActivated"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes10.dex */
final class SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase.access$setAsDefaultIfNeeded(this.getOutputMinFrameDuration, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1(com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$setAsDefaultIfNeeded$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = setAsDefaultIfNeededUsecase;
    }
}
