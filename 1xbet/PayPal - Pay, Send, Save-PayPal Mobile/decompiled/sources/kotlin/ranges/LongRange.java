package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001a"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(JJ)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(J)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart", "()Ljava/lang/Long;", "getEndInclusive", "getEndExclusive", "getEndExclusive$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LongRange extends kotlin.ranges.LongProgression implements kotlin.ranges.ClosedRange<java.lang.Long>, kotlin.ranges.OpenEndRange<java.lang.Long> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.LongRange.Companion INSTANCE = new kotlin.ranges.LongRange.Companion(null);
    private static final kotlin.ranges.LongRange EMPTY = new kotlin.ranges.LongRange(1, 0);

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public LongRange(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(java.lang.Long l) {
        return contains(l.longValue());
    }

    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Long getStart() {
        return java.lang.Long.valueOf(getFirst());
    }

    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Long getEndInclusive() {
        return java.lang.Long.valueOf(getLast());
    }

    @Override // kotlin.ranges.OpenEndRange
    public final java.lang.Long getEndExclusive() {
        if (getLast() == Long.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return java.lang.Long.valueOf(getLast() + 1);
    }

    public final boolean contains(long value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // kotlin.ranges.LongProgression
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.LongRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.LongRange) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.LongRange longRange = (kotlin.ranges.LongRange) other;
        return getFirst() == longRange.getFirst() && getLast() == longRange.getLast();
    }

    @Override // kotlin.ranges.LongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) (((getFirst() ^ (getFirst() >>> 32)) * 31) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/LongRange;", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.LongRange getEMPTY() {
            return kotlin.ranges.LongRange.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
