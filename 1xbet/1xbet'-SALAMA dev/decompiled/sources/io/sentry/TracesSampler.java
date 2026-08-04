package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class TracesSampler {
    private final SentryOptions options;

    public TracesSampler(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options are required");
    }

    public TracesSamplingDecision sample(SamplingContext samplingContext) {
        Double dSample;
        Double dSample2;
        Double sampleRand = samplingContext.getSampleRand();
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(samplingDecision);
        }
        if (this.options.getProfilesSampler() != null) {
            try {
                dSample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
                dSample = null;
            }
        } else {
            dSample = null;
        }
        if (dSample == null) {
            dSample = this.options.getProfilesSampleRate();
        }
        Double d7 = dSample;
        Boolean boolValueOf = Boolean.valueOf(d7 != null && sample(d7, sampleRand));
        if (this.options.getTracesSampler() != null) {
            try {
                dSample2 = this.options.getTracesSampler().sample(samplingContext);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                dSample2 = null;
            }
            if (dSample2 != null) {
                return new TracesSamplingDecision(Boolean.valueOf(sample(dSample2, sampleRand)), dSample2, sampleRand, boolValueOf, d7);
            }
        }
        TracesSamplingDecision parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(parentSamplingDecision);
        }
        Double tracesSampleRate = this.options.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor()));
        if (dValueOf != null) {
            return new TracesSamplingDecision(Boolean.valueOf(sample(dValueOf, sampleRand)), dValueOf, sampleRand, boolValueOf, d7);
        }
        Boolean bool = Boolean.FALSE;
        return new TracesSamplingDecision(bool, null, sampleRand, bool, null);
    }

    public boolean sampleSessionProfile(double d7) {
        Double profileSessionSampleRate = this.options.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && sample(profileSessionSampleRate, Double.valueOf(d7));
    }

    private boolean sample(Double d7, Double d8) {
        return d7.doubleValue() >= d8.doubleValue();
    }
}
