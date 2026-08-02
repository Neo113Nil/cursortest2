package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u001eJc\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0015H\u0016¢\u0006\u0004\b-\u0010.Jc\u00101\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0015H\u0016¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b4\u00105JÐ\u0001\u0010H\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00152\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u0001072\b\u0010;\u001a\u0004\u0018\u00010!2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0096@¢\u0006\u0004\bF\u0010GJZ\u0010N\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010I\u001a\u0004\u0018\u00010>2\b\u0010J\u001a\u0004\u0018\u00010>2\b\u0010K\u001a\u0004\u0018\u00010>2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0006\u0010B\u001a\u00020A2\u0006\u0010M\u001a\u00020CH\u0096@¢\u0006\u0004\bN\u0010OJ<\u0010P\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0006\u0010B\u001a\u00020A2\u0006\u0010M\u001a\u00020CH\u0096@¢\u0006\u0004\bP\u0010QJ6\u0010P\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010R\u001a\u00020>2\u0006\u0010S\u001a\u00020>2\u0006\u0010B\u001a\u00020A2\u0006\u0010M\u001a\u00020CH\u0096@¢\u0006\u0004\bP\u0010TJ\u001e\u0010V\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010U\u001a\u00020>H\u0096@¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010^\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010cR\u0014\u0010a\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010e\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010gR\u0014\u0010[\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010h"}, d2 = {"Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/core/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "parameters", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "listeners", "<init>", "(Landroidx/camera/camera2/pipe/core/Token;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/graph/Controller3A;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;)V", "Landroidx/camera/camera2/pipe/Request;", "request", "", "submit", "(Landroidx/camera/camera2/pipe/Request;)V", "", "requests", "(Ljava/util/List;)V", "Landroidx/camera/camera2/pipe/FrameCapture;", "capture", "(Landroidx/camera/camera2/pipe/Request;)Landroidx/camera/camera2/pipe/FrameCapture;", "(Ljava/util/List;)Ljava/util/List;", "startRepeating", "abort", "()V", "stopRepeating", "close", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "update3A", "submit3A-ydBZfZg", "submit3A", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "lock3A--tS25XM", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3AForCapture", "(Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "(ZZIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAf", "unlock3APostCapture", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/pipe/core/Token;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraGraphSessionImpl implements androidx.camera.camera2.pipe.CameraGraph.Session {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.Controller3A getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphProcessor getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.FrameCaptureQueue getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Token getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl Camera2StreamConfigurationMap;

    public CameraGraphSessionImpl(androidx.camera.camera2.pipe.core.Token token, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, androidx.camera.camera2.pipe.graph.Controller3A controller3A, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl cameraGraphParametersImpl, androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameCaptureQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphParametersImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphRequestListenersImpl, "");
        this.getHighResolutionOutputSizeshNQ4ISI = token;
        this.getHighSpeedVideoSizes = graphProcessor;
        this.getHighSpeedVideoFpsRanges = controller3A;
        this.getHighSpeedVideoFpsRangesFor = frameCaptureQueue;
        this.Camera2StreamConfigurationMap = cameraGraphParametersImpl;
        this.getOutputMinFrameDuration = cameraGraphRequestListenersImpl;
        this.getHighSpeedVideoSizesFor = androidx.camera.camera2.pipe.graph.CameraGraphSessionImplKt.getCameraGraphSessionIds().incrementAndGet();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void submit(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call submit on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.submit(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void submit(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call submit on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (requests.isEmpty()) {
            throw new java.lang.IllegalStateException("Cannot call submit with an empty list of Requests!".toString());
        }
        this.getHighSpeedVideoSizes.submit(requests);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final androidx.camera.camera2.pipe.FrameCapture capture(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl enqueue = this.getHighSpeedVideoFpsRangesFor.enqueue(request);
        submit(request);
        return enqueue;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.util.List<androidx.camera.camera2.pipe.FrameCapture> capture(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        java.util.List<androidx.camera.camera2.pipe.FrameCapture> enqueue = this.getHighSpeedVideoFpsRangesFor.enqueue(requests);
        submit(requests);
        return enqueue;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void startRepeating(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call startRepeating on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void abort() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call abort on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.abort();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final void stopRepeating() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call stopRepeating on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.setRepeatingRequest(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.flush();
        java.util.List<androidx.camera.camera2.pipe.Request.Listener> fetchUpdatedListeners$camera_camera2_pipe = this.getOutputMinFrameDuration.fetchUpdatedListeners$camera_camera2_pipe();
        if (fetchUpdatedListeners$camera_camera2_pipe != null) {
            this.getHighSpeedVideoSizes.updateRequestListeners(fetchUpdatedListeners$camera_camera2_pipe);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.release();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo279update3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call update3A on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return androidx.camera.camera2.pipe.graph.Controller3A.m907update3A169HPGg$default(this.getHighSpeedVideoFpsRanges, aeMode, afMode, awbMode, null, aeRegions, afRegions, awbRegions, 8, null);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo278submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call submit3A on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.m910submit3AydBZfZg(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call setTorchOn on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo277setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call setTorchOff on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.m909setTorchOffNqN7i0k(aeMode);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    /* renamed from: lock3A--tS25XM */
    public final java.lang.Object mo386lock3AtS25XM(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode2, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function12, int i, long j, long j2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call lock3A on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.m908lock3AQz1gx5w(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, function1, function12, i, kotlin.coroutines.jvm.internal.Boxing.boxLong(j), kotlin.coroutines.jvm.internal.Boxing.boxLong(j2), continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object unlock3A(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call unlock3A on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.unlock3A(bool, bool2, bool3, function1, i, kotlin.coroutines.jvm.internal.Boxing.boxLong(j));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object lock3AForCapture(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call lock3AForCapture on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.lock3AForCapture(function1, i, j);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object lock3AForCapture(boolean z, boolean z2, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call lock3AForCapture on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.lock3AForCapture(z, z2, i, j);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public final java.lang.Object unlock3APostCapture(boolean z, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getReleased()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call unlock3APostCapture on ");
            sb.append(this);
            sb.append(" after close.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.unlock3APostCapture(z);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraGraph.Session-");
        sb.append(this.getHighSpeedVideoSizesFor);
        return sb.toString();
    }
}
