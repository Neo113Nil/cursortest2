package kotlin.time;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()D", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "DoubleTimeMark"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractDoubleTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;

    protected abstract double read();

    public AbstractDoubleTimeSource(kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        this.unit = durationUnit;
    }

    protected final kotlin.time.DurationUnit getUnit() {
        return this.unit;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "p0", "Lkotlin/time/AbstractDoubleTimeSource;", "p1", "Lkotlin/time/Duration;", "p2", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "D", "Camera2StreamConfigurationMap", "Lkotlin/time/AbstractDoubleTimeSource;", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class DoubleTimeMark implements kotlin.time.ComparableTimeMark {
        private final kotlin.time.AbstractDoubleTimeSource Camera2StreamConfigurationMap;
        private final double getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor;

        private DoubleTimeMark(double d, kotlin.time.AbstractDoubleTimeSource abstractDoubleTimeSource, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractDoubleTimeSource, "");
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.Camera2StreamConfigurationMap = abstractDoubleTimeSource;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public final /* bridge */ boolean hasNotPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public final /* bridge */ boolean hasPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public final /* bridge */ kotlin.time.ComparableTimeMark mo23934minusLRDsOJo(long j) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.m23937minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public final long mo23933elapsedNowUwyO8pc() {
            return kotlin.time.Duration.m23965minusLRDsOJo(kotlin.time.DurationKt.toDuration(this.Camera2StreamConfigurationMap.read() - this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getUnit()), this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public final kotlin.time.ComparableTimeMark mo23936plusLRDsOJo(long p0) {
            return new kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, kotlin.time.Duration.m23966plusLRDsOJo(this.getHighSpeedVideoFpsRangesFor, p0), null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc, reason: not valid java name */
        public final long mo23935minusUwyO8pc(kotlin.time.ComparableTimeMark p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) {
                kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark doubleTimeMark = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) p0;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, doubleTimeMark.Camera2StreamConfigurationMap)) {
                    if (kotlin.time.Duration.m23947equalsimpl0(this.getHighSpeedVideoFpsRangesFor, doubleTimeMark.getHighSpeedVideoFpsRangesFor) && kotlin.time.Duration.m23962isInfiniteimpl(this.getHighSpeedVideoFpsRangesFor)) {
                        return kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
                    }
                    long m23965minusLRDsOJo = kotlin.time.Duration.m23965minusLRDsOJo(this.getHighSpeedVideoFpsRangesFor, doubleTimeMark.getHighSpeedVideoFpsRangesFor);
                    long duration = kotlin.time.DurationKt.toDuration(this.getHighResolutionOutputSizeshNQ4ISI - doubleTimeMark.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getUnit());
                    return kotlin.time.Duration.m23947equalsimpl0(duration, kotlin.time.Duration.m23981unaryMinusUwyO8pc(m23965minusLRDsOJo)) ? kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc() : kotlin.time.Duration.m23966plusLRDsOJo(duration, m23965minusLRDsOJo);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Subtracting or comparing time marks from different time sources is not possible: ");
            sb.append(this);
            sb.append(" and ");
            sb.append(p0);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // kotlin.time.ComparableTimeMark
        public final boolean equals(java.lang.Object p0) {
            return (p0 instanceof kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) p0).Camera2StreamConfigurationMap) && kotlin.time.Duration.m23947equalsimpl0(mo23935minusUwyO8pc((kotlin.time.ComparableTimeMark) p0), kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public final int hashCode() {
            return kotlin.time.Duration.m23960hashCodeimpl(kotlin.time.Duration.m23966plusLRDsOJo(kotlin.time.DurationKt.toDuration(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getUnit()), this.getHighSpeedVideoFpsRangesFor));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DoubleTimeMark(");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(kotlin.time.DurationUnitKt.shortName(this.Camera2StreamConfigurationMap.getUnit()));
            sb.append(" + ");
            sb.append((java.lang.Object) kotlin.time.Duration.m23977toStringimpl(this.getHighSpeedVideoFpsRangesFor));
            sb.append(", ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ DoubleTimeMark(double d, kotlin.time.AbstractDoubleTimeSource abstractDoubleTimeSource, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(d, abstractDoubleTimeSource, j);
        }
    }

    @Override // kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
        return new kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark(read(), this, kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc(), null);
    }
}
