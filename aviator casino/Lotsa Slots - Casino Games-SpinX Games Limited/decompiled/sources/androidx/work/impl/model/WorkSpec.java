package androidx.work.impl.model;

/* compiled from: WorkSpec.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0002\u0010\bBË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017¢\u0006\u0002\u0010$J\u0006\u0010-\u001a\u00020\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0015HÆ\u0003J\t\u00100\u001a\u00020\u0017HÆ\u0003J\t\u00101\u001a\u00020\u0019HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u001fHÆ\u0003J\t\u00107\u001a\u00020!HÆ\u0003J\t\u00108\u001a\u00020\u0017HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0017HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003JÓ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u0017HÆ\u0001J\u0013\u0010C\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010D\u001a\u00020\u001fJ\t\u0010E\u001a\u00020\u0017HÖ\u0001J\u000e\u0010F\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010I\u001a\u00020\u0003H\u0016R\u0012\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0012\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010,R\u0012\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "id", "", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "state", "Landroidx/work/WorkInfo$State;", "workerClassName", "inputMergerClassName", "input", "Landroidx/work/Data;", "output", "initialDelay", "", "intervalDuration", "flexDuration", "constraints", "Landroidx/work/Constraints;", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "", "outOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "periodCount", "generation", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;II)V", "getGeneration", "()I", "isBackedOff", "()Z", "isPeriodic", "getPeriodCount", "setPeriodCount", "(I)V", "calculateNextRunTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hasConstraints", "hashCode", "setBackoffDelayDuration", "", "setPeriodic", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final java.lang.String TAG;
    public static final androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> WORK_INFO_MAPPER;
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
    public androidx.work.OutOfQuotaPolicy outOfQuotaPolicy;
    public androidx.work.Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public androidx.work.WorkInfo.State state;
    public java.lang.String workerClassName;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final androidx.work.Constraints getConstraints() {
        return this.constraints;
    }

    /* renamed from: component11, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    /* renamed from: component12, reason: from getter */
    public final androidx.work.BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* renamed from: component13, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* renamed from: component14, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* renamed from: component15, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* renamed from: component16, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    /* renamed from: component18, reason: from getter */
    public final androidx.work.OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    /* renamed from: component19, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.work.WorkInfo.State getState() {
        return this.state;
    }

    /* renamed from: component20, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getWorkerClassName() {
        return this.workerClassName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.work.Data getInput() {
        return this.input;
    }

    /* renamed from: component6, reason: from getter */
    public final androidx.work.Data getOutput() {
        return this.output;
    }

    /* renamed from: component7, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* renamed from: component8, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* renamed from: component9, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    public final androidx.work.impl.model.WorkSpec copy(java.lang.String id, androidx.work.WorkInfo.State state, java.lang.String workerClassName, java.lang.String inputMergerClassName, androidx.work.Data input, androidx.work.Data output, long initialDelay, long intervalDuration, long flexDuration, androidx.work.Constraints constraints, int runAttemptCount, androidx.work.BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "constraints");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new androidx.work.impl.model.WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.work.impl.model.WorkSpec)) {
            return false;
        }
        androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && kotlin.jvm.internal.Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, workSpec.input) && kotlin.jvm.internal.Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && kotlin.jvm.internal.Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        java.lang.String str = this.inputMergerClassName;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.initialDelay)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.intervalDuration)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.backoffDelayDuration)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.lastEnqueueTime)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.minimumRetentionDuration)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.scheduleRequestedAt)) * 31;
        boolean z = this.expedited;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode2 + i) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + this.periodCount) * 31) + this.generation;
    }

    public WorkSpec(java.lang.String id, androidx.work.WorkInfo.State state, java.lang.String workerClassName, java.lang.String str, androidx.work.Data input, androidx.work.Data output, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "constraints");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = str;
        this.input = input;
        this.output = output;
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WorkSpec(java.lang.String str, androidx.work.WorkInfo.State state, java.lang.String str2, java.lang.String str3, androidx.work.Data data, androidx.work.Data data2, long j, long j2, long j3, androidx.work.Constraints constraints, int i, androidx.work.BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, androidx.work.OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, str2, r6, r7, r8, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? 0L : j2, (i4 & 256) != 0 ? 0L : j3, (i4 & 512) != 0 ? androidx.work.Constraints.NONE : constraints, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? androidx.work.BackoffPolicy.EXPONENTIAL : backoffPolicy, (i4 & 4096) != 0 ? 30000L : j4, (i4 & 8192) != 0 ? 0L : j5, (i4 & 16384) != 0 ? 0L : j6, (32768 & i4) != 0 ? -1L : j7, (65536 & i4) != 0 ? false : z, (131072 & i4) != 0 ? androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i4) != 0 ? 0 : i2, (i4 & 524288) != 0 ? 0 : i3);
        androidx.work.Data data3;
        androidx.work.Data data4;
        androidx.work.WorkInfo.State state2 = (i4 & 2) != 0 ? androidx.work.WorkInfo.State.ENQUEUED : state;
        java.lang.String str4 = (i4 & 8) != 0 ? null : str3;
        if ((i4 & 16) != 0) {
            androidx.work.Data EMPTY = androidx.work.Data.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            data3 = EMPTY;
        } else {
            data3 = data;
        }
        if ((i4 & 32) != 0) {
            androidx.work.Data EMPTY2 = androidx.work.Data.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            data4 = EMPTY2;
        } else {
            data4 = data2;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(java.lang.String id, java.lang.String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(java.lang.String newId, androidx.work.impl.model.WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.Data(other.input), new androidx.work.Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new androidx.work.Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, 524288, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newId, "newId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
    }

    public final void setBackoffDelayDuration(long backoffDelayDuration) {
        if (backoffDelayDuration > androidx.work.WorkRequest.MAX_BACKOFF_MILLIS) {
            androidx.work.Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            androidx.work.Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
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
            androidx.work.Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long intervalDuration, long flexDuration) {
        if (intervalDuration < androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            androidx.work.Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = kotlin.ranges.RangesKt.coerceAtLeast(intervalDuration, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (flexDuration < 300000) {
            androidx.work.Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            androidx.work.Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = kotlin.ranges.RangesKt.coerceIn(flexDuration, 300000L, this.intervalDuration);
    }

    public final long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.lastEnqueueTime + kotlin.ranges.RangesKt.coerceAtMost(this.backoffPolicy == androidx.work.BackoffPolicy.LINEAR ? this.backoffDelayDuration * this.runAttemptCount : (long) java.lang.Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1), androidx.work.WorkRequest.MAX_BACKOFF_MILLIS);
        }
        if (isPeriodic()) {
            int i = this.periodCount;
            long j = this.lastEnqueueTime;
            if (i == 0) {
                j += this.initialDelay;
            }
            long j2 = this.flexDuration;
            long j3 = this.intervalDuration;
            if (j2 != j3) {
                r1 = i == 0 ? (-1) * j2 : 0L;
                j += j3;
            } else if (i != 0) {
                r1 = j3;
            }
            return j + r1;
        }
        long j4 = this.lastEnqueueTime;
        if (j4 == 0) {
            j4 = java.lang.System.currentTimeMillis();
        }
        return j4 + this.initialDelay;
    }

    public final boolean hasConstraints() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(androidx.work.Constraints.NONE, this.constraints);
    }

    public java.lang.String toString() {
        return "{WorkSpec: " + this.id + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    /* compiled from: WorkSpec.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class IdAndState {
        public java.lang.String id;
        public androidx.work.WorkInfo.State state;

        public static /* synthetic */ androidx.work.impl.model.WorkSpec.IdAndState copy$default(androidx.work.impl.model.WorkSpec.IdAndState idAndState, java.lang.String str, androidx.work.WorkInfo.State state, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        public final androidx.work.impl.model.WorkSpec.IdAndState copy(java.lang.String id, androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            return new androidx.work.impl.model.WorkSpec.IdAndState(id, state);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.work.impl.model.WorkSpec.IdAndState)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.IdAndState idAndState = (androidx.work.impl.model.WorkSpec.IdAndState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public java.lang.String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }

        public IdAndState(java.lang.String id, androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.state = state;
        }
    }

    /* compiled from: WorkSpec.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0006\u00103\u001a\u000204R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u00065"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "output", "Landroidx/work/Data;", "runAttemptCount", "", "generation", "tags", "", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;IILjava/util/List;Ljava/util/List;)V", "getGeneration", "()I", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getOutput", "()Landroidx/work/Data;", "setOutput", "(Landroidx/work/Data;)V", "getProgress", "()Ljava/util/List;", "setProgress", "(Ljava/util/List;)V", "getRunAttemptCount", "setRunAttemptCount", "(I)V", "getState", "()Landroidx/work/WorkInfo$State;", "setState", "(Landroidx/work/WorkInfo$State;)V", "getTags", "setTags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "toWorkInfo", "Landroidx/work/WorkInfo;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WorkInfoPojo {
        private final int generation;
        private java.lang.String id;
        private androidx.work.Data output;
        private java.util.List<androidx.work.Data> progress;
        private int runAttemptCount;
        private androidx.work.WorkInfo.State state;
        private java.util.List<java.lang.String> tags;

        public static /* synthetic */ androidx.work.impl.model.WorkSpec.WorkInfoPojo copy$default(androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo, java.lang.String str, androidx.work.WorkInfo.State state, androidx.work.Data data, int i, int i2, java.util.List list, java.util.List list2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i3 & 2) != 0) {
                state = workInfoPojo.state;
            }
            androidx.work.WorkInfo.State state2 = state;
            if ((i3 & 4) != 0) {
                data = workInfoPojo.output;
            }
            androidx.work.Data data2 = data;
            if ((i3 & 8) != 0) {
                i = workInfoPojo.runAttemptCount;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = workInfoPojo.generation;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            java.util.List list3 = list;
            if ((i3 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.copy(str, state2, data2, i4, i5, list3, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.work.Data getOutput() {
            return this.output;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* renamed from: component5, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.tags;
        }

        public final java.util.List<androidx.work.Data> component7() {
            return this.progress;
        }

        public final androidx.work.impl.model.WorkSpec.WorkInfoPojo copy(java.lang.String id, androidx.work.WorkInfo.State state, androidx.work.Data output, int runAttemptCount, int generation, java.util.List<java.lang.String> tags, java.util.List<androidx.work.Data> progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
            return new androidx.work.impl.model.WorkSpec.WorkInfoPojo(id, state, output, runAttemptCount, generation, tags, progress);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.work.impl.model.WorkSpec.WorkInfoPojo)) {
                return false;
            }
            androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && kotlin.jvm.internal.Intrinsics.areEqual(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, workInfoPojo.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public java.lang.String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public WorkInfoPojo(java.lang.String id, androidx.work.WorkInfo.State state, androidx.work.Data output, int i, int i2, java.util.List<java.lang.String> tags, java.util.List<androidx.work.Data> progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.runAttemptCount = i;
            this.generation = i2;
            this.tags = tags;
            this.progress = progress;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final void setId(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final androidx.work.WorkInfo.State getState() {
            return this.state;
        }

        public final void setState(androidx.work.WorkInfo.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final androidx.work.Data getOutput() {
            return this.output;
        }

        public final void setOutput(androidx.work.Data data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "<set-?>");
            this.output = data;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final void setRunAttemptCount(int i) {
            this.runAttemptCount = i;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        public final void setTags(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tags = list;
        }

        public final java.util.List<androidx.work.Data> getProgress() {
            return this.progress;
        }

        public final void setProgress(java.util.List<androidx.work.Data> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.progress = list;
        }

        public final androidx.work.WorkInfo toWorkInfo() {
            return new androidx.work.WorkInfo(java.util.UUID.fromString(this.id), this.state, this.output, this.tags, this.progress.isEmpty() ^ true ? this.progress.get(0) : androidx.work.Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WorkSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = tagWithPrefix;
        WORK_INFO_MAPPER = new androidx.arch.core.util.Function() { // from class: androidx.work.impl.model.WorkSpec$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.List WORK_INFO_MAPPER$lambda$1;
                WORK_INFO_MAPPER$lambda$1 = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER$lambda$1((java.util.List) obj);
                return WORK_INFO_MAPPER$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List WORK_INFO_MAPPER$lambda$1(java.util.List list) {
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
}
