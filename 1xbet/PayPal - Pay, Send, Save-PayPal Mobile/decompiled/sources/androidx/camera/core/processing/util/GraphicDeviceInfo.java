package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
public abstract class GraphicDeviceInfo {

    public static abstract class Builder {
        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo build();

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglExtensions(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglVersion(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlExtensions(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlVersion(java.lang.String str);
    }

    public abstract java.lang.String getEglExtensions();

    public abstract java.lang.String getEglVersion();

    public abstract java.lang.String getGlExtensions();

    public abstract java.lang.String getGlVersion();

    public static androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder() {
        return new androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo.Builder().setGlVersion(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN).setEglVersion(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN).setGlExtensions("").setEglExtensions("");
    }

    GraphicDeviceInfo() {
    }
}
