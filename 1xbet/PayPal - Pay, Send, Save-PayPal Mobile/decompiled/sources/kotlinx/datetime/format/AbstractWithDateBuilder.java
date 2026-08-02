package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/AbstractWithYearMonthBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/DateFieldContainer;", "structure", "", "addFormatStructureForDate", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "addFormatStructureForYearMonth", "Lkotlinx/datetime/format/Padding;", "padding", "day", "(Lkotlinx/datetime/format/Padding;)V", "Lkotlinx/datetime/format/DayOfWeekNames;", "names", "dayOfWeek", "(Lkotlinx/datetime/format/DayOfWeekNames;)V", "dayOfYear", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "format", "date", "(Lkotlinx/datetime/format/DateTimeFormat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AbstractWithDateBuilder extends kotlinx.datetime.format.AbstractWithYearMonthBuilder, kotlinx.datetime.format.DateTimeFormatBuilder.WithDate {
    void addFormatStructureForDate(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateFieldContainer> structure);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(message = "Use 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "day(padding = padding)", imports = {}))
        @java.lang.Deprecated
        public static void dayOfMonth(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.dayOfMonth(padding);
        }

        @java.lang.Deprecated
        public static void monthName(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.MonthNames monthNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNames, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.monthName(monthNames);
        }

        @java.lang.Deprecated
        public static void monthNumber(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.monthNumber(padding);
        }

        @java.lang.Deprecated
        public static void year(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.year(padding);
        }

        @java.lang.Deprecated
        public static void yearMonth(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.yearMonth(dateTimeFormat);
        }

        @java.lang.Deprecated
        public static void yearTwoDigits(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, int i) {
            kotlinx.datetime.format.AbstractWithDateBuilder.super.yearTwoDigits(i);
        }

        @java.lang.Deprecated
        public static void addFormatStructureForYearMonth(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.YearMonthFieldContainer> formatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.addFormatStructureForYearMonth(formatStructure);
        }

        @java.lang.Deprecated
        public static void day(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.day(padding);
        }

        @java.lang.Deprecated
        public static void dayOfWeek(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.DayOfWeekNames dayOfWeekNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeekNames, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.dayOfWeek(dayOfWeekNames);
        }

        @java.lang.Deprecated
        public static void dayOfYear(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.dayOfYear(padding);
        }

        @java.lang.Deprecated
        public static void date(kotlinx.datetime.format.AbstractWithDateBuilder abstractWithDateBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithDateBuilder.super.date(dateTimeFormat);
        }
    }

    @Override // kotlinx.datetime.format.AbstractWithYearMonthBuilder
    default void addFormatStructureForYearMonth(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.YearMonthFieldContainer> structure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
        addFormatStructureForDate(structure);
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
    default void day(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForDate(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.DayDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
    default void dayOfWeek(kotlinx.datetime.format.DayOfWeekNames names) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(names, "");
        addFormatStructureForDate(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.DayOfWeekDirective(names)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
    default void dayOfYear(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForDate(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.DayOfYearDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
    default void date(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.format.LocalDateFormat) {
            addFormatStructureForDate(((kotlinx.datetime.format.LocalDateFormat) format).getActualFormat());
        }
    }
}
