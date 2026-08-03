package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldKeyEventHandler.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "()V", "onPreKeyEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1116onPreKeyEventMyFupTE(android.view.KeyEvent event, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController) {
        boolean m1147isKeyCodeYhN2O0w;
        boolean m1147isKeyCodeYhN2O0w2;
        boolean m1147isKeyCodeYhN2O0w3;
        boolean m1147isKeyCodeYhN2O0w4;
        boolean m1147isKeyCodeYhN2O0w5;
        if (super.mo1116onPreKeyEventMyFupTE(event, textFieldState, textFieldSelectionState, focusManager, keyboardController)) {
            return true;
        }
        android.view.InputDevice device = event.getDevice();
        if (device != null && device.supportsSource(androidx.core.view.InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY())) {
            m1147isKeyCodeYhN2O0w = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.m1147isKeyCodeYhN2O0w(event, 19);
            if (m1147isKeyCodeYhN2O0w) {
                return focusManager.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s());
            }
            m1147isKeyCodeYhN2O0w2 = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.m1147isKeyCodeYhN2O0w(event, 20);
            if (m1147isKeyCodeYhN2O0w2) {
                return focusManager.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s());
            }
            m1147isKeyCodeYhN2O0w3 = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.m1147isKeyCodeYhN2O0w(event, 21);
            if (m1147isKeyCodeYhN2O0w3) {
                return focusManager.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s());
            }
            m1147isKeyCodeYhN2O0w4 = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.m1147isKeyCodeYhN2O0w(event, 22);
            if (m1147isKeyCodeYhN2O0w4) {
                return focusManager.mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s());
            }
            m1147isKeyCodeYhN2O0w5 = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.m1147isKeyCodeYhN2O0w(event, 23);
            if (m1147isKeyCodeYhN2O0w5) {
                keyboardController.show();
                return true;
            }
        }
        return false;
    }
}
