package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a,\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "", "remeasureSync", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "invalidateLayer", "invalidatePlacement", "invalidateMeasurement", "requestRemeasure", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "updateLayerBlock", "(Landroidx/compose/ui/node/LayoutModifierNode;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutModifierNodeKt {
    public static final void remeasureSync(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void invalidateLayer(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(layoutModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidatePlacement(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void invalidateMeasurement(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui();
    }

    public static final void requestRemeasure(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, false, 7, null);
    }

    public static final void updateLayerBlock(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeCoordinator wrapped;
        if (!layoutModifierNode.getNode().getIsAttached() || (wrapped = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(layoutModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2)).getWrapped()) == null) {
            return;
        }
        wrapped.updateLayerBlock(function1, true);
    }
}
