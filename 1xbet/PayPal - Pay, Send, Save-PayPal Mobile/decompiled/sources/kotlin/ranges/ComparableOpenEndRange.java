package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00028\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", "", "T", "Lkotlin/ranges/OpenEndRange;", "p0", "p1", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/Comparable;", "getStart", "()Ljava/lang/Comparable;", "getHighResolutionOutputSizeshNQ4ISI", "getEndExclusive", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
class ComparableOpenEndRange<T extends java.lang.Comparable<? super T>> implements kotlin.ranges.OpenEndRange<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T getHighSpeedVideoFpsRangesFor;
    private final T getHighSpeedVideoSizes;

    public ComparableOpenEndRange(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRangesFor = t2;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ boolean contains(T t) {
        return kotlin.ranges.OpenEndRange.DefaultImpls.contains(this, t);
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ boolean isEmpty() {
        return kotlin.ranges.OpenEndRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.OpenEndRange
    public T getStart() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.ranges.OpenEndRange
    public T getEndExclusive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlin.ranges.ComparableOpenEndRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.ComparableOpenEndRange) p0).isEmpty()) {
            return true;
        }
        kotlin.ranges.ComparableOpenEndRange comparableOpenEndRange = (kotlin.ranges.ComparableOpenEndRange) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(getStart(), comparableOpenEndRange.getStart()) && kotlin.jvm.internal.Intrinsics.areEqual(getEndExclusive(), comparableOpenEndRange.getEndExclusive());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getStart());
        sb.append("..<");
        sb.append(getEndExclusive());
        return sb.toString();
    }
}
