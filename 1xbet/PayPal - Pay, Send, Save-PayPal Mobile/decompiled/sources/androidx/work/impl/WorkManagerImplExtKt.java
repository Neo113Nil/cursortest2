package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a¡\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2Z\b\u0002\u0010\u0011\u001aT\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fj\u0002`\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001as\u0010\u0018\u001aT\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fj\u0002`\u00102\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0017\"\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u0012¢\u0006\u0004\b\u001f\u0010 *¦\u0001\u0010!\"P\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2P\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/Trackers;", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "Landroidx/work/impl/Processor;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "", "Landroidx/work/impl/Scheduler;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Landroidx/work/impl/WorkManagerImpl;", "createWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;Lkotlin/jvm/functions/Function6;)Landroidx/work/impl/WorkManagerImpl;", "createTestWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/impl/WorkManagerImpl;", "", "schedulers", "([Landroidx/work/impl/Scheduler;)Lkotlin/jvm/functions/Function6;", "taskExecutor", "Lkotlinx/coroutines/CoroutineScope;", "createWorkManagerScope", "(Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Lkotlinx/coroutines/CoroutineScope;", "", "close", "(Landroidx/work/impl/WorkManagerImpl;)V", "SchedulersCreator"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkManagerImplExtKt {
    public static /* synthetic */ androidx.work.impl.WorkManagerImpl createWorkManager$default(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor, kotlin.jvm.functions.Function6 function6, int i, java.lang.Object obj) {
        androidx.work.impl.WorkDatabase workDatabase2;
        androidx.work.impl.constraints.trackers.Trackers trackers2;
        androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor workManagerTaskExecutor = (i & 4) != 0 ? new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor(configuration.getTaskExecutor()) : taskExecutor;
        if ((i & 8) != 0) {
            androidx.work.impl.WorkDatabase.Companion companion = androidx.work.impl.WorkDatabase.INSTANCE;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerTaskExecutor.getSerialTaskExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
            workDatabase2 = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(androidx.work.R.bool.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i & 16) != 0) {
            android.content.Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            trackers2 = new androidx.work.impl.constraints.trackers.Trackers(applicationContext2, workManagerTaskExecutor, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, workManagerTaskExecutor, workDatabase2, trackers2, (i & 32) != 0 ? new androidx.work.impl.Processor(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase2) : processor, (i & 64) != 0 ? androidx.work.impl.WorkManagerImplExtKt$WorkManagerImpl$1.getHighSpeedVideoFpsRangesFor : function6);
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor, kotlin.jvm.functions.Function6<? super android.content.Context, ? super androidx.work.Configuration, ? super androidx.work.impl.utils.taskexecutor.TaskExecutor, ? super androidx.work.impl.WorkDatabase, ? super androidx.work.impl.constraints.trackers.Trackers, ? super androidx.work.impl.Processor, ? extends java.util.List<? extends androidx.work.impl.Scheduler>> function6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function6, "");
        return new androidx.work.impl.WorkManagerImpl(context.getApplicationContext(), configuration, taskExecutor, workDatabase, function6.invoke(context, configuration, taskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static final androidx.work.impl.WorkManagerImpl createTestWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        androidx.work.impl.WorkDatabase.Companion companion = androidx.work.impl.WorkDatabase.INSTANCE;
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return createWorkManager$default(context, configuration, taskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final kotlin.jvm.functions.Function6<android.content.Context, androidx.work.Configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor, androidx.work.impl.WorkDatabase, androidx.work.impl.constraints.trackers.Trackers, androidx.work.impl.Processor, java.util.List<androidx.work.impl.Scheduler>> schedulers(final androidx.work.impl.Scheduler... schedulerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schedulerArr, "");
        return new kotlin.jvm.functions.Function6() { // from class: androidx.work.impl.WorkManagerImplExtKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function6
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                return androidx.work.impl.WorkManagerImplExtKt.m9473$r8$lambda$8DQoUFtyfsdTS00ElPwjYU_Xc(schedulerArr, (android.content.Context) obj, (androidx.work.Configuration) obj2, (androidx.work.impl.utils.taskexecutor.TaskExecutor) obj3, (androidx.work.impl.WorkDatabase) obj4, (androidx.work.impl.constraints.trackers.Trackers) obj5, (androidx.work.impl.Processor) obj6);
            }
        };
    }

    public static final kotlinx.coroutines.CoroutineScope createWorkManagerScope(androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlinx.coroutines.CoroutineDispatcher taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(taskCoroutineDispatcher, "");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(taskCoroutineDispatcher);
    }

    public static final void close(androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.work.impl.WorkManagerImplExtKt$close$1(workManagerImpl, null), 1, null);
        workManagerImpl.getWorkDatabase().close();
    }

    /* renamed from: $r8$lambda$8DQoUFtyf-sdTS0-0ElPwjYU_Xc, reason: not valid java name */
    public static /* synthetic */ java.util.List m9473$r8$lambda$8DQoUFtyfsdTS00ElPwjYU_Xc(androidx.work.impl.Scheduler[] schedulerArr, android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        return kotlin.collections.ArraysKt.toList(schedulerArr);
    }

    public static final /* synthetic */ java.util.List access$createSchedulers(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor) {
        androidx.work.impl.Scheduler highSpeedVideoFpsRanges = androidx.work.impl.Schedulers.getHighSpeedVideoFpsRanges(context, workDatabase, configuration);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoFpsRanges, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.work.impl.Scheduler[]{highSpeedVideoFpsRanges, new androidx.work.impl.background.greedy.GreedyScheduler(context, configuration, trackers, processor, new androidx.work.impl.WorkLauncherImpl(processor, taskExecutor), taskExecutor)});
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.Processor processor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.Trackers trackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        return createWorkManager$default(context, configuration, taskExecutor, null, null, null, null, 120, null);
    }

    public static final androidx.work.impl.WorkManagerImpl createWorkManager(android.content.Context context, androidx.work.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return createWorkManager$default(context, configuration, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }
}
