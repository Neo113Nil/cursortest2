package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class BackgroundThreadStateHandler<T> {
    final androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    T getHighSpeedVideoFpsRanges;
    T getHighSpeedVideoFpsRangesFor;
    final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoSizes;
    private final androidx.media3.common.util.HandlerWrapper getOutputFormats;

    public interface StateChangeListener<T> {
        void onStateChanged(T t, T t2);
    }

    public BackgroundThreadStateHandler(T t, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock, androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener<T> stateChangeListener) {
        this.getOutputFormats = clock.createHandler(looper, null);
        this.getHighSpeedVideoSizes = clock.createHandler(looper2, null);
        this.getHighSpeedVideoFpsRanges = t;
        this.getHighSpeedVideoFpsRangesFor = t;
        this.Camera2StreamConfigurationMap = stateChangeListener;
    }

    public final T get() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == this.getHighSpeedVideoSizes.getLooper()) {
            return this.getHighSpeedVideoFpsRanges;
        }
        com.google.common.base.Preconditions.checkState(myLooper == this.getOutputFormats.getLooper());
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void updateStateAsync(com.google.common.base.Function<T, T> function, final com.google.common.base.Function<T, T> function2) {
        com.google.common.base.Preconditions.checkState(android.os.Looper.myLooper() == this.getHighSpeedVideoSizes.getLooper());
        this.getHighResolutionOutputSizeshNQ4ISI++;
        runInBackground(new java.lang.Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda0
            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.media3.common.util.BackgroundThreadStateHandler backgroundThreadStateHandler = androidx.media3.common.util.BackgroundThreadStateHandler.this;
                final ?? apply = function2.apply(backgroundThreadStateHandler.getHighSpeedVideoFpsRangesFor);
                backgroundThreadStateHandler.getHighSpeedVideoFpsRangesFor = apply;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.common.util.BackgroundThreadStateHandler backgroundThreadStateHandler2 = androidx.media3.common.util.BackgroundThreadStateHandler.this;
                        ?? r1 = apply;
                        int i = backgroundThreadStateHandler2.getHighResolutionOutputSizeshNQ4ISI - 1;
                        backgroundThreadStateHandler2.getHighResolutionOutputSizeshNQ4ISI = i;
                        if (i == 0) {
                            T t = backgroundThreadStateHandler2.getHighSpeedVideoFpsRanges;
                            backgroundThreadStateHandler2.getHighSpeedVideoFpsRanges = r1;
                            if (t.equals(r1)) {
                                return;
                            }
                            backgroundThreadStateHandler2.Camera2StreamConfigurationMap.onStateChanged(t, r1);
                        }
                    }
                };
                if (backgroundThreadStateHandler.getHighSpeedVideoSizes.getLooper().getThread().isAlive()) {
                    backgroundThreadStateHandler.getHighSpeedVideoSizes.post(runnable);
                }
            }
        });
        T apply = function.apply(this.getHighSpeedVideoFpsRanges);
        T t = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = apply;
        if (t.equals(apply)) {
            return;
        }
        this.Camera2StreamConfigurationMap.onStateChanged(t, apply);
    }

    public final void setStateInBackground(final T t) {
        this.getHighSpeedVideoFpsRangesFor = t;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.common.util.BackgroundThreadStateHandler$$ExternalSyntheticLambda1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.BackgroundThreadStateHandler backgroundThreadStateHandler = androidx.media3.common.util.BackgroundThreadStateHandler.this;
                ?? r1 = t;
                if (backgroundThreadStateHandler.getHighResolutionOutputSizeshNQ4ISI == 0) {
                    T t2 = backgroundThreadStateHandler.getHighSpeedVideoFpsRanges;
                    backgroundThreadStateHandler.getHighSpeedVideoFpsRanges = r1;
                    if (t2.equals(r1)) {
                        return;
                    }
                    backgroundThreadStateHandler.Camera2StreamConfigurationMap.onStateChanged(t2, r1);
                }
            }
        };
        if (this.getHighSpeedVideoSizes.getLooper().getThread().isAlive()) {
            this.getHighSpeedVideoSizes.post(runnable);
        }
    }

    public final void runInBackground(java.lang.Runnable runnable) {
        if (this.getOutputFormats.getLooper().getThread().isAlive()) {
            this.getOutputFormats.post(runnable);
        }
    }
}
