package androidx.work;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0011\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.WorkRequest.Companion INSTANCE = new androidx.work.WorkRequest.Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final java.util.UUID id;
    private final java.util.Set<java.lang.String> tags;
    private final androidx.work.impl.model.WorkSpec workSpec;

    public WorkRequest(java.util.UUID uuid, androidx.work.impl.model.WorkSpec workSpec, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.id = uuid;
        this.workSpec = workSpec;
        this.tags = set;
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
        java.lang.String obj = getId().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u001d\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010+J\u001f\u0010,\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010(J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00028\u0001¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00028\u0001H ¢\u0006\u0004\b3\u00102J\u0015\u00106\u001a\u00028\u00002\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00028\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00028\u00002\u0006\u0010<\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b=\u0010(J\u001d\u0010?\u001a\u00028\u00002\u0006\u0010>\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b?\u0010(R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u000b\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010W\u001a\b\u0012\u0004\u0012\u00020!0V8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00028\u00008!X \u0004¢\u0006\u0006\u001a\u0004\b[\u0010*"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Landroidx/work/BackoffPolicy;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Constraints;", "constraints", "setConstraints", "(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Data;", "inputData", "setInputData", "(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "traceTag", "setTraceTag", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "setBackoffForSystemInterruptions", "()Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Landroidx/work/OutOfQuotaPolicy;", "policy", "setExpedited", "(Landroidx/work/OutOfQuotaPolicy;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "Landroidx/work/WorkInfo$State;", "state", "setInitialState", "(Landroidx/work/WorkInfo$State;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "lastEnqueueTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec$work_runtime_release", "()Landroidx/work/impl/model/WorkSpec;", "setWorkSpec$work_runtime_release", "(Landroidx/work/impl/model/WorkSpec;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "thisObject"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Builder<B extends androidx.work.WorkRequest.Builder<B, ?>, W extends androidx.work.WorkRequest> {
        private boolean backoffCriteriaSet;
        private java.util.UUID id;
        private final java.util.Set<java.lang.String> tags;
        private androidx.work.impl.model.WorkSpec workSpec;
        private final java.lang.Class<? extends androidx.work.ListenableWorker> workerClass;

        public abstract W buildInternal$work_runtime_release();

        public abstract B getThisObject$work_runtime_release();

        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> cls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            this.workerClass = cls;
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
            this.id = randomUUID;
            java.lang.String obj = randomUUID.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.String name2 = cls.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            this.workSpec = new androidx.work.impl.model.WorkSpec(obj, name2);
            java.lang.String name3 = cls.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            this.tags = kotlin.collections.SetsKt.mutableSetOf(name3);
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
            this.id = uuid;
        }

        /* renamed from: getWorkSpec$work_runtime_release, reason: from getter */
        public final androidx.work.impl.model.WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final void setWorkSpec$work_runtime_release(androidx.work.impl.model.WorkSpec workSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
            this.workSpec = workSpec;
        }

        public final java.util.Set<java.lang.String> getTags$work_runtime_release() {
            return this.tags;
        }

        public final B setId(java.util.UUID id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            this.id = id;
            java.lang.String obj = id.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.workSpec = new androidx.work.impl.model.WorkSpec(obj, this.workSpec);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, long backoffDelay, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(timeUnit.toMillis(backoffDelay));
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(androidx.work.BackoffPolicy backoffPolicy, java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        public final B setConstraints(androidx.work.Constraints constraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
            this.workSpec.constraints = constraints;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(androidx.work.Data inputData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputData, "");
            this.workSpec.input = inputData;
            return getThisObject$work_runtime_release();
        }

        public final B addTag(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            this.tags.add(tag);
            return getThisObject$work_runtime_release();
        }

        public final B setTraceTag(java.lang.String traceTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceTag, "");
            this.workSpec.setTraceTag(traceTag);
            return getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(duration);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffForSystemInterruptions() {
            this.workSpec.setBackOffOnSystemInterruptions(java.lang.Boolean.TRUE);
            return getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            this.workSpec.minimumRetentionDuration = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            this.workSpec.initialDelay = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return getThisObject$work_runtime_release();
        }

        public B setExpedited(androidx.work.OutOfQuotaPolicy policy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "");
            this.workSpec.expedited = true;
            this.workSpec.outOfQuotaPolicy = policy;
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            androidx.work.Constraints constraints = this.workSpec.constraints;
            boolean z = constraints.hasContentUriTriggers() || constraints.getGetHighSpeedVideoFpsRangesFor() || constraints.getGetHighSpeedVideoSizes() || constraints.getCamera2StreamConfigurationMap();
            if (this.workSpec.expedited) {
                if (z) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (this.workSpec.initialDelay > 0) {
                    throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            java.lang.String traceTag = this.workSpec.getTraceTag();
            if (traceTag == null) {
                this.workSpec.setTraceTag(androidx.work.WorkRequest.Companion.access$deriveTraceTagFromClassName(androidx.work.WorkRequest.INSTANCE, this.workSpec.workerClassName));
            } else if (traceTag.length() > 127) {
                this.workSpec.setTraceTag(kotlin.text.StringsKt.take(traceTag, 127));
            }
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
            setId(randomUUID);
            return buildInternal$work_runtime_release;
        }

        public final B setInitialState(androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            this.workSpec.state = state;
            return getThisObject$work_runtime_release();
        }

        public final B setInitialRunAttemptCount(int runAttemptCount) {
            this.workSpec.runAttemptCount = runAttemptCount;
            return getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long lastEnqueueTime, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(lastEnqueueTime);
            return getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long scheduleRequestedAt, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(scheduleRequestedAt);
            return getThisObject$work_runtime_release();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/work/WorkRequest$Companion;", "", "<init>", "()V", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.String access$deriveTraceTagFromClassName(androidx.work.WorkRequest.Companion companion, java.lang.String str) {
            java.lang.String str2;
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() == 1) {
                str2 = (java.lang.String) split$default.get(0);
            } else {
                str2 = (java.lang.String) kotlin.collections.CollectionsKt.last(split$default);
            }
            return str2.length() <= 127 ? str2 : kotlin.text.StringsKt.take(str2, 127);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
