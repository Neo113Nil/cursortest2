package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002*(\b\u0002\u0010\u0007\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004*<\b\u0002\u0010\t\"\u0010\u0012\u0006\u0012\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\u00060\u00042$\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\u00060\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "", "BringIntoViewRequester", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "OnRequesterReady"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidViewHolder_androidKt {
    private static final androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1 getHighSpeedVideoFpsRanges = new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
    };

    public static final /* synthetic */ float access$toComposeOffset(int i) {
        return i * (-1.0f);
    }

    public static final /* synthetic */ float access$toComposeVelocity(float f) {
        return f * (-1.0f);
    }

    public static final /* synthetic */ void access$layoutAccordingTo(android.view.View view, androidx.compose.ui.node.LayoutNode layoutNode) {
        long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int round = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (positionInRoot >> 32)));
        int round2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    public static final /* synthetic */ int access$toNestedScrollSource(int i) {
        if (i == 0) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI();
        }
        return androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI();
    }
}
