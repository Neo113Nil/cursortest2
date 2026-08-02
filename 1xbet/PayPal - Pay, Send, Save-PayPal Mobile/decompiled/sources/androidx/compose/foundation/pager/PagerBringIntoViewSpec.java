package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\r\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/foundation/pager/PagerState;", "p0", "p1", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "", "p2", "calculateScrollDistance", "(FFF)F", "getHighSpeedVideoFpsRanges", "(F)F", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/pager/PagerState;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PagerBringIntoViewSpec implements androidx.compose.foundation.gestures.BringIntoViewSpec {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.BringIntoViewSpec getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState getHighSpeedVideoFpsRanges;

    public PagerBringIntoViewSpec(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        this.getHighSpeedVideoFpsRanges = pagerState;
        this.getHighSpeedVideoFpsRangesFor = bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float calculateScrollDistance(float p0, float p1, float p2) {
        float calculateScrollDistance = this.getHighSpeedVideoFpsRangesFor.calculateScrollDistance(p0, p1, p2);
        float f = p0 + p1;
        boolean z = p0 <= 0.0f ? f <= 0.0f : f > p2;
        if (java.lang.Math.abs(calculateScrollDistance) != 0.0f && z) {
            return getHighSpeedVideoFpsRanges(calculateScrollDistance);
        }
        if (java.lang.Math.abs(this.getHighSpeedVideoFpsRanges.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset = this.getHighSpeedVideoFpsRanges.getFirstVisiblePageOffset() * (-1.0f);
        if (this.getHighSpeedVideoFpsRanges.getLastScrolledForward()) {
            firstVisiblePageOffset += this.getHighSpeedVideoFpsRanges.getPageSizeWithSpacing$foundation();
        }
        return kotlin.ranges.RangesKt.coerceIn(firstVisiblePageOffset, -p2, p2);
    }

    private final float getHighSpeedVideoFpsRanges(float p0) {
        float firstVisiblePageOffset = this.getHighSpeedVideoFpsRanges.getFirstVisiblePageOffset() * (-1.0f);
        while (p0 > 0.0f && firstVisiblePageOffset < p0) {
            firstVisiblePageOffset += this.getHighSpeedVideoFpsRanges.getPageSizeWithSpacing$foundation();
        }
        while (p0 < 0.0f && firstVisiblePageOffset > p0) {
            firstVisiblePageOffset -= this.getHighSpeedVideoFpsRanges.getPageSizeWithSpacing$foundation();
        }
        return firstVisiblePageOffset;
    }
}
