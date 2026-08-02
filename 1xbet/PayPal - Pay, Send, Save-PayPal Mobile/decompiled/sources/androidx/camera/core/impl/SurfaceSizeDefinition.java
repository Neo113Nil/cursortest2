package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class SurfaceSizeDefinition {
    public abstract android.util.Size getAnalysisSize();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getMaximum16x9SizeMap();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getMaximum4x3SizeMap();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap();

    public abstract android.util.Size getPreviewSize();

    public abstract android.util.Size getRecordSize();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap();

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap();

    SurfaceSizeDefinition() {
    }

    public static androidx.camera.core.impl.SurfaceSizeDefinition create(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4, java.util.Map<java.lang.Integer, android.util.Size> map5, java.util.Map<java.lang.Integer, android.util.Size> map6) {
        return new androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4, map5, map6);
    }

    public android.util.Size getS720pSize(int i) {
        return getS720pSizeMap().get(java.lang.Integer.valueOf(i));
    }

    public android.util.Size getS1440pSize(int i) {
        return getS1440pSizeMap().get(java.lang.Integer.valueOf(i));
    }

    public android.util.Size getMaximumSize(int i) {
        return getMaximumSizeMap().get(java.lang.Integer.valueOf(i));
    }

    public android.util.Size getMaximum4x3Size(int i) {
        return getMaximumSizeMap().get(java.lang.Integer.valueOf(i));
    }

    public android.util.Size getMaximum16x9Size(int i) {
        return getMaximumSizeMap().get(java.lang.Integer.valueOf(i));
    }

    public android.util.Size getUltraMaximumSize(int i) {
        return getUltraMaximumSizeMap().get(java.lang.Integer.valueOf(i));
    }
}
