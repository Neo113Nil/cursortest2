package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0017R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00198'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/profiling/internal/Profiler;", "", "", "sdkInstanceName", "", "isRunning", "(Ljava/lang/String;)Z", "Lcom/datadog/android/profiling/internal/ProfilerCallback;", com.sun.jna.Callback.METHOD_NAME, "", "registerProfilingCallback", "(Ljava/lang/String;Lcom/datadog/android/profiling/internal/ProfilerCallback;)V", "Landroid/content/Context;", "appContext", "Lcom/datadog/android/profiling/internal/ProfilingStartReason;", "startReason", "", "additionalAttributes", "", "sdkInstanceNames", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Landroid/content/Context;Lcom/datadog/android/profiling/internal/ProfilingStartReason;Ljava/util/Map;Ljava/util/Set;)V", "stop", "(Ljava/lang/String;)V", "unregisterProfilingCallback", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "setInternalLogger", "(Lcom/datadog/android/api/InternalLogger;)V", "internalLogger"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Profiler {
    com.datadog.android.api.InternalLogger getInternalLogger();

    boolean isRunning(java.lang.String sdkInstanceName);

    void registerProfilingCallback(java.lang.String sdkInstanceName, com.datadog.android.profiling.internal.ProfilerCallback callback);

    void setInternalLogger(com.datadog.android.api.InternalLogger internalLogger);

    void start(android.content.Context appContext, com.datadog.android.profiling.internal.ProfilingStartReason startReason, java.util.Map<java.lang.String, java.lang.String> additionalAttributes, java.util.Set<java.lang.String> sdkInstanceNames);

    void stop(java.lang.String sdkInstanceName);

    void unregisterProfilingCallback(java.lang.String sdkInstanceName);
}
