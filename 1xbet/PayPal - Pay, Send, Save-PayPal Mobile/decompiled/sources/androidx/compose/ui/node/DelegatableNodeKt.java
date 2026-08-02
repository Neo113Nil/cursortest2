package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a:\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0013\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0016\u0010\n\u001a8\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b¢\u0006\u0004\b\u0017\u0010\n\u001a0\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a:\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0018\u0010\n\u001a0\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a>\u0010\u001f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u001e\u0010\u0019\u001a>\u0010\u0018\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b \u0010\u0019\u001a>\u0010\u001a\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b!\u0010\u0019\u001aH\u0010\t\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\"\u0010\n\u001aJ\u0010&\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b$\u0010%\u001a<\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010)\u001a<\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b,\u0010-\u001a0\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020/*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0080\b¢\u0006\u0004\b0\u00101\u001aH\u0010\u0016\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b2\u0010\n\u001aH\u00104\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b3\u0010\n\u001aH\u0010\u0017\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b¢\u0006\u0004\b5\u0010\n\u001aH\u00107\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b6\u0010\n\u001a\u001f\u0010:\u001a\u00020\u0003*\u00020\u00002\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0000¢\u0006\u0004\b8\u00109\u001a\u001f\u0010?\u001a\u00020<*\u00020\u00002\n\u0010;\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0013\u0010@\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010C\u001a\u00020B*\u00020\u0000H\u0000¢\u0006\u0004\bC\u0010D\u001a\u0013\u0010F\u001a\u00020E*\u00020\u0000H\u0000¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010H\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010K\u001a\u00020J*\u00020\u0000¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010N\u001a\u00020M*\u00020\u0000¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010Q\u001a\u00020P*\u00020\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010T\u001a\u00020S*\u00020\u0000¢\u0006\u0004\bT\u0010U\u001a\u0011\u0010V\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\bV\u0010I\u001a\u0011\u0010W\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\bW\u0010I\u001a\u0011\u0010X\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\bX\u0010I\u001a\u0019\u0010]\u001a\u00020\u0007*\u00020\u00002\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0013\u0010_\u001a\u0004\u0018\u00010^*\u00020\u0000¢\u0006\u0004\b_\u0010`\u001a\u0015\u0010b\u001a\u0004\u0018\u00010a*\u00020\u0006H\u0000¢\u0006\u0004\bb\u0010c\u001a>\u0010f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00062\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010g\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0002¢\u0006\u0004\bg\u0010h\"\u0018\u0010i\u001a\u00020\u0003*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "", "block", "visitAncestors", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "nearestAncestor", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutNode;", "p0", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/runtime/collection/MutableVector;", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "zOrder", "visitChildren", "visitSubtreeIf", "visitLocalDescendants", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalAncestors", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitSelfAndLocalDescendants-6rFNWt0", "visitSelfAndLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitLocalAncestors-6rFNWt0", "visitAncestors-Y-YKmho", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndAncestors", "", "ancestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;IZ)Ljava/util/List;", "ancestors", "", "setOfAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;IZ)Ljava/util/Set;", "setOfAncestors", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "visitChildren-Y-YKmho", "visitSelfAndChildren-Y-YKmho", "visitSelfAndChildren", "visitSubtreeIf-Y-YKmho", "visitSubtree-Y-YKmho", "visitSubtree", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "requireLayoutNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "requireSemanticsInfo", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;", "requestAutofill", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Landroidx/compose/ui/unit/Density;", "requireDensity", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireGraphicsContext", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutCoordinates", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "invalidateSubtree", "invalidateMeasurementForSubtree", "invalidateDrawForSubtree", "Landroidx/compose/ui/geometry/Offset;", "delta", "dispatchOnScrollChanged-Uv8p0NA", "(Landroidx/compose/ui/node/DelegatableNode;J)V", "dispatchOnScrollChanged", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "findNearestBeyondBoundsLayoutAncestor", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "dispatchForKind", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final boolean isDelegationRoot(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final void visitAncestors(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static /* synthetic */ void visitAncestors$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final androidx.compose.ui.Modifier.Node nearestAncestor(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    private static final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode layoutNode, boolean z) {
        if (z) {
            return layoutNode.getZSortedChildren();
        }
        return layoutNode.get_children$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Node> mutableVector, androidx.compose.ui.Modifier.Node node, boolean z) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requireLayoutNode(node), z);
        int size = highSpeedVideoFpsRanges.getSize() - 1;
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = highSpeedVideoFpsRanges.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes().getHead());
                size--;
            }
        }
    }

    public static final void visitChildren(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) == 0) {
                Camera2StreamConfigurationMap(mutableVector, node, z);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                        break;
                    }
                    node = node.getChild();
                }
            }
        }
    }

    public static final void visitSubtreeIf(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, java.lang.Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) == 0 || function1.invoke(node2).booleanValue()) {
                    }
                }
            }
            Camera2StreamConfigurationMap(mutableVector, node, z);
        }
    }

    public static final void visitLocalDescendants(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            if (!z) {
                node = node.getChild();
            }
            while (node != null) {
                if ((node.getKindSet() & i) != 0) {
                    function1.invoke(node);
                }
                node = node.getChild();
            }
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            if (!z) {
                node = node.getChild();
            }
            while (node != null) {
                if ((node.getKindSet() & i) != 0) {
                    function1.invoke(node);
                }
                node = node.getChild();
            }
        }
    }

    public static final void visitLocalAncestors(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i) != 0) {
                function1.invoke(parent);
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m7511visitSelfAndAncestors5BbP62I(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, int i2, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        int i3 = i | i2;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node2 = delegatableNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i3) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i3) != 0) {
                        if (node2 != node && (node2.getKindSet() & i2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i) != 0) {
                            androidx.compose.ui.Modifier.Node node3 = node2;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (node3 != null) {
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                                if (node3 instanceof java.lang.Object) {
                                    function1.invoke(node3);
                                } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i4 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                node3 = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node3 != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(node3);
                                                    }
                                                    node3 = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                node3 = getHighSpeedVideoFpsRangesFor(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m7512visitSelfAndChildrenYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof java.lang.Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i2 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & i) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            node = getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector2, delegatableNode.getNode(), z);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & i) == 0) {
                Camera2StreamConfigurationMap(mutableVector2, node2, z);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                function1.invoke(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node2 = delegate2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate2);
                                            }
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m7513visitSelfAndChildrenYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof java.lang.Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i3 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & i) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                }
                if (i3 != 1) {
                }
            }
            node = getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector2, delegatableNode.getNode(), z);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & i) == 0) {
                Camera2StreamConfigurationMap(mutableVector2, node2, z);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                function1.invoke(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i4 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & i) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node2 = delegate2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate2);
                                            }
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m7500has64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i) != 0;
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != delegatableNode || !androidx.compose.ui.node.NodeKindKt.m7630getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator;
        }
        androidx.compose.ui.node.NodeCoordinator wrapped = coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    public static final androidx.compose.ui.node.LayoutNode requireLayoutNode(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        androidx.compose.ui.node.NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final androidx.compose.ui.semantics.SemanticsInfo requireSemanticsInfo(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    public static final androidx.compose.ui.node.Owner requireOwner(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        androidx.compose.ui.node.Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final void requestAutofill(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui();
    }

    public static final androidx.compose.ui.unit.Density requireDensity(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final androidx.compose.ui.graphics.GraphicsContext requireGraphicsContext(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final androidx.compose.ui.unit.LayoutDirection requireLayoutDirection(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final androidx.compose.ui.layout.LayoutCoordinates requireLayoutCoordinates(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        androidx.compose.ui.layout.LayoutCoordinates coordinates = m7502requireCoordinator64DMado(delegatableNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final void invalidateSubtree(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.node.LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final void invalidateMeasurementForSubtree(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            requireLayoutNode(delegatableNode).invalidateMeasurementForSubtree();
        }
    }

    public static final void invalidateDrawForSubtree(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.node.LayoutNode.invalidateDrawForSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    /* renamed from: dispatchOnScrollChanged-Uv8p0NA, reason: not valid java name */
    public static final void m7499dispatchOnScrollChangedUv8p0NA(androidx.compose.ui.node.DelegatableNode delegatableNode, long j) {
        requireOwner(delegatableNode).mo7687dispatchOnScrollChangedk4lQ0M(j);
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m7498dispatchForKind6rFNWt0(androidx.compose.ui.Modifier.Node node, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof java.lang.Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i2 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & i) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            node = getHighSpeedVideoFpsRangesFor(mutableVector);
        }
    }

    public static final void visitLocalDescendants(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i) != 0) {
                    function1.invoke(child);
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m7514visitSelfAndLocalDescendants6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            while (node != null) {
                if ((node.getKindSet() & i) != 0) {
                    androidx.compose.ui.Modifier.Node node2 = node;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node2 != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node2 instanceof java.lang.Object) {
                            function1.invoke(node2);
                        } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i2 = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & i) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node2);
                                            }
                                            node2 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i2 != 1) {
                            }
                        }
                        node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
                node = node.getChild();
            }
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m7510visitLocalDescendants6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i) != 0) {
                    androidx.compose.ui.Modifier.Node node2 = child;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node2 != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node2 instanceof java.lang.Object) {
                            function1.invoke(node2);
                        } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i2 = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & i) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node2);
                                            }
                                            node2 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i2 != 1) {
                            }
                        }
                        node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m7509visitLocalAncestors6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i) != 0) {
                androidx.compose.ui.Modifier.Node node = parent;
                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                while (node != null) {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                    if (node instanceof java.lang.Object) {
                        function1.invoke(node);
                    } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                        int i2 = 0;
                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & i) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = null;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                        }
                        if (i2 != 1) {
                        }
                    }
                    node = getHighSpeedVideoFpsRangesFor(mutableVector);
                }
            }
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m7505visitAncestorsYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                function1.invoke(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m7506visitAncestorsYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (!(node2 instanceof java.lang.Object)) {
                                if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node2 = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                            } else {
                                function1.invoke(node2);
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: ancestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> java.util.List<T> m7496ancestors6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        java.util.ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* renamed from: ancestors-6rFNWt0$default, reason: not valid java name */
    public static /* synthetic */ java.util.List m7497ancestors6rFNWt0$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        java.util.ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* renamed from: setOfAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> java.util.Set<T> m7503setOfAncestors6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        java.util.LinkedHashSet linkedHashSet = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                if (linkedHashSet == null) {
                                    linkedHashSet = new java.util.LinkedHashSet();
                                }
                                linkedHashSet.add(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return linkedHashSet;
    }

    /* renamed from: setOfAncestors-6rFNWt0$default, reason: not valid java name */
    public static /* synthetic */ java.util.Set m7504setOfAncestors6rFNWt0$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        java.util.LinkedHashSet linkedHashSet = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                if (linkedHashSet == null) {
                                    linkedHashSet = new java.util.LinkedHashSet();
                                }
                                linkedHashSet.add(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            node2 = getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return linkedHashSet;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m7501nearestAncestor64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        java.lang.Object obj = (T) parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (obj != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (obj instanceof java.lang.Object) {
                                return (T) obj;
                            }
                            java.lang.Object obj2 = obj;
                            if ((((androidx.compose.ui.Modifier.Node) obj).getKindSet() & i) != 0 && (obj instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            obj = (T) delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            java.lang.Object obj3 = obj;
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            obj = (T) getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m7507visitChildrenYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) == 0) {
                Camera2StreamConfigurationMap(mutableVector, node, z);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof java.lang.Object) {
                                function1.invoke(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m7508visitChildrenYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) == 0) {
                Camera2StreamConfigurationMap(mutableVector, node, z);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (!(node instanceof java.lang.Object)) {
                                if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                            } else {
                                function1.invoke(node);
                            }
                            node = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m7517visitSubtreeIfYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node3 instanceof java.lang.Object) {
                                if (!function1.invoke(node3).booleanValue()) {
                                    break;
                                }
                            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node3);
                                                }
                                                node3 = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node3 = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            Camera2StreamConfigurationMap(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m7518visitSubtreeIfYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node3 instanceof java.lang.Object) {
                                if (!((java.lang.Boolean) function1.invoke(node3)).booleanValue()) {
                                    break;
                                }
                            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node3 = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node3);
                                                }
                                                node3 = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            node3 = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            Camera2StreamConfigurationMap(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m7515visitSubtreeYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node3 instanceof java.lang.Object) {
                                function1.invoke(node3);
                            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node3);
                                                }
                                                node3 = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node3 = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            Camera2StreamConfigurationMap(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m7516visitSubtreeYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (!(node3 instanceof java.lang.Object)) {
                                if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node3 = delegate;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node3 != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node3);
                                                    }
                                                    node3 = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                            } else {
                                function1.invoke(node3);
                            }
                            node3 = getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            Camera2StreamConfigurationMap(mutableVector, node, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static final androidx.compose.ui.layout.BeyondBoundsLayout findNearestBeyondBoundsLayoutAncestor(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        androidx.compose.ui.node.NodeChain nodes;
        java.lang.Object obj;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8388608) | androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (delegatingNode != 0) {
                    if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0) {
                        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(8388608) & delegatingNode.getKindSet()) != 0) {
                            if (!(delegatingNode instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode)) {
                                if (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    delegatingNode = 0;
                                    while (delegate != null) {
                                        if (delegate instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode) {
                                            delegatingNode = delegate;
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                } else {
                                    delegatingNode = 0;
                                }
                            }
                            androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode beyondBoundsLayoutProviderModifierNode = (androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode) delegatingNode;
                            if (beyondBoundsLayoutProviderModifierNode != null) {
                                return beyondBoundsLayoutProviderModifierNode.getBeyondBoundsLayout();
                            }
                            return null;
                        }
                        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(32) & delegatingNode.getKindSet()) == 0) {
                            continue;
                        } else {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                obj = delegatingNode;
                            } else if (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode) {
                                obj = null;
                                for (androidx.compose.ui.Modifier.Node delegate2 = delegatingNode.getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if (delegate2 instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                        obj = delegate2;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = (androidx.compose.ui.modifier.ModifierLocalModifierNode) obj;
                            if (modifierLocalModifierNode != null && modifierLocalModifierNode.getProvidedValues().contains$ui(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout())) {
                                return (androidx.compose.ui.layout.BeyondBoundsLayout) modifierLocalModifierNode.getProvidedValues().get$ui(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
                            }
                        }
                    }
                    delegatingNode = delegatingNode.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode(androidx.compose.ui.Modifier.Node node) {
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & node.getKindSet()) == 0) {
            return null;
        }
        if (node instanceof androidx.compose.ui.node.LayoutModifierNode) {
            return (androidx.compose.ui.node.LayoutModifierNode) node;
        }
        if (!(node instanceof androidx.compose.ui.node.DelegatingNode)) {
            return null;
        }
        androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate();
        while (delegate != 0) {
            if (delegate instanceof androidx.compose.ui.node.LayoutModifierNode) {
                return (androidx.compose.ui.node.LayoutModifierNode) delegate;
            }
            if ((delegate instanceof androidx.compose.ui.node.DelegatingNode) && (androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & delegate.getKindSet()) != 0) {
                delegate = ((androidx.compose.ui.node.DelegatingNode) delegate).getDelegate();
            } else {
                delegate = delegate.getChild();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier.Node getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }
}
