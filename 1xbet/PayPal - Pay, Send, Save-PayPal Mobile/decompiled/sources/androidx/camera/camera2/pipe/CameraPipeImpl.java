package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010\u001e\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010'J\u0018\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010;R\u0016\u00107\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010>R$\u0010E\u001a\u00020?2\u0006\u0010@\u001a\u00020?8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipeImpl;", "Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/camera2/pipe/config/CameraPipeComponent;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "<init>", "(Landroidx/camera/camera2/pipe/config/CameraPipeComponent;)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "Landroidx/camera/camera2/pipe/CameraGraph;", "create", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraGraph;", "createCameraGraph", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "createCameraGraphs", "(Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;)Ljava/util/List;", "p0", "Landroidx/camera/camera2/pipe/CameraGraphId;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraphId;)Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/FrameGraph$Config;", "frameGraphConfig", "Landroidx/camera/camera2/pipe/FrameGraph;", "createFrameGraph", "(Landroidx/camera/camera2/pipe/FrameGraph$Config;)Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/FrameGraph$ConcurrentConfig;", "frameGraphConfigs", "createFrameGraphs", "(Landroidx/camera/camera2/pipe/FrameGraph$ConcurrentConfig;)Ljava/util/List;", "getHighSpeedVideoSizes", "(Landroidx/camera/camera2/pipe/FrameGraph$Config;Landroidx/camera/camera2/pipe/CameraGraphId;)Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameras", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/CameraBackend;", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraBackend;", "graphConfig", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "", "prewarmIsConfigSupported", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)V", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/config/CameraPipeComponent;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "", "Z", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getGlobalAudioRestrictionMode-_b5Q8KE", "()I", "setGlobalAudioRestrictionMode-LwUUkyU", "(I)V", "globalAudioRestrictionMode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraPipeImpl implements androidx.camera.camera2.pipe.CameraPipe {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.config.CameraPipeComponent getHighResolutionOutputSizeshNQ4ISI;

    public CameraPipeImpl(androidx.camera.camera2.pipe.config.CameraPipeComponent cameraPipeComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeComponent, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraPipeComponent;
        this.Camera2StreamConfigurationMap = androidx.camera.camera2.pipe.CameraPipeKt.getCameraPipeIds().incrementAndGet();
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    @kotlin.Deprecated(message = "Use createCameraGraph instead.", replaceWith = @kotlin.ReplaceWith(expression = "createCameraGraph(config)", imports = {}))
    public final androidx.camera.camera2.pipe.CameraGraph create(androidx.camera.camera2.pipe.CameraGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return createCameraGraph(config);
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final androidx.camera.camera2.pipe.CameraGraph createCameraGraph(androidx.camera.camera2.pipe.CameraGraph.Config config) {
        androidx.camera.camera2.pipe.CameraGraph highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(config, androidx.camera.camera2.pipe.CameraGraphId.INSTANCE.nextId());
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final java.util.List<androidx.camera.camera2.pipe.CameraGraph> createCameraGraphs(androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig config) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            java.util.Iterator<androidx.camera.camera2.pipe.CameraGraph.Config> it = config.getGraphConfigs().iterator();
            while (it.hasNext()) {
                createMapBuilder.put(it.next(), androidx.camera.camera2.pipe.CameraGraphId.INSTANCE.nextId());
            }
            java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> graphConfigs = config.getGraphConfigs();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(graphConfigs, 10));
            java.util.Iterator<T> it2 = graphConfigs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(androidx.camera.camera2.pipe.CameraId.m392boximpl(((androidx.camera.camera2.pipe.CameraGraph.Config) it2.next()).m353getCameraDz_R5H8()));
            }
            androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs = new androidx.camera.camera2.pipe.ConcurrentCameraGraphs(kotlin.collections.CollectionsKt.toSet(build.values()), kotlin.collections.CollectionsKt.toSet(arrayList2));
            java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> graphConfigs2 = config.getGraphConfigs();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(graphConfigs2, 10));
            for (androidx.camera.camera2.pipe.CameraGraph.Config config2 : graphConfigs2) {
                config2.setConcurrentCameraGraphs$camera_camera2_pipe(concurrentCameraGraphs);
                java.lang.Object obj = build.get(config2);
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(config2, (androidx.camera.camera2.pipe.CameraGraphId) obj));
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    private final androidx.camera.camera2.pipe.CameraGraph getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.pipe.CameraGraph.Config p0, androidx.camera.camera2.pipe.CameraGraphId p1) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CXCP#CameraGraph-");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(p0.m353getCameraDz_R5H8()));
        try {
            android.os.Trace.beginSection(sb.toString());
            return this.getHighResolutionOutputSizeshNQ4ISI.cameraGraphComponentBuilder().cameraGraphConfigModule(new androidx.camera.camera2.pipe.config.CameraGraphConfigModule(p0, p1)).build().cameraGraph();
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final androidx.camera.camera2.pipe.FrameGraph createFrameGraph(androidx.camera.camera2.pipe.FrameGraph.Config frameGraphConfig) {
        androidx.camera.camera2.pipe.FrameGraph highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraphConfig, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            highSpeedVideoSizes = getHighSpeedVideoSizes(frameGraphConfig, androidx.camera.camera2.pipe.CameraGraphId.INSTANCE.nextId());
        }
        return highSpeedVideoSizes;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final java.util.List<androidx.camera.camera2.pipe.FrameGraph> createFrameGraphs(androidx.camera.camera2.pipe.FrameGraph.ConcurrentConfig frameGraphConfigs) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraphConfigs, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            java.util.Iterator<androidx.camera.camera2.pipe.FrameGraph.Config> it = frameGraphConfigs.getFrameGraphConfigs().iterator();
            while (it.hasNext()) {
                createMapBuilder.put(it.next(), androidx.camera.camera2.pipe.CameraGraphId.INSTANCE.nextId());
            }
            java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            java.util.List<androidx.camera.camera2.pipe.FrameGraph.Config> frameGraphConfigs2 = frameGraphConfigs.getFrameGraphConfigs();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(frameGraphConfigs2, 10));
            java.util.Iterator<T> it2 = frameGraphConfigs2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(androidx.camera.camera2.pipe.CameraId.m392boximpl(((androidx.camera.camera2.pipe.FrameGraph.Config) it2.next()).getCameraGraphConfig().m353getCameraDz_R5H8()));
            }
            androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs = new androidx.camera.camera2.pipe.ConcurrentCameraGraphs(kotlin.collections.CollectionsKt.toSet(build.values()), kotlin.collections.CollectionsKt.toSet(arrayList2));
            java.util.List<androidx.camera.camera2.pipe.FrameGraph.Config> frameGraphConfigs3 = frameGraphConfigs.getFrameGraphConfigs();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(frameGraphConfigs3, 10));
            for (androidx.camera.camera2.pipe.FrameGraph.Config config : frameGraphConfigs3) {
                config.getCameraGraphConfig().setConcurrentCameraGraphs$camera_camera2_pipe(concurrentCameraGraphs);
                java.lang.Object obj = build.get(config);
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                arrayList3.add(getHighSpeedVideoSizes(config, (androidx.camera.camera2.pipe.CameraGraphId) obj));
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    private final androidx.camera.camera2.pipe.FrameGraph getHighSpeedVideoSizes(androidx.camera.camera2.pipe.FrameGraph.Config p0, androidx.camera.camera2.pipe.CameraGraphId p1) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CXCP#CreateFrameGraph-");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(p0.getCameraGraphConfig().m353getCameraDz_R5H8()));
        try {
            android.os.Trace.beginSection(sb.toString());
            return this.getHighResolutionOutputSizeshNQ4ISI.frameGraphComponentBuilder().frameGraphConfigModule(new androidx.camera.camera2.pipe.config.FrameGraphConfigModule(this.getHighResolutionOutputSizeshNQ4ISI.cameraGraphComponentBuilder().cameraGraphConfigModule(new androidx.camera.camera2.pipe.config.CameraGraphConfigModule(p0.getCameraGraphConfig(), p1)).build(), p0)).build().frameGraph();
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final androidx.camera.camera2.pipe.CameraDevices cameras() {
        androidx.camera.camera2.pipe.CameraDevices cameras;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            cameras = this.getHighResolutionOutputSizeshNQ4ISI.cameras();
        }
        return cameras;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager() {
        androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            cameraSurfaceManager = this.getHighResolutionOutputSizeshNQ4ISI.cameraSurfaceManager();
        }
        return cameraSurfaceManager;
    }

    private final androidx.camera.camera2.pipe.CameraBackend getHighSpeedVideoSizes(androidx.camera.camera2.pipe.CameraGraph.Config p0) {
        androidx.camera.camera2.pipe.CameraBackend cameraBackend;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            androidx.camera.camera2.pipe.CameraBackendFactory customCameraBackend = p0.getCustomCameraBackend();
            if (customCameraBackend != null) {
                cameraBackend = customCameraBackend.create(this.getHighResolutionOutputSizeshNQ4ISI.cameraContext());
            } else {
                java.lang.String m354getCameraBackendIdAKmI2lo = p0.m354getCameraBackendIdAKmI2lo();
                if (m354getCameraBackendIdAKmI2lo != null) {
                    androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8 = this.getHighResolutionOutputSizeshNQ4ISI.cameraBackends().mo239getSG3A4s8(m354getCameraBackendIdAKmI2lo);
                    if (mo239getSG3A4s8 == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to initialize ");
                        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(m354getCameraBackendIdAKmI2lo));
                        sb.append(" from ");
                        sb.append(p0);
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    cameraBackend = mo239getSG3A4s8;
                } else {
                    cameraBackend = this.getHighResolutionOutputSizeshNQ4ISI.cameraBackends().getDefault();
                }
            }
        }
        return cameraBackend;
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: isConfigSupported-NpXggIU */
    public final java.lang.Object mo417isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph.Config config, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> continuation) {
        androidx.camera.camera2.pipe.CameraBackend highSpeedVideoSizes = getHighSpeedVideoSizes(config);
        if (highSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        return highSpeedVideoSizes.mo224isConfigSupportedNpXggIU(config, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final void prewarmIsConfigSupported(androidx.camera.camera2.pipe.CameraGraph.Config graphConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
        androidx.camera.camera2.pipe.CameraBackend highSpeedVideoSizes = getHighSpeedVideoSizes(graphConfig);
        if (highSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        highSpeedVideoSizes.mo227prewarmIsConfigSupportedEfqyGwQ(graphConfig.m353getCameraDz_R5H8());
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: getGlobalAudioRestrictionMode-_b5Q8KE */
    public final int mo416getGlobalAudioRestrictionMode_b5Q8KE() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                androidx.camera.camera2.pipe.AudioRestrictionMode mo773getGlobalAudioRestrictionMode4o0Og1A = this.getHighResolutionOutputSizeshNQ4ISI.cameraAudioRestrictionController().mo773getGlobalAudioRestrictionMode4o0Og1A();
                return mo773getGlobalAudioRestrictionMode4o0Og1A != null ? mo773getGlobalAudioRestrictionMode4o0Og1A.m190unboximpl() : androidx.camera.camera2.pipe.AudioRestrictionMode.INSTANCE.m191getAUDIO_RESTRICTION_NONE_b5Q8KE();
            }
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            return androidx.camera.camera2.pipe.AudioRestrictionMode.INSTANCE.m191getAUDIO_RESTRICTION_NONE_b5Q8KE();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    /* renamed from: setGlobalAudioRestrictionMode-LwUUkyU */
    public final void mo418setGlobalAudioRestrictionModeLwUUkyU(int i) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getHighResolutionOutputSizeshNQ4ISI.cameraAudioRestrictionController().mo774setGlobalAudioRestrictionMode3NUV5dA(androidx.camera.camera2.pipe.AudioRestrictionMode.m184boximpl(i));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraPipe
    public final void shutdown() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this.getHighResolutionOutputSizeshNQ4ISI.cameraPipeLifetime().shutdown();
            this.getHighSpeedVideoFpsRangesFor = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraPipe-");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }
}
