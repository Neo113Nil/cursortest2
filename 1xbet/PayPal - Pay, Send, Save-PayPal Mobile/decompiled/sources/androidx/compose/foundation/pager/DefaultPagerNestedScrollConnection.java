package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/pager/PagerState;", "p0", "Landroidx/compose/foundation/gestures/Orientation;", "p1", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/unit/Velocity;", "Camera2StreamConfigurationMap", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "", "getHighSpeedVideoFpsRanges", "(J)F", "p2", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/pager/PagerState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/Orientation;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultPagerNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState getHighResolutionOutputSizeshNQ4ISI;

    public DefaultPagerNestedScrollConnection(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.Orientation orientation) {
        this.getHighResolutionOutputSizeshNQ4ISI = pagerState;
        this.getHighSpeedVideoFpsRangesFor = orientation;
    }

    private static long Camera2StreamConfigurationMap(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
        }
        return androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long p0, int p1) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(p1, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()) && java.lang.Math.abs(this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPageOffsetFraction()) > 1.0E-6d && java.lang.Math.abs(getHighSpeedVideoFpsRanges(p0)) > 0.0f) {
            float currentPageOffsetFraction = this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPageOffsetFraction() * this.getHighResolutionOutputSizeshNQ4ISI.getPageSize$foundation();
            float pageSize = ((this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo().getPageSize() + this.getHighResolutionOutputSizeshNQ4ISI.getLayoutInfo().getPageSpacing()) * (-java.lang.Math.signum(this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPageOffsetFraction() > 0.0f) {
                pageSize = currentPageOffsetFraction;
                currentPageOffsetFraction = pageSize;
            }
            float f = -this.getHighResolutionOutputSizeshNQ4ISI.dispatchRawDelta(-kotlin.ranges.RangesKt.coerceIn(getHighSpeedVideoFpsRanges(p0), currentPageOffsetFraction, pageSize));
            float intBitsToFloat = this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : java.lang.Float.intBitsToFloat((int) (p0 >> 32));
            if (this.getHighSpeedVideoFpsRangesFor != androidx.compose.foundation.gestures.Orientation.Vertical) {
                f = java.lang.Float.intBitsToFloat((int) (4294967295L & p0));
            }
            return androidx.compose.ui.geometry.Offset.m5745copydBAh8RU(p0, intBitsToFloat, f);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    private final float getHighSpeedVideoFpsRanges(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long p0, long p1, int p2) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(p2, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI()) && getHighSpeedVideoSizes(p1) != 0.0f) {
            throw new java.util.concurrent.CancellationException("Scroll cancelled");
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return androidx.compose.ui.unit.Velocity.m8830boximpl(Camera2StreamConfigurationMap(j2, this.getHighSpeedVideoFpsRangesFor));
    }

    private final float getHighSpeedVideoSizes(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }
}
