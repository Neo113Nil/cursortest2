package androidx.camera.extensions.internal.sessionprocessor;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\b\u0000\u0012\u00020!0\u001f0\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0016¢\u0006\u0004\b0\u0010.J\u001d\u00102\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u00010\u001fH\u0016¢\u0006\u0004\b2\u0010(J\u0017\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109R\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010D\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010RR\u0014\u0010L\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010TR\u0018\u0010=\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010U"}, d2 = {"Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;", "Landroidx/camera/core/impl/SessionProcessor;", "Landroidx/camera/extensions/CameraExtensionsInfo;", "Landroidx/camera/extensions/CameraExtensionsControl;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "availableCaptureRequestKeys", "", "mode", "Landroidx/camera/extensions/internal/VendorExtender;", "vendorExtender", "<init>", "(Ljava/util/List;ILandroidx/camera/extensions/internal/VendorExtender;)V", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/core/impl/OutputSurfaceConfiguration;", "outputSurfaceConfig", "Landroidx/camera/core/impl/SessionConfig;", "initSession", "(Landroidx/camera/core/CameraInfo;Landroidx/camera/core/impl/OutputSurfaceConfiguration;)Landroidx/camera/core/impl/SessionConfig;", "", "deInitSession", "()V", "Landroid/util/Size;", "captureSize", "", "getSupportedPostviewSize", "(Landroid/util/Size;)Ljava/util/Map;", "", "getSupportedCameraOperations", "()Ljava/util/Set;", "Landroid/util/Pair;", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "", "getAvailableCharacteristicsKeyValues", "()Ljava/util/List;", "", "getExtensionAvailableStabilizationModes", "()[I", "getImplementationType", "()Landroid/util/Pair;", "", "isExtensionStrengthAvailable", "()Z", "Landroidx/lifecycle/LiveData;", "getExtensionStrength", "()Landroidx/lifecycle/LiveData;", "isCurrentExtensionModeAvailable", "getCurrentExtensionMode", "", "getRealtimeCaptureLatency", "strength", "setExtensionStrength", "(I)V", "Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;", "processor", "setCaptureSessionRequestProcessor", "(Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;)V", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getOutputStallDurationlomOqCM", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/extensions/internal/VendorExtender;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/MutableLiveData;", "getOutputMinFrameDuration", "Landroidx/lifecycle/MutableLiveData;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "getOutputFormats", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizesFor", "getOutputStallDuration", "Ljava/util/Set;", "Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/core/impl/CameraInfoInternal;", "getInputFormats", "Landroidx/camera/core/impl/CameraCaptureCallback;", "Landroidx/camera/core/impl/CameraCaptureCallback;", "getOutputSizes", "Ljava/lang/Object;", "Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ExtensionsSessionProcessor implements androidx.camera.core.impl.SessionProcessor, androidx.camera.extensions.CameraExtensionsInfo, androidx.camera.extensions.CameraExtensionsControl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor getOutputStallDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraCaptureCallback getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraInfoInternal getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.Object getOutputStallDuration;
    private androidx.view.MutableLiveData<java.lang.Integer> getInputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.view.MutableLiveData<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.extensions.internal.VendorExtender getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final java.util.Set<java.lang.Integer> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public Camera2ExtensionsSessionProcessor(java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> list, int i, androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vendorExtender, "");
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = vendorExtender;
        this.getHighSpeedVideoSizes = androidx.camera.extensions.internal.Camera2ExtensionsUtil.INSTANCE.convertCameraXModeToCamera2Mode(i);
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicInteger(100);
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger(i);
        java.util.Set<java.lang.Integer> supportedCameraOperations = androidx.camera.extensions.internal.ExtensionsUtils.getSupportedCameraOperations(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedCameraOperations, "");
        this.getHighSpeedVideoSizesFor = supportedCameraOperations;
        this.getOutputStallDuration = new java.lang.Object();
        if (isCurrentExtensionModeAvailable()) {
            this.getInputSizeshNQ4ISI = new androidx.view.MutableLiveData<>(java.lang.Integer.valueOf(i));
        }
        if (isExtensionStrengthAvailable()) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.view.MutableLiveData<>(100);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final androidx.camera.core.impl.SessionConfig initSession(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        this.getInputFormats = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        this.getOutputSizes = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor$initSession$1
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
            
                r1 = r1.getInputSizeshNQ4ISI;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
            
                r5 = r5.getHighSpeedVideoFpsRangesFor;
             */
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onCaptureCompleted(int captureConfigId, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                android.hardware.camera2.CaptureResult captureResult;
                java.lang.Integer num;
                java.util.concurrent.atomic.AtomicInteger atomicInteger;
                androidx.view.MutableLiveData mutableLiveData;
                android.hardware.camera2.CaptureResult captureResult2;
                java.lang.Integer num2;
                java.util.concurrent.atomic.AtomicInteger atomicInteger2;
                androidx.view.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCaptureResult, "");
                if (android.os.Build.VERSION.SDK_INT >= 34 && androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor.this.isCurrentExtensionModeAvailable() && (captureResult2 = cameraCaptureResult.getCaptureResult()) != null && (num2 = (java.lang.Integer) captureResult2.get(android.hardware.camera2.CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor camera2ExtensionsSessionProcessor = androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor.this;
                    java.lang.Integer convertCamera2ModeToCameraXMode = androidx.camera.extensions.internal.Camera2ExtensionsUtil.INSTANCE.convertCamera2ModeToCameraXMode(num2.intValue());
                    if (convertCamera2ModeToCameraXMode != null) {
                        int intValue = convertCamera2ModeToCameraXMode.intValue();
                        atomicInteger2 = camera2ExtensionsSessionProcessor.getOutputMinFrameDuration;
                        if (atomicInteger2.getAndSet(intValue) != intValue && mutableLiveData2 != null) {
                            mutableLiveData2.postValue(java.lang.Integer.valueOf(intValue));
                        }
                    }
                }
                if (android.os.Build.VERSION.SDK_INT < 34 || !androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor.this.isExtensionStrengthAvailable() || (captureResult = cameraCaptureResult.getCaptureResult()) == null || (num = (java.lang.Integer) captureResult.get(android.hardware.camera2.CaptureResult.EXTENSION_STRENGTH)) == null) {
                    return;
                }
                androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor camera2ExtensionsSessionProcessor2 = androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor.this;
                int intValue2 = num.intValue();
                atomicInteger = camera2ExtensionsSessionProcessor2.getOutputFormats;
                if (atomicInteger.getAndSet(intValue2) == intValue2 || mutableLiveData == null) {
                    return;
                }
                mutableLiveData.postValue(java.lang.Integer.valueOf(intValue2));
            }
        };
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = this.getInputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraInfoInternal);
        java.util.concurrent.Executor directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = this.getOutputSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraCaptureCallback);
        cameraInfoInternal.addSessionCaptureCallback(directExecutor, cameraCaptureCallback);
        return null;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback;
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = this.getInputFormats;
        if (cameraInfoInternal == null || (cameraCaptureCallback = this.getOutputSizes) == null) {
            return;
        }
        cameraInfoInternal.removeSessionCaptureCallback(cameraCaptureCallback);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewSize(android.util.Size captureSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSize, "");
        java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> supportedPostviewResolutions = this.getHighResolutionOutputSizeshNQ4ISI.getSupportedPostviewResolutions(captureSize);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedPostviewResolutions, "");
        return supportedPostviewResolutions;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final java.util.Set<java.lang.Integer> getSupportedCameraOperations() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key<?>, ? super java.lang.Object>> getAvailableCharacteristicsKeyValues() {
        java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key<?>, ? super java.lang.Object>> availableCharacteristicsKeyValues = this.getHighResolutionOutputSizeshNQ4ISI.getAvailableCharacteristicsKeyValues();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableCharacteristicsKeyValues, "");
        return availableCharacteristicsKeyValues;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final int[] getExtensionAvailableStabilizationModes() {
        return super.getExtensionAvailableStabilizationModes();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> getImplementationType() {
        android.util.Pair<java.lang.Integer, java.lang.Integer> create = android.util.Pair.create(1, java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public final boolean isExtensionStrengthAvailable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isExtensionStrengthAvailable();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public final androidx.view.LiveData<java.lang.Integer> getExtensionStrength() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public final boolean isCurrentExtensionModeAvailable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isCurrentExtensionModeAvailable();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public final androidx.view.LiveData<java.lang.Integer> getCurrentExtensionMode() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency() {
        android.util.Pair<java.lang.Long, java.lang.Long> realtimeStillCaptureLatency;
        synchronized (this.getOutputStallDuration) {
            androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor captureSessionRequestProcessor = this.getOutputStallDurationlomOqCM;
            realtimeStillCaptureLatency = captureSessionRequestProcessor != null ? captureSessionRequestProcessor.getRealtimeStillCaptureLatency() : null;
        }
        return realtimeStillCaptureLatency;
    }

    @Override // androidx.camera.extensions.CameraExtensionsControl
    public final void setExtensionStrength(int strength) {
        synchronized (this.getOutputStallDuration) {
            androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor captureSessionRequestProcessor = this.getOutputStallDurationlomOqCM;
            if (captureSessionRequestProcessor != null) {
                captureSessionRequestProcessor.setExtensionStrength(strength);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void setCaptureSessionRequestProcessor(androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor processor) {
        synchronized (this.getOutputStallDuration) {
            this.getOutputStallDurationlomOqCM = processor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
