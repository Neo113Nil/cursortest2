package androidx.camera.core;

/* loaded from: classes.dex */
public final class ImageAnalysis extends androidx.camera.core.UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    public static final int COORDINATE_SYSTEM_SENSOR = 2;
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int OUTPUT_IMAGE_FORMAT_NV21 = 3;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    androidx.camera.core.ImageAnalysisAbstractAnalyzer Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRangesFor;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener getHighSpeedVideoSizes;
    private androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoSizesFor;
    private java.util.concurrent.Executor getInputFormats;
    private android.graphics.Matrix getInputSizeshNQ4ISI;
    private android.graphics.Rect getOutputFormats;
    private androidx.camera.core.ImageAnalysis.Analyzer getOutputMinFrameDuration;
    public static final androidx.camera.core.ImageAnalysis.Defaults DEFAULT_CONFIG = new androidx.camera.core.ImageAnalysis.Defaults();
    private static final java.lang.Boolean getHighSpeedVideoFpsRanges = null;

    public interface Analyzer {
        void analyze(androidx.camera.core.ImageProxy imageProxy);

        default android.util.Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(android.graphics.Matrix matrix) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BackpressureStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OutputImageFormat {
    }

    @Override // androidx.camera.core.UseCase
    public final boolean isAutoRotationSupported() {
        return true;
    }

    ImageAnalysis(androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        final android.util.Size defaultTargetResolution;
        androidx.camera.core.resolutionselector.ResolutionSelector.Builder fromResolutionSelector;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.ImageAnalysis.Analyzer analyzer = this.getOutputMinFrameDuration;
            defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((java.lang.Integer) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE == 90) {
            defaultTargetResolution = new android.util.Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        if (!builder.getUseCaseConfig().containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, defaultTargetResolution);
        }
        if (builder.getUseCaseConfig().containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = (androidx.camera.core.resolutionselector.ResolutionSelector) getAppConfig().retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, null);
            if (resolutionSelector == null) {
                fromResolutionSelector = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder();
            } else {
                fromResolutionSelector = androidx.camera.core.resolutionselector.ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            }
            if (resolutionSelector == null || resolutionSelector.getResolutionStrategy() == null) {
                fromResolutionSelector.setResolutionStrategy(new androidx.camera.core.resolutionselector.ResolutionStrategy(defaultTargetResolution, 1));
            }
            if (resolutionSelector == null) {
                fromResolutionSelector.setResolutionFilter(new androidx.camera.core.resolutionselector.ResolutionFilter() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda3
                    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                    public final java.util.List filter(java.util.List list, int i) {
                        return androidx.camera.core.ImageAnalysis.getHighSpeedVideoFpsRangesFor(defaultTargetResolution, list);
                    }
                });
            }
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, fromResolutionSelector.build());
        }
        return builder.getUseCaseConfig();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(android.util.Size size, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        final androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer;
        boolean z;
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2;
        androidx.camera.core.impl.DeferrableSurface deferrableSurface;
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener;
        androidx.camera.core.ImageAnalysis.Analyzer analyzer;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        android.util.Size resolution = streamSpec.getResolution();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(imageAnalysisConfig.getBackgroundExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor()));
        boolean z2 = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        if (imageAnalysisConfig.getImageReaderProxyProvider() != null) {
            safeCloseImageReaderProxy = new androidx.camera.core.SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, 0L));
        } else {
            safeCloseImageReaderProxy = new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth));
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig2 = (androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig();
                if (imageAnalysisConfig2.getBackpressureStrategy(0) == 1) {
                    this.Camera2StreamConfigurationMap = new androidx.camera.core.ImageAnalysisBlockingAnalyzer();
                } else {
                    this.Camera2StreamConfigurationMap = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig2.getBackgroundExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor()));
                }
                this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI = getOutputImageFormat();
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor = isOutputImageRotationEnabled();
                androidx.camera.core.impl.CameraInternal camera = getCamera();
                java.lang.Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
                boolean contains = camera != null ? camera.getCamera2StreamConfigurationMap().getCameraQuirks().contains(androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class) : false;
                androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer2 = this.Camera2StreamConfigurationMap;
                if (onePixelShiftEnabled != null) {
                    contains = onePixelShiftEnabled.booleanValue();
                }
                imageAnalysisAbstractAnalyzer2.Camera2StreamConfigurationMap = contains;
                if (camera != null) {
                    this.Camera2StreamConfigurationMap.getOutputFormats = getRelativeRotation(camera);
                }
                android.graphics.Rect rect = this.getOutputFormats;
                if (rect != null) {
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(rect);
                }
                android.graphics.Matrix matrix = this.getInputSizeshNQ4ISI;
                if (matrix != null) {
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(matrix);
                }
                java.util.concurrent.Executor executor2 = this.getInputFormats;
                if (executor2 != null && (analyzer = this.getOutputMinFrameDuration) != null) {
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(executor2, analyzer);
                }
            }
            imageAnalysisAbstractAnalyzer = this.Camera2StreamConfigurationMap;
        }
        if (getCamera() != null) {
            androidx.camera.core.impl.CameraInternal camera2 = getCamera();
            if (isOutputImageRotationEnabled() && getRelativeRotation(camera2) % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 0) {
                z = true;
                int height = !z ? resolution.getHeight() : resolution.getWidth();
                int width = !z ? resolution.getWidth() : resolution.getHeight();
                int i = getOutputImageFormat() != 2 ? 1 : 35;
                boolean z3 = getImageFormat() != 35 && getOutputImageFormat() == 2;
                boolean z4 = getImageFormat() != 35 && getOutputImageFormat() == 3;
                if (getImageFormat() == 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !java.lang.Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
                    z2 = false;
                }
                safeCloseImageReaderProxy2 = (!z3 || (z2 && !z4)) ? new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(height, width, i, safeCloseImageReaderProxy.getMaxImages())) : null;
                if (safeCloseImageReaderProxy2 != null) {
                    synchronized (imageAnalysisAbstractAnalyzer.getHighSpeedVideoFpsRanges) {
                        imageAnalysisAbstractAnalyzer.getInputFormats = safeCloseImageReaderProxy2;
                    }
                }
                getHighSpeedVideoSizes();
                safeCloseImageReaderProxy.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, executor);
                androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
                if (streamSpec.getImplementationOptions() != null) {
                    createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
                }
                deferrableSurface = this.getHighSpeedVideoSizesFor;
                if (deferrableSurface != null) {
                    deferrableSurface.close();
                }
                androidx.camera.core.impl.ImmediateSurface immediateSurface = new androidx.camera.core.impl.ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
                this.getHighSpeedVideoSizesFor = immediateSurface;
                immediateSurface.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.ImageAnalysis.getHighSpeedVideoSizes(androidx.camera.core.SafeCloseImageReaderProxy.this, safeCloseImageReaderProxy2);
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
                createFrom.setSessionType(streamSpec.getSessionType());
                applyExpectedFrameRateRange(createFrom, streamSpec);
                createFrom.addSurface(this.getHighSpeedVideoSizesFor, streamSpec.getDynamicRange(), null, -1);
                closeableErrorListener = this.getHighSpeedVideoSizes;
                if (closeableErrorListener != null) {
                    closeableErrorListener.close();
                }
                androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda1
                    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                    public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                        androidx.camera.core.ImageAnalysis.this.getHighResolutionOutputSizeshNQ4ISI(imageAnalysisAbstractAnalyzer);
                    }
                });
                this.getHighSpeedVideoSizes = closeableErrorListener2;
                createFrom.setErrorListener(closeableErrorListener2);
                return createFrom;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        if (getOutputImageFormat() != 2) {
        }
        if (getImageFormat() != 35) {
        }
        if (getImageFormat() != 35) {
        }
        if (getImageFormat() == 35) {
        }
        z2 = false;
        if (z3) {
        }
        if (safeCloseImageReaderProxy2 != null) {
        }
        getHighSpeedVideoSizes();
        safeCloseImageReaderProxy.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, executor);
        androidx.camera.core.impl.SessionConfig.Builder createFrom2 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
        }
        deferrableSurface = this.getHighSpeedVideoSizesFor;
        if (deferrableSurface != null) {
        }
        androidx.camera.core.impl.ImmediateSurface immediateSurface2 = new androidx.camera.core.impl.ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.getHighSpeedVideoSizesFor = immediateSurface2;
        immediateSurface2.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.ImageAnalysis.getHighSpeedVideoSizes(androidx.camera.core.SafeCloseImageReaderProxy.this, safeCloseImageReaderProxy2);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        createFrom2.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(createFrom2, streamSpec);
        createFrom2.addSurface(this.getHighSpeedVideoSizesFor, streamSpec.getDynamicRange(), null, -1);
        closeableErrorListener = this.getHighSpeedVideoSizes;
        if (closeableErrorListener != null) {
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener22 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.ImageAnalysis.this.getHighResolutionOutputSizeshNQ4ISI(imageAnalysisAbstractAnalyzer);
            }
        });
        this.getHighSpeedVideoSizes = closeableErrorListener22;
        createFrom2.setErrorListener(closeableErrorListener22);
        return createFrom2;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy, androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        if (getCamera() == null) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        imageAnalysisAbstractAnalyzer.getHighResolutionOutputSizeshNQ4ISI();
        getCameraId();
        androidx.camera.core.impl.SessionConfig.Builder highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig(), (androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(getAttachedStreamSpec()));
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{highSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        notifyReset();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getHighSpeedVideoSizes;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.getHighSpeedVideoSizes = null;
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getHighSpeedVideoSizesFor;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    public final void clearAnalyzer() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.Camera2StreamConfigurationMap;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.getHighSpeedVideoSizes(null, null);
            }
            if (this.getOutputMinFrameDuration != null) {
                notifyInactive();
            }
            this.getInputFormats = null;
            this.getOutputMinFrameDuration = null;
        }
    }

    public final int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public final void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            getHighSpeedVideoSizes();
        }
    }

    @Override // androidx.camera.core.UseCase
    protected final void onProviderRotationChanged(int i) {
        setTargetRotation(i);
    }

    public final void setAnalyzer(java.util.concurrent.Executor executor, final androidx.camera.core.ImageAnalysis.Analyzer analyzer) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.Camera2StreamConfigurationMap;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.getHighSpeedVideoSizes(executor, new androidx.camera.core.ImageAnalysis.Analyzer() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda2
                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public final void analyze(androidx.camera.core.ImageProxy imageProxy) {
                        androidx.camera.core.ImageAnalysis.Analyzer.this.analyze(imageProxy);
                    }
                });
            }
            if (this.getOutputMinFrameDuration == null) {
                notifyActive();
            }
            this.getInputFormats = executor;
            this.getOutputMinFrameDuration = analyzer;
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(android.graphics.Rect rect) {
        super.setViewPortCropRect(rect);
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.Camera2StreamConfigurationMap;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.getHighSpeedVideoFpsRangesFor(rect);
            }
            this.getOutputFormats = rect;
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void setSensorToBufferTransformMatrix(android.graphics.Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.Camera2StreamConfigurationMap;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.getHighSpeedVideoFpsRanges(matrix);
            }
            this.getInputSizeshNQ4ISI = matrix;
        }
    }

    public final int getBackpressureStrategy() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    public final java.util.concurrent.Executor getBackgroundExecutor() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getBackgroundExecutor(null);
    }

    public final int getImageQueueDepth() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public final int getOutputImageFormat() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public final boolean isOutputImageRotationEnabled() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(java.lang.Boolean.FALSE).booleanValue();
    }

    public final java.lang.Boolean getOnePixelShiftEnabled() {
        return ((androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(getHighSpeedVideoFpsRanges);
    }

    public final androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public final androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageAnalysis:");
        sb.append(getName());
        return sb.toString();
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        getHighSpeedVideoFpsRangesFor();
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.ImageAnalysis.Defaults defaults = DEFAULT_CONFIG;
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
        return androidx.camera.core.ImageAnalysis.Builder.getHighResolutionOutputSizeshNQ4ISI(config);
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onSuggestedStreamSpecUpdated: primaryStreamSpec = ");
        sb.append(streamSpec);
        sb.append(", secondaryStreamSpec ");
        sb.append(streamSpec2);
        androidx.camera.core.Logger.d("ImageAnalysis", sb.toString());
        androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig = (androidx.camera.core.impl.ImageAnalysisConfig) getCurrentConfig();
        getCameraId();
        androidx.camera.core.impl.SessionConfig.Builder highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(imageAnalysisConfig, streamSpec);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{highSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        this.getHighSpeedVideoFpsRangesFor.addImplementationOptions(config);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    private void getHighSpeedVideoSizes() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.core.impl.CameraInternal camera = getCamera();
            if (camera != null) {
                this.Camera2StreamConfigurationMap.getOutputFormats = getRelativeRotation(camera);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageAnalysisConfig> {
        private static final androidx.camera.core.impl.ImageAnalysisConfig Camera2StreamConfigurationMap;
        private static final androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI;
        private static final android.util.Size getHighSpeedVideoFpsRanges;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector getHighSpeedVideoSizes;

        static {
            android.util.Size size = new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            getHighSpeedVideoFpsRanges = size;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
            getHighResolutionOutputSizeshNQ4ISI = dynamicRange;
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new androidx.camera.core.resolutionselector.ResolutionStrategy(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA, 1)).build();
            getHighSpeedVideoSizes = build;
            Camera2StreamConfigurationMap = new androidx.camera.core.ImageAnalysis.Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).setResolutionSelector(build).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public final androidx.camera.core.impl.ImageAnalysisConfig getConfig() {
            return Camera2StreamConfigurationMap;
        }
    }

    public static final class Builder implements androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageAnalysis, androidx.camera.core.impl.ImageAnalysisConfig, androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoFpsRanges;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.ImageAnalysis>) cls);
        }

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.getHighSpeedVideoFpsRanges = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.ImageAnalysis.class)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
                sb.append(this);
                sb.append(": ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            setTargetClass(androidx.camera.core.ImageAnalysis.class);
        }

        static androidx.camera.core.ImageAnalysis.Builder getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.ImageAnalysis.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        public static androidx.camera.core.ImageAnalysis.Builder fromConfig(androidx.camera.core.impl.ImageAnalysisConfig imageAnalysisConfig) {
            return new androidx.camera.core.ImageAnalysis.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) imageAnalysisConfig));
        }

        public final androidx.camera.core.ImageAnalysis.Builder setBackpressureStrategy(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageAnalysis.Builder setImageQueueDepth(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageAnalysis.Builder setOutputImageFormat(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageAnalysis.Builder setOutputImageRotationEnabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        public final androidx.camera.core.ImageAnalysis.Builder setOnePixelShiftEnabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.impl.ImageAnalysisConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.ImageAnalysisConfig(androidx.camera.core.impl.OptionsBundle.from(this.getHighSpeedVideoFpsRanges));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.ImageAnalysis build() {
            androidx.camera.core.impl.ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            return new androidx.camera.core.ImageAnalysis(useCaseConfig);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setTargetClass(java.lang.Class<androidx.camera.core.ImageAnalysis> cls) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_NAME, null) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append("-");
                sb.append(java.util.UUID.randomUUID());
                setTargetName(sb.toString());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.ImageAnalysis.Builder setTargetAspectRatio(int i) {
            if (i == -1) {
                i = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setMirrorMode(int i) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.ImageAnalysis.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setBackgroundExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageAnalysis.Builder setImageReaderProxyProvider(androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setZslDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public final androidx.camera.core.ImageAnalysis.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (!java.util.Objects.equals(androidx.camera.core.DynamicRange.SDR, dynamicRange)) {
                throw new java.lang.UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }
    }
}
