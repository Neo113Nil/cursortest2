package androidx.webkit;

/* loaded from: classes7.dex */
public final class WebViewStartUpConfig {
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    /* synthetic */ WebViewStartUpConfig(java.util.concurrent.Executor executor, boolean z, java.util.Set set, byte b) {
        this(executor, z, set);
    }

    private WebViewStartUpConfig(java.util.concurrent.Executor executor, boolean z, java.util.Set<java.lang.String> set) {
        this.getHighSpeedVideoFpsRangesFor = executor;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
    }

    public final java.util.concurrent.Executor getBackgroundExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean shouldRunUiThreadStartUpTasks() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.Set<java.lang.String> getProfilesToLoadDuringStartup() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Builder {
        private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRangesFor = true;
        private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = null;

        public Builder(java.util.concurrent.Executor executor) {
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
        }

        public final androidx.webkit.WebViewStartUpConfig.Builder setShouldRunUiThreadStartUpTasks(boolean z) {
            if (this.getHighSpeedVideoFpsRanges != null && !z) {
                throw new java.lang.IllegalArgumentException("Can't specify profiles to load without running UI thread startup tasks");
            }
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final androidx.webkit.WebViewStartUpConfig.Builder setProfilesToLoadDuringStartup(java.util.Set<java.lang.String> set) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalArgumentException("Can't specify profiles to load without running UI thread startup tasks");
            }
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet(set);
            return this;
        }

        public final androidx.webkit.WebViewStartUpConfig build() {
            return new androidx.webkit.WebViewStartUpConfig(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }
}
