package androidx.compose.ui.input.key;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0015\u0010\u0015\u001a\u00020\f*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e*\n\u0010\u0017\"\u00020\u00162\u00020\u0016"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "Landroidx/compose/ui/input/key/Key;", "getKey-ZmokQxo", "(Landroid/view/KeyEvent;)J", "key", "", "getUtf16CodePoint-ZmokQxo", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/KeyEventType;", "getType-ZmokQxo", "type", "", "isAltPressed-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "isCtrlPressed-ZmokQxo", "isCtrlPressed", "isMetaPressed-ZmokQxo", "isMetaPressed", "isShiftPressed-ZmokQxo", "isShiftPressed", "Landroid/view/KeyEvent;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m7089getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return androidx.compose.ui.input.key.Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m7091getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m7090getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY();
        }
        if (action == 1) {
            return androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7087getKeyUpCS__XNY();
        }
        return androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7088getUnknownCS__XNY();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7092isAltPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7093isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7094isMetaPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m7095isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
