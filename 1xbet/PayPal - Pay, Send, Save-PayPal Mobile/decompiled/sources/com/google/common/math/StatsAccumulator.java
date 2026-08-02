package com.google.common.math;

/* loaded from: classes9.dex */
public final class StatsAccumulator {
    private long count = 0;
    private double mean = 0.0d;
    private double sumOfSquaresOfDeltas = 0.0d;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public final void add(double d) {
        long j = this.count;
        if (j == 0) {
            this.count = 1L;
            this.mean = d;
            this.min = d;
            this.max = d;
            if (java.lang.Double.isFinite(d)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j + 1;
        if (java.lang.Double.isFinite(d) && java.lang.Double.isFinite(this.mean)) {
            double d2 = this.mean;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.count);
            this.mean = d4;
            this.sumOfSquaresOfDeltas += d3 * (d - d4);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = java.lang.Math.min(this.min, d);
        this.max = java.lang.Math.max(this.max, d);
    }

    public final void addAll(java.lang.Iterable<? extends java.lang.Number> iterable) {
        java.util.Iterator<? extends java.lang.Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public final void addAll(java.util.Iterator<? extends java.lang.Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public final void addAll(double... dArr) {
        for (double d : dArr) {
            add(d);
        }
    }

    public final void addAll(int... iArr) {
        for (int i : iArr) {
            add(i);
        }
    }

    public final void addAll(long... jArr) {
        for (long j : jArr) {
            add(j);
        }
    }

    public final void addAll(java.util.stream.DoubleStream doubleStream) {
        addAll((com.google.common.math.StatsAccumulator) doubleStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda4(), new com.google.common.math.Stats$$ExternalSyntheticLambda2()));
    }

    public final void addAll(java.util.stream.IntStream intStream) {
        addAll((com.google.common.math.StatsAccumulator) intStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda3(), new com.google.common.math.Stats$$ExternalSyntheticLambda2()));
    }

    public final void addAll(java.util.stream.LongStream longStream) {
        addAll((com.google.common.math.StatsAccumulator) longStream.collect(new com.google.common.math.Stats$$ExternalSyntheticLambda0(), new com.google.common.math.Stats$$ExternalSyntheticLambda1(), new com.google.common.math.Stats$$ExternalSyntheticLambda2()));
    }

    public final void addAll(com.google.common.math.Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public final void addAll(com.google.common.math.StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }

    private void merge(long j, double d, double d2, double d3, double d4) {
        long j2 = this.count;
        if (j2 == 0) {
            this.count = j;
            this.mean = d;
            this.sumOfSquaresOfDeltas = d2;
            this.min = d3;
            this.max = d4;
            return;
        }
        this.count = j2 + j;
        if (java.lang.Double.isFinite(this.mean) && java.lang.Double.isFinite(d)) {
            double d5 = this.mean;
            double d6 = d - d5;
            double d7 = j;
            double d8 = d5 + ((d6 * d7) / this.count);
            this.mean = d8;
            this.sumOfSquaresOfDeltas += d2 + (d6 * (d - d8) * d7);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = java.lang.Math.min(this.min, d3);
        this.max = java.lang.Math.max(this.max, d4);
    }

    public final com.google.common.math.Stats snapshot() {
        return new com.google.common.math.Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
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
        com.google.common.base.Preconditions.checkState(this.count != 0);
        if (java.lang.Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return com.google.common.math.DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
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

    final double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    static double calculateNewMeanNonFinite(double d, double d2) {
        if (java.lang.Double.isFinite(d)) {
            return d2;
        }
        if (java.lang.Double.isFinite(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }
}
