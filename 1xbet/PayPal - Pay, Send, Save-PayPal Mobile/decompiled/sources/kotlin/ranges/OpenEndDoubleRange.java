package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lkotlin/ranges/OpenEndDoubleRange;", "Lkotlin/ranges/OpenEndRange;", "", "p0", "p1", "<init>", "(DD)V", "", "isEmpty", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "D", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class OpenEndDoubleRange implements kotlin.ranges.OpenEndRange<java.lang.Double> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final double getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final double getHighSpeedVideoSizes;

    public OpenEndDoubleRange(double d, double d2) {
        this.getHighSpeedVideoSizes = d;
        this.getHighSpeedVideoFpsRanges = d2;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ boolean contains(java.lang.Double d) {
        double doubleValue = d.doubleValue();
        return doubleValue >= this.getHighSpeedVideoSizes && doubleValue < this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes >= this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlin.ranges.OpenEndDoubleRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.OpenEndDoubleRange) p0).isEmpty()) {
            return true;
        }
        kotlin.ranges.OpenEndDoubleRange openEndDoubleRange = (kotlin.ranges.OpenEndDoubleRange) p0;
        return this.getHighSpeedVideoSizes == openEndDoubleRange.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == openEndDoubleRange.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Double.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Double.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("..<");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ java.lang.Double getEndExclusive() {
        return java.lang.Double.valueOf(this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ java.lang.Double getStart() {
        return java.lang.Double.valueOf(this.getHighSpeedVideoSizes);
    }
}
