package io.ktor.util.date;

/* compiled from: DateJvm.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", com.ironsource.C4.a.d, "Lio/ktor/util/date/GMTDate;", "GMTDate", "(Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "", "seconds", "minutes", "hours", "dayOfMonth", "Lio/ktor/util/date/Month;", "month", "year", "(IIIILio/ktor/util/date/Month;I)Lio/ktor/util/date/GMTDate;", "Ljava/util/Calendar;", "toDate", "(Ljava/util/Calendar;Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "Ljava/util/Date;", "toJvmDate", "(Lio/ktor/util/date/GMTDate;)Ljava/util/Date;", "getTimeMillis", "()J", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "GMT_TIMEZONE", "Ljava/util/TimeZone;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateJvmKt {
    private static final java.util.TimeZone GMT_TIMEZONE = java.util.TimeZone.getTimeZone("GMT");

    public static /* synthetic */ io.ktor.util.date.GMTDate GMTDate$default(java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return GMTDate(l);
    }

    public static final io.ktor.util.date.GMTDate GMTDate(java.lang.Long l) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(GMT_TIMEZONE, java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNull(calendar);
        return toDate(calendar, l);
    }

    public static final io.ktor.util.date.GMTDate GMTDate(int i, int i2, int i3, int i4, io.ktor.util.date.Month month, int i5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "month");
        java.util.Calendar calendar = java.util.Calendar.getInstance(GMT_TIMEZONE, java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNull(calendar);
        calendar.set(1, i5);
        calendar.set(2, month.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return toDate(calendar, null);
    }

    public static final io.ktor.util.date.GMTDate toDate(java.util.Calendar calendar, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return new io.ktor.util.date.GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), io.ktor.util.date.WeekDay.INSTANCE.from((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), io.ktor.util.date.Month.INSTANCE.from(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    public static final java.util.Date toJvmDate(io.ktor.util.date.GMTDate gMTDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return new java.util.Date(gMTDate.getTimestamp());
    }

    public static final long getTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
