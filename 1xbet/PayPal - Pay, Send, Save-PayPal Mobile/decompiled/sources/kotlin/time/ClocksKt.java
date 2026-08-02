package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/time/TimeSource;", "Lkotlin/time/Instant;", "origin", "Lkotlin/time/Clock;", "fromTimeSource", "(Lkotlin/time/TimeSource;Lkotlin/time/Instant;)Lkotlin/time/Clock;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClocksKt {
    public static final kotlin.time.Clock fromTimeSource(final kotlin.time.TimeSource timeSource, final kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return new kotlin.time.Clock(timeSource, instant) { // from class: kotlin.time.ClocksKt$asClock$1

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final kotlin.time.TimeMark Camera2StreamConfigurationMap;
            final /* synthetic */ kotlin.time.Instant getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = instant;
                this.Camera2StreamConfigurationMap = timeSource.markNow();
            }

            @Override // kotlin.time.Clock
            public final kotlin.time.Instant now() {
                return this.getHighSpeedVideoFpsRangesFor.m24018plusLRDsOJo(this.Camera2StreamConfigurationMap.mo23933elapsedNowUwyO8pc());
            }
        };
    }
}
