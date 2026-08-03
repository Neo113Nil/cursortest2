package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes2.dex */
public interface TaskExecutor {
    void executeOnTaskThread(java.lang.Runnable runnable);

    java.util.concurrent.Executor getMainThreadExecutor();

    androidx.work.impl.utils.taskexecutor.SerialExecutor getSerialTaskExecutor();

    /* renamed from: androidx.work.impl.utils.taskexecutor.TaskExecutor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
