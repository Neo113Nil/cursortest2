package com.datadog.trace.api.metrics;

/* loaded from: classes3.dex */
public interface CoreCounter {
    java.lang.String getName();

    long getValue();

    long getValueAndReset();
}
