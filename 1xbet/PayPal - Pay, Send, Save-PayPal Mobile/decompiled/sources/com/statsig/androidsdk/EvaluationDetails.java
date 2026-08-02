package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/statsig/androidsdk/EvaluationDetails;", "", "Lcom/statsig/androidsdk/EvaluationReason;", "reason", "", "time", "lcut", "<init>", "(Lcom/statsig/androidsdk/EvaluationReason;JJ)V", "component1", "()Lcom/statsig/androidsdk/EvaluationReason;", "component2", "()J", "component3", "copy", "(Lcom/statsig/androidsdk/EvaluationReason;JJ)Lcom/statsig/androidsdk/EvaluationDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getLcut", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "setReason", "(Lcom/statsig/androidsdk/EvaluationReason;)V", "getTime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EvaluationDetails {
    private final transient long lcut;
    private com.statsig.androidsdk.EvaluationReason reason;
    private final long time;

    public EvaluationDetails(com.statsig.androidsdk.EvaluationReason evaluationReason, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationReason, "");
        this.reason = evaluationReason;
        this.time = j;
        this.lcut = j2;
    }

    public final com.statsig.androidsdk.EvaluationReason getReason() {
        return this.reason;
    }

    public final void setReason(com.statsig.androidsdk.EvaluationReason evaluationReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationReason, "");
        this.reason = evaluationReason;
    }

    public /* synthetic */ EvaluationDetails(com.statsig.androidsdk.EvaluationReason evaluationReason, long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluationReason, (i & 2) != 0 ? java.lang.System.currentTimeMillis() : j, j2);
    }

    public final long getTime() {
        return this.time;
    }

    public final long getLcut() {
        return this.lcut;
    }

    public final java.lang.String toString() {
        com.statsig.androidsdk.EvaluationReason evaluationReason = this.reason;
        long j = this.time;
        long j2 = this.lcut;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluationDetails(reason=");
        sb.append(evaluationReason);
        sb.append(", time=");
        sb.append(j);
        sb.append(", lcut=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.reason.hashCode() * 31) + java.lang.Long.hashCode(this.time)) * 31) + java.lang.Long.hashCode(this.lcut);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.EvaluationDetails)) {
            return false;
        }
        com.statsig.androidsdk.EvaluationDetails evaluationDetails = (com.statsig.androidsdk.EvaluationDetails) other;
        return this.reason == evaluationDetails.reason && this.time == evaluationDetails.time && this.lcut == evaluationDetails.lcut;
    }

    public final com.statsig.androidsdk.EvaluationDetails copy(com.statsig.androidsdk.EvaluationReason reason, long time, long lcut) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.statsig.androidsdk.EvaluationDetails(reason, time, lcut);
    }

    /* renamed from: component3, reason: from getter */
    public final long getLcut() {
        return this.lcut;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component1, reason: from getter */
    public final com.statsig.androidsdk.EvaluationReason getReason() {
        return this.reason;
    }

    public static /* synthetic */ com.statsig.androidsdk.EvaluationDetails copy$default(com.statsig.androidsdk.EvaluationDetails evaluationDetails, com.statsig.androidsdk.EvaluationReason evaluationReason, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluationReason = evaluationDetails.reason;
        }
        if ((i & 2) != 0) {
            j = evaluationDetails.time;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = evaluationDetails.lcut;
        }
        return evaluationDetails.copy(evaluationReason, j3, j2);
    }
}
