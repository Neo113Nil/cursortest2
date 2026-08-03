package androidx.work;

/* compiled from: WorkRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/work/WorkRequest;", "", "id", "Ljava/util/UUID;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "tags", "", "", "(Ljava/util/UUID;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)V", "getId", "()Ljava/util/UUID;", "stringId", "getStringId", "()Ljava/lang/String;", "getTags", "()Ljava/util/Set;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final java.util.UUID id;
    private final java.util.Set<java.lang.String> tags;
    private final androidx.work.impl.model.WorkSpec workSpec;

    public WorkRequest(java.util.UUID id, androidx.work.impl.model.WorkSpec workSpec, java.util.Set<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    public java.util.UUID getId() {
        return this.id;
    }

    public final androidx.work.impl.model.WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.tags;
    }

    public final java.lang.String getStringId() {
        java.lang.String uuid = getId().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    /* compiled from: WorkRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0017\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0017¢\u0006\u0002\u0010'J\u000b\u0010(\u001a\u00028\u0001¢\u0006\u0002\u0010)J\u000f\u0010*\u001a\u00028\u0001H ¢\u0006\u0004\b+\u0010)J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J\u001b\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u0002002\u0006\u00101\u001a\u000202¢\u0006\u0002\u00103J\u001d\u00104\u001a\u00028\u00002\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u00107J#\u00104\u001a\u00028\u00002\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u000202¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020<¢\u0006\u0002\u0010=J\u0015\u0010>\u001a\u00028\u00002\u0006\u0010?\u001a\u00020@H\u0017¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010CJ\u0015\u0010D\u001a\u00028\u00002\u0006\u0010-\u001a\u00020.H\u0017¢\u0006\u0002\u0010/J\u001d\u0010D\u001a\u00028\u00002\u0006\u0010-\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016¢\u0006\u0002\u00103J\u0015\u0010E\u001a\u00028\u00002\u0006\u0010F\u001a\u00020GH\u0007¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00020KH\u0007¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00028\u00002\u0006\u0010N\u001a\u00020O¢\u0006\u0002\u0010PJ\u001d\u0010Q\u001a\u00028\u00002\u0006\u0010R\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00103J\u001d\u0010S\u001a\u00028\u00002\u0006\u0010T\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00103R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00028\u0000X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006U"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "Landroidx/work/WorkRequest;", "", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "(Ljava/lang/Class;)V", "backoffCriteriaSet", "", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "id", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "tags", "", "", "getTags$work_runtime_release", "()Ljava/util/Set;", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec$work_runtime_release", "()Landroidx/work/impl/model/WorkSpec;", "setWorkSpec$work_runtime_release", "(Landroidx/work/impl/model/WorkSpec;)V", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "addTag", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal", "buildInternal$work_runtime_release", "keepResultsForAtLeast", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "setBackoffCriteria", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "(Landroidx/work/BackoffPolicy;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "backoffDelay", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "setConstraints", "constraints", "Landroidx/work/Constraints;", "(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;", "setExpedited", "policy", "Landroidx/work/OutOfQuotaPolicy;", "(Landroidx/work/OutOfQuotaPolicy;)Landroidx/work/WorkRequest$Builder;", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "setInitialRunAttemptCount", "runAttemptCount", "", "(I)Landroidx/work/WorkRequest$Builder;", "setInitialState", "state", "Landroidx/work/WorkInfo$State;", "(Landroidx/work/WorkInfo$State;)Landroidx/work/WorkRequest$Builder;", "setInputData", "inputData", "Landroidx/work/Data;", "(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;", "setLastEnqueueTime", "periodStartTime", "setScheduleRequestedAt", "scheduleRequestedAt", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Builder<B extends androidx.work.WorkRequest.Builder<B, ?>, W extends androidx.work.WorkRequest> {
        private boolean backoffCriteriaSet;
        private java.util.UUID id;
        private final java.util.Set<java.lang.String> tags;
        private androidx.work.impl.model.WorkSpec workSpec;
        private final java.lang.Class<? extends androidx.work.ListenableWorker> workerClass;

        public abstract W buildInternal$work_runtime_release();

        public abstract B getThisObject$work_runtime_release();

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> workerClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.workerClass = workerClass;
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.id = randomUUID;
            java.lang.String uuid = this.id.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            java.lang.String name = workerClass.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.workSpec = new androidx.work.impl.model.WorkSpec(uuid, name);
            java.lang.String name2 = workerClass.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.tags = kotlin.collections.SetsKt.mutableSetOf(name2);
        }

        public final java.lang.Class<? extends androidx.work.ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        /* renamed from: getBackoffCriteriaSet$work_runtime_release, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        /* renamed from: getId$work_runtime_release, reason: from getter */
        public final java.util.UUID getId() {
            return this.id;
        }

        public final void setId$work_runtime_release(java.util.UUID uuid) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.id = uuid;
        }

        /* renamed from: getWorkSpec$work_runtime_release, reason: from getter */
        public final androidx.work.impl.model.WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final void setWorkSpec$work_runtime_release(androidx.work.impl.model.WorkSpec workSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        public final java.util.Set<java.lang.String> getTags$work_runtime_release() {
            return this.tags;
        }

        public final B setId(java.util.UUID id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            java.lang.String uuid = id.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.workSpec = new androidx.work.impl.model.WorkSpec(uuid, this.workSpec);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, long backoffDelay, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(timeUnit.toMillis(backoffDelay));
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        public final B setConstraints(androidx.work.Constraints constraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(androidx.work.Data inputData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.workSpec.input = inputData;
            return getThisObject$work_runtime_release();
        }

        public final B addTag(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            this.tags.add(tag);
            return getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(duration);
            return getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.minimumRetentionDuration = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.initialDelay = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return getThisObject$work_runtime_release();
        }

        public B setExpedited(androidx.work.OutOfQuotaPolicy policy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "policy");
            this.workSpec.expedited = true;
            this.workSpec.outOfQuotaPolicy = policy;
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            androidx.work.Constraints constraints = this.workSpec.constraints;
            boolean z = (android.os.Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers()) || constraints.getRequiresBatteryNotLow() || constraints.getRequiresCharging() || (android.os.Build.VERSION.SDK_INT >= 23 && constraints.getRequiresDeviceIdle());
            if (this.workSpec.expedited) {
                if (!(!z)) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (this.workSpec.initialDelay > 0) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            setId(randomUUID);
            return buildInternal$work_runtime_release;
        }

        public final B setInitialState(androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            this.workSpec.state = state;
            return getThisObject$work_runtime_release();
        }

        public final B setInitialRunAttemptCount(int runAttemptCount) {
            this.workSpec.runAttemptCount = runAttemptCount;
            return getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long periodStartTime, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(periodStartTime);
            return getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long scheduleRequestedAt, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(scheduleRequestedAt);
            return getThisObject$work_runtime_release();
        }
    }
}
