package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver", f = "NotifyServerOnCardStateChangeObserver.kt", i = {0}, l = {106}, m = "notifyCardDeleted", n = {"id"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardDeleted(this.getHighResolutionOutputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = notifyServerOnCardStateChangeObserver;
    }
}
