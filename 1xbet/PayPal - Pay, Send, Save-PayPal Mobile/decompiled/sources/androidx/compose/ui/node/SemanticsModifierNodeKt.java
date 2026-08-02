package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "", "invalidateSemantics", "(Landroidx/compose/ui/node/SemanticsModifierNode;)V", "Landroidx/compose/ui/Modifier$Node;", "", "useMinimumTouchTarget", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "(Landroidx/compose/ui/Modifier$Node;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsModifierNodeKt {
    public static final void invalidateSemantics(androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui();
    }

    public static final boolean getUseMinimumTouchTarget(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final androidx.compose.ui.geometry.Rect touchBoundsInRoot(androidx.compose.ui.Modifier.Node node, boolean z) {
        if (!node.getNode().getIsAttached()) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        if (!z) {
            return androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(node, androidx.compose.ui.node.NodeKind.m7621constructorimpl(8)));
        }
        return androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(node, androidx.compose.ui.node.NodeKind.m7621constructorimpl(8)).touchBoundsInRoot();
    }
}
