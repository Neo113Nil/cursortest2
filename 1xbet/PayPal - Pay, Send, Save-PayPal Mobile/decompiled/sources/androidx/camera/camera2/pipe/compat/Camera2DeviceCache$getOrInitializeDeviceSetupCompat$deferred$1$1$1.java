package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;", "Lorg/jspecify/annotations/NonNull;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1", f = "Camera2DeviceCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener;
        androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory highSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (log.getDEBUG_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
        }
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        cameraErrorListener = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str3 = this.getHighSpeedVideoSizes;
        try {
            highSpeedVideoSizes = camera2DeviceCache.getHighSpeedVideoSizes();
            return highSpeedVideoSizes.getCameraDeviceSetupCompat(str3);
        } catch (java.lang.Exception e) {
            if (e instanceof android.hardware.camera2.CameraAccessException) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str2, androidx.camera.camera2.pipe.CameraError.INSTANCE.m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) e), true);
                return null;
            }
            if ((e instanceof java.lang.IllegalArgumentException) || (e instanceof java.lang.SecurityException) || (e instanceof java.lang.UnsupportedOperationException) || (e instanceof java.lang.NullPointerException)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str2, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A(), false);
                return null;
            }
            if (e instanceof java.lang.IllegalStateException) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                return null;
            }
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = camera2DeviceCache;
    }
}
