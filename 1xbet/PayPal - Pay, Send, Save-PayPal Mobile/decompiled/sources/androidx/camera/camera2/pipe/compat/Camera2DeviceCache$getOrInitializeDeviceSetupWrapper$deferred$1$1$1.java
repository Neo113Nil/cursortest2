package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceSetup;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1", f = "Camera2DeviceCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceSetup>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener;
        java.lang.Boolean bool;
        androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener2;
        android.hardware.camera2.CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener3;
        javax.inject.Provider provider;
        javax.inject.Provider provider2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.getHighSpeedVideoSizes;
        cameraErrorListener = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        try {
            provider2 = camera2DeviceCache.getHighSpeedVideoFpsRangesFor;
            bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((android.hardware.camera2.CameraManager) provider2.get()).isCameraDeviceSetupSupported(str2));
        } catch (java.lang.Exception e) {
            if (e instanceof android.hardware.camera2.CameraAccessException) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) e), true);
            } else if ((e instanceof java.lang.IllegalArgumentException) || (e instanceof java.lang.SecurityException) || (e instanceof java.lang.UnsupportedOperationException) || (e instanceof java.lang.NullPointerException)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else if (e instanceof java.lang.IllegalStateException) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            } else {
                throw e;
            }
            bool = null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
            return null;
        }
        androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
        java.lang.String str3 = this.getHighSpeedVideoSizes;
        if (log.getDEBUG_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str3);
        }
        java.lang.String str4 = this.getHighSpeedVideoSizes;
        cameraErrorListener2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache2 = this.Camera2StreamConfigurationMap;
        java.lang.String str5 = this.getHighSpeedVideoSizes;
        try {
            provider = camera2DeviceCache2.getHighSpeedVideoFpsRangesFor;
            cameraDeviceSetup = ((android.hardware.camera2.CameraManager) provider.get()).getCameraDeviceSetup(str5);
        } catch (java.lang.Exception e2) {
            if (e2 instanceof android.hardware.camera2.CameraAccessException) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e2.getMessage();
                }
                cameraErrorListener2.mo790onCameraError3M5Xam4(str4, androidx.camera.camera2.pipe.CameraError.INSTANCE.m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) e2), true);
            } else if ((e2 instanceof java.lang.IllegalArgumentException) || (e2 instanceof java.lang.SecurityException) || (e2 instanceof java.lang.UnsupportedOperationException) || (e2 instanceof java.lang.NullPointerException)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e2.getMessage();
                }
                cameraErrorListener2.mo790onCameraError3M5Xam4(str4, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else if (e2 instanceof java.lang.IllegalStateException) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            } else {
                throw e2;
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup == null) {
            return null;
        }
        java.lang.String str6 = this.getHighSpeedVideoSizes;
        cameraErrorListener3 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceSetup(cameraDeviceSetup, str6, cameraErrorListener3, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceSetup> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = camera2DeviceCache;
    }
}
