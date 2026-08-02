package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", "view", "", "minFlingVelocity", "<init>", "(Landroid/view/View;F)V", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "getHighSpeedVideoFpsRanges", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Landroidx/core/view/NestedScrollingChildHelper;", "getHighSpeedVideoSizes", "Landroidx/core/view/NestedScrollingChildHelper;", "", "Camera2StreamConfigurationMap", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollInteropConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.core.view.NestedScrollingChildHelper getHighSpeedVideoFpsRanges;

    public NestedScrollInteropConnection(android.view.View view, float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.getHighSpeedVideoFpsRangesFor = f;
        androidx.core.view.NestedScrollingChildHelper nestedScrollingChildHelper = new androidx.core.view.NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.getHighSpeedVideoFpsRanges = nestedScrollingChildHelper;
        this.Camera2StreamConfigurationMap = new int[2];
        androidx.core.view.ViewCompat.setNestedScrollingEnabled(view, true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        if (this.getHighSpeedVideoFpsRanges.startNestedScroll(androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7770access$getScrollAxesk4lQ0M(available), androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7772access$toViewTypeGyEprt8(source))) {
            kotlin.collections.ArraysKt.fill$default(this.Camera2StreamConfigurationMap, 0, 0, 0, 6, (java.lang.Object) null);
            int composeToViewOffset = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (available >> 32)));
            int composeToViewOffset2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (4294967295L & available)));
            this.getHighSpeedVideoFpsRanges.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, this.Camera2StreamConfigurationMap, null, androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7772access$toViewTypeGyEprt8(source));
            return androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7771access$toOffsetmoWRBKg(composeToViewOffset, composeToViewOffset2, this.Camera2StreamConfigurationMap, available);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.getHighSpeedVideoFpsRanges.startNestedScroll(androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7770access$getScrollAxesk4lQ0M(available), androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7772access$toViewTypeGyEprt8(source))) {
            kotlin.collections.ArraysKt.fill$default(this.Camera2StreamConfigurationMap, 0, 0, 0, 6, (java.lang.Object) null);
            int composeToViewOffset = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (available >> 32)));
            int composeToViewOffset2 = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (available & 4294967295L)));
            this.getHighSpeedVideoFpsRanges.dispatchNestedScroll(androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (consumed >> 32))), androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (4294967295L & consumed))), composeToViewOffset, composeToViewOffset2, null, androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7772access$toViewTypeGyEprt8(source), this.Camera2StreamConfigurationMap);
            return androidx.compose.ui.platform.NestedScrollInteropConnectionKt.m7771access$toOffsetmoWRBKg(composeToViewOffset, composeToViewOffset2, this.Camera2StreamConfigurationMap, available);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        if (!this.getHighSpeedVideoFpsRanges.dispatchNestedPreFling(androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toViewVelocity(androidx.compose.ui.unit.Velocity.m8839getXimpl(j)), androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toViewVelocity(androidx.compose.ui.unit.Velocity.m8840getYimpl(j))) && !this.getHighSpeedVideoFpsRanges.dispatchNestedFling(androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toViewVelocity(androidx.compose.ui.unit.Velocity.m8839getXimpl(j)), androidx.compose.ui.platform.NestedScrollInteropConnectionKt.access$toViewVelocity(androidx.compose.ui.unit.Velocity.m8840getYimpl(j)), true)) {
            j = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        if (this.getHighSpeedVideoFpsRanges.hasNestedScrollingParent(0)) {
            this.getHighSpeedVideoFpsRanges.stopNestedScroll(0);
        }
        if (this.getHighSpeedVideoFpsRanges.hasNestedScrollingParent(1)) {
            this.getHighSpeedVideoFpsRanges.stopNestedScroll(1);
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
    }
}
