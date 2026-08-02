package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/work/impl/Processor;", "p0", "Landroidx/work/impl/WorkDatabase;", "p1", "Landroidx/work/Configuration;", "p2", "", "Landroidx/work/impl/Scheduler;", "p3", "Landroidx/work/impl/model/WorkSpec;", "p4", "", "", "p5", "Landroidx/work/WorkManager$UpdateResult;", "Camera2StreamConfigurationMap", "(Landroidx/work/impl/Processor;Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Ljava/util/List;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)Landroidx/work/WorkManager$UpdateResult;", "Landroidx/work/impl/WorkManagerImpl;", "Landroidx/work/WorkRequest;", "workRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "updateWorkImpl", "(Landroidx/work/impl/WorkManagerImpl;Landroidx/work/WorkRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "name", "Landroidx/work/Operation;", "enqueueUniquelyNamedPeriodic", "(Landroidx/work/impl/WorkManagerImpl;Ljava/lang/String;Landroidx/work/WorkRequest;)Landroidx/work/Operation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerUpdater {
    private static final androidx.work.WorkManager.UpdateResult Camera2StreamConfigurationMap(androidx.work.impl.Processor processor, final androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration, final java.util.List<? extends androidx.work.impl.Scheduler> list, final androidx.work.impl.model.WorkSpec workSpec, final java.util.Set<java.lang.String> set) {
        final java.lang.String str = workSpec.id;
        final androidx.work.impl.model.WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Worker with ");
            sb.append(str);
            sb.append(" doesn't exist");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (workSpec2.state.isFinished()) {
            return androidx.work.WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.work.impl.WorkerUpdater.$r8$lambda$KcsYtEjMmPba5EsO_zkeL_Tq55o((androidx.work.impl.model.WorkSpec) obj);
                }
            };
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't update ");
            sb2.append((java.lang.String) function1.invoke(workSpec2));
            sb2.append(" Worker to ");
            sb2.append((java.lang.String) function1.invoke(workSpec));
            sb2.append(" Worker. Update operation must preserve worker's type.");
            throw new java.lang.UnsupportedOperationException(sb2.toString());
        }
        final boolean isEnqueued = processor.isEnqueued(str);
        if (!isEnqueued) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((androidx.work.impl.Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.WorkerUpdater.m9474$r8$lambda$5dx0Z4eBB8i1jJkoxlWJyGBKxI(androidx.work.impl.WorkDatabase.this, workSpec2, workSpec, list, str, set, isEnqueued);
            }
        });
        if (!isEnqueued) {
            androidx.work.impl.Schedulers.schedule(configuration, workDatabase, list);
        }
        return isEnqueued ? androidx.work.WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : androidx.work.WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    public static final com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkManager.UpdateResult> updateWorkImpl(final androidx.work.impl.WorkManagerImpl workManagerImpl, final androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "");
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "updateWorkImpl", new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.WorkerUpdater.m9475$r8$lambda$LAv_XAPE2AkYJNRsg4HBYu4OeM(androidx.work.impl.WorkManagerImpl.this, workRequest);
            }
        });
    }

    public static final androidx.work.Operation enqueueUniquelyNamedPeriodic(final androidx.work.impl.WorkManagerImpl workManagerImpl, final java.lang.String str, final androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "");
        androidx.work.Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        java.lang.String concat = "enqueueUniquePeriodic_".concat(java.lang.String.valueOf(str));
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.OperationKt.launchOperation(tracer, concat, serialTaskExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.WorkerUpdater.$r8$lambda$21ictocsYpVpgrrtxf26fSYa5jc(androidx.work.impl.WorkManagerImpl.this, str, workRequest);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$21ictocsYpVpgrrtxf26fSYa5jc(final androidx.work.impl.WorkManagerImpl workManagerImpl, final java.lang.String str, final androidx.work.WorkRequest workRequest) {
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.WorkerUpdater.$r8$lambda$M_uZdI89v6CUunycKVfl3IJJSEM(androidx.work.WorkRequest.this, workManagerImpl, str);
            }
        };
        androidx.work.impl.model.WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(str);
        if (workSpecIdAndStatesForName.size() > 1) {
            throw new java.lang.UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        androidx.work.impl.model.WorkSpec.IdAndState idAndState = (androidx.work.impl.model.WorkSpec.IdAndState) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) workSpecIdAndStatesForName);
        if (idAndState == null) {
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        }
        androidx.work.impl.model.WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
        if (workSpec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkSpec with ");
            sb.append(idAndState.id);
            sb.append(", that matches a name \"");
            sb.append(str);
            sb.append("\", wasn't found");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!workSpec.isPeriodic()) {
            throw new java.lang.UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == androidx.work.WorkInfo.State.CANCELLED) {
            workSpecDao.delete(idAndState.id);
            function0.invoke();
            return kotlin.Unit.INSTANCE;
        }
        androidx.work.impl.model.WorkSpec copy$default = androidx.work.impl.model.WorkSpec.copy$default(workRequest.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
        androidx.work.impl.Processor processor = workManagerImpl.getProcessor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processor, "");
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        androidx.work.Configuration configuration = workManagerImpl.getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "");
        java.util.List<androidx.work.impl.Scheduler> schedulers = workManagerImpl.getSchedulers();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulers, "");
        Camera2StreamConfigurationMap(processor, workDatabase, configuration, schedulers, copy$default, workRequest.getTags());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5dx0Z4eBB8i1jJkoxlWJyGBK-xI, reason: not valid java name */
    public static /* synthetic */ void m9474$r8$lambda$5dx0Z4eBB8i1jJkoxlWJyGBKxI(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.model.WorkSpec workSpec, androidx.work.impl.model.WorkSpec workSpec2, java.util.List list, java.lang.String str, java.util.Set set, boolean z) {
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkTagDao workTagDao = workDatabase.workTagDao();
        androidx.work.impl.model.WorkSpec copy$default = androidx.work.impl.model.WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            copy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            copy$default.setNextScheduleTimeOverrideGeneration(copy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(androidx.work.impl.utils.EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, copy$default));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$KcsYtEjMmPba5EsO_zkeL_Tq55o(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return workSpec.isPeriodic() ? "Periodic" : "OneTime";
    }

    /* renamed from: $r8$lambda$LAv_XA-PE2AkYJNRsg4HBYu4OeM, reason: not valid java name */
    public static /* synthetic */ androidx.work.WorkManager.UpdateResult m9475$r8$lambda$LAv_XAPE2AkYJNRsg4HBYu4OeM(androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.WorkRequest workRequest) {
        androidx.work.impl.Processor processor = workManagerImpl.getProcessor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processor, "");
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        androidx.work.Configuration configuration = workManagerImpl.getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "");
        java.util.List<androidx.work.impl.Scheduler> schedulers = workManagerImpl.getSchedulers();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulers, "");
        return Camera2StreamConfigurationMap(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M_uZdI89v6CUunycKVfl3IJJSEM(androidx.work.WorkRequest workRequest, androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String str) {
        androidx.work.impl.utils.EnqueueRunnable.enqueue(new androidx.work.impl.WorkContinuationImpl(workManagerImpl, str, androidx.work.ExistingWorkPolicy.KEEP, kotlin.collections.CollectionsKt.listOf(workRequest)));
        return kotlin.Unit.INSTANCE;
    }
}
