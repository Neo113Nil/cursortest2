package androidx.webkit;

/* loaded from: classes7.dex */
public class SpeculativeLoadingConfig {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    /* synthetic */ SpeculativeLoadingConfig(int i, int i2, int i3, byte b) {
        this(i, i2, i3);
    }

    private SpeculativeLoadingConfig(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.Camera2StreamConfigurationMap = i3;
    }

    public int getPrefetchTtlSeconds() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getMaxPrefetches() {
        return this.getHighSpeedVideoSizes;
    }

    public int getMaxPrerenders() {
        return this.Camera2StreamConfigurationMap;
    }

    public static final class Builder {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;

        public final androidx.webkit.SpeculativeLoadingConfig.Builder setPrefetchTtlSeconds(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Prefetch TTL must be greater than 0");
            }
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingConfig.Builder setMaxPrefetches(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Max prefetches must be greater than 0");
            }
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingConfig.Builder setMaxPrerenders(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Max prerenders must be greater than 0");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.webkit.SpeculativeLoadingConfig build() {
            return new androidx.webkit.SpeculativeLoadingConfig(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }
    }
}
