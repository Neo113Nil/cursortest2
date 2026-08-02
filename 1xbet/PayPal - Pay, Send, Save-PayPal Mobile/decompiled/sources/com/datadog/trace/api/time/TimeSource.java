package com.datadog.trace.api.time;

/* loaded from: classes3.dex */
public interface TimeSource {
    long getCurrentTimeMicros();

    long getCurrentTimeMillis();

    long getCurrentTimeNanos();

    long getNanoTicks();
}
