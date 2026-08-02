package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEvent;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;", "type", "", "reason", "", "absoluteTimeMs", "accumulatedTimeMs", "pauseDurationMs", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;Ljava/lang/String;JJJ)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;Ljava/lang/String;JJJ)Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;", "getType", "Ljava/lang/String;", "getReason", "J", "getAbsoluteTimeMs", "getAccumulatedTimeMs", "getPauseDurationMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimerEvent {
    public static final int $stable = 0;
    private final long absoluteTimeMs;
    private final long accumulatedTimeMs;
    private final long pauseDurationMs;
    private final java.lang.String reason;
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType type;

    public TimerEvent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType, java.lang.String str, long j, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerEventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = timerEventType;
        this.reason = str;
        this.absoluteTimeMs = j;
        this.accumulatedTimeMs = j2;
        this.pauseDurationMs = j3;
    }

    public /* synthetic */ TimerEvent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType, java.lang.String str, long j, long j2, long j3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(timerEventType, str, j, j2, (i & 16) != 0 ? 0L : j3);
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType getType() {
        return this.type;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final long getAbsoluteTimeMs() {
        return this.absoluteTimeMs;
    }

    public final long getAccumulatedTimeMs() {
        return this.accumulatedTimeMs;
    }

    public final long getPauseDurationMs() {
        return this.pauseDurationMs;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType = this.type;
        java.lang.String str = this.reason;
        long j = this.absoluteTimeMs;
        long j2 = this.accumulatedTimeMs;
        long j3 = this.pauseDurationMs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimerEvent(type=");
        sb.append(timerEventType);
        sb.append(", reason=");
        sb.append(str);
        sb.append(", absoluteTimeMs=");
        sb.append(j);
        sb.append(", accumulatedTimeMs=");
        sb.append(j2);
        sb.append(", pauseDurationMs=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.reason.hashCode()) * 31) + java.lang.Long.hashCode(this.absoluteTimeMs)) * 31) + java.lang.Long.hashCode(this.accumulatedTimeMs)) * 31) + java.lang.Long.hashCode(this.pauseDurationMs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent timerEvent = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent) other;
        return this.type == timerEvent.type && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, timerEvent.reason) && this.absoluteTimeMs == timerEvent.absoluteTimeMs && this.accumulatedTimeMs == timerEvent.accumulatedTimeMs && this.pauseDurationMs == timerEvent.pauseDurationMs;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent copy(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType type, java.lang.String reason, long absoluteTimeMs, long accumulatedTimeMs, long pauseDurationMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEvent(type, reason, absoluteTimeMs, accumulatedTimeMs, pauseDurationMs);
    }

    /* renamed from: component5, reason: from getter */
    public final long getPauseDurationMs() {
        return this.pauseDurationMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getAccumulatedTimeMs() {
        return this.accumulatedTimeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAbsoluteTimeMs() {
        return this.absoluteTimeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType getType() {
        return this.type;
    }
}
