package com.google.common.math;

/* loaded from: classes9.dex */
public final class Stats implements java.io.Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static com.google.common.math.Stats of(java.lang.Iterable<? extends java.lang.Number> iterable) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(java.util.Iterator<? extends java.lang.Number> it) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(it);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(double... dArr) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(dArr);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(int... iArr) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(iArr);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(long... jArr) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(java.util.stream.DoubleStream doubleStream) {
        return ((com.google.common.math.StatsAccumulator) doubleStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda4(), new com.google.common.math.Stats$$ExternalSyntheticLambda2())).snapshot();
    }

    public static com.google.common.math.Stats of(java.util.stream.IntStream intStream) {
        return ((com.google.common.math.StatsAccumulator) intStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda3(), new com.google.common.math.Stats$$ExternalSyntheticLambda2())).snapshot();
    }

    public static com.google.common.math.Stats of(java.util.stream.LongStream longStream) {
        return ((com.google.common.math.StatsAccumulator) longStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda1(), new com.google.common.math.Stats$$ExternalSyntheticLambda2())).snapshot();
    }

    public static java.util.stream.Collector<java.lang.Number, com.google.common.math.StatsAccumulator, com.google.common.math.Stats> toStats() {
        return java.util.stream.Collector.of(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new java.util.function.BiConsumer() { // from class: com.google.common.math.Stats$$ExternalSyntheticLambda5
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.math.StatsAccumulator) obj).add(((java.lang.Number) obj2).doubleValue());
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.math.Stats$$ExternalSyntheticLambda6
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.math.Stats.lambda$toStats$1((com.google.common.math.StatsAccumulator) obj, (com.google.common.math.StatsAccumulator) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.math.Stats$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.math.StatsAccumulator) obj).snapshot();
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED);
    }

    static /* synthetic */ com.google.common.math.StatsAccumulator lambda$toStats$1(com.google.common.math.StatsAccumulator statsAccumulator, com.google.common.math.StatsAccumulator statsAccumulator2) {
        statsAccumulator.addAll(statsAccumulator2);
        return statsAccumulator;
    }

    public final long count() {
        return this.count;
    }

    public final double mean() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public final double sum() {
        return this.mean * this.count;
    }

    public final double populationVariance() {
        com.google.common.base.Preconditions.checkState(this.count > 0);
        if (java.lang.Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return com.google.common.math.DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / count();
    }

    public final double populationStandardDeviation() {
        return java.lang.Math.sqrt(populationVariance());
    }

    public final double sampleVariance() {
        com.google.common.base.Preconditions.checkState(this.count > 1);
        if (java.lang.Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return com.google.common.math.DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public final double sampleStandardDeviation() {
        return java.lang.Math.sqrt(sampleVariance());
    }

    public final double min() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double max() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.common.math.Stats stats = (com.google.common.math.Stats) obj;
        return this.count == stats.count && java.lang.Double.doubleToLongBits(this.mean) == java.lang.Double.doubleToLongBits(stats.mean) && java.lang.Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == java.lang.Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && java.lang.Double.doubleToLongBits(this.min) == java.lang.Double.doubleToLongBits(stats.min) && java.lang.Double.doubleToLongBits(this.max) == java.lang.Double.doubleToLongBits(stats.max);
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.count), java.lang.Double.valueOf(this.mean), java.lang.Double.valueOf(this.sumOfSquaresOfDeltas), java.lang.Double.valueOf(this.min), java.lang.Double.valueOf(this.max));
    }

    public final java.lang.String toString() {
        if (count() > 0) {
            return com.google.common.base.MoreObjects.toStringHelper(this).add(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, this.count).add("mean", this.mean).add("populationStandardDeviation", populationStandardDeviation()).add(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, this.min).add(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, this.max).toString();
        }
        return com.google.common.base.MoreObjects.toStringHelper(this).add(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, this.count).toString();
    }

    final double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public static double meanOf(java.lang.Iterable<? extends java.lang.Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static double meanOf(java.util.Iterator<? extends java.lang.Number> it) {
        com.google.common.base.Preconditions.checkArgument(it.hasNext());
        double doubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            j++;
            doubleValue = (java.lang.Double.isFinite(doubleValue2) && java.lang.Double.isFinite(doubleValue)) ? doubleValue + ((doubleValue2 - doubleValue) / j) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    public static double meanOf(double... dArr) {
        com.google.common.base.Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            d = (java.lang.Double.isFinite(d2) && java.lang.Double.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public static double meanOf(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0);
        double d = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = iArr[i];
            d = (java.lang.Double.isFinite(d2) && java.lang.Double.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public static double meanOf(long... jArr) {
        com.google.common.base.Preconditions.checkArgument(jArr.length > 0);
        double d = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = jArr[i];
            d = (java.lang.Double.isFinite(d2) && java.lang.Double.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public final byte[] toByteArray() {
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(40).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    final void writeTo(java.nio.ByteBuffer byteBuffer) {
        com.google.common.base.Preconditions.checkNotNull(byteBuffer);
        com.google.common.base.Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static com.google.common.math.Stats fromByteArray(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkArgument(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN));
    }

    static com.google.common.math.Stats readFrom(java.nio.ByteBuffer byteBuffer) {
        com.google.common.base.Preconditions.checkNotNull(byteBuffer);
        com.google.common.base.Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new com.google.common.math.Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }
}
