package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/work/impl/utils/IdGenerator;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "nextJobSchedulerIdWithRange", "(II)I", "nextAlarmManagerId", "()I", "getHighSpeedVideoFpsRangesFor", "Landroidx/work/impl/WorkDatabase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdGenerator {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.work.impl.WorkDatabase Camera2StreamConfigurationMap;

    public IdGenerator(androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        this.Camera2StreamConfigurationMap = workDatabase;
    }

    public final int nextJobSchedulerIdWithRange(final int minInclusive, final int maxInclusive) {
        java.lang.Object runInTransaction = this.Camera2StreamConfigurationMap.runInTransaction((java.util.concurrent.Callable<java.lang.Object>) new java.util.concurrent.Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.work.impl.utils.IdGenerator.$r8$lambda$JQr7FK7MZ2bSJyfHKiwoJ9vBWDc(androidx.work.impl.utils.IdGenerator.this, minInclusive, maxInclusive);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runInTransaction, "");
        return ((java.lang.Number) runInTransaction).intValue();
    }

    public final int nextAlarmManagerId() {
        java.lang.Object runInTransaction = this.Camera2StreamConfigurationMap.runInTransaction((java.util.concurrent.Callable<java.lang.Object>) new java.util.concurrent.Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(androidx.work.impl.utils.IdGeneratorKt.access$nextId(androidx.work.impl.utils.IdGenerator.this.Camera2StreamConfigurationMap, androidx.work.impl.utils.IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY));
                return valueOf;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runInTransaction, "");
        return ((java.lang.Number) runInTransaction).intValue();
    }

    public static /* synthetic */ java.lang.Integer $r8$lambda$JQr7FK7MZ2bSJyfHKiwoJ9vBWDc(androidx.work.impl.utils.IdGenerator idGenerator, int i, int i2) {
        int access$nextId = androidx.work.impl.utils.IdGeneratorKt.access$nextId(idGenerator.Camera2StreamConfigurationMap, androidx.work.impl.utils.IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i > access$nextId || access$nextId > i2) {
            idGenerator.Camera2StreamConfigurationMap.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(androidx.work.impl.utils.IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, java.lang.Long.valueOf(i + 1)));
        } else {
            i = access$nextId;
        }
        return java.lang.Integer.valueOf(i);
    }
}
