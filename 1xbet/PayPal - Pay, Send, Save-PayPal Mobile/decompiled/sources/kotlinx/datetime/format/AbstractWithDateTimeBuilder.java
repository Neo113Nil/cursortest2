package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/DateTimeFieldContainer;", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/DateFieldContainer;", "addFormatStructureForDate", "Lkotlinx/datetime/format/TimeFieldContainer;", "addFormatStructureForTime", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "format", "dateTime", "(Lkotlinx/datetime/format/DateTimeFormat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AbstractWithDateTimeBuilder extends kotlinx.datetime.format.AbstractWithDateBuilder, kotlinx.datetime.format.AbstractWithTimeBuilder, kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime {
    void addFormatStructureForDateTime(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateTimeFieldContainer> structure);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void addFormatStructureForYearMonth(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.YearMonthFieldContainer> formatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.addFormatStructureForYearMonth(formatStructure);
        }

        @java.lang.Deprecated
        public static void amPmHour(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.amPmHour(padding);
        }

        @java.lang.Deprecated
        public static void amPmMarker(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.amPmMarker(str, str2);
        }

        @java.lang.Deprecated
        public static void date(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.date(dateTimeFormat);
        }

        @java.lang.Deprecated
        public static void day(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.day(padding);
        }

        @kotlin.Deprecated(message = "Use 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "day(padding = padding)", imports = {}))
        @java.lang.Deprecated
        public static void dayOfMonth(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.dayOfMonth(padding);
        }

        @java.lang.Deprecated
        public static void dayOfWeek(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.DayOfWeekNames dayOfWeekNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeekNames, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.dayOfWeek(dayOfWeekNames);
        }

        @java.lang.Deprecated
        public static void dayOfYear(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.dayOfYear(padding);
        }

        @java.lang.Deprecated
        public static void hour(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.hour(padding);
        }

        @java.lang.Deprecated
        public static void minute(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.minute(padding);
        }

        @java.lang.Deprecated
        public static void monthName(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.MonthNames monthNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNames, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.monthName(monthNames);
        }

        @java.lang.Deprecated
        public static void monthNumber(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.monthNumber(padding);
        }

        @java.lang.Deprecated
        public static void second(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.second(padding);
        }

        @java.lang.Deprecated
        public static void secondFraction(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, int i) {
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.secondFraction(i);
        }

        @java.lang.Deprecated
        public static void secondFraction(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, int i, int i2) {
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.secondFraction(i, i2);
        }

        @java.lang.Deprecated
        public static void time(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.time(dateTimeFormat);
        }

        @java.lang.Deprecated
        public static void year(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.year(padding);
        }

        @java.lang.Deprecated
        public static void yearMonth(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.yearMonth(dateTimeFormat);
        }

        @java.lang.Deprecated
        public static void yearTwoDigits(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, int i) {
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.yearTwoDigits(i);
        }

        @java.lang.Deprecated
        public static void addFormatStructureForDate(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateFieldContainer> formatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.addFormatStructureForDate(formatStructure);
        }

        @java.lang.Deprecated
        public static void addFormatStructureForTime(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.TimeFieldContainer> formatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.addFormatStructureForTime(formatStructure);
        }

        @java.lang.Deprecated
        public static void dateTime(kotlinx.datetime.format.AbstractWithDateTimeBuilder abstractWithDateTimeBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateTimeBuilder.super.dateTime(dateTimeFormat);
        }
    }

    @Override // kotlinx.datetime.format.AbstractWithDateBuilder
    default void addFormatStructureForDate(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateFieldContainer> structure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
        addFormatStructureForDateTime(structure);
    }

    @Override // kotlinx.datetime.format.AbstractWithTimeBuilder
    default void addFormatStructureForTime(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.TimeFieldContainer> structure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
        addFormatStructureForDateTime(structure);
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime
    default void dateTime(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.format.LocalDateTimeFormat) {
            addFormatStructureForDateTime(((kotlinx.datetime.format.LocalDateTimeFormat) format).getActualFormat());
        }
    }
}
