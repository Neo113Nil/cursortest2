package androidx.media3.exoplayer.upstream.experimental;

/* loaded from: classes2.dex */
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final androidx.media3.common.util.Clock clock;
    private long estimateUs;
    private final java.util.LinkedHashMap<androidx.media3.datasource.DataSpec, java.lang.Long> initializedDataSpecs;
    private final double smoothingFactor;

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, androidx.media3.common.util.Clock.DEFAULT);
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d) {
        this(d, androidx.media3.common.util.Clock.DEFAULT);
    }

    ExponentialWeightedAverageTimeToFirstByteEstimator(double d, androidx.media3.common.util.Clock clock) {
        this.smoothingFactor = d;
        this.clock = clock;
        this.initializedDataSpecs = new androidx.media3.exoplayer.upstream.experimental.ExponentialWeightedAverageTimeToFirstByteEstimator.FixedSizeLinkedHashMap(10);
        this.estimateUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(androidx.media3.datasource.DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(androidx.media3.datasource.DataSpec dataSpec) {
        java.lang.Long remove = this.initializedDataSpecs.remove(dataSpec);
        if (remove == null) {
            return;
        }
        long msToUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime()) - remove.longValue();
        long j = this.estimateUs;
        if (j == -9223372036854775807L) {
            this.estimateUs = msToUs;
        } else {
            double d = this.smoothingFactor;
            this.estimateUs = (long) ((j * d) + ((1.0d - d) * msToUs));
        }
    }

    private static class FixedSizeLinkedHashMap<K, V> extends java.util.LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }
}
