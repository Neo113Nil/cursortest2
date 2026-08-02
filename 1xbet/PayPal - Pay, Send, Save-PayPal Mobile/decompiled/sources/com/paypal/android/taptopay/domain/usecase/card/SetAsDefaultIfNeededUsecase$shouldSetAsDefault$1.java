package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase", f = "SetAsDefaultIfNeededUsecase.kt", i = {}, l = {113}, m = "shouldSetAsDefault", n = {}, s = {})
/* loaded from: classes10.dex */
final class SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1(com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$shouldSetAsDefault$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = setAsDefaultIfNeededUsecase;
    }
}
