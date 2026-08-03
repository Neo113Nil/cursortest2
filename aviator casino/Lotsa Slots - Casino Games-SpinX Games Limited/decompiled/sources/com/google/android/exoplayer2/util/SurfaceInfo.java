package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class SurfaceInfo {
    public final int height;
    public final int orientationDegrees;
    public final android.view.Surface surface;
    public final int width;

    public SurfaceInfo(android.view.Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public SurfaceInfo(android.view.Surface surface, int i, int i2, int i3) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i;
        this.height = i2;
        this.orientationDegrees = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.util.SurfaceInfo)) {
            return false;
        }
        com.google.android.exoplayer2.util.SurfaceInfo surfaceInfo = (com.google.android.exoplayer2.util.SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees;
    }
}
