package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/DrawModifierNode;", "", "invalidateDraw", "(Landroidx/compose/ui/node/DrawModifierNode;)V", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "dispatchDraw", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(androidx.compose.ui.node.DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().getIsAttached()) {
            androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(drawModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(1)).invalidateLayer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void dispatchDraw(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.node.DelegatingNode node = delegatableNode.getNode();
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof androidx.compose.ui.node.DrawModifierNode) {
                ((androidx.compose.ui.node.DrawModifierNode) node).draw(contentDrawScope);
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = node.getDelegate();
                int i = 0;
                node = node;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    node = node;
                }
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
    }
}
