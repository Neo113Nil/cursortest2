package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d"}, d2 = {"Landroidx/camera/compose/ViewfinderArgs;", "", "Landroidx/camera/core/SurfaceRequest;", "p0", "Landroidx/camera/viewfinder/core/ImplementationMode;", "p1", "Landroidx/camera/viewfinder/core/TransformationInfo;", "p2", "<init>", "(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/viewfinder/core/ImplementationMode;Landroidx/camera/viewfinder/core/TransformationInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/SurfaceRequest;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/camera/core/SurfaceRequest;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/viewfinder/core/ImplementationMode;", "()Landroidx/camera/viewfinder/core/ImplementationMode;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/core/TransformationInfo;", "()Landroidx/camera/viewfinder/core/TransformationInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ViewfinderArgs {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.viewfinder.core.ImplementationMode getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.core.SurfaceRequest Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.viewfinder.core.TransformationInfo getHighSpeedVideoFpsRangesFor;

    public ViewfinderArgs(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.camera.viewfinder.core.TransformationInfo transformationInfo) {
        this.Camera2StreamConfigurationMap = surfaceRequest;
        this.getHighSpeedVideoSizes = implementationMode;
        this.getHighSpeedVideoFpsRangesFor = transformationInfo;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.camera.core.SurfaceRequest getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.camera.viewfinder.core.ImplementationMode getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.camera.viewfinder.core.TransformationInfo getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewfinderArgs(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.camera.compose.ViewfinderArgs)) {
            return false;
        }
        androidx.camera.compose.ViewfinderArgs viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, viewfinderArgs.Camera2StreamConfigurationMap) && this.getHighSpeedVideoSizes == viewfinderArgs.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, viewfinderArgs.getHighSpeedVideoFpsRangesFor);
    }
}
