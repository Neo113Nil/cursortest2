package kotlinx.datetime;

@kotlin.Metadata(d1 = {"kotlinx/datetime/TimeZoneKt__TimeZoneJvmKt", "kotlinx/datetime/TimeZoneKt__TimeZoneKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeZoneKt {
    public static final kotlin.time.Instant atStartOfDayIn(kotlinx.datetime.LocalDate localDate, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.atStartOfDayIn(localDate, timeZone, overloadMarker);
    }

    public static final kotlinx.datetime.UtcOffset offsetAt(kotlinx.datetime.TimeZone timeZone, kotlin.time.Instant instant) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.offsetAt(timeZone, instant);
    }

    public static final kotlinx.datetime.UtcOffset offsetIn(kotlin.time.Instant instant, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneKt.offsetIn(instant, timeZone);
    }

    public static final kotlin.time.Instant toInstant(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.OverloadMarker overloadMarker) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.toInstant(localDateTime, timeZone, overloadMarker);
    }

    public static final kotlin.time.Instant toInstant(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.UtcOffset utcOffset, kotlinx.datetime.OverloadMarker overloadMarker) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.toInstant(localDateTime, utcOffset, overloadMarker);
    }

    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(kotlin.time.Instant instant, kotlinx.datetime.TimeZone timeZone) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.toLocalDateTime(instant, timeZone);
    }

    public static final kotlinx.datetime.LocalDateTime toLocalDateTime(kotlin.time.Instant instant, kotlinx.datetime.UtcOffset utcOffset) {
        return kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.toLocalDateTime(instant, utcOffset);
    }
}
