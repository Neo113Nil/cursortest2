package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "cameraState", "Landroidx/camera/camera2/pipe/CameraError;", "errorCode", "<init>", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Landroidx/camera/camera2/pipe/CameraError;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "component2-mVEW8x0", "()Landroidx/camera/camera2/pipe/CameraError;", "component2", "copy-8d-yNqA", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Landroidx/camera/camera2/pipe/CameraError;)Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "getCameraState", "Landroidx/camera/camera2/pipe/CameraError;", "getErrorCode-mVEW8x0"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OpenCameraResult {
    private final androidx.camera.camera2.pipe.compat.AndroidCameraState cameraState;
    private final androidx.camera.camera2.pipe.CameraError errorCode;

    private OpenCameraResult(androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.CameraError cameraError) {
        this.cameraState = androidCameraState;
        this.errorCode = cameraError;
    }

    public /* synthetic */ OpenCameraResult(androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.CameraError cameraError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : androidCameraState, (i & 2) != 0 ? null : cameraError, null);
    }

    public final androidx.camera.camera2.pipe.compat.AndroidCameraState getCameraState() {
        return this.cameraState;
    }

    /* renamed from: getErrorCode-mVEW8x0, reason: not valid java name */
    public final androidx.camera.camera2.pipe.CameraError m829getErrorCodemVEW8x0() {
        return this.errorCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenCameraResult(cameraState=");
        sb.append(this.cameraState);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState = this.cameraState;
        int hashCode = androidCameraState == null ? 0 : androidCameraState.hashCode();
        androidx.camera.camera2.pipe.CameraError cameraError = this.errorCode;
        return (hashCode * 31) + (cameraError != null ? androidx.camera.camera2.pipe.CameraError.m323hashCodeimpl(cameraError.m326unboximpl()) : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.compat.OpenCameraResult)) {
            return false;
        }
        androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult = (androidx.camera.camera2.pipe.compat.OpenCameraResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cameraState, openCameraResult.cameraState) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, openCameraResult.errorCode);
    }

    /* renamed from: copy-8d-yNqA, reason: not valid java name */
    public final androidx.camera.camera2.pipe.compat.OpenCameraResult m828copy8dyNqA(androidx.camera.camera2.pipe.compat.AndroidCameraState cameraState, androidx.camera.camera2.pipe.CameraError errorCode) {
        return new androidx.camera.camera2.pipe.compat.OpenCameraResult(cameraState, errorCode, null);
    }

    /* renamed from: component2-mVEW8x0, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.CameraError getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.compat.AndroidCameraState getCameraState() {
        return this.cameraState;
    }

    /* renamed from: copy-8d-yNqA$default, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.compat.OpenCameraResult m826copy8dyNqA$default(androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.CameraError cameraError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            androidCameraState = openCameraResult.cameraState;
        }
        if ((i & 2) != 0) {
            cameraError = openCameraResult.errorCode;
        }
        return openCameraResult.m828copy8dyNqA(androidCameraState, cameraError);
    }

    public /* synthetic */ OpenCameraResult(androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.CameraError cameraError, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(androidCameraState, cameraError);
    }
}
