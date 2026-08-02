package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "Landroidx/work/WorkRequest;", "Landroidx/work/PeriodicWorkRequest$Builder;", "builder", "<init>", "(Landroidx/work/PeriodicWorkRequest$Builder;)V", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PeriodicWorkRequest extends androidx.work.WorkRequest {
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(androidx.work.PeriodicWorkRequest.Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB!\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fB!\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010B;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0013B9\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0014B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0015B)\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00008QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/PeriodicWorkRequest;", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;Ljava/time/Duration;)V", "nextScheduleTimeOverrideMillis", "setNextScheduleTimeOverride", "(J)Landroidx/work/PeriodicWorkRequest$Builder;", "clearNextScheduleTimeOverride", "()Landroidx/work/PeriodicWorkRequest$Builder;", "buildInternal$work_runtime_release", "()Landroidx/work/PeriodicWorkRequest;", "getThisObject$work_runtime_release", "thisObject"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.PeriodicWorkRequest.Builder, androidx.work.PeriodicWorkRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public final androidx.work.PeriodicWorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls, long j, java.util.concurrent.TimeUnit timeUnit) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(kotlin.reflect.KClass<? extends androidx.work.ListenableWorker> kClass, long j, java.util.concurrent.TimeUnit timeUnit) {
            super(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls, java.time.Duration duration) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(kotlin.reflect.KClass<? extends androidx.work.ListenableWorker> kClass, java.time.Duration duration) {
            super(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls, long j, java.util.concurrent.TimeUnit timeUnit, long j2, java.util.concurrent.TimeUnit timeUnit2) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit2, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(kotlin.reflect.KClass<? extends androidx.work.ListenableWorker> kClass, long j, java.util.concurrent.TimeUnit timeUnit, long j2, java.util.concurrent.TimeUnit timeUnit2) {
            super(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit2, "");
            getWorkSpec().setPeriodic(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls, java.time.Duration duration, java.time.Duration duration2) {
            super(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration2, "");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration), androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(kotlin.reflect.KClass<? extends androidx.work.ListenableWorker> kClass, java.time.Duration duration, java.time.Duration duration2) {
            super(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration2, "");
            getWorkSpec().setPeriodic(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration), androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration2));
        }

        public final androidx.work.PeriodicWorkRequest.Builder setNextScheduleTimeOverride(long nextScheduleTimeOverrideMillis) {
            if (nextScheduleTimeOverrideMillis == Long.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time".toString());
            }
            getWorkSpec().setNextScheduleTimeOverride(nextScheduleTimeOverrideMillis);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        public final androidx.work.PeriodicWorkRequest.Builder clearNextScheduleTimeOverride() {
            getWorkSpec().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public final androidx.work.PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getCamera2StreamConfigurationMap()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (getWorkSpec().expedited) {
                throw new java.lang.IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            return new androidx.work.PeriodicWorkRequest(this);
        }
    }
}
