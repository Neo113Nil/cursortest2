package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/node/PointerInputModifierNode;", "", "isAttached", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Z", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInputModifierNodeKt {
    public static final boolean isAttached(androidx.compose.ui.node.PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().getIsAttached();
    }

    public static final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates(androidx.compose.ui.node.PointerInputModifierNode pointerInputModifierNode) {
        return androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(pointerInputModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(16));
    }
}
