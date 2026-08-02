package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "interceptDPadAndMoveFocus", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/KeyEvent;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final androidx.compose.ui.Modifier interceptDPadAndMoveFocus(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, final androidx.compose.ui.focus.FocusManager focusManager) {
        return androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                return getHighSpeedVideoFpsRangesFor(keyEvent.m7078unboximpl());
            }

            private java.lang.Boolean getHighSpeedVideoFpsRangesFor(android.view.KeyEvent keyEvent) {
                boolean z;
                boolean highResolutionOutputSizeshNQ4ISI;
                boolean highResolutionOutputSizeshNQ4ISI2;
                boolean highResolutionOutputSizeshNQ4ISI3;
                boolean highResolutionOutputSizeshNQ4ISI4;
                boolean highResolutionOutputSizeshNQ4ISI5;
                android.view.InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) && keyEvent.getSource() != 257)) {
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.getHighResolutionOutputSizeshNQ4ISI(keyEvent, 19);
                    if (highResolutionOutputSizeshNQ4ISI) {
                        z = androidx.compose.ui.focus.FocusManager.this.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s());
                    } else {
                        highResolutionOutputSizeshNQ4ISI2 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.getHighResolutionOutputSizeshNQ4ISI(keyEvent, 20);
                        if (highResolutionOutputSizeshNQ4ISI2) {
                            z = androidx.compose.ui.focus.FocusManager.this.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s());
                        } else {
                            highResolutionOutputSizeshNQ4ISI3 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.getHighResolutionOutputSizeshNQ4ISI(keyEvent, 21);
                            if (highResolutionOutputSizeshNQ4ISI3) {
                                z = androidx.compose.ui.focus.FocusManager.this.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s());
                            } else {
                                highResolutionOutputSizeshNQ4ISI4 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.getHighResolutionOutputSizeshNQ4ISI(keyEvent, 22);
                                if (highResolutionOutputSizeshNQ4ISI4) {
                                    z = androidx.compose.ui.focus.FocusManager.this.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s());
                                } else {
                                    highResolutionOutputSizeshNQ4ISI5 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.getHighResolutionOutputSizeshNQ4ISI(keyEvent, 23);
                                    if (highResolutionOutputSizeshNQ4ISI5) {
                                        androidx.compose.ui.platform.SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                                        if (keyboardController != null) {
                                            keyboardController.show();
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent keyEvent, int i) {
        return androidx.compose.ui.input.key.Key_androidKt.m7096getNativeKeyCodeYVgTNJs(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(keyEvent)) == i;
    }
}
