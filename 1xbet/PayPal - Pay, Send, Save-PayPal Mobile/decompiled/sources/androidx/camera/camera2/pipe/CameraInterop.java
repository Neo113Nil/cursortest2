package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/CameraInterop;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "nextCameraCaptureSessionId-159jkk4$camera_camera2_pipe", "()I", "nextCameraCaptureSessionId", "Lkotlinx/atomicfu/AtomicInt;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoSizes", "CaptureSessionListener", "CameraCaptureSessionId"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraInterop {
    public static final androidx.camera.camera2.pipe.CameraInterop INSTANCE = new androidx.camera.camera2.pipe.CameraInterop();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.atomicfu.AtomicInt getHighSpeedVideoSizes = kotlinx.atomicfu.AtomicFU.atomic(0);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\bJ'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "captureSessionId", "", "onConfigured-rphkYDA", "(Ljava/lang/String;I)V", "onConfigured", "onConfigureFailed-rphkYDA", "onConfigureFailed", "onReady-rphkYDA", "onReady", "onActive-rphkYDA", "onActive", "onCaptureQueueEmpty-rphkYDA", "onCaptureQueueEmpty", "onClosed-rphkYDA", "onClosed", "Landroid/view/Surface;", "surface", "onSurfacePrepared-GyX_H3Q", "(Ljava/lang/String;ILandroid/view/Surface;)V", "onSurfacePrepared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CaptureSessionListener {
        /* renamed from: onActive-rphkYDA */
        void mo99onActiverphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onCaptureQueueEmpty-rphkYDA */
        void mo100onCaptureQueueEmptyrphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onClosed-rphkYDA */
        void mo101onClosedrphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onConfigureFailed-rphkYDA */
        void mo102onConfigureFailedrphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onConfigured-rphkYDA */
        void mo103onConfiguredrphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onReady-rphkYDA */
        void mo104onReadyrphkYDA(java.lang.String cameraId, int captureSessionId);

        /* renamed from: onSurfacePrepared-GyX_H3Q */
        void mo105onSurfacePreparedGyX_H3Q(java.lang.String cameraId, int captureSessionId, android.view.Surface surface);
    }

    private CameraInterop() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class CameraCaptureSessionId {
        private final int value;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m404constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m406equalsimpl0(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ CameraCaptureSessionId(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m409unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m408toStringimpl(this.value);
        }

        public final int hashCode() {
            return m407hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m405equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m408toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraCaptureSessionId(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m407hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m405equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.CameraInterop.CameraCaptureSessionId) && i == ((androidx.camera.camera2.pipe.CameraInterop.CameraCaptureSessionId) obj).m409unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.CameraInterop.CameraCaptureSessionId m403boximpl(int i) {
            return new androidx.camera.camera2.pipe.CameraInterop.CameraCaptureSessionId(i);
        }
    }
}
