package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ExecutorProvider {
    io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getDefaultExecutor();

    io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread getInterruptionThread(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable);

    io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getModuleExecutor();

    java.util.concurrent.Executor getReportRunnableExecutor();

    io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getSupportIOExecutor();

    java.util.concurrent.Executor getUiExecutor();
}
