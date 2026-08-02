package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2", f = "Camera2CaptureSequenceProcessor.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CaptureSequence getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRangesFor.awaitStarted$camera_camera2_pipe(this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2(androidx.camera.camera2.pipe.compat.Camera2CaptureSequence camera2CaptureSequence, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = camera2CaptureSequence;
    }
}
