package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", i = {0, 0}, l = {171}, m = "applyScreenFlash", n = {"onApplyCompletedSignal", "timeoutMillis"}, s = {"L$0", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class FlashControl$applyScreenFlash$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.FlashControl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(0L, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashControl$applyScreenFlash$1(androidx.camera.camera2.impl.FlashControl flashControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flashControl;
    }
}
