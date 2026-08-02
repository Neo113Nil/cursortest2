package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "Ljava/util/concurrent/ScheduledExecutorService;", "create", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;)Ljava/util/concurrent/ScheduledExecutorService;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ScheduledExecutorServiceFactory {
    java.util.concurrent.ScheduledExecutorService create(com.datadog.android.api.InternalLogger internalLogger, java.lang.String executorContext, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy);
}
