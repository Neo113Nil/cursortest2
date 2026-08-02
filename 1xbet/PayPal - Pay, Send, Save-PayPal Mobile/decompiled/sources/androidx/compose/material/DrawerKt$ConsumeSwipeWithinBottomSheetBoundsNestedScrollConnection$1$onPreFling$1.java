package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {813}, m = "onPreFling-QWom1Mo", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }
}
