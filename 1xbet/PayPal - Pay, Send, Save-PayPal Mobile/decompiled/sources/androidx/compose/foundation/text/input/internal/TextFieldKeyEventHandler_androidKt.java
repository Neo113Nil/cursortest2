package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "createTextFieldKeyEventHandler", "()Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "isFromSoftKeyboard-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isFromSoftKeyboard"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new androidx.compose.foundation.text.input.internal.AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m2253isFromSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* renamed from: access$isKeyCode-YhN2O0w, reason: not valid java name */
    public static final /* synthetic */ boolean m2252access$isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return androidx.compose.ui.input.key.Key_androidKt.m7096getNativeKeyCodeYVgTNJs(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(keyEvent)) == i;
    }
}
