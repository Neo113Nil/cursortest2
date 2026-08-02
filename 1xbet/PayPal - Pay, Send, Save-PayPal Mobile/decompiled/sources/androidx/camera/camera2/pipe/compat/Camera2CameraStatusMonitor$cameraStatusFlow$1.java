package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1", f = "Camera2CameraStatusMonitor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraStatusMonitor$cameraStatusFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.hardware.camera2.CameraManager cameraManager;
        androidx.camera.camera2.pipe.core.Threads threads;
        android.hardware.camera2.CameraManager cameraManager2;
        androidx.camera.camera2.pipe.core.Threads threads2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor = this.getHighSpeedVideoSizes;
            final ?? r1 = new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1
                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAccessPrioritiesChanged() {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                    java.lang.Object trySendBlocking = kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope, androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged.INSTANCE);
                    if (trySendBlocking instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                        kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(trySendBlocking);
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    }
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAvailable(java.lang.String cameraId) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                    str = camera2CameraStatusMonitor.Camera2StreamConfigurationMap;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, str)) {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                        kotlinx.coroutines.channels.ProducerScope<androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus> producerScope2 = producerScope;
                        androidx.camera.camera2.pipe.CameraId.Companion companion = androidx.camera.camera2.pipe.CameraId.INSTANCE;
                        java.lang.Object trySendBlocking = kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope2, new androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraAvailable(androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraId), null));
                        if (trySendBlocking instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                            kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(trySendBlocking);
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                        }
                    }
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraUnavailable(java.lang.String cameraId) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                    str = camera2CameraStatusMonitor.Camera2StreamConfigurationMap;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, str)) {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                        kotlinx.coroutines.channels.ProducerScope<androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus> producerScope2 = producerScope;
                        androidx.camera.camera2.pipe.CameraId.Companion companion = androidx.camera.camera2.pipe.CameraId.INSTANCE;
                        java.lang.Object trySendBlocking = kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope2, new androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraUnavailable(androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraId), null));
                        if (trySendBlocking instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                            kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(trySendBlocking);
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                        }
                    }
                }
            };
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                cameraManager2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraManager2, "");
                threads2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                androidx.camera.camera2.pipe.compat.Api28Compat.registerAvailabilityCallback(cameraManager2, threads2.getLightweightExecutor(), (android.hardware.camera2.CameraManager.AvailabilityCallback) r1);
            } else {
                cameraManager = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                threads = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                cameraManager.registerAvailabilityCallback((android.hardware.camera2.CameraManager.AvailabilityCallback) r1, threads.getCamera2Handler());
            }
            final androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1.Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor.this, r1);
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

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor, androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1 camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1) {
        android.hardware.camera2.CameraManager cameraManager;
        cameraManager = camera2CameraStatusMonitor.getHighResolutionOutputSizeshNQ4ISI;
        cameraManager.unregisterAvailabilityCallback(camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1 camera2CameraStatusMonitor$cameraStatusFlow$1 = new androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1(this.getHighSpeedVideoSizes, continuation);
        camera2CameraStatusMonitor$cameraStatusFlow$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return camera2CameraStatusMonitor$cameraStatusFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraStatusMonitor$cameraStatusFlow$1(androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = camera2CameraStatusMonitor;
    }
}
