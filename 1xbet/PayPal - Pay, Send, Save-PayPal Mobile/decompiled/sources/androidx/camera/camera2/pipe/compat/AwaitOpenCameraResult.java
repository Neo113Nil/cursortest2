package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDeviceWrapper", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "androidCameraState", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;)V", "component1", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "component2", "()Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "copy", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;)Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "getCameraDeviceWrapper", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "getAndroidCameraState"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AwaitOpenCameraResult {
    private final androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState;
    private final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper;

    public AwaitOpenCameraResult(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState) {
        this.cameraDeviceWrapper = cameraDeviceWrapper;
        this.androidCameraState = androidCameraState;
    }

    public /* synthetic */ AwaitOpenCameraResult(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cameraDeviceWrapper, (i & 2) != 0 ? null : androidCameraState);
    }

    public final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper getCameraDeviceWrapper() {
        return this.cameraDeviceWrapper;
    }

    public final androidx.camera.camera2.pipe.compat.AndroidCameraState getAndroidCameraState() {
        return this.androidCameraState;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AwaitOpenCameraResult(cameraDeviceWrapper=");
        sb.append(this.cameraDeviceWrapper);
        sb.append(", androidCameraState=");
        sb.append(this.androidCameraState);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper = this.cameraDeviceWrapper;
        int hashCode = cameraDeviceWrapper == null ? 0 : cameraDeviceWrapper.hashCode();
        androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState = this.androidCameraState;
        return (hashCode * 31) + (androidCameraState != null ? androidCameraState.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult)) {
            return false;
        }
        androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult awaitOpenCameraResult = (androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cameraDeviceWrapper, awaitOpenCameraResult.cameraDeviceWrapper) && kotlin.jvm.internal.Intrinsics.areEqual(this.androidCameraState, awaitOpenCameraResult.androidCameraState);
    }

    public final androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult copy(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState) {
        return new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult(cameraDeviceWrapper, androidCameraState);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.camera2.pipe.compat.AndroidCameraState getAndroidCameraState() {
        return this.androidCameraState;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.compat.CameraDeviceWrapper getCameraDeviceWrapper() {
        return this.cameraDeviceWrapper;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult copy$default(androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult awaitOpenCameraResult, androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cameraDeviceWrapper = awaitOpenCameraResult.cameraDeviceWrapper;
        }
        if ((i & 2) != 0) {
            androidCameraState = awaitOpenCameraResult.androidCameraState;
        }
        return awaitOpenCameraResult.copy(cameraDeviceWrapper, androidCameraState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitOpenCameraResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
