package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;

/* loaded from: classes2.dex */
public final class TracesSampler {
    private final SentryOptions options;

    public TracesSampler(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options are required");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TracesSamplingDecision sample(SamplingContext samplingContext) {
        Double sample;
        Double d7;
        TracesSamplingDecision parentSamplingDecision;
        Double sampleRand = samplingContext.getSampleRand();
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(samplingDecision);
        }
        if (this.options.getProfilesSampler() != null) {
            try {
                sample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
            }
            if (sample == null) {
                sample = this.options.getProfilesSampleRate();
            }
            Double d8 = sample;
            Boolean valueOf = Boolean.valueOf(d8 == null && sample(d8, sampleRand));
            if (this.options.getTracesSampler() != null) {
                try {
                    d7 = this.options.getTracesSampler().sample(samplingContext);
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                    d7 = null;
                }
                if (d7 != null) {
                    return new TracesSamplingDecision(Boolean.valueOf(sample(d7, sampleRand)), d7, sampleRand, valueOf, d8);
                }
            }
            parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
            if (parentSamplingDecision == null) {
                return SampleRateUtils.backfilledSampleRand(parentSamplingDecision);
            }
            Double tracesSampleRate = this.options.getTracesSampleRate();
            Double valueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor()));
            if (valueOf2 != null) {
                return new TracesSamplingDecision(Boolean.valueOf(sample(valueOf2, sampleRand)), valueOf2, sampleRand, valueOf, d8);
            }
            Boolean bool = Boolean.FALSE;
            return new TracesSamplingDecision(bool, null, sampleRand, bool, null);
        }
        sample = null;
        if (sample == null) {
        }
        Double d82 = sample;
        Boolean valueOf3 = Boolean.valueOf(d82 == null && sample(d82, sampleRand));
        if (this.options.getTracesSampler() != null) {
        }
        parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision == null) {
        }
    }

    public boolean sampleSessionProfile(double d7) {
        Double profileSessionSampleRate = this.options.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && sample(profileSessionSampleRate, Double.valueOf(d7));
    }

    private boolean sample(Double d7, Double d8) {
        return d7.doubleValue() >= d8.doubleValue();
    }
}
