package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"T", "field", "", "name", "requireParsedField", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "Lkotlinx/datetime/format/Padding;", "padding", "", "yearOfEra", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;Lkotlinx/datetime/format/Padding;)V", "", "baseYear", "yearOfEraTwoDigits", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;I)V", "Lkotlinx/datetime/format/IncompleteYearMonth;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/format/IncompleteYearMonth;", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/YearMonth;", "ISO_YEAR_MONTH$delegate", "Lkotlin/Lazy;", "getISO_YEAR_MONTH", "()Lkotlinx/datetime/format/DateTimeFormat;", "ISO_YEAR_MONTH"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YearMonthFormatKt {
    private static final kotlinx.datetime.format.IncompleteYearMonth getHighResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.format.IncompleteYearMonth(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private static final kotlin.Lazy ISO_YEAR_MONTH$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.YearMonthFormatKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.DateTimeFormat build;
            build = kotlinx.datetime.format.YearMonthFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.YearMonthFormatKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.YearMonthFormatKt.m24168$r8$lambda$OFqb2pvP1Sw1FjUHe4Uk7AlGo((kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth) obj);
                }
            });
            return build;
        }
    });

    public static final <T> T requireParsedField(T t, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (t != null) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not create a ");
        sb.append(str);
        sb.append(" from the given input: the field ");
        sb.append(str);
        sb.append(" is missing");
        throw new kotlinx.datetime.DateTimeFormatException(sb.toString());
    }

    public static final void yearOfEra(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth withYearMonth, kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withYearMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        if (withYearMonth instanceof kotlinx.datetime.format.AbstractWithYearMonthBuilder) {
            ((kotlinx.datetime.format.AbstractWithYearMonthBuilder) withYearMonth).addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.YearDirective(padding, true)));
        }
    }

    public static final void yearOfEraTwoDigits(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth withYearMonth, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withYearMonth, "");
        if (withYearMonth instanceof kotlinx.datetime.format.AbstractWithYearMonthBuilder) {
            ((kotlinx.datetime.format.AbstractWithYearMonthBuilder) withYearMonth).addFormatStructureForYearMonth(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.ReducedYearDirective(i, true)));
        }
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> getISO_YEAR_MONTH() {
        return (kotlinx.datetime.format.DateTimeFormat) ISO_YEAR_MONTH$delegate.getValue();
    }

    /* renamed from: $r8$lambda$-OFqb2pvP1S-w1FjUHe4Uk7AlGo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24168$r8$lambda$OFqb2pvP1Sw1FjUHe4Uk7AlGo(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth withYearMonth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withYearMonth, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.year$default(withYearMonth, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withYearMonth, '-');
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.monthNumber$default(withYearMonth, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$toKotlinCode(kotlinx.datetime.format.MonthNames monthNames) {
        java.util.List<java.lang.String> names = monthNames.getNames();
        if (kotlin.jvm.internal.Intrinsics.areEqual(names, kotlinx.datetime.format.MonthNames.INSTANCE.getENGLISH_FULL().getNames())) {
            kotlinx.datetime.format.MonthNames.Companion companion = kotlinx.datetime.format.MonthNames.INSTANCE;
            return "MonthNames.ENGLISH_FULL";
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(names, kotlinx.datetime.format.MonthNames.INSTANCE.getENGLISH_ABBREVIATED().getNames())) {
            return kotlin.collections.CollectionsKt.joinToString$default(monthNames.getNames(), ", ", "MonthNames(", ")", 0, null, kotlinx.datetime.format.YearMonthFormatKt$toKotlinCode$1.getHighResolutionOutputSizeshNQ4ISI, 24, null);
        }
        kotlinx.datetime.format.MonthNames.Companion companion2 = kotlinx.datetime.format.MonthNames.INSTANCE;
        return "MonthNames.ENGLISH_ABBREVIATED";
    }
}
