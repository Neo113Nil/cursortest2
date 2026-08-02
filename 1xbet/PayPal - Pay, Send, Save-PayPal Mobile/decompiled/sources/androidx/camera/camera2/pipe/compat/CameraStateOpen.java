package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraStateOpen;", "Landroidx/camera/camera2/pipe/compat/CameraState;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;)V", "component1", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "copy", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;)Landroidx/camera/camera2/pipe/compat/CameraStateOpen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "getCameraDevice"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CameraStateOpen extends androidx.camera.camera2.pipe.compat.CameraState {
    private final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpen(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceWrapper, "");
        this.cameraDevice = cameraDeviceWrapper;
    }

    public final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper getCameraDevice() {
        return this.cameraDevice;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraStateOpen(cameraDevice=");
        sb.append(this.cameraDevice);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.cameraDevice.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraDevice, ((androidx.camera.camera2.pipe.compat.CameraStateOpen) other).cameraDevice);
    }

    public final androidx.camera.camera2.pipe.compat.CameraStateOpen copy(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        return new androidx.camera.camera2.pipe.compat.CameraStateOpen(cameraDevice);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper getCameraDevice() {
        return this.cameraDevice;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.compat.CameraStateOpen copy$default(androidx.camera.camera2.pipe.compat.CameraStateOpen cameraStateOpen, androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cameraDeviceWrapper = cameraStateOpen.cameraDevice;
        }
        return cameraStateOpen.copy(cameraDeviceWrapper);
    }
}
