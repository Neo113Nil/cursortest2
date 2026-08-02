package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver", f = "SetDefaultCardOnCardStateChangeObserver.kt", i = {0}, l = {134}, m = "setDefaultCard", n = {"cardId"}, nl = {174}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = setDefaultCardOnCardStateChangeObserver;
    }
}
