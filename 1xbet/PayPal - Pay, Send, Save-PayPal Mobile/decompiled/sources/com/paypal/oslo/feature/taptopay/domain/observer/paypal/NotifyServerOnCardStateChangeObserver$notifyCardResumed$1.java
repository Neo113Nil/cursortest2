package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver", f = "NotifyServerOnCardStateChangeObserver.kt", i = {0}, l = {150}, m = "notifyCardResumed", n = {"id"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class NotifyServerOnCardStateChangeObserver$notifyCardResumed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardResumed(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyServerOnCardStateChangeObserver$notifyCardResumed$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardResumed$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = notifyServerOnCardStateChangeObserver;
    }
}
