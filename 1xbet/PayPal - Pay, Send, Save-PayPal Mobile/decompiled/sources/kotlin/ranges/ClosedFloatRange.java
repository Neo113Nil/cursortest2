package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "p0", "p1", "<init>", "(FF)V", "", "isEmpty", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClosedFloatRange implements kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> {
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    public ClosedFloatRange(float f, float f2) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        float floatValue = ((java.lang.Number) comparable).floatValue();
        return floatValue >= this.Camera2StreamConfigurationMap && floatValue <= this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final /* synthetic */ boolean lessThanOrEquals(java.lang.Float f, java.lang.Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap > this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlin.ranges.ClosedFloatRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.ClosedFloatRange) p0).isEmpty()) {
            return true;
        }
        kotlin.ranges.ClosedFloatRange closedFloatRange = (kotlin.ranges.ClosedFloatRange) p0;
        return this.Camera2StreamConfigurationMap == closedFloatRange.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == closedFloatRange.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Float.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("..");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ java.lang.Comparable getEndInclusive() {
        return java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ java.lang.Comparable getStart() {
        return java.lang.Float.valueOf(this.Camera2StreamConfigurationMap);
    }
}
