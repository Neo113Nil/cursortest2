package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public abstract class DeterministicSampler implements com.datadog.trace.common.sampling.RateSampler {
    private static final double getHighSpeedVideoFpsRangesFor = java.lang.Math.pow(2.0d, 64.0d) - 1.0d;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    protected abstract <T extends com.datadog.trace.core.CoreSpan<T>> long getSamplingId(T t);

    public static final class TraceSampler extends com.datadog.trace.common.sampling.DeterministicSampler {
        public TraceSampler(double d) {
            super(d);
        }

        @Override // com.datadog.trace.common.sampling.DeterministicSampler
        protected final <T extends com.datadog.trace.core.CoreSpan<T>> long getSamplingId(T t) {
            return t.getTraceId().toLong();
        }
    }

    /* loaded from: classes8.dex */
    public static final class SpanSampler extends com.datadog.trace.common.sampling.DeterministicSampler {
        public SpanSampler(double d) {
            super(d);
        }

        @Override // com.datadog.trace.common.sampling.DeterministicSampler
        protected final <T extends com.datadog.trace.core.CoreSpan<T>> long getSamplingId(T t) {
            return t.getSpanId();
        }
    }

    public DeterministicSampler(double d) {
        this.getHighResolutionOutputSizeshNQ4ISI = (float) d;
    }

    @Override // com.datadog.trace.common.sampling.Sampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return (getSamplingId(t) * com.datadog.android.core.sampling.DeterministicSampler.SAMPLER_HASHER) - Long.MIN_VALUE < cutoff((double) this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.datadog.trace.common.sampling.RateSampler
    public double getSampleRate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static long cutoff(double d) {
        if (d < 0.5d) {
            return ((long) (d * getHighSpeedVideoFpsRangesFor)) - Long.MIN_VALUE;
        }
        if (d < 1.0d) {
            return (long) ((d * getHighSpeedVideoFpsRangesFor) - 9.223372036854776E18d);
        }
        return Long.MAX_VALUE;
    }
}
