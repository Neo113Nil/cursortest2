package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "isTypedEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isTypedEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m2125isTypedEventZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !java.lang.Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
