package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "isMouseOrTouchPad", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionGestures_androidKt {
    public static final boolean isMouseOrTouchPad(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        android.view.MotionEvent motionEvent;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(changes.get(i).getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7304getMouseT8wyACA())) {
                i++;
            } else {
                android.view.MotionEvent motionEvent2 = pointerEvent.getMotionEvent();
                if ((motionEvent2 == null || !motionEvent2.isFromSource(8194)) && ((motionEvent = pointerEvent.getMotionEvent()) == null || !motionEvent.isFromSource(androidx.core.view.InputDeviceCompat.SOURCE_TOUCHPAD))) {
                    return false;
                }
            }
        }
        return true;
    }
}
