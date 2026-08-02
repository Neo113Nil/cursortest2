package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/WorkLauncherImpl;", "Landroidx/work/impl/WorkLauncher;", "Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/StartStopToken;", "workSpecId", "Landroidx/work/WorkerParameters$RuntimeExtras;", "runtimeExtras", "", "startWork", "(Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V", "", "reason", "stopWork", "(Landroidx/work/impl/StartStopToken;I)V", "Landroidx/work/impl/Processor;", "getProcessor", "()Landroidx/work/impl/Processor;", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkLauncherImpl implements androidx.work.impl.WorkLauncher {
    private final androidx.work.impl.Processor processor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(androidx.work.impl.Processor processor, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        this.processor = processor;
        this.workTaskExecutor = taskExecutor;
    }

    public final androidx.work.impl.Processor getProcessor() {
        return this.processor;
    }

    public final androidx.work.impl.utils.taskexecutor.TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void startWork(final androidx.work.impl.StartStopToken workSpecId, final androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        this.workTaskExecutor.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.WorkLauncherImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.WorkLauncherImpl.this.processor.startWork(workSpecId, runtimeExtras);
            }
        });
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void stopWork(androidx.work.impl.StartStopToken workSpecId, int reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        this.workTaskExecutor.executeOnTaskThread(new androidx.work.impl.utils.StopWorkRunnable(this.processor, workSpecId, false, reason));
    }
}
