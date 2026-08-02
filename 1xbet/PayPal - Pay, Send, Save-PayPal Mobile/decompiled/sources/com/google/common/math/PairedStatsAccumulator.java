package com.google.common.math;

/* loaded from: classes9.dex */
public final class PairedStatsAccumulator {
    private final com.google.common.math.StatsAccumulator xStats = new com.google.common.math.StatsAccumulator();
    private final com.google.common.math.StatsAccumulator yStats = new com.google.common.math.StatsAccumulator();
    private double sumOfProductsOfDeltas = 0.0d;

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public final void add(double d, double d2) {
        this.xStats.add(d);
        if (!java.lang.Double.isFinite(d) || !java.lang.Double.isFinite(d2)) {
            this.sumOfProductsOfDeltas = Double.NaN;
        } else if (this.xStats.count() > 1) {
            this.sumOfProductsOfDeltas += (d - this.xStats.mean()) * (d2 - this.yStats.mean());
        }
        this.yStats.add(d2);
    }

    public final void addAll(com.google.common.math.PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.xStats.addAll(pairedStats.xStats());
        if (this.yStats.count() == 0) {
            this.sumOfProductsOfDeltas = pairedStats.sumOfProductsOfDeltas();
        } else {
            this.sumOfProductsOfDeltas += pairedStats.sumOfProductsOfDeltas() + ((pairedStats.xStats().mean() - this.xStats.mean()) * (pairedStats.yStats().mean() - this.yStats.mean()) * pairedStats.count());
        }
        this.yStats.addAll(pairedStats.yStats());
    }

    public final com.google.common.math.PairedStats snapshot() {
        return new com.google.common.math.PairedStats(this.xStats.snapshot(), this.yStats.snapshot(), this.sumOfProductsOfDeltas);
    }

    public final long count() {
        return this.xStats.count();
    }

    public final com.google.common.math.Stats xStats() {
        return this.xStats.snapshot();
    }

    public final com.google.common.math.Stats yStats() {
        return this.yStats.snapshot();
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
        double sumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        double sumOfSquaresOfDeltas2 = this.yStats.sumOfSquaresOfDeltas();
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

    private static double ensureInUnitRange(double d) {
        return com.google.common.primitives.Doubles.constrainToRange(d, -1.0d, 1.0d);
    }
}
