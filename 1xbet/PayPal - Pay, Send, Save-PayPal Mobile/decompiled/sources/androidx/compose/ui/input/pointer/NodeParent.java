package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "<init>", "()V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "buildCache", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchMainEventPass", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "", "dispatchCancel", "Landroidx/compose/ui/Modifier$Node;", "pointerInputModifierNode", "removePointerInputModifierNode", "(Landroidx/compose/ui/Modifier$Node;)V", "clear", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "hitNodes", "removeInvalidPointerIdsAndChanges", "(JLandroidx/collection/MutableObjectList;)V", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "Landroidx/compose/runtime/collection/MutableVector;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableObjectList;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class NodeParent {
    public static final int $stable = 8;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.input.pointer.Node[16], 0);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.NodeParent> Camera2StreamConfigurationMap = new androidx.collection.MutableObjectList<>(10);

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> getChildren() {
        return this.children;
    }

    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        androidx.compose.ui.input.pointer.Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = nodeArr[i].buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
        }
        return z;
    }

    public boolean dispatchMainEventPass(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        androidx.compose.ui.input.pointer.Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = nodeArr[i].dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
        }
        return z;
    }

    public boolean dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        androidx.compose.ui.input.pointer.Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = nodeArr[i].dispatchFinalEventPass(internalPointerEvent) || z;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public void dispatchCancel() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        androidx.compose.ui.input.pointer.Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].dispatchCancel();
        }
    }

    public void removePointerInputModifierNode(androidx.compose.ui.Modifier.Node pointerInputModifierNode) {
        this.Camera2StreamConfigurationMap.clear();
        this.Camera2StreamConfigurationMap.add(this);
        while (this.Camera2StreamConfigurationMap.isNotEmpty()) {
            androidx.compose.ui.input.pointer.NodeParent removeAt = this.Camera2StreamConfigurationMap.removeAt(r0.getSize() - 1);
            int i = 0;
            while (i < removeAt.children.getSize()) {
                androidx.compose.ui.input.pointer.Node node = removeAt.children.content[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(node.getModifierNode(), pointerInputModifierNode)) {
                    removeAt.children.remove(node);
                    node.dispatchCancel();
                } else {
                    this.Camera2StreamConfigurationMap.add(node);
                    i++;
                }
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, androidx.collection.MutableObjectList<androidx.compose.ui.input.pointer.Node> hitNodes) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        androidx.compose.ui.input.pointer.Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
        }
    }

    public void cleanUpHits(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        for (int size = this.children.getSize() - 1; size >= 0; size--) {
            if (this.children.content[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }
}
