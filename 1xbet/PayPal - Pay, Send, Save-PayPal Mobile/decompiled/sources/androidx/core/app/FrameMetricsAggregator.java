package androidx.core.app;

/* loaded from: classes7.dex */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private final androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl(i);
    }

    public void add(android.app.Activity activity) {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(activity);
    }

    public android.util.SparseIntArray[] remove(android.app.Activity activity) {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(activity);
    }

    public android.util.SparseIntArray[] stop() {
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
    }

    public android.util.SparseIntArray[] reset() {
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
    }

    public android.util.SparseIntArray[] getMetrics() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
    }

    static class FrameMetricsBaseImpl {
        public android.util.SparseIntArray[] Camera2StreamConfigurationMap() {
            return null;
        }

        public android.util.SparseIntArray[] getHighResolutionOutputSizeshNQ4ISI() {
            return null;
        }

        public void getHighSpeedVideoFpsRanges(android.app.Activity activity) {
        }

        public android.util.SparseIntArray[] getHighSpeedVideoSizes() {
            return null;
        }

        public android.util.SparseIntArray[] getHighSpeedVideoSizes(android.app.Activity activity) {
            return null;
        }

        FrameMetricsBaseImpl() {
        }
    }

    static class FrameMetricsApi24Impl extends androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl {
        private static android.os.HandlerThread getHighSpeedVideoFpsRangesFor;
        private static android.os.Handler getHighSpeedVideoSizes;
        int getHighSpeedVideoFpsRanges;
        android.util.SparseIntArray[] getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseIntArray[9];
        private final java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> getOutputMinFrameDuration = new java.util.ArrayList<>();
        android.view.Window.OnFrameMetricsAvailableListener Camera2StreamConfigurationMap = new android.view.Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i) {
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 1) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl.Camera2StreamConfigurationMap(frameMetricsApi24Impl.getHighResolutionOutputSizeshNQ4ISI[0], frameMetrics.getMetric(8));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 2) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl2 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl2.Camera2StreamConfigurationMap(frameMetricsApi24Impl2.getHighResolutionOutputSizeshNQ4ISI[1], frameMetrics.getMetric(1));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 4) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl3 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl3.Camera2StreamConfigurationMap(frameMetricsApi24Impl3.getHighResolutionOutputSizeshNQ4ISI[2], frameMetrics.getMetric(3));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 8) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl4 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl4.Camera2StreamConfigurationMap(frameMetricsApi24Impl4.getHighResolutionOutputSizeshNQ4ISI[3], frameMetrics.getMetric(4));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 16) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl5 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl5.Camera2StreamConfigurationMap(frameMetricsApi24Impl5.getHighResolutionOutputSizeshNQ4ISI[4], frameMetrics.getMetric(5));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 64) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl6 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl6.Camera2StreamConfigurationMap(frameMetricsApi24Impl6.getHighResolutionOutputSizeshNQ4ISI[6], frameMetrics.getMetric(7));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 32) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl7 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl7.Camera2StreamConfigurationMap(frameMetricsApi24Impl7.getHighResolutionOutputSizeshNQ4ISI[5], frameMetrics.getMetric(6));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 128) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl8 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl8.Camera2StreamConfigurationMap(frameMetricsApi24Impl8.getHighResolutionOutputSizeshNQ4ISI[7], frameMetrics.getMetric(0));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.getHighSpeedVideoFpsRanges & 256) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl9 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl9.Camera2StreamConfigurationMap(frameMetricsApi24Impl9.getHighResolutionOutputSizeshNQ4ISI[8], frameMetrics.getMetric(2));
                }
            }
        };

        FrameMetricsApi24Impl(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        void Camera2StreamConfigurationMap(android.util.SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void getHighSpeedVideoFpsRanges(android.app.Activity activity) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("FrameMetricsAggregator");
                getHighSpeedVideoFpsRangesFor = handlerThread;
                handlerThread.start();
                getHighSpeedVideoSizes = new android.os.Handler(getHighSpeedVideoFpsRangesFor.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                android.util.SparseIntArray[] sparseIntArrayArr = this.getHighResolutionOutputSizeshNQ4ISI;
                if (sparseIntArrayArr[i] == null && (this.getHighSpeedVideoFpsRanges & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new android.util.SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.Camera2StreamConfigurationMap, getHighSpeedVideoSizes);
            this.getOutputMinFrameDuration.add(new java.lang.ref.WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] getHighSpeedVideoSizes(android.app.Activity activity) {
            java.util.Iterator<java.lang.ref.WeakReference<android.app.Activity>> it = this.getOutputMinFrameDuration.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.ref.WeakReference<android.app.Activity> next = it.next();
                if (next.get() == activity) {
                    this.getOutputMinFrameDuration.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.Camera2StreamConfigurationMap);
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] getHighResolutionOutputSizeshNQ4ISI() {
            for (int size = this.getOutputMinFrameDuration.size() - 1; size >= 0; size--) {
                java.lang.ref.WeakReference<android.app.Activity> weakReference = this.getOutputMinFrameDuration.get(size);
                android.app.Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.Camera2StreamConfigurationMap);
                    this.getOutputMinFrameDuration.remove(size);
                }
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] Camera2StreamConfigurationMap() {
            android.util.SparseIntArray[] sparseIntArrayArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }
}
