package com.datadog.trace.api;

/* loaded from: classes3.dex */
public abstract class IdGenerationStrategy {
    protected final boolean traceId128BitGenerationEnabled;

    @java.lang.FunctionalInterface
    interface ThrowingSupplier<T> {
        T get() throws java.lang.Throwable;
    }

    protected abstract long getNonZeroPositiveLong();

    public IdGenerationStrategy(boolean z) {
        this.traceId128BitGenerationEnabled = z;
    }

    public static com.datadog.trace.api.IdGenerationStrategy fromName(java.lang.String str) {
        return fromName(str, false);
    }

    public static com.datadog.trace.api.IdGenerationStrategy fromName(java.lang.String str, boolean z) {
        char c;
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.US);
        upperCase.hashCode();
        int hashCode = upperCase.hashCode();
        byte b = 0;
        if (hashCode == -1884956477) {
            if (upperCase.equals("RANDOM")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 321080575) {
            if (hashCode == 709657227 && upperCase.equals("SECURE_RANDOM")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (upperCase.equals("SEQUENTIAL")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return new com.datadog.trace.api.IdGenerationStrategy.Random(z, b);
        }
        if (c == 1) {
            return new com.datadog.trace.api.IdGenerationStrategy.Sequential(z, b);
        }
        if (c != 2) {
            return null;
        }
        return new com.datadog.trace.api.IdGenerationStrategy.SRandom(z);
    }

    public com.datadog.trace.api.DDTraceId generateTraceId() {
        if (this.traceId128BitGenerationEnabled) {
            return com.datadog.trace.api.DD128bTraceId.from(generateHighOrderBits(), getNonZeroPositiveLong());
        }
        return com.datadog.trace.api.DD64bTraceId.from(getNonZeroPositiveLong());
    }

    public long generateSpanId() {
        return getNonZeroPositiveLong();
    }

    protected long generateHighOrderBits() {
        return (java.lang.System.currentTimeMillis() / 1000) << 32;
    }

    static final class Random extends com.datadog.trace.api.IdGenerationStrategy {
        private Random(boolean z) {
            super(z);
        }

        @Override // com.datadog.trace.api.IdGenerationStrategy
        protected final long getNonZeroPositiveLong() {
            return java.util.concurrent.ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE) + 1;
        }

        /* synthetic */ Random(boolean z, byte b) {
            this(z);
        }
    }

    static final class Sequential extends com.datadog.trace.api.IdGenerationStrategy {
        private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;

        private Sequential(boolean z) {
            super(z);
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong(0L);
        }

        @Override // com.datadog.trace.api.IdGenerationStrategy
        public final com.datadog.trace.api.DDTraceId generateTraceId() {
            return com.datadog.trace.api.DD64bTraceId.from(getNonZeroPositiveLong());
        }

        @Override // com.datadog.trace.api.IdGenerationStrategy
        protected final long getNonZeroPositiveLong() {
            return this.getHighSpeedVideoSizes.incrementAndGet();
        }

        /* synthetic */ Sequential(boolean z, byte b) {
            this(z);
        }
    }

    static final class SRandom extends com.datadog.trace.api.IdGenerationStrategy {
        private final java.security.SecureRandom getHighSpeedVideoFpsRangesFor;

        private SRandom(boolean z, com.datadog.trace.api.IdGenerationStrategy.ThrowingSupplier<java.security.SecureRandom> throwingSupplier) {
            super(z);
            try {
                this.getHighSpeedVideoFpsRangesFor = throwingSupplier.get();
            } catch (java.lang.Throwable th) {
                throw new java.lang.ExceptionInInitializerError(th);
            }
        }

        @Override // com.datadog.trace.api.IdGenerationStrategy
        protected final long getNonZeroPositiveLong() {
            long nextLong = this.getHighSpeedVideoFpsRangesFor.nextLong();
            while (true) {
                long j = nextLong & Long.MAX_VALUE;
                if (j != 0) {
                    return j;
                }
                nextLong = this.getHighSpeedVideoFpsRangesFor.nextLong();
            }
        }

        SRandom(boolean z) {
            this(z, new com.datadog.trace.api.IdGenerationStrategy.ThrowingSupplier() { // from class: com.datadog.trace.api.IdGenerationStrategy$SRandom$$ExternalSyntheticLambda0
                @Override // com.datadog.trace.api.IdGenerationStrategy.ThrowingSupplier
                public final java.lang.Object get() {
                    java.security.SecureRandom instanceStrong;
                    instanceStrong = java.security.SecureRandom.getInstanceStrong();
                    return instanceStrong;
                }
            });
        }

        public static /* synthetic */ java.security.SecureRandom getHighSpeedVideoSizes() {
            return new java.security.SecureRandom();
        }
    }
}
