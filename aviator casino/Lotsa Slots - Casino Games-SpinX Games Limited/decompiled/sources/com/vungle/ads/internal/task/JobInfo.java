package com.vungle.ads.internal.task;

/* compiled from: JobInfo.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 *2\u00020\u0001:\u0004*+,-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010&\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0011J\u0016\u0010'\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0011J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dR\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0014R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo;", "", "jobTag", "", "(Ljava/lang/String;)V", "<set-?>", "", "delay", "getDelay", "()J", "Landroid/os/Bundle;", "extras", "getExtras", "()Landroid/os/Bundle;", "getJobTag", "()Ljava/lang/String;", "nextRescheduleTimeout", "", "priority", "getPriority$annotations", "()V", "getPriority", "()I", "requiredNetworkType", "getRequiredNetworkType$annotations", "getRequiredNetworkType", "reschedulePolicy", "getReschedulePolicy$annotations", "rescheduleTimeout", "", "updateCurrent", "getUpdateCurrent", "()Z", "copy", "makeNextRescedule", "setDelay", "setExtras", "setPriority", "setRequiredNetworkType", "setReschedulePolicy", "delayCriteria", "setUpdateCurrent", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "NetworkType", "Priority", "ReschedulePolicy", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class JobInfo implements java.lang.Cloneable {
    private static final java.lang.String TAG = "JobInfo";
    private long delay;
    private android.os.Bundle extras;
    private final java.lang.String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    public static /* synthetic */ void getPriority$annotations() {
    }

    @com.vungle.ads.internal.task.JobInfo.NetworkType
    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }

    public JobInfo(java.lang.String jobTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new android.os.Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public final java.lang.String getJobTag() {
        return this.jobTag;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final android.os.Bundle getExtras() {
        return this.extras;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final com.vungle.ads.internal.task.JobInfo setUpdateCurrent(boolean updateCurrent) {
        this.updateCurrent = updateCurrent;
        return this;
    }

    public final com.vungle.ads.internal.task.JobInfo setExtras(android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final com.vungle.ads.internal.task.JobInfo setDelay(long delay) {
        this.delay = delay;
        return this;
    }

    public final com.vungle.ads.internal.task.JobInfo setReschedulePolicy(long rescheduleTimeout, int delayCriteria) {
        this.rescheduleTimeout = rescheduleTimeout;
        this.reschedulePolicy = delayCriteria;
        return this;
    }

    public final com.vungle.ads.internal.task.JobInfo setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public final long makeNextRescedule() {
        long j = this.rescheduleTimeout;
        if (j == 0) {
            return 0L;
        }
        long j2 = this.nextRescheduleTimeout;
        if (j2 == 0) {
            this.nextRescheduleTimeout = j;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j2 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final com.vungle.ads.internal.task.JobInfo copy() {
        try {
            java.lang.Object clone = super.clone();
            kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (com.vungle.ads.internal.task.JobInfo) clone;
        } catch (java.lang.CloneNotSupportedException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot copy JobInfo " + this, e);
            return null;
        }
    }

    public final com.vungle.ads.internal.task.JobInfo setRequiredNetworkType(@com.vungle.ads.internal.task.JobInfo.NetworkType int requiredNetworkType) {
        this.requiredNetworkType = requiredNetworkType;
        return this;
    }

    /* compiled from: JobInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$ReschedulePolicy;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface ReschedulePolicy {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.task.JobInfo.ReschedulePolicy.Companion INSTANCE = com.vungle.ads.internal.task.JobInfo.ReschedulePolicy.Companion.$$INSTANCE;
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR = 0;

        /* compiled from: JobInfo.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$ReschedulePolicy$Companion;", "", "()V", "EXPONENTIAL", "", "LINEAR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.vungle.ads.internal.task.JobInfo.ReschedulePolicy.Companion $$INSTANCE = new com.vungle.ads.internal.task.JobInfo.ReschedulePolicy.Companion();
            public static final int EXPONENTIAL = 1;
            public static final int LINEAR = 0;

            private Companion() {
            }
        }
    }

    /* compiled from: JobInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$Priority;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Priority {
        public static final int CRITICAL = 5;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.task.JobInfo.Priority.Companion INSTANCE = com.vungle.ads.internal.task.JobInfo.Priority.Companion.$$INSTANCE;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;

        /* compiled from: JobInfo.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$Priority$Companion;", "", "()V", "CRITICAL", "", "HIGH", "HIGHEST", "LOW", "LOWEST", "NORMAL", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.vungle.ads.internal.task.JobInfo.Priority.Companion $$INSTANCE = new com.vungle.ads.internal.task.JobInfo.Priority.Companion();
            public static final int CRITICAL = 5;
            public static final int HIGH = 3;
            public static final int HIGHEST = 4;
            public static final int LOW = 1;
            public static final int LOWEST = 0;
            public static final int NORMAL = 2;

            private Companion() {
            }
        }
    }

    /* compiled from: JobInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$NetworkType;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface NetworkType {
        public static final int ANY = 0;
        public static final int CONNECTED = 1;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.task.JobInfo.NetworkType.Companion INSTANCE = com.vungle.ads.internal.task.JobInfo.NetworkType.Companion.$$INSTANCE;

        /* compiled from: JobInfo.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/task/JobInfo$NetworkType$Companion;", "", "()V", "ANY", "", "CONNECTED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.vungle.ads.internal.task.JobInfo.NetworkType.Companion $$INSTANCE = new com.vungle.ads.internal.task.JobInfo.NetworkType.Companion();
            public static final int ANY = 0;
            public static final int CONNECTED = 1;

            private Companion() {
            }
        }
    }
}
