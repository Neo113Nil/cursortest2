package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "p0", "bringIntoViewResponder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/relocation/BringIntoViewResponder;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewResponderKt {
    @kotlin.Deprecated(message = "Use BringIntoViewModifierNode instead")
    public static final androidx.compose.ui.Modifier bringIntoViewResponder(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        return modifier.then(new androidx.compose.foundation.relocation.BringIntoViewResponderElement(bringIntoViewResponder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, androidx.compose.ui.geometry.Rect rect) {
        return rect.m5789translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m5787getTopLeftF1C5BW0());
    }
}
