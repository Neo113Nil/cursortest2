package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\b\u0010\t\"+\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b0\n8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/datetime/format/Padding;", "", "toKotlinCode", "(Lkotlinx/datetime/format/Padding;)Ljava/lang/String;", "", "width", "minDigits", "(Lkotlinx/datetime/format/Padding;I)I", "spaces", "(Lkotlinx/datetime/format/Padding;I)Ljava/lang/Integer;", "", "Lkotlin/Pair;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimeFormatKt {
    private static final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.DateTimeFormatKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kotlinx.datetime.format.DateTimeFormatKt.$r8$lambda$U49wA5TdmMd1m0dIOZEBHBUF8P8();
        }
    });

    public static final java.lang.String toKotlinCode(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        int i = kotlinx.datetime.format.DateTimeFormatKt.WhenMappings.$EnumSwitchMapping$0[padding.ordinal()];
        if (i == 1) {
            return "Padding.NONE";
        }
        if (i == 2) {
            return "Padding.ZERO";
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Padding.SPACE";
    }

    public static final int minDigits(kotlinx.datetime.format.Padding padding, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        if (padding == kotlinx.datetime.format.Padding.ZERO) {
            return i;
        }
        return 1;
    }

    public static final java.lang.Integer spaces(kotlinx.datetime.format.Padding padding, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        if (padding == kotlinx.datetime.format.Padding.SPACE) {
            return java.lang.Integer.valueOf(i);
        }
        return null;
    }

    public static /* synthetic */ java.util.List $r8$lambda$U49wA5TdmMd1m0dIOZEBHBUF8P8() {
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> rfc_1123 = kotlinx.datetime.format.DateTimeComponents.Formats.INSTANCE.getRFC_1123();
        kotlin.jvm.internal.Intrinsics.checkNotNull(rfc_1123, "");
        kotlin.Pair pair = kotlin.TuplesKt.to("dateTimeComponents(DateTimeComponents.Formats.RFC_1123)", ((kotlinx.datetime.format.AbstractDateTimeFormat) rfc_1123).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> iso_date_time_offset = kotlinx.datetime.format.DateTimeComponents.Formats.INSTANCE.getISO_DATE_TIME_OFFSET();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso_date_time_offset, "");
        kotlin.Pair pair2 = kotlin.TuplesKt.to("dateTimeComponents(DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso_date_time_offset).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> iso = kotlinx.datetime.LocalDateTime.Formats.INSTANCE.getISO();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso, "");
        kotlin.Pair pair3 = kotlin.TuplesKt.to("date(LocalDateTime.Formats.ISO)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> iso2 = kotlinx.datetime.LocalDate.Formats.INSTANCE.getISO();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso2, "");
        kotlin.Pair pair4 = kotlin.TuplesKt.to("date(LocalDate.Formats.ISO)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso2).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> iso_basic = kotlinx.datetime.LocalDate.Formats.INSTANCE.getISO_BASIC();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso_basic, "");
        kotlin.Pair pair5 = kotlin.TuplesKt.to("date(LocalDate.Formats.ISO_BASIC)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso_basic).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> iso3 = kotlinx.datetime.LocalTime.Formats.INSTANCE.getISO();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso3, "");
        kotlin.Pair pair6 = kotlin.TuplesKt.to("time(LocalTime.Formats.ISO)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso3).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> iso4 = kotlinx.datetime.UtcOffset.Formats.INSTANCE.getISO();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso4, "");
        kotlin.Pair pair7 = kotlin.TuplesKt.to("offset(UtcOffset.Formats.ISO)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso4).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> iso_basic2 = kotlinx.datetime.UtcOffset.Formats.INSTANCE.getISO_BASIC();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso_basic2, "");
        kotlin.Pair pair8 = kotlin.TuplesKt.to("offset(UtcOffset.Formats.ISO_BASIC)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso_basic2).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> four_digits = kotlinx.datetime.UtcOffset.Formats.INSTANCE.getFOUR_DIGITS();
        kotlin.jvm.internal.Intrinsics.checkNotNull(four_digits, "");
        kotlin.Pair pair9 = kotlin.TuplesKt.to("offset(UtcOffset.Formats.FOUR_DIGITS)", ((kotlinx.datetime.format.AbstractDateTimeFormat) four_digits).getActualFormat());
        kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> iso5 = kotlinx.datetime.YearMonth.Formats.INSTANCE.getISO();
        kotlin.jvm.internal.Intrinsics.checkNotNull(iso5, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, kotlin.TuplesKt.to("yearMonth(YearMonth.Formats.ISO)", ((kotlinx.datetime.format.AbstractDateTimeFormat) iso5).getActualFormat())});
    }

    public static final /* synthetic */ java.util.List access$getAllFormatConstants() {
        return (java.util.List) Camera2StreamConfigurationMap.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.datetime.format.Padding.values().length];
            try {
                iArr[kotlinx.datetime.format.Padding.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.datetime.format.Padding.ZERO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.datetime.format.Padding.SPACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
