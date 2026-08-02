package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver", f = "CardAddedObserver.kt", i = {0}, l = {81}, m = "notifyCardAdded", n = {"cardIdGroup"}, nl = {107}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class CardAddedObserver$notifyCardAdded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardAddedObserver$notifyCardAdded$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver cardAddedObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$notifyCardAdded$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardAddedObserver;
    }
}
