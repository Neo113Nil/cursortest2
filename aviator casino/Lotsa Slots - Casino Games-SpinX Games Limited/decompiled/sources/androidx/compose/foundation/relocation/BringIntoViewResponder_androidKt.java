package androidx.compose.foundation.relocation;

/* compiled from: BringIntoViewResponder.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"defaultBringIntoViewParent", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewResponder_androidKt {
    public static final androidx.compose.foundation.relocation.BringIntoViewParent defaultBringIntoViewParent(final androidx.compose.ui.node.CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new androidx.compose.foundation.relocation.BringIntoViewParent() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1
            @Override // androidx.compose.foundation.relocation.BringIntoViewParent
            public final java.lang.Object bringChildIntoView(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                android.graphics.Rect rect;
                android.view.View view = (android.view.View) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.ui.node.CompositionLocalConsumerModifierNode.this, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
                androidx.compose.ui.geometry.Rect invoke = function0.invoke();
                androidx.compose.ui.geometry.Rect m1908translatek4lQ0M = invoke != null ? invoke.m1908translatek4lQ0M(positionInRoot) : null;
                if (m1908translatek4lQ0M != null) {
                    rect = androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt.toRect(m1908translatek4lQ0M);
                    view.requestRectangleOnScreen(rect, false);
                }
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect toRect(androidx.compose.ui.geometry.Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
