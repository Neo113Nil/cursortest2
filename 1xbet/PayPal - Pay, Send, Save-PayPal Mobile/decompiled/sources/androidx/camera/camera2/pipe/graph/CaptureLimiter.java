package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR$\u0010#\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/camera/camera2/pipe/graph/CaptureLimiter;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "", "requestsUntilActive", "<init>", "(J)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "onStopRepeating", "()V", "onGraphStopped", "onGraphShutdown", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicLong;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicLong;", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getGraphLoop", "()Landroidx/camera/camera2/pipe/graph/GraphLoop;", "setGraphLoop", "(Landroidx/camera/camera2/pipe/graph/GraphLoop;)V", "graphLoop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureLimiter implements androidx.camera.camera2.pipe.Request.Listener, androidx.camera.camera2.pipe.graph.GraphLoop.Listener {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicLong getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.graph.GraphLoop getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onStopRepeating() {
    }

    public CaptureLimiter(long j) {
        this.getHighSpeedVideoFpsRanges = j;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(0L);
    }

    public final androidx.camera.camera2.pipe.graph.GraphLoop getGraphLoop() {
        androidx.camera.camera2.pipe.graph.GraphLoop graphLoop = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(graphLoop);
        return graphLoop;
    }

    public final void setGraphLoop(androidx.camera.camera2.pipe.graph.GraphLoop graphLoop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphLoop, "");
        if (this.getHighSpeedVideoSizes != null) {
            throw new java.lang.IllegalStateException("GraphLoop has already been set!".toString());
        }
        this.getHighSpeedVideoSizes = graphLoop;
        graphLoop.setCaptureProcessingEnabled(false);
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            long unused = this.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo36onCompleteCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
        long value;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlinx.atomicfu.AtomicLong atomicLong = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = atomicLong.getValue();
            j = value != -1 ? 1 + value : -1L;
        } while (!atomicLong.compareAndSet(value, j));
        if (j == this.getHighSpeedVideoFpsRanges) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                androidx.camera.camera2.pipe.graph.GraphLoop unused = this.getHighSpeedVideoSizes;
            }
            getGraphLoop().setCaptureProcessingEnabled(true);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphStopped() {
        long value;
        kotlinx.atomicfu.AtomicLong atomicLong = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = atomicLong.getValue();
        } while (!atomicLong.compareAndSet(value, value != -1 ? 0L : -1L));
        getGraphLoop().setCaptureProcessingEnabled(false);
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            getGraphLoop();
            long unused = this.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphShutdown() {
        this.getHighSpeedVideoFpsRangesFor.setValue(-1L);
        getGraphLoop().setCaptureProcessingEnabled(false);
    }
}
