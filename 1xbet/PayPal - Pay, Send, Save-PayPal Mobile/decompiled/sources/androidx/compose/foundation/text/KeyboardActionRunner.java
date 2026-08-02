package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "runAction-KlQnJC8", "(I)Z", "runAction", "p0", "getHighResolutionOutputSizeshNQ4ISI", "", "defaultKeyboardAction-KlQnJC8", "(I)V", "defaultKeyboardAction", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyboardActionRunner implements androidx.compose.foundation.text.KeyboardActionScope {
    public static final int $stable = 8;
    public androidx.compose.ui.focus.FocusManager focusManager;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.SoftwareKeyboardController getHighSpeedVideoFpsRangesFor;
    public androidx.compose.foundation.text.KeyboardActions keyboardActions;

    public KeyboardActionRunner(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        this.getHighSpeedVideoFpsRangesFor = softwareKeyboardController;
    }

    public final androidx.compose.foundation.text.KeyboardActions getKeyboardActions() {
        androidx.compose.foundation.text.KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
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
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setFocusManager(androidx.compose.ui.focus.FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final boolean m2056runActionKlQnJC8(int imeAction) {
        kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit> function1;
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8215getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8220getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (!androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo()) && !androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8217getNoneeUduSuo())) {
                throw new java.lang.IllegalStateException("invalid ImeAction".toString());
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        return getHighResolutionOutputSizeshNQ4ISI(imeAction);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo())) {
            getFocusManager().mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s());
            return true;
        }
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo())) {
            getFocusManager().mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s());
            return true;
        }
        if (!androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo()) || (softwareKeyboardController = this.getHighSpeedVideoFpsRangesFor) == null) {
            return false;
        }
        softwareKeyboardController.hide();
        return true;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public final void mo2055defaultKeyboardActionKlQnJC8(int imeAction) {
        getHighResolutionOutputSizeshNQ4ISI(imeAction);
    }
}
