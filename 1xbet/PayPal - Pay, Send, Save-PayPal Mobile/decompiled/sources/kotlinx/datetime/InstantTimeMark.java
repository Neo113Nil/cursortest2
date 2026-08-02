package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lkotlinx/datetime/InstantTimeMark;", "Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/Instant;", "p0", "Lkotlin/time/Clock;", "p1", "<init>", "(Lkotlin/time/Instant;Lkotlin/time/Clock;)V", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "minus-LRDsOJo", "minus", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "(Lkotlin/time/Instant;)Z", "(Lkotlin/time/Instant;J)Lkotlin/time/Instant;", "(Lkotlin/time/Instant;Lkotlin/time/Instant;)J", "getHighSpeedVideoFpsRangesFor", "Lkotlin/time/Instant;", "getHighSpeedVideoSizes", "Lkotlin/time/Clock;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class InstantTimeMark implements kotlin.time.ComparableTimeMark {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.time.Instant getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.time.Clock Camera2StreamConfigurationMap;

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
        return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
    }

    @Override // kotlin.time.TimeMark
    public final boolean hasNotPassedNow() {
        return kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public final boolean hasPassedNow() {
        return kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.ComparableTimeMark
    /* renamed from: minus-UwyO8pc */
    public final /* synthetic */ long mo23935minusUwyO8pc(kotlin.time.ComparableTimeMark comparableTimeMark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparableTimeMark, "");
        if (comparableTimeMark instanceof kotlinx.datetime.InstantTimeMark) {
            kotlinx.datetime.InstantTimeMark instantTimeMark = (kotlinx.datetime.InstantTimeMark) comparableTimeMark;
            if (kotlin.jvm.internal.Intrinsics.areEqual(instantTimeMark.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap)) {
                return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, instantTimeMark.getHighSpeedVideoSizes);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Subtracting or comparing time marks from different time sources is not possible: ");
        sb.append(this);
        sb.append(" and ");
        sb.append(comparableTimeMark);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public InstantTimeMark(kotlin.time.Instant instant, kotlin.time.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        this.getHighSpeedVideoSizes = instant;
        this.Camera2StreamConfigurationMap = clock;
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public final long mo23933elapsedNowUwyO8pc() {
        return getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap.now(), this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    public final kotlin.time.ComparableTimeMark mo23936plusLRDsOJo(long p0) {
        return new kotlinx.datetime.InstantTimeMark(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, p0), this.Camera2StreamConfigurationMap);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: minus-LRDsOJo */
    public final kotlin.time.ComparableTimeMark mo23934minusLRDsOJo(long p0) {
        return new kotlinx.datetime.InstantTimeMark(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, kotlin.time.Duration.m23981unaryMinusUwyO8pc(p0)), this.Camera2StreamConfigurationMap);
    }

    @Override // kotlin.time.ComparableTimeMark
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlinx.datetime.InstantTimeMark)) {
            return false;
        }
        kotlinx.datetime.InstantTimeMark instantTimeMark = (kotlinx.datetime.InstantTimeMark) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, instantTimeMark.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, instantTimeMark.getHighSpeedVideoSizes);
    }

    @Override // kotlin.time.ComparableTimeMark
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstantTimeMark(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    private static boolean getHighSpeedVideoFpsRanges(kotlin.time.Instant instant) {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(instant.m24018plusLRDsOJo(kotlin.time.DurationKt.toDuration(1, kotlin.time.DurationUnit.SECONDS)), instant)) {
            kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(instant.m24018plusLRDsOJo(kotlin.time.DurationKt.toDuration(-1, kotlin.time.DurationUnit.SECONDS)), instant)) {
                return false;
            }
        }
        return true;
    }

    private static kotlin.time.Instant getHighSpeedVideoFpsRanges(kotlin.time.Instant instant, long j) {
        if (getHighSpeedVideoFpsRanges(instant)) {
            if (kotlin.time.Duration.m23962isInfiniteimpl(j)) {
                if (kotlin.time.Duration.m23964isPositiveimpl(j) != (instant.compareTo(kotlin.time.Instant.INSTANCE.getDISTANT_FUTURE()) >= 0)) {
                    throw new java.lang.IllegalArgumentException("Summing infinities of different signs");
                }
            }
            return instant;
        }
        return instant.m24018plusLRDsOJo(j);
    }

    private static long getHighSpeedVideoFpsRanges(kotlin.time.Instant p0, kotlin.time.Instant p1) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, p1)) {
            return kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
        }
        if (getHighSpeedVideoFpsRanges(p0) || getHighSpeedVideoFpsRanges(p1)) {
            return kotlin.time.Duration.m23967timesUwyO8pc(p0.m24017minusUwyO8pc(p1), Double.POSITIVE_INFINITY);
        }
        return p0.m24017minusUwyO8pc(p1);
    }
}
