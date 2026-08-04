package io.sentry.util;

import io.sentry.TracesSamplingDecision;

/* JADX INFO: loaded from: classes2.dex */
public final class SampleRateUtils {
    public static Double backfilledSampleRand(Double d7, Double d8, Boolean bool) {
        if (d7 != null) {
            return d7;
        }
        double dNextDouble = SentryRandom.current().nextDouble();
        if (d8 == null || bool == null) {
            return Double.valueOf(dNextDouble);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d8.doubleValue() * dNextDouble);
        }
        return Double.valueOf(((1.0d - d8.doubleValue()) * dNextDouble) + d8.doubleValue());
    }

    public static boolean isValidContinuousProfilesSampleRate(Double d7) {
        return isValidRate(d7, true);
    }

    public static boolean isValidProfilesSampleRate(Double d7) {
        return isValidRate(d7, true);
    }

    private static boolean isValidRate(Double d7, boolean z4) {
        if (d7 == null) {
            return z4;
        }
        return !d7.isNaN() && d7.doubleValue() >= 0.0d && d7.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(Double d7) {
        return isValidRate(d7, true);
    }

    public static boolean isValidTracesSampleRate(Double d7) {
        return isValidTracesSampleRate(d7, true);
    }

    public static boolean isValidTracesSampleRate(Double d7, boolean z4) {
        return isValidRate(d7, z4);
    }

    public static TracesSamplingDecision backfilledSampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision.getSampleRand() != null) {
            return tracesSamplingDecision;
        }
        return new TracesSamplingDecision(tracesSamplingDecision.getSampled(), tracesSamplingDecision.getSampleRate(), backfilledSampleRand(null, tracesSamplingDecision.getSampleRate(), tracesSamplingDecision.getSampled()), tracesSamplingDecision.getProfileSampled(), tracesSamplingDecision.getProfileSampleRate());
    }
}
