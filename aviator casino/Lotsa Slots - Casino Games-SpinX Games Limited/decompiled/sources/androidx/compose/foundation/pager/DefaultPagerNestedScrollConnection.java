package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001a\u001a\u00020\f*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\u00020\u001f*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/foundation/pager/PagerState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "consumeOnOrientation", "consumeOnOrientation-8S9VItk", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation-QWom1Mo", "mainAxis", "", "mainAxis-k-4lQ0M", "(J)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final androidx.compose.foundation.pager.PagerState state;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation continuation) {
        return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3151onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    public DefaultPagerNestedScrollConnection(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    public final androidx.compose.foundation.pager.PagerState getState() {
        return this.state;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m798consumeOnOrientationQWom1Mo(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
        }
        return androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    /* renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m797consumeOnOrientation8S9VItk(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return androidx.compose.ui.geometry.Offset.m1865copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
        }
        return androidx.compose.ui.geometry.Offset.m1865copydBAh8RU$default(j, 0.0f, 0.0f, 1, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo404onPreScrollOzD1aCk(long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3168getDragWNlRxjI()) && java.lang.Math.abs(this.state.getCurrentPageOffsetFraction()) > 0.0d) {
            float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
            float pageSize = ((this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()) * (-java.lang.Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
            if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
                pageSize = currentPageOffsetFraction;
                currentPageOffsetFraction = pageSize;
            }
            float f = -this.state.dispatchRawDelta(-kotlin.ranges.RangesKt.coerceIn(this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.Offset.m1871getXimpl(available) : androidx.compose.ui.geometry.Offset.m1872getYimpl(available), currentPageOffsetFraction, pageSize));
            float m1871getXimpl = this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : androidx.compose.ui.geometry.Offset.m1871getXimpl(available);
            if (this.orientation != androidx.compose.foundation.gestures.Orientation.Vertical) {
                f = androidx.compose.ui.geometry.Offset.m1872getYimpl(available);
            }
            return androidx.compose.ui.geometry.Offset.m1864copydBAh8RU(available, m1871getXimpl, f);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo402onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3169getFlingWNlRxjI()) && m796mainAxisk4lQ0M(available) != 0.0f) {
            throw new java.util.concurrent.CancellationException();
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return androidx.compose.ui.unit.Velocity.m4708boximpl(m798consumeOnOrientationQWom1Mo(j2, this.orientation));
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m796mainAxisk4lQ0M(long j) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.Offset.m1871getXimpl(j) : androidx.compose.ui.geometry.Offset.m1872getYimpl(j);
    }
}
