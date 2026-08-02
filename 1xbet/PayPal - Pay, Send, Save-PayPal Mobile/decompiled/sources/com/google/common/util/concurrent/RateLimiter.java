package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public abstract class RateLimiter {
    private volatile java.lang.Object mutexDoNotUseDirectly;
    private final com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch;

    abstract double doGetRate();

    abstract void doSetRate(double d, long j);

    abstract long queryEarliestAvailable(long j);

    abstract long reserveEarliestAvailable(int i, long j);

    public static com.google.common.util.concurrent.RateLimiter create(double d) {
        return create(d, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer());
    }

    static com.google.common.util.concurrent.RateLimiter create(double d, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch) {
        com.google.common.util.concurrent.SmoothRateLimiter.SmoothBursty smoothBursty = new com.google.common.util.concurrent.SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d);
        return smoothBursty;
    }

    public static com.google.common.util.concurrent.RateLimiter create(double d, java.time.Duration duration) {
        return create(d, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static com.google.common.util.concurrent.RateLimiter create(double d, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "warmupPeriod must not be negative: %s", j);
        return create(d, j, timeUnit, 3.0d, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer());
    }

    static com.google.common.util.concurrent.RateLimiter create(double d, long j, java.util.concurrent.TimeUnit timeUnit, double d2, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch) {
        com.google.common.util.concurrent.SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new com.google.common.util.concurrent.SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j, timeUnit, d2);
        smoothWarmingUp.setRate(d);
        return smoothWarmingUp;
    }

    private java.lang.Object mutex() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.mutexDoNotUseDirectly;
            if (obj == null) {
                obj = new java.lang.Object();
                this.mutexDoNotUseDirectly = obj;
            }
        }
        return obj;
    }

    RateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (com.google.common.util.concurrent.RateLimiter.SleepingStopwatch) com.google.common.base.Preconditions.checkNotNull(sleepingStopwatch);
    }

    public final void setRate(double d) {
        com.google.common.base.Preconditions.checkArgument(d > 0.0d, "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d, this.stopwatch.readMicros());
        }
    }

    public final double getRate() {
        double doGetRate;
        synchronized (mutex()) {
            doGetRate = doGetRate();
        }
        return doGetRate;
    }

    public double acquire() {
        return acquire(1);
    }

    public double acquire(int i) {
        long reserve = reserve(i);
        this.stopwatch.sleepMicrosUninterruptibly(reserve);
        return (reserve * 1.0d) / java.util.concurrent.TimeUnit.SECONDS.toMicros(1L);
    }

    final long reserve(int i) {
        long reserveAndGetWaitLength;
        checkPermits(i);
        synchronized (mutex()) {
            reserveAndGetWaitLength = reserveAndGetWaitLength(i, this.stopwatch.readMicros());
        }
        return reserveAndGetWaitLength;
    }

    public boolean tryAcquire(java.time.Duration duration) {
        return tryAcquire(1, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public boolean tryAcquire(long j, java.util.concurrent.TimeUnit timeUnit) {
        return tryAcquire(1, j, timeUnit);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, java.time.Duration duration) {
        return tryAcquire(i, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public boolean tryAcquire(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        long max = java.lang.Math.max(timeUnit.toMicros(j), 0L);
        checkPermits(i);
        synchronized (mutex()) {
            long readMicros = this.stopwatch.readMicros();
            if (!canAcquire(readMicros, max)) {
                return false;
            }
            this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i, readMicros));
            return true;
        }
    }

    private boolean canAcquire(long j, long j2) {
        return queryEarliestAvailable(j) - j2 <= j;
    }

    final long reserveAndGetWaitLength(int i, long j) {
        return java.lang.Math.max(reserveEarliestAvailable(i, j) - j, 0L);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", java.lang.Double.valueOf(getRate()));
    }

    static abstract class SleepingStopwatch {
        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long j);

        protected SleepingStopwatch() {
        }

        public static com.google.common.util.concurrent.RateLimiter.SleepingStopwatch createFromSystemTimer() {
            return new com.google.common.util.concurrent.RateLimiter.SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final com.google.common.base.Stopwatch stopwatch = com.google.common.base.Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected long readMicros() {
                    return this.stopwatch.elapsed(java.util.concurrent.TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected void sleepMicrosUninterruptibly(long j) {
                    if (j > 0) {
                        com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly(j, java.util.concurrent.TimeUnit.MICROSECONDS);
                    }
                }
            };
        }
    }

    private static void checkPermits(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "Requested permits (%s) must be positive", i);
    }
}
