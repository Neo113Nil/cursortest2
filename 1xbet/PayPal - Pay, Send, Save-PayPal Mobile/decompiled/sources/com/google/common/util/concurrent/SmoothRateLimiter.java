package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class SmoothRateLimiter extends com.google.common.util.concurrent.RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    abstract double coolDownIntervalMicros();

    abstract void doSetRate(double d, double d2);

    abstract long storedPermitsToWaitTime(double d, double d2);

    static final class SmoothWarmingUp extends com.google.common.util.concurrent.SmoothRateLimiter {
        private final double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        SmoothWarmingUp(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch, long j, java.util.concurrent.TimeUnit timeUnit, double d) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j);
            this.coldFactor = d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final void doSetRate(double d, double d2) {
            double d3;
            double d4 = this.maxPermits;
            double d5 = this.coldFactor * d2;
            double d6 = this.warmupPeriodMicros;
            double d7 = (0.5d * d6) / d2;
            this.thresholdPermits = d7;
            this.maxPermits = d7 + ((d6 * 2.0d) / (d2 + d5));
            this.slope = (d5 - d2) / (this.maxPermits - this.thresholdPermits);
            if (d4 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d4 == 0.0d) {
                d3 = this.maxPermits;
            } else {
                d3 = (this.storedPermits * this.maxPermits) / d4;
            }
            this.storedPermits = d3;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final long storedPermitsToWaitTime(double d, double d2) {
            long j;
            double d3 = d - this.thresholdPermits;
            if (d3 > 0.0d) {
                double min = java.lang.Math.min(d3, d2);
                j = (long) (((permitsToTime(d3) + permitsToTime(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            return j + ((long) (this.stableIntervalMicros * d2));
        }

        private double permitsToTime(double d) {
            return this.stableIntervalMicros + (d * this.slope);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }
    }

    static final class SmoothBursty extends com.google.common.util.concurrent.SmoothRateLimiter {
        final double maxBurstSeconds;

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final long storedPermitsToWaitTime(double d, double d2) {
            return 0L;
        }

        SmoothBursty(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch, double d) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final void doSetRate(double d, double d2) {
            double d3 = this.maxPermits;
            this.maxPermits = this.maxBurstSeconds * d;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.storedPermits = this.maxPermits;
            } else {
                this.storedPermits = d3 != 0.0d ? (this.storedPermits * this.maxPermits) / d3 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        final double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }
    }

    private SmoothRateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final void doSetRate(double d, long j) {
        resync(j);
        double micros = java.util.concurrent.TimeUnit.SECONDS.toMicros(1L) / d;
        this.stableIntervalMicros = micros;
        doSetRate(d, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final double doGetRate() {
        return java.util.concurrent.TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long queryEarliestAvailable(long j) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long reserveEarliestAvailable(int i, long j) {
        resync(j);
        long j2 = this.nextFreeTicketMicros;
        double d = i;
        double min = java.lang.Math.min(d, this.storedPermits);
        this.nextFreeTicketMicros = com.google.common.math.LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, min) + ((long) ((d - min) * this.stableIntervalMicros)));
        this.storedPermits -= min;
        return j2;
    }

    void resync(long j) {
        if (j > this.nextFreeTicketMicros) {
            this.storedPermits = java.lang.Math.min(this.maxPermits, this.storedPermits + ((j - r0) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j;
        }
    }
}
