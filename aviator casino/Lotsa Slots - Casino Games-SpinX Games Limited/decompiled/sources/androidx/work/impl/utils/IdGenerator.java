package androidx.work.impl.utils;

/* compiled from: IdGenerator.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/work/impl/utils/IdGenerator;", "", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "(Landroidx/work/impl/WorkDatabase;)V", "nextAlarmManagerId", "", "nextJobSchedulerIdWithRange", "minInclusive", "maxInclusive", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class IdGenerator {
    private final androidx.work.impl.WorkDatabase workDatabase;

    public IdGenerator(androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    public final int nextJobSchedulerIdWithRange(final int minInclusive, final int maxInclusive) {
        java.lang.Object runInTransaction = this.workDatabase.runInTransaction((java.util.concurrent.Callable<java.lang.Object>) new java.util.concurrent.Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Integer nextJobSchedulerIdWithRange$lambda$0;
                nextJobSchedulerIdWithRange$lambda$0 = androidx.work.impl.utils.IdGenerator.nextJobSchedulerIdWithRange$lambda$0(androidx.work.impl.utils.IdGenerator.this, minInclusive, maxInclusive);
                return nextJobSchedulerIdWithRange$lambda$0;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((java.lang.Number) runInTransaction).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer nextJobSchedulerIdWithRange$lambda$0(androidx.work.impl.utils.IdGenerator this$0, int i, int i2) {
        int nextId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        nextId = androidx.work.impl.utils.IdGeneratorKt.nextId(this$0.workDatabase, androidx.work.impl.utils.IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i > nextId || nextId > i2) {
            androidx.work.impl.utils.IdGeneratorKt.updatePreference(this$0.workDatabase, androidx.work.impl.utils.IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i + 1);
        } else {
            i = nextId;
        }
        return java.lang.Integer.valueOf(i);
    }

    public final int nextAlarmManagerId() {
        java.lang.Object runInTransaction = this.workDatabase.runInTransaction((java.util.concurrent.Callable<java.lang.Object>) new java.util.concurrent.Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Integer nextAlarmManagerId$lambda$1;
                nextAlarmManagerId$lambda$1 = androidx.work.impl.utils.IdGenerator.nextAlarmManagerId$lambda$1(androidx.work.impl.utils.IdGenerator.this);
                return nextAlarmManagerId$lambda$1;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((java.lang.Number) runInTransaction).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer nextAlarmManagerId$lambda$1(androidx.work.impl.utils.IdGenerator this$0) {
        int nextId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        nextId = androidx.work.impl.utils.IdGeneratorKt.nextId(this$0.workDatabase, androidx.work.impl.utils.IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY);
        return java.lang.Integer.valueOf(nextId);
    }
}
