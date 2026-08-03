package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Stats implements java.io.Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    Stats(long count, double mean, double sumOfSquaresOfDeltas, double min, double max) {
        this.count = count;
        this.mean = mean;
        this.sumOfSquaresOfDeltas = sumOfSquaresOfDeltas;
        this.min = min;
        this.max = max;
    }

    public static com.google.common.math.Stats of(java.lang.Iterable<? extends java.lang.Number> values) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(java.util.Iterator<? extends java.lang.Number> values) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(double... values) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(int... values) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public static com.google.common.math.Stats of(long... values) {
        com.google.common.math.StatsAccumulator statsAccumulator = new com.google.common.math.StatsAccumulator();
        statsAccumulator.addAll(values);
        return statsAccumulator.snapshot();
    }

    public long count() {
        return this.count;
    }

    public double mean() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double sum() {
        return this.mean * this.count;
    }

    public double populationVariance() {
        com.google.common.base.Preconditions.checkState(this.count > 0);
        if (java.lang.Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return com.google.common.math.DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / count();
    }

    public double populationStandardDeviation() {
        return java.lang.Math.sqrt(populationVariance());
    }

    public double sampleVariance() {
        com.google.common.base.Preconditions.checkState(this.count > 1);
        if (java.lang.Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return com.google.common.math.DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sampleStandardDeviation() {
        return java.lang.Math.sqrt(sampleVariance());
    }

    public double min() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public double max() {
        com.google.common.base.Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.common.math.Stats stats = (com.google.common.math.Stats) obj;
        return this.count == stats.count && java.lang.Double.doubleToLongBits(this.mean) == java.lang.Double.doubleToLongBits(stats.mean) && java.lang.Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == java.lang.Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && java.lang.Double.doubleToLongBits(this.min) == java.lang.Double.doubleToLongBits(stats.min) && java.lang.Double.doubleToLongBits(this.max) == java.lang.Double.doubleToLongBits(stats.max);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.count), java.lang.Double.valueOf(this.mean), java.lang.Double.valueOf(this.sumOfSquaresOfDeltas), java.lang.Double.valueOf(this.min), java.lang.Double.valueOf(this.max));
    }

    public java.lang.String toString() {
        if (count() > 0) {
            return com.google.common.base.MoreObjects.toStringHelper(this).add(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, this.count).add("mean", this.mean).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.min).add(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, this.max).toString();
        }
        return com.google.common.base.MoreObjects.toStringHelper(this).add(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, this.count).toString();
    }

    double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public static double meanOf(java.lang.Iterable<? extends java.lang.Number> values) {
        return meanOf(values.iterator());
    }

    public static double meanOf(java.util.Iterator<? extends java.lang.Number> values) {
        com.google.common.base.Preconditions.checkArgument(values.hasNext());
        double doubleValue = values.next().doubleValue();
        long j = 1;
        while (values.hasNext()) {
            double doubleValue2 = values.next().doubleValue();
            j++;
            doubleValue = (com.google.common.primitives.Doubles.isFinite(doubleValue2) && com.google.common.primitives.Doubles.isFinite(doubleValue)) ? doubleValue + ((doubleValue2 - doubleValue) / j) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    public static double meanOf(double... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0);
        double d = values[0];
        for (int i = 1; i < values.length; i++) {
            double d2 = values[i];
            d = (com.google.common.primitives.Doubles.isFinite(d2) && com.google.common.primitives.Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public static double meanOf(int... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0);
        double d = values[0];
        for (int i = 1; i < values.length; i++) {
            double d2 = values[i];
            d = (com.google.common.primitives.Doubles.isFinite(d2) && com.google.common.primitives.Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public static double meanOf(long... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0);
        double d = values[0];
        for (int i = 1; i < values.length; i++) {
            double d2 = values[i];
            d = (com.google.common.primitives.Doubles.isFinite(d2) && com.google.common.primitives.Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(d, d2);
        }
        return d;
    }

    public byte[] toByteArray() {
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(40).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    void writeTo(java.nio.ByteBuffer buffer) {
        com.google.common.base.Preconditions.checkNotNull(buffer);
        com.google.common.base.Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        buffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static com.google.common.math.Stats fromByteArray(byte[] byteArray) {
        com.google.common.base.Preconditions.checkNotNull(byteArray);
        com.google.common.base.Preconditions.checkArgument(byteArray.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, byteArray.length);
        return readFrom(java.nio.ByteBuffer.wrap(byteArray).order(java.nio.ByteOrder.LITTLE_ENDIAN));
    }

    static com.google.common.math.Stats readFrom(java.nio.ByteBuffer buffer) {
        com.google.common.base.Preconditions.checkNotNull(buffer);
        com.google.common.base.Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        return new com.google.common.math.Stats(buffer.getLong(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble());
    }
}
