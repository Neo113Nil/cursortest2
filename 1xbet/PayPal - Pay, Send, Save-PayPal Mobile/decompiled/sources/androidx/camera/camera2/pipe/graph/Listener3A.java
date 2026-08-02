package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0004R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/camera/camera2/pipe/graph/Listener3A;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "<init>", "()V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "", "onRequestSequenceCreated", "(Landroidx/camera/camera2/pipe/RequestMetadata;)V", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameMetadata;", "captureResult", "onPartialCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onPartialCaptureResult", "Landroidx/camera/camera2/pipe/FrameInfo;", "totalCaptureResult", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onTotalCaptureResult", "Landroidx/camera/camera2/pipe/graph/Result3AStateListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Landroidx/camera/camera2/pipe/graph/Result3AStateListener;)V", "removeListener", "Landroidx/camera/camera2/pipe/RequestNumber;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onStopRepeating", "onGraphStopped", "onGraphShutdown", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/CopyOnWriteArrayList;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Listener3A implements androidx.camera.camera2.pipe.Request.Listener, androidx.camera.camera2.pipe.graph.GraphLoop.Listener {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.camera.camera2.pipe.graph.Result3AStateListener> Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArrayList<>();

    @javax.inject.Inject
    public Listener3A() {
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceCreated(androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        java.util.Iterator<androidx.camera.camera2.pipe.graph.Result3AStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().mo927onRequestSequenceCreatedDThHKJ0(requestMetadata.mo108getRequestNumbermy6kx4g());
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public final void mo93onPartialCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameMetadata captureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        getHighResolutionOutputSizeshNQ4ISI(requestMetadata.mo108getRequestNumbermy6kx4g(), captureResult);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
        getHighResolutionOutputSizeshNQ4ISI(requestMetadata.mo108getRequestNumbermy6kx4g(), totalCaptureResult.getMetadata());
    }

    public final void addListener(androidx.camera.camera2.pipe.graph.Result3AStateListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap.add(listener);
    }

    public final void removeListener(androidx.camera.camera2.pipe.graph.Result3AStateListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap.remove(listener);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(long p0, androidx.camera.camera2.pipe.FrameMetadata p1) {
        java.util.Iterator<androidx.camera.camera2.pipe.graph.Result3AStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            androidx.camera.camera2.pipe.graph.Result3AStateListener next = it.next();
            if (next.mo928updatevoPkFw(p0, p1)) {
                this.Camera2StreamConfigurationMap.remove(next);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onStopRepeating() {
        java.util.Iterator<androidx.camera.camera2.pipe.graph.Result3AStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphStopped() {
        java.util.Iterator<androidx.camera.camera2.pipe.graph.Result3AStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphShutdown() {
        java.util.Iterator<androidx.camera.camera2.pipe.graph.Result3AStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }
}
