package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\r\u001a\u00020\b*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0007R\"\u0010\u0018\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/FrameRateModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "", "frameRate", "<init>", "(F)V", "", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "nodeCoordinator", "setChildrenLayerFrameRate", "(Landroidx/compose/ui/node/NodeCoordinator;F)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFrameRate", "()F", "setFrameRate", "", "shouldUpdateFrameRates", "Z", "getShouldUpdateFrameRates", "()Z", "setShouldUpdateFrameRates", "(Z)V", "", "traverseKey", "Ljava/lang/String;", "getTraverseKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameRateModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.DrawModifierNode {
    public static final int $stable = 8;
    private float frameRate;
    private boolean shouldUpdateFrameRates = true;
    private final java.lang.String traverseKey = "TRAVERSAL_NODE_KEY_FRAME_RATE_MODIFIER_NODE";

    public FrameRateModifierNode(float f) {
        this.frameRate = f;
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    public final boolean getShouldUpdateFrameRates() {
        return this.shouldUpdateFrameRates;
    }

    public final void setShouldUpdateFrameRates(boolean z) {
        this.shouldUpdateFrameRates = z;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.shouldUpdateFrameRates = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.FrameRateModifierNode frameRateModifierNode = (androidx.compose.ui.FrameRateModifierNode) androidx.compose.ui.node.TraversableNodeKt.findNearestAncestor(this);
        if (frameRateModifierNode != null) {
            androidx.compose.ui.node.NodeCoordinator coordinator = getCoordinator();
            setChildrenLayerFrameRate(coordinator != null ? coordinator.getWrapped() : null, frameRateModifierNode.frameRate);
        } else {
            androidx.compose.ui.node.NodeCoordinator coordinator2 = getCoordinator();
            setChildrenLayerFrameRate(coordinator2 != null ? coordinator2.getWrapped() : null, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.node.OwnedLayer layer;
        if (this.shouldUpdateFrameRates) {
            androidx.compose.ui.node.NodeCoordinator coordinator = getCoordinator();
            if (coordinator != null && (layer = coordinator.getLayer()) != null) {
                layer.setFrameRate(this.frameRate);
            }
            androidx.compose.ui.node.NodeCoordinator coordinator2 = getCoordinator();
            setChildrenLayerFrameRate(coordinator2 != null ? coordinator2.getWrapped() : null, this.frameRate);
            this.shouldUpdateFrameRates = false;
        }
        contentDrawScope.drawContent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setChildrenLayerFrameRate(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, float frameRate) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        java.util.List<androidx.compose.ui.node.LayoutNode> children$ui;
        androidx.compose.ui.node.OwnedLayer layer;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        while (true) {
            if (nodeCoordinator2 == null) {
                if (nodeCoordinator == null) {
                    nodeCoordinator = getCoordinator();
                }
                if (nodeCoordinator == null || (layoutNode = nodeCoordinator.getLayoutNode()) == null || (children$ui = layoutNode.getChildren$ui()) == null) {
                    return;
                }
                int size = children$ui.size();
                while (r1 < size) {
                    setChildrenLayerFrameRate(children$ui.get(r1).getOuterCoordinator$ui(), frameRate);
                    r1++;
                }
                return;
            }
            if (nodeCoordinator != null && (layer = nodeCoordinator.getLayer()) != null) {
                if (layer.getFrameRate() != 0.0f && !layer.getIsFrameRateFromParent()) {
                    return;
                }
                layer.setFrameRate(frameRate);
                layer.setFrameRateFromParent((frameRate == 0.0f ? 1 : 0) ^ 1);
            }
            nodeCoordinator2 = nodeCoordinator2.getWrapped();
        }
    }
}
