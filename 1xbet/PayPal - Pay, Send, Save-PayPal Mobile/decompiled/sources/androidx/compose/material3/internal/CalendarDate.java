package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018"}, d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "month", "dayOfMonth", "", "utcTimeMillis", "<init>", "(IIIJ)V", "other", "compareTo", "(Landroidx/compose/material3/internal/CalendarDate;)I", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "", "skeleton", "format", "(Landroidx/compose/material3/internal/CalendarModel;Ljava/lang/String;)Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()J", "copy", "(IIIJ)Landroidx/compose/material3/internal/CalendarDate;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getYear", "getMonth", "getDayOfMonth", "J", "getUtcTimeMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CalendarDate implements java.lang.Comparable<androidx.compose.material3.internal.CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public CalendarDate(int i, int i2, int i3, long j) {
        this.year = i;
        this.month = i2;
        this.dayOfMonth = i3;
        this.utcTimeMillis = j;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.compose.material3.internal.CalendarDate other) {
        return kotlin.jvm.internal.Intrinsics.compare(this.utcTimeMillis, other.utcTimeMillis);
    }

    public final java.lang.String format(androidx.compose.material3.internal.CalendarModel calendarModel, java.lang.String skeleton) {
        return calendarModel.formatWithSkeleton(this, skeleton, calendarModel.getLocale());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CalendarDate(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", utcTimeMillis=");
        sb.append(this.utcTimeMillis);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.year) * 31) + java.lang.Integer.hashCode(this.month)) * 31) + java.lang.Integer.hashCode(this.dayOfMonth)) * 31) + java.lang.Long.hashCode(this.utcTimeMillis);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.internal.CalendarDate)) {
            return false;
        }
        androidx.compose.material3.internal.CalendarDate calendarDate = (androidx.compose.material3.internal.CalendarDate) other;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public final androidx.compose.material3.internal.CalendarDate copy(int year, int month, int dayOfMonth, long utcTimeMillis) {
        return new androidx.compose.material3.internal.CalendarDate(year, month, dayOfMonth, utcTimeMillis);
    }

    /* renamed from: component4, reason: from getter */
    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public static /* synthetic */ androidx.compose.material3.internal.CalendarDate copy$default(androidx.compose.material3.internal.CalendarDate calendarDate, int i, int i2, int i3, long j, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = calendarDate.year;
        }
        if ((i4 & 2) != 0) {
            i2 = calendarDate.month;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = calendarDate.dayOfMonth;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = calendarDate.utcTimeMillis;
        }
        return calendarDate.copy(i, i5, i6, j);
    }
}
