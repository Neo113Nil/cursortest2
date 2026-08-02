package androidx.work.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function6<android.content.Context, androidx.work.Configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor, androidx.work.impl.WorkDatabase, androidx.work.impl.constraints.trackers.Trackers, androidx.work.impl.Processor, java.util.List<? extends androidx.work.impl.Scheduler>> {
    public static final androidx.work.impl.WorkManagerImplExtKt$WorkManagerImpl$1 getHighSpeedVideoFpsRangesFor = new androidx.work.impl.WorkManagerImplExtKt$WorkManagerImpl$1();

    @Override // kotlin.jvm.functions.Function6
    public final /* synthetic */ java.util.List<? extends androidx.work.impl.Scheduler> invoke(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor) {
        android.content.Context context2 = context;
        androidx.work.Configuration configuration2 = configuration;
        androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor2 = taskExecutor;
        androidx.work.impl.WorkDatabase workDatabase2 = workDatabase;
        androidx.work.impl.constraints.trackers.Trackers trackers2 = trackers;
        androidx.work.impl.Processor processor2 = processor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor2, "");
        return androidx.work.impl.WorkManagerImplExtKt.access$createSchedulers(context2, configuration2, taskExecutor2, workDatabase2, trackers2, processor2);
    }

    WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, androidx.work.impl.WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }
}
