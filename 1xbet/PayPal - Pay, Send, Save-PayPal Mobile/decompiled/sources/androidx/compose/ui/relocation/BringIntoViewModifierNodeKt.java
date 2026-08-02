package androidx.compose.ui.relocation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "bringIntoView", "(Landroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewModifierNodeKt {
    public static /* synthetic */ java.lang.Object bringIntoView$default(androidx.compose.ui.node.DelegatableNode delegatableNode, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return bringIntoView(delegatableNode, function0, continuation);
    }

    public static final java.lang.Object bringIntoView(androidx.compose.ui.node.DelegatableNode delegatableNode, final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj;
        final androidx.compose.ui.layout.LayoutCoordinates requireLayoutCoordinates;
        java.lang.Object bringIntoView;
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            return kotlin.Unit.INSTANCE;
        }
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(524288);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.relocation.BringIntoViewModifierNode) {
                                obj = node;
                                break loop0;
                            }
                            if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mutableVector.add(node));
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mutableVector.add(delegate));
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        androidx.compose.ui.relocation.BringIntoViewModifierNode bringIntoViewModifierNode = (androidx.compose.ui.relocation.BringIntoViewModifierNode) obj;
        return (bringIntoViewModifierNode != null && (bringIntoView = bringIntoViewModifierNode.bringIntoView((requireLayoutCoordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(delegatableNode)), new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.ui.geometry.Rect invoke;
                kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function02 = function0;
                if (function02 != null && (invoke = function02.invoke()) != null) {
                    return invoke;
                }
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = requireLayoutCoordinates;
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(layoutCoordinates.mo7361getSizeYbymL2g()));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? bringIntoView : kotlin.Unit.INSTANCE;
    }
}
