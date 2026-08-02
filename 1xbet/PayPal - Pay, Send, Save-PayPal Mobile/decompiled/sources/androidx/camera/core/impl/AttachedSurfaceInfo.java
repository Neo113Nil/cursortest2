package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class AttachedSurfaceInfo {
    public abstract java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes();

    public abstract int getCustomMaxFrameRate();

    public abstract androidx.camera.core.DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    public abstract androidx.camera.core.impl.Config getImplementationOptions();

    public abstract int getSessionType();

    public abstract android.util.Size getSize();

    public abstract androidx.camera.core.impl.SurfaceConfig getSurfaceConfig();

    public abstract android.util.Range<java.lang.Integer> getTargetFrameRate();

    public abstract boolean isStrictFrameRateRequired();

    AttachedSurfaceInfo() {
    }

    public static androidx.camera.core.impl.AttachedSurfaceInfo create(androidx.camera.core.impl.SurfaceConfig surfaceConfig, int i, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list, androidx.camera.core.impl.Config config, int i2, android.util.Range<java.lang.Integer> range, boolean z, int i3) {
        return new androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo(surfaceConfig, i, size, dynamicRange, list, config, i2, range, z, i3);
    }

    public androidx.camera.core.impl.StreamSpec toStreamSpec(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.impl.StreamSpec.builder(getSize()).setSessionType(getSessionType()).setExpectedFrameRateRange(getTargetFrameRate()).setDynamicRange(getDynamicRange()).setImplementationOptions(config).build();
    }
}
