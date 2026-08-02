package androidx.camera.camera2.interop;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/interop/Camera2Interop;", "", "<init>", "()V", "Extender"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2Interop {
    private Camera2Interop() {
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "T", "", "Landroidx/camera/core/ExtendableBuilder;", "baseBuilder", "<init>", "(Landroidx/camera/core/ExtendableBuilder;)V", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "", "templateType", "setCaptureRequestTemplate", "(I)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "", "streamUseCase", "setStreamUseCase", "(J)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "stateCallback", "setDeviceStateCallback", "(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "setSessionStateCallback", "(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "captureCallback", "setSessionCaptureCallback", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "", "cameraId", "setPhysicalCameraId", "(Ljava/lang/String;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;", "getHighSpeedVideoSizes", "Landroidx/camera/core/ExtendableBuilder;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Extender<T> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.camera.core.ExtendableBuilder<T> getHighSpeedVideoFpsRanges;

        public Extender(androidx.camera.core.ExtendableBuilder<T> extendableBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendableBuilder, "");
            this.getHighSpeedVideoFpsRanges = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key), androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE, value);
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestTemplate(int templateType) {
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.TEMPLATE_TYPE_OPTION, java.lang.Integer.valueOf(templateType));
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setStreamUseCase(long streamUseCase) {
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION, java.lang.Long.valueOf(streamUseCase));
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateCallback, "");
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateCallback, "");
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureCallback, "");
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        public final androidx.camera.camera2.interop.Camera2Interop.Extender<T> setPhysicalCameraId(java.lang.String cameraId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, cameraId);
            return this;
        }
    }
}
