package androidx.camera.view;

/* loaded from: classes6.dex */
public abstract class CameraController {

    @java.lang.Deprecated
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;
    private static final androidx.camera.core.ImageCapture.ScreenFlash d = new androidx.camera.core.ImageCapture.ScreenFlash() { // from class: androidx.camera.view.CameraController.1
        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void clear() {
        }

        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void apply(long j, androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener) {
            screenFlashListener.onCompleted();
        }
    };
    private androidx.camera.core.ImageAnalysis.Analyzer AMEXKernel;
    private androidx.camera.core.DynamicRange AMEXKernelCallback;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> AMEXKernela;
    long ArtificialStackFrames;
    androidx.camera.core.CameraSelector Camera2StreamConfigurationMap;
    final androidx.camera.view.RotationProvider CoroutineDebuggingKt;
    androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> _BOUNDARY;
    final androidx.view.MutableLiveData<androidx.camera.view.TapToFocusInfo> _CREATION;

    /* renamed from: a, reason: collision with root package name */
    androidx.camera.video.QualitySelector f2678a;
    androidx.camera.core.SessionConfig accessartificialFrame;
    final androidx.view.LiveData<java.lang.Integer> b;
    private final android.content.Context c;
    androidx.camera.core.Preview.SurfaceProvider coroutineBoundary;
    boolean coroutineCreation;
    private final androidx.camera.view.PendingValue<java.lang.Float> exchange;
    private final androidx.camera.view.ForwardingLiveData<androidx.camera.core.ZoomState> free;
    androidx.camera.core.ViewPort getARTIFICIAL_FRAME_PACKAGE_NAME;
    androidx.camera.view.ProcessCameraProviderWrapper getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.view.RotationProvider.Listener getHighSpeedVideoFpsRanges;
    androidx.camera.core.Camera getHighSpeedVideoFpsRangesFor;
    androidx.camera.video.Recording getHighSpeedVideoSizes;
    androidx.camera.view.CameraController.FocusMeteringResultCallback getHighSpeedVideoSizesFor;
    androidx.camera.core.resolutionselector.ResolutionSelector getInputFormats;
    androidx.camera.view.CameraController.OutputSize getInputSizeshNQ4ISI;
    int getOutputFormats;
    androidx.camera.core.ImageAnalysis getOutputMinFrameDuration;
    java.util.concurrent.Executor getOutputMinFrameDurationlomOqCM;
    androidx.camera.core.resolutionselector.ResolutionSelector getOutputSizes;
    androidx.camera.view.CameraController.OutputSize getOutputSizeshNQ4ISI;
    androidx.camera.core.ImageCapture getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    androidx.camera.core.resolutionselector.ResolutionSelector getValidOutputFormatsForInputhNQ4ISI;
    private java.util.concurrent.Executor init;
    androidx.camera.view.CameraController.OutputSize isOutputSupportedFor;
    androidx.camera.core.Preview isOutputSupportedForhNQ4ISI;
    private java.util.concurrent.Executor kernelVersion;
    private final androidx.camera.view.PendingValue<java.lang.Float> l;
    private final androidx.camera.view.PendingValue<java.lang.Boolean> release;
    private androidx.camera.core.DynamicRange requestGoOnline;
    private final java.util.Map<androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType, androidx.camera.view.internal.ScreenFlashUiInfo> requestPINEntry;
    private androidx.camera.core.SessionConfig resetTransaction;
    private android.util.Range<java.lang.Integer> rsaCipher;
    private int sha1;
    private final java.util.Set<androidx.camera.core.CameraEffect> startTransaction;
    boolean toString;
    java.util.Map<androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent>, androidx.camera.video.Recording> unwrapAs;
    private final androidx.camera.view.ForwardingLiveData<java.lang.Integer> updateUI;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface UseCases {
    }

    abstract androidx.camera.core.Camera getHighResolutionOutputSizeshNQ4ISI();

    CameraController(android.content.Context context) {
        this(context, androidx.camera.core.impl.utils.futures.Futures.transform(androidx.camera.lifecycle.ProcessCameraProvider.getInstance(context), new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda9
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return new androidx.camera.view.ProcessCameraProviderWrapperImpl((androidx.camera.lifecycle.ProcessCameraProvider) obj);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()));
    }

    private CameraController(android.content.Context context, com.google.common.util.concurrent.ListenableFuture<androidx.camera.view.ProcessCameraProviderWrapper> listenableFuture) {
        this.Camera2StreamConfigurationMap = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
        this.getOutputFormats = 3;
        this.getHighSpeedVideoSizes = null;
        this.unwrapAs = new java.util.HashMap();
        this.f2678a = androidx.camera.video.Recorder.DEFAULT_QUALITY_SELECTOR;
        this.sha1 = 0;
        this.AMEXKernelCallback = androidx.camera.core.DynamicRange.UNSPECIFIED;
        this.requestGoOnline = androidx.camera.core.DynamicRange.UNSPECIFIED;
        this.rsaCipher = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        this.getOutputStallDurationlomOqCM = -1;
        this.toString = true;
        this.coroutineCreation = true;
        this.free = new androidx.camera.view.ForwardingLiveData<>();
        this.updateUI = new androidx.camera.view.ForwardingLiveData<>();
        androidx.view.MutableLiveData<androidx.camera.view.TapToFocusInfo> mutableLiveData = new androidx.view.MutableLiveData<>(new androidx.camera.view.TapToFocusInfo(0, null));
        this._CREATION = mutableLiveData;
        this.b = androidx.camera.core.impl.utils.LiveDataUtil.map(mutableLiveData, new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda6
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((androidx.camera.view.TapToFocusInfo) obj).getFocusState());
            }
        });
        this.release = new androidx.camera.view.PendingValue<>();
        this.exchange = new androidx.camera.view.PendingValue<>();
        this.l = new androidx.camera.view.PendingValue<>();
        this.startTransaction = new java.util.HashSet();
        this.requestPINEntry = new java.util.HashMap();
        this.ArtificialStackFrames = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(5000L);
        this.accessartificialFrame = null;
        this.resetTransaction = null;
        android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
        this.c = persistentApplicationContext;
        this.isOutputSupportedForhNQ4ISI = getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges((java.lang.Integer) null);
        this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null);
        this._BOUNDARY = getHighSpeedVideoSizesFor();
        this.AMEXKernela = androidx.camera.core.impl.utils.futures.Futures.transform(listenableFuture, new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda7
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                androidx.camera.view.CameraController cameraController = androidx.camera.view.CameraController.this;
                cameraController.getHighResolutionOutputSizeshNQ4ISI = (androidx.camera.view.ProcessCameraProviderWrapper) obj;
                if (cameraController.accessartificialFrame == null) {
                    cameraController.getHighSpeedVideoFpsRangesFor();
                }
                cameraController.getHighSpeedVideoSizes((java.lang.Runnable) null);
                return null;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        this.CoroutineDebuggingKt = new androidx.camera.view.RotationProvider(persistentApplicationContext);
        this.getHighSpeedVideoFpsRanges = new androidx.camera.view.RotationProvider.Listener() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda8
            @Override // androidx.camera.view.RotationProvider.Listener
            public final void onRotationChanged(int i) {
                androidx.camera.view.CameraController cameraController = androidx.camera.view.CameraController.this;
                cameraController.getOutputStallDurationlomOqCM = i;
                cameraController.getOutputMinFrameDuration.setTargetRotation(i);
                cameraController.getOutputStallDuration.setTargetRotation(i);
                cameraController._BOUNDARY.setTargetRotation(i);
            }
        };
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInitializationFuture() {
        return this.AMEXKernela;
    }

    public void setEnabledUseCases(final int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setEnabledUseCases");
        final int i2 = this.getOutputFormats;
        if (i == i2) {
            return;
        }
        this.getOutputFormats = i;
        if (!isVideoCaptureEnabled() && isRecording()) {
            getOutputMinFrameDuration();
        }
        getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.CameraController cameraController = androidx.camera.view.CameraController.this;
                int i3 = i2;
                int i4 = i;
                cameraController.getOutputFormats = i3;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setEnabledUseCases: failed to enable use cases properly for enabledUseCases = ");
                sb.append(java.lang.Integer.toBinaryString(i4));
                sb.append(", restoring back previous values ");
                sb.append(java.lang.Integer.toBinaryString(i3));
                androidx.camera.core.Logger.w("CameraController", sb.toString());
            }
        });
    }

    public void setSessionConfig(androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.CameraSelector cameraSelector) {
        boolean isSessionConfigSupported;
        androidx.camera.core.SessionConfig sessionConfig2;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame == sessionConfig && this.Camera2StreamConfigurationMap == cameraSelector) {
            return;
        }
        if (sessionConfig instanceof androidx.camera.video.HighSpeedVideoSessionConfig) {
            throw new java.lang.IllegalArgumentException("CameraController does not support HighSpeedVideoSessionConfig!");
        }
        androidx.camera.core.ImageCapture findImageCapture = androidx.camera.core.impl.utils.UseCaseUtil.findImageCapture(sessionConfig.getUseCases());
        if (findImageCapture != null) {
            getHighSpeedVideoSizes(findImageCapture, cameraSelector);
        }
        if (isRecording()) {
            getOutputMinFrameDuration();
        }
        if (this.accessartificialFrame == null) {
            getOutputFormats();
        } else {
            androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
            if (processCameraProviderWrapper != null && (sessionConfig2 = this.resetTransaction) != null) {
                processCameraProviderWrapper.getHighResolutionOutputSizeshNQ4ISI(sessionConfig2);
            }
        }
        androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (processCameraProviderWrapper2 != null) {
            androidx.core.util.Preconditions.checkState(processCameraProviderWrapper2 != null, "Camera not initialized.");
            androidx.camera.core.CameraInfo highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(cameraSelector);
            if (sessionConfig != null) {
                isSessionConfigSupported = highSpeedVideoFpsRanges.isSessionConfigSupported(sessionConfig);
            } else {
                isSessionConfigSupported = highSpeedVideoFpsRanges.isSessionConfigSupported(new androidx.camera.core.SessionConfig.Builder(createUseCaseGroup(false).getUseCases()).build());
            }
            if (!isSessionConfigSupported) {
                throw new java.lang.IllegalArgumentException("The camera resolved by the camera selector can not support the session config.");
            }
        }
        final int i = this.getOutputFormats;
        this.getOutputFormats = getHighSpeedVideoSizes(sessionConfig);
        final androidx.camera.core.SessionConfig sessionConfig3 = this.accessartificialFrame;
        final androidx.camera.core.CameraSelector cameraSelector2 = this.Camera2StreamConfigurationMap;
        this.accessartificialFrame = sessionConfig;
        this.Camera2StreamConfigurationMap = cameraSelector;
        getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.CameraController cameraController = androidx.camera.view.CameraController.this;
                int i2 = i;
                androidx.camera.core.SessionConfig sessionConfig4 = sessionConfig3;
                androidx.camera.core.CameraSelector cameraSelector3 = cameraSelector2;
                cameraController.getOutputFormats = i2;
                cameraController.accessartificialFrame = sessionConfig4;
                cameraController.Camera2StreamConfigurationMap = cameraSelector3;
                if (sessionConfig4 != null) {
                    cameraController.getHighSpeedVideoSizes(sessionConfig4);
                }
                androidx.camera.core.Logger.w("CameraController", "Failed to set the session config, restoring back previous values!");
            }
        });
    }

    final int getHighSpeedVideoSizes(androidx.camera.core.SessionConfig sessionConfig) {
        java.util.List<androidx.camera.core.UseCase> useCases = sessionConfig.getUseCases();
        androidx.camera.core.Preview findPreview = androidx.camera.core.impl.utils.UseCaseUtil.findPreview(useCases);
        int i = 0;
        androidx.core.util.Preconditions.checkArgument(findPreview != null, "A Preview is required for using CameraController!");
        androidx.camera.core.UseCase findVideoCapture = androidx.camera.core.impl.utils.UseCaseUtil.findVideoCapture(useCases);
        if (findVideoCapture instanceof androidx.camera.video.VideoCapture) {
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> videoCapture = (androidx.camera.video.VideoCapture) findVideoCapture;
            androidx.core.util.Preconditions.checkArgument(videoCapture.getOutput() instanceof androidx.camera.video.Recorder, "To set a SessionConfig to the CameraController, the VideoCapture inside must use a Recorder as its Output!");
            this._BOUNDARY = videoCapture;
            i = 4;
        } else {
            this._BOUNDARY = getHighSpeedVideoSizesFor();
        }
        this.isOutputSupportedForhNQ4ISI = findPreview;
        findPreview.setSurfaceProvider(this.coroutineBoundary);
        androidx.camera.core.ImageCapture findImageCapture = androidx.camera.core.impl.utils.UseCaseUtil.findImageCapture(useCases);
        if (findImageCapture != null) {
            i |= 1;
            this.getOutputStallDuration = findImageCapture;
        } else {
            this.getOutputStallDuration = getHighSpeedVideoFpsRanges((java.lang.Integer) null);
        }
        androidx.camera.core.ImageAnalysis findImageAnalysis = androidx.camera.core.impl.utils.UseCaseUtil.findImageAnalysis(useCases);
        if (findImageAnalysis != null) {
            this.getOutputMinFrameDuration = findImageAnalysis;
            return i | 2;
        }
        this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null);
        return i;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.ImageOutputConfig.Builder<?> builder, androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector, androidx.camera.view.CameraController.OutputSize outputSize) {
        if (resolutionSelector != null) {
            builder.setResolutionSelector(resolutionSelector);
            return;
        }
        if (outputSize == null) {
            androidx.camera.core.ViewPort viewPort = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (viewPort != null) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(viewPort);
                androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy = highResolutionOutputSizeshNQ4ISI != -1 ? new androidx.camera.core.resolutionselector.AspectRatioStrategy(highResolutionOutputSizeshNQ4ISI, 1) : null;
                if (aspectRatioStrategy != null) {
                    builder.setResolutionSelector(new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(aspectRatioStrategy).build());
                    return;
                }
                return;
            }
            return;
        }
        if (outputSize != null) {
            if (outputSize.getResolution() != null) {
                builder.setTargetResolution(outputSize.getResolution());
            } else if (outputSize.getAspectRatio() != -1) {
                builder.setTargetAspectRatio(outputSize.getAspectRatio());
            } else {
                androidx.camera.core.Logger.e("CameraController", "Invalid target surface size. ".concat(java.lang.String.valueOf(outputSize)));
            }
        }
    }

    final void Camera2StreamConfigurationMap() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration, this.getOutputMinFrameDuration, this._BOUNDARY);
        }
        this.isOutputSupportedForhNQ4ISI.setSurfaceProvider(null);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.coroutineBoundary = null;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
        this.CoroutineDebuggingKt.removeListener(this.getHighSpeedVideoFpsRanges);
    }

    @java.lang.Deprecated
    public void setPreviewTargetSize(androidx.camera.view.CameraController.OutputSize outputSize) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setPreviewTargetSize");
        androidx.camera.view.CameraController.OutputSize outputSize2 = this.isOutputSupportedFor;
        if (outputSize2 == outputSize) {
            return;
        }
        if (outputSize2 == null || !outputSize2.equals(outputSize)) {
            this.isOutputSupportedFor = outputSize;
            getHighSpeedVideoFpsRanges(true);
            getHighSpeedVideoSizes((java.lang.Runnable) null);
        }
    }

    @java.lang.Deprecated
    public androidx.camera.view.CameraController.OutputSize getPreviewTargetSize() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame == null) {
            return this.isOutputSupportedFor;
        }
        return null;
    }

    public void setPreviewResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setPreviewResolutionSelector");
        if (this.getValidOutputFormatsForInputhNQ4ISI == resolutionSelector) {
            return;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = resolutionSelector;
        getHighSpeedVideoFpsRanges(true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getPreviewResolutionSelector() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this.isOutputSupportedForhNQ4ISI.getResolutionSelector();
        }
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setPreviewDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setPreviewDynamicRange");
        this.requestGoOnline = dynamicRange;
        getHighSpeedVideoFpsRanges(true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.core.DynamicRange getPreviewDynamicRange() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.accessartificialFrame == null ? this.requestGoOnline : this.isOutputSupportedForhNQ4ISI.getDynamicRange();
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        if (z) {
            getOutputFormats();
        }
        androidx.camera.core.Preview highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        this.isOutputSupportedForhNQ4ISI = highSpeedVideoFpsRanges;
        androidx.camera.core.Preview.SurfaceProvider surfaceProvider = this.coroutineBoundary;
        if (surfaceProvider != null) {
            highSpeedVideoFpsRanges.setSurfaceProvider(surfaceProvider);
        }
    }

    private androidx.camera.core.Preview getHighSpeedVideoFpsRanges() {
        androidx.camera.core.Preview.Builder builder = new androidx.camera.core.Preview.Builder();
        getHighResolutionOutputSizeshNQ4ISI(builder, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedFor);
        builder.setDynamicRange(this.requestGoOnline);
        return builder.build();
    }

    public boolean isImageCaptureEnabled() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return (this.getOutputFormats & 1) != 0;
    }

    public int getImageCaptureFlashMode() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputStallDuration.getFlashMode();
    }

    public void setImageCaptureFlashMode(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null && !isImageCaptureEnabled()) {
            throw new java.lang.IllegalStateException("A SessionConfig is set and it doesn't contain an ImageCapture.");
        }
        if (i == 3) {
            java.lang.Integer lensFacing = this.Camera2StreamConfigurationMap.getLensFacing();
            if (lensFacing != null && lensFacing.intValue() != 0) {
                throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            updateScreenFlashToImageCapture();
        }
        this.getOutputStallDuration.setFlashMode(i);
    }

    public void setScreenFlashUiInfo(androidx.camera.view.internal.ScreenFlashUiInfo screenFlashUiInfo) {
        androidx.camera.view.internal.ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        this.requestPINEntry.put(screenFlashUiInfo.getProviderType(), screenFlashUiInfo);
        androidx.camera.view.internal.ScreenFlashUiInfo screenFlashUiInfoByPriority2 = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority2 == null || screenFlashUiInfoByPriority2.equals(screenFlashUiInfoByPriority)) {
            return;
        }
        updateScreenFlashToImageCapture();
    }

    public void updateScreenFlashToImageCapture() {
        androidx.camera.view.internal.ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority == null) {
            androidx.camera.core.Logger.d("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.getOutputStallDuration.setScreenFlash(d);
        } else {
            this.getOutputStallDuration.setScreenFlash(screenFlashUiInfoByPriority.getScreenFlash());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Set ScreenFlash instance to ImageCapture, provided by ");
            sb.append(screenFlashUiInfoByPriority.getProviderType().name());
            androidx.camera.core.Logger.d("CameraController", sb.toString());
        }
    }

    public androidx.camera.view.internal.ScreenFlashUiInfo getScreenFlashUiInfoByPriority() {
        if (this.requestPINEntry.get(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW) != null) {
            return this.requestPINEntry.get(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW);
        }
        if (this.requestPINEntry.get(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW) != null) {
            return this.requestPINEntry.get(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW);
        }
        return null;
    }

    public void takePicture(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI != null, "Camera not initialized.");
        androidx.core.util.Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        getInputFormats();
        if (this.Camera2StreamConfigurationMap.getLensFacing() != null && !outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            outputFileOptions.getMetadata().setReversedHorizontal(this.Camera2StreamConfigurationMap.getLensFacing().intValue() == 0);
        }
        this.getOutputStallDuration.takePicture(outputFileOptions, executor, onImageSavedCallback);
    }

    public void takePicture(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI != null, "Camera not initialized.");
        androidx.core.util.Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        getInputFormats();
        this.getOutputStallDuration.takePicture(executor, onImageCapturedCallback);
    }

    private void getInputFormats() {
        if (getImageCaptureFlashMode() == 3) {
            if (getScreenFlashUiInfoByPriority() == null || getScreenFlashUiInfoByPriority().getScreenFlash() == null) {
                throw new java.lang.IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            }
        }
    }

    public void setImageCaptureMode(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageCaptureMode");
        if (this.getOutputStallDuration.getCaptureMode() == i) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        getOutputFormats();
        int flashMode = this.getOutputStallDuration.getFlashMode();
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges(valueOf);
        setImageCaptureFlashMode(flashMode);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public int getImageCaptureMode() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputStallDuration.getCaptureMode();
    }

    @java.lang.Deprecated
    public void setImageCaptureTargetSize(androidx.camera.view.CameraController.OutputSize outputSize) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageCaptureTargetSize");
        androidx.camera.view.CameraController.OutputSize outputSize2 = this.getOutputSizeshNQ4ISI;
        if (outputSize2 == outputSize) {
            return;
        }
        if (outputSize2 == null || !outputSize2.equals(outputSize)) {
            this.getOutputSizeshNQ4ISI = outputSize;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(getImageCaptureMode());
            getOutputFormats();
            int flashMode = this.getOutputStallDuration.getFlashMode();
            this.getOutputStallDuration = getHighSpeedVideoFpsRanges(valueOf);
            setImageCaptureFlashMode(flashMode);
            getHighSpeedVideoSizes((java.lang.Runnable) null);
        }
    }

    @java.lang.Deprecated
    public androidx.camera.view.CameraController.OutputSize getImageCaptureTargetSize() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame == null) {
            return this.getOutputSizeshNQ4ISI;
        }
        return null;
    }

    public void setImageCaptureResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageCaptureResolutionSelector");
        if (this.getOutputSizes == resolutionSelector) {
            return;
        }
        this.getOutputSizes = resolutionSelector;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getImageCaptureMode());
        getOutputFormats();
        int flashMode = this.getOutputStallDuration.getFlashMode();
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges(valueOf);
        setImageCaptureFlashMode(flashMode);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getImageCaptureResolutionSelector() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this.getOutputStallDuration.getResolutionSelector();
        }
        return this.getOutputSizes;
    }

    public void setImageCaptureIoExecutor(java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageCaptureIoExecutor");
        if (this.getOutputMinFrameDurationlomOqCM == executor) {
            return;
        }
        this.getOutputMinFrameDurationlomOqCM = executor;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getImageCaptureMode());
        getOutputFormats();
        int flashMode = this.getOutputStallDuration.getFlashMode();
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges(valueOf);
        setImageCaptureFlashMode(flashMode);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public java.util.concurrent.Executor getImageCaptureIoExecutor() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return ((androidx.camera.core.impl.ImageCaptureConfig) this.getOutputStallDuration.getCurrentConfig()).getIoExecutor(null);
        }
        return this.getOutputMinFrameDurationlomOqCM;
    }

    private androidx.camera.core.ImageCapture getHighSpeedVideoFpsRanges(java.lang.Integer num) {
        androidx.camera.core.ImageCapture.Builder builder = new androidx.camera.core.ImageCapture.Builder();
        if (num != null) {
            builder.setCaptureMode(num.intValue());
        }
        getHighResolutionOutputSizeshNQ4ISI(builder, this.getOutputSizes, this.getOutputSizeshNQ4ISI);
        java.util.concurrent.Executor executor = this.getOutputMinFrameDurationlomOqCM;
        if (executor != null) {
            builder.setIoExecutor(executor);
        }
        int i = this.getOutputStallDurationlomOqCM;
        if (i != -1) {
            builder.setTargetRotation(i);
        }
        return builder.build();
    }

    public boolean isImageAnalysisEnabled() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return (this.getOutputFormats & 2) != 0;
    }

    public void setImageAnalysisAnalyzer(java.util.concurrent.Executor executor, androidx.camera.core.ImageAnalysis.Analyzer analyzer) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisAnalyzer");
        androidx.camera.core.ImageAnalysis.Analyzer analyzer2 = this.AMEXKernel;
        if (analyzer2 == analyzer && this.kernelVersion == executor) {
            return;
        }
        this.kernelVersion = executor;
        this.AMEXKernel = analyzer;
        this.getOutputMinFrameDuration.setAnalyzer(executor, analyzer);
        getHighSpeedVideoFpsRangesFor(analyzer2, analyzer);
    }

    public void clearImageAnalysisAnalyzer() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("clearImageAnalysisAnalyzer");
        androidx.camera.core.ImageAnalysis.Analyzer analyzer = this.AMEXKernel;
        this.kernelVersion = null;
        this.AMEXKernel = null;
        this.getOutputMinFrameDuration.clearAnalyzer();
        getHighSpeedVideoFpsRangesFor(analyzer, null);
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.camera.core.ImageAnalysis.Analyzer analyzer, androidx.camera.core.ImageAnalysis.Analyzer analyzer2) {
        if (java.util.Objects.equals(analyzer == null ? null : analyzer.getDefaultTargetResolution(), analyzer2 == null ? null : analyzer2.getDefaultTargetResolution())) {
            return;
        }
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public int getImageAnalysisBackpressureStrategy() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputMinFrameDuration.getBackpressureStrategy();
    }

    public void setImageAnalysisBackpressureStrategy(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisBackpressureStrategy");
        if (this.getOutputMinFrameDuration.getBackpressureStrategy() == i) {
            return;
        }
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public void setImageAnalysisImageQueueDepth(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisImageQueueDepth");
        if (this.getOutputMinFrameDuration.getImageQueueDepth() == i) {
            return;
        }
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public int getImageAnalysisImageQueueDepth() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputMinFrameDuration.getImageQueueDepth();
    }

    @java.lang.Deprecated
    public void setImageAnalysisTargetSize(androidx.camera.view.CameraController.OutputSize outputSize) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisTargetSize");
        androidx.camera.view.CameraController.OutputSize outputSize2 = this.getInputSizeshNQ4ISI;
        if (outputSize2 == outputSize) {
            return;
        }
        if (outputSize2 == null || !outputSize2.equals(outputSize)) {
            this.getInputSizeshNQ4ISI = outputSize;
            getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
            getHighSpeedVideoSizes((java.lang.Runnable) null);
        }
    }

    @java.lang.Deprecated
    public androidx.camera.view.CameraController.OutputSize getImageAnalysisTargetSize() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame == null) {
            return this.getInputSizeshNQ4ISI;
        }
        return null;
    }

    public void setImageAnalysisResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisResolutionSelector");
        if (this.getInputFormats == resolutionSelector) {
            return;
        }
        this.getInputFormats = resolutionSelector;
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getImageAnalysisResolutionSelector() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this.getOutputMinFrameDuration.getResolutionSelector();
        }
        return this.getInputFormats;
    }

    public void setImageAnalysisBackgroundExecutor(java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisBackgroundExecutor");
        if (this.init == executor) {
            return;
        }
        this.init = executor;
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), true);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public java.util.concurrent.Executor getImageAnalysisBackgroundExecutor() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this.getOutputMinFrameDuration.getBackgroundExecutor();
        }
        return this.init;
    }

    public void setImageAnalysisOutputImageFormat(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setImageAnalysisOutputImageFormat");
        if (i == this.getOutputMinFrameDuration.getOutputImageFormat()) {
            return;
        }
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(i), true);
    }

    public int getImageAnalysisOutputImageFormat() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputMinFrameDuration.getOutputImageFormat();
    }

    private void getHighSpeedVideoSizes(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, boolean z) {
        androidx.camera.core.ImageAnalysis.Analyzer analyzer;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (z) {
            getOutputFormats();
        }
        androidx.camera.core.ImageAnalysis highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(num, num2, num3);
        this.getOutputMinFrameDuration = highResolutionOutputSizeshNQ4ISI;
        java.util.concurrent.Executor executor = this.kernelVersion;
        if (executor == null || (analyzer = this.AMEXKernel) == null) {
            return;
        }
        highResolutionOutputSizeshNQ4ISI.setAnalyzer(executor, analyzer);
    }

    private androidx.camera.core.ImageAnalysis getHighResolutionOutputSizeshNQ4ISI(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        androidx.camera.core.ImageAnalysis.Builder builder = new androidx.camera.core.ImageAnalysis.Builder();
        if (num != null) {
            builder.setBackpressureStrategy(num.intValue());
        }
        if (num2 != null) {
            builder.setImageQueueDepth(num2.intValue());
        }
        if (num3 != null) {
            builder.setOutputImageFormat(num3.intValue());
        }
        getHighResolutionOutputSizeshNQ4ISI(builder, this.getInputFormats, this.getInputSizeshNQ4ISI);
        java.util.concurrent.Executor executor = this.init;
        if (executor != null) {
            builder.setBackgroundExecutor(executor);
        }
        int i = this.getOutputStallDurationlomOqCM;
        if (i != -1) {
            builder.setTargetRotation(i);
        }
        return builder.build();
    }

    final void Camera2StreamConfigurationMap(android.graphics.Matrix matrix) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.ImageAnalysis.Analyzer analyzer = this.AMEXKernel;
        if (analyzer == null || analyzer.getTargetCoordinateSystem() != 1) {
            return;
        }
        this.AMEXKernel.updateTransform(matrix);
    }

    public boolean isVideoCaptureEnabled() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return (this.getOutputFormats & 4) != 0;
    }

    public androidx.camera.video.Recording startRecording(androidx.camera.video.FileOutputOptions fileOutputOptions, androidx.camera.view.video.AudioConfig audioConfig, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer) {
        return getHighSpeedVideoSizes(fileOutputOptions, audioConfig, executor, consumer);
    }

    public androidx.camera.video.Recording startRecording(androidx.camera.video.FileDescriptorOutputOptions fileDescriptorOutputOptions, androidx.camera.view.video.AudioConfig audioConfig, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer) {
        return getHighSpeedVideoSizes(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    public androidx.camera.video.Recording startRecording(androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions, androidx.camera.view.video.AudioConfig audioConfig, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer) {
        return getHighSpeedVideoSizes(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    private androidx.camera.video.Recording getHighSpeedVideoSizes(androidx.camera.video.OutputOptions outputOptions, androidx.camera.view.video.AudioConfig audioConfig, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer) {
        androidx.camera.video.PendingRecording prepareRecording;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI != null, "Camera not initialized.");
        androidx.core.util.Preconditions.checkState(isVideoCaptureEnabled(), "VideoCapture disabled.");
        androidx.core.util.Preconditions.checkState(!isRecording(), "Recording video. Only one recording can be active at a time.");
        androidx.camera.view.CameraController.AnonymousClass2 anonymousClass2 = new androidx.camera.view.CameraController.AnonymousClass2(androidx.core.content.ContextCompat.getMainExecutor(this.c), consumer);
        androidx.camera.video.Recorder output = this._BOUNDARY.getOutput();
        if (outputOptions instanceof androidx.camera.video.FileOutputOptions) {
            prepareRecording = output.prepareRecording(this.c, (androidx.camera.video.FileOutputOptions) outputOptions);
        } else if (outputOptions instanceof androidx.camera.video.FileDescriptorOutputOptions) {
            prepareRecording = output.prepareRecording(this.c, (androidx.camera.video.FileDescriptorOutputOptions) outputOptions);
        } else if (outputOptions instanceof androidx.camera.video.MediaStoreOutputOptions) {
            prepareRecording = output.prepareRecording(this.c, (androidx.camera.video.MediaStoreOutputOptions) outputOptions);
        } else {
            throw new java.lang.IllegalArgumentException("Unsupported OutputOptions type.");
        }
        if (audioConfig.getAudioEnabled()) {
            if (androidx.core.content.PermissionChecker.checkSelfPermission(this.c, "android.permission.RECORD_AUDIO") != -1) {
                prepareRecording.withAudioEnabled();
            } else {
                throw new java.lang.SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
            }
        }
        androidx.camera.video.Recording start = prepareRecording.start(executor, anonymousClass2);
        this.unwrapAs.put(anonymousClass2, start);
        this.getHighSpeedVideoSizes = start;
        return start;
    }

    /* renamed from: androidx.camera.view.CameraController$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> {
        final /* synthetic */ androidx.core.util.Consumer getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.util.concurrent.Executor getHighSpeedVideoSizes;

        AnonymousClass2(java.util.concurrent.Executor executor, androidx.core.util.Consumer consumer) {
            this.getHighSpeedVideoSizes = executor;
            this.getHighSpeedVideoFpsRangesFor = consumer;
        }

        @Override // androidx.core.util.Consumer
        public /* synthetic */ void accept(androidx.camera.video.VideoRecordEvent videoRecordEvent) {
            androidx.camera.video.VideoRecordEvent videoRecordEvent2 = videoRecordEvent;
            if (videoRecordEvent2 instanceof androidx.camera.video.VideoRecordEvent.Finalize) {
                if (!androidx.camera.core.impl.utils.Threads.isMainThread()) {
                    this.getHighSpeedVideoSizes.execute(new java.lang.Runnable() { // from class: androidx.camera.view.CameraController$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.view.CameraController.AnonymousClass2 anonymousClass2 = androidx.camera.view.CameraController.AnonymousClass2.this;
                            androidx.camera.view.CameraController.this.getHighResolutionOutputSizeshNQ4ISI(anonymousClass2);
                        }
                    });
                } else {
                    androidx.camera.view.CameraController.this.getHighResolutionOutputSizeshNQ4ISI(this);
                }
            }
            this.getHighSpeedVideoFpsRangesFor.accept(videoRecordEvent2);
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer) {
        androidx.camera.video.Recording remove = this.unwrapAs.remove(consumer);
        if (remove == null || this.getHighSpeedVideoSizes != remove) {
            return;
        }
        this.getHighSpeedVideoSizes = null;
    }

    private void getOutputMinFrameDuration() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.video.Recording recording = this.getHighSpeedVideoSizes;
        if (recording != null) {
            recording.stop();
            this.getHighSpeedVideoSizes = null;
        }
    }

    public boolean isRecording() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.video.Recording recording = this.getHighSpeedVideoSizes;
        return (recording == null || recording.isClosed()) ? false : true;
    }

    public void setVideoCaptureQualitySelector(androidx.camera.video.QualitySelector qualitySelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setVideoCaptureQualitySelector");
        this.f2678a = qualitySelector;
        getOutputFormats();
        this._BOUNDARY = getHighSpeedVideoSizesFor();
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.video.QualitySelector getVideoCaptureQualitySelector() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this._BOUNDARY.getOutput().getQualitySelector();
        }
        return this.f2678a;
    }

    public void setVideoCaptureMirrorMode(int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setVideoCaptureMirrorMode");
        this.sha1 = i;
        getOutputFormats();
        this._BOUNDARY = getHighSpeedVideoSizesFor();
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public int getVideoCaptureMirrorMode() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this._BOUNDARY.getMirrorMode();
        }
        return this.sha1;
    }

    public void setVideoCaptureDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setVideoCaptureDynamicRange");
        this.AMEXKernelCallback = dynamicRange;
        getOutputFormats();
        this._BOUNDARY = getHighSpeedVideoSizesFor();
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public androidx.camera.core.DynamicRange getVideoCaptureDynamicRange() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this._BOUNDARY.getDynamicRange();
        }
        return this.AMEXKernelCallback;
    }

    public void setVideoCaptureTargetFrameRate(android.util.Range<java.lang.Integer> range) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setVideoCaptureTargetFrameRate");
        this.rsaCipher = range;
        getOutputFormats();
        this._BOUNDARY = getHighSpeedVideoSizesFor();
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public android.util.Range<java.lang.Integer> getVideoCaptureTargetFrameRate() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.accessartificialFrame != null) {
            return this._BOUNDARY.getTargetFrameRate();
        }
        return this.rsaCipher;
    }

    private androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> getHighSpeedVideoSizesFor() {
        int highResolutionOutputSizeshNQ4ISI;
        androidx.camera.video.Recorder.Builder qualitySelector = new androidx.camera.video.Recorder.Builder().setQualitySelector(this.f2678a);
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME != null && this.f2678a == androidx.camera.video.Recorder.DEFAULT_QUALITY_SELECTOR && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getARTIFICIAL_FRAME_PACKAGE_NAME)) != -1) {
            qualitySelector.setAspectRatio(highResolutionOutputSizeshNQ4ISI);
        }
        androidx.camera.video.VideoCapture.Builder dynamicRange = new androidx.camera.video.VideoCapture.Builder(qualitySelector.build()).setTargetFrameRate(this.rsaCipher).setMirrorMode(this.sha1).setDynamicRange(this.AMEXKernelCallback);
        int i = this.getOutputStallDurationlomOqCM;
        if (i != -1) {
            dynamicRange.setTargetRotation(i);
        }
        return dynamicRange.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.ViewPort viewPort) {
        int i;
        java.lang.String obj;
        boolean z;
        int relativeImageRotation;
        android.util.Rational aspectRatio;
        androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper;
        int surfaceRotationToDegrees = viewPort == null ? 0 : androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(viewPort.getRotation());
        try {
            processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        } catch (java.lang.IllegalArgumentException e) {
            e = e;
            i = 0;
        }
        if (processCameraProviderWrapper != null) {
            androidx.camera.core.CameraInfo highSpeedVideoFpsRanges = processCameraProviderWrapper.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
            i = highSpeedVideoFpsRanges.getSensorRotationDegrees();
            try {
            } catch (java.lang.IllegalArgumentException e2) {
                e = e2;
                androidx.camera.core.CameraSelector cameraSelector = this.Camera2StreamConfigurationMap;
                if (cameraSelector == null) {
                    obj = "null";
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraSelector{");
                    java.lang.Integer lensFacing = cameraSelector.getLensFacing();
                    if (lensFacing != null) {
                        int intValue = lensFacing.intValue();
                        if (intValue == 0) {
                            sb.append("lensFacing=FRONT");
                        } else if (intValue == 1) {
                            sb.append("lensFacing=BACK");
                        } else if (intValue == 2) {
                            sb.append("lensFacing=EXTERNAL");
                        } else {
                            sb.append("lensFacing=UNKNOWN(");
                            sb.append(lensFacing);
                            sb.append(")");
                        }
                    } else {
                        sb.append("lensFacing=NOT_SPECIFIED");
                    }
                    sb.append("}");
                    obj = sb.toString();
                }
                androidx.camera.core.Logger.w("CameraController", "Failed to retrieve CameraInfo for selector: ".concat(java.lang.String.valueOf(obj)), e);
                z = true;
                relativeImageRotation = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, i, z);
                aspectRatio = viewPort.getAspectRatio();
                if (relativeImageRotation != 90) {
                }
                aspectRatio = new android.util.Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
                if (aspectRatio.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
                }
            }
            if (highSpeedVideoFpsRanges.getLensFacing() != 1) {
                z = false;
                relativeImageRotation = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, i, z);
                aspectRatio = viewPort.getAspectRatio();
                if (relativeImageRotation != 90 || relativeImageRotation == 270) {
                    aspectRatio = new android.util.Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
                }
                if (aspectRatio.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
                    return 0;
                }
                return aspectRatio.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9) ? 1 : -1;
            }
        } else {
            i = 0;
        }
        z = true;
        relativeImageRotation = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, i, z);
        aspectRatio = viewPort.getAspectRatio();
        if (relativeImageRotation != 90) {
        }
        aspectRatio = new android.util.Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
        if (aspectRatio.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
        }
    }

    final void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats();
        getHighSpeedVideoFpsRanges(false);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getImageCaptureMode());
        int flashMode = this.getOutputStallDuration.getFlashMode();
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges(valueOf);
        setImageCaptureFlashMode(flashMode);
        getHighSpeedVideoSizes(java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getBackpressureStrategy()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getImageQueueDepth()), java.lang.Integer.valueOf(this.getOutputMinFrameDuration.getOutputImageFormat()), false);
        this._BOUNDARY = getHighSpeedVideoSizesFor();
    }

    public void setCameraSelector(androidx.camera.core.CameraSelector cameraSelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.Camera2StreamConfigurationMap != cameraSelector) {
            getHighSpeedVideoSizes(this.getOutputStallDuration, cameraSelector);
            final androidx.camera.core.CameraSelector cameraSelector2 = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = cameraSelector;
            androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
            if (processCameraProviderWrapper == null) {
                return;
            }
            androidx.camera.core.SessionConfig sessionConfig = this.accessartificialFrame;
            if (sessionConfig != null) {
                processCameraProviderWrapper.getHighResolutionOutputSizeshNQ4ISI(sessionConfig);
            } else {
                processCameraProviderWrapper.getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration, this.getOutputMinFrameDuration, this._BOUNDARY);
            }
            getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.view.CameraController.this.Camera2StreamConfigurationMap = cameraSelector2;
                }
            });
        }
    }

    private static void getHighSpeedVideoSizes(androidx.camera.core.ImageCapture imageCapture, androidx.camera.core.CameraSelector cameraSelector) {
        java.lang.Integer lensFacing = cameraSelector.getLensFacing();
        if (imageCapture.getFlashMode() == 3 && lensFacing != null && lensFacing.intValue() != 0) {
            throw new java.lang.IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    public boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkNotNull(cameraSelector);
        androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        if (processCameraProviderWrapper == null) {
            throw new java.lang.IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
        try {
            return processCameraProviderWrapper.getHighSpeedVideoSizes(cameraSelector);
        } catch (androidx.camera.core.CameraInfoUnavailableException e) {
            androidx.camera.core.Logger.w("CameraController", "Failed to check camera availability", e);
            return false;
        }
    }

    public androidx.camera.core.CameraSelector getCameraSelector() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isPinchToZoomEnabled() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.toString;
    }

    public void setPinchToZoomEnabled(boolean z) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.toString = z;
    }

    public boolean isTapToFocusEnabled() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.coroutineCreation;
    }

    public void setTapToFocusEnabled(boolean z) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.coroutineCreation = z;
    }

    @java.lang.Deprecated
    public androidx.view.LiveData<java.lang.Integer> getTapToFocusState() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.b;
    }

    public androidx.view.LiveData<androidx.camera.view.TapToFocusInfo> getTapToFocusInfoState() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this._CREATION;
    }

    public void setTapToFocusAutoCancelDuration(long j, java.util.concurrent.TimeUnit timeUnit) {
        androidx.core.util.Preconditions.checkArgument(j >= 0, "Tap-to-focus auto-cancellation duration must be at least 0");
        this.ArtificialStackFrames = timeUnit.toNanos(j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("setTapToFocusAutoCancelDuration: ");
        sb.append(this.ArtificialStackFrames);
        sb.append(" ns set!");
        androidx.camera.core.Logger.d("CameraController", sb.toString());
    }

    public androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomState() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.free;
    }

    public androidx.camera.core.CameraInfo getCameraInfo() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    public androidx.camera.core.CameraControl getCameraControl() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float f) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null) {
            androidx.camera.view.PendingValue<java.lang.Float> pendingValue = this.l;
            java.lang.Float valueOf = java.lang.Float.valueOf(f);
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.camera.view.PendingValue$$ExternalSyntheticLambda0(pendingValue, valueOf));
        }
        return camera.getCameraControl().setZoomRatio(f);
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float f) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null) {
            androidx.camera.view.PendingValue<java.lang.Float> pendingValue = this.exchange;
            java.lang.Float valueOf = java.lang.Float.valueOf(f);
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.camera.view.PendingValue$$ExternalSyntheticLambda0(pendingValue, valueOf));
        }
        return camera.getCameraControl().setLinearZoom(f);
    }

    public androidx.view.LiveData<java.lang.Integer> getTorchState() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.updateUI;
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean z) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null) {
            androidx.camera.view.PendingValue<java.lang.Boolean> pendingValue = this.release;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.camera.view.PendingValue$$ExternalSyntheticLambda0(pendingValue, valueOf));
        }
        return camera.getCameraControl().enableTorch(z);
    }

    public void setEffects(java.util.Set<androidx.camera.core.CameraEffect> set) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("setEffects");
        if (java.util.Objects.equals(this.startTransaction, set)) {
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            getOutputFormats();
        }
        androidx.camera.core.UseCaseGroup.Builder builder = new androidx.camera.core.UseCaseGroup.Builder();
        builder.addUseCase(this.isOutputSupportedForhNQ4ISI);
        java.util.Iterator<androidx.camera.core.CameraEffect> it = set.iterator();
        while (it.hasNext()) {
            builder.addEffect(it.next());
        }
        builder.build();
        this.startTransaction.clear();
        this.startTransaction.addAll(set);
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    public void clearEffects() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        getHighSpeedVideoFpsRangesFor("clearEffects");
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            getOutputFormats();
        }
        this.startTransaction.clear();
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    final void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes((java.lang.Runnable) null);
    }

    final void getHighSpeedVideoSizes(java.lang.Runnable runnable) {
        try {
            androidx.camera.core.Camera highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
            if (highResolutionOutputSizeshNQ4ISI == null) {
                androidx.camera.core.Logger.d("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.free.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI.getCameraInfo().getZoomState());
            this.updateUI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getCameraInfo().getTorchState());
            this.release.Camera2StreamConfigurationMap(new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.view.CameraController.this.enableTorch(((java.lang.Boolean) obj).booleanValue());
                }
            });
            this.exchange.Camera2StreamConfigurationMap(new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.view.CameraController.this.setLinearZoom(((java.lang.Float) obj).floatValue());
                }
            });
            this.l.Camera2StreamConfigurationMap(new androidx.arch.core.util.Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.view.CameraController.this.setZoomRatio(((java.lang.Float) obj).floatValue());
                }
            });
        } catch (java.lang.RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (this.accessartificialFrame == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" function call is not allowed when a SessionConfig has been set because this might cause UseCases to be recreated and conflict with the UseCases set by the SessionConfig. Please clear the session config if you want CameraController to help you create and manage the UseCases.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @java.lang.Deprecated
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;
        private final int getHighSpeedVideoFpsRanges;
        private final android.util.Size getHighSpeedVideoFpsRangesFor;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i) {
            androidx.core.util.Preconditions.checkArgument(i != -1);
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = null;
        }

        public OutputSize(android.util.Size size) {
            androidx.core.util.Preconditions.checkNotNull(size);
            this.getHighSpeedVideoFpsRanges = -1;
            this.getHighSpeedVideoFpsRangesFor = size;
        }

        public final int getAspectRatio() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final android.util.Size getResolution() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("aspect ratio: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" resolution: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            return sb.toString();
        }
    }

    static class FocusMeteringResultCallback implements androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.FocusMeteringResult> {
        private final android.graphics.PointF getHighSpeedVideoFpsRangesFor;
        final androidx.view.MutableLiveData<androidx.camera.view.TapToFocusInfo> getHighSpeedVideoSizes;
        boolean getHighSpeedVideoFpsRanges = false;
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public /* synthetic */ void onSuccess(androidx.camera.core.FocusMeteringResult focusMeteringResult) {
            androidx.camera.core.FocusMeteringResult focusMeteringResult2 = focusMeteringResult;
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                if (focusMeteringResult2 == null) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Tap-to-focus onSuccess: ");
                sb.append(focusMeteringResult2.isFocusSuccessful());
                androidx.camera.core.Logger.d("CameraController", sb.toString());
                this.getHighSpeedVideoSizes.postValue(new androidx.camera.view.TapToFocusInfo(focusMeteringResult2.isFocusSuccessful() ? 2 : 3, this.getHighSpeedVideoFpsRangesFor));
            }
        }

        FocusMeteringResultCallback(android.graphics.PointF pointF, androidx.view.MutableLiveData<androidx.camera.view.TapToFocusInfo> mutableLiveData) {
            this.getHighSpeedVideoFpsRangesFor = pointF;
            this.getHighSpeedVideoSizes = mutableLiveData;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(java.lang.Throwable th) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                if (th instanceof androidx.camera.core.CameraControl.OperationCanceledException) {
                    androidx.camera.core.Logger.d("CameraController", "Tap-to-focus canceled", th);
                    this.getHighSpeedVideoSizes.postValue(new androidx.camera.view.TapToFocusInfo(0, null));
                    synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.getHighSpeedVideoFpsRanges = true;
                    }
                    return;
                }
                androidx.camera.core.Logger.d("CameraController", "Tap-to-focus failed.", th);
                this.getHighSpeedVideoSizes.postValue(new androidx.camera.view.TapToFocusInfo(4, this.getHighSpeedVideoFpsRangesFor));
            }
        }
    }

    private void getOutputFormats() {
        androidx.camera.view.ProcessCameraProviderWrapper processCameraProviderWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration, this.getOutputMinFrameDuration, this._BOUNDARY);
        }
    }

    protected androidx.camera.core.UseCaseGroup createUseCaseGroup(boolean z) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            androidx.camera.core.Logger.d("CameraController", "Camera not initialized.");
            return null;
        }
        if (z && (this.coroutineBoundary == null || this.getARTIFICIAL_FRAME_PACKAGE_NAME == null)) {
            androidx.camera.core.Logger.d("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        if (this.accessartificialFrame != null) {
            return null;
        }
        getOutputFormats();
        androidx.camera.core.UseCaseGroup.Builder addUseCase = new androidx.camera.core.UseCaseGroup.Builder().addUseCase(this.isOutputSupportedForhNQ4ISI);
        if (isImageCaptureEnabled()) {
            addUseCase.addUseCase(this.getOutputStallDuration);
        }
        if (isImageAnalysisEnabled()) {
            addUseCase.addUseCase(this.getOutputMinFrameDuration);
        }
        if (isVideoCaptureEnabled()) {
            addUseCase.addUseCase(this._BOUNDARY);
        }
        addUseCase.setViewPort(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        java.util.Iterator<androidx.camera.core.CameraEffect> it = this.startTransaction.iterator();
        while (it.hasNext()) {
            addUseCase.addEffect(it.next());
        }
        return addUseCase.build();
    }

    protected androidx.camera.core.SessionConfig getBoundSessionConfig() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            androidx.camera.core.Logger.d("CameraController", "Camera not initialized.");
            return null;
        }
        if (this.coroutineBoundary == null || this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            androidx.camera.core.Logger.d("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        androidx.camera.core.SessionConfig sessionConfig = this.accessartificialFrame;
        if (sessionConfig == null) {
            return null;
        }
        androidx.camera.core.SessionConfig build = new androidx.camera.core.SessionConfig.Builder(sessionConfig).setViewPort(this.getARTIFICIAL_FRAME_PACKAGE_NAME).build();
        this.resetTransaction = build;
        return build;
    }
}
