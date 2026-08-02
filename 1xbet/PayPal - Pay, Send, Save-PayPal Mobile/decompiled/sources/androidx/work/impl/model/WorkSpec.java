package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\bM\b\u0086\b\u0018\u0000 v2\u00020\u0001:\u0003wxvB\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u001d\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00105J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00105J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0010\u0010>\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b>\u00101J\u0010\u0010?\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b?\u00101J\u0010\u0010@\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b@\u00101J\u0010\u0010A\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bG\u00101J\u0010\u0010H\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bH\u00101J\u0010\u0010I\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bI\u00101J\u0010\u0010J\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bJ\u00101J\u0010\u0010K\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bK\u00103J\u0010\u0010L\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bN\u0010DJ\u0010\u0010O\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bO\u0010DJ\u0010\u0010P\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bP\u00101J\u0010\u0010Q\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bQ\u0010DJ\u0010\u0010R\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bR\u0010DJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00105J\u0012\u0010T\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u008e\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u001a\u0010X\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bZ\u0010DR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010[R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010[R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\t\u0010]R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\n\u0010]R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\f\u0010^R\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010`R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010aR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010^R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010^R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010^R\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010cR\"\u0010\u001d\u001a\u00020\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010`\u001a\u0004\bd\u0010D\"\u0004\be\u0010fR\u001a\u0010\u001e\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010`\u001a\u0004\bg\u0010DR\"\u0010\u001f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010^\u001a\u0004\bh\u00101\"\u0004\bi\u0010-R\"\u0010 \u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010`\u001a\u0004\bj\u0010D\"\u0004\bk\u0010fR\u001a\u0010!\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010`\u001a\u0004\bl\u0010DR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010[\u001a\u0004\bm\u00105\"\u0004\bn\u0010oR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010p\u001a\u0004\bq\u0010U\"\u0004\br\u0010sR\u0011\u0010t\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bt\u00103R\u0011\u0010u\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bu\u00103"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/Data;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/OutOfQuotaPolicy;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "", "setBackoffDelayDuration", "(J)V", "setPeriodic", "(JJ)V", "calculateNextRunTime", "()J", "hasConstraints", "()Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "component4", "component5", "()Landroidx/work/Data;", "component6", "component7", "component8", "component9", "component10", "()Landroidx/work/Constraints;", "component11", "()I", "component12", "()Landroidx/work/BackoffPolicy;", "component13", "component14", "component15", "component16", "component17", "component18", "()Landroidx/work/OutOfQuotaPolicy;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;Ljava/lang/Boolean;)Landroidx/work/impl/model/WorkSpec;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", "Landroidx/work/Data;", "J", "Landroidx/work/Constraints;", com.visa.cbp.getEncExpo.warmup, "Landroidx/work/BackoffPolicy;", "Z", "Landroidx/work/OutOfQuotaPolicy;", "getPeriodCount", "setPeriodCount", "(I)V", "getGeneration", "getNextScheduleTimeOverride", "setNextScheduleTimeOverride", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "getStopReason", "getTraceTag", "setTraceTag", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getBackOffOnSystemInterruptions", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "Companion", "IdAndState", "WorkInfoPojo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WorkSpec {
    private static final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.WorkSpec.Companion INSTANCE = new androidx.work.impl.model.WorkSpec.Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    public static final androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> WORK_INFO_MAPPER;
    private java.lang.Boolean backOffOnSystemInterruptions;
    public long backoffDelayDuration;
    public androidx.work.BackoffPolicy backoffPolicy;
    public androidx.work.Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final java.lang.String id;
    public long initialDelay;
    public androidx.work.Data input;
    public java.lang.String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    private long nextScheduleTimeOverride;
    private int nextScheduleTimeOverrideGeneration;
    public androidx.work.OutOfQuotaPolicy outOfQuotaPolicy;
    public androidx.work.Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public androidx.work.WorkInfo.State state;
    private final int stopReason;
    private java.lang.String traceTag;
    public java.lang.String workerClassName;

    public WorkSpec(java.lang.String str, androidx.work.WorkInfo.State state, java.lang.String str2, java.lang.String str3, androidx.work.Data data, androidx.work.Data data2, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, java.lang.String str4, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "");
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i2;
        this.generation = i3;
        this.nextScheduleTimeOverride = j8;
        this.nextScheduleTimeOverrideGeneration = i4;
        this.stopReason = i5;
        this.traceTag = str4;
        this.backOffOnSystemInterruptions = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WorkSpec(java.lang.String str, androidx.work.WorkInfo.State state, java.lang.String str2, java.lang.String str3, androidx.work.Data data, androidx.work.Data data2, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, java.lang.String str4, java.lang.Boolean bool, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, str2, r6, (i6 & 16) != 0 ? androidx.work.Data.EMPTY : data, (i6 & 32) != 0 ? androidx.work.Data.EMPTY : data2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? androidx.work.Constraints.NONE : constraints, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? androidx.work.BackoffPolicy.EXPONENTIAL : backoffPolicy, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & 16777216) != 0 ? java.lang.Boolean.FALSE : bool);
        java.lang.String str5;
        androidx.work.WorkInfo.State state2 = (i6 & 2) != 0 ? androidx.work.WorkInfo.State.ENQUEUED : state;
        if ((i6 & 8) != 0) {
            java.lang.String name2 = androidx.work.OverwritingInputMerger.class.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            str5 = name2;
        } else {
            str5 = str3;
        }
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final void setNextScheduleTimeOverride(long j) {
        this.nextScheduleTimeOverride = j;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final java.lang.String getTraceTag() {
        return this.traceTag;
    }

    public final void setTraceTag(java.lang.String str) {
        this.traceTag = str;
    }

    public final java.lang.Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    public final void setBackOffOnSystemInterruptions(java.lang.Boolean bool) {
        this.backOffOnSystemInterruptions = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(java.lang.String str, java.lang.String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(java.lang.String str, androidx.work.impl.model.WorkSpec workSpec) {
        this(str, workSpec.state, workSpec.workerClassName, workSpec.inputMergerClassName, new androidx.work.Data(workSpec.input), new androidx.work.Data(workSpec.output), workSpec.initialDelay, workSpec.intervalDuration, workSpec.flexDuration, new androidx.work.Constraints(workSpec.constraints), workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, workSpec.nextScheduleTimeOverride, workSpec.nextScheduleTimeOverrideGeneration, workSpec.stopReason, workSpec.traceTag, workSpec.backOffOnSystemInterruptions, 524288, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
    }

    public final void setBackoffDelayDuration(long backoffDelayDuration) {
        if (backoffDelayDuration > androidx.work.WorkRequest.MAX_BACKOFF_MILLIS) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = kotlin.ranges.RangesKt.coerceIn(backoffDelayDuration, 10000L, androidx.work.WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final boolean isBackedOff() {
        return this.state == androidx.work.WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final void setPeriodic(long intervalDuration) {
        if (intervalDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long intervalDuration, long flexDuration) {
        if (intervalDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (flexDuration < 300000) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            androidx.work.Logger.get().warning(Camera2StreamConfigurationMap, "Flex duration greater than interval duration; Changed to ".concat(java.lang.String.valueOf(intervalDuration)));
        }
        this.flexDuration = kotlin.ranges.RangesKt.coerceIn(flexDuration, 300000L, this.intervalDuration);
    }

    public final long calculateNextRunTime() {
        return INSTANCE.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final boolean hasConstraints() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(androidx.work.Constraints.NONE, this.constraints);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{WorkSpec: ");
        sb.append(this.id);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/work/WorkInfo$State;", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)Landroidx/work/impl/model/WorkSpec$IdAndState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdAndState {
        public java.lang.String id;
        public androidx.work.WorkInfo.State state;

        public IdAndState(java.lang.String str, androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            this.id = str;
            this.state = state;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IdAndState(id=");
            sb.append(this.id);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.work.impl.model.WorkSpec.IdAndState)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.IdAndState idAndState = (androidx.work.impl.model.WorkSpec.IdAndState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public final androidx.work.impl.model.WorkSpec.IdAndState copy(java.lang.String id, androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new androidx.work.impl.model.WorkSpec.IdAndState(id, state);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ androidx.work.impl.model.WorkSpec.IdAndState copy$default(androidx.work.impl.model.WorkSpec.IdAndState idAndState, java.lang.String str, androidx.work.WorkInfo.State state, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010'J\u0010\u00105\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018HÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÆ\u0003¢\u0006\u0004\b8\u00107JÆ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÆ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b?\u0010-J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010'R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u0010'R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bJ\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010+R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010-R\"\u0010\u0011\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010/\"\u0004\bQ\u0010RR\"\u0010\u0012\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010G\u001a\u0004\bS\u0010'\"\u0004\bT\u0010UR\"\u0010\u0013\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010G\u001a\u0004\bV\u0010'\"\u0004\bW\u0010UR\"\u0010\u0014\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010M\u001a\u0004\bX\u0010-\"\u0004\bY\u0010ZR\u001a\u0010\u0015\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\b[\u0010-R\u001a\u0010\u0016\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\b\\\u0010'R\u001a\u0010\u0017\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\b]\u0010-R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\b_\u00107R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\b`\u00107R\u0011\u0010a\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010c\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\bc\u0010b"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "Landroidx/work/Data;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/WorkInfo;", "toWorkInfo", "()Landroidx/work/WorkInfo;", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "()Landroidx/work/Data;", "component4", "()J", "component5", "component6", "component7", "()Landroidx/work/Constraints;", "component8", "()I", "component9", "()Landroidx/work/BackoffPolicy;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/util/List;", "component17", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "Landroidx/work/WorkInfo$State;", "getState", "Landroidx/work/Data;", "getOutput", "J", "getInitialDelay", "getIntervalDuration", "getFlexDuration", "Landroidx/work/Constraints;", "getConstraints", com.visa.cbp.getEncExpo.warmup, "getRunAttemptCount", "Landroidx/work/BackoffPolicy;", "getBackoffPolicy", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "getLastEnqueueTime", "setLastEnqueueTime", "getPeriodCount", "setPeriodCount", "(I)V", "getGeneration", "getNextScheduleTimeOverride", "getStopReason", "Ljava/util/List;", "getTags", "getProgress", "isPeriodic", "()Z", "isBackedOff"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class WorkInfoPojo {
        private long backoffDelayDuration;
        private androidx.work.BackoffPolicy backoffPolicy;
        private final androidx.work.Constraints constraints;
        private final long flexDuration;
        private final int generation;
        private final java.lang.String id;
        private final long initialDelay;
        private final long intervalDuration;
        private long lastEnqueueTime;
        private final long nextScheduleTimeOverride;
        private final androidx.work.Data output;
        private int periodCount;
        private final java.util.List<androidx.work.Data> progress;
        private final int runAttemptCount;
        private final androidx.work.WorkInfo.State state;
        private final int stopReason;
        private final java.util.List<java.lang.String> tags;

        public WorkInfoPojo(java.lang.String str, androidx.work.WorkInfo.State state, androidx.work.Data data, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, java.util.List<java.lang.String> list, java.util.List<androidx.work.Data> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.id = str;
            this.state = state;
            this.output = data;
            this.initialDelay = j;
            this.intervalDuration = j2;
            this.flexDuration = j3;
            this.constraints = constraints;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j4;
            this.lastEnqueueTime = j5;
            this.periodCount = i2;
            this.generation = i3;
            this.nextScheduleTimeOverride = j6;
            this.stopReason = i4;
            this.tags = list;
            this.progress = list2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        public final androidx.work.Data getOutput() {
            return this.output;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final androidx.work.Constraints getConstraints() {
            return this.constraints;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final androidx.work.BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final void setBackoffPolicy(androidx.work.BackoffPolicy backoffPolicy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            this.backoffPolicy = backoffPolicy;
        }

        public /* synthetic */ WorkInfoPojo(java.lang.String str, androidx.work.WorkInfo.State state, androidx.work.Data data, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, java.util.List list, java.util.List list2, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, state, data, (i5 & 8) != 0 ? 0L : j, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? 0L : j3, constraints, i, (i5 & 256) != 0 ? androidx.work.BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 512) != 0 ? 30000L : j4, (i5 & 1024) != 0 ? 0L : j5, (i5 & 2048) != 0 ? 0 : i2, i3, j6, i4, list, list2);
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final void setBackoffDelayDuration(long j) {
            this.backoffDelayDuration = j;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final void setLastEnqueueTime(long j) {
            this.lastEnqueueTime = j;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final void setPeriodCount(int i) {
            this.periodCount = i;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        public final java.util.List<androidx.work.Data> getProgress() {
            return this.progress;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final boolean isBackedOff() {
            return this.state == androidx.work.WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final androidx.work.WorkInfo toWorkInfo() {
            long j;
            androidx.work.WorkInfo.PeriodicityInfo periodicityInfo;
            androidx.work.Data data = !this.progress.isEmpty() ? this.progress.get(0) : androidx.work.Data.EMPTY;
            java.util.UUID fromString = java.util.UUID.fromString(this.id);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "");
            androidx.work.WorkInfo.State state = this.state;
            java.util.HashSet hashSet = new java.util.HashSet(this.tags);
            androidx.work.Data data2 = this.output;
            int i = this.runAttemptCount;
            int i2 = this.generation;
            androidx.work.Constraints constraints = this.constraints;
            long j2 = this.initialDelay;
            if (this.intervalDuration != 0) {
                j = j2;
                periodicityInfo = new androidx.work.WorkInfo.PeriodicityInfo(this.intervalDuration, this.flexDuration);
            } else {
                j = j2;
                periodicityInfo = null;
            }
            return new androidx.work.WorkInfo(fromString, state, hashSet, data2, data, i, i2, constraints, j, periodicityInfo, this.state == androidx.work.WorkInfo.State.ENQUEUED ? androidx.work.impl.model.WorkSpec.INSTANCE.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride) : Long.MAX_VALUE, this.stopReason);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkInfoPojo(id=");
            sb.append(this.id);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", output=");
            sb.append(this.output);
            sb.append(", initialDelay=");
            sb.append(this.initialDelay);
            sb.append(", intervalDuration=");
            sb.append(this.intervalDuration);
            sb.append(", flexDuration=");
            sb.append(this.flexDuration);
            sb.append(", constraints=");
            sb.append(this.constraints);
            sb.append(", runAttemptCount=");
            sb.append(this.runAttemptCount);
            sb.append(", backoffPolicy=");
            sb.append(this.backoffPolicy);
            sb.append(", backoffDelayDuration=");
            sb.append(this.backoffDelayDuration);
            sb.append(", lastEnqueueTime=");
            sb.append(this.lastEnqueueTime);
            sb.append(", periodCount=");
            sb.append(this.periodCount);
            sb.append(", generation=");
            sb.append(this.generation);
            sb.append(", nextScheduleTimeOverride=");
            sb.append(this.nextScheduleTimeOverride);
            sb.append(", stopReason=");
            sb.append(this.stopReason);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + java.lang.Long.hashCode(this.initialDelay)) * 31) + java.lang.Long.hashCode(this.intervalDuration)) * 31) + java.lang.Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + java.lang.Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + java.lang.Long.hashCode(this.backoffDelayDuration)) * 31) + java.lang.Long.hashCode(this.lastEnqueueTime)) * 31) + java.lang.Integer.hashCode(this.periodCount)) * 31) + java.lang.Integer.hashCode(this.generation)) * 31) + java.lang.Long.hashCode(this.nextScheduleTimeOverride)) * 31) + java.lang.Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.work.impl.model.WorkSpec.WorkInfoPojo)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && kotlin.jvm.internal.Intrinsics.areEqual(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && kotlin.jvm.internal.Intrinsics.areEqual(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, workInfoPojo.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public final androidx.work.impl.model.WorkSpec.WorkInfoPojo copy(java.lang.String id, androidx.work.WorkInfo.State state, androidx.work.Data output, long initialDelay, long intervalDuration, long flexDuration, androidx.work.Constraints constraints, int runAttemptCount, androidx.work.BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, int generation, long nextScheduleTimeOverride, int stopReason, java.util.List<java.lang.String> tags, java.util.List<androidx.work.Data> progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
            return new androidx.work.impl.model.WorkSpec.WorkInfoPojo(id, state, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, periodCount, generation, nextScheduleTimeOverride, stopReason, tags, progress);
        }

        /* renamed from: component9, reason: from getter */
        public final androidx.work.BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        /* renamed from: component8, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* renamed from: component7, reason: from getter */
        public final androidx.work.Constraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component6, reason: from getter */
        public final long getFlexDuration() {
            return this.flexDuration;
        }

        /* renamed from: component5, reason: from getter */
        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        /* renamed from: component4, reason: from getter */
        public final long getInitialDelay() {
            return this.initialDelay;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.work.Data getOutput() {
            return this.output;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        public final java.util.List<androidx.work.Data> component17() {
            return this.progress;
        }

        public final java.util.List<java.lang.String> component16() {
            return this.tags;
        }

        /* renamed from: component15, reason: from getter */
        public final int getStopReason() {
            return this.stopReason;
        }

        /* renamed from: component14, reason: from getter */
        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        /* renamed from: component13, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        /* renamed from: component12, reason: from getter */
        public final int getPeriodCount() {
            return this.periodCount;
        }

        /* renamed from: component11, reason: from getter */
        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        /* renamed from: component10, reason: from getter */
        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\u00070\u0015¢\u0006\u0002\b\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR)\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0\u001b8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "calculateNextRunTime", "(ZILandroidx/work/BackoffPolicy;JJIZJJJJ)J", "", "Lorg/jspecify/annotations/NonNull;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "SCHEDULE_NOT_REQUESTED_YET", "J", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long calculateNextRunTime(boolean isBackedOff, int runAttemptCount, androidx.work.BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : kotlin.ranges.RangesKt.coerceAtLeast(nextScheduleTimeOverride, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + lastEnqueueTime);
            }
            if (isBackedOff) {
                return kotlin.ranges.RangesKt.coerceAtMost(backoffPolicy == androidx.work.BackoffPolicy.LINEAR ? runAttemptCount * backoffDelayDuration : (long) java.lang.Math.scalb(backoffDelayDuration, runAttemptCount - 1), androidx.work.WorkRequest.MAX_BACKOFF_MILLIS) + lastEnqueueTime;
            }
            if (isPeriodic) {
                long j = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                return (flexDuration == intervalDuration || periodCount != 0) ? j : j + (intervalDuration - flexDuration);
            }
            if (lastEnqueueTime == -1) {
                return Long.MAX_VALUE;
            }
            return lastEnqueueTime + initialDelay;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WorkSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        Camera2StreamConfigurationMap = tagWithPrefix;
        WORK_INFO_MAPPER = new androidx.arch.core.util.Function() { // from class: androidx.work.impl.model.WorkSpec$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.work.impl.model.WorkSpec.$r8$lambda$kxU3gfKzoZdfGv8GSpkPecoJFFM((java.util.List) obj);
            }
        };
    }

    public static /* synthetic */ java.util.List $r8$lambda$kxU3gfKzoZdfGv8GSpkPecoJFFM(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.work.impl.model.WorkSpec.WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.state.hashCode();
        int hashCode3 = this.workerClassName.hashCode();
        int hashCode4 = this.inputMergerClassName.hashCode();
        int hashCode5 = this.input.hashCode();
        int hashCode6 = this.output.hashCode();
        int hashCode7 = java.lang.Long.hashCode(this.initialDelay);
        int hashCode8 = java.lang.Long.hashCode(this.intervalDuration);
        int hashCode9 = java.lang.Long.hashCode(this.flexDuration);
        int hashCode10 = this.constraints.hashCode();
        int hashCode11 = java.lang.Integer.hashCode(this.runAttemptCount);
        int hashCode12 = this.backoffPolicy.hashCode();
        int hashCode13 = java.lang.Long.hashCode(this.backoffDelayDuration);
        int hashCode14 = java.lang.Long.hashCode(this.lastEnqueueTime);
        int hashCode15 = java.lang.Long.hashCode(this.minimumRetentionDuration);
        int hashCode16 = java.lang.Long.hashCode(this.scheduleRequestedAt);
        int hashCode17 = java.lang.Boolean.hashCode(this.expedited);
        int hashCode18 = this.outOfQuotaPolicy.hashCode();
        int hashCode19 = java.lang.Integer.hashCode(this.periodCount);
        int hashCode20 = java.lang.Integer.hashCode(this.generation);
        int hashCode21 = java.lang.Long.hashCode(this.nextScheduleTimeOverride);
        int hashCode22 = java.lang.Integer.hashCode(this.nextScheduleTimeOverrideGeneration);
        int hashCode23 = java.lang.Integer.hashCode(this.stopReason);
        java.lang.String str = this.traceTag;
        int hashCode24 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.backOffOnSystemInterruptions;
        return (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.work.impl.model.WorkSpec)) {
            return false;
        }
        androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && kotlin.jvm.internal.Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, workSpec.input) && kotlin.jvm.internal.Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && kotlin.jvm.internal.Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && kotlin.jvm.internal.Intrinsics.areEqual(this.traceTag, workSpec.traceTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.backOffOnSystemInterruptions, workSpec.backOffOnSystemInterruptions);
    }

    public final androidx.work.impl.model.WorkSpec copy(java.lang.String id, androidx.work.WorkInfo.State state, java.lang.String workerClassName, java.lang.String inputMergerClassName, androidx.work.Data input, androidx.work.Data output, long initialDelay, long intervalDuration, long flexDuration, androidx.work.Constraints constraints, int runAttemptCount, androidx.work.BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, java.lang.String traceTag, java.lang.Boolean backOffOnSystemInterruptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMergerClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "");
        return new androidx.work.impl.model.WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
    }

    /* renamed from: component9, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    /* renamed from: component8, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* renamed from: component6, reason: from getter */
    public final androidx.work.Data getOutput() {
        return this.output;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.work.Data getInput() {
        return this.input;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getWorkerClassName() {
        return this.workerClassName;
    }

    /* renamed from: component25, reason: from getter */
    public final java.lang.Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    /* renamed from: component24, reason: from getter */
    public final java.lang.String getTraceTag() {
        return this.traceTag;
    }

    /* renamed from: component23, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* renamed from: component22, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* renamed from: component21, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* renamed from: component20, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.work.WorkInfo.State getState() {
        return this.state;
    }

    /* renamed from: component19, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: component18, reason: from getter */
    public final androidx.work.OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    /* renamed from: component16, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* renamed from: component15, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* renamed from: component14, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* renamed from: component13, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* renamed from: component12, reason: from getter */
    public final androidx.work.BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* renamed from: component11, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    /* renamed from: component10, reason: from getter */
    public final androidx.work.Constraints getConstraints() {
        return this.constraints;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ androidx.work.impl.model.WorkSpec copy$default(androidx.work.impl.model.WorkSpec workSpec, java.lang.String str, androidx.work.WorkInfo.State state, java.lang.String str2, java.lang.String str3, androidx.work.Data data, androidx.work.Data data2, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, java.lang.String str4, java.lang.Boolean bool, int i6, java.lang.Object obj) {
        java.lang.String str5 = (i6 & 1) != 0 ? workSpec.id : str;
        androidx.work.WorkInfo.State state2 = (i6 & 2) != 0 ? workSpec.state : state;
        java.lang.String str6 = (i6 & 4) != 0 ? workSpec.workerClassName : str2;
        java.lang.String str7 = (i6 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        androidx.work.Data data3 = (i6 & 16) != 0 ? workSpec.input : data;
        androidx.work.Data data4 = (i6 & 32) != 0 ? workSpec.output : data2;
        long j9 = (i6 & 64) != 0 ? workSpec.initialDelay : j;
        long j10 = (i6 & 128) != 0 ? workSpec.intervalDuration : j2;
        long j11 = (i6 & 256) != 0 ? workSpec.flexDuration : j3;
        androidx.work.Constraints constraints2 = (i6 & 512) != 0 ? workSpec.constraints : constraints;
        return workSpec.copy(str5, state2, str6, str7, data3, data4, j9, j10, j11, constraints2, (i6 & 1024) != 0 ? workSpec.runAttemptCount : i, (i6 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy, (i6 & 4096) != 0 ? workSpec.backoffDelayDuration : j4, (i6 & 8192) != 0 ? workSpec.lastEnqueueTime : j5, (i6 & 16384) != 0 ? workSpec.minimumRetentionDuration : j6, (i6 & 32768) != 0 ? workSpec.scheduleRequestedAt : j7, (i6 & 65536) != 0 ? workSpec.expedited : z, (131072 & i6) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy, (i6 & 262144) != 0 ? workSpec.periodCount : i2, (i6 & 524288) != 0 ? workSpec.generation : i3, (i6 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j8, (i6 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i4, (4194304 & i6) != 0 ? workSpec.stopReason : i5, (i6 & 8388608) != 0 ? workSpec.traceTag : str4, (i6 & 16777216) != 0 ? workSpec.backOffOnSystemInterruptions : bool);
    }
}
