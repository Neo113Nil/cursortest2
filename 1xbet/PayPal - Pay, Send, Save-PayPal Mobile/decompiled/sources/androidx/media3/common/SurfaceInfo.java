package androidx.media3.common;

/* loaded from: classes7.dex */
public final class SurfaceInfo {
    public final int height;
    public final boolean isEncoderInputSurface;
    public final int orientationDegrees;
    public final android.view.Surface surface;
    public final int width;

    public SurfaceInfo(android.view.Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public SurfaceInfo(android.view.Surface surface, int i, int i2, int i3) {
        this(surface, i, i2, i3, false);
    }

    public SurfaceInfo(android.view.Surface surface, int i, int i2, int i3, boolean z) {
        com.google.common.base.Preconditions.checkArgument(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i;
        this.height = i2;
        this.orientationDegrees = i3;
        this.isEncoderInputSurface = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.SurfaceInfo)) {
            return false;
        }
        androidx.media3.common.SurfaceInfo surfaceInfo = (androidx.media3.common.SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.isEncoderInputSurface == surfaceInfo.isEncoderInputSurface && this.surface.equals(surfaceInfo.surface);
    }

    public final int hashCode() {
        int hashCode = this.surface.hashCode();
        int i = this.width;
        return (((((((hashCode * 31) + i) * 31) + this.height) * 31) + this.orientationDegrees) * 31) + (this.isEncoderInputSurface ? 1 : 0);
    }
}
