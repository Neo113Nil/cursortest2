package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/LocalTimeKt__LocalTimeJvmKt", "kotlinx/datetime/LocalTimeKt__LocalTimeKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalTimeKt {
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, int i2, int i3) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.atDate(localTime, i, i2, i3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = monthNumber, day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, int i2, int i3, kotlin.Unit unit) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.atDate(localTime, i, i2, i3, unit);
    }

    @kotlin.Deprecated(message = "Use kotlinx.datetime.Month", replaceWith = @kotlin.ReplaceWith(expression = "atDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeJvmKt.atDate(localTime, i, month, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = month.toKotlinMonth(), day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, java.time.Month month, int i2, kotlin.Unit unit) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeJvmKt.atDate(localTime, i, month, i2, unit);
    }

    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, kotlinx.datetime.Month month, int i2) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.atDate(localTime, i, month, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = month, day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, kotlinx.datetime.Month month, int i2, kotlin.Unit unit) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.atDate(localTime, i, month, i2, unit);
    }

    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, kotlinx.datetime.LocalDate localDate) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.atDate(localTime, localDate);
    }

    public static final java.lang.String format(kotlinx.datetime.LocalTime localTime, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> dateTimeFormat) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.format(localTime, dateTimeFormat);
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> getIsoTimeFormat() {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.getIsoTimeFormat();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "LocalTime.parse(this)", imports = {}))
    public static final kotlinx.datetime.LocalTime toLocalTime(java.lang.String str) {
        return kotlinx.datetime.LocalTimeKt__LocalTimeKt.toLocalTime(str);
    }
}
