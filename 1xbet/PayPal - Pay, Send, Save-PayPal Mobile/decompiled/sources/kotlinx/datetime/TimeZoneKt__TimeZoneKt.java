package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005*\n\u0010\u0007\"\u00020\u00062\u00020\u0006"}, d2 = {"Lkotlin/time/Instant;", "Lkotlinx/datetime/TimeZone;", "p0", "Lkotlinx/datetime/UtcOffset;", "offsetIn", "(Lkotlin/time/Instant;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "ZoneOffset"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/TimeZoneKt")
/* loaded from: classes17.dex */
final /* synthetic */ class TimeZoneKt__TimeZoneKt {
    public static final kotlinx.datetime.UtcOffset offsetIn(kotlin.time.Instant instant, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.TimeZoneKt.offsetAt(timeZone, instant);
    }
}
