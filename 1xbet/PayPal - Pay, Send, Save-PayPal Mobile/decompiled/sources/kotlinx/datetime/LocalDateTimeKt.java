package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/LocalDateTimeKt__LocalDateTimeJvmKt", "kotlinx/datetime/LocalDateTimeKt__LocalDateTimeKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalDateTimeKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'month' and a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = monthNumber, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeKt.LocalDateTime(i, i2, i3, i4, i5, i6, i7);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = month.toKotlinMonth(), day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, java.time.Month month, int i2, int i3, int i4, int i5, int i6) {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeJvmKt.LocalDateTime(i, month, i2, i3, i4, i5, i6);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year = year, month = month, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime LocalDateTime(int i, kotlinx.datetime.Month month, int i2, int i3, int i4, int i5, int i6) {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeKt.LocalDateTime(i, month, i2, i3, i4, i5, i6);
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime LocalDateTime$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, java.lang.Object obj) {
        kotlinx.datetime.LocalDateTime LocalDateTime;
        LocalDateTime = LocalDateTime(i, i2, i3, i4, i5, (r16 & 32) != 0 ? 0 : i6, (r16 & 64) != 0 ? 0 : i7);
        return LocalDateTime;
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime LocalDateTime$default(int i, java.time.Month month, int i2, int i3, int i4, int i5, int i6, int i7, java.lang.Object obj) {
        kotlinx.datetime.LocalDateTime LocalDateTime;
        LocalDateTime = LocalDateTime(i, month, i2, i3, i4, (r16 & 32) != 0 ? 0 : i5, (r16 & 64) != 0 ? 0 : i6);
        return LocalDateTime;
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime LocalDateTime$default(int i, kotlinx.datetime.Month month, int i2, int i3, int i4, int i5, int i6, int i7, java.lang.Object obj) {
        kotlinx.datetime.LocalDateTime LocalDateTime;
        LocalDateTime = LocalDateTime(i, month, i2, i3, i4, (r16 & 32) != 0 ? 0 : i5, (r16 & 64) != 0 ? 0 : i6);
        return LocalDateTime;
    }

    public static final java.lang.String format(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> dateTimeFormat) {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeKt.format(localDateTime, dateTimeFormat);
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> getIsoDateTimeFormat() {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeKt.getIsoDateTimeFormat();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime.parse(this)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(java.lang.String str) {
        return kotlinx.datetime.LocalDateTimeKt__LocalDateTimeKt.toLocalDateTime(str);
    }
}
