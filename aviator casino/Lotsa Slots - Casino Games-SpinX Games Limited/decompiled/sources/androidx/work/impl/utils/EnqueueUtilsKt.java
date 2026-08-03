package androidx.work.impl.utils;

/* compiled from: EnqueueUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001e\u0010\n\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u000b"}, d2 = {"tryDelegateConstrainedWorkSpec", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "usesScheduler", "", "schedulers", "", "Landroidx/work/impl/Scheduler;", "className", "", "wrapInConstraintTrackingWorkerIfNeeded", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class EnqueueUtilsKt {
    public static final androidx.work.impl.model.WorkSpec tryDelegateConstrainedWorkSpec(androidx.work.impl.model.WorkSpec workSpec) {
        androidx.work.impl.model.WorkSpec copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        androidx.work.Constraints constraints = workSpec.constraints;
        java.lang.String str = workSpec.workerClassName;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, androidx.work.impl.workers.ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.getRequiresBatteryNotLow() && !constraints.getRequiresStorageNotLow()) {
            return workSpec;
        }
        androidx.work.Data build = new androidx.work.Data.Builder().putAll(workSpec.input).putString(androidx.work.impl.workers.ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder().putAll(workSpe…ame)\n            .build()");
        java.lang.String name = androidx.work.impl.workers.ConstraintTrackingWorker.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        copy = workSpec.copy((r45 & 1) != 0 ? workSpec.id : null, (r45 & 2) != 0 ? workSpec.state : null, (r45 & 4) != 0 ? workSpec.workerClassName : name, (r45 & 8) != 0 ? workSpec.inputMergerClassName : null, (r45 & 16) != 0 ? workSpec.input : build, (r45 & 32) != 0 ? workSpec.output : null, (r45 & 64) != 0 ? workSpec.initialDelay : 0L, (r45 & 128) != 0 ? workSpec.intervalDuration : 0L, (r45 & 256) != 0 ? workSpec.flexDuration : 0L, (r45 & 512) != 0 ? workSpec.constraints : null, (r45 & 1024) != 0 ? workSpec.runAttemptCount : 0, (r45 & 2048) != 0 ? workSpec.backoffPolicy : null, (r45 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (r45 & 8192) != 0 ? workSpec.lastEnqueueTime : 0L, (r45 & 16384) != 0 ? workSpec.minimumRetentionDuration : 0L, (r45 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (r45 & 65536) != 0 ? workSpec.expedited : false, (131072 & r45) != 0 ? workSpec.outOfQuotaPolicy : null, (r45 & 262144) != 0 ? workSpec.periodCount : 0, (r45 & 524288) != 0 ? workSpec.generation : 0);
        return copy;
    }

    public static final androidx.work.impl.model.WorkSpec wrapInConstraintTrackingWorkerIfNeeded(java.util.List<? extends androidx.work.impl.Scheduler> schedulers, androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        int i = android.os.Build.VERSION.SDK_INT;
        if (23 > i || i >= 26) {
            return (android.os.Build.VERSION.SDK_INT > 22 || !usesScheduler(schedulers, androidx.work.impl.Schedulers.GCM_SCHEDULER)) ? workSpec : tryDelegateConstrainedWorkSpec(workSpec);
        }
        return tryDelegateConstrainedWorkSpec(workSpec);
    }

    private static final boolean usesScheduler(java.util.List<? extends androidx.work.impl.Scheduler> list, java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            java.util.List<? extends androidx.work.impl.Scheduler> list2 = list;
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((androidx.work.impl.Scheduler) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }
}
