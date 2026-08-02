package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "ISO_DATE$delegate", "Lkotlin/Lazy;", "getISO_DATE", "()Lkotlinx/datetime/format/DateTimeFormat;", "ISO_DATE", "ISO_DATE_BASIC$delegate", "getISO_DATE_BASIC", "ISO_DATE_BASIC", "Lkotlinx/datetime/format/IncompleteLocalDate;", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/format/IncompleteLocalDate;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateFormatKt {
    private static final kotlin.Lazy ISO_DATE$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.DateTimeFormat build;
            build = kotlinx.datetime.format.LocalDateFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.LocalDateFormatKt.$r8$lambda$dJWvyPEYyCWBZPOrfrApB35yyDA((kotlinx.datetime.format.DateTimeFormatBuilder.WithDate) obj);
                }
            });
            return build;
        }
    });
    private static final kotlin.Lazy ISO_DATE_BASIC$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.DateTimeFormat build;
            build = kotlinx.datetime.format.LocalDateFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.LocalDateFormatKt.m24151$r8$lambda$x2arItBnXGab6uqbMt2KONh3bk((kotlinx.datetime.format.DateTimeFormatBuilder.WithDate) obj);
                }
            });
            return build;
        }
    });
    private static final kotlinx.datetime.format.IncompleteLocalDate Camera2StreamConfigurationMap = new kotlinx.datetime.format.IncompleteLocalDate(null, null, null, null, 15, null);

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> getISO_DATE() {
        return (kotlinx.datetime.format.DateTimeFormat) ISO_DATE$delegate.getValue();
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> getISO_DATE_BASIC() {
        return (kotlinx.datetime.format.DateTimeFormat) ISO_DATE_BASIC$delegate.getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dJWvyPEYyCWBZPOrfrApB35yyDA(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withDate, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate2 = withDate;
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.year$default(withDate2, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate3 = withDate;
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDate3, '-');
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.monthNumber$default(withDate2, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDate3, '-');
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.day$default(withDate, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x2arItBnXGab-6uqbMt2KONh3bk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24151$r8$lambda$x2arItBnXGab6uqbMt2KONh3bk(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withDate, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate2 = withDate;
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.year$default(withDate2, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.monthNumber$default(withDate2, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.day$default(withDate, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$toKotlinCode(kotlinx.datetime.format.DayOfWeekNames dayOfWeekNames) {
        java.util.List<java.lang.String> names = dayOfWeekNames.getNames();
        if (kotlin.jvm.internal.Intrinsics.areEqual(names, kotlinx.datetime.format.DayOfWeekNames.INSTANCE.getENGLISH_FULL().getNames())) {
            kotlinx.datetime.format.DayOfWeekNames.Companion companion = kotlinx.datetime.format.DayOfWeekNames.INSTANCE;
            return "DayOfWeekNames.ENGLISH_FULL";
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(names, kotlinx.datetime.format.DayOfWeekNames.INSTANCE.getENGLISH_ABBREVIATED().getNames())) {
            return kotlin.collections.CollectionsKt.joinToString$default(dayOfWeekNames.getNames(), ", ", "DayOfWeekNames(", ")", 0, null, kotlinx.datetime.format.LocalDateFormatKt$toKotlinCode$1.getHighSpeedVideoFpsRangesFor, 24, null);
        }
        kotlinx.datetime.format.DayOfWeekNames.Companion companion2 = kotlinx.datetime.format.DayOfWeekNames.INSTANCE;
        return "DayOfWeekNames.ENGLISH_ABBREVIATED";
    }
}
