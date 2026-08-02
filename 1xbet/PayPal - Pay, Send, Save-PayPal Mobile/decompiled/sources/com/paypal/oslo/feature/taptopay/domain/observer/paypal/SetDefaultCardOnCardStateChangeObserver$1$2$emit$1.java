package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2", f = "SetDefaultCardOnCardStateChangeObserver.kt", i = {0}, l = {86}, m = "emit", n = {"changed"}, nl = {87}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class SetDefaultCardOnCardStateChangeObserver$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1.AnonymousClass2<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SetDefaultCardOnCardStateChangeObserver$1$2$emit$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anonymousClass2;
    }
}
