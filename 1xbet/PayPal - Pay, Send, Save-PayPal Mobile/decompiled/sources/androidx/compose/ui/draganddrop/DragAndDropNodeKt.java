package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a0\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0001\u0010\n\u001a,\u0010\u0012\u001a\u00020\u00112\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "DragAndDropModifierNode", "()Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "onStartTransfer", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "DragAndDropSourceModifierNode", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "DragAndDropTargetModifierNode", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "Use DragAndDropSourceModifierNode instead", replaceWith = @kotlin.ReplaceWith(expression = "DragAndDropSourceModifierNode", imports = {}))
    public static final androidx.compose.ui.draganddrop.DragAndDropModifierNode DragAndDropModifierNode() {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "Use DragAndDropTargetModifierNode instead", replaceWith = @kotlin.ReplaceWith(expression = "DragAndDropTargetModifierNode", imports = {}))
    public static final androidx.compose.ui.draganddrop.DragAndDropModifierNode DragAndDropModifierNode(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, final androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(null, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.draganddrop.DragAndDropTarget invoke(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
                if (function1.invoke(dragAndDropEvent).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode DragAndDropSourceModifierNode(kotlin.jvm.functions.Function2<? super androidx.compose.ui.draganddrop.DragAndDropStartTransferScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2) {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(function2, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode DragAndDropTargetModifierNode(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, final androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(null, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropTargetModifierNode$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.draganddrop.DragAndDropTarget invoke(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
                if (function1.invoke(dragAndDropEvent).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: access$contains-Uv8p0NA, reason: not valid java name */
    public static final /* synthetic */ boolean m5532access$containsUv8p0NA(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().getIsAttached()) {
            return false;
        }
        androidx.compose.ui.layout.LayoutCoordinates coordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(coordinates);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (positionInRoot >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (positionInRoot & 4294967295L));
        float size = (int) (dragAndDropNode.getSize() >> 32);
        float size2 = (int) (dragAndDropNode.getSize() & 4294967295L);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > size + intBitsToFloat) {
            return false;
        }
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= size2 + intBitsToFloat2;
    }

    public static final /* synthetic */ void access$dispatchEntered(androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    public static final /* synthetic */ void access$traverseSelfAndDescendants(androidx.compose.ui.node.TraversableNode traversableNode, kotlin.jvm.functions.Function1 function1) {
        if (function1.invoke(traversableNode) == androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(traversableNode, function1);
        }
    }
}
