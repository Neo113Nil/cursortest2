package androidx.camera.core;

/* loaded from: classes6.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private android.util.Rational getHighSpeedVideoSizes;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LayoutDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ScaleType {
    }

    ViewPort(int i, android.util.Rational rational, int i2, int i3) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = rational;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
    }

    public final android.util.Rational getAspectRatio() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getRotation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getScaleType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getLayoutDirection() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Builder {
        private final int Camera2StreamConfigurationMap;
        private final android.util.Rational getHighSpeedVideoSizes;
        private int getHighSpeedVideoFpsRangesFor = 1;
        private int getHighSpeedVideoFpsRanges = 0;

        public Builder(android.util.Rational rational, int i) {
            this.getHighSpeedVideoSizes = rational;
            this.Camera2StreamConfigurationMap = i;
        }

        public final androidx.camera.core.ViewPort.Builder setScaleType(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.camera.core.ViewPort.Builder setLayoutDirection(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public final androidx.camera.core.ViewPort build() {
            androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes, "The crop aspect ratio must be set.");
            return new androidx.camera.core.ViewPort(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
    }
}
