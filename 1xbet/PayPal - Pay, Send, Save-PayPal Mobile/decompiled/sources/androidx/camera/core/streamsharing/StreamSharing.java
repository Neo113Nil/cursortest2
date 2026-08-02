package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class StreamSharing extends androidx.camera.core.UseCase {
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener Camera2StreamConfigurationMap;
    androidx.camera.core.impl.SessionConfig.Builder getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRanges;
    androidx.camera.core.processing.SurfaceProcessorNode getHighSpeedVideoFpsRangesFor;
    private androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoSizes;
    private androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoSizesFor;
    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode getInputFormats;
    private final androidx.camera.core.streamsharing.StreamSharingConfig getInputSizeshNQ4ISI;
    private androidx.camera.core.processing.SurfaceEdge getOutputFormats;
    private final androidx.camera.core.CompositionSettings getOutputMinFrameDuration;
    private androidx.camera.core.processing.SurfaceEdge getOutputMinFrameDurationlomOqCM;
    private androidx.camera.core.processing.SurfaceProcessorNode getOutputSizes;
    private final androidx.camera.core.CompositionSettings getOutputSizeshNQ4ISI;
    private androidx.camera.core.processing.SurfaceProcessorNode getOutputStallDuration;
    private androidx.camera.core.processing.SurfaceEdge getOutputStallDurationlomOqCM;
    private final androidx.camera.core.streamsharing.VirtualCameraAdapter isOutputSupportedFor;
    private androidx.camera.core.processing.SurfaceEdge unwrapAs;

    interface Control {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> jpegSnapshot(int i, int i2);
    }

    private static androidx.camera.core.streamsharing.StreamSharingConfig getHighSpeedVideoFpsRangesFor(java.util.Set<androidx.camera.core.UseCase> set) {
        androidx.camera.core.impl.MutableConfig mutableConfig = new androidx.camera.core.streamsharing.StreamSharingBuilder().getMutableConfig();
        mutableConfig.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.UseCase useCase : set) {
            if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                arrayList.add(useCase.getCurrentConfig().getCaptureType());
            }
        }
        mutableConfig.insertOption(androidx.camera.core.streamsharing.StreamSharingConfig.getHighSpeedVideoFpsRangesFor, arrayList);
        mutableConfig.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, 2);
        mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, androidx.camera.core.impl.StreamUseCase.PREVIEW_VIDEO_STILL);
        return new androidx.camera.core.streamsharing.StreamSharingConfig(androidx.camera.core.impl.OptionsBundle.from(mutableConfig));
    }

    public StreamSharing(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2, java.util.Set<androidx.camera.core.UseCase> set, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        super(getHighSpeedVideoFpsRangesFor(set));
        this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(set);
        this.getOutputMinFrameDuration = compositionSettings;
        this.getOutputSizeshNQ4ISI = compositionSettings2;
        this.isOutputSupportedFor = new androidx.camera.core.streamsharing.VirtualCameraAdapter(cameraInternal, cameraInternal2, set, useCaseConfigFactory, new androidx.camera.core.streamsharing.StreamSharing.Control() { // from class: androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda2
            @Override // androidx.camera.core.streamsharing.StreamSharing.Control
            public final com.google.common.util.concurrent.ListenableFuture jpegSnapshot(int i, int i2) {
                androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = androidx.camera.core.streamsharing.StreamSharing.this.getHighSpeedVideoFpsRangesFor;
                return surfaceProcessorNode != null ? surfaceProcessorNode.getSurfaceProcessor().snapshot(i, i2) : androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.Exception("Failed to take picture: pipeline is not ready."));
            }
        });
        updateFeatureGroup(set);
    }

    public void updateFeatureGroup(java.util.Set<androidx.camera.core.UseCase> set) {
        setFeatureGroup(set.iterator().next().getFeatureGroup());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(this.getInputSizeshNQ4ISI.getCaptureType(), 1);
        if (z) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, this.getInputSizeshNQ4ISI.getGetHighSpeedVideoFpsRanges());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return new androidx.camera.core.streamsharing.StreamSharingBuilder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector;
        androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.isOutputSupportedFor;
        androidx.camera.core.impl.MutableConfig mutableConfig = builder.getMutableConfig();
        androidx.camera.core.streamsharing.ResolutionsMerger resolutionsMerger = virtualCameraAdapter.getOutputFormats;
        java.util.List<android.util.Size> supportedResolutions = resolutionsMerger.getHighSpeedVideoFpsRanges.getSupportedResolutions(34);
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = resolutionsMerger.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.impl.UseCaseConfig<?> next = it.next();
            if (!next.isHighResolutionDisabled(false) && (next instanceof androidx.camera.core.impl.ImageOutputConfig) && (resolutionSelector = ((androidx.camera.core.impl.ImageOutputConfig) next).getResolutionSelector(null)) != null && resolutionSelector.getAllowedResolutionMode() == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(supportedResolutions);
                arrayList.addAll(resolutionsMerger.getHighSpeedVideoFpsRanges.getSupportedHighResolutions(34));
                supportedResolutions = arrayList;
                break;
            }
        }
        java.util.List list = (java.util.List) mutableConfig.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
        if (list != null) {
            java.util.Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it2.next();
                    if (((java.lang.Integer) pair.first).equals(34)) {
                        supportedResolutions = java.util.Arrays.asList((android.util.Size[]) pair.second);
                        break;
                    }
                } else {
                    supportedResolutions = new java.util.ArrayList<>();
                    break;
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it3 = resolutionsMerger.Camera2StreamConfigurationMap.iterator();
        while (it3.hasNext()) {
            hashSet.addAll(resolutionsMerger.getHighSpeedVideoFpsRanges(it3.next()));
        }
        java.util.Iterator it4 = hashSet.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            if (!androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio((android.util.Size) it4.next(), resolutionsMerger.getHighSpeedVideoFpsRangesFor)) {
                arrayList2.addAll(resolutionsMerger.getHighResolutionOutputSizeshNQ4ISI(resolutionsMerger.getHighSpeedVideoSizes, supportedResolutions, false));
                break;
            }
        }
        int size = arrayList2.size();
        if (!resolutionsMerger.Camera2StreamConfigurationMap.isEmpty()) {
            java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it5 = resolutionsMerger.Camera2StreamConfigurationMap.iterator();
            loop4: while (true) {
                if (!it5.hasNext()) {
                    size = 0;
                    break;
                }
                java.util.Iterator<android.util.Size> it6 = resolutionsMerger.getHighSpeedVideoFpsRanges(it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    boolean hasMatchingAspectRatio = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(it6.next(), resolutionsMerger.getHighSpeedVideoFpsRangesFor);
                    if (hasMatchingAspectRatio) {
                        z = true;
                    }
                    if (z2 && hasMatchingAspectRatio) {
                        break loop4;
                    }
                    if (!hasMatchingAspectRatio) {
                        z2 = true;
                    }
                }
            }
        }
        arrayList2.addAll(size, resolutionsMerger.getHighResolutionOutputSizeshNQ4ISI(resolutionsMerger.getHighSpeedVideoFpsRangesFor, supportedResolutions, false));
        arrayList2.addAll(resolutionsMerger.getHighSpeedVideoFpsRanges(supportedResolutions, false));
        if (arrayList2.isEmpty()) {
            androidx.camera.core.Logger.w("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList2.addAll(resolutionsMerger.getHighSpeedVideoFpsRanges(supportedResolutions, true));
        }
        androidx.camera.core.Logger.d("ResolutionsMerger", "Parent resolutions: ".concat(java.lang.String.valueOf(arrayList2)));
        mutableConfig.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList2);
        mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(androidx.camera.core.streamsharing.VirtualCameraAdapter.getHighResolutionOutputSizeshNQ4ISI(virtualCameraAdapter.getHighResolutionOutputSizeshNQ4ISI)));
        androidx.camera.core.DynamicRange resolveDynamicRange = androidx.camera.core.streamsharing.DynamicRangeUtils.resolveDynamicRange(virtualCameraAdapter.getHighResolutionOutputSizeshNQ4ISI);
        if (resolveDynamicRange == null) {
            throw new java.lang.IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        mutableConfig.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, resolveDynamicRange);
        mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, androidx.camera.core.streamsharing.VirtualCameraAdapter.getHighSpeedVideoFpsRanges(virtualCameraAdapter.getHighResolutionOutputSizeshNQ4ISI));
        java.util.Iterator<androidx.camera.core.UseCase> it7 = virtualCameraAdapter.getHighSpeedVideoFpsRanges.iterator();
        while (it7.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig useCaseConfig = (androidx.camera.core.impl.UseCaseConfig) java.util.Objects.requireNonNull(virtualCameraAdapter.getHighSpeedVideoFpsRangesFor.get(it7.next()));
            if (useCaseConfig.getVideoStabilizationMode() != 0) {
                mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(useCaseConfig.getVideoStabilizationMode()));
            }
            if (useCaseConfig.getPreviewStabilizationMode() != 0) {
                mutableConfig.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(useCaseConfig.getPreviewStabilizationMode()));
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onSuggestedStreamSpecUpdated: primaryStreamSpec = ");
        sb.append(streamSpec);
        sb.append(", secondaryStreamSpec ");
        sb.append(streamSpec2);
        androidx.camera.core.Logger.d("StreamSharing", sb.toString());
        updateSessionConfig(getHighResolutionOutputSizeshNQ4ISI(getCameraId(), getSecondaryCameraId(), getCurrentConfig(), streamSpec, streamSpec2));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        this.getHighSpeedVideoFpsRanges.addImplementationOptions(config);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRanges.build()});
        updateSessionConfig(m);
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        super.onBind();
        androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.isOutputSupportedFor;
        for (androidx.camera.core.UseCase useCase : virtualCameraAdapter.getHighSpeedVideoFpsRanges) {
            useCase.bindToCamera((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(virtualCameraAdapter.getHighSpeedVideoSizesFor.get(useCase)), null, null, useCase.getDefaultConfig(true, virtualCameraAdapter.getOutputStallDuration));
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        super.onUnbind();
        getHighSpeedVideoFpsRanges();
        androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.isOutputSupportedFor;
        for (androidx.camera.core.UseCase useCase : virtualCameraAdapter.getHighSpeedVideoFpsRanges) {
            useCase.unbindFromCamera((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(virtualCameraAdapter.getHighSpeedVideoSizesFor.get(useCase)));
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onSessionStart() {
        super.onSessionStart();
        java.util.Iterator<androidx.camera.core.UseCase> it = this.isOutputSupportedFor.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onSessionStart();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onSessionStop() {
        super.onSessionStop();
        java.util.Iterator<androidx.camera.core.UseCase> it = this.isOutputSupportedFor.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onSessionStop();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onCameraControlReady() {
        super.onCameraControlReady();
        java.util.Iterator<androidx.camera.core.UseCase> it = this.isOutputSupportedFor.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onCameraControlReady();
        }
    }

    public java.util.Set<androidx.camera.core.UseCase> getChildren() {
        return this.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.UseCase
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(3);
        return hashSet;
    }

    private java.util.List<androidx.camera.core.impl.SessionConfig> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        android.graphics.Rect rect;
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        androidx.camera.core.Preview preview;
        java.util.List<androidx.camera.core.impl.SessionConfig> m2;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (streamSpec2 == null) {
            androidx.camera.core.processing.SurfaceEdge highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, str2, useCaseConfig, streamSpec, null);
            androidx.camera.core.processing.SurfaceProcessorNode highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()), streamSpec);
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, highSpeedVideoSizes, false);
            m2 = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRanges.build()});
            return m2;
        }
        androidx.camera.core.processing.SurfaceEdge highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, str2, useCaseConfig, streamSpec, streamSpec2);
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = ((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getSecondaryCamera())).getHasTransform();
        android.util.Size resolution = streamSpec2.getResolution();
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new android.graphics.Rect(0, 0, resolution.getWidth(), resolution.getHeight());
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = new androidx.camera.core.processing.SurfaceEdge(3, 34, streamSpec2, sensorToBufferTransformMatrix, hasTransform, (android.graphics.Rect) java.util.Objects.requireNonNull(rect), getRelativeRotation((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getSecondaryCamera())), -1, isMirroringRequired((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getSecondaryCamera())));
        this.getOutputStallDurationlomOqCM = surfaceEdge;
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRanges(surfaceEdge, (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getSecondaryCamera()), true);
        androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM, useCaseConfig, streamSpec2);
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap, str, str2, useCaseConfig, streamSpec, streamSpec2);
        androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = this.getOutputMinFrameDurationlomOqCM;
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode dualSurfaceProcessorNode = new androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode(getCamera(), getSecondaryCamera(), androidx.camera.core.processing.concurrent.DualSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange(), this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI), "StreamSharing");
        this.getInputFormats = dualSurfaceProcessorNode;
        if (getEffect() != null) {
            boolean z = getViewPortCropRect() != null;
            androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.isOutputSupportedFor;
            int targetRotationInternal = getTargetRotationInternal();
            java.util.Iterator<androidx.camera.core.UseCase> it = virtualCameraAdapter.getHighSpeedVideoFpsRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    preview = null;
                    break;
                }
                androidx.camera.core.UseCase next = it.next();
                if (next instanceof androidx.camera.core.Preview) {
                    preview = (androidx.camera.core.Preview) next;
                    break;
                }
            }
            androidx.camera.core.Preview preview2 = (androidx.camera.core.Preview) androidx.core.util.Preconditions.checkNotNull(preview);
            this.getOutputFormats = dualSurfaceProcessorNode.transform(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In.of(highSpeedVideoFpsRanges2, surfaceEdge2, java.util.Arrays.asList(androidx.camera.core.processing.concurrent.DualOutConfig.of(virtualCameraAdapter.Camera2StreamConfigurationMap(preview2, virtualCameraAdapter.getOutputFormats, virtualCameraAdapter.getOutputMinFrameDuration, highSpeedVideoFpsRanges2, targetRotationInternal, z, false), virtualCameraAdapter.Camera2StreamConfigurationMap(preview2, virtualCameraAdapter.getOutputFormats, virtualCameraAdapter.getInputFormats, surfaceEdge2, targetRotationInternal, z, false))))).values().iterator().next();
            if (getEffect().getOutputOption() == 1) {
                this.getHighSpeedVideoSizesFor = this.getOutputFormats;
            } else {
                this.getHighSpeedVideoSizesFor = getHighSpeedVideoSizes((androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getOutputFormats), (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()));
            }
            androidx.camera.core.processing.SurfaceProcessorNode highSpeedVideoSizes2 = getHighSpeedVideoSizes((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()), streamSpec);
            this.getOutputStallDuration = highSpeedVideoSizes2;
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, highSpeedVideoSizes2, true);
        } else {
            boolean z2 = getViewPortCropRect() != null;
            androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter2 = this.isOutputSupportedFor;
            int targetRotationInternal2 = getTargetRotationInternal();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (androidx.camera.core.UseCase useCase : virtualCameraAdapter2.getHighSpeedVideoFpsRanges) {
                androidx.camera.core.processing.util.OutConfig Camera2StreamConfigurationMap2 = virtualCameraAdapter2.Camera2StreamConfigurationMap(useCase, virtualCameraAdapter2.getOutputFormats, virtualCameraAdapter2.getOutputMinFrameDuration, highSpeedVideoFpsRanges2, targetRotationInternal2, z2, false);
                androidx.camera.core.processing.util.OutConfig Camera2StreamConfigurationMap3 = virtualCameraAdapter2.Camera2StreamConfigurationMap(useCase, (androidx.camera.core.streamsharing.ResolutionsMerger) java.util.Objects.requireNonNull(virtualCameraAdapter2.getOutputSizeshNQ4ISI), (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(virtualCameraAdapter2.getInputFormats), surfaceEdge2, targetRotationInternal2, z2, false);
                virtualCameraAdapter2.getHighResolutionOutputSizeshNQ4ISI(useCase);
                hashMap.put(useCase, androidx.camera.core.processing.concurrent.DualOutConfig.of(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap3));
            }
            androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out transform = this.getInputFormats.transform(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In.of(highSpeedVideoFpsRanges2, surfaceEdge2, new java.util.ArrayList(hashMap.values())));
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((androidx.camera.core.UseCase) entry.getKey(), transform.get(entry.getValue()));
            }
            this.isOutputSupportedFor.getHighSpeedVideoSizes(hashMap2, this.isOutputSupportedFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges2, z2));
        }
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRanges.build(), this.getHighResolutionOutputSizeshNQ4ISI.build()});
        return m;
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode, boolean z) {
        boolean z2 = getViewPortCropRect() != null;
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> highSpeedVideoSizes = this.isOutputSupportedFor.getHighSpeedVideoSizes(surfaceEdge, getTargetRotationInternal(), z2, z);
        androidx.camera.core.processing.SurfaceProcessorNode.Out transform = surfaceProcessorNode.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(surfaceEdge, new java.util.ArrayList(highSpeedVideoSizes.values())));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> entry : highSpeedVideoSizes.entrySet()) {
            hashMap.put(entry.getKey(), transform.get(entry.getValue()));
        }
        this.isOutputSupportedFor.getHighSpeedVideoSizes(hashMap, this.isOutputSupportedFor.getHighSpeedVideoFpsRanges(surfaceEdge, z2));
    }

    private androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        android.graphics.Rect rect;
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = ((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera())).getHasTransform();
        android.util.Size resolution = streamSpec.getResolution();
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new android.graphics.Rect(0, 0, resolution.getWidth(), resolution.getHeight());
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = new androidx.camera.core.processing.SurfaceEdge(3, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, (android.graphics.Rect) java.util.Objects.requireNonNull(rect), getRelativeRotation((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera())), -1, isMirroringRequired((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera())));
        this.getHighSpeedVideoSizes = surfaceEdge;
        this.unwrapAs = getHighSpeedVideoFpsRanges(surfaceEdge, (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()), str2 != null);
        androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, useCaseConfig, streamSpec);
        this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap, str, str2, useCaseConfig, streamSpec, streamSpec2);
        return this.unwrapAs;
    }

    private androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(useCaseConfig, streamSpec.getResolution());
        getHighSpeedVideoSizes(createFrom);
        getHighSpeedVideoFpsRanges(streamSpec.getResolution(), createFrom);
        createFrom.addSurface(surfaceEdge.getDeferrableSurface(), streamSpec.getDynamicRange(), null, -1);
        createFrom.addRepeatingCameraCaptureCallback(this.isOutputSupportedFor.getInputSizeshNQ4ISI);
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        createFrom.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(createFrom, streamSpec);
        return createFrom;
    }

    private void getHighSpeedVideoSizes(androidx.camera.core.impl.SessionConfig.Builder builder) {
        java.util.Iterator<androidx.camera.core.UseCase> it = getChildren().iterator();
        int i = -1;
        while (it.hasNext()) {
            i = androidx.camera.core.impl.SessionConfig.getHigherPriorityTemplateType(i, it.next().getCurrentConfig().getDefaultSessionConfig().getTemplateType());
        }
        if (i != -1) {
            builder.setTemplateType(i);
        }
    }

    private void getHighSpeedVideoFpsRanges(android.util.Size size, androidx.camera.core.impl.SessionConfig.Builder builder) {
        java.util.Iterator<androidx.camera.core.UseCase> it = getChildren().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.SessionConfig build = androidx.camera.core.impl.SessionConfig.Builder.createFrom(it.next().getCurrentConfig(), size).build();
            builder.addAllRepeatingCameraCaptureCallbacks(build.getRepeatingCameraCaptureCallbacks());
            builder.addAllCameraCaptureCallbacks(build.getSingleCameraCaptureCallbacks());
            builder.addAllSessionStateCallbacks(build.getSessionStateCallbacks());
            builder.addAllDeviceStateCallbacks(build.getDeviceStateCallbacks());
            builder.addImplementationOptions(build.getImplementationOptions());
        }
    }

    private androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoFpsRanges(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.CameraInternal cameraInternal, boolean z) {
        return (getEffect() == null || getEffect().getTransformation() == 2 || z || getEffect().getOutputOption() == 1) ? surfaceEdge : getHighSpeedVideoSizes(surfaceEdge, cameraInternal);
    }

    private androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoSizes(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.CameraInternal cameraInternal) {
        this.getOutputSizes = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal(), "StreamSharing");
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        android.graphics.Rect highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(surfaceEdge);
        androidx.camera.core.processing.util.OutConfig of = androidx.camera.core.processing.util.OutConfig.of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), highSpeedVideoFpsRangesFor2, androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor), highSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(), true);
        return (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getOutputSizes.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(surfaceEdge, java.util.Collections.singletonList(of))).get(of));
    }

    private androidx.camera.core.processing.SurfaceProcessorNode getHighSpeedVideoSizes(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.StreamSpec streamSpec) {
        if (getEffect() != null && getEffect().getOutputOption() == 1) {
            androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal(), "StreamSharing");
            this.getOutputSizes = surfaceProcessorNode;
            return surfaceProcessorNode;
        }
        return new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange()), "StreamSharing");
    }

    private int getHighSpeedVideoFpsRangesFor() {
        if (((androidx.camera.core.CameraEffect) androidx.core.util.Preconditions.checkNotNull(getEffect())).getTransformation() == 1) {
            return getRelativeRotation((androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(getCamera()));
        }
        return 0;
    }

    private boolean getHighSpeedVideoSizes() {
        if (((androidx.camera.core.CameraEffect) androidx.core.util.Preconditions.checkNotNull(getEffect())).getTransformation() != 1) {
            return false;
        }
        androidx.camera.core.impl.CameraInternal cameraInternal = (androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(getCamera());
        return cameraInternal.isFrontFacing() && cameraInternal.getHasTransform();
    }

    private android.graphics.Rect getHighSpeedVideoFpsRangesFor(androidx.camera.core.processing.SurfaceEdge surfaceEdge) {
        if (((androidx.camera.core.CameraEffect) androidx.core.util.Preconditions.checkNotNull(getEffect())).getTransformation() == 1) {
            return androidx.camera.core.impl.utils.TransformUtils.sizeToRect(surfaceEdge.getStreamSpec().getResolution());
        }
        return surfaceEdge.getCropRect();
    }

    private void getHighSpeedVideoSizes(androidx.camera.core.impl.SessionConfig.Builder builder, final java.lang.String str, final java.lang.String str2, final androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, final androidx.camera.core.impl.StreamSpec streamSpec, final androidx.camera.core.impl.StreamSpec streamSpec2) {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.Camera2StreamConfigurationMap;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.streamsharing.StreamSharing.this.getHighSpeedVideoFpsRangesFor(str, str2, useCaseConfig, streamSpec, streamSpec2);
            }
        });
        this.Camera2StreamConfigurationMap = closeableErrorListener2;
        builder.setErrorListener(closeableErrorListener2);
    }

    final /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.UseCaseConfig useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        if (getCamera() == null) {
            return;
        }
        getHighSpeedVideoFpsRanges();
        updateSessionConfig(getHighResolutionOutputSizeshNQ4ISI(str, str2, useCaseConfig, streamSpec, streamSpec2));
        notifyReset();
        androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.isOutputSupportedFor;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        java.util.Iterator<androidx.camera.core.UseCase> it = virtualCameraAdapter.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            virtualCameraAdapter.onUseCaseReset(it.next());
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.Camera2StreamConfigurationMap;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.Camera2StreamConfigurationMap = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.getHighSpeedVideoSizes;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.getHighSpeedVideoSizes = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = this.getOutputStallDurationlomOqCM;
        if (surfaceEdge2 != null) {
            surfaceEdge2.close();
            this.getOutputStallDurationlomOqCM = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge3 = this.unwrapAs;
        if (surfaceEdge3 != null) {
            surfaceEdge3.close();
            this.unwrapAs = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge4 = this.getOutputMinFrameDurationlomOqCM;
        if (surfaceEdge4 != null) {
            surfaceEdge4.close();
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge5 = this.getOutputFormats;
        if (surfaceEdge5 != null) {
            surfaceEdge5.close();
            this.getOutputFormats = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge6 = this.getHighSpeedVideoSizesFor;
        if (surfaceEdge6 != null) {
            surfaceEdge6.close();
            this.getHighSpeedVideoSizesFor = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.getHighSpeedVideoFpsRangesFor;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode dualSurfaceProcessorNode = this.getInputFormats;
        if (dualSurfaceProcessorNode != null) {
            dualSurfaceProcessorNode.release();
            this.getInputFormats = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode2 = this.getOutputSizes;
        if (surfaceProcessorNode2 != null) {
            surfaceProcessorNode2.release();
            this.getOutputSizes = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode3 = this.getOutputStallDuration;
        if (surfaceProcessorNode3 != null) {
            surfaceProcessorNode3.release();
            this.getOutputStallDuration = null;
        }
    }

    public static java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes(androidx.camera.core.UseCase useCase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (isStreamSharing(useCase)) {
            java.util.Iterator<androidx.camera.core.UseCase> it = ((androidx.camera.core.streamsharing.StreamSharing) useCase).getChildren().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getCurrentConfig().getCaptureType());
            }
            return arrayList;
        }
        arrayList.add(useCase.getCurrentConfig().getCaptureType());
        return arrayList;
    }

    public static boolean isStreamSharing(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.streamsharing.StreamSharing;
    }

    public androidx.camera.core.processing.SurfaceEdge getSharingInputEdge() {
        return this.unwrapAs;
    }

    @Override // androidx.camera.core.UseCase
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        java.util.Set<androidx.camera.core.UseCase> children = getChildren();
        java.util.HashSet hashSet = null;
        if (children.isEmpty()) {
            return null;
        }
        java.util.Iterator<androidx.camera.core.UseCase> it = children.iterator();
        while (it.hasNext()) {
            java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = it.next().getSupportedDynamicRanges(cameraInfoInternal);
            if (supportedDynamicRanges != null) {
                if (hashSet == null) {
                    hashSet = new java.util.HashSet(supportedDynamicRanges);
                } else {
                    hashSet.retainAll(supportedDynamicRanges);
                }
            }
        }
        return hashSet;
    }
}
