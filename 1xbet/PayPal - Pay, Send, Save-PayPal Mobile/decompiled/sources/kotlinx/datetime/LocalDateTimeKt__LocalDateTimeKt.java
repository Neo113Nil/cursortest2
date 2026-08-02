package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aK\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\b*\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "Lkotlinx/datetime/LocalDateTime;", "LocalDateTime", "(IIIIIII)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/Month;", "(ILkotlinx/datetime/Month;IIIII)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/format/DateTimeFormat;", "", "format", "(Lkotlinx/datetime/LocalDateTime;Lkotlinx/datetime/format/DateTimeFormat;)Ljava/lang/String;", "toLocalDateTime", "(Ljava/lang/String;)Lkotlinx/datetime/LocalDateTime;", "getIsoDateTimeFormat", "()Lkotlinx/datetime/format/DateTimeFormat;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/LocalDateTimeKt")
/* loaded from: classes3.dex */
final /* synthetic */ class LocalDateTimeKt__LocalDateTimeKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'month' and a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = monthNumber, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new kotlinx.datetime.LocalDateTime(i, i2, i3, i4, i5, i6, i7);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = month, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, kotlinx.datetime.Month month, int i2, int i3, int i4, int i5, int i6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return new kotlinx.datetime.LocalDateTime(i, month, i2, i3, i4, i5, i6);
    }

    public static final java.lang.String format(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        return dateTimeFormat.format(localDateTime);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime.parse(this)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.datetime.LocalDateTime.Companion.parse$default(kotlinx.datetime.LocalDateTime.INSTANCE, str, null, 2, null);
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> getIsoDateTimeFormat() {
        return kotlinx.datetime.LocalDateTime.Formats.INSTANCE.getISO();
    }
}
