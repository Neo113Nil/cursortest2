package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "getHighSpeedVideoSizes", "(F)J", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    final /* synthetic */ androidx.compose.material.AnchoredDraggableState<?> getHighSpeedVideoSizes;
    private final androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;

    DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(androidx.compose.material.AnchoredDraggableState<?> anchoredDraggableState) {
        this.getHighSpeedVideoSizes = anchoredDraggableState;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.dispatchRawDelta(java.lang.Float.intBitsToFloat((int) (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? available >> 32 : available & 4294967295L))));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) {
            drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) continuation;
            if ((drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    float m8839getXimpl = this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8839getXimpl(j) : androidx.compose.ui.unit.Velocity.m8840getYimpl(j);
                    float requireOffset = this.getHighSpeedVideoSizes.requireOffset();
                    if (m8839getXimpl < 0.0f && requireOffset > this.getHighSpeedVideoSizes.getAnchors().minAnchor()) {
                        androidx.compose.material.AnchoredDraggableState<?> anchoredDraggableState = this.getHighSpeedVideoSizes;
                        drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor = j;
                        drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes = 1;
                        if (anchoredDraggableState.settle(m8839getXimpl, drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
            }
        }
        drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, continuation);
        java.lang.Object obj2 = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) {
            drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) continuation;
            if ((drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.material.AnchoredDraggableState<?> anchoredDraggableState = this.getHighSpeedVideoSizes;
                    float m8839getXimpl = this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8839getXimpl(j2) : androidx.compose.ui.unit.Velocity.m8840getYimpl(j2);
                    drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes = j2;
                    drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges = 1;
                    if (anchoredDraggableState.settle(m8839getXimpl, drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
            }
        }
        drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, continuation);
        java.lang.Object obj2 = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
    }

    private final long getHighSpeedVideoSizes(float f) {
        float f2 = this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : 0.0f;
        if (this.orientation != androidx.compose.foundation.gestures.Orientation.Vertical) {
            f = 0.0f;
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? available >> 32 : available & 4294967295L));
        if (intBitsToFloat < 0.0f && androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.dispatchRawDelta(intBitsToFloat));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }
}
