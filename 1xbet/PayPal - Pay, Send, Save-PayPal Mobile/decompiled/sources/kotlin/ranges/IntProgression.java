package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/IntIterator;", "iterator", "()Lkotlin/collections/IntIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "first", com.visa.cbp.getEncExpo.warmup, "getFirst", "last", "getLast", "getStep", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class IntProgression implements java.lang.Iterable<java.lang.Integer>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.IntProgression.Companion INSTANCE = new kotlin.ranges.IntProgression.Companion(null);
    private final int first;
    private final int last;
    private final int step;

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(i, i2, i3);
        this.step = i3;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Integer> iterator() {
        return new kotlin.ranges.IntProgressionIterator(this.first, this.last, this.step);
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.first > this.last : this.first < this.last;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.IntProgression)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.IntProgression) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.IntProgression intProgression = (kotlin.ranges.IntProgression) other;
        return this.first == intProgression.first && this.last == intProgression.last && this.step == intProgression.step;
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
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/IntProgression;", "fromClosedRange", "(III)Lkotlin/ranges/IntProgression;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step) {
            return new kotlin.ranges.IntProgression(rangeStart, rangeEnd, step);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
