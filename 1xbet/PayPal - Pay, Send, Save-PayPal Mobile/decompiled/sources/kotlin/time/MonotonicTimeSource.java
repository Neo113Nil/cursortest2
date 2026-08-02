package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "markNow", "timeMark", "Lkotlin/time/Duration;", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "one", "another", "differenceBetween-fRLX17w", "(JJ)J", "differenceBetween", "duration", "adjustReading-6QKq23U", "adjustReading", "", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MonotonicTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    public static final kotlin.time.MonotonicTimeSource INSTANCE = new kotlin.time.MonotonicTimeSource();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final long getHighSpeedVideoFpsRangesFor = java.lang.System.nanoTime();

    private MonotonicTimeSource() {
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public final /* synthetic */ kotlin.time.ComparableTimeMark markNow() {
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24029boximpl(m24024markNowz9LOYto());
    }

    @Override // kotlin.time.TimeSource
    public final /* synthetic */ kotlin.time.TimeMark markNow() {
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24029boximpl(m24024markNowz9LOYto());
    }

    public final java.lang.String toString() {
        return "TimeSource(System.nanoTime())";
    }

    /* renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m24022differenceBetweenfRLX17w(long one, long another) {
        return kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(one, another, kotlin.time.DurationUnit.NANOSECONDS);
    }

    /* renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m24021adjustReading6QKq23U(long timeMark, long duration) {
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24032constructorimpl(kotlin.time.LongSaturatedMathKt.m24020saturatingAddNuflL3o(timeMark, kotlin.time.DurationUnit.NANOSECONDS, duration));
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m24023elapsedFrom6eNON_k(long timeMark) {
        return kotlin.time.LongSaturatedMathKt.saturatingDiff(java.lang.System.nanoTime() - getHighSpeedVideoFpsRangesFor, timeMark, kotlin.time.DurationUnit.NANOSECONDS);
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public final long m24024markNowz9LOYto() {
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24032constructorimpl(java.lang.System.nanoTime() - getHighSpeedVideoFpsRangesFor);
    }
}
