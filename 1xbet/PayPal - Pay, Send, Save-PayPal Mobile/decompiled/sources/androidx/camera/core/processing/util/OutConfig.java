package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
public abstract class OutConfig {
    abstract java.util.UUID Camera2StreamConfigurationMap();

    public abstract android.graphics.Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract android.util.Size getSize();

    public abstract int getTargets();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    public static androidx.camera.core.processing.util.OutConfig of(androidx.camera.core.processing.SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    public static androidx.camera.core.processing.util.OutConfig of(int i, int i2, android.graphics.Rect rect, android.util.Size size, int i3, boolean z) {
        return of(i, i2, rect, size, i3, z, false);
    }

    public static androidx.camera.core.processing.util.OutConfig of(int i, int i2, android.graphics.Rect rect, android.util.Size size, int i3, boolean z, boolean z2) {
        return new androidx.camera.core.processing.util.AutoValue_OutConfig(java.util.UUID.randomUUID(), i, i2, rect, size, i3, z, z2);
    }
}
