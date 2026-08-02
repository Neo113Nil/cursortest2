package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0010\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0012\u001a5\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0013\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0014¢\u0006\u0004\b\f\u0010\u0015\u001a\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/datetime/LocalTime;", "Lkotlinx/datetime/format/DateTimeFormat;", "p0", "", "format", "(Lkotlinx/datetime/LocalTime;Lkotlinx/datetime/format/DateTimeFormat;)Ljava/lang/String;", "toLocalTime", "(Ljava/lang/String;)Lkotlinx/datetime/LocalTime;", "", "p1", "p2", "Lkotlinx/datetime/LocalDateTime;", "atDate", "(Lkotlinx/datetime/LocalTime;III)Lkotlinx/datetime/LocalDateTime;", "", "p3", "(Lkotlinx/datetime/LocalTime;IIILkotlin/Unit;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/Month;", "(Lkotlinx/datetime/LocalTime;ILkotlinx/datetime/Month;I)Lkotlinx/datetime/LocalDateTime;", "(Lkotlinx/datetime/LocalTime;ILkotlinx/datetime/Month;ILkotlin/Unit;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/LocalDate;", "(Lkotlinx/datetime/LocalTime;Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/LocalDateTime;", "getIsoTimeFormat", "()Lkotlinx/datetime/format/DateTimeFormat;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/LocalTimeKt")
/* loaded from: classes3.dex */
final /* synthetic */ class LocalTimeKt__LocalTimeKt {
    public static final java.lang.String format(kotlinx.datetime.LocalTime localTime, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        return dateTimeFormat.format(localTime);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @kotlin.ReplaceWith(expression = "LocalTime.parse(this)", imports = {}))
    public static final kotlinx.datetime.LocalTime toLocalTime(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.datetime.LocalTime.Companion.parse$default(kotlinx.datetime.LocalTime.INSTANCE, str, null, 2, null);
    }

    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        return new kotlinx.datetime.LocalDateTime(i, i2, i3, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime atDate$default(kotlinx.datetime.LocalTime localTime, int i, int i2, int i3, kotlin.Unit unit, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            unit = kotlin.Unit.INSTANCE;
        }
        return kotlinx.datetime.LocalTimeKt.atDate(localTime, i, i2, i3, unit);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = monthNumber, day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, int i2, int i3, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return new kotlinx.datetime.LocalDateTime(i, i2, i3, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, kotlinx.datetime.Month month, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return new kotlinx.datetime.LocalDateTime(i, month, i2, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    public static /* synthetic */ kotlinx.datetime.LocalDateTime atDate$default(kotlinx.datetime.LocalTime localTime, int i, kotlinx.datetime.Month month, int i2, kotlin.Unit unit, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            unit = kotlin.Unit.INSTANCE;
        }
        return kotlinx.datetime.LocalTimeKt.atDate(localTime, i, month, i2, unit);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "this.atDate(year = year, month = month, day = dayOfMonth)", imports = {}))
    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, int i, kotlinx.datetime.Month month, int i2, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return new kotlinx.datetime.LocalDateTime(i, month, i2, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    public static final kotlinx.datetime.LocalDateTime atDate(kotlinx.datetime.LocalTime localTime, kotlinx.datetime.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        return new kotlinx.datetime.LocalDateTime(localDate, localTime);
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> getIsoTimeFormat() {
        return kotlinx.datetime.LocalTime.Formats.INSTANCE.getISO();
    }
}
