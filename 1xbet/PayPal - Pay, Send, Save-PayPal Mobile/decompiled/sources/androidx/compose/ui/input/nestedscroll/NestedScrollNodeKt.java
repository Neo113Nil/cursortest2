package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/node/DelegatableNode;", "nestedScrollModifierNode", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/TraversableNode;", "T", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollNodeKt {
    public static final androidx.compose.ui.node.DelegatableNode nestedScrollModifierNode(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        return new androidx.compose.ui.input.nestedscroll.NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends androidx.compose.ui.node.TraversableNode> T getHighSpeedVideoFpsRanges(T t) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(t, new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.TraversableNode traversableNode) {
                boolean z;
                if (traversableNode.getNode().getIsAttached()) {
                    objectRef.element = traversableNode;
                    z = false;
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return (T) objectRef.element;
    }
}
