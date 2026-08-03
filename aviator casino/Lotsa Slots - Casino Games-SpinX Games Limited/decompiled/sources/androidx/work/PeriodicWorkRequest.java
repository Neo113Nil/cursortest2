package androidx.work;

/* compiled from: PeriodicWorkRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/PeriodicWorkRequest$Builder;", "(Landroidx/work/PeriodicWorkRequest$Builder;)V", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PeriodicWorkRequest extends androidx.work.WorkRequest {
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(androidx.work.PeriodicWorkRequest.Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
    }

    /* compiled from: PeriodicWorkRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0002\u0010\fB9\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fB)\b\u0017\u0012\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0002\b\u0015R\u0014\u0010\u0011\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/PeriodicWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "repeatInterval", "", "repeatIntervalTimeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/PeriodicWorkRequest$Builder;", "buildInternal", "buildInternal$work_runtime_release", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.PeriodicWorkRequest.Builder, androidx.work.PeriodicWorkRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.PeriodicWorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, long j, java.util.concurrent.TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, java.time.Duration repeatInterval) {
            super(workerClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, long j, java.util.concurrent.TimeUnit repeatIntervalTimeUnit, long j2, java.util.concurrent.TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j), flexIntervalTimeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass, java.time.Duration repeatInterval, java.time.Duration flexInterval) {
            super(workerClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(repeatInterval), androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(flexInterval));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public androidx.work.PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && android.os.Build.VERSION.SDK_INT >= 23 && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!(!getWorkSpec().expedited)) {
                throw new java.lang.IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            return new androidx.work.PeriodicWorkRequest(this);
        }
    }
}
