package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/CapturePipelineImpl$invoke$7$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1", f = "CapturePipeline.kt", i = {}, l = {312, 898, 900, 907}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        if (r15 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        if (r15 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0053, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r14.getHighResolutionOutputSizeshNQ4ISI, r14) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            this.getHighSpeedVideoSizesFor = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) obj;
                    try {
                        androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable2;
                        if (this.getHighSpeedVideoFpsRanges != 0) {
                            z = false;
                        }
                        this.getInputFormats = autoCloseable2;
                        this.getHighSpeedVideoSizesFor = 3;
                        if (session.unlock3APostCapture(z, this) != coroutine_suspended) {
                            autoCloseable = autoCloseable2;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th2) {
                        autoCloseable = autoCloseable2;
                        th = th2;
                        throw th;
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                autoCloseable = (java.lang.AutoCloseable) this.getInputFormats;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                        throw th4;
                    }
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(this.getOutputMinFrameDuration.Camera2StreamConfigurationMap, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8(), false, false, 6, null);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        if (this.getHighSpeedVideoSizes) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getOutputMinFrameDuration.getGraph();
            this.getHighSpeedVideoSizesFor = 2;
            obj = graph.acquireSession(this);
        } else {
            if (this.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == 0) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger7 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused7 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = this.getOutputMinFrameDuration;
                j = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizesFor = 4;
                Camera2StreamConfigurationMap = capturePipelineImpl.Camera2StreamConfigurationMap(j, this);
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(java.util.List list, kotlin.coroutines.Continuation continuation, boolean z, androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, boolean z2, boolean z3, int i) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getOutputMinFrameDuration = capturePipelineImpl;
        this.getHighSpeedVideoSizes = z2;
        this.Camera2StreamConfigurationMap = z3;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
