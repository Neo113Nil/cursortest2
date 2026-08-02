package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012"}, d2 = {"Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "", "", "width", "height", "Landroidx/camera/viewfinder/core/ImplementationMode;", "implementationMode", "", "requestId", "<init>", "(IILandroidx/camera/viewfinder/core/ImplementationMode;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(IILandroidx/camera/viewfinder/core/ImplementationMode;Ljava/lang/String;)Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", com.visa.cbp.getEncExpo.warmup, "getWidth", "getHeight", "Landroidx/camera/viewfinder/core/ImplementationMode;", "getImplementationMode", "()Landroidx/camera/viewfinder/core/ImplementationMode;", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderSurfaceRequest {
    private final int height;
    private final androidx.camera.viewfinder.core.ImplementationMode implementationMode;
    private final java.lang.String requestId;
    private final int width;

    public ViewfinderSurfaceRequest(int i, int i2, androidx.camera.viewfinder.core.ImplementationMode implementationMode, java.lang.String str) {
        this.width = i;
        this.height = i2;
        this.implementationMode = implementationMode;
        this.requestId = str;
    }

    public /* synthetic */ ViewfinderSurfaceRequest(int i, int i2, androidx.camera.viewfinder.core.ImplementationMode implementationMode, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : implementationMode, (i3 & 8) != 0 ? null : str);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final androidx.camera.viewfinder.core.ImplementationMode getImplementationMode() {
        return this.implementationMode;
    }

    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.viewfinder.core.ViewfinderSurfaceRequest)) {
            return false;
        }
        androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest = (androidx.camera.viewfinder.core.ViewfinderSurfaceRequest) other;
        return this.width == viewfinderSurfaceRequest.width && this.height == viewfinderSurfaceRequest.height && this.implementationMode == viewfinderSurfaceRequest.implementationMode && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, viewfinderSurfaceRequest.requestId);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.width);
        int hashCode2 = java.lang.Integer.hashCode(this.height);
        androidx.camera.viewfinder.core.ImplementationMode implementationMode = this.implementationMode;
        int hashCode3 = implementationMode != null ? implementationMode.hashCode() : 0;
        java.lang.String str = this.requestId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewfinderSurfaceRequest(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", implementationMode=");
        sb.append(this.implementationMode);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ androidx.camera.viewfinder.core.ViewfinderSurfaceRequest copy$default(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest, int i, int i2, androidx.camera.viewfinder.core.ImplementationMode implementationMode, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = viewfinderSurfaceRequest.width;
        }
        if ((i3 & 2) != 0) {
            i2 = viewfinderSurfaceRequest.height;
        }
        if ((i3 & 4) != 0) {
            implementationMode = viewfinderSurfaceRequest.implementationMode;
        }
        if ((i3 & 8) != 0) {
            str = viewfinderSurfaceRequest.requestId;
        }
        return viewfinderSurfaceRequest.copy(i, i2, implementationMode, str);
    }

    public final /* synthetic */ androidx.camera.viewfinder.core.ViewfinderSurfaceRequest copy(int width, int height, androidx.camera.viewfinder.core.ImplementationMode implementationMode, java.lang.String requestId) {
        return new androidx.camera.viewfinder.core.ViewfinderSurfaceRequest(width, height, implementationMode, requestId);
    }

    public ViewfinderSurfaceRequest(int i, int i2, androidx.camera.viewfinder.core.ImplementationMode implementationMode) {
        this(i, i2, implementationMode, null, 8, null);
    }

    public ViewfinderSurfaceRequest(int i, int i2) {
        this(i, i2, null, null, 12, null);
    }
}
