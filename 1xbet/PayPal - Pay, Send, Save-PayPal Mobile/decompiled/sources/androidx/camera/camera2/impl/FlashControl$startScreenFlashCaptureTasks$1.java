package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", i = {0}, l = {149, 160}, m = "startScreenFlashCaptureTasks", n = {"pendingTasks"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class FlashControl$startScreenFlashCaptureTasks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.FlashControl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.startScreenFlashCaptureTasks(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashControl$startScreenFlashCaptureTasks$1(androidx.camera.camera2.impl.FlashControl flashControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flashControl;
    }
}
