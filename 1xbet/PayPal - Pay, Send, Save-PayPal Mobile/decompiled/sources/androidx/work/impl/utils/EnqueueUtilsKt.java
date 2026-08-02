package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/work/impl/WorkContinuationImpl;", "continuation", "", "checkContentUriTriggerWorkerLimits", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Landroidx/work/impl/WorkContinuationImpl;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "tryDelegateRemoteListenableWorker", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "tryDelegateConstrainedWorkSpec", "", "Landroidx/work/impl/Scheduler;", "schedulers", "wrapWorkSpecIfNeeded", "(Ljava/util/List;Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "", "ARGUMENT_SERVICE_PACKAGE_NAME", "Ljava/lang/String;", "ARGUMENT_SERVICE_CLASS_NAME", "REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME", "ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnqueueUtilsKt {
    public static final java.lang.String ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
    public static final java.lang.String ARGUMENT_SERVICE_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final java.lang.String ARGUMENT_SERVICE_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    public static final java.lang.String REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";

    public static final void checkContentUriTriggerWorkerLimits(androidx.work.impl.WorkDatabase workDatabase, androidx.work.Configuration configuration, androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workContinuationImpl, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(workContinuationImpl);
        int i2 = 0;
        while (!mutableListOf.isEmpty()) {
            androidx.work.impl.WorkContinuationImpl workContinuationImpl2 = (androidx.work.impl.WorkContinuationImpl) kotlin.collections.CollectionsKt.removeLast(mutableListOf);
            java.util.List<? extends androidx.work.WorkRequest> work = workContinuationImpl2.getWork();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(work, "");
            java.util.List<? extends androidx.work.WorkRequest> list = work;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                i = 0;
            } else {
                java.util.Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((androidx.work.WorkRequest) it.next()).getWorkSpec().constraints.hasContentUriTriggers() && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
            java.util.List<androidx.work.impl.WorkContinuationImpl> parents = workContinuationImpl2.getParents();
            if (parents != null) {
                mutableListOf.addAll(parents);
            }
        }
        if (i2 != 0) {
            int countNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
            int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            if (countNonFinishedContentUriTriggerWorkers + i2 <= contentUriTriggerWorkersLimit) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
            sb.append(contentUriTriggerWorkersLimit);
            sb.append(";\nalready enqueued count: ");
            sb.append(countNonFinishedContentUriTriggerWorkers);
            sb.append(";\ncurrent enqueue operation count: ");
            sb.append(i2);
            sb.append(".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static final androidx.work.impl.model.WorkSpec tryDelegateRemoteListenableWorker(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        boolean hasKeyWithValueOfType = workSpec.input.hasKeyWithValueOfType(ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, java.lang.String.class);
        boolean hasKeyWithValueOfType2 = workSpec.input.hasKeyWithValueOfType(ARGUMENT_SERVICE_PACKAGE_NAME, java.lang.String.class);
        boolean hasKeyWithValueOfType3 = workSpec.input.hasKeyWithValueOfType(ARGUMENT_SERVICE_CLASS_NAME, java.lang.String.class);
        if (hasKeyWithValueOfType || !hasKeyWithValueOfType2 || !hasKeyWithValueOfType3) {
            return workSpec;
        }
        return androidx.work.impl.model.WorkSpec.copy$default(workSpec, null, null, REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME, null, new androidx.work.Data.Builder().putAll(workSpec.input).putString(ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, workSpec.workerClassName).build(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final androidx.work.impl.model.WorkSpec tryDelegateConstrainedWorkSpec(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        androidx.work.Constraints constraints = workSpec.constraints;
        java.lang.String str = workSpec.workerClassName;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, androidx.work.impl.workers.ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.getGetHighSpeedVideoFpsRangesFor() && !constraints.getGetHighSpeedVideoFpsRanges()) {
            return workSpec;
        }
        androidx.work.Data build = new androidx.work.Data.Builder().putAll(workSpec.input).putString(androidx.work.impl.workers.ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        java.lang.String name2 = androidx.work.impl.workers.ConstraintTrackingWorker.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return androidx.work.impl.model.WorkSpec.copy$default(workSpec, null, null, name2, null, build, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final androidx.work.impl.model.WorkSpec wrapWorkSpecIfNeeded(java.util.List<? extends androidx.work.impl.Scheduler> list, androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return tryDelegateRemoteListenableWorker(workSpec);
    }
}
