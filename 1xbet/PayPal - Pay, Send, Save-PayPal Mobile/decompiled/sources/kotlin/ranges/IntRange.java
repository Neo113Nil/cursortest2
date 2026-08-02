package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0019"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(I)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart", "()Ljava/lang/Integer;", "getEndInclusive", "getEndExclusive", "getEndExclusive$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntRange extends kotlin.ranges.IntProgression implements kotlin.ranges.ClosedRange<java.lang.Integer>, kotlin.ranges.OpenEndRange<java.lang.Integer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.IntRange.Companion INSTANCE = new kotlin.ranges.IntRange.Companion(null);
    private static final kotlin.ranges.IntRange EMPTY = new kotlin.ranges.IntRange(1, 0);

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(java.lang.Integer num) {
        return contains(num.intValue());
    }

    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Integer getStart() {
        return java.lang.Integer.valueOf(getFirst());
    }

    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Integer getEndInclusive() {
        return java.lang.Integer.valueOf(getLast());
    }

    @Override // kotlin.ranges.OpenEndRange
    public final java.lang.Integer getEndExclusive() {
        if (getLast() == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return java.lang.Integer.valueOf(getLast() + 1);
    }

    public final boolean contains(int value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.IntRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.IntRange) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.IntRange intRange = (kotlin.ranges.IntRange) other;
        return getFirst() == intRange.getFirst() && getLast() == intRange.getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/IntRange;", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.IntRange getEMPTY() {
            return kotlin.ranges.IntRange.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
