package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class EnqueueRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("EnqueueRunnable");
    private final androidx.work.impl.OperationImpl mOperation;
    private final androidx.work.impl.WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(androidx.work.impl.WorkContinuationImpl workContinuation) {
        this(workContinuation, new androidx.work.impl.OperationImpl());
    }

    public EnqueueRunnable(androidx.work.impl.WorkContinuationImpl workContinuation, androidx.work.impl.OperationImpl result) {
        this.mWorkContinuation = workContinuation;
        this.mOperation = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new java.lang.IllegalStateException("WorkContinuation has cycles (" + this.mWorkContinuation + ")");
            }
            if (addToDatabase()) {
                androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), androidx.work.impl.background.systemalarm.RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.markState(androidx.work.Operation.SUCCESS);
        } catch (java.lang.Throwable th) {
            this.mOperation.markState(new androidx.work.Operation.State.FAILURE(th));
        }
    }

    public androidx.work.Operation getOperation() {
        return this.mOperation;
    }

    public boolean addToDatabase() {
        androidx.work.impl.WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean processContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public void scheduleWorkInBackground() {
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(androidx.work.impl.WorkContinuationImpl workContinuation) {
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = workContinuation.getParents();
        boolean z = false;
        if (parents != null) {
            for (androidx.work.impl.WorkContinuationImpl workContinuationImpl : parents) {
                if (!workContinuationImpl.isEnqueued()) {
                    z |= processContinuation(workContinuationImpl);
                } else {
                    androidx.work.Logger.get().warning(TAG, "Already enqueued work ids (" + android.text.TextUtils.join(", ", workContinuationImpl.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuation) | z;
    }

    private static boolean enqueueContinuation(androidx.work.impl.WorkContinuationImpl workContinuation) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuation.getWorkManagerImpl(), workContinuation.getWork(), (java.lang.String[]) androidx.work.impl.WorkContinuationImpl.prerequisitesFor(workContinuation).toArray(new java.lang.String[0]), workContinuation.getName(), workContinuation.getExistingWorkPolicy());
        workContinuation.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl workManagerImpl, java.util.List<? extends androidx.work.WorkRequest> workList, java.lang.String[] prerequisiteIds, java.lang.String name, androidx.work.ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String[] strArr = prerequisiteIds;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        boolean z5 = strArr != null && strArr.length > 0;
        if (z5) {
            z = true;
            z2 = false;
            z3 = false;
            for (java.lang.String str : strArr) {
                androidx.work.impl.model.WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(str);
                if (workSpec == null) {
                    androidx.work.Logger.get().error(TAG, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    return false;
                }
                androidx.work.WorkInfo.State state = workSpec.state;
                z &= state == androidx.work.WorkInfo.State.SUCCEEDED;
                if (state == androidx.work.WorkInfo.State.FAILED) {
                    z3 = true;
                } else if (state == androidx.work.WorkInfo.State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z6 = !android.text.TextUtils.isEmpty(name);
        if (z6 && !z5) {
            java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase.workSpecDao().getWorkSpecIdAndStatesForName(name);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND || existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    androidx.work.impl.model.DependencyDao dependencyDao = workDatabase.dependencyDao();
                    java.util.List arrayList = new java.util.ArrayList();
                    for (androidx.work.impl.model.WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (!dependencyDao.hasDependents(idAndState.id)) {
                            boolean z7 = (idAndState.state == androidx.work.WorkInfo.State.SUCCEEDED) & z;
                            if (idAndState.state == androidx.work.WorkInfo.State.FAILED) {
                                z3 = true;
                            } else if (idAndState.state == androidx.work.WorkInfo.State.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(idAndState.id);
                            z = z7;
                        }
                    }
                    if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                        java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it = workSpecDao.getWorkSpecIdAndStatesForName(name).iterator();
                        while (it.hasNext()) {
                            workSpecDao.delete(it.next().id);
                        }
                        arrayList = java.util.Collections.emptyList();
                        z2 = false;
                        z3 = false;
                    }
                    strArr = (java.lang.String[]) arrayList.toArray(strArr);
                    z5 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.KEEP) {
                        for (androidx.work.impl.model.WorkSpec.IdAndState idAndState2 : workSpecIdAndStatesForName) {
                            if (idAndState2.state == androidx.work.WorkInfo.State.ENQUEUED || idAndState2.state == androidx.work.WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    androidx.work.impl.utils.CancelWorkRunnable.forName(name, workManagerImpl, false).run();
                    androidx.work.impl.model.WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
                    java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                    while (it2.hasNext()) {
                        workSpecDao2.delete(it2.next().id);
                    }
                    z4 = true;
                    for (androidx.work.WorkRequest workRequest : workList) {
                        androidx.work.impl.model.WorkSpec workSpec2 = workRequest.getWorkSpec();
                        if (!z5 || z) {
                            workSpec2.lastEnqueueTime = currentTimeMillis;
                        } else if (z3) {
                            workSpec2.state = androidx.work.WorkInfo.State.FAILED;
                        } else if (z2) {
                            workSpec2.state = androidx.work.WorkInfo.State.CANCELLED;
                        } else {
                            workSpec2.state = androidx.work.WorkInfo.State.BLOCKED;
                        }
                        if (workSpec2.state == androidx.work.WorkInfo.State.ENQUEUED) {
                            z4 = true;
                        }
                        workDatabase.workSpecDao().insertWorkSpec(androidx.work.impl.utils.EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(workManagerImpl.getSchedulers(), workSpec2));
                        if (z5) {
                            int length = strArr.length;
                            int i = 0;
                            while (i < length) {
                                workDatabase.dependencyDao().insertDependency(new androidx.work.impl.model.Dependency(workRequest.getStringId(), strArr[i]));
                                i++;
                                z4 = z4;
                                strArr = strArr;
                            }
                        }
                        java.lang.String[] strArr2 = strArr;
                        boolean z8 = z4;
                        workDatabase.workTagDao().insertTags(workRequest.getStringId(), workRequest.getTags());
                        if (z6) {
                            workDatabase.workNameDao().insert(new androidx.work.impl.model.WorkName(name, workRequest.getStringId()));
                        }
                        z4 = z8;
                        strArr = strArr2;
                    }
                    return z4;
                }
            }
        }
        z4 = false;
        while (r6.hasNext()) {
        }
        return z4;
    }
}
