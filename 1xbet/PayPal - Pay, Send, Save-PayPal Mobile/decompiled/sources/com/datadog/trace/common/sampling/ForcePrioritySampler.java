package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class ForcePrioritySampler implements com.datadog.trace.common.sampling.Sampler, com.datadog.trace.common.sampling.PrioritySampler {
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoSizes;

    @Override // com.datadog.trace.common.sampling.Sampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return true;
    }

    public ForcePrioritySampler(int i, int i2) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    @Override // com.datadog.trace.common.sampling.PrioritySampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> void setSamplingPriority(T t) {
        t.mo10040setSamplingPriority(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }
}
