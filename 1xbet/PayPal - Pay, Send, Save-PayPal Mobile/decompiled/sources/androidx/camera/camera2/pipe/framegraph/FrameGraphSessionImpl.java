package androidx.camera.camera2.pipe.framegraph;

@androidx.camera.camera2.pipe.config.FrameGraphScope
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0015JÐ\u0001\u00103\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010\u00162\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0096A¢\u0006\u0004\b1\u00102J<\u00105\u001a\b\u0012\u0004\u0012\u0002000/2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020,H\u0096A¢\u0006\u0004\b5\u00106J6\u00105\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020'2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020,H\u0096A¢\u0006\u0004\b5\u00109J \u0010<\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u0002000/H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\bA\u0010\fJ\u0018\u0010B\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\bB\u0010@J\u001e\u0010B\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096\u0001¢\u0006\u0004\bB\u0010CJd\u0010F\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\bD\u0010EJZ\u0010K\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010G\u001a\u0004\u0018\u00010'2\b\u0010H\u001a\u0004\u0018\u00010'2\b\u0010I\u001a\u0004\u0018\u00010'2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020,H\u0096A¢\u0006\u0004\bK\u0010LJ\u001e\u0010N\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010M\u001a\u00020'H\u0096A¢\u0006\u0004\bN\u0010OJd\u0010Q\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00132\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\bP\u0010ER\u0014\u0010T\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010U\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010R\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010["}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameGraphSessionImpl;", "Landroidx/camera/camera2/pipe/FrameGraph$Session;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "cameraGraphSession", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "frameGraphBuffers", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Session;Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;Landroidx/camera/camera2/pipe/graph/Controller3A;)V", "", "close", "()V", "abort", "Landroidx/camera/camera2/pipe/Request;", "request", "Landroidx/camera/camera2/pipe/FrameCapture;", "capture", "(Landroidx/camera/camera2/pipe/Request;)Landroidx/camera/camera2/pipe/FrameCapture;", "", "requests", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "lock3A--tS25XM", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "timeLimitNs", "lock3AForCapture", "(Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "(ZZIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "startRepeating", "(Landroidx/camera/camera2/pipe/Request;)V", "stopRepeating", "submit", "(Ljava/util/List;)V", "submit3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "submit3A", "ae", "af", "awb", "unlockedCondition", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAf", "unlock3APostCapture", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update3A-ydBZfZg", "update3A", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Landroidx/camera/camera2/pipe/graph/State3A;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/graph/State3A;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameGraphSessionImpl implements androidx.camera.camera2.pipe.FrameGraph.Session, androidx.camera.camera2.pipe.CameraGraph.Session {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.State3A getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Session getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.Controller3A Camera2StreamConfigurationMap;

    public FrameGraphSessionImpl(androidx.camera.camera2.pipe.CameraGraph.Session session, androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers frameGraphBuffers, androidx.camera.camera2.pipe.graph.Controller3A controller3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraphBuffers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller3A, "");
        this.getHighSpeedVideoFpsRanges = session;
        this.getHighSpeedVideoSizes = frameGraphBuffers;
        this.Camera2StreamConfigurationMap = controller3A;
        this.getHighSpeedVideoFpsRangesFor = controller3A.state3ASnapshot();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.reset3A(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges.close();
        this.getHighSpeedVideoSizes.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo279update3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getHighSpeedVideoFpsRanges.mo279update3AydBZfZg(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object unlock3APostCapture(boolean z, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        return this.getHighSpeedVideoFpsRanges.unlock3APostCapture(z, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object unlock3A(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        return this.getHighSpeedVideoFpsRanges.unlock3A(bool, bool2, bool3, function1, i, j, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo278submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getHighSpeedVideoFpsRanges.mo278submit3AydBZfZg(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void submit(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        this.getHighSpeedVideoFpsRanges.submit(requests);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void submit(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.getHighSpeedVideoFpsRanges.submit(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void stopRepeating() {
        this.getHighSpeedVideoFpsRanges.stopRepeating();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void startRepeating(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.getHighSpeedVideoFpsRanges.startRepeating(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn() {
        return this.getHighSpeedVideoFpsRanges.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo277setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode) {
        return this.getHighSpeedVideoFpsRanges.mo277setTorchOffNqN7i0k(aeMode);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object lock3AForCapture(boolean z, boolean z2, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        return this.getHighSpeedVideoFpsRanges.lock3AForCapture(z, z2, i, j, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object lock3AForCapture(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        return this.getHighSpeedVideoFpsRanges.lock3AForCapture(function1, i, j, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    /* renamed from: lock3A--tS25XM */
    public final java.lang.Object mo386lock3AtS25XM(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode2, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function12, int i, long j, long j2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        return this.getHighSpeedVideoFpsRanges.mo386lock3AtS25XM(aeMode, afMode, awbMode, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, function1, function12, i, j, j2, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.util.List<androidx.camera.camera2.pipe.FrameCapture> capture(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        return this.getHighSpeedVideoFpsRanges.capture(requests);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final androidx.camera.camera2.pipe.FrameCapture capture(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return this.getHighSpeedVideoFpsRanges.capture(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void abort() {
        this.getHighSpeedVideoFpsRanges.abort();
    }
}
