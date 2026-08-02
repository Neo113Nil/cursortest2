package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\r\u0010#\u001a\u00020\u001bH\u0000¢\u0006\u0002\b$J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00148\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "streamGraphImpl", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "cameraController", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/pipe/CameraController;", "surfaceManager", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "imageSources", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroidx/camera/camera2/pipe/media/ImageSource;", "<init>", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/CameraSurfaceManager;Ljava/util/Map;)V", "lock", "", "surfaceMap", "", "Landroid/view/Surface;", "surfaceUsageMap", "shouldRegisterSurfaces", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "set", "", "streamId", "surface", "set-NYG5g8E", "(ILandroid/view/Surface;)V", "unregisterAllSurfaces", "registerAllSurfaces", "close", "maybeUpdateSurfaces", "maybeUpdateSurfaces$camera_camera2_pipe", "buildSurfaceMap", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurfaceGraph implements androidx.camera.camera2.pipe.SurfaceTracker, java.lang.AutoCloseable {
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.media.ImageSource> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> getHighSpeedVideoSizesFor;
    private final java.util.Map<android.view.Surface, java.lang.AutoCloseable> getInputFormats;
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl getOutputFormats;
    private final androidx.camera.camera2.pipe.CameraSurfaceManager getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceGraph(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> provider, androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends androidx.camera.camera2.pipe.media.ImageSource> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSurfaceManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getOutputFormats = streamGraphImpl;
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getOutputMinFrameDuration = cameraSurfaceManager;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((androidx.camera.camera2.pipe.media.ImageSource) entry.getValue()).getSurface());
        }
        this.getHighSpeedVideoSizesFor = linkedHashMap;
        this.getInputFormats = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizes = true;
    }

    /* renamed from: set-NYG5g8E, reason: not valid java name */
    public final void m952setNYG5g8E(int streamId, android.view.Surface surface) {
        java.lang.AutoCloseable autoCloseable;
        if (this.getHighResolutionOutputSizeshNQ4ISI.keySet().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot configure surface for ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId));
            sb.append(", it is permanently assigned to ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId)));
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges) {
                if (surface != null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId);
                }
                return;
            }
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
                if (surface != null) {
                    androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId);
                } else {
                    androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId);
                }
            }
            if (surface == null) {
                android.view.Surface remove = this.getHighSpeedVideoSizesFor.remove(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
                if (this.getHighSpeedVideoSizes && remove != null) {
                    autoCloseable = this.getInputFormats.remove(remove);
                }
                autoCloseable = null;
            } else {
                android.view.Surface surface2 = this.getHighSpeedVideoSizesFor.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
                this.getHighSpeedVideoSizesFor.put(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId), surface);
                if (this.getHighSpeedVideoSizes && !kotlin.jvm.internal.Intrinsics.areEqual(surface2, surface)) {
                    if (this.getInputFormats.containsKey(surface)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Surface (");
                        sb2.append(surface);
                        sb2.append(") is already in use!");
                        throw new java.lang.IllegalStateException(sb2.toString().toString());
                    }
                    autoCloseable = (java.lang.AutoCloseable) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getInputFormats).remove(surface2);
                    this.getInputFormats.put(surface, this.getOutputMinFrameDuration.registerSurface$camera_camera2_pipe(surface));
                }
                autoCloseable = null;
            }
            maybeUpdateSurfaces$camera_camera2_pipe();
            if (autoCloseable != null) {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.SurfaceTracker
    public final void unregisterAllSurfaces() {
        java.util.List list;
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoSizes = false;
            list = kotlin.collections.CollectionsKt.toList(this.getInputFormats.values());
            this.getInputFormats.clear();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m(it.next());
        }
    }

    @Override // androidx.camera.camera2.pipe.SurfaceTracker
    public final void registerAllSurfaces() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            for (android.view.Surface surface : this.getHighSpeedVideoSizesFor.values()) {
                this.getInputFormats.put(surface, this.getOutputMinFrameDuration.registerSurface$camera_camera2_pipe(surface));
            }
            this.getHighSpeedVideoSizes = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizesFor.clear();
            java.util.List list = kotlin.collections.CollectionsKt.toList(this.getInputFormats.values());
            this.getInputFormats.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m(it.next());
            }
        }
    }

    public final void maybeUpdateSurfaces$camera_camera2_pipe() {
        java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI.isEmpty()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.get().updateSurfaceMap(highResolutionOutputSizeshNQ4ISI);
    }

    private final java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.Camera2StreamConfigurationMap) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig : this.getOutputFormats.getOutputConfigs$camera_camera2_pipe()) {
                for (androidx.camera.camera2.pipe.CameraStream cameraStream : outputConfig.getStreamBuilder$camera_camera2_pipe()) {
                    android.view.Surface surface = this.getHighSpeedVideoSizesFor.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream.getId()));
                    if (surface == null) {
                        if (!outputConfig.getDeferrable()) {
                            return kotlin.collections.MapsKt.emptyMap();
                        }
                    } else {
                        linkedHashMap.put(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream.getId()), surface);
                    }
                }
            }
            return linkedHashMap;
        }
    }
}
