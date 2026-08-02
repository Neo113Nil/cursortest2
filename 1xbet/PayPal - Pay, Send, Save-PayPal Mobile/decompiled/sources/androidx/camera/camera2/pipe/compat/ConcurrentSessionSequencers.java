package androidx.camera.camera2.pipe.compat;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "concurrentCameraGraphs", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "getSequencer", "(Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;)Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConcurrentSessionSequencers {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.ConcurrentCameraGraphs, androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();

    @javax.inject.Inject
    public ConcurrentSessionSequencers() {
    }

    public final androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer getSequencer(androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs) {
        androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer concurrentSessionSequencer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentCameraGraphs, "");
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(concurrentCameraGraphs)) {
                this.getHighSpeedVideoFpsRanges.remove(cameraGraphId);
                java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> cameraGraphIds = concurrentCameraGraphs.getCameraGraphIds();
                if (!(cameraGraphIds instanceof java.util.Collection) || !cameraGraphIds.isEmpty()) {
                    java.util.Iterator<T> it = cameraGraphIds.iterator();
                    while (it.hasNext()) {
                        if (this.getHighSpeedVideoFpsRanges.contains((androidx.camera.camera2.pipe.CameraGraphId) it.next())) {
                            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer concurrentSessionSequencer2 = this.getHighResolutionOutputSizeshNQ4ISI.get(concurrentCameraGraphs);
                            if (concurrentSessionSequencer2 == null) {
                                throw new java.lang.IllegalStateException("Required value was null.".toString());
                            }
                            concurrentSessionSequencer = concurrentSessionSequencer2;
                            return concurrentSessionSequencer;
                        }
                    }
                }
                androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(concurrentCameraGraphs);
                if (remove == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                concurrentSessionSequencer = remove;
                return concurrentSessionSequencer;
            }
            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer concurrentSessionSequencer3 = new androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer();
            this.getHighResolutionOutputSizeshNQ4ISI.put(concurrentCameraGraphs, concurrentSessionSequencer3);
            this.getHighSpeedVideoFpsRanges.addAll(kotlin.collections.SetsKt.minus(concurrentCameraGraphs.getCameraGraphIds(), cameraGraphId));
            return concurrentSessionSequencer3;
        }
    }
}
