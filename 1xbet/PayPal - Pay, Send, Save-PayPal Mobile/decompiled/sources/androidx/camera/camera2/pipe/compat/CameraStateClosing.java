package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraStateClosing;", "Landroidx/camera/camera2/pipe/compat/CameraState;", "Landroidx/camera/camera2/pipe/CameraError;", "cameraErrorCode", "<init>", "(Landroidx/camera/camera2/pipe/CameraError;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-mVEW8x0", "()Landroidx/camera/camera2/pipe/CameraError;", "component1", "copy-TPqeGZw", "(Landroidx/camera/camera2/pipe/CameraError;)Landroidx/camera/camera2/pipe/compat/CameraStateClosing;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CameraError;", "getCameraErrorCode-mVEW8x0"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CameraStateClosing extends androidx.camera.camera2.pipe.compat.CameraState {
    private final androidx.camera.camera2.pipe.CameraError cameraErrorCode;

    private CameraStateClosing(androidx.camera.camera2.pipe.CameraError cameraError) {
        super(null);
        this.cameraErrorCode = cameraError;
    }

    public /* synthetic */ CameraStateClosing(androidx.camera.camera2.pipe.CameraError cameraError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cameraError, null);
    }

    /* renamed from: getCameraErrorCode-mVEW8x0, reason: not valid java name */
    public final androidx.camera.camera2.pipe.CameraError m820getCameraErrorCodemVEW8x0() {
        return this.cameraErrorCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraStateClosing(cameraErrorCode=");
        sb.append(this.cameraErrorCode);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.camera.camera2.pipe.CameraError cameraError = this.cameraErrorCode;
        if (cameraError == null) {
            return 0;
        }
        return androidx.camera.camera2.pipe.CameraError.m323hashCodeimpl(cameraError.m326unboximpl());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.camera.camera2.pipe.compat.CameraStateClosing) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraErrorCode, ((androidx.camera.camera2.pipe.compat.CameraStateClosing) other).cameraErrorCode);
    }

    /* renamed from: copy-TPqeGZw, reason: not valid java name */
    public final androidx.camera.camera2.pipe.compat.CameraStateClosing m819copyTPqeGZw(androidx.camera.camera2.pipe.CameraError cameraErrorCode) {
        return new androidx.camera.camera2.pipe.compat.CameraStateClosing(cameraErrorCode, null);
    }

    /* renamed from: component1-mVEW8x0, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.CameraError getCameraErrorCode() {
        return this.cameraErrorCode;
    }

    /* renamed from: copy-TPqeGZw$default, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.compat.CameraStateClosing m817copyTPqeGZw$default(androidx.camera.camera2.pipe.compat.CameraStateClosing cameraStateClosing, androidx.camera.camera2.pipe.CameraError cameraError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cameraError = cameraStateClosing.cameraErrorCode;
        }
        return cameraStateClosing.m819copyTPqeGZw(cameraError);
    }

    public /* synthetic */ CameraStateClosing(androidx.camera.camera2.pipe.CameraError cameraError, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraError);
    }
}
