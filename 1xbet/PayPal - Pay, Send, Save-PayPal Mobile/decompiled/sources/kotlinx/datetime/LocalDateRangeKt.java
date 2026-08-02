package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016"}, d2 = {"Lkotlinx/datetime/LocalDateProgression;", "Lkotlinx/datetime/LocalDate;", "first", "(Lkotlinx/datetime/LocalDateProgression;)Lkotlinx/datetime/LocalDate;", "last", "firstOrNull", "lastOrNull", "reversed", "(Lkotlinx/datetime/LocalDateProgression;)Lkotlinx/datetime/LocalDateProgression;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/datetime/DateTimeUnit$DayBased;", "unit", "step", "(Lkotlinx/datetime/LocalDateProgression;ILkotlinx/datetime/DateTimeUnit$DayBased;)Lkotlinx/datetime/LocalDateProgression;", "", "(Lkotlinx/datetime/LocalDateProgression;JLkotlinx/datetime/DateTimeUnit$DayBased;)Lkotlinx/datetime/LocalDateProgression;", "that", "downTo", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/LocalDateProgression;", "Lkotlin/random/Random;", "random", "(Lkotlinx/datetime/LocalDateProgression;Lkotlin/random/Random;)Lkotlinx/datetime/LocalDate;", "randomOrNull"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateRangeKt {
    public static final kotlinx.datetime.LocalDate first(kotlinx.datetime.LocalDateProgression localDateProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        if (localDateProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(localDateProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return localDateProgression.getFirst();
    }

    public static final kotlinx.datetime.LocalDate last(kotlinx.datetime.LocalDateProgression localDateProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        if (localDateProgression.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progression ");
            sb.append(localDateProgression);
            sb.append(" is empty.");
            throw new java.util.NoSuchElementException(sb.toString());
        }
        return localDateProgression.getLast();
    }

    public static final kotlinx.datetime.LocalDate firstOrNull(kotlinx.datetime.LocalDateProgression localDateProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        if (localDateProgression.isEmpty()) {
            return null;
        }
        return localDateProgression.getFirst();
    }

    public static final kotlinx.datetime.LocalDate lastOrNull(kotlinx.datetime.LocalDateProgression localDateProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        if (localDateProgression.isEmpty()) {
            return null;
        }
        return localDateProgression.getLast();
    }

    public static final kotlinx.datetime.LocalDateProgression reversed(kotlinx.datetime.LocalDateProgression localDateProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        return new kotlinx.datetime.LocalDateProgression(kotlin.ranges.RangesKt.reversed(localDateProgression.getLongProgression()));
    }

    public static final kotlinx.datetime.LocalDateProgression step(kotlinx.datetime.LocalDateProgression localDateProgression, int i, kotlinx.datetime.DateTimeUnit.DayBased dayBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayBased, "");
        return step(localDateProgression, i, dayBased);
    }

    public static final kotlinx.datetime.LocalDateProgression step(kotlinx.datetime.LocalDateProgression localDateProgression, long j, kotlinx.datetime.DateTimeUnit.DayBased dayBased) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayBased, "");
        return new kotlinx.datetime.LocalDateProgression(kotlin.ranges.RangesKt.step(localDateProgression.getLongProgression(), kotlinx.datetime.internal.MathKt.safeMultiplyOrClamp(j, dayBased.getDays())));
    }

    public static final kotlinx.datetime.LocalDateProgression downTo(kotlinx.datetime.LocalDate localDate, kotlinx.datetime.LocalDate localDate2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate2, "");
        return kotlinx.datetime.LocalDateProgression.INSTANCE.fromClosedRange$kotlinx_datetime(localDate, localDate2, -1L, kotlinx.datetime.DateTimeUnit.INSTANCE.getDAY());
    }

    public static /* synthetic */ kotlinx.datetime.LocalDate random$default(kotlinx.datetime.LocalDateProgression localDateProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return random(localDateProgression, random);
    }

    public static final kotlinx.datetime.LocalDate random(kotlinx.datetime.LocalDateProgression localDateProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (localDateProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(localDateProgression)));
        }
        return kotlinx.datetime.LocalDate.INSTANCE.fromEpochDays(kotlinx.datetime.internal.MathKt.randomUnsafe(localDateProgression.getLongProgression(), random));
    }

    public static final kotlinx.datetime.LocalDate randomOrNull(kotlinx.datetime.LocalDateProgression localDateProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        java.lang.Long randomUnsafeOrNull = kotlinx.datetime.internal.MathKt.randomUnsafeOrNull(localDateProgression.getLongProgression(), random);
        if (randomUnsafeOrNull != null) {
            return kotlinx.datetime.LocalDate.INSTANCE.fromEpochDays(randomUnsafeOrNull.longValue());
        }
        return null;
    }

    public static /* synthetic */ kotlinx.datetime.LocalDate randomOrNull$default(kotlinx.datetime.LocalDateProgression localDateProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return randomOrNull(localDateProgression, random);
    }
}
