package androidx.work;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b$\u0018\u0000 <2\u00020\u0001:\u0003=><B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0015\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b:\u00106R\u001a\u0010\u0016\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b;\u0010\u001e"}, d2 = {"Landroidx/work/WorkInfo;", "", "Ljava/util/UUID;", "id", "Landroidx/work/WorkInfo$State;", "state", "", "", "tags", "Landroidx/work/Data;", "outputData", "progress", "", "runAttemptCount", "generation", "Landroidx/work/Constraints;", "constraints", "", "initialDelayMillis", "Landroidx/work/WorkInfo$PeriodicityInfo;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "Landroidx/work/Data;", "getOutputData", "()Landroidx/work/Data;", "getProgress", com.visa.cbp.getEncExpo.warmup, "getRunAttemptCount", "getGeneration", "Landroidx/work/Constraints;", "getConstraints", "()Landroidx/work/Constraints;", "J", "getInitialDelayMillis", "()J", "Landroidx/work/WorkInfo$PeriodicityInfo;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "getNextScheduleTimeMillis", "getStopReason", "Companion", "State", "PeriodicityInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkInfo {
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final androidx.work.Constraints constraints;
    private final int generation;
    private final java.util.UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final androidx.work.Data outputData;
    private final androidx.work.WorkInfo.PeriodicityInfo periodicityInfo;
    private final androidx.work.Data progress;
    private final int runAttemptCount;
    private final androidx.work.WorkInfo.State state;
    private final int stopReason;
    private final java.util.Set<java.lang.String> tags;

    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints, long j, androidx.work.WorkInfo.PeriodicityInfo periodicityInfo, long j2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    public final java.util.UUID getId() {
        return this.id;
    }

    public final androidx.work.WorkInfo.State getState() {
        return this.state;
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.tags;
    }

    public /* synthetic */ WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints, long j, androidx.work.WorkInfo.PeriodicityInfo periodicityInfo, long j2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, state, set, (i4 & 8) != 0 ? androidx.work.Data.EMPTY : data, (i4 & 16) != 0 ? androidx.work.Data.EMPTY : data2, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? androidx.work.Constraints.NONE : constraints, (i4 & 256) != 0 ? 0L : j, (i4 & 512) != 0 ? null : periodicityInfo, (i4 & 1024) != 0 ? Long.MAX_VALUE : j2, (i4 & 2048) != 0 ? -256 : i3);
    }

    public final androidx.work.Data getOutputData() {
        return this.outputData;
    }

    public final androidx.work.Data getProgress() {
        return this.progress;
    }

    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final androidx.work.Constraints getConstraints() {
        return this.constraints;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final androidx.work.WorkInfo.PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        androidx.work.WorkInfo workInfo = (androidx.work.WorkInfo) other;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && kotlin.jvm.internal.Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && kotlin.jvm.internal.Intrinsics.areEqual(this.outputData, workInfo.outputData) && kotlin.jvm.internal.Intrinsics.areEqual(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && kotlin.jvm.internal.Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, workInfo.tags)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.state.hashCode();
        int hashCode3 = this.outputData.hashCode();
        int hashCode4 = this.tags.hashCode();
        int hashCode5 = this.progress.hashCode();
        int i = this.runAttemptCount;
        int i2 = this.generation;
        int hashCode6 = this.constraints.hashCode();
        int hashCode7 = java.lang.Long.hashCode(this.initialDelayMillis);
        androidx.work.WorkInfo.PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.nextScheduleTimeMillis)) * 31) + java.lang.Integer.hashCode(this.stopReason);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkInfo{id='");
        sb.append(this.id);
        sb.append("', state=");
        sb.append(this.state);
        sb.append(", outputData=");
        sb.append(this.outputData);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", runAttemptCount=");
        sb.append(this.runAttemptCount);
        sb.append(", generation=");
        sb.append(this.generation);
        sb.append(", constraints=");
        sb.append(this.constraints);
        sb.append(", initialDelayMillis=");
        sb.append(this.initialDelayMillis);
        sb.append(", periodicityInfo=");
        sb.append(this.periodicityInfo);
        sb.append(", nextScheduleTimeMillis=");
        sb.append(this.nextScheduleTimeMillis);
        sb.append("}, stopReason=");
        sb.append(this.stopReason);
        return sb.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "<init>", "(Ljava/lang/String;I)V", "", "isFinished", "()Z", "ENQUEUED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, "SUCCEEDED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "BLOCKED", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class State {
        public static final androidx.work.WorkInfo.State BLOCKED;
        public static final androidx.work.WorkInfo.State CANCELLED;
        public static final androidx.work.WorkInfo.State ENQUEUED;
        public static final androidx.work.WorkInfo.State FAILED;
        public static final androidx.work.WorkInfo.State RUNNING;
        public static final androidx.work.WorkInfo.State SUCCEEDED;
        private static final /* synthetic */ androidx.work.WorkInfo.State[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private State(java.lang.String str, int i) {
        }

        static {
            androidx.work.WorkInfo.State state = new androidx.work.WorkInfo.State("ENQUEUED", 0);
            ENQUEUED = state;
            androidx.work.WorkInfo.State state2 = new androidx.work.WorkInfo.State(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = state2;
            androidx.work.WorkInfo.State state3 = new androidx.work.WorkInfo.State("SUCCEEDED", 2);
            SUCCEEDED = state3;
            androidx.work.WorkInfo.State state4 = new androidx.work.WorkInfo.State(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 3);
            FAILED = state4;
            androidx.work.WorkInfo.State state5 = new androidx.work.WorkInfo.State("BLOCKED", 4);
            BLOCKED = state5;
            androidx.work.WorkInfo.State state6 = new androidx.work.WorkInfo.State(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 5);
            CANCELLED = state6;
            androidx.work.WorkInfo.State[] stateArr = {state, state2, state3, state4, state5, state6};
            getHighSpeedVideoFpsRanges = stateArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }

        public static androidx.work.WorkInfo.State[] values() {
            return (androidx.work.WorkInfo.State[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static androidx.work.WorkInfo.State valueOf(java.lang.String str) {
            return (androidx.work.WorkInfo.State) java.lang.Enum.valueOf(androidx.work.WorkInfo.State.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.work.WorkInfo.State> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getRepeatIntervalMillis", "()J", "getFlexIntervalMillis"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
                return false;
            }
            androidx.work.WorkInfo.PeriodicityInfo periodicityInfo = (androidx.work.WorkInfo.PeriodicityInfo) other;
            return periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis;
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.repeatIntervalMillis) * 31) + java.lang.Long.hashCode(this.flexIntervalMillis);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.repeatIntervalMillis);
            sb.append(", flexIntervalMillis=");
            sb.append(this.flexIntervalMillis);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints, long j, androidx.work.WorkInfo.PeriodicityInfo periodicityInfo, long j2) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, j2, 0, 2048, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints, long j, androidx.work.WorkInfo.PeriodicityInfo periodicityInfo) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints, long j) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, null, 0L, 0, 3584, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2, androidx.work.Constraints constraints) {
        this(uuid, state, set, data, data2, i, i2, constraints, 0L, null, 0L, 0, 3840, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i, int i2) {
        this(uuid, state, set, data, data2, i, i2, null, 0L, null, 0L, 0, 3968, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2, int i) {
        this(uuid, state, set, data, data2, i, 0, null, 0L, null, 0L, 0, 4032, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data, androidx.work.Data data2) {
        this(uuid, state, set, data, data2, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set, androidx.work.Data data) {
        this(uuid, state, set, data, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(java.util.UUID uuid, androidx.work.WorkInfo.State state, java.util.Set<java.lang.String> set) {
        this(uuid, state, set, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }
}
