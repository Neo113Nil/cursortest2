package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroidx/camera/camera2/pipe/CameraId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameraIds$2", f = "Camera2DeviceCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getCameraIds$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.CameraId>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache = this.getHighSpeedVideoFpsRanges;
        try {
            android.os.Trace.beginSection("readCameraIds");
            Camera2StreamConfigurationMap = camera2DeviceCache.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.emptyList();
            }
            return Camera2StreamConfigurationMap;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.CameraId>> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameraIds$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameraIds$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getCameraIds$2(androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameraIds$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = camera2DeviceCache;
    }
}
