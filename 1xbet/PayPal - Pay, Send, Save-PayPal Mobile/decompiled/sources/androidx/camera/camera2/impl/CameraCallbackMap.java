package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J'\u00107\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00108\u001a\u00020\u001dH\u0016¢\u0006\u0004\b9\u0010:J'\u0010=\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00104\u001a\u00020;H\u0016¢\u0006\u0004\b<\u00106J\u0019\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010>\u001a\u00020\rH\u0002¢\u0006\u0004\b@\u0010AR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010\u001e\u001a\u00020?8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010F\u001a\u0004\bG\u0010HR\"\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010D"}, d2 = {"Landroidx/camera/camera2/impl/CameraCallbackMap;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "()V", "Landroidx/camera/core/impl/CameraCaptureCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "", "addCaptureCallback", "(Landroidx/camera/core/impl/CameraCaptureCallback;Ljava/util/concurrent/Executor;)V", "removeCaptureCallback", "(Landroidx/camera/core/impl/CameraCaptureCallback;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onBufferLost", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "", "Camera2StreamConfigurationMap", "(Landroidx/camera/camera2/pipe/RequestMetadata;)I", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onFailed", "Landroidx/camera/camera2/pipe/Request;", "request", "onAborted", "(Landroidx/camera/camera2/pipe/Request;)V", "Landroidx/camera/camera2/pipe/FrameMetadata;", "captureResult", "onPartialCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onPartialCaptureResult", "onRequestSequenceAborted", "(Landroidx/camera/camera2/pipe/RequestMetadata;)V", "onRequestSequenceCompleted-RuT0dZU", "(Landroidx/camera/camera2/pipe/RequestMetadata;J)V", "onRequestSequenceCompleted", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "timestamp", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onStarted", "progress", "onCaptureProgress", "(Landroidx/camera/camera2/pipe/RequestMetadata;I)V", "Landroidx/camera/camera2/pipe/SensorTimestamp;", "onReadoutStarted-mP9r-9w", "onReadoutStarted", "p0", "Landroid/hardware/camera2/CameraCaptureSession;", "getHighSpeedVideoFpsRanges", "(Landroidx/camera/camera2/pipe/RequestMetadata;)Landroid/hardware/camera2/CameraCaptureSession;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroid/hardware/camera2/CameraCaptureSession;", "", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraCallbackMap implements androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.impl.CameraCallbackMap.Companion INSTANCE = new androidx.camera.camera2.impl.CameraCallbackMap.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.camera.camera2.impl.CameraCallbackMap.$r8$lambda$Wqwind4PXz1dS9HICx1XpdO2JjQ();
        }
    });

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.emptyMap();

    @javax.inject.Inject
    public CameraCallbackMap() {
    }

    private final android.hardware.camera2.CameraCaptureSession getHighResolutionOutputSizeshNQ4ISI() {
        return (android.hardware.camera2.CameraCaptureSession) this.Camera2StreamConfigurationMap.getValue();
    }

    public final void addCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback callback, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(callback)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(callback);
            sb.append(" was already registered!");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.put(callback, executor);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRangesFor);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.remove(callback);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRangesFor);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
    public final void mo92onBufferLostiiEMlm4(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, int streamId, int outputId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                final android.view.Surface surface = requestMetadata.getStreams().get(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda14
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.camera2.compat.Api24Compat.onCaptureBufferLost(((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback(), cameraCaptureSession, captureRequest, surface, frameNumber);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo36onCompleteCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requestMetadata);
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                final android.hardware.camera2.TotalCaptureResult totalCaptureResult = (android.hardware.camera2.TotalCaptureResult) result.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.TotalCaptureResult.class));
                if (highSpeedVideoFpsRanges != null && captureRequest != null && totalCaptureResult != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureCompleted(highSpeedVideoFpsRanges, captureRequest, totalCaptureResult);
                        }
                    });
                }
            } else {
                final androidx.camera.camera2.adapter.CaptureResultAdapter captureResultAdapter = new androidx.camera.camera2.adapter.CaptureResultAdapter(requestMetadata, frameNumber, result, null);
                value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallback.this;
                        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = this;
                        cameraCaptureCallback.onCaptureCompleted(androidx.camera.camera2.impl.CameraCallbackMap.Camera2StreamConfigurationMap(requestMetadata), captureResultAdapter);
                    }
                });
            }
        }
    }

    private static int Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        androidx.camera.core.impl.TagBundle tagBundle = (androidx.camera.core.impl.TagBundle) requestMetadata.get(androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE());
        java.lang.Object tag = tagBundle != null ? tagBundle.getTag(androidx.camera.core.impl.CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY) : null;
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public final void mo37onFailedCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requestMetadata);
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                final android.hardware.camera2.CaptureFailure captureFailure = (android.hardware.camera2.CaptureFailure) requestFailure.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureFailure.class));
                if (highSpeedVideoFpsRanges != null && captureRequest != null && captureFailure != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureFailed(highSpeedVideoFpsRanges, captureRequest, captureFailure);
                        }
                    });
                }
            } else {
                final androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure = new androidx.camera.core.impl.CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR);
                value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallback.this;
                        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = this;
                        cameraCaptureCallback.onCaptureFailed(androidx.camera.camera2.impl.CameraCallbackMap.Camera2StreamConfigurationMap(requestMetadata), cameraCaptureFailure);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onAborted(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            java.lang.Object obj = request.getExtras().get(androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE());
            androidx.camera.core.impl.TagBundle tagBundle = obj instanceof androidx.camera.core.impl.TagBundle ? (androidx.camera.core.impl.TagBundle) obj : null;
            java.lang.Object tag = tagBundle != null ? tagBundle.getTag(androidx.camera.core.impl.CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY) : null;
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            final int intValue = num != null ? num.intValue() : -1;
            value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.CameraCaptureCallback.this.onCaptureCancelled(intValue);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
    public final void mo93onPartialCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameMetadata captureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                final android.hardware.camera2.CaptureResult captureResult2 = (android.hardware.camera2.CaptureResult) captureResult.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult2 != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult2);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceAborted(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
                android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureSequenceAborted(cameraCaptureSession, -1);
                        }
                    });
                }
            } else {
                value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallback.this;
                        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = this;
                        cameraCaptureCallback.onCaptureCancelled(androidx.camera.camera2.impl.CameraCallbackMap.Camera2StreamConfigurationMap(requestMetadata));
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
    public final void mo95onRequestSequenceCompletedRuT0dZU(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requestMetadata);
                android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                if (highSpeedVideoFpsRanges != null && captureRequest != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda15
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureSequenceCompleted(highSpeedVideoFpsRanges, -1, frameNumber);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
    public final void mo96onStarteduGKBvU4(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requestMetadata);
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                if (highSpeedVideoFpsRanges != null && captureRequest != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureStarted(highSpeedVideoFpsRanges, captureRequest, timestamp, frameNumber);
                        }
                    });
                }
            } else {
                value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallback.this;
                        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = this;
                        cameraCaptureCallback.onCaptureStarted(androidx.camera.camera2.impl.CameraCallbackMap.Camera2StreamConfigurationMap(requestMetadata));
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onCaptureProgress(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final int progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
            java.util.concurrent.Executor value = entry.getValue();
            if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                final android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
                final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                final android.hardware.camera2.CaptureResult captureResult = (android.hardware.camera2.CaptureResult) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                        }
                    });
                }
            } else {
                value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallback.this;
                        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = this;
                        cameraCaptureCallback.onCaptureProcessProgressed(androidx.camera.camera2.impl.CameraCallbackMap.Camera2StreamConfigurationMap(requestMetadata), progress);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
    public final void mo94onReadoutStartedmP9r9w(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            for (java.util.Map.Entry<androidx.camera.core.impl.CameraCaptureCallback, ? extends java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
                final androidx.camera.core.impl.CameraCaptureCallback key = entry.getKey();
                java.util.concurrent.Executor value = entry.getValue();
                if (key instanceof androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) {
                    final android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
                    final android.hardware.camera2.CaptureRequest captureRequest = (android.hardware.camera2.CaptureRequest) requestMetadata.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureRequest.class));
                    if (cameraCaptureSession != null && captureRequest != null) {
                        value.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.camera2.compat.Api34Compat.onReadoutStarted(((androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer) androidx.camera.core.impl.CameraCaptureCallback.this).getCaptureCallback(), cameraCaptureSession, captureRequest, timestamp, frameNumber);
                            }
                        });
                    }
                }
            }
        }
    }

    private final android.hardware.camera2.CameraCaptureSession getHighSpeedVideoFpsRanges(androidx.camera.camera2.pipe.RequestMetadata p0) {
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) p0.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || ((android.hardware.camera2.CameraExtensionSession) p0.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraExtensionSession.class))) == null) {
            return null;
        }
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/impl/CameraCallbackMap$Companion;", "", "<init>", "()V", "", "Landroidx/camera/core/impl/CameraCaptureCallback;", "callbacks", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "createFor", "(Ljava/util/Collection;Ljava/util/concurrent/Executor;)Landroidx/camera/camera2/impl/CameraCallbackMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.impl.CameraCallbackMap createFor(java.util.Collection<? extends androidx.camera.core.impl.CameraCaptureCallback> callbacks, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = new androidx.camera.camera2.impl.CameraCallbackMap();
            java.util.Iterator<T> it = callbacks.iterator();
            while (it.hasNext()) {
                cameraCallbackMap.addCaptureCallback((androidx.camera.core.impl.CameraCaptureCallback) it.next(), executor);
            }
            return cameraCallbackMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.camera.camera2.impl.RejectOperationCameraCaptureSession $r8$lambda$Wqwind4PXz1dS9HICx1XpdO2JjQ() {
        return new androidx.camera.camera2.impl.RejectOperationCameraCaptureSession();
    }
}
