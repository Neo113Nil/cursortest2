package androidx.camera.core;

/* loaded from: classes6.dex */
public class CompositionSettings {
    public static final androidx.camera.core.CompositionSettings DEFAULT = new androidx.camera.core.CompositionSettings.Builder().setAlpha(1.0f).setOffset(0.0f, 0.0f).setScale(1.0f, 1.0f).build();
    private final androidx.core.util.Pair<java.lang.Float, java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.core.util.Pair<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoSizes;

    /* synthetic */ CompositionSettings(float f, androidx.core.util.Pair pair, androidx.core.util.Pair pair2, byte b) {
        this(f, pair, pair2);
    }

    private CompositionSettings(float f, androidx.core.util.Pair<java.lang.Float, java.lang.Float> pair, androidx.core.util.Pair<java.lang.Float, java.lang.Float> pair2) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = pair;
        this.getHighResolutionOutputSizeshNQ4ISI = pair2;
    }

    public float getAlpha() {
        return this.getHighSpeedVideoSizes;
    }

    public androidx.core.util.Pair<java.lang.Float, java.lang.Float> getOffset() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public androidx.core.util.Pair<java.lang.Float, java.lang.Float> getScale() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Builder {
        private float getHighResolutionOutputSizeshNQ4ISI;
        private androidx.core.util.Pair<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRangesFor;
        private androidx.core.util.Pair<java.lang.Float, java.lang.Float> getHighSpeedVideoSizes;

        public Builder() {
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            this.getHighResolutionOutputSizeshNQ4ISI = 1.0f;
            java.lang.Float valueOf2 = java.lang.Float.valueOf(0.0f);
            this.getHighSpeedVideoFpsRangesFor = androidx.core.util.Pair.create(valueOf2, valueOf2);
            this.getHighSpeedVideoSizes = androidx.core.util.Pair.create(valueOf, valueOf);
        }

        public final androidx.camera.core.CompositionSettings.Builder setAlpha(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            return this;
        }

        public final androidx.camera.core.CompositionSettings.Builder setOffset(float f, float f2) {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.util.Pair.create(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
            return this;
        }

        public final androidx.camera.core.CompositionSettings.Builder setScale(float f, float f2) {
            this.getHighSpeedVideoSizes = androidx.core.util.Pair.create(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
            return this;
        }

        public final androidx.camera.core.CompositionSettings build() {
            return new androidx.camera.core.CompositionSettings(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
