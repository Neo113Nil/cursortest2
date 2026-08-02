package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1", f = "Camera2CameraStatusMonitor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraStatusMonitor$cameraStatusJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.Flow flow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flow = this.getHighSpeedVideoSizes.getOutputFormats;
            final androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                    androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus cameraStatus = (androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus) obj2;
                    if (cameraStatus instanceof androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraAvailable) {
                        mutableStateFlow2 = androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor.this.getHighSpeedVideoSizesFor;
                        java.lang.Object emit = mutableStateFlow2.emit(cameraStatus, continuation);
                        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                    }
                    if (cameraStatus instanceof androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraUnavailable) {
                        mutableStateFlow = androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor.this.getHighSpeedVideoSizesFor;
                        java.lang.Object emit2 = mutableStateFlow.emit(cameraStatus, continuation);
                        return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
                    }
                    if (cameraStatus instanceof androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged) {
                        mutableSharedFlow = androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor.this.getInputSizeshNQ4ISI;
                        java.lang.Object emit3 = mutableSharedFlow.emit(kotlin.Unit.INSTANCE, continuation);
                        return emit3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit3 : kotlin.Unit.INSTANCE;
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
        return ((androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraStatusMonitor$cameraStatusJob$1(androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor camera2CameraStatusMonitor, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = camera2CameraStatusMonitor;
    }
}
