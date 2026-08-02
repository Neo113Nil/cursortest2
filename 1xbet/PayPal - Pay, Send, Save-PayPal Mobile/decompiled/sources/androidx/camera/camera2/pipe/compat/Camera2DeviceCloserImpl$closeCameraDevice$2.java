package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2", f = "Camera2DeviceCloser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2DeviceCloserImpl$closeCameraDevice$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.hardware.camera2.CameraDevice Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.compat.CameraDeviceWrapperKt.closeWithTrace(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor.element = true;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCloserImpl$closeCameraDevice$2(android.hardware.camera2.CameraDevice cameraDevice, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = cameraDevice;
        this.getHighSpeedVideoFpsRangesFor = booleanRef;
    }
}
