package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\f\u001a'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\f\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "duration", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "valueNs", "origin", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "saturatingOriginsDiff", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "", "isSaturated", "(J)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LongSaturatedMathKt {
    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m24020saturatingAddNuflL3o(long j, kotlin.time.DurationUnit durationUnit, long j2) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
            long m23976toLongimpl = kotlin.time.Duration.m23976toLongimpl(j2, durationUnit);
            if (((j - 1) | 1) == Long.MAX_VALUE) {
                if (!kotlin.time.Duration.m23962isInfiniteimpl(j2) || (j ^ m23976toLongimpl) >= 0) {
                    return j;
                }
                throw new java.lang.IllegalArgumentException("Summing infinities of different signs");
            }
            if (((m23976toLongimpl - 1) | 1) != Long.MAX_VALUE) {
                long j3 = j + m23976toLongimpl;
                return ((m23976toLongimpl ^ j3) & (j ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
            }
            long m23945divUwyO8pc = kotlin.time.Duration.m23945divUwyO8pc(j2, 2);
            long m23976toLongimpl2 = kotlin.time.Duration.m23976toLongimpl(m23945divUwyO8pc, durationUnit);
            if ((1 | (m23976toLongimpl2 - 1)) == Long.MAX_VALUE) {
                return m23976toLongimpl2;
            }
            j = m24020saturatingAddNuflL3o(j, durationUnit, m23945divUwyO8pc);
            j2 = kotlin.time.Duration.m23965minusLRDsOJo(j2, m23945divUwyO8pc);
        }
    }

    public static final long saturatingOriginsDiff(long j, long j2, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
            }
            return kotlin.time.Duration.m23981unaryMinusUwyO8pc(j2 < 0 ? kotlin.time.Duration.INSTANCE.m24010getNEG_INFINITEUwyO8pc$kotlin_stdlib() : kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc());
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return j < 0 ? kotlin.time.Duration.INSTANCE.m24010getNEG_INFINITEUwyO8pc$kotlin_stdlib() : kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc();
        }
        return getHighSpeedVideoFpsRanges(j, j2, durationUnit);
    }

    private static final long getHighSpeedVideoFpsRanges(long j, long j2, kotlin.time.DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (durationUnit.compareTo(kotlin.time.DurationUnit.MILLISECONDS) < 0) {
                long convertDurationUnit = kotlin.time.DurationUnitKt.convertDurationUnit(1L, kotlin.time.DurationUnit.MILLISECONDS, durationUnit);
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                return kotlin.time.Duration.m23966plusLRDsOJo(kotlin.time.DurationKt.toDuration((j / convertDurationUnit) - (j2 / convertDurationUnit), kotlin.time.DurationUnit.MILLISECONDS), kotlin.time.DurationKt.toDuration((j % convertDurationUnit) - (j2 % convertDurationUnit), durationUnit));
            }
            return kotlin.time.Duration.m23981unaryMinusUwyO8pc(j3 < 0 ? kotlin.time.Duration.INSTANCE.m24010getNEG_INFINITEUwyO8pc$kotlin_stdlib() : kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc());
        }
        return kotlin.time.DurationKt.toDuration(j3, durationUnit);
    }

    public static final long saturatingDiff(long j, long j2, kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return kotlin.time.Duration.m23981unaryMinusUwyO8pc(j2 < 0 ? kotlin.time.Duration.INSTANCE.m24010getNEG_INFINITEUwyO8pc$kotlin_stdlib() : kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc());
        }
        return getHighSpeedVideoFpsRanges(j, j2, durationUnit);
    }
}
