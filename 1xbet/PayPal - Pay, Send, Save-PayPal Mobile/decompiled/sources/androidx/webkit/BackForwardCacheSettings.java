package androidx.webkit;

/* loaded from: classes7.dex */
public class BackForwardCacheSettings {
    private final long Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoSizes;

    /* synthetic */ BackForwardCacheSettings(long j, int i, byte b) {
        this(j, i);
    }

    private BackForwardCacheSettings(long j, int i) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = i;
    }

    public long getTimeoutSeconds() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getMaxPagesInCache() {
        return this.getHighSpeedVideoSizes;
    }

    public static final class Builder {
        private long getHighResolutionOutputSizeshNQ4ISI = 600;
        private int getHighSpeedVideoFpsRangesFor = 6;

        public final androidx.webkit.BackForwardCacheSettings.Builder setTimeoutSeconds(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            return this;
        }

        public final androidx.webkit.BackForwardCacheSettings.Builder setMaxPagesInCache(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.webkit.BackForwardCacheSettings build() {
            return new androidx.webkit.BackForwardCacheSettings(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }
}
