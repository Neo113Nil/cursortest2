package kotlin.ranges;

/* compiled from: ULongRange.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0086\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\t\u001a\u00020\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-s-VKNKU", "()J", "J", "last", "getLast-s-VKNKU", "getStep", "iterator", "", "isEmpty", "", "equals", "other", "", "hashCode", "", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ULongProgression implements java.lang.Iterable<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.ULongProgression.Companion INSTANCE = new kotlin.ranges.ULongProgression.Companion(null);
    private final long first;
    private final long last;
    private final long step;

    public /* synthetic */ ULongProgression(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j;
        this.last = kotlin.internal.UProgressionUtilKt.m12015getProgressionLastElement7ftBX0g(j, j2, j3);
        this.step = j3;
    }

    /* renamed from: getFirst-s-VKNKU, reason: not valid java name and from getter */
    public final long getFirst() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU, reason: not valid java name and from getter */
    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.ULong> iterator() {
        return new kotlin.ranges.ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j = this.step;
        long j2 = this.first;
        long j3 = this.last;
        if (j > 0) {
            compare2 = java.lang.Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = java.lang.Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof kotlin.ranges.ULongProgression) {
            if (!isEmpty() || !((kotlin.ranges.ULongProgression) other).isEmpty()) {
                kotlin.ranges.ULongProgression uLongProgression = (kotlin.ranges.ULongProgression) other;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        int m10975constructorimpl = ((int) kotlin.ULong.m10975constructorimpl(j ^ kotlin.ULong.m10975constructorimpl(j >>> 32))) * 31;
        long j2 = this.last;
        int m10975constructorimpl2 = (m10975constructorimpl + ((int) kotlin.ULong.m10975constructorimpl(j2 ^ kotlin.ULong.m10975constructorimpl(j2 >>> 32)))) * 31;
        long j3 = this.step;
        return ((int) (j3 ^ (j3 >>> 32))) + m10975constructorimpl2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        long j;
        if (this.step > 0) {
            sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) kotlin.ULong.m11021toStringimpl(this.first));
            sb.append("..");
            sb.append((java.lang.Object) kotlin.ULong.m11021toStringimpl(this.last));
            sb.append(" step ");
            j = this.step;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) kotlin.ULong.m11021toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((java.lang.Object) kotlin.ULong.m11021toStringimpl(this.last));
            sb.append(" step ");
            j = -this.step;
        }
        sb.append(j);
        return sb.toString();
    }

    /* compiled from: ULongRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final kotlin.ranges.ULongProgression m12043fromClosedRange7ftBX0g(long rangeStart, long rangeEnd, long step) {
            return new kotlin.ranges.ULongProgression(rangeStart, rangeEnd, step, null);
        }
    }
}
