package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9", f = "CaptureSessionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CaptureSessionState$disconnect$9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.graph.GraphRequestProcessor Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CaptureSessionState getHighSpeedVideoFpsRangesFor;
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
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" stopRepeating");
        java.lang.String obj2 = sb.toString();
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = this.Camera2StreamConfigurationMap;
        try {
            android.os.Trace.beginSection(obj2);
            graphRequestProcessor.stopRepeating$camera_camera2_pipe();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
            androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            sb2.append(" abortCaptures");
            java.lang.String obj3 = sb2.toString();
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor2 = this.Camera2StreamConfigurationMap;
            try {
                android.os.Trace.beginSection(obj3);
                graphRequestProcessor2.abortCaptures$camera_camera2_pipe();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                android.os.Trace.endSection();
                return kotlin.Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$disconnect$9(androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState, androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = captureSessionState;
        this.Camera2StreamConfigurationMap = graphRequestProcessor;
    }
}
