package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/CapturePipelineImpl$invoke$7$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1", f = "CapturePipeline.kt", i = {}, l = {312, 885, 892}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r8 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r7.getHighSpeedVideoFpsRangesFor, r7) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:8:0x0017, B:9:0x0099, B:11:0x00a1, B:12:0x00a4), top: B:7:0x0017 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable = (java.lang.AutoCloseable) this.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                            throw th3;
                        }
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) obj;
                try {
                    androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable2;
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    if (this.getHighSpeedVideoSizes != 0) {
                        z = false;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = autoCloseable2;
                    this.Camera2StreamConfigurationMap = 3;
                    if (session.unlock3APostCapture(z, this) != coroutine_suspended) {
                        autoCloseable = autoCloseable2;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger22 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th4) {
                    autoCloseable = autoCloseable2;
                    th = th4;
                    throw th;
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.camera2.pipe.CameraGraph graph = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.getGraph();
        this.Camera2StreamConfigurationMap = 2;
        obj = graph.acquireSession(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(this.getHighSpeedVideoFpsRangesFor, continuation, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(java.util.List list, kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, int i) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = capturePipelineImpl;
        this.getHighSpeedVideoSizes = i;
    }
}
