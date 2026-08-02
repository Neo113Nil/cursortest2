package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface PathwayContext {
    public static final java.lang.String DATADOG_KEY = "_datadog";
    public static final java.lang.String PROPAGATION_KEY = "dd-pathway-ctx";
    public static final java.lang.String PROPAGATION_KEY_BASE64 = "dd-pathway-ctx-base64";

    byte[] encode() throws java.io.IOException;

    long getHash();

    com.datadog.trace.bootstrap.instrumentation.api.StatsPoint getSavedStats();

    boolean isStarted();

    void saveStats(com.datadog.trace.bootstrap.instrumentation.api.StatsPoint statsPoint);

    void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer);

    void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer, long j);

    void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer, long j, long j2);

    java.lang.String strEncode() throws java.io.IOException;
}
