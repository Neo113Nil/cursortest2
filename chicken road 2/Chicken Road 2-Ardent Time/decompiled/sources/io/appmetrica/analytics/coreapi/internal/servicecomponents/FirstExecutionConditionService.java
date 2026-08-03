package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes.dex */
public interface FirstExecutionConditionService {
    io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask createDelayedTask(java.lang.String str, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, java.lang.Runnable runnable);
}
