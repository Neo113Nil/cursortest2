package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "p0", "p1", "<init>", "(DD)V", "", "isEmpty", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClosedDoubleRange implements kotlin.ranges.ClosedFloatingPointRange<java.lang.Double> {
    private final double getHighResolutionOutputSizeshNQ4ISI;
    private final double getHighSpeedVideoFpsRanges;

    public ClosedDoubleRange(double d, double d2) {
        this.getHighSpeedVideoFpsRanges = d;
        this.getHighResolutionOutputSizeshNQ4ISI = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        double doubleValue = ((java.lang.Number) comparable).doubleValue();
        return doubleValue >= this.getHighSpeedVideoFpsRanges && doubleValue <= this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final /* synthetic */ boolean lessThanOrEquals(java.lang.Double d, java.lang.Double d2) {
        return d.doubleValue() <= d2.doubleValue();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges > this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlin.ranges.ClosedDoubleRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.ClosedDoubleRange) p0).isEmpty()) {
            return true;
        }
        kotlin.ranges.ClosedDoubleRange closedDoubleRange = (kotlin.ranges.ClosedDoubleRange) p0;
        return this.getHighSpeedVideoFpsRanges == closedDoubleRange.getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI == closedDoubleRange.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Double.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + java.lang.Double.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("..");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ java.lang.Comparable getEndInclusive() {
        return java.lang.Double.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ java.lang.Comparable getStart() {
        return java.lang.Double.valueOf(this.getHighSpeedVideoFpsRanges);
    }
}
