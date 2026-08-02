package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016"}, d2 = {"Lkotlinx/datetime/YearMonthProgression;", "Lkotlinx/datetime/YearMonth;", "first", "(Lkotlinx/datetime/YearMonthProgression;)Lkotlinx/datetime/YearMonth;", "last", "firstOrNull", "lastOrNull", "reversed", "(Lkotlinx/datetime/YearMonthProgression;)Lkotlinx/datetime/YearMonthProgression;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "unit", "step", "(Lkotlinx/datetime/YearMonthProgression;ILkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonthProgression;", "", "(Lkotlinx/datetime/YearMonthProgression;JLkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonthProgression;", "that", "downTo", "(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/YearMonthProgression;", "Lkotlin/random/Random;", "random", "(Lkotlinx/datetime/YearMonthProgression;Lkotlin/random/Random;)Lkotlinx/datetime/YearMonth;", "randomOrNull"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class YearMonthRangeKt {
    public static final kotlinx.datetime.YearMonth first(kotlinx.datetime.YearMonthProgression yearMonthProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        if (yearMonthProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(yearMonthProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return yearMonthProgression.getFirst();
    }

    public static final kotlinx.datetime.YearMonth last(kotlinx.datetime.YearMonthProgression yearMonthProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        if (yearMonthProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(yearMonthProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return yearMonthProgression.getLast();
    }

    public static final kotlinx.datetime.YearMonth firstOrNull(kotlinx.datetime.YearMonthProgression yearMonthProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        if (yearMonthProgression.isEmpty()) {
            return null;
        }
        return yearMonthProgression.getFirst();
    }

    public static final kotlinx.datetime.YearMonth lastOrNull(kotlinx.datetime.YearMonthProgression yearMonthProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        if (yearMonthProgression.isEmpty()) {
            return null;
        }
        return yearMonthProgression.getLast();
    }

    public static final kotlinx.datetime.YearMonthProgression reversed(kotlinx.datetime.YearMonthProgression yearMonthProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        return new kotlinx.datetime.YearMonthProgression(kotlin.ranges.RangesKt.reversed(yearMonthProgression.getLongProgression()));
    }

    public static final kotlinx.datetime.YearMonthProgression step(kotlinx.datetime.YearMonthProgression yearMonthProgression, int i, kotlinx.datetime.DateTimeUnit.MonthBased monthBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthBased, "");
        return step(yearMonthProgression, i, monthBased);
    }

    public static final kotlinx.datetime.YearMonthProgression step(kotlinx.datetime.YearMonthProgression yearMonthProgression, long j, kotlinx.datetime.DateTimeUnit.MonthBased monthBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthBased, "");
        return new kotlinx.datetime.YearMonthProgression(kotlin.ranges.RangesKt.step(yearMonthProgression.getLongProgression(), kotlinx.datetime.internal.MathKt.safeMultiplyOrClamp(j, monthBased.getMonths())));
    }

    public static final kotlinx.datetime.YearMonthProgression downTo(kotlinx.datetime.YearMonth yearMonth, kotlinx.datetime.YearMonth yearMonth2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth2, "");
        return kotlinx.datetime.YearMonthProgression.INSTANCE.fromClosedRange$kotlinx_datetime(yearMonth, yearMonth2, -1L, kotlinx.datetime.DateTimeUnit.INSTANCE.getMONTH());
    }

    public static /* synthetic */ kotlinx.datetime.YearMonth random$default(kotlinx.datetime.YearMonthProgression yearMonthProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return random(yearMonthProgression, random);
    }

    public static final kotlinx.datetime.YearMonth random(kotlinx.datetime.YearMonthProgression yearMonthProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (yearMonthProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(yearMonthProgression)));
        }
        return kotlinx.datetime.YearMonthKt.fromProlepticMonth(kotlinx.datetime.YearMonth.INSTANCE, kotlinx.datetime.internal.MathKt.randomUnsafe(yearMonthProgression.getLongProgression(), random));
    }

    public static final kotlinx.datetime.YearMonth randomOrNull(kotlinx.datetime.YearMonthProgression yearMonthProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonthProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        java.lang.Long randomUnsafeOrNull = kotlinx.datetime.internal.MathKt.randomUnsafeOrNull(yearMonthProgression.getLongProgression(), random);
        if (randomUnsafeOrNull != null) {
            return kotlinx.datetime.YearMonthKt.fromProlepticMonth(kotlinx.datetime.YearMonth.INSTANCE, randomUnsafeOrNull.longValue());
        }
        return null;
    }

    public static /* synthetic */ kotlinx.datetime.YearMonth randomOrNull$default(kotlinx.datetime.YearMonthProgression yearMonthProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return randomOrNull(yearMonthProgression, random);
    }
}
