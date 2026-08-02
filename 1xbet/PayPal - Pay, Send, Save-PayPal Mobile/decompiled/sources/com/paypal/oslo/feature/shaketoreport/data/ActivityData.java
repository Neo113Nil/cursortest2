package com.paypal.oslo.feature.shaketoreport.data;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/data/ActivityData;", "", "", "started", "resumed", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/paypal/oslo/feature/shaketoreport/data/ActivityData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getStarted", "getResumed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ActivityData {
    public static final int $stable = 0;
    private final long resumed;
    private final long started;

    public ActivityData(long j, long j2) {
        this.started = j;
        this.resumed = j2;
    }

    public /* synthetic */ ActivityData(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }

    public final long getStarted() {
        return this.started;
    }

    public final long getResumed() {
        return this.resumed;
    }

    public final java.lang.String toString() {
        long j = this.started;
        long j2 = this.resumed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityData(started=");
        sb.append(j);
        sb.append(", resumed=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.started) * 31) + java.lang.Long.hashCode(this.resumed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shaketoreport.data.ActivityData)) {
            return false;
        }
        com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData = (com.paypal.oslo.feature.shaketoreport.data.ActivityData) other;
        return this.started == activityData.started && this.resumed == activityData.resumed;
    }

    public final com.paypal.oslo.feature.shaketoreport.data.ActivityData copy(long started, long resumed) {
        return new com.paypal.oslo.feature.shaketoreport.data.ActivityData(started, resumed);
    }

    /* renamed from: component2, reason: from getter */
    public final long getResumed() {
        return this.resumed;
    }

    /* renamed from: component1, reason: from getter */
    public final long getStarted() {
        return this.started;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shaketoreport.data.ActivityData copy$default(com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = activityData.started;
        }
        if ((i & 2) != 0) {
            j2 = activityData.resumed;
        }
        return activityData.copy(j, j2);
    }

    public ActivityData() {
        this(0L, 0L, 3, null);
    }
}
