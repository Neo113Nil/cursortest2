package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00028\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015"}, d2 = {"Lkotlin/ranges/ComparableRange;", "", "T", "Lkotlin/ranges/ClosedRange;", "p0", "p1", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/Comparable;", "getStart", "()Ljava/lang/Comparable;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getEndInclusive", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
class ComparableRange<T extends java.lang.Comparable<? super T>> implements kotlin.ranges.ClosedRange<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final T getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    public ComparableRange(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        this.Camera2StreamConfigurationMap = t;
        this.getHighResolutionOutputSizeshNQ4ISI = t2;
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ boolean contains(T t) {
        return kotlin.ranges.ClosedRange.DefaultImpls.contains(this, t);
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ boolean isEmpty() {
        return kotlin.ranges.ClosedRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.ClosedRange
    public T getStart() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.ranges.ClosedRange
    public T getEndInclusive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlin.ranges.ComparableRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.ComparableRange) p0).isEmpty()) {
            return true;
        }
        kotlin.ranges.ComparableRange comparableRange = (kotlin.ranges.ComparableRange) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(getStart(), comparableRange.getStart()) && kotlin.jvm.internal.Intrinsics.areEqual(getEndInclusive(), comparableRange.getEndInclusive());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getStart());
        sb.append("..");
        sb.append(getEndInclusive());
        return sb.toString();
    }
}
