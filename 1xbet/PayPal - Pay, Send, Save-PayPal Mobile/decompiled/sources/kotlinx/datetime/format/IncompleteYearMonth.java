package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f"}, d2 = {"Lkotlinx/datetime/format/IncompleteYearMonth;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "monthNumber", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/YearMonth;", "toYearMonth", "()Lkotlinx/datetime/YearMonth;", "yearMonth", "", "populateFrom", "(Lkotlinx/datetime/YearMonth;)V", "copy", "()Lkotlinx/datetime/format/IncompleteYearMonth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "getMonthNumber", "setMonthNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IncompleteYearMonth implements kotlinx.datetime.format.YearMonthFieldContainer, kotlinx.datetime.internal.format.parser.Copyable<kotlinx.datetime.format.IncompleteYearMonth> {
    private java.lang.Integer monthNumber;
    private java.lang.Integer year;

    public IncompleteYearMonth(java.lang.Integer num, java.lang.Integer num2) {
        this.year = num;
        this.monthNumber = num2;
    }

    public /* synthetic */ IncompleteYearMonth(java.lang.Integer num, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final java.lang.Integer getYear() {
        return this.year;
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final void setYear(java.lang.Integer num) {
        this.year = num;
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final java.lang.Integer getMonthNumber() {
        return this.monthNumber;
    }

    @Override // kotlinx.datetime.format.YearMonthFieldContainer
    public final void setMonthNumber(java.lang.Integer num) {
        this.monthNumber = num;
    }

    public final kotlinx.datetime.YearMonth toYearMonth() {
        return new kotlinx.datetime.YearMonth(((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getYear(), com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR)).intValue(), ((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getMonthNumber(), "monthNumber")).intValue());
    }

    public final void populateFrom(kotlinx.datetime.YearMonth yearMonth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        setYear(java.lang.Integer.valueOf(yearMonth.getYear()));
        setMonthNumber(java.lang.Integer.valueOf(kotlinx.datetime.MonthKt.getNumber(yearMonth.getMonth())));
    }

    @Override // kotlinx.datetime.internal.format.parser.Copyable
    public final kotlinx.datetime.format.IncompleteYearMonth copy() {
        return new kotlinx.datetime.format.IncompleteYearMonth(getYear(), getMonthNumber());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.format.IncompleteYearMonth)) {
            return false;
        }
        kotlinx.datetime.format.IncompleteYearMonth incompleteYearMonth = (kotlinx.datetime.format.IncompleteYearMonth) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getYear(), incompleteYearMonth.getYear()) && kotlin.jvm.internal.Intrinsics.areEqual(getMonthNumber(), incompleteYearMonth.getMonthNumber());
    }

    public final int hashCode() {
        java.lang.Integer year = getYear();
        int hashCode = year != null ? year.hashCode() : 0;
        java.lang.Integer monthNumber = getMonthNumber();
        return (hashCode * 31) + (monthNumber != null ? monthNumber.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object year = getYear();
        if (year == null) {
            year = "??";
        }
        sb.append(year);
        sb.append('-');
        java.lang.Integer monthNumber = getMonthNumber();
        sb.append(monthNumber != null ? monthNumber : "??");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IncompleteYearMonth() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
