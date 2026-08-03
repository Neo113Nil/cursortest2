package androidx.compose.ui.draganddrop;

/* compiled from: DragAndDropNode.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a1\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u000b\u001a\u00020\b*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"DragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "shouldStartDragAndDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "target", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "contains", "position", "Landroidx/compose/ui/geometry/Offset;", "contains-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z", "dispatchEntered", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    public static final androidx.compose.ui.draganddrop.DragAndDropModifierNode DragAndDropModifierNode() {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.ui.draganddrop.DragAndDropTarget invoke(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
                return null;
            }
        });
    }

    public static final androidx.compose.ui.draganddrop.DragAndDropModifierNode DragAndDropModifierNode(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, final androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        return new androidx.compose.ui.draganddrop.DragAndDropNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.ui.draganddrop.DragAndDropTarget invoke(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
                if (function1.invoke(dragAndDropEvent).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m1763containsUv8p0NA(androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode, long j) {
        if (!dragAndDropModifierNode.getNode().getIsAttached()) {
            return false;
        }
        androidx.compose.ui.layout.LayoutCoordinates coordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long mo3409getSizeYbymL2g = coordinates.mo3409getSizeYbymL2g();
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(mo3409getSizeYbymL2g);
        int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(mo3409getSizeYbymL2g);
        long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(coordinates);
        float m1861component1impl = androidx.compose.ui.geometry.Offset.m1861component1impl(positionInRoot);
        float m1862component2impl = androidx.compose.ui.geometry.Offset.m1862component2impl(positionInRoot);
        float f = m4652getWidthimpl + m1861component1impl;
        float f2 = m4651getHeightimpl + m1862component2impl;
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(j);
        if (m1861component1impl > m1871getXimpl || m1871getXimpl > f) {
            return false;
        }
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(j);
        return m1862component2impl <= m1872getYimpl && m1872getYimpl <= f2;
    }
}
