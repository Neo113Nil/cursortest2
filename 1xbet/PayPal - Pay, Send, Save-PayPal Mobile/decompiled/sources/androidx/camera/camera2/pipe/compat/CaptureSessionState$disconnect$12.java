package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12", f = "CaptureSessionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CaptureSessionState$disconnect$12 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CaptureSessionState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CaptureSessionState.ConfiguredCameraCaptureSession getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" CameraCaptureSessionWrapper#close");
        java.lang.String obj2 = sb.toString();
        androidx.camera.camera2.pipe.compat.CaptureSessionState.ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            android.os.Trace.beginSection(obj2);
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            configuredCameraCaptureSession.getGetHighSpeedVideoSizes().close();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$disconnect$12(androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState, androidx.camera.camera2.pipe.compat.CaptureSessionState.ConfiguredCameraCaptureSession configuredCameraCaptureSession, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = captureSessionState;
        this.getHighResolutionOutputSizeshNQ4ISI = configuredCameraCaptureSession;
    }
}
