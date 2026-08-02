package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class AsyncDifferConfig<T> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> Camera2StreamConfigurationMap;
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    AsyncDifferConfig(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
        this.getHighSpeedVideoFpsRangesFor = executor2;
        this.Camera2StreamConfigurationMap = itemCallback;
    }

    public final java.util.concurrent.Executor getMainThreadExecutor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.concurrent.Executor getBackgroundThreadExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.Camera2StreamConfigurationMap;
    }

    public static final class Builder<T> {
        private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        private static java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
        private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getHighSpeedVideoFpsRangesFor;
        private java.util.concurrent.Executor getHighSpeedVideoSizes;

        public Builder(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
            this.getHighSpeedVideoFpsRangesFor = itemCallback;
        }

        public final androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setMainThreadExecutor(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoSizes = executor;
            return this;
        }

        public final androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setBackgroundThreadExecutor(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRanges = executor;
            return this;
        }

        public final androidx.recyclerview.widget.AsyncDifferConfig<T> build() {
            if (this.getHighSpeedVideoFpsRanges == null) {
                synchronized (Camera2StreamConfigurationMap) {
                    if (getHighResolutionOutputSizeshNQ4ISI == null) {
                        getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.Executors.newFixedThreadPool(2);
                    }
                }
                this.getHighSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI;
            }
            return new androidx.recyclerview.widget.AsyncDifferConfig<>(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
