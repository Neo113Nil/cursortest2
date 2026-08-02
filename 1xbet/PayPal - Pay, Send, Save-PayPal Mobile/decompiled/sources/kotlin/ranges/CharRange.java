package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001a"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(CC)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(C)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart", "()Ljava/lang/Character;", "getEndInclusive", "getEndExclusive", "getEndExclusive$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CharRange extends kotlin.ranges.CharProgression implements kotlin.ranges.ClosedRange<java.lang.Character>, kotlin.ranges.OpenEndRange<java.lang.Character> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.CharRange.Companion INSTANCE = new kotlin.ranges.CharRange.Companion(null);
    private static final kotlin.ranges.CharRange EMPTY = new kotlin.ranges.CharRange(1, 0);

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public CharRange(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(java.lang.Character ch) {
        return contains(ch.charValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Character getStart() {
        return java.lang.Character.valueOf(getFirst());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.ranges.ClosedRange
    public final java.lang.Character getEndInclusive() {
        return java.lang.Character.valueOf(getLast());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.ranges.OpenEndRange
    public final java.lang.Character getEndExclusive() {
        if (getLast() == 65535) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return java.lang.Character.valueOf((char) (getLast() + 1));
    }

    public final boolean contains(char value) {
        return kotlin.jvm.internal.Intrinsics.compare((int) getFirst(), (int) value) <= 0 && kotlin.jvm.internal.Intrinsics.compare((int) value, (int) getLast()) <= 0;
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return kotlin.jvm.internal.Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.CharRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.CharRange) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.CharRange charRange = (kotlin.ranges.CharRange) other;
        return getFirst() == charRange.getFirst() && getLast() == charRange.getLast();
    }

    @Override // kotlin.ranges.CharProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.CharProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/CharRange;", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.CharRange getEMPTY() {
            return kotlin.ranges.CharRange.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
