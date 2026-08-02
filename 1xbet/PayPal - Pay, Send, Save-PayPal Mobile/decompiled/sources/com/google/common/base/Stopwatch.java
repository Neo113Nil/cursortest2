package com.google.common.base;

/* loaded from: classes4.dex */
public final class Stopwatch {
    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final com.google.common.base.Ticker ticker;

    public static com.google.common.base.Stopwatch createUnstarted() {
        return new com.google.common.base.Stopwatch();
    }

    public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker ticker) {
        return new com.google.common.base.Stopwatch(ticker);
    }

    public static com.google.common.base.Stopwatch createStarted() {
        return new com.google.common.base.Stopwatch().start();
    }

    public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker ticker) {
        return new com.google.common.base.Stopwatch(ticker).start();
    }

    Stopwatch() {
        this.ticker = com.google.common.base.Ticker.systemTicker();
    }

    Stopwatch(com.google.common.base.Ticker ticker) {
        this.ticker = (com.google.common.base.Ticker) com.google.common.base.Preconditions.checkNotNull(ticker, "ticker");
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final com.google.common.base.Stopwatch start() {
        com.google.common.base.Preconditions.checkState(!this.isRunning, "This stopwatch is already running.");
        this.isRunning = true;
        this.startTick = this.ticker.read();
        return this;
    }

    public final com.google.common.base.Stopwatch stop() {
        long read = this.ticker.read();
        com.google.common.base.Preconditions.checkState(this.isRunning, "This stopwatch is already stopped.");
        this.isRunning = false;
        this.elapsedNanos += read - this.startTick;
        return this;
    }

    public final com.google.common.base.Stopwatch reset() {
        this.elapsedNanos = 0L;
        this.isRunning = false;
        return this;
    }

    private long elapsedNanos() {
        return this.isRunning ? (this.ticker.read() - this.startTick) + this.elapsedNanos : this.elapsedNanos;
    }

    public final long elapsed(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(elapsedNanos(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final java.time.Duration elapsed() {
        return java.time.Duration.ofNanos(elapsedNanos());
    }

    public final java.lang.String toString() {
        long elapsedNanos = elapsedNanos();
        java.util.concurrent.TimeUnit chooseUnit = chooseUnit(elapsedNanos);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.google.common.base.Platform.formatCompact4Digits(elapsedNanos / java.util.concurrent.TimeUnit.NANOSECONDS.convert(1L, chooseUnit)));
        sb.append(" ");
        sb.append(abbreviate(chooseUnit));
        return sb.toString();
    }

    private static java.util.concurrent.TimeUnit chooseUnit(long j) {
        if (java.util.concurrent.TimeUnit.DAYS.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.DAYS;
        }
        if (java.util.concurrent.TimeUnit.HOURS.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.HOURS;
        }
        if (java.util.concurrent.TimeUnit.MINUTES.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.MINUTES;
        }
        if (java.util.concurrent.TimeUnit.SECONDS.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.SECONDS;
        }
        if (java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.MILLISECONDS;
        }
        if (java.util.concurrent.TimeUnit.MICROSECONDS.convert(j, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            return java.util.concurrent.TimeUnit.MICROSECONDS;
        }
        return java.util.concurrent.TimeUnit.NANOSECONDS;
    }

    /* renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    private static java.lang.String abbreviate(java.util.concurrent.TimeUnit timeUnit) {
        switch (com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return lib.android.paypal.com.magnessdk.g.n2;
            case 5:
                return com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY;
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new java.lang.AssertionError();
        }
    }
}
