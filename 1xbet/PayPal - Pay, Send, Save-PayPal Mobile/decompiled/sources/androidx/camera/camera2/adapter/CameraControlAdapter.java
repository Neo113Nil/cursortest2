package androidx.camera.camera2.adapter;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050)2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010>\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010=J\u000f\u0010@\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020 2\u0006\u0010B\u001a\u00020-H\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020 2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020-0)2\u0006\u0010I\u001a\u00020-H\u0016¢\u0006\u0004\bJ\u00100J\u0017\u0010L\u001a\u00020 2\u0006\u0010K\u001a\u00020'H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020'H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020 2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020 H\u0016¢\u0006\u0004\bT\u0010$J;\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010*0U0)2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U2\u0006\u0010X\u001a\u00020-2\u0006\u0010Y\u001a\u00020-H\u0016¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0)2\u0006\u0010X\u001a\u00020-2\u0006\u0010Y\u001a\u00020-H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bb\u0010$J\u000f\u0010c\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010$J\u000f\u0010d\u001a\u00020'H\u0016¢\u0006\u0004\bd\u0010OR\u0014\u0010e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010k\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010n\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010rR\u0014\u0010p\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0017\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010y\u001a\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bs\u0010|R\u0014\u0010\u007f\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bx\u0010~R\u0015\u0010v\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b}\u0010\u0080\u0001"}, d2 = {"Landroidx/camera/camera2/adapter/CameraControlAdapter;", "Landroidx/camera/core/impl/CameraControlInternal;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/EvCompControl;", "evCompControl", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "focusMeteringControl", "Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "stillCaptureRequestControl", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "Landroidx/camera/camera2/impl/ZoomControl;", "zoomControl", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "camera2cameraControl", "Landroidx/camera/camera2/impl/UseCaseManager;", "useCaseManager", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/VideoUsageControl;", "videoUsageControl", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/EvCompControl;Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/FocusMeteringControl;Landroidx/camera/camera2/impl/StillCaptureRequestControl;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/impl/LowLightBoostControl;Landroidx/camera/camera2/impl/ZoomControl;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/camera/camera2/impl/UseCaseManager;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/VideoUsageControl;)V", "Landroidx/camera/core/impl/Config;", "config", "", "addInteropConfig", "(Landroidx/camera/core/impl/Config;)V", "clearInteropConfig", "()V", "getInteropConfig", "()Landroidx/camera/core/impl/Config;", "", "torch", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "enableTorch", "(Z)Lcom/google/common/util/concurrent/ListenableFuture;", "", "torchStrengthLevel", "setTorchStrengthLevel", "(I)Lcom/google/common/util/concurrent/ListenableFuture;", "lowLightBoost", "enableLowLightBoostAsync", "Landroidx/camera/core/FocusMeteringAction;", "action", "Landroidx/camera/core/FocusMeteringResult;", "startFocusAndMetering", "(Landroidx/camera/core/FocusMeteringAction;)Lcom/google/common/util/concurrent/ListenableFuture;", "cancelFocusAndMetering", "()Lcom/google/common/util/concurrent/ListenableFuture;", "", "ratio", "setZoomRatio", "(F)Lcom/google/common/util/concurrent/ListenableFuture;", "linearZoom", "setLinearZoom", "getFlashMode", "()I", "flashMode", "setFlashMode", "(I)V", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "setScreenFlash", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "exposure", "setExposureCompensationIndex", "disabled", "setZslDisabledByUserCaseConfig", "(Z)V", "isZslDisabledByByUserCaseConfig", "()Z", "Landroidx/camera/core/impl/SessionConfig$Builder;", "sessionConfigBuilder", "addZslConfig", "(Landroidx/camera/core/impl/SessionConfig$Builder;)V", "clearZslConfig", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "captureMode", "flashType", "submitStillCaptureRequests", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipelineAsync", "(II)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/impl/SessionConfig;", "getSessionConfig", "()Landroidx/camera/core/impl/SessionConfig;", "incrementVideoUsage", "decrementVideoUsage", "isInVideoUsage", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/EvCompControl;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/FlashControl;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "getInputFormats", "Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "getInputSizeshNQ4ISI", "getOutputStallDuration", "Landroidx/camera/camera2/impl/ZoomControl;", "getOutputStallDurationlomOqCM", "Landroidx/camera/camera2/adapter/ZslControl;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "getCamera2cameraControl", "()Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager;", "getOutputFormats", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/camera2/impl/VideoUsageControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraControlAdapter implements androidx.camera.core.impl.CameraControlInternal {
    private final androidx.camera.camera2.impl.FlashControl Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.interop.Camera2CameraControl camera2cameraControl;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.FocusMeteringControl getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.impl.EvCompControl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.LowLightBoostControl getInputSizeshNQ4ISI;
    private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.TorchControl getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseManager getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.VideoUsageControl getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.StillCaptureRequestControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.ZoomControl getInputFormats;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.ZslControl getHighSpeedVideoSizesFor;

    public static /* synthetic */ java.lang.Void $r8$lambda$_U_T4yQVYsP1g9IqObAFhPRG_pc(androidx.camera.camera2.pipe.Result3A result3A) {
        return null;
    }

    @javax.inject.Inject
    public CameraControlAdapter(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.EvCompControl evCompControl, androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, androidx.camera.camera2.impl.ZoomControl zoomControl, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.interop.Camera2CameraControl camera2CameraControl, androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.VideoUsageControl videoUsageControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evCompControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flashControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusMeteringControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stillCaptureRequestControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(torchControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowLightBoostControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoomControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zslControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2CameraControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoUsageControl, "");
        this.getHighSpeedVideoSizes = cameraProperties;
        this.getHighSpeedVideoFpsRanges = evCompControl;
        this.Camera2StreamConfigurationMap = flashControl;
        this.getHighSpeedVideoFpsRangesFor = focusMeteringControl;
        this.getHighResolutionOutputSizeshNQ4ISI = stillCaptureRequestControl;
        this.getOutputMinFrameDuration = torchControl;
        this.getInputSizeshNQ4ISI = lowLightBoostControl;
        this.getInputFormats = zoomControl;
        this.getHighSpeedVideoSizesFor = zslControl;
        this.camera2cameraControl = camera2CameraControl;
        this.getOutputFormats = useCaseManager;
        this.getOutputMinFrameDurationlomOqCM = useCaseThreads;
        this.getOutputStallDurationlomOqCM = videoUsageControl;
    }

    public final androidx.camera.camera2.interop.Camera2CameraControl getCamera2cameraControl() {
        return this.camera2cameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(androidx.camera.core.impl.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.camera2cameraControl.addCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions.Builder.INSTANCE.from(config).build());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        this.camera2cameraControl.clearCaptureRequestOptions();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final androidx.camera.core.impl.Config getInteropConfig() {
        return this.camera2cameraControl.getCaptureRequestOptions();
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean torch) {
        java.lang.Integer value;
        if (androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsLowLightBoost(this.getHighSpeedVideoSizes.getMetadata()) && ((value = this.getInputSizeshNQ4ISI.getLowLightBoostStateLiveData().getValue()) == null || value.intValue() != -1)) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFailedFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFailedFuture, "");
            return immediateFailedFuture;
        }
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asVoidListenableFuture(androidx.camera.camera2.impl.TorchControl.setTorchAsync$default(this.getOutputMinFrameDuration, torch, false, false, 6, null)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setTorchStrengthLevel(int torchStrengthLevel) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asVoidListenableFuture(this.getOutputMinFrameDuration.setTorchStrengthLevelAsync(torchStrengthLevel)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableLowLightBoostAsync(final boolean lowLightBoost) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> asVoidListenableFuture;
        if (!androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsLowLightBoost(this.getHighSpeedVideoSizes.getMetadata())) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFailedFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Low-light boost is not supported!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFailedFuture, "");
            return immediateFailedFuture;
        }
        java.lang.Integer value = this.getOutputMinFrameDuration.getTorchStateLiveData().getValue();
        if (value != null && value.intValue() == 1) {
            asVoidListenableFuture = androidx.camera.camera2.adapter.CoroutineAdaptersKt.asVoidListenableFuture(androidx.camera.camera2.impl.TorchControl.setTorchAsync$default(this.getOutputMinFrameDuration, false, false, false, 6, null));
        } else {
            kotlinx.coroutines.CompletableDeferred CompletableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
            CompletableDeferred.complete(kotlin.Unit.INSTANCE);
            asVoidListenableFuture = androidx.camera.camera2.adapter.CoroutineAdaptersKt.asVoidListenableFuture(CompletableDeferred);
        }
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.google.common.util.concurrent.ListenableFuture asVoidListenableFuture2;
                asVoidListenableFuture2 = androidx.camera.camera2.adapter.CoroutineAdaptersKt.asVoidListenableFuture(androidx.camera.camera2.impl.LowLightBoostControl.setLowLightBoostAsync$default(androidx.camera.camera2.adapter.CameraControlAdapter.this.getInputSizeshNQ4ISI, lowLightBoost, false, 2, null));
                return asVoidListenableFuture2;
            }
        };
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.core.impl.utils.futures.Futures.transformAsync(asVoidListenableFuture, new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return androidx.camera.camera2.adapter.CameraControlAdapter.$r8$lambda$ldvtwY8UFxNy7qHhD5fhl92xopw(kotlin.jvm.functions.Function1.this, obj);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.impl.FocusMeteringControl.startFocusAndMetering$default(this.getHighSpeedVideoFpsRangesFor, action, 0L, 2, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(this.getHighSpeedVideoFpsRangesFor.cancelFocusAndMeteringAsync(), CompletableDeferred$default, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.adapter.CameraControlAdapter.$r8$lambda$_U_T4yQVYsP1g9IqObAFhPRG_pc((androidx.camera.camera2.pipe.Result3A) obj);
            }
        });
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default((kotlinx.coroutines.Deferred) CompletableDeferred$default, (java.lang.Object) null, 1, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float ratio) {
        return this.getInputFormats.setZoomRatio(ratio);
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float linearZoom) {
        return this.getInputFormats.setLinearZoom(linearZoom);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final int getFlashMode() {
        return this.Camera2StreamConfigurationMap.getGetInputSizeshNQ4ISI();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int flashMode) {
        androidx.camera.camera2.impl.FlashControl.setFlashAsync$default(this.Camera2StreamConfigurationMap, flashMode, false, 2, null);
        this.getHighSpeedVideoSizesFor.setZslDisabledByFlashMode(flashMode == 1 || flashMode == 0);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.Camera2StreamConfigurationMap.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int exposure) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default(androidx.camera.camera2.impl.EvCompControl.updateAsync$default(this.getHighSpeedVideoFpsRanges, exposure, false, 2, null), (java.lang.Object) null, 1, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setZslDisabledByUserCaseConfig(boolean disabled) {
        this.getHighSpeedVideoSizesFor.setZslDisabledByUserCaseConfig(disabled);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isZslDisabledByByUserCaseConfig() {
        return this.getHighSpeedVideoSizesFor.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder sessionConfigBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigBuilder, "");
        this.getHighSpeedVideoSizesFor.addZslConfig(sessionConfigBuilder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearZslConfig() {
        this.getHighSpeedVideoSizesFor.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> captureConfigs, int captureMode, int flashType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfigs, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.issueCaptureRequests(captureConfigs, captureMode, flashType);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> getCameraCapturePipelineAsync(final int captureMode, final int flashType) {
        final androidx.camera.camera2.impl.UseCaseCamera camera = this.getOutputFormats.getCamera();
        if (camera == null) {
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> immediateFailedFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFailedFuture, "");
            return immediateFailedFuture;
        }
        final kotlinx.coroutines.CoroutineScope sequentialScope = this.getOutputMinFrameDurationlomOqCM.getSequentialScope();
        com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
                kotlinx.coroutines.Job launch$default;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1.AnonymousClass1(completer, null, camera, captureMode, this, flashType), 3, null);
                return launch$default;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/adapter/CoroutineAdaptersKt$future$resolver$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1$1", f = "CameraControlAdapter.kt", i = {}, l = {106, 104}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ int Camera2StreamConfigurationMap;
                final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
                int getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.camera.camera2.impl.UseCaseCamera getHighSpeedVideoSizes;
                java.lang.Object getHighSpeedVideoSizesFor;
                java.lang.Object getInputFormats;
                final /* synthetic */ androidx.camera.camera2.adapter.CameraControlAdapter getOutputFormats;
                int getOutputMinFrameDuration;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.camera.camera2.impl.FlashControl flashControl;
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer;
                    androidx.camera.camera2.impl.UseCaseCamera useCaseCamera;
                    int i;
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.getOutputMinFrameDuration;
                    if (i2 == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3 = this.getHighSpeedVideoFpsRangesFor;
                        androidx.camera.camera2.impl.UseCaseCamera useCaseCamera2 = this.getHighSpeedVideoSizes;
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        flashControl = this.getOutputFormats.Camera2StreamConfigurationMap;
                        this.getInputFormats = completer3;
                        this.getHighSpeedVideoSizesFor = useCaseCamera2;
                        this.getHighSpeedVideoFpsRanges = i3;
                        this.getOutputMinFrameDuration = 1;
                        java.lang.Object awaitFlashModeUpdate = flashControl.awaitFlashModeUpdate(this);
                        if (awaitFlashModeUpdate != coroutine_suspended) {
                            completer = completer3;
                            obj = awaitFlashModeUpdate;
                            useCaseCamera = useCaseCamera2;
                            i = i3;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer4 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        completer2 = completer4;
                        completer2.set(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    i = this.getHighSpeedVideoFpsRanges;
                    useCaseCamera = (androidx.camera.camera2.impl.UseCaseCamera) this.getHighSpeedVideoSizesFor;
                    completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int intValue = ((java.lang.Number) obj).intValue();
                    int i4 = this.Camera2StreamConfigurationMap;
                    this.getInputFormats = completer;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputMinFrameDuration = 2;
                    obj = useCaseCamera.getCameraCapturePipeline(i, intValue, i4, this);
                    if (obj != coroutine_suspended) {
                        completer2 = completer;
                        completer2.set(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.Camera2StreamConfigurationMap);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.UseCaseCamera useCaseCamera, int i, androidx.camera.camera2.adapter.CameraControlAdapter cameraControlAdapter, int i2) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRangesFor = completer;
                    this.getHighSpeedVideoSizes = useCaseCamera;
                    this.getHighResolutionOutputSizeshNQ4ISI = i;
                    this.getOutputFormats = cameraControlAdapter;
                    this.Camera2StreamConfigurationMap = i2;
                }
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return future;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final androidx.camera.core.impl.SessionConfig getSessionConfig() {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.core.impl.SessionConfig defaultEmptySessionConfig = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultEmptySessionConfig, "");
        return defaultEmptySessionConfig;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void incrementVideoUsage() {
        this.getOutputStallDurationlomOqCM.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void decrementVideoUsage() {
        this.getOutputStallDurationlomOqCM.decrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isInVideoUsage() {
        return this.getOutputStallDurationlomOqCM.isInVideoUsage();
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture $r8$lambda$ldvtwY8UFxNy7qHhD5fhl92xopw(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return (com.google.common.util.concurrent.ListenableFuture) function1.invoke(obj);
    }
}
