package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache", f = "Camera2DeviceCache.kt", i = {0, 0}, l = {130}, m = "getOrInitializeDeviceSetupCompat-0r8Bogc", n = {"cameraId", "deferred"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.m785getOrInitializeDeviceSetupCompat0r8Bogc(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1(androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = camera2DeviceCache;
    }
}
