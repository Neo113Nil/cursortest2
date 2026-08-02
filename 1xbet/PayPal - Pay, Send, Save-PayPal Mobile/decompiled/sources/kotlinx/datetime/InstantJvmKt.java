package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/InstantJvmKt__InstantKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstantJvmKt {
    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.minus(instant, i, dateTimeUnit, timeZone);
    }

    public static final kotlinx.datetime.DateTimePeriod periodUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.periodUntil(instant, instant2, timeZone);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.plus(instant, i, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.plus(instant, j, timeBased);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.plus(instant, j, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimePeriod dateTimePeriod, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.plus(instant, dateTimePeriod, timeZone);
    }

    @kotlin.Deprecated(message = "Use the plus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.plus(1, unit, timeZone)", imports = {}))
    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.plus(instant, dateTimeUnit, timeZone);
    }

    public static final long until(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantJvmKt__InstantKt.until(instant, instant2, dateTimeUnit, timeZone);
    }
}
