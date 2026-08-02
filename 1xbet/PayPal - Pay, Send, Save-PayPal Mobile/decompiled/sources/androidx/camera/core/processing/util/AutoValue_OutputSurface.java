package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
final class AutoValue_OutputSurface extends androidx.camera.core.processing.util.OutputSurface {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final android.opengl.EGLSurface getHighSpeedVideoFpsRangesFor;

    AutoValue_OutputSurface(android.opengl.EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new java.lang.NullPointerException("Null eglSurface");
        }
        this.getHighSpeedVideoFpsRangesFor = eGLSurface;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final android.opengl.EGLSurface getEglSurface() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int getWidth() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int getHeight() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", width=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", height=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.OutputSurface)) {
            return false;
        }
        androidx.camera.core.processing.util.OutputSurface outputSurface = (androidx.camera.core.processing.util.OutputSurface) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(outputSurface.getEglSurface()) && this.getHighSpeedVideoFpsRanges == outputSurface.getWidth() && this.Camera2StreamConfigurationMap == outputSurface.getHeight();
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges) * 1000003) ^ this.Camera2StreamConfigurationMap;
    }
}
