package androidx.compose.foundation.text;

/* compiled from: KeyboardActionRunner.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "runAction", "runAction-KlQnJC8", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements androidx.compose.foundation.text.KeyboardActionScope {
    public static final int $stable = 8;
    public androidx.compose.ui.focus.FocusManager focusManager;
    public androidx.compose.foundation.text.KeyboardActions keyboardActions;
    private final androidx.compose.ui.platform.SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    public final androidx.compose.foundation.text.KeyboardActions getKeyboardActions() {
        androidx.compose.foundation.text.KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final void setKeyboardActions(androidx.compose.foundation.text.KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final androidx.compose.ui.focus.FocusManager getFocusManager() {
        androidx.compose.ui.focus.FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final void setFocusManager(androidx.compose.ui.focus.FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m876runActionKlQnJC8(int imeAction) {
        kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit> function1;
        kotlin.Unit unit = null;
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (!androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo()) && !androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo())) {
                throw new java.lang.IllegalStateException("invalid ImeAction".toString());
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            mo875defaultKeyboardActionKlQnJC8(imeAction);
        }
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo875defaultKeyboardActionKlQnJC8(int imeAction) {
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
            getFocusManager().mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s());
            return;
        }
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
            getFocusManager().mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s());
            return;
        }
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
            androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
                return;
            }
            return;
        }
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
            return;
        }
        androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo());
    }
}
