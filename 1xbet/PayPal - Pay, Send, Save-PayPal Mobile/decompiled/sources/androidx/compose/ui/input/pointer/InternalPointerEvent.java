package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "<init>", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/input/pointer/PointerInputEvent;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "activeHoverEvent-0FcD4WY", "(J)Z", "activeHoverEvent", "Landroidx/collection/LongSparseArray;", "getChanges", "()Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "getPointerInputEvent", "()Landroidx/compose/ui/input/pointer/PointerInputEvent;", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "motionEvent", "suppressMovementConsumption", "Z", "getSuppressMovementConsumption", "()Z", "setSuppressMovementConsumption", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalPointerEvent {
    public static final int $stable = 8;
    private final androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> changes;
    private final androidx.compose.ui.input.pointer.PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> longSparseArray, androidx.compose.ui.input.pointer.PointerInputEvent pointerInputEvent) {
        this.changes = longSparseArray;
        this.pointerInputEvent = pointerInputEvent;
    }

    public final androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> getChanges() {
        return this.changes;
    }

    public final androidx.compose.ui.input.pointer.PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final android.view.MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m7161activeHoverEvent0FcD4WY(long pointerId) {
        androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i);
            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputEventData.m7244getIdJ3iCeTQ(), pointerId)) {
                break;
            }
            i++;
        }
        androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }
}
