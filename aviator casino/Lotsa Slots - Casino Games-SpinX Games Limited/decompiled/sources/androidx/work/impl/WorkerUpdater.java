package androidx.work.impl;

/* compiled from: WorkerUpdater.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¨\u0006\u001b"}, d2 = {"updateWorkImpl", "Landroidx/work/WorkManager$UpdateResult;", "processor", "Landroidx/work/impl/Processor;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "configuration", "Landroidx/work/Configuration;", "schedulers", "", "Landroidx/work/impl/Scheduler;", "newWorkSpec", "Landroidx/work/impl/model/WorkSpec;", "tags", "", "", "enqueueUniquelyNamedPeriodic", "Landroidx/work/Operation;", "Landroidx/work/impl/WorkManagerImpl;", "name", "workRequest", "Landroidx/work/WorkRequest;", "failWorkTypeChanged", "", "Landroidx/work/impl/OperationImpl;", "message", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkerUpdater {
    private static final androidx.work.WorkManager.UpdateResult updateWorkImpl(androidx.work.impl.Processor processor, final androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration, final java.util.List<? extends androidx.work.impl.Scheduler> list, final androidx.work.impl.model.WorkSpec workSpec, final java.util.Set<java.lang.String> set) {
        final java.lang.String str = workSpec.id;
        final androidx.work.impl.model.WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new java.lang.IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (workSpec2.state.isFinished()) {
            return androidx.work.WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new kotlin.jvm.functions.Function1<androidx.work.impl.model.WorkSpec, java.lang.String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(androidx.work.impl.model.WorkSpec spec) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "spec");
                    return spec.isPeriodic() ? "Periodic" : "OneTime";
                }
            };
            throw new java.lang.UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke((androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1) workSpec2) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke((androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1) workSpec) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean isEnqueued = processor.isEnqueued(str);
        if (!isEnqueued) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((androidx.work.impl.Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.WorkerUpdater.updateWorkImpl$lambda$1(androidx.work.impl.WorkDatabase.this, workSpec, workSpec2, list, str, set, isEnqueued);
            }
        });
        if (!isEnqueued) {
            androidx.work.impl.Schedulers.schedule(configuration, workDatabase, list);
        }
        return isEnqueued ? androidx.work.WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : androidx.work.WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$1(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.model.WorkSpec newWorkSpec, androidx.work.impl.model.WorkSpec oldWorkSpec, java.util.List schedulers, java.lang.String workSpecId, java.util.Set tags, boolean z) {
        androidx.work.impl.model.WorkSpec copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "$tags");
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkTagDao workTagDao = workDatabase.workTagDao();
        copy = newWorkSpec.copy((r45 & 1) != 0 ? newWorkSpec.id : null, (r45 & 2) != 0 ? newWorkSpec.state : oldWorkSpec.state, (r45 & 4) != 0 ? newWorkSpec.workerClassName : null, (r45 & 8) != 0 ? newWorkSpec.inputMergerClassName : null, (r45 & 16) != 0 ? newWorkSpec.input : null, (r45 & 32) != 0 ? newWorkSpec.output : null, (r45 & 64) != 0 ? newWorkSpec.initialDelay : 0L, (r45 & 128) != 0 ? newWorkSpec.intervalDuration : 0L, (r45 & 256) != 0 ? newWorkSpec.flexDuration : 0L, (r45 & 512) != 0 ? newWorkSpec.constraints : null, (r45 & 1024) != 0 ? newWorkSpec.runAttemptCount : oldWorkSpec.runAttemptCount, (r45 & 2048) != 0 ? newWorkSpec.backoffPolicy : null, (r45 & 4096) != 0 ? newWorkSpec.backoffDelayDuration : 0L, (r45 & 8192) != 0 ? newWorkSpec.lastEnqueueTime : oldWorkSpec.lastEnqueueTime, (r45 & 16384) != 0 ? newWorkSpec.minimumRetentionDuration : 0L, (r45 & 32768) != 0 ? newWorkSpec.scheduleRequestedAt : 0L, (r45 & 65536) != 0 ? newWorkSpec.expedited : false, (131072 & r45) != 0 ? newWorkSpec.outOfQuotaPolicy : null, (r45 & 262144) != 0 ? newWorkSpec.periodCount : 0, (r45 & 524288) != 0 ? newWorkSpec.generation : oldWorkSpec.getGeneration() + 1);
        workSpecDao.updateWorkSpec(androidx.work.impl.utils.EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(schedulers, copy));
        workTagDao.deleteByWorkSpecId(workSpecId);
        workTagDao.insertTags(workSpecId, tags);
        if (z) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(workSpecId, -1L);
        workDatabase.workProgressDao().delete(workSpecId);
    }

    public static final com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkManager.UpdateResult> updateWorkImpl(final androidx.work.impl.WorkManagerImpl workManagerImpl, final androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final androidx.work.impl.utils.futures.SettableFuture future = androidx.work.impl.utils.futures.SettableFuture.create();
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.WorkerUpdater.updateWorkImpl$lambda$2(androidx.work.impl.utils.futures.SettableFuture.this, workManagerImpl, workRequest);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(androidx.work.impl.utils.futures.SettableFuture settableFuture, androidx.work.impl.WorkManagerImpl this_updateWorkImpl, androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_updateWorkImpl, "$this_updateWorkImpl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        if (settableFuture.isCancelled()) {
            return;
        }
        try {
            androidx.work.impl.Processor processor = this_updateWorkImpl.getProcessor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processor, "processor");
            androidx.work.impl.WorkDatabase workDatabase = this_updateWorkImpl.getWorkDatabase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.Configuration configuration = this_updateWorkImpl.getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            java.util.List<androidx.work.impl.Scheduler> schedulers = this_updateWorkImpl.getSchedulers();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            settableFuture.set(updateWorkImpl(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags()));
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static final androidx.work.Operation enqueueUniquelyNamedPeriodic(final androidx.work.impl.WorkManagerImpl workManagerImpl, final java.lang.String name, final androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerImpl, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final androidx.work.impl.OperationImpl operationImpl = new androidx.work.impl.OperationImpl();
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                new androidx.work.impl.utils.EnqueueRunnable(new androidx.work.impl.WorkContinuationImpl(workManagerImpl, name, androidx.work.ExistingWorkPolicy.KEEP, kotlin.collections.CollectionsKt.listOf(androidx.work.WorkRequest.this)), operationImpl).run();
            }
        };
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerUpdater$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic$lambda$3(androidx.work.impl.WorkManagerImpl.this, name, operationImpl, function0, workRequest);
            }
        });
        return operationImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueueUniquelyNamedPeriodic$lambda$3(androidx.work.impl.WorkManagerImpl this_enqueueUniquelyNamedPeriodic, java.lang.String name, androidx.work.impl.OperationImpl operation, kotlin.jvm.functions.Function0 enqueueNew, androidx.work.WorkRequest workRequest) {
        androidx.work.impl.model.WorkSpec copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "$name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "$operation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        androidx.work.impl.model.WorkSpecDao workSpecDao = this_enqueueUniquelyNamedPeriodic.getWorkDatabase().workSpecDao();
        java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(name);
        if (workSpecIdAndStatesForName.size() > 1) {
            failWorkTypeChanged(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        androidx.work.impl.model.WorkSpec.IdAndState idAndState = (androidx.work.impl.model.WorkSpec.IdAndState) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) workSpecIdAndStatesForName);
        if (idAndState == null) {
            enqueueNew.invoke();
            return;
        }
        androidx.work.impl.model.WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
        if (workSpec == null) {
            operation.markState(new androidx.work.Operation.State.FAILURE(new java.lang.IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!workSpec.isPeriodic()) {
            failWorkTypeChanged(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (idAndState.state == androidx.work.WorkInfo.State.CANCELLED) {
            workSpecDao.delete(idAndState.id);
            enqueueNew.invoke();
            return;
        }
        copy = r7.copy((r45 & 1) != 0 ? r7.id : idAndState.id, (r45 & 2) != 0 ? r7.state : null, (r45 & 4) != 0 ? r7.workerClassName : null, (r45 & 8) != 0 ? r7.inputMergerClassName : null, (r45 & 16) != 0 ? r7.input : null, (r45 & 32) != 0 ? r7.output : null, (r45 & 64) != 0 ? r7.initialDelay : 0L, (r45 & 128) != 0 ? r7.intervalDuration : 0L, (r45 & 256) != 0 ? r7.flexDuration : 0L, (r45 & 512) != 0 ? r7.constraints : null, (r45 & 1024) != 0 ? r7.runAttemptCount : 0, (r45 & 2048) != 0 ? r7.backoffPolicy : null, (r45 & 4096) != 0 ? r7.backoffDelayDuration : 0L, (r45 & 8192) != 0 ? r7.lastEnqueueTime : 0L, (r45 & 16384) != 0 ? r7.minimumRetentionDuration : 0L, (r45 & 32768) != 0 ? r7.scheduleRequestedAt : 0L, (r45 & 65536) != 0 ? r7.expedited : false, (131072 & r45) != 0 ? r7.outOfQuotaPolicy : null, (r45 & 262144) != 0 ? r7.periodCount : 0, (r45 & 524288) != 0 ? workRequest.getWorkSpec().generation : 0);
        try {
            androidx.work.impl.Processor processor = this_enqueueUniquelyNamedPeriodic.getProcessor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processor, "processor");
            androidx.work.impl.WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.getWorkDatabase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.Configuration configuration = this_enqueueUniquelyNamedPeriodic.getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            java.util.List<androidx.work.impl.Scheduler> schedulers = this_enqueueUniquelyNamedPeriodic.getSchedulers();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            updateWorkImpl(processor, workDatabase, configuration, schedulers, copy, workRequest.getTags());
            operation.markState(androidx.work.Operation.SUCCESS);
        } catch (java.lang.Throwable th) {
            operation.markState(new androidx.work.Operation.State.FAILURE(th));
        }
    }

    private static final void failWorkTypeChanged(androidx.work.impl.OperationImpl operationImpl, java.lang.String str) {
        operationImpl.markState(new androidx.work.Operation.State.FAILURE(new java.lang.UnsupportedOperationException(str)));
    }
}
