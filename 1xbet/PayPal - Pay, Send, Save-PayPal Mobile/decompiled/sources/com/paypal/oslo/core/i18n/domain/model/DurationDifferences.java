package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DurationDifferences;", "", "", "secondsDiff", "minutesDiff", "hoursDiff", "daysDiff", "monthsDiff", "yearsDiff", "<init>", "(JJJJJJ)V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "copy", "(JJJJJJ)Lcom/paypal/oslo/core/i18n/domain/model/DurationDifferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getSecondsDiff", "getMinutesDiff", "getHoursDiff", "getDaysDiff", "getMonthsDiff", "getYearsDiff"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DurationDifferences {
    private final long daysDiff;
    private final long hoursDiff;
    private final long minutesDiff;
    private final long monthsDiff;
    private final long secondsDiff;
    private final long yearsDiff;

    public DurationDifferences(long j, long j2, long j3, long j4, long j5, long j6) {
        this.secondsDiff = j;
        this.minutesDiff = j2;
        this.hoursDiff = j3;
        this.daysDiff = j4;
        this.monthsDiff = j5;
        this.yearsDiff = j6;
    }

    public final long getSecondsDiff() {
        return this.secondsDiff;
    }

    public final long getMinutesDiff() {
        return this.minutesDiff;
    }

    public final long getHoursDiff() {
        return this.hoursDiff;
    }

    public final long getDaysDiff() {
        return this.daysDiff;
    }

    public final long getMonthsDiff() {
        return this.monthsDiff;
    }

    public final long getYearsDiff() {
        return this.yearsDiff;
    }

    public final java.lang.String toString() {
        long j = this.secondsDiff;
        long j2 = this.minutesDiff;
        long j3 = this.hoursDiff;
        long j4 = this.daysDiff;
        long j5 = this.monthsDiff;
        long j6 = this.yearsDiff;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DurationDifferences(secondsDiff=");
        sb.append(j);
        sb.append(", minutesDiff=");
        sb.append(j2);
        sb.append(", hoursDiff=");
        sb.append(j3);
        sb.append(", daysDiff=");
        sb.append(j4);
        sb.append(", monthsDiff=");
        sb.append(j5);
        sb.append(", yearsDiff=");
        sb.append(j6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.secondsDiff) * 31) + java.lang.Long.hashCode(this.minutesDiff)) * 31) + java.lang.Long.hashCode(this.hoursDiff)) * 31) + java.lang.Long.hashCode(this.daysDiff)) * 31) + java.lang.Long.hashCode(this.monthsDiff)) * 31) + java.lang.Long.hashCode(this.yearsDiff);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DurationDifferences)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DurationDifferences durationDifferences = (com.paypal.oslo.core.i18n.domain.model.DurationDifferences) other;
        return this.secondsDiff == durationDifferences.secondsDiff && this.minutesDiff == durationDifferences.minutesDiff && this.hoursDiff == durationDifferences.hoursDiff && this.daysDiff == durationDifferences.daysDiff && this.monthsDiff == durationDifferences.monthsDiff && this.yearsDiff == durationDifferences.yearsDiff;
    }

    public final com.paypal.oslo.core.i18n.domain.model.DurationDifferences copy(long secondsDiff, long minutesDiff, long hoursDiff, long daysDiff, long monthsDiff, long yearsDiff) {
        return new com.paypal.oslo.core.i18n.domain.model.DurationDifferences(secondsDiff, minutesDiff, hoursDiff, daysDiff, monthsDiff, yearsDiff);
    }

    /* renamed from: component6, reason: from getter */
    public final long getYearsDiff() {
        return this.yearsDiff;
    }

    /* renamed from: component5, reason: from getter */
    public final long getMonthsDiff() {
        return this.monthsDiff;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDaysDiff() {
        return this.daysDiff;
    }

    /* renamed from: component3, reason: from getter */
    public final long getHoursDiff() {
        return this.hoursDiff;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinutesDiff() {
        return this.minutesDiff;
    }

    /* renamed from: component1, reason: from getter */
    public final long getSecondsDiff() {
        return this.secondsDiff;
    }
}
