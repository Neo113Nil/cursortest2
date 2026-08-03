package androidx.compose.ui.platform;

/* compiled from: NestedScrollInteropConnection.android.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J#\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "consumedScrollCache", "", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "interruptOngoingScrolls", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollInteropConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final androidx.core.view.NestedScrollingChildHelper nestedScrollChildHelper;
    private final android.view.View view;

    public NestedScrollInteropConnection(android.view.View view) {
        this.view = view;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = new androidx.core.view.NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        androidx.core.view.ViewCompat.setNestedScrollingEnabled(view, true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo404onPreScrollOzD1aCk(long available, int source) {
        int m3758getScrollAxesk4lQ0M;
        int m3760toViewTypeGyEprt8;
        int m3760toViewTypeGyEprt82;
        long m3759toOffsetUv8p0NA;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m3758getScrollAxesk4lQ0M = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3758getScrollAxesk4lQ0M(available);
        m3760toViewTypeGyEprt8 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3760toViewTypeGyEprt8(source);
        if (nestedScrollingChildHelper.startNestedScroll(m3758getScrollAxesk4lQ0M, m3760toViewTypeGyEprt8)) {
            kotlin.collections.ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (java.lang.Object) null);
            androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1871getXimpl(available));
            int composeToViewOffset2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1872getYimpl(available));
            int[] iArr = this.consumedScrollCache;
            m3760toViewTypeGyEprt82 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3760toViewTypeGyEprt8(source);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m3760toViewTypeGyEprt82);
            m3759toOffsetUv8p0NA = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3759toOffsetUv8p0NA(this.consumedScrollCache, available);
            return m3759toOffsetUv8p0NA;
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo402onPostScrollDzOQY0M(long consumed, long available, int source) {
        int m3758getScrollAxesk4lQ0M;
        int m3760toViewTypeGyEprt8;
        int m3760toViewTypeGyEprt82;
        long m3759toOffsetUv8p0NA;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m3758getScrollAxesk4lQ0M = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3758getScrollAxesk4lQ0M(available);
        m3760toViewTypeGyEprt8 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3760toViewTypeGyEprt8(source);
        if (nestedScrollingChildHelper.startNestedScroll(m3758getScrollAxesk4lQ0M, m3760toViewTypeGyEprt8)) {
            kotlin.collections.ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (java.lang.Object) null);
            androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1871getXimpl(consumed));
            int composeToViewOffset2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1872getYimpl(consumed));
            int composeToViewOffset3 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1871getXimpl(available));
            int composeToViewOffset4 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1872getYimpl(available));
            m3760toViewTypeGyEprt82 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3760toViewTypeGyEprt8(source);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m3760toViewTypeGyEprt82, this.consumedScrollCache);
            m3759toOffsetUv8p0NA = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m3759toOffsetUv8p0NA(this.consumedScrollCache, available);
            return m3759toOffsetUv8p0NA;
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        float viewVelocity;
        float viewVelocity2;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.toViewVelocity(androidx.compose.ui.unit.Velocity.m4717getXimpl(j));
        viewVelocity2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.toViewVelocity(androidx.compose.ui.unit.Velocity.m4718getYimpl(j));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return androidx.compose.ui.unit.Velocity.m4708boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        float viewVelocity;
        float viewVelocity2;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.toViewVelocity(androidx.compose.ui.unit.Velocity.m4717getXimpl(j2));
        viewVelocity2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.toViewVelocity(androidx.compose.ui.unit.Velocity.m4718getYimpl(j2));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j2 = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return androidx.compose.ui.unit.Velocity.m4708boximpl(j2);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }
}
