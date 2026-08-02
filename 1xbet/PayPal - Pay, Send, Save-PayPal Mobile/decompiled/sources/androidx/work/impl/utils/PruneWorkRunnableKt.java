package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "executor", "Landroidx/work/Operation;", "pruneWork", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/Operation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PruneWorkRunnableKt {
    public static final androidx.work.Operation pruneWork(final androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        androidx.work.Tracer tracer = configuration.getTracer();
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, "PruneWork", serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.PruneWorkRunnableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.PruneWorkRunnableKt.$r8$lambda$ecTjOL5vIc8q5PlTd7s6SpyZL7s(androidx.work.impl.WorkDatabase.this);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ecTjOL5vIc8q5PlTd7s6SpyZL7s(androidx.work.impl.WorkDatabase workDatabase) {
        workDatabase.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
        return kotlin.Unit.INSTANCE;
    }
}
