package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "", "Ljava/util/Date;", "date", "", "timeZone", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "component1", "()Ljava/util/Date;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Date;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Date;", "getDate", "Ljava/lang/String;", "getTimeZone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DateTime {
    private final java.util.Date date;
    private final java.lang.String timeZone;

    public DateTime(java.util.Date date, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.date = date;
        this.timeZone = str;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    public final java.lang.String toString() {
        java.util.Date date = this.date;
        java.lang.String str = this.timeZone;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateTime(date=");
        sb.append(date);
        sb.append(", timeZone=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.date.hashCode() * 31) + this.timeZone.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DateTime)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DateTime dateTime = (com.paypal.oslo.core.i18n.domain.model.DateTime) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.date, dateTime.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, dateTime.timeZone);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DateTime copy(java.util.Date date, java.lang.String timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return new com.paypal.oslo.core.i18n.domain.model.DateTime(date, timeZone);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component1, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTime copy$default(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, java.util.Date date, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = dateTime.date;
        }
        if ((i & 2) != 0) {
            str = dateTime.timeZone;
        }
        return dateTime.copy(date, str);
    }
}
