package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache", f = "Camera2DeviceCache.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "getOrInitializeDeviceSetupWrapper-0r8Bogc", n = {"cameraId", "deferred"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.m786getOrInitializeDeviceSetupWrapper0r8Bogc(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1(androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = camera2DeviceCache;
    }
}
