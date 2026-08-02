package androidx.camera.core;

/* loaded from: classes6.dex */
public abstract class ImmutableImageInfo implements androidx.camera.core.ImageInfo {
    @Override // androidx.camera.core.ImageInfo
    public abstract int getFlashState();

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract android.graphics.Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    public abstract androidx.camera.core.impl.TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    public static androidx.camera.core.ImageInfo create(androidx.camera.core.impl.TagBundle tagBundle, long j, int i, android.graphics.Matrix matrix, int i2) {
        return new androidx.camera.core.AutoValue_ImmutableImageInfo(tagBundle, j, i, matrix, i2);
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
