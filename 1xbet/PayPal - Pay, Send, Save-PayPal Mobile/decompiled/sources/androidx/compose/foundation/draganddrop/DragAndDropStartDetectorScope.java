package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "requestDragAndDropTransfer-k-4lQ0M", "(J)V", "requestDragAndDropTransfer"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DragAndDropStartDetectorScope extends androidx.compose.ui.input.pointer.PointerInputScope {
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M */
    void mo1410requestDragAndDropTransferk4lQ0M(long offset);

    /* renamed from: requestDragAndDropTransfer-k-4lQ0M$default, reason: not valid java name */
    static /* synthetic */ void m1423requestDragAndDropTransferk4lQ0M$default(androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
        }
        if ((i & 1) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        dragAndDropStartDetectorScope.mo1410requestDragAndDropTransferk4lQ0M(j);
    }
}
