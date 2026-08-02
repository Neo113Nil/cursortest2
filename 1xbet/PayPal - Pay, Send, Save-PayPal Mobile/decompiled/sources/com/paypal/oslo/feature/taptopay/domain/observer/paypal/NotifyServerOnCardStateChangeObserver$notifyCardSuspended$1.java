package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver", f = "NotifyServerOnCardStateChangeObserver.kt", i = {0}, l = {128}, m = "notifyCardSuspended", n = {"id"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardSuspended(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = notifyServerOnCardStateChangeObserver;
    }
}
