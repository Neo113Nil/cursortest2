package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\b\u001a\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/WorkManagerImpl;", "p0", "", "p1", "", "getHighSpeedVideoFpsRanges", "(Landroidx/work/impl/WorkManagerImpl;Ljava/lang/String;)V", "Landroidx/work/impl/WorkDatabase;", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "workManagerImpl", "Landroidx/work/Operation;", "forId", "(Ljava/util/UUID;Landroidx/work/impl/WorkManagerImpl;)Landroidx/work/Operation;", "tag", "forTag", "(Ljava/lang/String;Landroidx/work/impl/WorkManagerImpl;)Landroidx/work/Operation;", "name", "forName", "forNameInline", "(Ljava/lang/String;Landroidx/work/impl/WorkManagerImpl;)V", "forAll", "(Landroidx/work/impl/WorkManagerImpl;)Landroidx/work/Operation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancelWorkRunnable {
    private static final void getHighSpeedVideoFpsRanges(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String str) {
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        getHighSpeedVideoFpsRanges(workDatabase, str);
        androidx.work.impl.Processor processor = workManagerImpl.getProcessor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processor, "");
        processor.stopAndCancelWork(str, 1);
        java.util.Iterator<androidx.work.impl.Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.DependencyDao dependencyDao = workDatabase.dependencyDao();
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(str);
        while (!mutableListOf.isEmpty()) {
            java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.removeLast(mutableListOf);
            androidx.work.WorkInfo.State state = workSpecDao.getState(str2);
            if (state != androidx.work.WorkInfo.State.SUCCEEDED && state != androidx.work.WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            mutableListOf.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    public static final androidx.work.Operation forId(final java.util.UUID uuid, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        androidx.work.Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.CancelWorkRunnable.$r8$lambda$8EsI_obE8bQExJ_QYqMsYGJK8YY(androidx.work.impl.WorkManagerImpl.this, uuid);
            }
        });
    }

    public static final androidx.work.Operation forTag(final java.lang.String str, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        androidx.work.Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        java.lang.String concat = "CancelWorkByTag_".concat(java.lang.String.valueOf(str));
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, concat, serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.CancelWorkRunnable.m9506$r8$lambda$p7yPcpxCDGrvWfMUDfM5o7QaE(androidx.work.impl.WorkManagerImpl.this, str);
            }
        });
    }

    public static final androidx.work.Operation forName(final java.lang.String str, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        androidx.work.Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        java.lang.String concat = "CancelWorkByName_".concat(java.lang.String.valueOf(str));
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, concat, serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.CancelWorkRunnable.$r8$lambda$4QqdN7ggcyUEiyMiYfM9Uxq5r7Q(str, workManagerImpl);
            }
        });
    }

    public static final void forNameInline(final java.lang.String str, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        final androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.utils.CancelWorkRunnable.m9504$r8$lambda$7CMxqlNCknD_Q1NSUJ5L0sWGBQ(androidx.work.impl.WorkDatabase.this, str, workManagerImpl);
            }
        });
    }

    public static final androidx.work.Operation forAll(final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        androidx.work.Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.CancelWorkRunnable.$r8$lambda$lTL9Gg9r_NUH7ARdqAbl768p6fs(androidx.work.impl.WorkManagerImpl.this);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4QqdN7ggcyUEiyMiYfM9Uxq5r7Q(java.lang.String str, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        forNameInline(str, workManagerImpl);
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7CMxqlNCknD_Q1NSUJ5-L0sWGBQ, reason: not valid java name */
    public static /* synthetic */ void m9504$r8$lambda$7CMxqlNCknD_Q1NSUJ5L0sWGBQ(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(workManagerImpl, it.next());
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8EsI_obE8bQExJ_QYqMsYGJK8YY(final androidx.work.impl.WorkManagerImpl workManagerImpl, final java.util.UUID uuid) {
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.utils.CancelWorkRunnable.$r8$lambda$9OOzgm9vmuSGphBLxiraZo1D9nc(androidx.work.impl.WorkManagerImpl.this, uuid);
            }
        });
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$9OOzgm9vmuSGphBLxiraZo1D9nc(androidx.work.impl.WorkManagerImpl workManagerImpl, java.util.UUID uuid) {
        java.lang.String obj = uuid.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        getHighSpeedVideoFpsRanges(workManagerImpl, obj);
    }

    /* renamed from: $r8$lambda$KkDn92J-7--QQUZlwoFobK0nhPc, reason: not valid java name */
    public static /* synthetic */ void m9505$r8$lambda$KkDn92J7QQUZlwoFobK0nhPc(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(workManagerImpl, it.next());
        }
    }

    public static /* synthetic */ void $r8$lambda$WQ8qWu08hO2qnt0ltJMkDwBtAwg(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(workManagerImpl, it.next());
        }
        new androidx.work.impl.utils.PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lTL9Gg9r_NUH7ARdqAbl768p6fs(final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        final androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.utils.CancelWorkRunnable.$r8$lambda$WQ8qWu08hO2qnt0ltJMkDwBtAwg(androidx.work.impl.WorkDatabase.this, workManagerImpl);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p7yPcpxCDGrvWf-M-UDfM5o7QaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9506$r8$lambda$p7yPcpxCDGrvWfMUDfM5o7QaE(final androidx.work.impl.WorkManagerImpl workManagerImpl, final java.lang.String str) {
        final androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.utils.CancelWorkRunnable.m9505$r8$lambda$KkDn92J7QQUZlwoFobK0nhPc(androidx.work.impl.WorkDatabase.this, str, workManagerImpl);
            }
        });
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
        return kotlin.Unit.INSTANCE;
    }
}
