package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/UseCaseThreads$confineLaunch$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1", f = "CapturePipeline.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 247}, m = "invokeSuspend", n = {"requiresStopRepeating"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
public final class CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r9.tryStartRepeating(r8) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0055, code lost:
    
        if (r9 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.AutoCloseable autoCloseable;
        androidx.camera.camera2.impl.UseCaseCameraState highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
        } catch (java.util.concurrent.CancellationException unused) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.CompletableDeferred) it.next()).completeExceptionally(new androidx.camera.core.ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }
        }
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                androidx.camera.camera2.pipe.CameraGraph graph = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.getGraph();
                this.getHighSpeedVideoSizes = booleanRef;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = graph.acquireSession(this);
            } else if (i == 1) {
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
                this.getHighSpeedVideoFpsRangesFor = 3;
            }
            androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
            booleanRef.element = androidx.camera.camera2.compat.workaround.StillCaptureFlowKt.shouldStopRepeatingBeforeCapture(this.Camera2StreamConfigurationMap);
            if (booleanRef.element) {
                session.stopRepeating();
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            session.submit(this.Camera2StreamConfigurationMap);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
            if (booleanRef.element) {
                java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
            return kotlin.Unit.INSTANCE;
        } finally {
        }
        autoCloseable = (java.lang.AutoCloseable) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(continuation, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, java.util.List list, java.util.List list2) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = capturePipelineImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.Camera2StreamConfigurationMap = list2;
    }
}
