package kotlin.time;

/* compiled from: longSaturatedMath.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongSaturatedMathKt {
    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m12251saturatingAddNuflL3o(long j, kotlin.time.DurationUnit unit, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        long m12185toLongimpl = kotlin.time.Duration.m12185toLongimpl(j2, unit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m12250checkInfiniteSumDefinedPjuGub4(j, j2, m12185toLongimpl);
        }
        if ((1 | (m12185toLongimpl - 1)) == Long.MAX_VALUE) {
            return m12252saturatingAddInHalvesNuflL3o(j, unit, j2);
        }
        long j3 = j + m12185toLongimpl;
        return ((j ^ j3) & (m12185toLongimpl ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m12250checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!kotlin.time.Duration.m12171isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m12252saturatingAddInHalvesNuflL3o(long j, kotlin.time.DurationUnit durationUnit, long j2) {
        long m12149divUwyO8pc = kotlin.time.Duration.m12149divUwyO8pc(j2, 2);
        long m12185toLongimpl = kotlin.time.Duration.m12185toLongimpl(m12149divUwyO8pc, durationUnit);
        return (1 | (m12185toLongimpl - 1)) == Long.MAX_VALUE ? m12185toLongimpl : m12251saturatingAddNuflL3o(m12251saturatingAddNuflL3o(j, durationUnit, m12149divUwyO8pc), durationUnit, kotlin.time.Duration.m12174minusLRDsOJo(j2, m12149divUwyO8pc));
    }

    private static final long infinityOfSign(long j) {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return j < 0 ? companion.m12236getNEG_INFINITEUwyO8pc$kotlin_stdlib() : companion.m12235getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long j, long j2, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return kotlin.time.Duration.m12190unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc();
            }
            return kotlin.time.Duration.m12190unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j);
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, kotlin.time.DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (durationUnit.compareTo(kotlin.time.DurationUnit.MILLISECONDS) < 0) {
                long convertDurationUnit = kotlin.time.DurationUnitKt.convertDurationUnit(1L, kotlin.time.DurationUnit.MILLISECONDS, durationUnit);
                long j4 = (j / convertDurationUnit) - (j2 / convertDurationUnit);
                long j5 = (j % convertDurationUnit) - (j2 % convertDurationUnit);
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                return kotlin.time.Duration.m12175plusLRDsOJo(kotlin.time.DurationKt.toDuration(j4, kotlin.time.DurationUnit.MILLISECONDS), kotlin.time.DurationKt.toDuration(j5, durationUnit));
            }
            return kotlin.time.Duration.m12190unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return kotlin.time.DurationKt.toDuration(j3, durationUnit);
    }
}
