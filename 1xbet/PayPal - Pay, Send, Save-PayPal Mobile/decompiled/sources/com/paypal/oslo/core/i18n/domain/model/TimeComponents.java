package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/TimeComponents;", "", "", "hours", "minutes", "seconds", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/core/i18n/domain/model/TimeComponents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getHours", "getMinutes", "getSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimeComponents {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public TimeComponents(int i, int i2, int i3) {
        this.hours = i;
        this.minutes = i2;
        this.seconds = i3;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final java.lang.String toString() {
        int i = this.hours;
        int i2 = this.minutes;
        int i3 = this.seconds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeComponents(hours=");
        sb.append(i);
        sb.append(", minutes=");
        sb.append(i2);
        sb.append(", seconds=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.hours) * 31) + java.lang.Integer.hashCode(this.minutes)) * 31) + java.lang.Integer.hashCode(this.seconds);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.TimeComponents)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.TimeComponents timeComponents = (com.paypal.oslo.core.i18n.domain.model.TimeComponents) other;
        return this.hours == timeComponents.hours && this.minutes == timeComponents.minutes && this.seconds == timeComponents.seconds;
    }

    public final com.paypal.oslo.core.i18n.domain.model.TimeComponents copy(int hours, int minutes, int seconds) {
        return new com.paypal.oslo.core.i18n.domain.model.TimeComponents(hours, minutes, seconds);
    }

    /* renamed from: component3, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* renamed from: component1, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.TimeComponents copy$default(com.paypal.oslo.core.i18n.domain.model.TimeComponents timeComponents, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = timeComponents.hours;
        }
        if ((i4 & 2) != 0) {
            i2 = timeComponents.minutes;
        }
        if ((i4 & 4) != 0) {
            i3 = timeComponents.seconds;
        }
        return timeComponents.copy(i, i2, i3);
    }
}
