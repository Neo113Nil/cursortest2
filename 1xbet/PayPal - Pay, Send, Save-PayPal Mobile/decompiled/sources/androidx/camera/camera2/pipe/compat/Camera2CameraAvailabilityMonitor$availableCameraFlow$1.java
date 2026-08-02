package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/CameraId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraAvailabilityMonitor$availableCameraFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.CameraId>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        javax.inject.Provider provider;
        androidx.camera.camera2.pipe.core.Threads threads;
        androidx.camera.camera2.pipe.core.Threads threads2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
            final ?? r1 = new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1
                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAvailable(java.lang.String cameraIdString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIdString, "");
                    kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope, androidx.camera.camera2.pipe.CameraId.m392boximpl(androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraIdString)));
                }
            };
            provider = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            final android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) provider.get();
            if (android.os.Build.VERSION.SDK_INT < 28) {
                threads = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                cameraManager.registerAvailabilityCallback((android.hardware.camera2.CameraManager.AvailabilityCallback) r1, threads.getCamera2Handler());
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraManager);
                threads2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.compat.Api28Compat.registerAvailabilityCallback(cameraManager, threads2.getCamera2Executor(), (android.hardware.camera2.CameraManager.AvailabilityCallback) r1);
            }
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1.getHighSpeedVideoFpsRanges(cameraManager, r1);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(android.hardware.camera2.CameraManager cameraManager, androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1) {
        cameraManager.unregisterAvailabilityCallback(camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.CameraId> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
        camera2CameraAvailabilityMonitor$availableCameraFlow$1.Camera2StreamConfigurationMap = obj;
        return camera2CameraAvailabilityMonitor$availableCameraFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraAvailabilityMonitor$availableCameraFlow$1(androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = camera2CameraAvailabilityMonitor;
    }
}
