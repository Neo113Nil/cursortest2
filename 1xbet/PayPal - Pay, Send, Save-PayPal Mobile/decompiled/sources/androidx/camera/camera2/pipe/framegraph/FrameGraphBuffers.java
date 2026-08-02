package androidx.camera.camera2.pipe.framegraph;

@androidx.camera.camera2.pipe.config.FrameGraphScope
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010."}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "Lkotlinx/coroutines/CoroutineScope;", "frameGraphCoroutineScope", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph;Lkotlinx/coroutines/CoroutineScope;)V", "", "Landroidx/camera/camera2/pipe/StreamId;", "streams", "", "", "parameters", "", "capacity", "Landroidx/camera/camera2/pipe/FrameBuffer;", "attach$camera_camera2_pipe", "(Ljava/util/Set;Ljava/util/Map;I)Landroidx/camera/camera2/pipe/FrameBuffer;", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl;", "frameBuffer", "", "detach$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "invalidate", "()V", "Landroidx/camera/camera2/pipe/FrameReference;", "frameReference", "onFrameStarted", "(Landroidx/camera/camera2/pipe/FrameReference;)V", "Landroidx/camera/camera2/pipe/CameraGraph;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "", "Ljava/util/List;", "", "getInputSizeshNQ4ISI", "Ljava/util/Set;", "", "Ljava/util/Map;", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameGraphBuffers implements androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl> getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.pipe.CameraGraph getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.Map<java.lang.Object, java.lang.Object> getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Set<androidx.camera.camera2.pipe.StreamId> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FrameGraphBuffers(androidx.camera.camera2.pipe.CameraGraph cameraGraph, @androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraGraph;
        this.getHighSpeedVideoSizes = coroutineScope;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
        this.getInputFormats = new java.util.LinkedHashMap();
    }

    public final androidx.camera.camera2.pipe.FrameBuffer attach$camera_camera2_pipe(java.util.Set<androidx.camera.camera2.pipe.StreamId> streams, java.util.Map<java.lang.Object, ? extends java.lang.Object> parameters, int capacity) {
        boolean highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streams, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        androidx.camera.camera2.pipe.framegraph.FrameBufferImpl frameBufferImpl = new androidx.camera.camera2.pipe.framegraph.FrameBufferImpl(this, streams, parameters, capacity);
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.add(frameBufferImpl);
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (highResolutionOutputSizeshNQ4ISI) {
            invalidate();
        }
        return frameBufferImpl;
    }

    public final void detach$camera_camera2_pipe(androidx.camera.camera2.pipe.framegraph.FrameBufferImpl frameBuffer) {
        boolean highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.remove(frameBuffer);
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (highResolutionOutputSizeshNQ4ISI) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r1.put(r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        synchronized (this.Camera2StreamConfigurationMap) {
            for (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl frameBufferImpl : this.getHighSpeedVideoFpsRangesFor) {
                linkedHashSet.addAll(frameBufferImpl.getStreams());
                for (java.util.Map.Entry<java.lang.Object, java.lang.Object> entry : frameBufferImpl.getParameters().entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (!(key instanceof android.hardware.camera2.CaptureRequest.Key) && !(key instanceof androidx.camera.camera2.pipe.Metadata.Key)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Invalid type for ");
                        sb.append(entry.getKey());
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    if (linkedHashMap.containsKey(key) && !kotlin.jvm.internal.Intrinsics.areEqual(linkedHashMap.get(key), value)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Conflicting parameter values, ");
                        sb2.append(key);
                        sb2.append(" and ");
                        sb2.append(this.getInputFormats.get(key));
                        sb2.append(" have different values.");
                        throw new java.lang.IllegalStateException(sb2.toString());
                    }
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(linkedHashSet, this.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(linkedHashMap, this.getInputFormats)) {
                z = false;
                this.getHighSpeedVideoFpsRanges = linkedHashSet;
                this.getInputFormats = linkedHashMap;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            z = true;
            this.getHighSpeedVideoFpsRanges = linkedHashSet;
            this.getInputFormats = linkedHashMap;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        return z;
    }

    public final void invalidate() {
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            this.getHighResolutionOutputSizeshNQ4ISI.useSessionIn(this.getHighSpeedVideoSizes, new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$3(this, null));
        } else {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            this.getHighResolutionOutputSizeshNQ4ISI.useSessionIn(this.getHighSpeedVideoSizes, new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$2(null));
        }
    }

    @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
    public final void onFrameStarted(androidx.camera.camera2.pipe.FrameReference frameReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            java.util.Iterator<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                it.next().onFrameStarted(frameReference);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
