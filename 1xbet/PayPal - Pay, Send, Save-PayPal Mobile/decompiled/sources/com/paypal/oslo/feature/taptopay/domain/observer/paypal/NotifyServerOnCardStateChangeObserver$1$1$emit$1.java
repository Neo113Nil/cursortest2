package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1", f = "NotifyServerOnCardStateChangeObserver.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {83, 84, 85, 86}, m = "emit", n = {"changed", "id", "changed", "id", "changed", "id", "changed", "id"}, nl = {84, 85, 86, 87}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyServerOnCardStateChangeObserver$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1.C01441<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NotifyServerOnCardStateChangeObserver$1$1$emit$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1.C01441<? super T> c01441, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = c01441;
    }
}
