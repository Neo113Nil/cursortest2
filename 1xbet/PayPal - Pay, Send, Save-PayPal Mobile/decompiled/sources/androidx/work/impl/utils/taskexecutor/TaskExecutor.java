package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes3.dex */
public interface TaskExecutor {
    java.util.concurrent.Executor getMainThreadExecutor();

    androidx.work.impl.utils.taskexecutor.SerialExecutor getSerialTaskExecutor();

    default void executeOnTaskThread(java.lang.Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    default kotlinx.coroutines.CoroutineDispatcher getTaskCoroutineDispatcher() {
        return kotlinx.coroutines.ExecutorsKt.from(getSerialTaskExecutor());
    }
}
