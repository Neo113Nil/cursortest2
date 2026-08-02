package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class AllSampler implements com.datadog.trace.common.sampling.Sampler {
    @Override // com.datadog.trace.common.sampling.Sampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return true;
    }

    public java.lang.String toString() {
        return "AllSampler { sample=true }";
    }
}
