package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "updateCallbacks", "(Landroidx/camera/core/impl/SessionConfig;)V", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks;", "getHighSpeedVideoSizes", "getDeviceStateCallback", "()Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "deviceStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "getSessionStateCallback", "()Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "sessionStateCallback", "CameraDeviceStateCallbacks", "CaptureSessionStateCallbacks"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraInteropStateCallbackRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CameraDeviceStateCallbacks getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CameraDeviceStateCallbacks();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CaptureSessionStateCallbacks getHighSpeedVideoSizes = new androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CaptureSessionStateCallbacks();

    public final void updateCallbacks(androidx.camera.core.impl.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI.updateCallbacks$camera_camera2(sessionConfig);
        this.getHighSpeedVideoSizes.updateCallbacks$camera_camera2(sessionConfig);
    }

    /* renamed from: getDeviceStateCallback, reason: from getter */
    public final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CameraDeviceStateCallbacks getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener getSessionStateCallback() {
        return this.getHighSpeedVideoSizes;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "updateCallbacks$camera_camera2", "(Landroidx/camera/core/impl/SessionConfig;)V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onClosed", "onDisconnected", "", "errorCode", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "Lkotlinx/atomicfu/AtomicRef;", "", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraDeviceStateCallbacks extends android.hardware.camera2.CameraDevice.StateCallback {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private kotlinx.atomicfu.AtomicRef<java.util.List<android.hardware.camera2.CameraDevice.StateCallback>> getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(kotlin.collections.CollectionsKt.emptyList());

        public final void updateCallbacks$camera_camera2(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            kotlinx.atomicfu.AtomicRef<java.util.List<android.hardware.camera2.CameraDevice.StateCallback>> atomicRef = this.getHighSpeedVideoFpsRangesFor;
            java.util.List<android.hardware.camera2.CameraDevice.StateCallback> deviceStateCallbacks = sessionConfig.getDeviceStateCallbacks();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceStateCallbacks, "");
            atomicRef.setValue(kotlin.collections.CollectionsKt.toList(deviceStateCallbacks));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.getHighSpeedVideoFpsRangesFor.getValue().iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.getHighSpeedVideoFpsRangesFor.getValue().iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.getHighSpeedVideoFpsRangesFor.getValue().iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.getHighSpeedVideoFpsRangesFor.getValue().iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, errorCode);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "updateCallbacks$camera_camera2", "(Landroidx/camera/core/impl/SessionConfig;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "captureSessionId", "onConfigured-rphkYDA", "(Ljava/lang/String;I)V", "onConfigured", "onConfigureFailed-rphkYDA", "onConfigureFailed", "onReady-rphkYDA", "onReady", "onActive-rphkYDA", "onActive", "onCaptureQueueEmpty-rphkYDA", "onCaptureQueueEmpty", "onClosed-rphkYDA", "onClosed", "Landroid/view/Surface;", "surface", "onSurfacePrepared-GyX_H3Q", "(Ljava/lang/String;ILandroid/view/Surface;)V", "onSurfacePrepared", "Landroidx/camera/camera2/impl/RejectOperationCameraCaptureSession;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/RejectOperationCameraCaptureSession;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicRef;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Lkotlinx/atomicfu/AtomicRef;", "Api26CompatImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureSessionStateCallbacks implements androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.camera.camera2.impl.RejectOperationCameraCaptureSession getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.impl.RejectOperationCameraCaptureSession();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlinx.atomicfu.AtomicRef<java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>> getHighSpeedVideoSizes = kotlinx.atomicfu.AtomicFU.atomic(kotlin.collections.CollectionsKt.emptyList());

        public final void updateCallbacks$camera_camera2(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            kotlinx.atomicfu.AtomicRef<java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>> atomicRef = this.getHighSpeedVideoSizes;
            java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> sessionStateCallbacks = sessionConfig.getSessionStateCallbacks();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionStateCallbacks, "");
            atomicRef.setValue(kotlin.collections.CollectionsKt.toList(sessionStateCallbacks));
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onConfigured-rphkYDA, reason: not valid java name */
        public final void mo103onConfiguredrphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onConfigured(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onConfigureFailed-rphkYDA, reason: not valid java name */
        public final void mo102onConfigureFailedrphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onReady-rphkYDA, reason: not valid java name */
        public final void mo104onReadyrphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onReady(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onActive-rphkYDA, reason: not valid java name */
        public final void mo99onActiverphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onActive(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onCaptureQueueEmpty-rphkYDA, reason: not valid java name */
        public final void mo100onCaptureQueueEmptyrphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CaptureSessionStateCallbacks.Api26CompatImpl.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onClosed-rphkYDA, reason: not valid java name */
        public final void mo101onClosedrphkYDA(java.lang.String cameraId, int captureSessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onClosed(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onSurfacePrepared-GyX_H3Q, reason: not valid java name */
        public final void mo105onSurfacePreparedGyX_H3Q(java.lang.String cameraId, int captureSessionId, android.view.Surface surface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.getHighSpeedVideoSizes.getValue().iterator();
            while (it.hasNext()) {
                it.next().onSurfacePrepared(this.getHighResolutionOutputSizeshNQ4ISI, surface);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks$Api26CompatImpl;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession;", "p0", "Lkotlinx/atomicfu/AtomicRef;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "p1", "", "getHighSpeedVideoSizes", "(Landroid/hardware/camera2/CameraCaptureSession;Lkotlinx/atomicfu/AtomicRef;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class Api26CompatImpl {
            public static final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CaptureSessionStateCallbacks.Api26CompatImpl INSTANCE = new androidx.camera.camera2.impl.CameraInteropStateCallbackRepository.CaptureSessionStateCallbacks.Api26CompatImpl();

            private Api26CompatImpl() {
            }

            @kotlin.jvm.JvmStatic
            public static final void getHighSpeedVideoSizes(android.hardware.camera2.CameraCaptureSession p0, kotlinx.atomicfu.AtomicRef<java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>> p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
                java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = p1.getValue().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureQueueEmpty(p0);
                }
            }
        }
    }
}
