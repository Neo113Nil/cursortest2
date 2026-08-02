package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Lkotlin/time/TimeMark;", "", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "minus-LRDsOJo", "minus", "", "hasPassedNow", "()Z", "hasNotPassedNow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeMark {
    /* renamed from: elapsedNow-UwyO8pc */
    long mo23933elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* renamed from: minus-LRDsOJo */
    kotlin.time.TimeMark mo23934minusLRDsOJo(long duration);

    /* renamed from: plus-LRDsOJo */
    kotlin.time.TimeMark mo23936plusLRDsOJo(long duration);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m24027plusLRDsOJo(kotlin.time.TimeMark timeMark, long j) {
            return new kotlin.time.AdjustedTimeMark(timeMark, j, null);
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m24026minusLRDsOJo(kotlin.time.TimeMark timeMark, long j) {
            return timeMark.mo23936plusLRDsOJo(kotlin.time.Duration.m23981unaryMinusUwyO8pc(j));
        }

        public static boolean hasPassedNow(kotlin.time.TimeMark timeMark) {
            return !kotlin.time.Duration.m23963isNegativeimpl(timeMark.mo23933elapsedNowUwyO8pc());
        }

        public static boolean hasNotPassedNow(kotlin.time.TimeMark timeMark) {
            return kotlin.time.Duration.m23963isNegativeimpl(timeMark.mo23933elapsedNowUwyO8pc());
        }
    }
}
