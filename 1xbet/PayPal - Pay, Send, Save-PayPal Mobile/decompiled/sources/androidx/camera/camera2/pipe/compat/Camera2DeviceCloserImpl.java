package androidx.camera.camera2.pipe.compat;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloserImpl;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "retryingCameraStateOpener", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDeviceWrapper", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "androidCameraState", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "", "shouldReopenCamera", "shouldCreateEmptyCaptureSession", "", "closeCamera", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;ZZ)V", "p0", "p1", "p2", "p3", "p4", "Lkotlin/Pair;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;ZZ)Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "(Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;)V", "Landroidx/camera/camera2/pipe/core/Threads;", "getThreads", "()Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2DeviceCloserImpl implements androidx.camera.camera2.pipe.compat.Camera2DeviceCloser {
    public static final long CAMERA_CLOSE_TIMEOUT_MS = 7000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.Camera2Quirks getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.core.Threads threads;

    @javax.inject.Inject
    public Camera2DeviceCloserImpl(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener retryingCameraStateOpener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2Quirks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryingCameraStateOpener, "");
        this.threads = threads;
        this.getHighSpeedVideoFpsRanges = camera2Quirks;
        this.getHighResolutionOutputSizeshNQ4ISI = retryingCameraStateOpener;
    }

    public final androidx.camera.camera2.pipe.core.Threads getThreads() {
        return this.threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceCloser
    public final void closeCamera(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidCameraState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioRestrictionController, "");
        android.hardware.camera2.CameraDevice cameraDevice2 = cameraDeviceWrapper != null ? (android.hardware.camera2.CameraDevice) cameraDeviceWrapper.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                getHighSpeedVideoFpsRanges(cameraDevice, androidCameraState);
                return;
            }
            return;
        }
        androidx.camera.camera2.pipe.CameraId.Companion companion = androidx.camera.camera2.pipe.CameraId.INSTANCE;
        java.lang.String id = cameraDevice2.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        java.lang.String m393constructorimpl = androidx.camera.camera2.pipe.CameraId.m393constructorimpl(id);
        if (cameraDevice != null && !kotlin.jvm.internal.Intrinsics.areEqual(m393constructorimpl, cameraDevice.getId())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unwrapped camera device has camera ID ");
            sb.append(m393constructorimpl);
            sb.append(", but the wrapped camera device has camera ID ");
            sb.append(cameraDevice.getId());
            sb.append('!');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            audioRestrictionController.removeListener(cameraDeviceWrapper);
        }
        kotlin.Pair<androidx.camera.camera2.pipe.compat.CameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cameraDeviceWrapper, cameraDevice2, androidCameraState, shouldReopenCamera, shouldCreateEmptyCaptureSession);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper component1 = highResolutionOutputSizeshNQ4ISI.component1();
            androidx.camera.camera2.pipe.compat.AndroidCameraState component2 = highResolutionOutputSizeshNQ4ISI.component2();
            java.lang.Object unwrapAs = component1.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraDevice.class));
            if (unwrapAs == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            cameraDeviceWrapper.onDeviceClosing();
            getHighSpeedVideoFpsRanges((android.hardware.camera2.CameraDevice) unwrapAs, component2);
            cameraDeviceWrapper.onDeviceClosed();
            if (shouldReopenCamera) {
                androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice2);
                return;
            }
            return;
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        cameraDeviceWrapper.onDeviceClosing();
        cameraDeviceWrapper.onDeviceClosed();
        androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice2);
    }

    private final kotlin.Pair<androidx.camera.camera2.pipe.compat.CameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState> getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper p0, android.hardware.camera2.CameraDevice p1, androidx.camera.camera2.pipe.compat.AndroidCameraState p2, boolean p3, boolean p4) {
        androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult awaitOpenCameraResult;
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        java.lang.String mo767getCameraIdDz_R5H8 = p0.mo767getCameraIdDz_R5H8();
        if (p3) {
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            try {
                android.os.Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                getHighSpeedVideoFpsRanges(p1, p2);
                awaitOpenCameraResult = this.getHighResolutionOutputSizeshNQ4ISI.mo845openAndAwaitCameraWithRetry0r8Bogc(mo767getCameraIdDz_R5H8, this);
            } finally {
            }
        } else {
            awaitOpenCameraResult = new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult(p0, p2);
        }
        if (awaitOpenCameraResult.getCameraDeviceWrapper() != null && awaitOpenCameraResult.getAndroidCameraState() != null) {
            if (p4) {
                androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                try {
                    android.os.Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        androidx.camera.camera2.pipe.CameraId.m398toStringimpl(mo767getCameraIdDz_R5H8);
                    }
                    access$createCaptureSession(this, awaitOpenCameraResult.getCameraDeviceWrapper());
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
            return new kotlin.Pair<>(awaitOpenCameraResult.getCameraDeviceWrapper(), awaitOpenCameraResult.getAndroidCameraState());
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(android.hardware.camera2.CameraDevice p0, androidx.camera.camera2.pipe.compat.AndroidCameraState p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p0.getId(), "");
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        if (((kotlin.Unit) this.threads.runBlockingCheckedOrNull(7000L, new androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2(p0, booleanRef, null))) == null) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        }
        androidx.camera.camera2.pipe.CameraId.Companion companion = androidx.camera.camera2.pipe.CameraId.INSTANCE;
        java.lang.String id = p0.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        java.lang.String m393constructorimpl = androidx.camera.camera2.pipe.CameraId.m393constructorimpl(id);
        if (this.getHighSpeedVideoFpsRanges.m802shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(m393constructorimpl) && booleanRef.element) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m393constructorimpl);
            }
            if (p1.awaitCameraDeviceClosed$camera_camera2_pipe(2000L)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m393constructorimpl);
                }
            } else if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m393constructorimpl);
            }
        }
    }

    public static final /* synthetic */ void access$createCaptureSession(androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl camera2DeviceCloserImpl, androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper) {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        final kotlinx.atomicfu.AtomicBoolean atomic = kotlinx.atomicfu.AtomicFU.atomic(false);
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        if (cameraDeviceWrapper.createCaptureSession(kotlin.collections.CollectionsKt.listOf(surface), new androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$createCaptureSession$callback$1
            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public final void onSessionDisconnected() {
            }

            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public final void onSessionFinalized() {
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onConfigured(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                session.close();
                countDownLatch.countDown();
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onClosed(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                if (atomic.compareAndSet(false, true)) {
                    surface.release();
                    surfaceTexture.release();
                }
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onConfigureFailed(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                if (atomic.compareAndSet(false, true)) {
                    surface.release();
                    surfaceTexture.release();
                }
                countDownLatch.countDown();
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onReady(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onCaptureQueueEmpty(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public final void onActive(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            }
        })) {
            countDownLatch.await();
            return;
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        if (atomic.compareAndSet(false, true)) {
            surface.release();
            surfaceTexture.release();
        }
    }
}
