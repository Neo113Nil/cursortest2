package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/time/TimeSource;", "", "Lkotlin/time/TimeMark;", "markNow", "()Lkotlin/time/TimeMark;", "Companion", "WithComparableMarks", "Monotonic"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.TimeSource.Companion INSTANCE = kotlin.time.TimeSource.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface WithComparableMarks extends kotlin.time.TimeSource {
        @Override // kotlin.time.TimeSource
        kotlin.time.ComparableTimeMark markNow();
    }

    kotlin.time.TimeMark markNow();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "markNow", "", "toString", "()Ljava/lang/String;", "ValueTimeMark"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Monotonic implements kotlin.time.TimeSource.WithComparableMarks {
        public static final kotlin.time.TimeSource.Monotonic INSTANCE = new kotlin.time.TimeSource.Monotonic();

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public final /* synthetic */ kotlin.time.ComparableTimeMark markNow() {
            return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24029boximpl(m24028markNowz9LOYto());
        }

        @Override // kotlin.time.TimeSource
        public final /* synthetic */ kotlin.time.TimeMark markNow() {
            return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24029boximpl(m24028markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public final long m24028markNowz9LOYto() {
            return kotlin.time.MonotonicTimeSource.INSTANCE.m24024markNowz9LOYto();
        }

        public final java.lang.String toString() {
            return kotlin.time.MonotonicTimeSource.INSTANCE.toString();
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0018\u0010(\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "constructor-impl", "(J)J", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "elapsedNow", "duration", "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", "hasPassedNow-impl", "(J)Z", "hasPassedNow", "hasNotPassedNow-impl", "hasNotPassedNow", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "", "compareTo-6eNON_k", "(JJ)I", "compareTo", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlin.jvm.JvmInline
        /* loaded from: classes17.dex */
        public static final class ValueTimeMark implements kotlin.time.ComparableTimeMark {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final long getHighSpeedVideoSizes;

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m24032constructorimpl(long j) {
                return j;
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m24035equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* renamed from: compareTo-impl, reason: not valid java name */
            public static int m24031compareToimpl(long j, kotlin.time.ComparableTimeMark comparableTimeMark) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparableTimeMark, "");
                return m24029boximpl(j).compareTo(comparableTimeMark);
            }

            @Override // java.lang.Comparable
            public final /* bridge */ int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
                return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public final /* synthetic */ kotlin.time.ComparableTimeMark mo23934minusLRDsOJo(long j) {
                return m24029boximpl(m24044minusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public final /* synthetic */ kotlin.time.TimeMark mo23934minusLRDsOJo(long j) {
                return m24029boximpl(m24044minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public final /* synthetic */ kotlin.time.ComparableTimeMark mo23936plusLRDsOJo(long j) {
                return m24029boximpl(m24045plusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public final /* synthetic */ kotlin.time.TimeMark mo23936plusLRDsOJo(long j) {
                return m24029boximpl(m24045plusLRDsOJo(j));
            }

            private /* synthetic */ ValueTimeMark(long j) {
                this.getHighSpeedVideoSizes = j;
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m24033elapsedNowUwyO8pc(long j) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m24023elapsedFrom6eNON_k(j);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public final long mo23933elapsedNowUwyO8pc() {
                return m24033elapsedNowUwyO8pc(this.getHighSpeedVideoSizes);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m24042plusLRDsOJo(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m24021adjustReading6QKq23U(j, j2);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public final long m24045plusLRDsOJo(long j) {
                return m24042plusLRDsOJo(this.getHighSpeedVideoSizes, j);
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m24040minusLRDsOJo(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m24021adjustReading6QKq23U(j, kotlin.time.Duration.m23981unaryMinusUwyO8pc(j2));
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public final long m24044minusLRDsOJo(long j) {
                return m24040minusLRDsOJo(this.getHighSpeedVideoSizes, j);
            }

            /* renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m24037hasPassedNowimpl(long j) {
                return !kotlin.time.Duration.m23963isNegativeimpl(m24033elapsedNowUwyO8pc(j));
            }

            @Override // kotlin.time.TimeMark
            public final boolean hasPassedNow() {
                return m24037hasPassedNowimpl(this.getHighSpeedVideoSizes);
            }

            /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m24036hasNotPassedNowimpl(long j) {
                return kotlin.time.Duration.m23963isNegativeimpl(m24033elapsedNowUwyO8pc(j));
            }

            @Override // kotlin.time.TimeMark
            public final boolean hasNotPassedNow() {
                return m24036hasNotPassedNowimpl(this.getHighSpeedVideoSizes);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public final long mo23935minusUwyO8pc(kotlin.time.ComparableTimeMark comparableTimeMark) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparableTimeMark, "");
                return m24041minusUwyO8pc(this.getHighSpeedVideoSizes, comparableTimeMark);
            }

            /* renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m24041minusUwyO8pc(long j, kotlin.time.ComparableTimeMark comparableTimeMark) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparableTimeMark, "");
                if (!(comparableTimeMark instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Subtracting or comparing time marks from different time sources is not possible: ");
                    sb.append((java.lang.Object) m24043toStringimpl(j));
                    sb.append(" and ");
                    sb.append(comparableTimeMark);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                return m24039minus6eNON_k(j, ((kotlin.time.TimeSource.Monotonic.ValueTimeMark) comparableTimeMark).getGetHighSpeedVideoSizes());
            }

            /* renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m24039minus6eNON_k(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m24022differenceBetweenfRLX17w(j, j2);
            }

            /* renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m24030compareTo6eNON_k(long j, long j2) {
                return kotlin.time.Duration.m23941compareToLRDsOJo(m24039minus6eNON_k(j, j2), kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc());
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoSizes;
            }

            public final java.lang.String toString() {
                return m24043toStringimpl(this.getHighSpeedVideoSizes);
            }

            @Override // kotlin.time.ComparableTimeMark
            public final int hashCode() {
                return m24038hashCodeimpl(this.getHighSpeedVideoSizes);
            }

            @Override // kotlin.time.ComparableTimeMark
            public final boolean equals(java.lang.Object other) {
                return m24034equalsimpl(this.getHighSpeedVideoSizes, other);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static java.lang.String m24043toStringimpl(long j) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ValueTimeMark(reading=");
                sb.append(j);
                sb.append(')');
                return sb.toString();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m24038hashCodeimpl(long j) {
                return java.lang.Long.hashCode(j);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m24034equalsimpl(long j, java.lang.Object obj) {
                return (obj instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark) && j == ((kotlin.time.TimeSource.Monotonic.ValueTimeMark) obj).getGetHighSpeedVideoSizes();
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ kotlin.time.TimeSource.Monotonic.ValueTimeMark m24029boximpl(long j) {
                return new kotlin.time.TimeSource.Monotonic.ValueTimeMark(j);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ kotlin.time.TimeSource.Companion getHighResolutionOutputSizeshNQ4ISI = new kotlin.time.TimeSource.Companion();

        private Companion() {
        }
    }
}
