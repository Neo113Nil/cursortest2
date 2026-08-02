package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B5\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001e\u0010-\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001e\u00100\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&"}, d2 = {"Lkotlinx/datetime/format/IncompleteLocalDate;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "Lkotlinx/datetime/format/IncompleteYearMonth;", "yearMonth", "", "day", "dayOfWeek", "dayOfYear", "<init>", "(Lkotlinx/datetime/format/IncompleteYearMonth;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/LocalDate;", "toLocalDate", "()Lkotlinx/datetime/LocalDate;", "date", "", "populateFrom", "(Lkotlinx/datetime/LocalDate;)V", "copy", "()Lkotlinx/datetime/format/IncompleteLocalDate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/datetime/format/IncompleteYearMonth;", "getYearMonth", "()Lkotlinx/datetime/format/IncompleteYearMonth;", "Ljava/lang/Integer;", "getDay", "()Ljava/lang/Integer;", "setDay", "(Ljava/lang/Integer;)V", "getDayOfWeek", "setDayOfWeek", "getDayOfYear", "setDayOfYear", "getMonthNumber", "setMonthNumber", "monthNumber", "getYear", "setYear", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IncompleteLocalDate implements kotlinx.datetime.format.YearMonthFieldContainer, kotlinx.datetime.format.DateFieldContainer, kotlinx.datetime.internal.format.parser.Copyable<kotlinx.datetime.format.IncompleteLocalDate> {
    private java.lang.Integer day;
    private java.lang.Integer dayOfWeek;
    private java.lang.Integer dayOfYear;
    private final kotlinx.datetime.format.IncompleteYearMonth yearMonth;

    public IncompleteLocalDate(kotlinx.datetime.format.IncompleteYearMonth incompleteYearMonth, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incompleteYearMonth, "");
        this.yearMonth = incompleteYearMonth;
        this.day = num;
        this.dayOfWeek = num2;
        this.dayOfYear = num3;
    }

    public /* synthetic */ IncompleteLocalDate(kotlinx.datetime.format.IncompleteYearMonth incompleteYearMonth, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlinx.datetime.format.IncompleteYearMonth(null, null, 3, null) : incompleteYearMonth, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    public final kotlinx.datetime.format.IncompleteYearMonth getYearMonth() {
        return this.yearMonth;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final java.lang.Integer getDay() {
        return this.day;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final void setDay(java.lang.Integer num) {
        this.day = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final java.lang.Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final void setDayOfWeek(java.lang.Integer num) {
        this.dayOfWeek = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final java.lang.Integer getDayOfYear() {
        return this.dayOfYear;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public final void setDayOfYear(java.lang.Integer num) {
        this.dayOfYear = num;
    }

    public final kotlinx.datetime.LocalDate toLocalDate() {
        kotlinx.datetime.LocalDate plus;
        int intValue;
        int intValue2 = ((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getYear(), com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR)).intValue();
        java.lang.Integer dayOfYear = getDayOfYear();
        if (dayOfYear == null) {
            plus = new kotlinx.datetime.LocalDate(intValue2, ((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getMonthNumber(), "monthNumber")).intValue(), ((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getDay(), "day")).intValue());
        } else {
            plus = kotlinx.datetime.LocalDateKt.plus(new kotlinx.datetime.LocalDate(intValue2, 1, 1), dayOfYear.intValue() - 1, kotlinx.datetime.DateTimeUnit.INSTANCE.getDAY());
            if (plus.getYear() != intValue2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                sb.append(dayOfYear);
                sb.append(", which is not a valid day of year for the year ");
                sb.append(intValue2);
                throw new kotlinx.datetime.DateTimeFormatException(sb.toString());
            }
            if (getMonthNumber() != null) {
                int number = kotlinx.datetime.MonthKt.getNumber(plus.m24137getMonth());
                java.lang.Integer monthNumber = getMonthNumber();
                if (monthNumber == null || number != monthNumber.intValue()) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb2.append(dayOfYear);
                    sb2.append(", which is ");
                    sb2.append(plus.m24137getMonth());
                    sb2.append(", but ");
                    sb2.append(getMonthNumber());
                    sb2.append(" was specified as the month number");
                    throw new kotlinx.datetime.DateTimeFormatException(sb2.toString());
                }
            }
            if (getDay() != null) {
                int day = plus.getDay();
                java.lang.Integer day2 = getDay();
                if (day2 == null || day != day2.intValue()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb3.append(dayOfYear);
                    sb3.append(", which is the day ");
                    sb3.append(plus.getDay());
                    sb3.append(" of ");
                    sb3.append(plus.m24137getMonth());
                    sb3.append(", but ");
                    sb3.append(getDay());
                    sb3.append(" was specified as the day of month");
                    throw new kotlinx.datetime.DateTimeFormatException(sb3.toString());
                }
            }
        }
        java.lang.Integer dayOfWeek = getDayOfWeek();
        if (dayOfWeek == null || (intValue = dayOfWeek.intValue()) == kotlinx.datetime.DayOfWeekKt.getIsoDayNumber(plus.m24136getDayOfWeek())) {
            return plus;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
        sb4.append(kotlinx.datetime.DayOfWeekKt.m24135DayOfWeek(intValue));
        sb4.append(" but the date is ");
        sb4.append(plus);
        sb4.append(", which is a ");
        sb4.append(plus.m24136getDayOfWeek());
        throw new kotlinx.datetime.DateTimeFormatException(sb4.toString());
    }

    public final void populateFrom(kotlinx.datetime.LocalDate date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        setYear(java.lang.Integer.valueOf(date.getYear()));
        setMonthNumber(java.lang.Integer.valueOf(kotlinx.datetime.MonthKt.getNumber(date.m24137getMonth())));
        setDay(java.lang.Integer.valueOf(date.getDay()));
        setDayOfWeek(java.lang.Integer.valueOf(kotlinx.datetime.DayOfWeekKt.getIsoDayNumber(date.m24136getDayOfWeek())));
        setDayOfYear(java.lang.Integer.valueOf(date.getDayOfYear()));
    }

    @Override // kotlinx.datetime.internal.format.parser.Copyable
    public final kotlinx.datetime.format.IncompleteLocalDate copy() {
        return new kotlinx.datetime.format.IncompleteLocalDate(this.yearMonth.copy(), getDay(), getDayOfWeek(), getDayOfYear());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.format.IncompleteLocalDate)) {
            return false;
        }
        kotlinx.datetime.format.IncompleteLocalDate incompleteLocalDate = (kotlinx.datetime.format.IncompleteLocalDate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.yearMonth, incompleteLocalDate.yearMonth) && kotlin.jvm.internal.Intrinsics.areEqual(getDay(), incompleteLocalDate.getDay()) && kotlin.jvm.internal.Intrinsics.areEqual(getDayOfWeek(), incompleteLocalDate.getDayOfWeek()) && kotlin.jvm.internal.Intrinsics.areEqual(getDayOfYear(), incompleteLocalDate.getDayOfYear());
    }

    public final int hashCode() {
        int hashCode = this.yearMonth.hashCode();
        java.lang.Integer day = getDay();
        int hashCode2 = day != null ? day.hashCode() : 0;
        java.lang.Integer dayOfWeek = getDayOfWeek();
        int hashCode3 = dayOfWeek != null ? dayOfWeek.hashCode() : 0;
        java.lang.Integer dayOfYear = getDayOfYear();
        return (hashCode * 29791) + (hashCode2 * 961) + (hashCode3 * 31) + (dayOfYear != null ? dayOfYear.hashCode() : 0);
    }

    public final java.lang.String toString() {
        if (getDayOfYear() == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.yearMonth);
            sb.append('-');
            java.lang.Object day = getDay();
            if (day == null) {
                day = "??";
            }
            sb.append(day);
            sb.append(" (day of week is ");
            java.lang.Integer dayOfWeek = getDayOfWeek();
            sb.append(dayOfWeek != null ? dayOfWeek : "??");
            sb.append(')');
            return sb.toString();
        }
        if (getDay() == null && getMonthNumber() == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
            java.lang.Object year = this.yearMonth.getYear();
            if (year == null) {
                year = "??";
            }
            sb2.append(year);
            sb2.append(")-");
            sb2.append(getDayOfYear());
            sb2.append(" (day of week is ");
            java.lang.Integer dayOfWeek2 = getDayOfWeek();
            sb2.append(dayOfWeek2 != null ? dayOfWeek2 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(this.yearMonth);
        sb3.append('-');
        java.lang.Object day2 = getDay();
        if (day2 == null) {
            day2 = "??";
        }
        sb3.append(day2);
        sb3.append(" (day of week is ");
        java.lang.Integer dayOfWeek3 = getDayOfWeek();
        sb3.append(dayOfWeek3 != null ? dayOfWeek3 : "??");
        sb3.append(", day of year is ");
        sb3.append(getDayOfYear());
        sb3.append(')');
        return sb3.toString();
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final void setYear(java.lang.Integer num) {
        this.yearMonth.setYear(num);
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final void setMonthNumber(java.lang.Integer num) {
        this.yearMonth.setMonthNumber(num);
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final java.lang.Integer getYear() {
        return this.yearMonth.getYear();
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final java.lang.Integer getMonthNumber() {
        return this.yearMonth.getMonthNumber();
    }

    public IncompleteLocalDate() {
        this(null, null, null, null, 15, null);
    }
}
