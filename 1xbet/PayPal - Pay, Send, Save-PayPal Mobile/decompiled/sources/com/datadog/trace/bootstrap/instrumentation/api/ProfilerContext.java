package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface ProfilerContext {
    int getEncodedOperationName();

    int getEncodedResourceName();

    java.lang.CharSequence getOperationName();

    java.lang.CharSequence getResourceName();

    long getRootSpanId();

    long getSpanId();
}
