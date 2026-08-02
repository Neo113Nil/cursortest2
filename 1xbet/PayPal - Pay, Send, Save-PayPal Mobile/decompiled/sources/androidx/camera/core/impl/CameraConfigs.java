package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class CameraConfigs {
    private static final androidx.camera.core.impl.CameraConfig getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.CameraConfigs.DefaultCameraConfig();

    public static androidx.camera.core.impl.CameraConfig defaultConfig() {
        return getHighSpeedVideoFpsRanges;
    }

    static final class DefaultCameraConfig implements androidx.camera.core.impl.CameraConfig {
        private final androidx.camera.core.impl.Identifier getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.Identifier.create(new java.lang.Object());

        DefaultCameraConfig() {
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public final androidx.camera.core.impl.Identifier getCompatibilityId() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public final androidx.camera.core.impl.Config getConfig() {
            return androidx.camera.core.impl.OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }
}
