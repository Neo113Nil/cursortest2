package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Landroidx/camera/camera2/pipe/CameraId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1", f = "Camera2DeviceCache.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCache$createCameraIdListFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.camera.camera2.pipe.CameraId>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCache getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        javax.inject.Provider provider;
        androidx.camera.camera2.pipe.core.Threads threads;
        java.lang.Object obj2;
        java.util.List list;
        java.util.List Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            final androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache = this.getHighResolutionOutputSizeshNQ4ISI;
            final ?? r1 = new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1
                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAvailable(java.lang.String cameraId) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                    androidx.camera.camera2.pipe.compat.Camera2DeviceCache.access$onCameraAvailabilityChanged(androidx.camera.camera2.pipe.compat.Camera2DeviceCache.this, producerScope, cameraId, true);
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraUnavailable(java.lang.String cameraId) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                    androidx.camera.camera2.pipe.compat.Camera2DeviceCache.access$onCameraAvailabilityChanged(androidx.camera.camera2.pipe.compat.Camera2DeviceCache.this, producerScope, cameraId, false);
                }
            };
            provider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            final android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) provider.get();
            threads = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            cameraManager.registerAvailabilityCallback((android.hardware.camera2.CameraManager.AvailabilityCallback) r1, threads.getCamera2Handler());
            obj2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache2 = this.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (obj2) {
                list = camera2DeviceCache2.getInputSizeshNQ4ISI;
            }
            if (list == null) {
                Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap != null) {
                    androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.camera.camera2.pipe.compat.Camera2DeviceCache.getHighSpeedVideoSizes(producerScope, Camera2StreamConfigurationMap);
                }
            } else {
                androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache4 = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.pipe.compat.Camera2DeviceCache.getHighSpeedVideoSizes(producerScope, list);
            }
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1.Camera2StreamConfigurationMap(cameraManager, r1);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(android.hardware.camera2.CameraManager cameraManager, androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1 camera2DeviceCache$createCameraIdListFlow$1$callback$1) {
        cameraManager.unregisterAvailabilityCallback(camera2DeviceCache$createCameraIdListFlow$1$callback$1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.camera.camera2.pipe.CameraId>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1 camera2DeviceCache$createCameraIdListFlow$1 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        camera2DeviceCache$createCameraIdListFlow$1.getHighSpeedVideoFpsRanges = obj;
        return camera2DeviceCache$createCameraIdListFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$createCameraIdListFlow$1(androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = camera2DeviceCache;
    }
}
