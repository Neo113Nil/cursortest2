package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/platform/BringIntoViewOnScreenResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p0", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "p1", "", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "Camera2StreamConfigurationMap", "Landroid/view/ViewGroup;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BringIntoViewOnScreenResponderNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.relocation.BringIntoViewModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public android.view.ViewGroup getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final java.lang.Object bringIntoView(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        androidx.compose.ui.geometry.Rect invoke = function0.invoke();
        androidx.compose.ui.geometry.Rect m5789translatek4lQ0M = invoke != null ? invoke.m5789translatek4lQ0M(positionInRoot) : null;
        if (m5789translatek4lQ0M != null) {
            this.getHighSpeedVideoFpsRanges.requestRectangleOnScreen(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(m5789translatek4lQ0M), false);
        }
        return kotlin.Unit.INSTANCE;
    }
}
