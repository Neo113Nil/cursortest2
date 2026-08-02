package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CaptureStage {
    androidx.camera.core.impl.CaptureConfig getCaptureConfig();

    int getId();

    public static final class DefaultCaptureStage implements androidx.camera.core.impl.CaptureStage {
        private final androidx.camera.core.impl.CaptureConfig getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        public final int getId() {
            return 0;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public final androidx.camera.core.impl.CaptureConfig getCaptureConfig() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
