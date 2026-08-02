package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1", f = "VirtualCamera.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class VirtualCameraState$connect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.compat.CameraState> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.VirtualCameraState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.compat.CameraState> flow = this.Camera2StreamConfigurationMap;
            final androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return getHighSpeedVideoSizes((androidx.camera.camera2.pipe.compat.CameraState) obj2);
                }

                private java.lang.Object getHighSpeedVideoSizes(androidx.camera.camera2.pipe.compat.CameraState cameraState) {
                    java.lang.Object obj2;
                    obj2 = androidx.camera.camera2.pipe.compat.VirtualCameraState.this.getHighSpeedVideoSizes;
                    androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState2 = androidx.camera.camera2.pipe.compat.VirtualCameraState.this;
                    synchronized (obj2) {
                        if (!(cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen)) {
                            virtualCameraState2.getHighSpeedVideoSizes(cameraState);
                        } else {
                            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice = ((androidx.camera.camera2.pipe.compat.CameraStateOpen) cameraState).getCameraDevice();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraDevice, "");
                            androidx.camera.camera2.pipe.compat.VirtualAndroidCameraDevice virtualAndroidCameraDevice = new androidx.camera.camera2.pipe.compat.VirtualAndroidCameraDevice((androidx.camera.camera2.pipe.compat.AndroidCameraDevice) cameraDevice);
                            virtualCameraState2.getHighResolutionOutputSizeshNQ4ISI = virtualAndroidCameraDevice;
                            virtualCameraState2.getHighSpeedVideoSizes(new androidx.camera.camera2.pipe.compat.CameraStateOpen(virtualAndroidCameraDevice));
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    return kotlin.Unit.INSTANCE;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VirtualCameraState$connect$2$1(kotlinx.coroutines.flow.Flow<? extends androidx.camera.camera2.pipe.compat.CameraState> flow, androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoSizes = virtualCameraState;
    }
}
