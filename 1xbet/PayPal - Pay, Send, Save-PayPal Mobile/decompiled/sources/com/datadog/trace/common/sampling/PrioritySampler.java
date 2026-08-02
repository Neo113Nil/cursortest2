package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public interface PrioritySampler {
    <T extends com.datadog.trace.core.CoreSpan<T>> void setSamplingPriority(T t);
}
