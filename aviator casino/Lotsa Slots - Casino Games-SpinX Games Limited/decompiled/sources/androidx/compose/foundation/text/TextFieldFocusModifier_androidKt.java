package androidx.compose.foundation.text;

/* compiled from: TextFieldFocusModifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final androidx.compose.ui.Modifier interceptDPadAndMoveFocus(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.TextFieldState textFieldState, final androidx.compose.ui.focus.FocusManager focusManager) {
        return androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                return m930invokeZmokQxo(keyEvent.m3123unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final java.lang.Boolean m930invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean m929isKeyCodeYhN2O0w;
                boolean m929isKeyCodeYhN2O0w2;
                boolean m929isKeyCodeYhN2O0w3;
                boolean m929isKeyCodeYhN2O0w4;
                boolean m929isKeyCodeYhN2O0w5;
                android.view.InputDevice device = keyEvent.getDevice();
                boolean z = false;
                if (device != null && device.supportsSource(androidx.core.view.InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY())) {
                    m929isKeyCodeYhN2O0w = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m929isKeyCodeYhN2O0w(keyEvent, 19);
                    if (m929isKeyCodeYhN2O0w) {
                        z = androidx.compose.ui.focus.FocusManager.this.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s());
                    } else {
                        m929isKeyCodeYhN2O0w2 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m929isKeyCodeYhN2O0w(keyEvent, 20);
                        if (m929isKeyCodeYhN2O0w2) {
                            z = androidx.compose.ui.focus.FocusManager.this.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s());
                        } else {
                            m929isKeyCodeYhN2O0w3 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m929isKeyCodeYhN2O0w(keyEvent, 21);
                            if (m929isKeyCodeYhN2O0w3) {
                                z = androidx.compose.ui.focus.FocusManager.this.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s());
                            } else {
                                m929isKeyCodeYhN2O0w4 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m929isKeyCodeYhN2O0w(keyEvent, 22);
                                if (m929isKeyCodeYhN2O0w4) {
                                    z = androidx.compose.ui.focus.FocusManager.this.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s());
                                } else {
                                    m929isKeyCodeYhN2O0w5 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m929isKeyCodeYhN2O0w(keyEvent, 23);
                                    if (m929isKeyCodeYhN2O0w5) {
                                        androidx.compose.ui.platform.SoftwareKeyboardController keyboardController = textFieldState.getKeyboardController();
                                        if (keyboardController != null) {
                                            keyboardController.show();
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m929isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return androidx.compose.ui.input.key.Key_androidKt.m3141getNativeKeyCodeYVgTNJs(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(keyEvent)) == i;
    }
}
