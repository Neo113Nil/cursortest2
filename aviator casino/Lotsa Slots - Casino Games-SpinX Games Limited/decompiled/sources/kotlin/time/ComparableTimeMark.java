package kotlin.time;

/* compiled from: TimeSource.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0011H¦\u0002J\b\u0010\u0012\u001a\u00020\u000eH&¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "plus", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "compareTo", "", "equals", "", "", "hashCode", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComparableTimeMark extends kotlin.time.TimeMark, java.lang.Comparable<kotlin.time.ComparableTimeMark> {
    int compareTo(kotlin.time.ComparableTimeMark other);

    boolean equals(java.lang.Object other);

    int hashCode();

    @Override // kotlin.time.TimeMark
    /* renamed from: minus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo12137minusLRDsOJo(long duration);

    /* renamed from: minus-UwyO8pc */
    long mo12138minusUwyO8pc(kotlin.time.ComparableTimeMark other);

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo12139plusLRDsOJo(long duration);

    /* compiled from: TimeSource.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.ComparableTimeMark m12141minusLRDsOJo(kotlin.time.ComparableTimeMark comparableTimeMark, long j) {
            return comparableTimeMark.mo12139plusLRDsOJo(kotlin.time.Duration.m12190unaryMinusUwyO8pc(j));
        }

        public static int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark, kotlin.time.ComparableTimeMark other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            return kotlin.time.Duration.m12145compareToLRDsOJo(comparableTimeMark.mo12138minusUwyO8pc(other), kotlin.time.Duration.INSTANCE.m12237getZEROUwyO8pc());
        }
    }
}
