package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "first", com.visa.cbp.getEncExpo.warmup, "getFirst-pVg5ArA", "last", "getLast-pVg5ArA", "getStep", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UIntProgression implements java.lang.Iterable<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.UIntProgression.Companion INSTANCE = new kotlin.ranges.UIntProgression.Companion(null);
    private final int first;
    private final int last;
    private final int step;

    private UIntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = kotlin.internal.UProgressionUtilKt.m23829getProgressionLastElementNkh28Cs(i, i2, i3);
        this.step = i3;
    }

    /* renamed from: getFirst-pVg5ArA, reason: not valid java name and from getter */
    public final int getFirst() {
        return this.first;
    }

    /* renamed from: getLast-pVg5ArA, reason: not valid java name and from getter */
    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.UInt> iterator() {
        return new kotlin.ranges.UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    public boolean isEmpty() {
        return this.step > 0 ? java.lang.Integer.compareUnsigned(this.first, this.last) > 0 : java.lang.Integer.compareUnsigned(this.first, this.last) < 0;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.UIntProgression) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.UIntProgression uIntProgression = (kotlin.ranges.UIntProgression) other;
        return this.first == uIntProgression.first && this.last == uIntProgression.last && this.step == uIntProgression.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i;
        if (this.step > 0) {
            sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(this.first));
            sb.append("..");
            sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(this.last));
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((java.lang.Object) kotlin.UInt.m23474toStringimpl(this.last));
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "<init>", "()V", "Lkotlin/UInt;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/UIntProgression;", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "fromClosedRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final kotlin.ranges.UIntProgression m23845fromClosedRangeNkh28Cs(int rangeStart, int rangeEnd, int step) {
            return new kotlin.ranges.UIntProgression(rangeStart, rangeEnd, step, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UIntProgression(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }
}
