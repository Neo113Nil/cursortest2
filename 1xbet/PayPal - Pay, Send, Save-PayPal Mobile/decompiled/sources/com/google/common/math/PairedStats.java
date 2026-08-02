package com.google.common.math;

/* loaded from: classes9.dex */
public final class PairedStats implements java.io.Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final com.google.common.math.Stats xStats;
    private final com.google.common.math.Stats yStats;

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    PairedStats(com.google.common.math.Stats stats, com.google.common.math.Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    public final long count() {
        return this.xStats.count();
    }

    public final com.google.common.math.Stats xStats() {
        return this.xStats;
    }

    public final com.google.common.math.Stats yStats() {
        return this.yStats;
    }

    public final double populationCovariance() {
        com.google.common.base.Preconditions.checkState(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public final double sampleCovariance() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public final double pearsonsCorrelationCoefficient() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        if (java.lang.Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double sumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double sumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        com.google.common.base.Preconditions.checkState(sumOfSquaresOfDeltas > 0.0d);
        com.google.common.base.Preconditions.checkState(sumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / java.lang.Math.sqrt(ensurePositive(sumOfSquaresOfDeltas * sumOfSquaresOfDeltas2)));
    }

    public final com.google.common.math.LinearTransformation leastSquaresFit() {
        com.google.common.base.Preconditions.checkState(count() > 1);
        if (java.lang.Double.isNaN(this.sumOfProductsOfDeltas)) {
            return com.google.common.math.LinearTransformation.forNaN();
        }
        double sumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (sumOfSquaresOfDeltas <= 0.0d) {
            com.google.common.base.Preconditions.checkState(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
            return com.google.common.math.LinearTransformation.vertical(this.xStats.mean());
        }
        if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
            return com.google.common.math.LinearTransformation.mapping(this.xStats.mean(), this.yStats.mean()).withSlope(this.sumOfProductsOfDeltas / sumOfSquaresOfDeltas);
        }
        return com.google.common.math.LinearTransformation.horizontal(this.yStats.mean());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.common.math.PairedStats pairedStats = (com.google.common.math.PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && java.lang.Double.doubleToLongBits(this.sumOfProductsOfDeltas) == java.lang.Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.xStats, this.yStats, java.lang.Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public final java.lang.String toString() {
        if (count() > 0) {
            return com.google.common.base.MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).add("populationCovariance", populationCovariance()).toString();
        }
        return com.google.common.base.MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).toString();
    }

    final double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public final byte[] toByteArray() {
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(88).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(order);
        this.yStats.writeTo(order);
        order.putDouble(this.sumOfProductsOfDeltas);
        return order.array();
    }

    public static com.google.common.math.PairedStats fromByteArray(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkArgument(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.google.common.math.PairedStats(com.google.common.math.Stats.readFrom(order), com.google.common.math.Stats.readFrom(order), order.getDouble());
    }
}
