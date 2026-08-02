package androidx.camera.video;

/* loaded from: classes.dex */
public final class VideoCapture<T extends androidx.camera.video.VideoOutput> extends androidx.camera.core.UseCase {
    private static final androidx.camera.video.VideoCapture.Defaults getInputSizeshNQ4ISI = new androidx.camera.video.VideoCapture.Defaults();
    boolean Camera2StreamConfigurationMap;
    androidx.camera.video.VideoOutput.SourceState getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoFpsRanges;
    androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRangesFor;
    androidx.camera.video.StreamInfo getHighSpeedVideoSizes;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoSizesFor;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener getInputFormats;
    private androidx.camera.core.processing.SurfaceEdge getOutputFormats;
    private android.graphics.Rect getOutputMinFrameDuration;
    private final androidx.camera.core.impl.Observable.Observer<androidx.camera.video.StreamInfo> getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private java.util.Map<androidx.camera.video.Quality, java.util.List<android.util.Size>> getOutputSizeshNQ4ISI;
    private androidx.camera.video.VideoCapture.SourceStreamRequirementObserver getOutputStallDuration;
    private androidx.camera.core.processing.SurfaceProcessorNode getOutputStallDurationlomOqCM;
    private androidx.camera.core.SurfaceRequest unwrapAs;

    @Override // androidx.camera.core.UseCase
    public final boolean isAutoRotationSupported() {
        return true;
    }

    public static <T extends androidx.camera.video.VideoOutput> androidx.camera.video.VideoCapture<T> withOutput(T t) {
        return new androidx.camera.video.VideoCapture.Builder((androidx.camera.video.VideoOutput) androidx.core.util.Preconditions.checkNotNull(t)).build();
    }

    VideoCapture(androidx.camera.video.impl.VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
        this.getHighSpeedVideoSizes = androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.impl.SessionConfig.Builder();
        this.getHighSpeedVideoSizesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.video.VideoOutput.SourceState.INACTIVE;
        this.Camera2StreamConfigurationMap = false;
        this.getOutputSizeshNQ4ISI = java.util.Collections.emptyMap();
        this.getOutputMinFrameDurationlomOqCM = new androidx.camera.core.impl.Observable.Observer<androidx.camera.video.StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public /* synthetic */ void onNewData(androidx.camera.video.StreamInfo streamInfo) {
                java.util.List m;
                java.util.List m2;
                androidx.camera.video.StreamInfo streamInfo2 = streamInfo;
                if (streamInfo2 == null) {
                    throw new java.lang.IllegalArgumentException("StreamInfo can't be null");
                }
                if (androidx.camera.video.VideoCapture.this.getHighResolutionOutputSizeshNQ4ISI != androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Stream info update: old: ");
                    sb.append(androidx.camera.video.VideoCapture.this.getHighSpeedVideoSizes);
                    sb.append(" new: ");
                    sb.append(streamInfo2);
                    androidx.camera.core.Logger.d("VideoCapture", sb.toString());
                    androidx.camera.video.StreamInfo streamInfo3 = androidx.camera.video.VideoCapture.this.getHighSpeedVideoSizes;
                    androidx.camera.video.VideoCapture.this.getHighSpeedVideoSizes = streamInfo2;
                    androidx.camera.core.impl.StreamSpec streamSpec = (androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(androidx.camera.video.VideoCapture.this.getAttachedStreamSpec());
                    if (androidx.camera.video.VideoCapture.Camera2StreamConfigurationMap(streamInfo3.getId(), streamInfo2.getId()) || (androidx.camera.video.VideoCapture.this.Camera2StreamConfigurationMap && streamInfo3.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null)) {
                        androidx.camera.video.VideoCapture.this.Camera2StreamConfigurationMap();
                        return;
                    }
                    if ((streamInfo3.getId() != -1 && streamInfo2.getId() == -1) || (streamInfo3.getId() == -1 && streamInfo2.getId() != -1)) {
                        androidx.camera.video.VideoCapture videoCapture = androidx.camera.video.VideoCapture.this;
                        videoCapture.Camera2StreamConfigurationMap(videoCapture.getHighSpeedVideoFpsRangesFor, streamInfo2, streamSpec);
                        androidx.camera.video.VideoCapture videoCapture2 = androidx.camera.video.VideoCapture.this;
                        m2 = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{videoCapture2.getHighSpeedVideoFpsRangesFor.build()});
                        videoCapture2.updateSessionConfig(m2);
                        androidx.camera.video.VideoCapture.this.notifyReset();
                        return;
                    }
                    if (streamInfo3.getStreamState() != streamInfo2.getStreamState()) {
                        androidx.camera.video.VideoCapture videoCapture3 = androidx.camera.video.VideoCapture.this;
                        videoCapture3.Camera2StreamConfigurationMap(videoCapture3.getHighSpeedVideoFpsRangesFor, streamInfo2, streamSpec);
                        androidx.camera.video.VideoCapture videoCapture4 = androidx.camera.video.VideoCapture.this;
                        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{videoCapture4.getHighSpeedVideoFpsRangesFor.build()});
                        videoCapture4.updateSessionConfig(m);
                        androidx.camera.video.VideoCapture.this.notifyUpdated();
                    }
                }
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(java.lang.Throwable th) {
                androidx.camera.core.Logger.w("VideoCapture", "Receive onError from StreamState observer", th);
            }
        };
    }

    public final T getOutput() {
        return (T) ((androidx.camera.video.impl.VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    public final int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public final android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public final boolean isVideoStabilizationEnabled() {
        return getCurrentConfig().getVideoStabilizationMode() == 2;
    }

    public final void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onProviderRotationChanged(int i) {
        setTargetRotation(i);
    }

    public final androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public final androidx.camera.video.Quality getSelectedQuality() {
        androidx.camera.core.impl.StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        androidx.camera.video.Quality quality = null;
        if (attachedStreamSpec == null) {
            return null;
        }
        android.util.Size originalConfiguredResolution = attachedStreamSpec.getOriginalConfiguredResolution();
        for (java.util.Map.Entry<androidx.camera.video.Quality, java.util.List<android.util.Size>> entry : this.getOutputSizeshNQ4ISI.entrySet()) {
            if (entry.getValue().contains(originalConfiguredResolution)) {
                return entry.getKey();
            }
        }
        androidx.camera.core.Logger.w("VideoCapture", "Can't find matched Quality for ".concat(java.lang.String.valueOf(originalConfiguredResolution)));
        java.util.Map<androidx.camera.video.Quality, java.util.List<android.util.Size>> map = this.getOutputSizeshNQ4ISI;
        int area = androidx.camera.core.internal.utils.SizeUtil.getArea(originalConfiguredResolution);
        int i = Integer.MAX_VALUE;
        for (java.util.Map.Entry<androidx.camera.video.Quality, java.util.List<android.util.Size>> entry2 : map.entrySet()) {
            java.util.Iterator<android.util.Size> it = entry2.getValue().iterator();
            while (it.hasNext()) {
                int abs = java.lang.Math.abs(androidx.camera.core.internal.utils.SizeUtil.getArea(it.next()) - area);
                if (abs < i) {
                    quality = entry2.getKey();
                    i = abs;
                }
            }
        }
        return quality;
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        android.graphics.Rect rect = this.getOutputMinFrameDuration;
        int i = this.getOutputSizes;
        if (camera == null || attachedSurfaceResolution == null || rect == null) {
            return null;
        }
        return new androidx.camera.core.ResolutionInfo(attachedSurfaceResolution, rect, i);
    }

    public final int getMirrorMode() {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1) {
            return 0;
        }
        return mirrorModeInternal;
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onSuggestedStreamSpecUpdated: primaryStreamSpec = ");
        sb.append(streamSpec);
        sb.append(", secondaryStreamSpec ");
        sb.append(streamSpec2);
        androidx.camera.core.Logger.d("VideoCapture", sb.toString());
        java.util.List<android.util.Size> customOrderedResolutions = ((androidx.camera.video.impl.VideoCaptureConfig) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("suggested resolution ");
            sb2.append(streamSpec.getResolution());
            sb2.append(" is not in custom ordered resolutions ");
            sb2.append(customOrderedResolutions);
            androidx.camera.core.Logger.w("VideoCapture", sb2.toString());
        }
        return streamSpec;
    }

    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : androidx.camera.video.VideoCapture.Defaults.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStart() {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        super.onSessionStart();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoCapture#onStateAttached: cameraID = ");
        sb.append(getCameraId());
        androidx.camera.core.Logger.d("VideoCapture", sb.toString());
        if (getAttachedStreamSpec() == null || this.unwrapAs != null) {
            return;
        }
        androidx.camera.core.impl.StreamSpec streamSpec = (androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(getAttachedStreamSpec());
        this.getHighSpeedVideoSizes = (androidx.camera.video.StreamInfo) getHighResolutionOutputSizeshNQ4ISI(getOutput().getStreamInfo(), androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRangesFor);
        androidx.camera.core.impl.SessionConfig.Builder highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.camera.video.impl.VideoCaptureConfig) getCurrentConfig(), streamSpec);
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, streamSpec);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        notifyActive();
        getOutput().getStreamInfo().addObserver(androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor(), this.getOutputMinFrameDurationlomOqCM);
        androidx.camera.video.VideoCapture.SourceStreamRequirementObserver sourceStreamRequirementObserver = this.getOutputStallDuration;
        if (sourceStreamRequirementObserver != null) {
            sourceStreamRequirementObserver.getHighSpeedVideoSizes();
        }
        this.getOutputStallDuration = new androidx.camera.video.VideoCapture.SourceStreamRequirementObserver(getCameraControl());
        getOutput().isSourceStreamRequired().addObserver(androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor(), this.getOutputStallDuration);
        androidx.camera.video.VideoOutput.SourceState sourceState = androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING;
        if (sourceState != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(android.graphics.Rect rect) {
        super.setViewPortCropRect(rect);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStop() {
        androidx.camera.core.Logger.d("VideoCapture", "VideoCapture#onStateDetached");
        androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        if (this.getOutputStallDuration != null) {
            getOutput().isSourceStreamRequired().removeObserver(this.getOutputStallDuration);
            this.getOutputStallDuration.getHighSpeedVideoSizes();
            this.getOutputStallDuration = null;
        }
        androidx.camera.video.VideoOutput.SourceState sourceState = androidx.camera.video.VideoOutput.SourceState.INACTIVE;
        if (sourceState != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
        getOutput().getStreamInfo().removeObserver(this.getOutputMinFrameDurationlomOqCM);
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighSpeedVideoSizesFor;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            androidx.camera.core.Logger.d("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        this.getHighSpeedVideoFpsRangesFor.addImplementationOptions(config);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        return ((androidx.camera.core.impl.StreamSpec) java.util.Objects.requireNonNull(getAttachedStreamSpec())).toBuilder().setImplementationOptions(config).build();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoCapture:");
        sb.append(getName());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.video.VideoCapture.Defaults defaults = getInputSizeshNQ4ISI;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.video.VideoCapture.Builder.getHighSpeedVideoFpsRangesFor(config);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.getOutputFormats;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(camera);
        this.getOutputSizes = highResolutionOutputSizeshNQ4ISI;
        surfaceEdge.updateTransformation(highResolutionOutputSizeshNQ4ISI, getAppTargetRotation());
    }

    private int getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.CameraInternal cameraInternal) {
        boolean isMirroringRequired = isMirroringRequired(cameraInternal);
        int relativeRotation = getRelativeRotation(cameraInternal, isMirroringRequired);
        if (this.getHighSpeedVideoSizes.getInProgressTransformationInfo() == null) {
            return relativeRotation;
        }
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = (androidx.camera.core.SurfaceRequest.TransformationInfo) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.getInProgressTransformationInfo());
        int rotationDegrees = transformationInfo.getRotationDegrees();
        if (isMirroringRequired != transformationInfo.isMirroring()) {
            rotationDegrees = -rotationDegrees;
        }
        return androidx.camera.core.impl.utils.TransformUtils.within360(relativeRotation - rotationDegrees);
    }

    private androidx.camera.core.impl.SessionConfig.Builder getHighResolutionOutputSizeshNQ4ISI(final androidx.camera.video.impl.VideoCaptureConfig<T> videoCaptureConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        android.graphics.Rect rect;
        android.util.Size size;
        android.graphics.Rect rect2;
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode;
        androidx.camera.core.impl.Timebase timebase;
        int i;
        android.graphics.Rect rect3;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        final androidx.camera.core.impl.CameraInternal cameraInternal = (androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(getCamera());
        android.util.Size resolution = streamSpec.getResolution();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.VideoCapture.this.notifyReset();
            }
        };
        android.util.Range<java.lang.Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        if (java.util.Objects.equals(expectedFrameRateRange, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            expectedFrameRateRange = streamSpec.getSessionType() == 1 ? androidx.camera.video.VideoCapture.Defaults.getHighSpeedVideoFpsRangesFor : androidx.camera.video.VideoCapture.Defaults.getHighSpeedVideoSizes;
        }
        android.util.Range<java.lang.Integer> range = expectedFrameRateRange;
        androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) java.util.Objects.requireNonNull((androidx.camera.video.MediaSpec) getHighResolutionOutputSizeshNQ4ISI(getOutput().getMediaSpec(), (java.lang.Object) null));
        int sessionType = streamSpec.getSessionType();
        androidx.camera.video.EncoderProfilesResolver encoderProfilesResolver = getOutput().getEncoderProfilesResolver(cameraInternal.getCameraInfo(), sessionType);
        androidx.camera.core.DynamicRange dynamicRange = streamSpec.getDynamicRange();
        androidx.camera.video.internal.encoder.VideoEncoderInfo highSpeedVideoSizes = getHighSpeedVideoSizes(videoCaptureConfig.getVideoEncoderInfoFinder(), encoderProfilesResolver.findNearestHigherSupportedEncoderProfilesFor(resolution, dynamicRange), mediaSpec, dynamicRange);
        this.getOutputSizes = getHighResolutionOutputSizeshNQ4ISI(cameraInternal);
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new android.graphics.Rect(0, 0, resolution.getWidth(), resolution.getHeight());
        }
        if (highSpeedVideoSizes != null && !highSpeedVideoSizes.isSizeSupportedAllowSwapping(rect.width(), rect.height())) {
            rect = getHighSpeedVideoFpsRanges(rect, resolution, highSpeedVideoSizes);
        }
        android.graphics.Rect sizeToRect = this.getHighSpeedVideoSizes.getInProgressTransformationInfo() != null ? androidx.camera.core.impl.utils.TransformUtils.sizeToRect(androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(((androidx.camera.core.SurfaceRequest.TransformationInfo) androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes.getInProgressTransformationInfo())).getCropRect(), this.getOutputSizes)) : rect;
        this.getOutputMinFrameDuration = sizeToRect;
        if (this.getHighSpeedVideoSizes.getInProgressTransformationInfo() == null || sizeToRect.equals(rect)) {
            size = resolution;
        } else {
            float height = sizeToRect.height() / rect.height();
            size = new android.util.Size((int) java.lang.Math.ceil(resolution.getWidth() * height), (int) java.lang.Math.ceil(resolution.getHeight() * height));
        }
        if (this.getHighSpeedVideoSizes.getInProgressTransformationInfo() != null) {
            this.Camera2StreamConfigurationMap = true;
        }
        android.graphics.Rect rect4 = this.getOutputMinFrameDuration;
        int i2 = this.getOutputSizes;
        android.util.Size size2 = size;
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cameraInternal, videoCaptureConfig, sessionType, rect4, resolution, dynamicRange);
        androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk != null) {
            if (highResolutionOutputSizeshNQ4ISI) {
                i = i2;
                rect3 = rect4;
            } else {
                rect3 = rect4;
                i = 0;
            }
            rect2 = sizeCannotEncodeVideoQuirk.adjustCropRectForProblematicEncodeSize(rect3, i, highSpeedVideoSizes);
        } else {
            rect2 = rect4;
        }
        android.graphics.Rect rect5 = rect2;
        this.getOutputMinFrameDuration = rect5;
        if (getHighResolutionOutputSizeshNQ4ISI(cameraInternal, videoCaptureConfig, sessionType, rect5, resolution, dynamicRange)) {
            androidx.camera.core.Logger.d("VideoCapture", "Surface processing is enabled.");
            surfaceProcessorNode = new androidx.camera.core.processing.SurfaceProcessorNode((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()), getEffect() != null ? getEffect().createSurfaceProcessorInternal() : androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.newInstance(dynamicRange), "VideoCapture");
        } else {
            surfaceProcessorNode = null;
        }
        this.getOutputStallDurationlomOqCM = surfaceProcessorNode;
        boolean z = (cameraInternal.getHasTransform() && this.getOutputStallDurationlomOqCM == null) ? false : true;
        if (this.getOutputStallDurationlomOqCM != null || !cameraInternal.getHasTransform()) {
            timebase = cameraInternal.getCamera2StreamConfigurationMap().getTimebase();
        } else {
            timebase = androidx.camera.core.impl.Timebase.UPTIME;
        }
        final androidx.camera.core.impl.Timebase timebase2 = timebase;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("camera timebase = ");
        sb.append(cameraInternal.getCamera2StreamConfigurationMap().getTimebase());
        sb.append(", processing timebase = ");
        sb.append(timebase2);
        androidx.camera.core.Logger.d("VideoCapture", sb.toString());
        androidx.camera.core.impl.StreamSpec build = streamSpec.toBuilder().setResolution(size2).setExpectedFrameRateRange(range).build();
        androidx.core.util.Preconditions.checkState(this.getOutputFormats == null);
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = new androidx.camera.core.processing.SurfaceEdge(2, 34, build, getSensorToBufferTransformMatrix(), cameraInternal.getHasTransform(), this.getOutputMinFrameDuration, this.getOutputSizes, getAppTargetRotation(), cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal));
        this.getOutputFormats = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        if (this.getOutputStallDurationlomOqCM != null) {
            androidx.camera.core.processing.util.OutConfig of = androidx.camera.core.processing.util.OutConfig.of(this.getOutputFormats);
            final androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getOutputStallDurationlomOqCM.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(this.getOutputFormats, java.util.Collections.singletonList(of))).get(of));
            final boolean z2 = z;
            surfaceEdge2.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.VideoCapture.this.getHighSpeedVideoSizes(surfaceEdge2, cameraInternal, videoCaptureConfig, timebase2, z2);
                }
            });
            this.unwrapAs = surfaceEdge2.createSurfaceRequest(cameraInternal);
            final androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getOutputFormats.getDeferrableSurface();
            this.getHighSpeedVideoFpsRanges = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.VideoCapture videoCapture = androidx.camera.video.VideoCapture.this;
                    if (deferrableSurface == videoCapture.getHighSpeedVideoFpsRanges) {
                        videoCapture.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        } else {
            androidx.camera.core.SurfaceRequest createSurfaceRequest = this.getOutputFormats.createSurfaceRequest(cameraInternal);
            this.unwrapAs = createSurfaceRequest;
            this.getHighSpeedVideoFpsRanges = createSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.unwrapAs, timebase2, z);
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRanges.setContainerClass(android.media.MediaCodec.class);
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(videoCaptureConfig, streamSpec.getResolution());
        createFrom.setSessionType(sessionType);
        applyExpectedFrameRateRange(createFrom, streamSpec);
        createFrom.setVideoStabilization(videoCaptureConfig.getVideoStabilizationMode());
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getInputFormats;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.video.VideoCapture.this.Camera2StreamConfigurationMap();
            }
        });
        this.getInputFormats = closeableErrorListener2;
        createFrom.setErrorListener(closeableErrorListener2);
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getInputFormats;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.getInputFormats = null;
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getHighSpeedVideoFpsRanges;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.getHighSpeedVideoFpsRanges = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.getOutputStallDurationlomOqCM;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.getOutputStallDurationlomOqCM = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.getOutputFormats;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.getOutputFormats = null;
        }
        this.getOutputMinFrameDuration = null;
        this.unwrapAs = null;
        this.getHighSpeedVideoSizes = androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRangesFor;
        this.getOutputSizes = 0;
        this.Camera2StreamConfigurationMap = false;
    }

    final void Camera2StreamConfigurationMap() {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        if (getCamera() == null) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        androidx.camera.core.impl.SessionConfig.Builder highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.camera.video.impl.VideoCaptureConfig) getCurrentConfig(), (androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(getAttachedStreamSpec()));
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, getAttachedStreamSpec());
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        notifyReset();
    }

    /* loaded from: classes6.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.video.impl.VideoCaptureConfig<?>> {
        private static final androidx.camera.video.impl.VideoCaptureConfig<?> Camera2StreamConfigurationMap;
        static final androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI;
        private static final androidx.camera.core.impl.StreamUseCase getHighSpeedVideoFpsRanges;
        static final android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRangesFor;
        static final android.util.Range<java.lang.Integer> getHighSpeedVideoSizes;
        private static final androidx.camera.video.VideoOutput getHighSpeedVideoSizesFor;
        private static final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getOutputFormats;

        static {
            androidx.camera.core.impl.StreamUseCase streamUseCase = androidx.camera.core.impl.StreamUseCase.VIDEO_RECORD;
            getHighSpeedVideoFpsRanges = streamUseCase;
            androidx.camera.video.VideoOutput videoOutput = new androidx.camera.video.VideoOutput() { // from class: androidx.camera.video.VideoCapture$Defaults$$ExternalSyntheticLambda0
                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }
            };
            getHighSpeedVideoSizesFor = videoOutput;
            androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.FINDER;
            getOutputFormats = finder;
            getHighSpeedVideoSizes = new android.util.Range<>(30, 30);
            getHighSpeedVideoFpsRangesFor = new android.util.Range<>(120, 120);
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
            getHighResolutionOutputSizeshNQ4ISI = dynamicRange;
            androidx.camera.video.VideoCapture.Builder<T> streamUseCase2 = new androidx.camera.video.VideoCapture.Builder(videoOutput).setSurfaceOccupancyPriority(5).setStreamUseCase(streamUseCase);
            streamUseCase2.getMutableConfig().insertOption(androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, finder);
            Camera2StreamConfigurationMap = streamUseCase2.setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public final androidx.camera.video.impl.VideoCaptureConfig<?> getConfig() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes6.dex */
    static class SourceStreamRequirementObserver implements androidx.camera.core.impl.Observable.Observer<java.lang.Boolean> {
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private androidx.camera.core.impl.CameraControlInternal getHighSpeedVideoFpsRanges;

        @Override // androidx.camera.core.impl.Observable.Observer
        public /* synthetic */ void onNewData(java.lang.Boolean bool) {
            androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.Threads.isMainThread(), "SourceStreamRequirementObserver can be updated from main thread only");
            getHighResolutionOutputSizeshNQ4ISI(java.lang.Boolean.TRUE.equals(bool));
        }

        SourceStreamRequirementObserver(androidx.camera.core.impl.CameraControlInternal cameraControlInternal) {
            this.getHighSpeedVideoFpsRanges = cameraControlInternal;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(java.lang.Throwable th) {
            androidx.camera.core.Logger.w("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }

        private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == z) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            androidx.camera.core.impl.CameraControlInternal cameraControlInternal = this.getHighSpeedVideoFpsRanges;
            if (cameraControlInternal == null) {
                androidx.camera.core.Logger.d("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z) {
                cameraControlInternal.incrementVideoUsage();
            } else {
                cameraControlInternal.decrementVideoUsage();
            }
        }

        public final void getHighSpeedVideoSizes() {
            androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.Threads.isMainThread(), "SourceStreamRequirementObserver can be closed from main thread only");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceStreamRequirementObserver#close: mIsSourceStreamRequired = ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.camera.core.Logger.d("VideoCapture", sb.toString());
            if (this.getHighSpeedVideoFpsRanges == null) {
                androidx.camera.core.Logger.d("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                getHighResolutionOutputSizeshNQ4ISI(false);
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
    }

    final void Camera2StreamConfigurationMap(final androidx.camera.core.impl.SessionConfig.Builder builder, androidx.camera.video.StreamInfo streamInfo, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.impl.DeferrableSurface deferrableSurface;
        boolean z = streamInfo.getId() == -1;
        final boolean z2 = streamInfo.getStreamState() == androidx.camera.video.StreamInfo.StreamState.ACTIVE;
        if (z && z2) {
            throw new java.lang.IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        androidx.camera.core.DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z && (deferrableSurface = this.getHighSpeedVideoFpsRanges) != null) {
            if (z2) {
                builder.addSurface(deferrableSurface, dynamicRange, null, -1);
            } else {
                builder.addNonRepeatingSurface(deferrableSurface, dynamicRange);
            }
        }
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighSpeedVideoSizesFor;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            androidx.camera.core.Logger.d("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                final androidx.camera.video.VideoCapture videoCapture = androidx.camera.video.VideoCapture.this;
                final androidx.camera.core.impl.SessionConfig.Builder builder2 = builder;
                builder2.addTag("androidx.camera.video.VideoCapture.streamUpdate", java.lang.Integer.valueOf(completer.hashCode()));
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                final androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.video.VideoCapture.2
                    private boolean getHighSpeedVideoSizes = true;

                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                        java.lang.Object tag;
                        super.onCaptureCompleted(i, cameraCaptureResult);
                        if (this.getHighSpeedVideoSizes) {
                            this.getHighSpeedVideoSizes = false;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("cameraCaptureResult timestampNs = ");
                            sb.append(cameraCaptureResult.getTimestamp());
                            sb.append(", current system uptimeMs = ");
                            sb.append(android.os.SystemClock.uptimeMillis());
                            sb.append(", current system realtimeMs = ");
                            sb.append(android.os.SystemClock.elapsedRealtime());
                            androidx.camera.core.Logger.d("VideoCapture", sb.toString());
                        }
                        if (atomicBoolean.get() || (tag = cameraCaptureResult.getTagBundle().getTag("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((java.lang.Integer) tag).intValue() != completer.hashCode() || !completer.set(null) || atomicBoolean.getAndSet(true)) {
                            return;
                        }
                        java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
                        final androidx.camera.core.impl.SessionConfig.Builder builder3 = builder2;
                        mainThreadExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.VideoCapture$2$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                builder3.removeCameraCaptureCallback(androidx.camera.video.VideoCapture.AnonymousClass2.this);
                            }
                        });
                    }
                };
                completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.VideoCapture.getHighSpeedVideoSizes(atomicBoolean, builder2, cameraCaptureCallback);
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                builder2.addRepeatingCameraCaptureCallback(cameraCaptureCallback);
                return java.lang.String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", java.lang.Integer.valueOf(completer.hashCode()));
            }
        });
        this.getHighSpeedVideoSizesFor = future;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(future, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.lang.Void r3) {
                if (future != androidx.camera.video.VideoCapture.this.getHighSpeedVideoSizesFor || androidx.camera.video.VideoCapture.this.getHighResolutionOutputSizeshNQ4ISI == androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                androidx.camera.video.VideoCapture videoCapture = androidx.camera.video.VideoCapture.this;
                androidx.camera.video.VideoOutput.SourceState sourceState = z2 ? androidx.camera.video.VideoOutput.SourceState.ACTIVE_STREAMING : androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING;
                if (sourceState != videoCapture.getHighResolutionOutputSizeshNQ4ISI) {
                    videoCapture.getHighResolutionOutputSizeshNQ4ISI = sourceState;
                    videoCapture.getOutput().onSourceStateChanged(sourceState);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (th instanceof java.util.concurrent.CancellationException) {
                    return;
                }
                androidx.camera.core.Logger.e("VideoCapture", "Surface update completed with unexpected exception", th);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.video.impl.VideoCaptureConfig<?> videoCaptureConfig, int i, android.graphics.Rect rect, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange) {
        if (i == 1) {
            return false;
        }
        return getEffect() != null || (cameraInternal.getHasTransform() && videoCaptureConfig.isSurfaceProcessingForceEnabled()) || Camera2StreamConfigurationMap(cameraInternal) || getHighSpeedVideoFpsRanges(cameraInternal, dynamicRange) || size.getWidth() != rect.width() || size.getHeight() != rect.height() || ((cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) || this.getHighSpeedVideoSizes.getInProgressTransformationInfo() != null);
    }

    private static android.graphics.Rect getHighSpeedVideoFpsRanges(final android.graphics.Rect rect, android.util.Size size, androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo) {
        androidx.camera.core.Logger.d("VideoCapture", java.lang.String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", androidx.camera.core.impl.utils.TransformUtils.rectToString(rect), java.lang.Integer.valueOf(videoEncoderInfo.getWidthAlignment()), java.lang.Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        if ((!videoEncoderInfo.getSupportedWidths().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(rect.width())) || !videoEncoderInfo.getSupportedHeights().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(rect.height()))) && videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.getSupportedHeights().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(rect.width())) && videoEncoderInfo.getSupportedWidths().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(rect.height()))) {
            videoEncoderInfo = new androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo(videoEncoderInfo);
        }
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        android.util.Range<java.lang.Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        android.util.Range<java.lang.Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(true, rect.width(), widthAlignment, supportedWidths);
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(false, rect.width(), widthAlignment, supportedWidths);
        int highSpeedVideoSizes3 = getHighSpeedVideoSizes(true, rect.height(), heightAlignment, supportedHeights);
        int highSpeedVideoSizes4 = getHighSpeedVideoSizes(false, rect.height(), heightAlignment, supportedHeights);
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoSizes(hashSet, highSpeedVideoSizes, highSpeedVideoSizes3, size, videoEncoderInfo);
        getHighSpeedVideoSizes(hashSet, highSpeedVideoSizes, highSpeedVideoSizes4, size, videoEncoderInfo);
        getHighSpeedVideoSizes(hashSet, highSpeedVideoSizes2, highSpeedVideoSizes3, size, videoEncoderInfo);
        getHighSpeedVideoSizes(hashSet, highSpeedVideoSizes2, highSpeedVideoSizes4, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            androidx.camera.core.Logger.w("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
        androidx.camera.core.Logger.d("VideoCapture", "candidatesList = ".concat(java.lang.String.valueOf(arrayList)));
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.camera.video.VideoCapture.getHighSpeedVideoSizes(rect, (android.util.Size) obj, (android.util.Size) obj2);
            }
        });
        androidx.camera.core.Logger.d("VideoCapture", "sorted candidatesList = ".concat(java.lang.String.valueOf(arrayList)));
        android.util.Size size2 = (android.util.Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            androidx.camera.core.Logger.d("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        androidx.core.util.Preconditions.checkState(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        if (width != rect.width()) {
            rect2.left = java.lang.Math.max(0, rect.centerX() - (width / 2));
            rect2.right = rect2.left + width;
            if (rect2.right > size.getWidth()) {
                rect2.right = size.getWidth();
                rect2.left = rect2.right - width;
            }
        }
        if (height != rect.height()) {
            rect2.top = java.lang.Math.max(0, rect.centerY() - (height / 2));
            rect2.bottom = rect2.top + height;
            if (rect2.bottom > size.getHeight()) {
                rect2.bottom = size.getHeight();
                rect2.top = rect2.bottom - height;
            }
        }
        androidx.camera.core.Logger.d("VideoCapture", java.lang.String.format("Adjust cropRect from %s to %s", androidx.camera.core.impl.utils.TransformUtils.rectToString(rect), androidx.camera.core.impl.utils.TransformUtils.rectToString(rect2)));
        return rect2;
    }

    static /* synthetic */ int getHighSpeedVideoSizes(android.graphics.Rect rect, android.util.Size size, android.util.Size size2) {
        return (java.lang.Math.abs(size.getWidth() - rect.width()) + java.lang.Math.abs(size.getHeight() - rect.height())) - (java.lang.Math.abs(size2.getWidth() - rect.width()) + java.lang.Math.abs(size2.getHeight() - rect.height()));
    }

    private static void getHighSpeedVideoSizes(java.util.Set<android.util.Size> set, int i, int i2, android.util.Size size, androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            set.add(new android.util.Size(i, videoEncoderInfo.getSupportedHeightsFor(i).clamp(java.lang.Integer.valueOf(i2)).intValue()));
        } catch (java.lang.IllegalArgumentException e) {
            androidx.camera.core.Logger.w("VideoCapture", "No supportedHeights for width: ".concat(java.lang.String.valueOf(i)), e);
        }
        try {
            set.add(new android.util.Size(videoEncoderInfo.getSupportedWidthsFor(i2).clamp(java.lang.Integer.valueOf(i)).intValue(), i2));
        } catch (java.lang.IllegalArgumentException e2) {
            androidx.camera.core.Logger.w("VideoCapture", "No supportedWidths for height: ".concat(java.lang.String.valueOf(i2)), e2);
        }
    }

    static boolean Camera2StreamConfigurationMap(int i, int i2) {
        return (androidx.camera.video.StreamInfo.getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Integer.valueOf(i)) || androidx.camera.video.StreamInfo.getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Integer.valueOf(i2)) || i == i2) ? false : true;
    }

    private static boolean Camera2StreamConfigurationMap(androidx.camera.core.impl.CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform()) {
            return androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.workaroundBySurfaceProcessing(androidx.camera.video.internal.compat.quirk.DeviceQuirks.getAll()) || androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.workaroundBySurfaceProcessing(cameraInternal.getCamera2StreamConfigurationMap().getCameraQuirks());
        }
        return false;
    }

    private static boolean getHighSpeedVideoFpsRanges(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk) androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.class);
        return cameraInternal.getHasTransform() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.workaroundBySurfaceProcessing(dynamicRange);
    }

    private static int getHighSpeedVideoSizes(boolean z, int i, int i2, android.util.Range<java.lang.Integer> range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return range.clamp(java.lang.Integer.valueOf(i)).intValue();
    }

    private static androidx.camera.video.internal.encoder.VideoEncoderInfo getHighSpeedVideoSizes(androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, androidx.camera.video.MediaSpec mediaSpec, androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.video.internal.encoder.VideoEncoderInfo find = finder.find(androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy).getMimeType());
        if (find == null) {
            androidx.camera.core.Logger.w("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        return androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.from(find, videoValidatedEncoderProfilesProxy != null ? videoValidatedEncoderProfilesProxy.getDefaultVideoProfile().getResolution() : null);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.camera.core.impl.SessionConfig.Builder builder, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    private androidx.camera.video.QualitySelector getHighSpeedVideoFpsRanges() {
        java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> featureGroup = getFeatureGroup();
        if (featureGroup == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.featuregroup.GroupableFeature groupableFeature : featureGroup) {
            if (groupableFeature instanceof androidx.camera.video.featuregroup.RecordingQualityFeature) {
                arrayList.add(((androidx.camera.video.featuregroup.RecordingQualityFeature) groupableFeature).getQuality());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return androidx.camera.video.QualitySelector.fromOrderedList(arrayList);
    }

    private static <T> T getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.Observable<T> observable, T t) {
        com.google.common.util.concurrent.ListenableFuture<T> fetchData = observable.fetchData();
        if (!fetchData.isDone()) {
            return t;
        }
        try {
            return fetchData.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public static final class Builder<T extends androidx.camera.video.VideoOutput> implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.video.VideoCapture<T>, androidx.camera.video.impl.VideoCaptureConfig<T>, androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>> {
        private final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoFpsRanges;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.getHighSpeedVideoFpsRanges = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                throw new java.lang.IllegalArgumentException("VideoOutput is required");
            }
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.video.VideoCapture.class)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
                sb.append(this);
                sb.append(": ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
            setTargetClass((java.lang.Class) androidx.camera.video.VideoCapture.class);
        }

        static androidx.camera.video.VideoCapture.Builder<? extends androidx.camera.video.VideoOutput> getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.Config config) {
            return new androidx.camera.video.VideoCapture.Builder<>(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        public static <T extends androidx.camera.video.VideoOutput> androidx.camera.video.VideoCapture.Builder<T> fromConfig(androidx.camera.video.impl.VideoCaptureConfig<T> videoCaptureConfig) {
            return new androidx.camera.video.VideoCapture.Builder<>(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) videoCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.impl.VideoCaptureConfig<T> getUseCaseConfig() {
            return new androidx.camera.video.impl.VideoCaptureConfig<>(androidx.camera.core.impl.OptionsBundle.from(this.getHighSpeedVideoFpsRanges));
        }

        public final androidx.camera.video.VideoCapture.Builder<T> setVideoOutput(androidx.camera.video.VideoOutput videoOutput) {
            getMutableConfig().insertOption(androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.video.VideoCapture<T> build() {
            return new androidx.camera.video.VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setTargetClass(java.lang.Class<androidx.camera.video.VideoCapture<T>> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append("-");
                sb.append(java.util.UUID.randomUUID());
                setTargetName(sb.toString());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setTargetAspectRatio(int i) {
            throw new java.lang.UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setTargetRotation(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setMirrorMode(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, java.lang.Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setTargetResolution(android.util.Size size) {
            throw new java.lang.UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setBackgroundExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setZslDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        public final androidx.camera.video.VideoCapture.Builder<T> setTargetFrameRate(android.util.Range<java.lang.Integer> range) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        public final androidx.camera.video.VideoCapture.Builder<T> setVideoStabilizationEnabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(z ? 2 : 1));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.video.VideoCapture.Builder<T> setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        public final androidx.camera.video.VideoCapture.Builder<T> setSurfaceProcessingForceEnabled() {
            getMutableConfig().insertOption(androidx.camera.video.impl.VideoCaptureConfig.OPTION_FORCE_ENABLE_SURFACE_PROCESSING, java.lang.Boolean.TRUE);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(T t) {
            this(r0);
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            create.insertOption(androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t);
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, java.lang.Boolean.valueOf(t.isQualitySelectorDefault()));
        }
    }

    @Override // androidx.camera.core.UseCase
    public final java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        return getOutput().getMediaCapabilities(cameraInfoInternal, 0).getSupportedDynamicRanges();
    }

    final /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.video.impl.VideoCaptureConfig videoCaptureConfig, androidx.camera.core.impl.Timebase timebase, boolean z) {
        if (cameraInternal == getCamera()) {
            this.unwrapAs = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.unwrapAs, timebase, z);
            getHighSpeedVideoFpsRangesFor();
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        java.util.List<android.util.Size> supportedResolutions;
        java.util.LinkedHashMap linkedHashMap;
        androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor;
        java.util.Iterator it;
        java.util.Map<androidx.camera.video.Quality, android.util.Size> map;
        androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo;
        java.util.Map<androidx.camera.video.Quality, android.util.Size> map2;
        java.util.Iterator<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> it2;
        int area;
        androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) getHighResolutionOutputSizeshNQ4ISI(getOutput().getMediaSpec(), (java.lang.Object) null);
        if (mediaSpec == null) {
            throw new java.lang.IllegalArgumentException("MediaSpec can't be null");
        }
        androidx.camera.video.QualitySelector highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == null) {
            highSpeedVideoFpsRanges = mediaSpec.getVideoSpec().getQualitySelector();
        }
        androidx.camera.video.impl.VideoCaptureConfig videoCaptureConfig = (androidx.camera.video.impl.VideoCaptureConfig) builder.getUseCaseConfig();
        int i = 1;
        if (videoCaptureConfig.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS)) {
            androidx.core.util.Preconditions.checkArgument(getOutput().isQualitySelectorDefault(), "Custom ordered resolutions and QualitySelector can't both be set");
            androidx.core.util.Preconditions.checkArgument(getHighSpeedVideoFpsRanges() == null, "Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)");
        } else {
            androidx.camera.core.DynamicRange dynamicRange = videoCaptureConfig.getDynamicRange();
            int sessionType = videoCaptureConfig.getSessionType(0);
            android.util.Range<java.lang.Integer> range = (android.util.Range) java.util.Objects.requireNonNull(videoCaptureConfig.getTargetFrameRate(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED));
            androidx.camera.video.VideoCapabilities mediaCapabilities = getOutput().getMediaCapabilities(cameraInfoInternal, sessionType);
            androidx.camera.video.EncoderProfilesResolver encoderProfilesResolver = getOutput().getEncoderProfilesResolver(cameraInfoInternal, sessionType);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Update custom order resolutions: requestedDynamicRange = ");
            sb.append(dynamicRange);
            sb.append(", sessionType = ");
            sb.append(sessionType);
            sb.append(", targetFrameRate = ");
            sb.append(range);
            androidx.camera.core.Logger.d("VideoCapture", sb.toString());
            java.util.List<androidx.camera.video.Quality> supportedQualities = mediaCapabilities.getSupportedQualities(dynamicRange);
            androidx.camera.core.Logger.d("VideoCapture", "supportedQualities = ".concat(java.lang.String.valueOf(supportedQualities)));
            if (!supportedQualities.isEmpty() || sessionType != 1) {
                if (supportedQualities.isEmpty()) {
                    androidx.camera.core.Logger.w("VideoCapture", "Can't find any supported quality on the device.");
                } else {
                    java.util.List<androidx.camera.video.Quality> prioritizedQualities = highSpeedVideoFpsRanges.getPrioritizedQualities(supportedQualities);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found selectedQualities ");
                    sb2.append(prioritizedQualities);
                    sb2.append(" by ");
                    sb2.append(highSpeedVideoFpsRanges);
                    androidx.camera.core.Logger.d("VideoCapture", sb2.toString());
                    if (!prioritizedQualities.isEmpty()) {
                        androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder videoEncoderInfoFinder = videoCaptureConfig.getVideoEncoderInfoFinder();
                        int aspectRatio = mediaSpec.getVideoSpec().getAspectRatio();
                        java.util.Map<androidx.camera.video.Quality, android.util.Size> qualityToResolutionMap = androidx.camera.video.QualitySelector.getQualityToResolutionMap(mediaCapabilities, dynamicRange);
                        if (sessionType == 1) {
                            if (androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range)) {
                                supportedResolutions = cameraInfoInternal.getSupportedHighSpeedResolutions();
                            } else {
                                supportedResolutions = cameraInfoInternal.getSupportedHighSpeedResolutionsFor(range);
                            }
                        } else {
                            supportedResolutions = cameraInfoInternal.getSupportedResolutions(getImageFormat());
                        }
                        androidx.camera.video.QualityRatioToResolutionsTable qualityRatioToResolutionsTable = new androidx.camera.video.QualityRatioToResolutionsTable(supportedResolutions, qualityToResolutionMap);
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        for (androidx.camera.video.Quality quality : prioritizedQualities) {
                            java.util.List<android.util.Size> list = qualityRatioToResolutionsTable.getHighSpeedVideoFpsRanges.get(androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.Camera2StreamConfigurationMap(quality, aspectRatio));
                            linkedHashMap2.put(quality, list != null ? new java.util.ArrayList(list) : new java.util.ArrayList(0));
                        }
                        if (linkedHashMap2.isEmpty()) {
                            linkedHashMap = new java.util.LinkedHashMap();
                        } else {
                            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                            java.util.Iterator it3 = linkedHashMap2.entrySet().iterator();
                            while (it3.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
                                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) entry.getValue());
                                java.util.Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    android.util.Size size = (android.util.Size) it4.next();
                                    if (!qualityToResolutionMap.containsValue(size) && (findNearestHigherSupportedEncoderProfilesFor = encoderProfilesResolver.findNearestHigherSupportedEncoderProfilesFor(size, dynamicRange)) != null) {
                                        if (dynamicRange.isFullySpecified()) {
                                            videoEncoderInfo = getHighSpeedVideoSizes(videoEncoderInfoFinder, findNearestHigherSupportedEncoderProfilesFor, mediaSpec, dynamicRange);
                                            it = it3;
                                            map = qualityToResolutionMap;
                                        } else {
                                            java.util.Iterator<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> it5 = findNearestHigherSupportedEncoderProfilesFor.getVideoProfiles().iterator();
                                            int i2 = Integer.MIN_VALUE;
                                            androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo2 = null;
                                            while (it5.hasNext()) {
                                                java.util.Iterator it6 = it3;
                                                androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy next = it5.next();
                                                if (androidx.camera.video.internal.utils.DynamicRangeUtil.isHdrSettingsMatched(next, dynamicRange)) {
                                                    map2 = qualityToResolutionMap;
                                                    it2 = it5;
                                                    androidx.camera.video.internal.encoder.VideoEncoderInfo highSpeedVideoSizes = getHighSpeedVideoSizes(videoEncoderInfoFinder, findNearestHigherSupportedEncoderProfilesFor, mediaSpec, new androidx.camera.core.DynamicRange(androidx.camera.video.internal.utils.DynamicRangeUtil.videoProfileHdrFormatsToDynamicRangeEncoding(next.getHdrFormat()), androidx.camera.video.internal.utils.DynamicRangeUtil.videoProfileBitDepthToDynamicRangeBitDepth(next.getBitDepth())));
                                                    if (highSpeedVideoSizes != null && (area = androidx.camera.core.internal.utils.SizeUtil.getArea(highSpeedVideoSizes.getSupportedWidths().getUpper().intValue(), highSpeedVideoSizes.getSupportedHeights().getUpper().intValue())) > i2) {
                                                        videoEncoderInfo2 = highSpeedVideoSizes;
                                                        i2 = area;
                                                        it5 = it2;
                                                        qualityToResolutionMap = map2;
                                                        it3 = it6;
                                                    }
                                                } else {
                                                    map2 = qualityToResolutionMap;
                                                    it2 = it5;
                                                }
                                                it3 = it6;
                                                it5 = it2;
                                                qualityToResolutionMap = map2;
                                            }
                                            it = it3;
                                            map = qualityToResolutionMap;
                                            videoEncoderInfo = videoEncoderInfo2;
                                        }
                                        if (videoEncoderInfo != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                                            it4.remove();
                                        }
                                        it3 = it;
                                        qualityToResolutionMap = map;
                                    }
                                }
                                java.util.Iterator it7 = it3;
                                java.util.Map<androidx.camera.video.Quality, android.util.Size> map3 = qualityToResolutionMap;
                                if (!arrayList.isEmpty()) {
                                    linkedHashMap3.put((androidx.camera.video.Quality) entry.getKey(), arrayList);
                                }
                                it3 = it7;
                                qualityToResolutionMap = map3;
                                i = 1;
                            }
                            linkedHashMap = linkedHashMap3;
                        }
                        if (sessionType == i) {
                            androidx.camera.core.impl.MutableConfig mutableConfig = builder.getMutableConfig();
                            androidx.camera.core.impl.Config.Option<java.util.Map<android.util.Size, java.lang.Integer>> option = androidx.camera.core.impl.UseCaseConfig.OPTION_RESOLUTION_TO_MAX_FRAME_RATES;
                            java.util.HashMap hashMap = new java.util.HashMap();
                            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                                int frameRate = ((androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) java.util.Objects.requireNonNull(encoderProfilesResolver.getProfiles((androidx.camera.video.Quality) entry2.getKey(), dynamicRange))).getDefaultVideoProfile().getFrameRate();
                                java.util.Iterator it8 = ((java.util.List) entry2.getValue()).iterator();
                                while (it8.hasNext()) {
                                    hashMap.put((android.util.Size) it8.next(), java.lang.Integer.valueOf(frameRate));
                                }
                            }
                            mutableConfig.insertOption(option, hashMap);
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it9 = linkedHashMap.values().iterator();
                        while (it9.hasNext()) {
                            arrayList2.addAll((java.util.List) it9.next());
                        }
                        androidx.camera.core.Logger.d("VideoCapture", "Set custom ordered resolutions = ".concat(java.lang.String.valueOf(arrayList2)));
                        builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList2);
                        this.getOutputSizeshNQ4ISI = linkedHashMap;
                        return builder.getUseCaseConfig();
                    }
                    throw new java.lang.IllegalArgumentException("Unable to find selected quality");
                }
            } else {
                throw new java.lang.IllegalArgumentException("No supported quality on the device for high-speed capture.");
            }
        }
        return builder.getUseCaseConfig();
    }
}
