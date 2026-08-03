package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldDecoratorModifier.kt */
@kotlin.Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/KeyboardActionScope;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements androidx.compose.foundation.text.KeyboardActionScope {
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode this$0;

    TextFieldDecoratorModifierNode$keyboardActionScope$1(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.this$0 = textFieldDecoratorModifierNode;
    }

    private final androidx.compose.ui.focus.FocusManager getFocusManager() {
        return (androidx.compose.ui.focus.FocusManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo875defaultKeyboardActionKlQnJC8(int imeAction) {
        androidx.compose.ui.platform.SoftwareKeyboardController requireKeyboardController;
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
            getFocusManager().mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s());
            return;
        }
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
            getFocusManager().mo1805moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s());
            return;
        }
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
            requireKeyboardController = this.this$0.requireKeyboardController();
            requireKeyboardController.hide();
        } else {
            if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
                return;
            }
            androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo());
        }
    }
}
