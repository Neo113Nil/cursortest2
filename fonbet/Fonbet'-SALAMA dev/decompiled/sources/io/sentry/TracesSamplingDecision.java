package io.sentry;

/* loaded from: classes2.dex */
public final class TracesSamplingDecision {
    private final Double profileSampleRate;
    private final Boolean profileSampled;
    private final Double sampleRand;
    private final Double sampleRate;
    private final Boolean sampled;

    public TracesSamplingDecision(Boolean bool) {
        this(bool, null);
    }

    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public Boolean getProfileSampled() {
        return this.profileSampled;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public Boolean getSampled() {
        return this.sampled;
    }

    public TracesSamplingDecision(Boolean bool, Double d7) {
        this(bool, d7, null, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d7, Double d8) {
        this(bool, d7, d8, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d7, Boolean bool2, Double d8) {
        this(bool, d7, null, bool2, d8);
    }

    public TracesSamplingDecision(Boolean bool, Double d7, Double d8, Boolean bool2, Double d9) {
        this.sampled = bool;
        this.sampleRate = d7;
        this.sampleRand = d8;
        this.profileSampled = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d9;
    }
}
