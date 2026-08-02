package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0004\u001a\u00020\u0000*\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"", "firstDownRefersToPrimaryMouseButtonOnly", "()Z", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isDeepPress", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }

    public static final boolean isDeepPress(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        return pointerEvent.getClassification() == 2;
    }
}
