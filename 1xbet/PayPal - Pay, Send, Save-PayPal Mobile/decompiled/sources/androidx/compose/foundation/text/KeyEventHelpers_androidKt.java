package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "cancelsTextSelection", "", "showCharacterPalette", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyEventHelpers_androidKt {
    public static final void showCharacterPalette() {
    }

    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m2053cancelsTextSelectionZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7087getKeyUpCS__XNY());
    }
}
