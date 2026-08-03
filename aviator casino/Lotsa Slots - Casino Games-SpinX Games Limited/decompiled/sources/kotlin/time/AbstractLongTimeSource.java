package kotlin.time;

/* compiled from: TimeSources.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "zero", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractLongTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;

    /* renamed from: zero$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy zero;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlin.time.AbstractLongTimeSource$$ExternalSyntheticLambda0
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

    private final long getZero() {
        return ((java.lang.Number) this.zero.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    /* compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class LongTimeMark implements kotlin.time.ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final kotlin.time.AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, kotlin.time.AbstractLongTimeSource abstractLongTimeSource, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        private LongTimeMark(long j, kotlin.time.AbstractLongTimeSource timeSource, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j;
            this.timeSource = timeSource;
            this.offset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo12137minusLRDsOJo(long j) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.m12141minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo12136elapsedNowUwyO8pc() {
            return kotlin.time.Duration.m12174minusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo12139plusLRDsOJo(long duration) {
            kotlin.time.DurationUnit unit = this.timeSource.getUnit();
            if (kotlin.time.Duration.m12171isInfiniteimpl(duration)) {
                return new kotlin.time.AbstractLongTimeSource.LongTimeMark(kotlin.time.LongSaturatedMathKt.m12251saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc(), null);
            }
            long m12189truncateToUwyO8pc$kotlin_stdlib = kotlin.time.Duration.m12189truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long m12175plusLRDsOJo = kotlin.time.Duration.m12175plusLRDsOJo(kotlin.time.Duration.m12174minusLRDsOJo(duration, m12189truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long m12251saturatingAddNuflL3o = kotlin.time.LongSaturatedMathKt.m12251saturatingAddNuflL3o(this.startedAt, unit, m12189truncateToUwyO8pc$kotlin_stdlib);
            long m12189truncateToUwyO8pc$kotlin_stdlib2 = kotlin.time.Duration.m12189truncateToUwyO8pc$kotlin_stdlib(m12175plusLRDsOJo, unit);
            long m12251saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m12251saturatingAddNuflL3o(m12251saturatingAddNuflL3o, unit, m12189truncateToUwyO8pc$kotlin_stdlib2);
            long m12174minusLRDsOJo = kotlin.time.Duration.m12174minusLRDsOJo(m12175plusLRDsOJo, m12189truncateToUwyO8pc$kotlin_stdlib2);
            long m12159getInWholeNanosecondsimpl = kotlin.time.Duration.m12159getInWholeNanosecondsimpl(m12174minusLRDsOJo);
            if (m12251saturatingAddNuflL3o2 != 0 && m12159getInWholeNanosecondsimpl != 0 && (m12251saturatingAddNuflL3o2 ^ m12159getInWholeNanosecondsimpl) < 0) {
                long duration2 = kotlin.time.DurationKt.toDuration(kotlin.math.MathKt.getSign(m12159getInWholeNanosecondsimpl), unit);
                m12251saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m12251saturatingAddNuflL3o(m12251saturatingAddNuflL3o2, unit, duration2);
                m12174minusLRDsOJo = kotlin.time.Duration.m12174minusLRDsOJo(m12174minusLRDsOJo, duration2);
            }
            if ((1 | (m12251saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                m12174minusLRDsOJo = kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc();
            }
            return new kotlin.time.AbstractLongTimeSource.LongTimeMark(m12251saturatingAddNuflL3o2, this.timeSource, m12174minusLRDsOJo, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo12138minusUwyO8pc(kotlin.time.ComparableTimeMark other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) {
                kotlin.time.AbstractLongTimeSource.LongTimeMark longTimeMark = (kotlin.time.AbstractLongTimeSource.LongTimeMark) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return kotlin.time.Duration.m12175plusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), kotlin.time.Duration.m12174minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(java.lang.Object other) {
            return (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, ((kotlin.time.AbstractLongTimeSource.LongTimeMark) other).timeSource) && kotlin.time.Duration.m12151equalsimpl0(mo12138minusUwyO8pc((kotlin.time.ComparableTimeMark) other), kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (kotlin.time.Duration.m12167hashCodeimpl(this.offset) * 37) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.startedAt);
        }

        public java.lang.String toString() {
            return "LongTimeMark(" + this.startedAt + kotlin.time.DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    @Override // kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
        return new kotlin.time.AbstractLongTimeSource.LongTimeMark(adjustedRead(), this, kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc(), null);
    }
}
