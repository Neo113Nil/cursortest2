package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
public abstract class DualOutConfig {
    public abstract androidx.camera.core.processing.util.OutConfig getPrimaryOutConfig();

    public abstract androidx.camera.core.processing.util.OutConfig getSecondaryOutConfig();

    public static androidx.camera.core.processing.concurrent.DualOutConfig of(androidx.camera.core.processing.util.OutConfig outConfig, androidx.camera.core.processing.util.OutConfig outConfig2) {
        return new androidx.camera.core.processing.concurrent.AutoValue_DualOutConfig(outConfig, outConfig2);
    }
}
