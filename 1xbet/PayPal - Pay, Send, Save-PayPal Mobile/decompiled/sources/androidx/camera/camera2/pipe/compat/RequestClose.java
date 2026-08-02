package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RequestClose;", "Landroidx/camera/camera2/pipe/compat/CameraRequest;", "Landroidx/camera/camera2/pipe/compat/ActiveCamera;", "activeCamera", "<init>", "(Landroidx/camera/camera2/pipe/compat/ActiveCamera;)V", "component1", "()Landroidx/camera/camera2/pipe/compat/ActiveCamera;", "copy", "(Landroidx/camera/camera2/pipe/compat/ActiveCamera;)Landroidx/camera/camera2/pipe/compat/RequestClose;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/compat/ActiveCamera;", "getActiveCamera"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RequestClose extends androidx.camera.camera2.pipe.compat.CameraRequest {
    private final androidx.camera.camera2.pipe.compat.ActiveCamera activeCamera;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestClose(androidx.camera.camera2.pipe.compat.ActiveCamera activeCamera) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeCamera, "");
        this.activeCamera = activeCamera;
    }

    public final androidx.camera.camera2.pipe.compat.ActiveCamera getActiveCamera() {
        return this.activeCamera;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestClose(activeCamera=");
        sb.append(this.activeCamera);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.activeCamera.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.camera.camera2.pipe.compat.RequestClose) && kotlin.jvm.internal.Intrinsics.areEqual(this.activeCamera, ((androidx.camera.camera2.pipe.compat.RequestClose) other).activeCamera);
    }

    public final androidx.camera.camera2.pipe.compat.RequestClose copy(androidx.camera.camera2.pipe.compat.ActiveCamera activeCamera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeCamera, "");
        return new androidx.camera.camera2.pipe.compat.RequestClose(activeCamera);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.compat.ActiveCamera getActiveCamera() {
        return this.activeCamera;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.compat.RequestClose copy$default(androidx.camera.camera2.pipe.compat.RequestClose requestClose, androidx.camera.camera2.pipe.compat.ActiveCamera activeCamera, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activeCamera = requestClose.activeCamera;
        }
        return requestClose.copy(activeCamera);
    }
}
