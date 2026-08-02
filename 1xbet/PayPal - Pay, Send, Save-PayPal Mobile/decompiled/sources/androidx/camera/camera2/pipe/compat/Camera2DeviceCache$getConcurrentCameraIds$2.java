package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroidx/camera/camera2/pipe/CameraId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getConcurrentCameraIds$2", f = "Camera2DeviceCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getConcurrentCameraIds$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<? extends androidx.camera.camera2.pipe.CameraId>>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            android.os.Trace.beginSection("readConcurrentCameraIds");
            java.util.Set<java.util.Set<androidx.camera.camera2.pipe.CameraId>> awaitConcurrentCameraIds = camera2DeviceCache.awaitConcurrentCameraIds();
            java.util.Set<java.util.Set<androidx.camera.camera2.pipe.CameraId>> set = awaitConcurrentCameraIds;
            if (set != null && !set.isEmpty()) {
                obj2 = camera2DeviceCache.getOutputMinFrameDuration;
                synchronized (obj2) {
                    camera2DeviceCache.getOutputFormats = awaitConcurrentCameraIds;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return awaitConcurrentCameraIds;
            }
            awaitConcurrentCameraIds = kotlin.collections.SetsKt.emptySet();
            return awaitConcurrentCameraIds;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<? extends androidx.camera.camera2.pipe.CameraId>>> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getConcurrentCameraIds$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getConcurrentCameraIds$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getConcurrentCameraIds$2(androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getConcurrentCameraIds$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = camera2DeviceCache;
    }
}
