package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class EnqueueRunnable {
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("EnqueueRunnable");

    private EnqueueRunnable() {
    }

    public static void enqueue(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        if (workContinuationImpl.hasCycles()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkContinuation has cycles (");
            sb.append(workContinuationImpl);
            sb.append(")");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (addToDatabase(workContinuationImpl)) {
            scheduleWorkInBackground(workContinuationImpl);
        }
    }

    public static boolean addToDatabase(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        androidx.work.impl.WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.utils.EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), workContinuationImpl);
            boolean highSpeedVideoSizes = getHighSpeedVideoSizes(workContinuationImpl);
            workDatabase.setTransactionSuccessful();
            return highSpeedVideoSizes;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public static void scheduleWorkInBackground(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        androidx.work.impl.WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean getHighSpeedVideoSizes(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean z = false;
        if (parents != null) {
            for (androidx.work.impl.WorkContinuationImpl workContinuationImpl2 : parents) {
                if (!workContinuationImpl2.isEnqueued()) {
                    z |= getHighSpeedVideoSizes(workContinuationImpl2);
                } else {
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    java.lang.String str = getHighSpeedVideoFpsRanges;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Already enqueued work ids (");
                    sb.append(android.text.TextUtils.join(", ", workContinuationImpl2.getIds()));
                    sb.append(")");
                    logger.warning(str, sb.toString());
                }
            }
        }
        return getHighSpeedVideoFpsRangesFor(workContinuationImpl) | z;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoFpsRangesFor(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.work.impl.model.DependencyDao dependencyDao;
        java.util.Set<java.lang.String> prerequisitesFor = androidx.work.impl.WorkContinuationImpl.prerequisitesFor(workContinuationImpl);
        androidx.work.impl.WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        java.util.List<? extends androidx.work.WorkRequest> work = workContinuationImpl.getWork();
        java.lang.String[] strArr = (java.lang.String[]) prerequisitesFor.toArray(new java.lang.String[0]);
        java.lang.String name2 = workContinuationImpl.getName();
        androidx.work.ExistingWorkPolicy existingWorkPolicy = workContinuationImpl.getExistingWorkPolicy();
        long currentTimeMillis = workManagerImpl.getConfiguration().getClock().currentTimeMillis();
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        boolean z7 = strArr != null && strArr.length > 0;
        if (z7) {
            z2 = false;
            z3 = false;
            z = true;
            for (java.lang.String str : strArr) {
                androidx.work.impl.model.WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(str);
                if (workSpec == null) {
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    java.lang.String str2 = getHighSpeedVideoFpsRanges;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Prerequisite ");
                    sb.append(str);
                    sb.append(" doesn't exist; not enqueuing");
                    logger.error(str2, sb.toString());
                    break;
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
        boolean isEmpty = android.text.TextUtils.isEmpty(name2);
        if (!isEmpty && !z7) {
            java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase.workSpecDao().getWorkSpecIdAndStatesForName(name2);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND || existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    androidx.work.impl.model.DependencyDao dependencyDao2 = workDatabase.dependencyDao();
                    java.util.List arrayList = new java.util.ArrayList();
                    java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it = workSpecIdAndStatesForName.iterator();
                    while (it.hasNext()) {
                        androidx.work.impl.model.WorkSpec.IdAndState next = it.next();
                        java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it2 = it;
                        if (dependencyDao2.hasDependents(next.id)) {
                            z6 = isEmpty;
                            dependencyDao = dependencyDao2;
                        } else {
                            dependencyDao = dependencyDao2;
                            boolean z8 = next.state == androidx.work.WorkInfo.State.SUCCEEDED;
                            z6 = isEmpty;
                            if (next.state == androidx.work.WorkInfo.State.FAILED) {
                                z3 = true;
                            } else if (next.state == androidx.work.WorkInfo.State.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(next.id);
                            z &= z8;
                        }
                        it = it2;
                        dependencyDao2 = dependencyDao;
                        isEmpty = z6;
                    }
                    z4 = isEmpty;
                    if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                        java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it3 = workSpecDao.getWorkSpecIdAndStatesForName(name2).iterator();
                        while (it3.hasNext()) {
                            workSpecDao.delete(it3.next().id);
                        }
                        arrayList = java.util.Collections.emptyList();
                        z2 = false;
                        z3 = false;
                    }
                    strArr = (java.lang.String[]) arrayList.toArray(strArr);
                    z7 = strArr.length > 0;
                    z5 = false;
                    for (androidx.work.WorkRequest workRequest : work) {
                        androidx.work.impl.model.WorkSpec workSpec2 = workRequest.getWorkSpec();
                        if (!z7 || z) {
                            workSpec2.lastEnqueueTime = currentTimeMillis;
                        } else if (z3) {
                            workSpec2.state = androidx.work.WorkInfo.State.FAILED;
                        } else if (z2) {
                            workSpec2.state = androidx.work.WorkInfo.State.CANCELLED;
                        } else {
                            workSpec2.state = androidx.work.WorkInfo.State.BLOCKED;
                        }
                        if (workSpec2.state == androidx.work.WorkInfo.State.ENQUEUED) {
                            z5 = true;
                        }
                        workDatabase.workSpecDao().insertWorkSpec(androidx.work.impl.utils.EnqueueUtilsKt.wrapWorkSpecIfNeeded(workManagerImpl.getSchedulers(), workSpec2));
                        if (z7) {
                            int length = strArr.length;
                            int i = 0;
                            while (i < length) {
                                workDatabase.dependencyDao().insertDependency(new androidx.work.impl.model.Dependency(workRequest.getStringId(), strArr[i]));
                                i++;
                                strArr = strArr;
                                workManagerImpl = workManagerImpl;
                            }
                        }
                        java.lang.String[] strArr2 = strArr;
                        androidx.work.impl.WorkManagerImpl workManagerImpl2 = workManagerImpl;
                        workDatabase.workTagDao().insertTags(workRequest.getStringId(), workRequest.getTags());
                        if (!z4) {
                            workDatabase.workNameDao().insert(new androidx.work.impl.model.WorkName(name2, workRequest.getStringId()));
                        }
                        strArr = strArr2;
                        workManagerImpl = workManagerImpl2;
                    }
                    workContinuationImpl.markEnqueued();
                    return z5;
                }
                if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.KEEP) {
                    java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it4 = workSpecIdAndStatesForName.iterator();
                    while (it4.hasNext()) {
                        androidx.work.impl.model.WorkSpec.IdAndState next2 = it4.next();
                        java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it5 = it4;
                        if (next2.state != androidx.work.WorkInfo.State.ENQUEUED && next2.state != androidx.work.WorkInfo.State.RUNNING) {
                            it4 = it5;
                        }
                        z5 = false;
                    }
                }
                androidx.work.impl.utils.CancelWorkRunnable.forNameInline(name2, workManagerImpl);
                androidx.work.impl.model.WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
                java.util.Iterator<androidx.work.impl.model.WorkSpec.IdAndState> it6 = workSpecIdAndStatesForName.iterator();
                while (it6.hasNext()) {
                    workSpecDao2.delete(it6.next().id);
                }
                z4 = isEmpty;
                z5 = true;
                while (r2.hasNext()) {
                }
                workContinuationImpl.markEnqueued();
                return z5;
            }
        }
        z4 = isEmpty;
        z5 = false;
        while (r2.hasNext()) {
        }
        workContinuationImpl.markEnqueued();
        return z5;
    }
}
