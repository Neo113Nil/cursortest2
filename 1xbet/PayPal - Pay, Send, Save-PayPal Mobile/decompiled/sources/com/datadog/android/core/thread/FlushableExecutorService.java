package com.datadog.android.core.thread;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/core/thread/FlushableExecutorService;", "Ljava/util/concurrent/ExecutorService;", "", "Ljava/lang/Runnable;", "destination", "", "drainTo", "(Ljava/util/Collection;)V", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FlushableExecutorService extends java.util.concurrent.ExecutorService {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "create", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;Lcom/datadog/android/internal/time/TimeProvider;)Lcom/datadog/android/core/thread/FlushableExecutorService;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        com.datadog.android.core.thread.FlushableExecutorService create(com.datadog.android.api.InternalLogger internalLogger, java.lang.String executorContext, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, com.datadog.android.internal.time.TimeProvider timeProvider);
    }

    void drainTo(java.util.Collection<java.lang.Runnable> destination);
}
