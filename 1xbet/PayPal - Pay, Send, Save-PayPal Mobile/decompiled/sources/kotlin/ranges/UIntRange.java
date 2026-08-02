package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0016"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains-WZ4Q5Ns", "(I)Z", "contains", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart-pVg5ArA", "getEndInclusive-pVg5ArA", "getEndExclusive-pVg5ArA", "getEndExclusive-pVg5ArA$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UIntRange extends kotlin.ranges.UIntProgression implements kotlin.ranges.ClosedRange<kotlin.UInt>, kotlin.ranges.OpenEndRange<kotlin.UInt> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.UIntRange.Companion INSTANCE;
    private static final kotlin.ranges.UIntRange EMPTY;

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m23846getEndExclusivepVg5ArA$annotations() {
    }

    private UIntRange(int i, int i2) {
        super(i, i2, 1, null);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(kotlin.UInt uInt) {
        return m23847containsWZ4Q5Ns(uInt.getCamera2StreamConfigurationMap());
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ kotlin.UInt getEndExclusive() {
        return kotlin.UInt.m23469boximpl(m23848getEndExclusivepVg5ArA());
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ kotlin.UInt getEndInclusive() {
        return kotlin.UInt.m23469boximpl(m23849getEndInclusivepVg5ArA());
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ kotlin.UInt getStart() {
        return kotlin.UInt.m23469boximpl(m23850getStartpVg5ArA());
    }

    /* renamed from: getStart-pVg5ArA, reason: not valid java name */
    public final int m23850getStartpVg5ArA() {
        return getFirst();
    }

    /* renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public final int m23849getEndInclusivepVg5ArA() {
        return getLast();
    }

    /* renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public final int m23848getEndExclusivepVg5ArA() {
        if (getLast() == -1) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return kotlin.UInt.m23470constructorimpl(getLast() + 1);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public final boolean m23847containsWZ4Q5Ns(int value) {
        return java.lang.Integer.compareUnsigned(getFirst(), value) <= 0 && java.lang.Integer.compareUnsigned(value, getLast()) <= 0;
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return java.lang.Integer.compareUnsigned(getFirst(), getLast()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.UIntRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.UIntRange) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.UIntRange uIntRange = (kotlin.ranges.UIntRange) other;
        return getFirst() == uIntRange.getFirst() && getLast() == uIntRange.getLast();
    }

    @Override // kotlin.ranges.UIntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.UIntProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(getFirst()));
        sb.append("..");
        sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(getLast()));
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/UIntRange;", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.UIntRange getEMPTY() {
            return kotlin.ranges.UIntRange.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new kotlin.ranges.UIntRange.Companion(defaultConstructorMarker);
        EMPTY = new kotlin.ranges.UIntRange(-1, 0, defaultConstructorMarker);
    }

    public /* synthetic */ UIntRange(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
