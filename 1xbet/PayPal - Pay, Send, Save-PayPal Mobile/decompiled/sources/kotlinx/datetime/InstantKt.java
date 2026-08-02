package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/InstantKt__InstantKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstantKt {
    public static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    public static final long DISTANT_PAST_SECONDS = -3217862419201L;

    public static final int daysUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.daysUntil(instant, instant2, timeZone);
    }

    public static final java.lang.String format(kotlin.time.Instant instant, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat, kotlinx.datetime.UtcOffset utcOffset) {
        return kotlinx.datetime.InstantKt__InstantKt.format(instant, dateTimeFormat, utcOffset);
    }

    public static final long minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, instant2, timeBased);
    }

    public static final long minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, instant2, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, i, timeBased);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, j, timeBased);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, long j, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, j, dateTimeUnit, timeZone);
    }

    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimePeriod dateTimePeriod, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, dateTimePeriod, timeZone);
    }

    @kotlin.Deprecated(message = "Use the minus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.minus(1, unit)", imports = {}))
    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, timeBased);
    }

    @kotlin.Deprecated(message = "Use the minus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.minus(1, unit, timeZone)", imports = {}))
    public static final kotlin.time.Instant minus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit dateTimeUnit, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, dateTimeUnit, timeZone);
    }

    public static final kotlinx.datetime.DateTimePeriod minus(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.minus(instant, instant2, timeZone);
    }

    public static final int monthsUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.monthsUntil(instant, instant2, timeZone);
    }

    public static final kotlin.time.Instant parse(kotlin.time.Instant.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat) {
        return kotlinx.datetime.InstantKt__InstantKt.parse(companion, charSequence, dateTimeFormat);
    }

    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, int i, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.plus(instant, i, timeBased);
    }

    @kotlin.Deprecated(message = "Use the plus overload with an explicit number of units", replaceWith = @kotlin.ReplaceWith(expression = "this.plus(1, unit)", imports = {}))
    public static final kotlin.time.Instant plus(kotlin.time.Instant instant, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.plus(instant, timeBased);
    }

    public static final long until(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.DateTimeUnit.TimeBased timeBased) {
        return kotlinx.datetime.InstantKt__InstantKt.until(instant, instant2, timeBased);
    }

    public static final int yearsUntil(kotlin.time.Instant instant, kotlin.time.Instant instant2, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.InstantKt__InstantKt.yearsUntil(instant, instant2, timeZone);
    }
}
