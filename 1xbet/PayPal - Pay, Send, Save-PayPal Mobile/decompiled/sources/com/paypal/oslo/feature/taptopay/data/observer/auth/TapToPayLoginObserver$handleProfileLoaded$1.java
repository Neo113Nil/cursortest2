package com.paypal.oslo.feature.taptopay.data.observer.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver", f = "TapToPayLoginObserver.kt", i = {}, l = {108}, m = "handleProfileLoaded", n = {}, nl = {129}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class TapToPayLoginObserver$handleProfileLoaded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayLoginObserver$handleProfileLoaded$1(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver tapToPayLoginObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleProfileLoaded$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = tapToPayLoginObserver;
    }
}
