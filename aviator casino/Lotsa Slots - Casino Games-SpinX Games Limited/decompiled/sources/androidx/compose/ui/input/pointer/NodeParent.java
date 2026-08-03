package androidx.compose.ui.input.pointer;

/* compiled from: HitPathTracker.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J.\u0010\u0017\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0006\u0010\u0018\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "()V", com.helpshift.proactive.InAppViewConstants.CHILDREN, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "buildCache", "", "changes", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "parentCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clear", "dispatchCancel", "dispatchFinalEventPass", "dispatchMainEventPass", "removeDetachedPointerInputFilters", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = androidx.compose.runtime.collection.MutableVector.$stable;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> children = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.input.pointer.Node[16], 0);

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> getChildren() {
        return this.children;
    }

    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        androidx.compose.ui.input.pointer.Node[] content = mutableVector.getContent();
        int i = 0;
        boolean z = false;
        do {
            z = content[i].buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i++;
        } while (i < size);
        return z;
    }

    public boolean dispatchMainEventPass(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes, androidx.compose.ui.layout.LayoutCoordinates parentCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        androidx.compose.ui.input.pointer.Node[] content = mutableVector.getContent();
        int i = 0;
        boolean z = false;
        do {
            z = content[i].dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i++;
        } while (i < size);
        return z;
    }

    public boolean dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z = false;
        if (size > 0) {
            androidx.compose.ui.input.pointer.Node[] content = mutableVector.getContent();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = content[i].dispatchFinalEventPass(internalPointerEvent) || z2;
                i++;
            } while (i < size);
            z = z2;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public void dispatchCancel() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.input.pointer.Node[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        int i = 0;
        while (i < this.children.getSize()) {
            androidx.compose.ui.input.pointer.Node node = this.children.getContent()[i];
            if (!node.getModifierNode().getIsAttached()) {
                this.children.removeAt(i);
                node.dispatchCancel();
            } else {
                i++;
                node.removeDetachedPointerInputFilters();
            }
        }
    }

    public void cleanUpHits(androidx.compose.ui.input.pointer.InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.getContent()[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }
}
