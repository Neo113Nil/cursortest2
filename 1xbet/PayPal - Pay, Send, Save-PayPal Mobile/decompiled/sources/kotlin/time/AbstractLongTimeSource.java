package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0011\u001a\u00020\u00068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()J", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "LongTimeMark"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AbstractLongTimeSource implements kotlin.time.TimeSource.WithComparableMarks {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final kotlin.time.DurationUnit unit;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        this.unit = durationUnit;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlin.time.AbstractLongTimeSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                long read;
                read = kotlin.time.AbstractLongTimeSource.this.read();
                return java.lang.Long.valueOf(read);
            }
        });
    }

    protected final kotlin.time.DurationUnit getUnit() {
        return this.unit;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "p0", "Lkotlin/time/AbstractLongTimeSource;", "p1", "Lkotlin/time/Duration;", "p2", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/time/AbstractLongTimeSource;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class LongTimeMark implements kotlin.time.ComparableTimeMark {
        private final kotlin.time.AbstractLongTimeSource getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final long getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor;

        private LongTimeMark(long j, kotlin.time.AbstractLongTimeSource abstractLongTimeSource, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractLongTimeSource, "");
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighResolutionOutputSizeshNQ4ISI = abstractLongTimeSource;
            this.getHighSpeedVideoSizes = j2;
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
        /* renamed from: minus-LRDsOJo */
        public final /* bridge */ kotlin.time.ComparableTimeMark mo23934minusLRDsOJo(long j) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.m23937minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public final long mo23933elapsedNowUwyO8pc() {
            return kotlin.time.Duration.m23965minusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(kotlin.time.AbstractLongTimeSource.access$adjustedRead(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.getUnit()), this.getHighSpeedVideoSizes);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public final kotlin.time.ComparableTimeMark mo23936plusLRDsOJo(long p0) {
            kotlin.time.DurationUnit unit = this.getHighResolutionOutputSizeshNQ4ISI.getUnit();
            if (kotlin.time.Duration.m23962isInfiniteimpl(p0)) {
                return new kotlin.time.AbstractLongTimeSource.LongTimeMark(kotlin.time.LongSaturatedMathKt.m24020saturatingAddNuflL3o(this.getHighSpeedVideoFpsRangesFor, unit, p0), this.getHighResolutionOutputSizeshNQ4ISI, kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc(), null);
            }
            long m23980truncateToUwyO8pc$kotlin_stdlib = kotlin.time.Duration.m23980truncateToUwyO8pc$kotlin_stdlib(p0, unit);
            long m23966plusLRDsOJo = kotlin.time.Duration.m23966plusLRDsOJo(kotlin.time.Duration.m23965minusLRDsOJo(p0, m23980truncateToUwyO8pc$kotlin_stdlib), this.getHighSpeedVideoSizes);
            long m24020saturatingAddNuflL3o = kotlin.time.LongSaturatedMathKt.m24020saturatingAddNuflL3o(this.getHighSpeedVideoFpsRangesFor, unit, m23980truncateToUwyO8pc$kotlin_stdlib);
            long m23980truncateToUwyO8pc$kotlin_stdlib2 = kotlin.time.Duration.m23980truncateToUwyO8pc$kotlin_stdlib(m23966plusLRDsOJo, unit);
            long m24020saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m24020saturatingAddNuflL3o(m24020saturatingAddNuflL3o, unit, m23980truncateToUwyO8pc$kotlin_stdlib2);
            long m23965minusLRDsOJo = kotlin.time.Duration.m23965minusLRDsOJo(m23966plusLRDsOJo, m23980truncateToUwyO8pc$kotlin_stdlib2);
            long m23955getInWholeNanosecondsimpl = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(m23965minusLRDsOJo);
            if (m24020saturatingAddNuflL3o2 != 0 && m23955getInWholeNanosecondsimpl != 0 && (m24020saturatingAddNuflL3o2 ^ m23955getInWholeNanosecondsimpl) < 0) {
                long duration = kotlin.time.DurationKt.toDuration(kotlin.math.MathKt.getSign(m23955getInWholeNanosecondsimpl), unit);
                m24020saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m24020saturatingAddNuflL3o(m24020saturatingAddNuflL3o2, unit, duration);
                m23965minusLRDsOJo = kotlin.time.Duration.m23965minusLRDsOJo(m23965minusLRDsOJo, duration);
            }
            if ((1 | (m24020saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                m23965minusLRDsOJo = kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
            }
            return new kotlin.time.AbstractLongTimeSource.LongTimeMark(m24020saturatingAddNuflL3o2, this.getHighResolutionOutputSizeshNQ4ISI, m23965minusLRDsOJo, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public final long mo23935minusUwyO8pc(kotlin.time.ComparableTimeMark p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) {
                kotlin.time.AbstractLongTimeSource.LongTimeMark longTimeMark = (kotlin.time.AbstractLongTimeSource.LongTimeMark) p0;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, longTimeMark.getHighResolutionOutputSizeshNQ4ISI)) {
                    return kotlin.time.Duration.m23966plusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.getHighSpeedVideoFpsRangesFor, longTimeMark.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.getUnit()), kotlin.time.Duration.m23965minusLRDsOJo(this.getHighSpeedVideoSizes, longTimeMark.getHighSpeedVideoSizes));
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
            return (p0 instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((kotlin.time.AbstractLongTimeSource.LongTimeMark) p0).getHighResolutionOutputSizeshNQ4ISI) && kotlin.time.Duration.m23947equalsimpl0(mo23935minusUwyO8pc((kotlin.time.ComparableTimeMark) p0), kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public final int hashCode() {
            return (kotlin.time.Duration.m23960hashCodeimpl(this.getHighSpeedVideoSizes) * 37) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LongTimeMark(");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(kotlin.time.DurationUnitKt.shortName(this.getHighResolutionOutputSizeshNQ4ISI.getUnit()));
            sb.append(" + ");
            sb.append((java.lang.Object) kotlin.time.Duration.m23977toStringimpl(this.getHighSpeedVideoSizes));
            sb.append(", ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ LongTimeMark(long j, kotlin.time.AbstractLongTimeSource abstractLongTimeSource, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }
    }

    @Override // kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
        return new kotlin.time.AbstractLongTimeSource.LongTimeMark(read() - ((java.lang.Number) this.getHighSpeedVideoFpsRanges.getValue()).longValue(), this, kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc(), null);
    }

    public static final /* synthetic */ long access$adjustedRead(kotlin.time.AbstractLongTimeSource abstractLongTimeSource) {
        return abstractLongTimeSource.read() - ((java.lang.Number) abstractLongTimeSource.getHighSpeedVideoFpsRanges.getValue()).longValue();
    }
}
