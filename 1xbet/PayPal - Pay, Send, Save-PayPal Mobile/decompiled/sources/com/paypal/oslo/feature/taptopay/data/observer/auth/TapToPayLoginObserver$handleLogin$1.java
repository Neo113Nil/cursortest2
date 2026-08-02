package com.paypal.oslo.feature.taptopay.data.observer.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver", f = "TapToPayLoginObserver.kt", i = {}, l = {91, 92}, m = "handleLogin", n = {}, nl = {92, 93}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class TapToPayLoginObserver$handleLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayLoginObserver$handleLogin$1(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver tapToPayLoginObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleLogin$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = tapToPayLoginObserver;
    }
}
