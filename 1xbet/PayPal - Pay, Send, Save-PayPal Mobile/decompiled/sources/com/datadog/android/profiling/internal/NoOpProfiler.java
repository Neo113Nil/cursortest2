package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/profiling/internal/NoOpProfiler;", "Lcom/datadog/android/profiling/internal/Profiler;", "<init>", "()V", "", "sdkInstanceName", "", "isRunning", "(Ljava/lang/String;)Z", "Lcom/datadog/android/profiling/internal/ProfilerCallback;", com.sun.jna.Callback.METHOD_NAME, "", "registerProfilingCallback", "(Ljava/lang/String;Lcom/datadog/android/profiling/internal/ProfilerCallback;)V", "Landroid/content/Context;", "appContext", "Lcom/datadog/android/profiling/internal/ProfilingStartReason;", "startReason", "", "additionalAttributes", "", "sdkInstanceNames", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Landroid/content/Context;Lcom/datadog/android/profiling/internal/ProfilingStartReason;Ljava/util/Map;Ljava/util/Set;)V", "stop", "(Ljava/lang/String;)V", "unregisterProfilingCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "setInternalLogger", "(Lcom/datadog/android/api/InternalLogger;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpProfiler implements com.datadog.android.profiling.internal.Profiler {
    private com.datadog.android.api.InternalLogger internalLogger;

    @Override // com.datadog.android.profiling.internal.Profiler
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void setInternalLogger(com.datadog.android.api.InternalLogger internalLogger) {
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void unregisterProfilingCallback(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void stop(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void start(android.content.Context appContext, com.datadog.android.profiling.internal.ProfilingStartReason startReason, java.util.Map<java.lang.String, java.lang.String> additionalAttributes, java.util.Set<java.lang.String> sdkInstanceNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceNames, "");
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final void registerProfilingCallback(java.lang.String sdkInstanceName, com.datadog.android.profiling.internal.ProfilerCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }

    @Override // com.datadog.android.profiling.internal.Profiler
    public final boolean isRunning(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        return false;
    }
}
