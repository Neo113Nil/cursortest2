package androidx.camera.core;

/* loaded from: classes.dex */
public abstract class UseCase {
    private androidx.camera.core.impl.StreamSpec Camera2StreamConfigurationMap;
    private android.graphics.Rect coroutineCreation;
    private androidx.camera.core.impl.UseCaseConfig<?> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.camera.core.impl.CameraInternal getHighSpeedVideoSizes;
    private androidx.camera.core.impl.UseCaseConfig<?> getInputFormats;
    private java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> getInputSizeshNQ4ISI;
    private androidx.camera.core.CameraEffect getOutputFormats;
    private androidx.camera.core.impl.UseCaseConfig<?> getOutputMinFrameDuration;
    private java.lang.String getOutputSizeshNQ4ISI;
    private androidx.camera.core.impl.UseCaseConfig<?> isOutputSupportedFor;
    private androidx.camera.core.impl.CameraInternal toString;
    private boolean getOutputStallDuration = false;
    private final java.util.Set<androidx.camera.core.UseCase.StateChangeCallback> unwrapAs = new java.util.HashSet();
    private final java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();
    private final java.lang.Object getOutputMinFrameDurationlomOqCM = new java.lang.Object();
    private androidx.camera.core.UseCase.State isOutputSupportedForhNQ4ISI = androidx.camera.core.UseCase.State.INACTIVE;
    private android.graphics.Matrix getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Matrix();
    private androidx.camera.core.RotationProvider getOutputSizes = null;
    private final androidx.camera.core.RotationProvider.Listener getOutputStallDurationlomOqCM = new androidx.camera.core.RotationProvider.Listener() { // from class: androidx.camera.core.UseCase$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.RotationProvider.Listener
        public final void onRotationChanged(int i) {
            androidx.camera.core.UseCase.this.onProviderRotationChanged(i);
        }
    };
    private androidx.camera.core.impl.SessionConfig getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();
    private androidx.camera.core.impl.SessionConfig getHighSpeedVideoFpsRanges = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();

    /* loaded from: classes6.dex */
    enum State {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes6.dex */
    public interface StateChangeCallback {
        void onUseCaseActive(androidx.camera.core.UseCase useCase);

        void onUseCaseInactive(androidx.camera.core.UseCase useCase);

        void onUseCaseReset(androidx.camera.core.UseCase useCase);

        void onUseCaseUpdated(androidx.camera.core.UseCase useCase);
    }

    public abstract androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory);

    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        return null;
    }

    public abstract androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config);

    public boolean isAutoRotationSupported() {
        return false;
    }

    public void onBind() {
    }

    public void onCameraControlReady() {
    }

    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        return streamSpec;
    }

    public void onUnbind() {
    }

    public UseCase(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        this.isOutputSupportedFor = useCaseConfig;
        this.getInputFormats = useCaseConfig;
    }

    public androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
        androidx.camera.core.impl.MutableOptionsBundle create;
        if (useCaseConfig2 != null) {
            create = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) useCaseConfig2);
            create.removeOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME);
        } else {
            create = androidx.camera.core.impl.MutableOptionsBundle.create();
        }
        if ((this.isOutputSupportedFor.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO) || this.isOutputSupportedFor.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION)) && create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            create.removeOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR);
        }
        if (this.isOutputSupportedFor.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR) && create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION) && ((androidx.camera.core.resolutionselector.ResolutionSelector) this.isOutputSupportedFor.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)).getResolutionStrategy() != null) {
            create.removeOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION);
        }
        java.util.Iterator<androidx.camera.core.impl.Config.Option<?>> it = this.isOutputSupportedFor.listOptions().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.Config.mergeOptionValue(create, create, this.isOutputSupportedFor, it.next());
        }
        if (useCaseConfig != null) {
            for (androidx.camera.core.impl.Config.Option<?> option : useCaseConfig.listOptions()) {
                if (!option.getId().equals(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME.getId())) {
                    androidx.camera.core.impl.Config.mergeOptionValue(create, create, useCaseConfig, option);
                }
            }
        }
        if (create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION) && create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)) {
            create.removeOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
        }
        if (create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR) && ((androidx.camera.core.resolutionselector.ResolutionSelector) create.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)).getAllowedResolutionMode() != 0) {
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("applyFeaturesToConfig: mFeatureGroup = ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", this = ");
        sb.append(this);
        androidx.camera.core.Logger.d("UseCase", sb.toString());
        if (this.getInputSizeshNQ4ISI != null) {
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature.DEFAULT_DYNAMIC_RANGE;
            android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization = androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature.DEFAULT_STABILIZATION;
            for (androidx.camera.core.featuregroup.GroupableFeature groupableFeature : this.getInputSizeshNQ4ISI) {
                if (groupableFeature instanceof androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature) {
                    dynamicRange = ((androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature) groupableFeature).getDynamicRange();
                } else if (groupableFeature instanceof androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature) {
                    androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature fpsRangeFeature = (androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature) groupableFeature;
                    range = new android.util.Range<>(java.lang.Integer.valueOf(fpsRangeFeature.getMinFps()), java.lang.Integer.valueOf(fpsRangeFeature.getMaxFps()));
                } else if (groupableFeature instanceof androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature) {
                    videoStabilization = ((androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature) groupableFeature).getVideoStabilization();
                }
            }
            if ((this instanceof androidx.camera.core.Preview) || androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(this)) {
                create.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            }
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            int i = androidx.camera.core.UseCase.AnonymousClass1.getHighSpeedVideoFpsRanges[videoStabilization.ordinal()];
            if (i == 1) {
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0);
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0);
            } else if (i == 2) {
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 1);
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 1);
            } else if (i == 3) {
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0);
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 2);
            } else if (i == 4) {
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 2);
                create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0);
            }
        }
        return onMergeConfig(cameraInfoInternal, getUseCaseConfigBuilder(create));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        return builder.getUseCaseConfig();
    }

    public static int snapToSurfaceRotation(int i) {
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, 359, "orientation");
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    public void setPhysicalCameraId(java.lang.String str) {
        this.getOutputSizeshNQ4ISI = str;
    }

    public java.lang.String getPhysicalCameraId() {
        return this.getOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    protected boolean setTargetRotationInternal(int i) {
        int targetRotation = ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getTargetRotation(-1);
        if (targetRotation != -1 && targetRotation == i) {
            return false;
        }
        androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> useCaseConfigBuilder = getUseCaseConfigBuilder(this.isOutputSupportedFor);
        androidx.camera.core.internal.utils.UseCaseConfigUtil.updateTargetRotationAndRelatedConfigs(useCaseConfigBuilder, i);
        this.isOutputSupportedFor = useCaseConfigBuilder.getUseCaseConfig();
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera == null) {
            this.getInputFormats = this.isOutputSupportedFor;
            return true;
        }
        this.getInputFormats = mergeConfigs(camera.getCameraInfoInternal(), this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
        return true;
    }

    protected void onProviderRotationChanged(int i) {
        setTargetRotationInternal(i);
    }

    protected int getTargetRotationInternal() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.getInputFormats).getTargetRotation(0);
    }

    protected android.util.Range<java.lang.Integer> getTargetFrameRateInternal() {
        return this.getInputFormats.getTargetFrameRate(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
    }

    protected int getMirrorModeInternal() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.getInputFormats).getMirrorMode(-1);
    }

    public boolean isMirroringRequired(androidx.camera.core.impl.CameraInternal cameraInternal) {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1 || mirrorModeInternal == 0) {
            return false;
        }
        if (mirrorModeInternal == 1) {
            return true;
        }
        if (mirrorModeInternal == 2) {
            return cameraInternal.isFrontFacing();
        }
        throw new java.lang.AssertionError("Unknown mirrorMode: ".concat(java.lang.String.valueOf(mirrorModeInternal)));
    }

    protected int getAppTargetRotation() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.getInputFormats).getAppTargetRotation(-1);
    }

    protected int getRelativeRotation(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return getRelativeRotation(cameraInternal, false);
    }

    protected int getRelativeRotation(androidx.camera.core.impl.CameraInternal cameraInternal, boolean z) {
        int sensorRotationDegrees = cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(getTargetRotationInternal());
        return (cameraInternal.getHasTransform() || !z) ? sensorRotationDegrees : androidx.camera.core.impl.utils.TransformUtils.within360(-sensorRotationDegrees);
    }

    public void updateSessionConfig(java.util.List<androidx.camera.core.impl.SessionConfig> list) {
        if (list.isEmpty()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = list.get(0);
        if (list.size() > 1) {
            this.getHighSpeedVideoFpsRanges = list.get(1);
        }
        java.util.Iterator<androidx.camera.core.impl.SessionConfig> it = list.iterator();
        while (it.hasNext()) {
            for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : it.next().getSurfaces()) {
                if (deferrableSurface.getContainerClass() == null) {
                    deferrableSurface.setContainerClass(getClass());
                }
            }
        }
    }

    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.camera.core.impl.SessionConfig getSecondarySessionConfig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected final void notifyActive() {
        this.isOutputSupportedForhNQ4ISI = androidx.camera.core.UseCase.State.ACTIVE;
        notifyState();
    }

    protected final void notifyInactive() {
        this.isOutputSupportedForhNQ4ISI = androidx.camera.core.UseCase.State.INACTIVE;
        notifyState();
    }

    public final void notifyUpdated() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseUpdated(this);
        }
    }

    public final void notifyReset() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseReset(this);
        }
    }

    public final void notifyState() {
        int ordinal = this.isOutputSupportedForhNQ4ISI.ordinal();
        if (ordinal == 0) {
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.unwrapAs.iterator();
            while (it.hasNext()) {
                it.next().onUseCaseActive(this);
            }
        } else if (ordinal == 1) {
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it2 = this.unwrapAs.iterator();
            while (it2.hasNext()) {
                it2.next().onUseCaseInactive(this);
            }
        }
    }

    protected java.lang.String getCameraId() {
        return ((androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(getCamera(), "No camera attached to use case: ".concat(java.lang.String.valueOf(this)))).getCameraInfoInternal().getCameraId();
    }

    protected java.lang.String getSecondaryCameraId() {
        if (getSecondaryCamera() == null) {
            return null;
        }
        return getSecondaryCamera().getCameraInfoInternal().getCameraId();
    }

    protected boolean isCurrentCamera(java.lang.String str) {
        if (getCamera() == null) {
            return false;
        }
        return java.util.Objects.equals(str, getCameraId());
    }

    public java.lang.String getName() {
        androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = this.getInputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<UnknownUseCase-");
        sb.append(hashCode());
        sb.append(">");
        return (java.lang.String) java.util.Objects.requireNonNull(useCaseConfig.getTargetName(sb.toString()));
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getAppConfig() {
        return this.isOutputSupportedFor;
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getCurrentConfig() {
        return this.getInputFormats;
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.getHighSpeedVideoSizesFor) {
            cameraInternal = this.getHighSpeedVideoSizes;
        }
        return cameraInternal;
    }

    public androidx.camera.core.impl.CameraInternal getSecondaryCamera() {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.getHighSpeedVideoSizesFor) {
            cameraInternal = this.toString;
        }
        return cameraInternal;
    }

    public android.util.Size getAttachedSurfaceResolution() {
        androidx.camera.core.impl.StreamSpec streamSpec = this.Camera2StreamConfigurationMap;
        if (streamSpec != null) {
            return streamSpec.getResolution();
        }
        return null;
    }

    public androidx.camera.core.impl.StreamSpec getAttachedStreamSpec() {
        return this.Camera2StreamConfigurationMap;
    }

    public void updateSuggestedStreamSpec(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        this.Camera2StreamConfigurationMap = onSuggestedStreamSpecUpdated(streamSpec, streamSpec2);
    }

    public void updateSuggestedStreamSpecImplementationOptions(androidx.camera.core.impl.Config config) {
        this.Camera2StreamConfigurationMap = onSuggestedStreamSpecImplementationOptionsUpdated(config);
    }

    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        androidx.camera.core.impl.StreamSpec streamSpec = this.Camera2StreamConfigurationMap;
        if (streamSpec == null) {
            throw new java.lang.UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        return streamSpec.toBuilder().setImplementationOptions(config).build();
    }

    public final void bindToCamera(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
        synchronized (this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoSizes = cameraInternal;
            this.toString = cameraInternal2;
            this.unwrapAs.add(cameraInternal);
            if (cameraInternal2 != null) {
                this.unwrapAs.add(cameraInternal2);
            }
        }
        this.getOutputMinFrameDuration = useCaseConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseConfig2;
        this.getInputFormats = mergeConfigs(cameraInternal.getCameraInfoInternal(), this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            androidx.camera.core.RotationProvider rotationProvider = this.getOutputSizes;
            if (rotationProvider != null) {
                rotationProvider.addListener(androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor(), this.getOutputStallDurationlomOqCM);
            }
        }
        onBind();
    }

    public final void unbindFromCamera(androidx.camera.core.impl.CameraInternal cameraInternal) {
        onUnbind();
        synchronized (this.getHighSpeedVideoSizesFor) {
            androidx.camera.core.impl.CameraInternal cameraInternal2 = this.getHighSpeedVideoSizes;
            if (cameraInternal == cameraInternal2) {
                this.unwrapAs.remove(cameraInternal2);
                this.getHighSpeedVideoSizes = null;
            }
            androidx.camera.core.impl.CameraInternal cameraInternal3 = this.toString;
            if (cameraInternal == cameraInternal3) {
                this.unwrapAs.remove(cameraInternal3);
                this.toString = null;
            }
        }
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            androidx.camera.core.RotationProvider rotationProvider = this.getOutputSizes;
            if (rotationProvider != null) {
                rotationProvider.removeListener(this.getOutputStallDurationlomOqCM);
            }
        }
        this.Camera2StreamConfigurationMap = null;
        this.coroutineCreation = null;
        this.getInputFormats = this.isOutputSupportedFor;
        this.getOutputMinFrameDuration = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public void onSessionStart() {
        this.getOutputStallDuration = true;
    }

    public void onSessionStop() {
        this.getOutputStallDuration = false;
    }

    public boolean isInSession() {
        return this.getOutputStallDuration;
    }

    protected androidx.camera.core.impl.CameraControlInternal getCameraControl() {
        synchronized (this.getHighSpeedVideoSizesFor) {
            androidx.camera.core.impl.CameraInternal cameraInternal = this.getHighSpeedVideoSizes;
            if (cameraInternal == null) {
                return androidx.camera.core.impl.CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
            }
            return cameraInternal.getCameraControlInternal();
        }
    }

    public void setViewPortCropRect(android.graphics.Rect rect) {
        this.coroutineCreation = rect;
    }

    public void setEffect(androidx.camera.core.CameraEffect cameraEffect) {
        androidx.core.util.Preconditions.checkArgument(cameraEffect == null || isEffectTargetsSupported(cameraEffect.getTargets()));
        this.getOutputFormats = cameraEffect;
    }

    public androidx.camera.core.CameraEffect getEffect() {
        return this.getOutputFormats;
    }

    public android.graphics.Rect getViewPortCropRect() {
        return this.coroutineCreation;
    }

    public void setSensorToBufferTransformMatrix(android.graphics.Matrix matrix) {
        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Matrix(matrix);
    }

    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public int getImageFormat() {
        return this.getInputFormats.getInputFormat();
    }

    protected androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        android.graphics.Rect viewPortCropRect = getViewPortCropRect();
        if (viewPortCropRect == null) {
            viewPortCropRect = new android.graphics.Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return new androidx.camera.core.ResolutionInfo(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }

    protected java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        return java.util.Collections.emptySet();
    }

    public boolean isEffectTargetsSupported(int i) {
        java.util.Iterator<java.lang.Integer> it = getSupportedEffectTargets().iterator();
        while (it.hasNext()) {
            if (androidx.camera.core.processing.TargetUtils.isSuperset(i, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    protected void applyExpectedFrameRateRange(androidx.camera.core.impl.SessionConfig.Builder builder, androidx.camera.core.impl.StreamSpec streamSpec) {
        if (!androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(streamSpec.getExpectedFrameRateRange())) {
            builder.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
            return;
        }
        synchronized (this.getHighSpeedVideoSizesFor) {
            java.util.List all = ((androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes)).getCameraInfoInternal().getCameraQuirks().getAll(androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk.class);
            androidx.core.util.Preconditions.checkArgument(all.size() <= 1, "There should not have more than one AeFpsRangeQuirk.");
            if (!all.isEmpty()) {
                builder.setExpectedFrameRateRange(((androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk) all.get(0)).getTargetAeFpsRange());
            }
        }
    }

    public void setFeatureGroup(java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> set) {
        this.getInputSizeshNQ4ISI = set != null ? new java.util.HashSet(set) : null;
    }

    public java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> getFeatureGroup() {
        return this.getInputSizeshNQ4ISI;
    }

    /* renamed from: androidx.camera.core.UseCase$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.camera.core.impl.stabilization.VideoStabilization.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.UNSPECIFIED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.core.impl.stabilization.VideoStabilization.OFF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.core.impl.stabilization.VideoStabilization.ON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public void setRotationProvider(androidx.camera.core.RotationProvider rotationProvider) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputSizes = rotationProvider;
        }
    }
}
