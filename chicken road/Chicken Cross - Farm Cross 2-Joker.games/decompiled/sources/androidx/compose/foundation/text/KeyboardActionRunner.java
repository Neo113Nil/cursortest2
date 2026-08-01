package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardActionRunner.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "()V", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "runAction", "runAction-KlQnJC8", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        Intrinsics.checkNotNullParameter(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final void setFocusManager(FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m698runActionKlQnJC8(int imeAction) {
        Function1<KeyboardActionScope, Unit> function1;
        Unit unit = null;
        if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3618getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3619getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3620getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3622getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3623getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3624getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3617getDefaulteUduSuo()) ? true : ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3621getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo697defaultKeyboardActionKlQnJC8(imeAction);
        }
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo697defaultKeyboardActionKlQnJC8(int imeAction) {
        if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3620getNexteUduSuo())) {
            getFocusManager().mo1342moveFocus3ESFkO8(FocusDirection.INSTANCE.m1337getNextdhqQ8s());
        } else {
            if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3622getPreviouseUduSuo())) {
                getFocusManager().mo1342moveFocus3ESFkO8(FocusDirection.INSTANCE.m1339getPreviousdhqQ8s());
                return;
            }
            if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3618getDoneeUduSuo()) ? true : ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3619getGoeUduSuo()) ? true : ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3623getSearcheUduSuo()) ? true : ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3624getSendeUduSuo()) ? true : ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3617getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3621getNoneeUduSuo());
        }
    }
}
