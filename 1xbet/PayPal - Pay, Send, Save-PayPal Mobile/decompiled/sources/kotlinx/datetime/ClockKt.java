package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/ClockKt__ClockKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockKt {
    public static final kotlin.time.Clock asClock(kotlin.time.TimeSource timeSource, kotlin.time.Instant instant) {
        return kotlinx.datetime.ClockKt__ClockKt.asClock(timeSource, instant);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This function is deprecated because Clock.System.asTimeSource can be confused with TimeSource.Monotonic, which are very different. See https://github.com/Kotlin/kotlinx-datetime/issues/372")
    public static final kotlin.time.TimeSource.WithComparableMarks asTimeSource(kotlin.time.Clock clock) {
        return kotlinx.datetime.ClockKt__ClockKt.asTimeSource(clock);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use Clock.todayIn instead", replaceWith = @kotlin.ReplaceWith(expression = "this.todayIn(timeZone)", imports = {}))
    public static final kotlinx.datetime.LocalDate todayAt(kotlin.time.Clock clock, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.ClockKt__ClockKt.todayAt(clock, timeZone);
    }

    public static final kotlinx.datetime.LocalDate todayIn(kotlin.time.Clock clock, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.ClockKt__ClockKt.todayIn(clock, timeZone);
    }
}
