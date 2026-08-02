package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "editable", "singleLine", "Lkotlin/Function0;", "onSubmit", "onKeyEvent-8zsqlwg", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/platform/SoftwareKeyboardController;ZZLkotlin/jvm/functions/Function0;)Z", "onKeyEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextFieldKeyEventHandler extends androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public final boolean mo2205onPreKeyEventMyFupTE(android.view.KeyEvent event, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController) {
        boolean mo2205onPreKeyEventMyFupTE = super.mo2205onPreKeyEventMyFupTE(event, textFieldState, textFieldSelectionState, focusManager, keyboardController);
        if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
            return mo2205onPreKeyEventMyFupTE;
        }
        if (mo2205onPreKeyEventMyFupTE) {
            return true;
        }
        android.view.InputDevice device = event.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual() || !androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) || event.getSource() == 257) {
            return false;
        }
        if (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2252access$isKeyCodeYhN2O0w(event, 19)) {
            return focusManager.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s());
        }
        if (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2252access$isKeyCodeYhN2O0w(event, 20)) {
            return focusManager.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s());
        }
        if (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2252access$isKeyCodeYhN2O0w(event, 21)) {
            return focusManager.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s());
        }
        if (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2252access$isKeyCodeYhN2O0w(event, 22)) {
            return focusManager.mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s());
        }
        if (!androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2252access$isKeyCodeYhN2O0w(event, 23)) {
            return false;
        }
        keyboardController.show();
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-8zsqlwg, reason: not valid java name */
    public final boolean mo2204onKeyEvent8zsqlwg(android.view.KeyEvent event, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> clipboardKeyCommandsHandler, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController, boolean editable, boolean singleLine, kotlin.jvm.functions.Function0<java.lang.Boolean> onSubmit) {
        if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) && event.isFromSource(257) && (!androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event) || !androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m2125isTypedEventZmokQxo(event))) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo2204onKeyEvent8zsqlwg(event, textFieldState, textLayoutState, textFieldSelectionState, clipboardKeyCommandsHandler, keyboardController, editable, singleLine, onSubmit);
    }
}
