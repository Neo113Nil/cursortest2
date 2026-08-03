package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldDecoratorModifier.kt */
@kotlin.Metadata(d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001)\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nBO\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0002\u0010\u001bJ\b\u0010N\u001a\u000205H\u0002J\b\u0010O\u001a\u000205H\u0016J\b\u0010P\u001a\u000205H\u0016J\b\u0010Q\u001a\u000205H\u0016J\u0010\u0010R\u001a\u0002052\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u0002052\u0006\u0010V\u001a\u00020WH\u0016J\u001a\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020ZH\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u000205H\u0016J*\u0010^\u001a\u0002052\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0016ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u001a\u0010g\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020ZH\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010\\J\b\u0010i\u001a\u00020jH\u0002J\b\u0010k\u001a\u000205H\u0002J\b\u0010l\u001a\u000205H\u0002JP\u0010m\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014J\f\u0010n\u001a\u000205*\u00020oH\u0016R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0010\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u001a\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text2/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getFilter", "()Landroidx/compose/foundation/text2/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text2/input/InputTransformation;)V", "inputSessionJob", "Lkotlinx/coroutines/Job;", "isElementFocused", "isFocused", "keyboardActionScope", "androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "<set-?>", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReadOnly", "setReadOnly", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getSingleLine", "setSingleLine", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V", "getTextFieldState", "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)V", "getTextLayoutState", "()Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)V", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "disposeInputSession", "onAttach", "onCancelPointerInput", "onDetach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "onKeyEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "requireKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "startOrDisposeInputSessionOnWindowFocusChange", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.platform.PlatformTextInputModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode, androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.input.key.KeyInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private androidx.compose.foundation.text2.input.InputTransformation filter;
    private kotlinx.coroutines.Job inputSessionJob;
    private boolean isElementFocused;
    private final androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private androidx.compose.foundation.text.KeyboardActions keyboardActions;
    private androidx.compose.foundation.text.KeyboardOptions keyboardOptions;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed;
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode pointerInputNode = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private boolean readOnly;
    private boolean singleLine;
    private final androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler textFieldKeyEventHandler;
    private androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
    private androidx.compose.ui.platform.WindowInfo windowInfo;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$interceptOutOfBoundsChildEvents(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$sharePointerInputWithSiblings(this);
    }

    public final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final androidx.compose.foundation.text2.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final androidx.compose.foundation.text2.input.InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(androidx.compose.foundation.text2.input.InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final androidx.compose.foundation.text.KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    public final void setKeyboardActions(androidx.compose.foundation.text.KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public TextFieldDecoratorModifierNode(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.InputTransformation inputTransformation, boolean z, boolean z2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardActions = keyboardActions;
        this.singleLine = z3;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.onImeActionPerformed = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                m1144invokeKlQnJC8(imeAction.getValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1144invokeKlQnJC8(int i) {
                kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit> function1;
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$1;
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$12;
                kotlin.Unit unit = null;
                if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnDone();
                } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnGo();
                } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnNext();
                } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnPrevious();
                } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnSearch();
                } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo())) {
                    function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardActions().getOnSend();
                } else {
                    if (!androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo()) && !androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(i, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo())) {
                        throw new java.lang.IllegalStateException("invalid ImeAction".toString());
                    }
                    function1 = null;
                }
                if (function1 != null) {
                    textFieldDecoratorModifierNode$keyboardActionScope$12 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.keyboardActionScope;
                    function1.invoke(textFieldDecoratorModifierNode$keyboardActionScope$12);
                    unit = kotlin.Unit.INSTANCE;
                }
                if (unit == null) {
                    textFieldDecoratorModifierNode$keyboardActionScope$1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.keyboardActionScope;
                    textFieldDecoratorModifierNode$keyboardActionScope$1.mo875defaultKeyboardActionKlQnJC8(i);
                }
            }
        };
    }

    public final androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        androidx.compose.ui.platform.WindowInfo windowInfo;
        return this.isElementFocused && (windowInfo = this.windowInfo) != null && windowInfo.isWindowFocused();
    }

    public final void updateNode(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.InputTransformation filter, boolean enabled, boolean readOnly, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean singleLine) {
        boolean z = this.enabled;
        boolean z2 = z && !this.readOnly;
        boolean z3 = enabled && !readOnly;
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.filter;
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, filter != null ? filter.getKeyboardOptions() : null);
        this.keyboardActions = keyboardActions;
        this.singleLine = singleLine;
        if (z3 != z2 || !kotlin.jvm.internal.Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !kotlin.jvm.internal.Intrinsics.areEqual(keyboardOptions, keyboardOptions2) || !kotlin.jvm.internal.Intrinsics.areEqual(filter, inputTransformation)) {
            if (z3 && isFocused()) {
                startInputSession();
            } else if (!z3) {
                disposeInputSession();
            }
        }
        if (z != enabled) {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence untransformedText = this.textFieldState.getUntransformedText();
        long selectionInChars = untransformedText.getSelectionInChars();
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new androidx.compose.ui.text.AnnotatedString(untransformedText.toString(), null, null, 6, null));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selectionInChars);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                androidx.compose.ui.text.TextLayoutResult layoutResult = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return java.lang.Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (!this.enabled) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                if (androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getReadOnly() || !androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getEnabled()) {
                    return false;
                }
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState().replaceAll(annotatedString);
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$3
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final java.lang.Boolean invoke(int i, int i2, boolean z) {
                androidx.compose.foundation.text2.input.TextFieldCharSequence text;
                if (z) {
                    text = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText();
                } else {
                    text = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState().getText();
                }
                long selectionInChars2 = text.getSelectionInChars();
                if (!androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getEnabled() || java.lang.Math.min(i, i2) < 0 || java.lang.Math.max(i, i2) > text.length()) {
                    return false;
                }
                if (i == androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars2) && i2 == androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars2)) {
                    return true;
                }
                long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(i, i2);
                if (z || i == i2) {
                    androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
                } else {
                    androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection);
                }
                if (z) {
                    androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState().m1172selectUntransformedCharsIn5zctL8(TextRange);
                } else {
                    androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState().m1171selectCharsIn5zctL8(TextRange);
                }
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                if (androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getReadOnly() || !androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getEnabled()) {
                    return false;
                }
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.replaceSelectedText$default(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldState(), annotatedString, true, null, 4, null);
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.keyboardOptions.getImeAction(), null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.onImeActionPerformed;
                function1.invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardOptions().getImeAction()));
                return true;
            }
        }, 2, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                boolean isFocused;
                androidx.compose.ui.platform.SoftwareKeyboardController requireKeyboardController;
                isFocused = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this);
                } else if (!androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    requireKeyboardController = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.requireKeyboardController();
                    requireKeyboardController.show();
                }
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                boolean isFocused;
                isFocused = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this);
                }
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection);
                return true;
            }
        }, 1, null);
        if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars)) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$8
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Boolean invoke() {
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.copy$default(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState(), false, 1, null);
                    return true;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$9
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().cut();
                        return true;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$applySemantics$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().paste();
                return true;
            }
        }, 1, null);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        this.textFieldSelectionState.setFocused(isFocused());
        if (focusState.isFocused()) {
            if (!this.enabled || this.readOnly) {
                return;
            }
            startInputSession();
            return;
        }
        disposeInputSession();
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo181onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo181onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo182onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        return this.textFieldKeyEventHandler.mo1116onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (androidx.compose.ui.focus.FocusManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo180onKeyEventZmokQxo(android.view.KeyEvent event) {
        return this.textFieldKeyEventHandler.m1145onKeyEvent6ptp14s(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.onImeActionPerformed;
                function1.invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.getKeyboardOptions().getImeAction()));
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (androidx.compose.ui.platform.WindowInfo) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo());
                androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.this.startOrDisposeInputSessionOnWindowFocusChange();
            }
        });
    }

    private final void startInputSession() {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1(this, null), 3, null);
        this.inputSessionJob = launch$default;
    }

    private final void disposeInputSession() {
        kotlinx.coroutines.Job job = this.inputSessionJob;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.inputSessionJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrDisposeInputSessionOnWindowFocusChange() {
        androidx.compose.ui.platform.WindowInfo windowInfo = this.windowInfo;
        if (windowInfo == null) {
            return;
        }
        if (windowInfo != null && windowInfo.isWindowFocused() && this.isElementFocused) {
            startInputSession();
        } else {
            disposeInputSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.SoftwareKeyboardController requireKeyboardController() {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new java.lang.IllegalStateException("No software keyboard controller".toString());
    }
}
