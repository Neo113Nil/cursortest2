package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u0005"}, d2 = {"Lkotlin/time/Clock;", "Lkotlinx/datetime/TimeZone;", "p0", "Lkotlinx/datetime/LocalDate;", "todayIn", "(Lkotlin/time/Clock;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/LocalDate;", "Lkotlin/time/TimeSource$WithComparableMarks;", "asTimeSource", "(Lkotlin/time/Clock;)Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "Lkotlin/time/Instant;", "asClock", "(Lkotlin/time/TimeSource;Lkotlin/time/Instant;)Lkotlin/time/Clock;", "todayAt"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/datetime/ClockKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ClockKt__ClockKt {
    public static final kotlinx.datetime.LocalDate todayIn(kotlin.time.Clock clock, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.TimeZoneKt.toLocalDateTime(clock.now(), timeZone).getDate();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This function is deprecated because Clock.System.asTimeSource can be confused with TimeSource.Monotonic, which are very different. See https://github.com/Kotlin/kotlinx-datetime/issues/372")
    public static final kotlin.time.TimeSource.WithComparableMarks asTimeSource(final kotlin.time.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        return new kotlin.time.TimeSource.WithComparableMarks() { // from class: kotlinx.datetime.ClockKt__ClockKt$asTimeSource$1
            @Override // kotlin.time.TimeSource
            public final kotlin.time.ComparableTimeMark markNow() {
                return new kotlinx.datetime.InstantTimeMark(kotlin.time.Clock.this.now(), kotlin.time.Clock.this);
            }
        };
    }

    public static final kotlin.time.Clock asClock(final kotlin.time.TimeSource timeSource, final kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return new kotlin.time.Clock(timeSource, instant) { // from class: kotlinx.datetime.ClockKt__ClockKt$asClock$1
            final /* synthetic */ kotlin.time.Instant getHighSpeedVideoFpsRangesFor;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final kotlin.time.TimeMark getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = instant;
                this.getHighSpeedVideoFpsRangesFor = timeSource.markNow();
            }

            @Override // kotlin.time.Clock
            public final kotlin.time.Instant now() {
                return this.getHighSpeedVideoFpsRangesFor.m24018plusLRDsOJo(this.getHighSpeedVideoFpsRangesFor.mo23933elapsedNowUwyO8pc());
            }
        };
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use Clock.todayIn instead", replaceWith = @kotlin.ReplaceWith(expression = "this.todayIn(timeZone)", imports = {}))
    public static final kotlinx.datetime.LocalDate todayAt(kotlin.time.Clock clock, kotlinx.datetime.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return kotlinx.datetime.ClockKt.todayIn(clock, timeZone);
    }
}
