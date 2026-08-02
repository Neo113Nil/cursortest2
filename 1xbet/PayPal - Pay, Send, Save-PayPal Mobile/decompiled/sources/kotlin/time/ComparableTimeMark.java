package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0010H¦\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "Lkotlin/time/Duration;", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "minus-LRDsOJo", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "", "compareTo", "(Lkotlin/time/ComparableTimeMark;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ComparableTimeMark extends kotlin.time.TimeMark, java.lang.Comparable<kotlin.time.ComparableTimeMark> {
    int compareTo(kotlin.time.ComparableTimeMark other);

    boolean equals(java.lang.Object other);

    int hashCode();

    @Override // kotlin.time.TimeMark
    /* renamed from: minus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo23934minusLRDsOJo(long duration);

    /* renamed from: minus-UwyO8pc */
    long mo23935minusUwyO8pc(kotlin.time.ComparableTimeMark other);

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo23936plusLRDsOJo(long duration);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.ComparableTimeMark m23937minusLRDsOJo(kotlin.time.ComparableTimeMark comparableTimeMark, long j) {
            return comparableTimeMark.mo23936plusLRDsOJo(kotlin.time.Duration.m23981unaryMinusUwyO8pc(j));
        }

        public static int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark, kotlin.time.ComparableTimeMark comparableTimeMark2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparableTimeMark2, "");
            return kotlin.time.Duration.m23941compareToLRDsOJo(comparableTimeMark.mo23935minusUwyO8pc(comparableTimeMark2), kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc());
        }
    }
}
