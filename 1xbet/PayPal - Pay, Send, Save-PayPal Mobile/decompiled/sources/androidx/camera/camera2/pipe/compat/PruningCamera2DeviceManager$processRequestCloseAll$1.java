package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager", f = "Camera2DeviceManager.kt", i = {0, 1}, l = {493, 498}, m = "processRequestCloseAll", n = {"requestCloseAll", "requestCloseAll"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$processRequestCloseAll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor((androidx.camera.camera2.pipe.compat.RequestCloseAll) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$processRequestCloseAll$1(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$processRequestCloseAll$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = pruningCamera2DeviceManager;
    }
}
