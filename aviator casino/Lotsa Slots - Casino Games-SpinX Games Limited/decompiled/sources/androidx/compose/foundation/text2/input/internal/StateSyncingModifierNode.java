package androidx.compose.foundation.text2.input.internal;

/* compiled from: StateSyncingModifier.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "onValueChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "writeSelectionFromTextFieldValue", "", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lkotlin/jvm/functions/Function1;Z)V", "isFocused", "lastValueWhileFocused", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "observeTextState", "fireOnValueChanged", "onAttach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onObservedReadsChanged", "update", "value", "updateState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StateSyncingModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.focus.FocusEventModifierNode {
    private boolean isFocused;
    private androidx.compose.ui.text.input.TextFieldValue lastValueWhileFocused;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChanged;
    private final androidx.compose.foundation.text2.input.TextFieldState state;
    private final boolean writeSelectionFromTextFieldValue;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public StateSyncingModifierNode(androidx.compose.foundation.text2.input.TextFieldState textFieldState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, boolean z) {
        this.state = textFieldState;
        this.onValueChanged = function1;
        this.writeSelectionFromTextFieldValue = z;
    }

    public final void update(androidx.compose.ui.text.input.TextFieldValue value, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChanged) {
        this.onValueChanged = onValueChanged;
        if (!this.isFocused) {
            updateState(value);
        } else {
            this.lastValueWhileFocused = value;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        observeTextState(false);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        if (this.isFocused && !focusState.isFocused()) {
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.lastValueWhileFocused;
            if (textFieldValue != null) {
                updateState(textFieldValue);
            }
            this.lastValueWhileFocused = null;
        }
        this.isFocused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        observeTextState$default(this, false, 1, null);
    }

    private final void updateState(androidx.compose.ui.text.input.TextFieldValue value) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.state;
        androidx.compose.foundation.text2.input.TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.setTextIfChanged$foundation_release(value.getText());
        if (this.writeSelectionFromTextFieldValue) {
            startEdit.m1096selectCharsIn5zctL8(value.getSelection());
        }
        textFieldState.commitEdit(startEdit);
    }

    static /* synthetic */ void observeTextState$default(androidx.compose.foundation.text2.input.internal.StateSyncingModifierNode stateSyncingModifierNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        stateSyncingModifierNode.observeTextState(z);
    }

    private final void observeTextState(boolean fireOnValueChanged) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence;
        androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StateSyncingModifierNode$observeTextState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.text2.input.TextFieldCharSequence] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.TextFieldState textFieldState;
                kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.text2.input.TextFieldCharSequence> objectRef2 = objectRef;
                textFieldState = this.state;
                objectRef2.element = textFieldState.getText();
            }
        });
        if (fireOnValueChanged) {
            androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence3 = null;
            if (objectRef.element == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("text");
                textFieldCharSequence = null;
            } else {
                textFieldCharSequence = (androidx.compose.foundation.text2.input.TextFieldCharSequence) objectRef.element;
            }
            java.lang.String obj = textFieldCharSequence.toString();
            if (objectRef.element == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("text");
                textFieldCharSequence2 = null;
            } else {
                textFieldCharSequence2 = (androidx.compose.foundation.text2.input.TextFieldCharSequence) objectRef.element;
            }
            long selectionInChars = textFieldCharSequence2.getSelectionInChars();
            if (objectRef.element == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("text");
            } else {
                textFieldCharSequence3 = (androidx.compose.foundation.text2.input.TextFieldCharSequence) objectRef.element;
            }
            this.onValueChanged.invoke(new androidx.compose.ui.text.input.TextFieldValue(obj, selectionInChars, textFieldCharSequence3.getCompositionInChars(), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
    }
}
