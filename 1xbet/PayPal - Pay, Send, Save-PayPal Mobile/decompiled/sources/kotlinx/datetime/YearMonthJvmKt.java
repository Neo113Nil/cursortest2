package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u000b\u001a\u0006*\u00020\b0\b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/datetime/YearMonth;", "", "toEpochMonths", "(Lkotlinx/datetime/YearMonth;)J", "Lkotlinx/datetime/YearMonth$Companion;", "months", "fromEpochMonths", "(Lkotlinx/datetime/YearMonth$Companion;J)Lkotlinx/datetime/YearMonth;", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class YearMonthJvmKt {
    private static final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.YearMonthJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.time.format.DateTimeFormatter formatter;
            formatter = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(java.time.temporal.ChronoField.YEAR, 4, 10, java.time.format.SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(java.time.temporal.ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            return formatter;
        }
    });

    public static final long toEpochMonths(kotlinx.datetime.YearMonth yearMonth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        return (((yearMonth.getYear() - 1970) * 12) + yearMonth.getMonthNumber$kotlinx_datetime()) - 1;
    }

    public static final kotlinx.datetime.YearMonth fromEpochMonths(kotlinx.datetime.YearMonth.Companion companion, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        long j2 = j / 12;
        if ((j ^ 12) < 0 && j2 * 12 != j) {
            j2--;
        }
        long j3 = j % 12;
        return new kotlinx.datetime.YearMonth((int) (j2 + 1970), ((int) (j3 + (12 & (((j3 ^ 12) & ((-j3) | j3)) >> 63)))) + 1);
    }

    public static final /* synthetic */ java.time.format.DateTimeFormatter access$getIsoFormat() {
        return (java.time.format.DateTimeFormatter) getHighSpeedVideoFpsRangesFor.getValue();
    }
}
