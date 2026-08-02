package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractWithYearMonthBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "structure", "", "addFormatStructureForYearMonth", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/Padding;", "padding", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "(Lkotlinx/datetime/format/Padding;)V", "", "baseYear", "yearTwoDigits", "(I)V", "monthNumber", "Lkotlinx/datetime/format/MonthNames;", "names", "monthName", "(Lkotlinx/datetime/format/MonthNames;)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/YearMonth;", "format", "yearMonth", "(Lkotlinx/datetime/format/DateTimeFormat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AbstractWithYearMonthBuilder extends kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth {
    void addFormatStructureForYearMonth(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.YearMonthFieldContainer> structure);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void year(kotlinx.datetime.format.AbstractWithYearMonthBuilder abstractWithYearMonthBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithYearMonthBuilder.super.year(padding);
        }

        @java.lang.Deprecated
        public static void yearTwoDigits(kotlinx.datetime.format.AbstractWithYearMonthBuilder abstractWithYearMonthBuilder, int i) {
            kotlinx.datetime.format.AbstractWithYearMonthBuilder.super.yearTwoDigits(i);
        }

        @java.lang.Deprecated
        public static void monthNumber(kotlinx.datetime.format.AbstractWithYearMonthBuilder abstractWithYearMonthBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithYearMonthBuilder.super.monthNumber(padding);
        }

        @java.lang.Deprecated
        public static void monthName(kotlinx.datetime.format.AbstractWithYearMonthBuilder abstractWithYearMonthBuilder, kotlinx.datetime.format.MonthNames monthNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNames, "");
            kotlinx.datetime.format.AbstractWithYearMonthBuilder.super.monthName(monthNames);
        }

        @java.lang.Deprecated
        public static void yearMonth(kotlinx.datetime.format.AbstractWithYearMonthBuilder abstractWithYearMonthBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithYearMonthBuilder.super.yearMonth(dateTimeFormat);
        }
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth
    default void year(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.YearDirective(padding, false, 2, null)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth
    default void yearTwoDigits(int baseYear) {
        addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.ReducedYearDirective(baseYear, false, 2, null)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth
    default void monthNumber(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.MonthDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth
    default void monthName(kotlinx.datetime.format.MonthNames names) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(names, "");
        addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.MonthNameDirective(names)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth
    default void yearMonth(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.format.YearMonthFormat) {
            addFormatStructureForYearMonth(((kotlinx.datetime.format.YearMonthFormat) format).getActualFormat());
        }
    }
}
