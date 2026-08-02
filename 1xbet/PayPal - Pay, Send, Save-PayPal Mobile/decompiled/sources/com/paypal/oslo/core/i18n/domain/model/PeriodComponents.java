package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PeriodComponents;", "", "", "years", "months", "weeks", "days", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/paypal/oslo/core/i18n/domain/model/PeriodComponents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getYears", "getMonths", "getWeeks", "getDays"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PeriodComponents {
    private final int days;
    private final int months;
    private final int weeks;
    private final int years;

    public PeriodComponents(int i, int i2, int i3, int i4) {
        this.years = i;
        this.months = i2;
        this.weeks = i3;
        this.days = i4;
    }

    public final int getYears() {
        return this.years;
    }

    public final int getMonths() {
        return this.months;
    }

    public final int getWeeks() {
        return this.weeks;
    }

    public final int getDays() {
        return this.days;
    }

    public final java.lang.String toString() {
        int i = this.years;
        int i2 = this.months;
        int i3 = this.weeks;
        int i4 = this.days;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PeriodComponents(years=");
        sb.append(i);
        sb.append(", months=");
        sb.append(i2);
        sb.append(", weeks=");
        sb.append(i3);
        sb.append(", days=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.years) * 31) + java.lang.Integer.hashCode(this.months)) * 31) + java.lang.Integer.hashCode(this.weeks)) * 31) + java.lang.Integer.hashCode(this.days);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.PeriodComponents)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.PeriodComponents periodComponents = (com.paypal.oslo.core.i18n.domain.model.PeriodComponents) other;
        return this.years == periodComponents.years && this.months == periodComponents.months && this.weeks == periodComponents.weeks && this.days == periodComponents.days;
    }

    public final com.paypal.oslo.core.i18n.domain.model.PeriodComponents copy(int years, int months, int weeks, int days) {
        return new com.paypal.oslo.core.i18n.domain.model.PeriodComponents(years, months, weeks, days);
    }

    /* renamed from: component4, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWeeks() {
        return this.weeks;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonths() {
        return this.months;
    }

    /* renamed from: component1, reason: from getter */
    public final int getYears() {
        return this.years;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PeriodComponents copy$default(com.paypal.oslo.core.i18n.domain.model.PeriodComponents periodComponents, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = periodComponents.years;
        }
        if ((i5 & 2) != 0) {
            i2 = periodComponents.months;
        }
        if ((i5 & 4) != 0) {
            i3 = periodComponents.weeks;
        }
        if ((i5 & 8) != 0) {
            i4 = periodComponents.days;
        }
        return periodComponents.copy(i, i2, i3, i4);
    }
}
