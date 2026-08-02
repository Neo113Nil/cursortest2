package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/LongIterator;", "iterator", "()Lkotlin/collections/LongIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "first", "J", "getFirst", "()J", "last", "getLast", "getStep", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LongProgression implements java.lang.Iterable<java.lang.Long>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.LongProgression.Companion INSTANCE = new kotlin.ranges.LongProgression.Companion(null);
    private final long first;
    private final long last;
    private final long step;

    public LongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j;
        this.last = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(j, j2, j3);
        this.step = j3;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Long> iterator() {
        return new kotlin.ranges.LongProgressionIterator(this.first, this.last, this.step);
    }

    public boolean isEmpty() {
        long j = this.step;
        long j2 = this.first;
        long j3 = this.last;
        return j > 0 ? j2 > j3 : j2 < j3;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.LongProgression)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.LongProgression) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.LongProgression longProgression = (kotlin.ranges.LongProgression) other;
        return this.first == longProgression.first && this.last == longProgression.last && this.step == longProgression.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        long j2 = this.last;
        long j3 = this.step;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + ((j3 >>> 32) ^ j3));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        long j;
        if (this.step > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            j = this.step;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            j = -this.step;
        }
        sb.append(j);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/LongProgression;", "fromClosedRange", "(JJJ)Lkotlin/ranges/LongProgression;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step) {
            return new kotlin.ranges.LongProgression(rangeStart, rangeEnd, step);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
