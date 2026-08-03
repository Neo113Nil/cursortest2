package androidx.compose.foundation.text;

/* compiled from: CoreTextField.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJl\u0010l\u001a\u00020A2\u0006\u0010f\u001a\u00020g2\u0006\u0010m\u001a\u00020g2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\u00142\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zø\u0001\u0000¢\u0006\u0004\b{\u0010|R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010!\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010)\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/06X\u0082\u0004¢\u0006\u0002\n\u0000R1\u00108\u001a\u0002072\u0006\u0010\u000b\u001a\u0002078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010\u0013\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u001a\u0010G\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR+\u0010R\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0013\u001a\u0004\bS\u0010\u0017\"\u0004\bT\u0010\u0019R+\u0010V\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0013\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010\u0019R+\u0010Z\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0013\u001a\u0004\b[\u0010\u0017\"\u0004\b\\\u0010\u0019R+\u0010^\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\u0013\u001a\u0004\b_\u0010\u0017\"\u0004\b`\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "_layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "Landroidx/compose/foundation/text/HandleState;", "handleState", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState$delegate", "Landroidx/compose/runtime/MutableState;", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "isLayoutResultStale", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "value", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResult", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResultState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField$delegate", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "getOnImeActionPerformed", "()Lkotlin/jvm/functions/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "getOnValueChange", "onValueChangeOriginal", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "showFloatingToolbar", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar$delegate", "showSelectionHandleEnd", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd$delegate", "showSelectionHandleStart", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart$delegate", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "untransformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "update", "visualText", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "selectionBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 8;
    private androidx.compose.ui.layout.LayoutCoordinates _layoutCoordinates;
    private androidx.compose.ui.text.input.TextInputSession inputSession;
    private final androidx.compose.foundation.text.KeyboardActionRunner keyboardActionRunner;
    private final androidx.compose.ui.platform.SoftwareKeyboardController keyboardController;
    private final androidx.compose.runtime.RecomposeScope recomposeScope;
    private androidx.compose.foundation.text.TextDelegate textDelegate;
    private androidx.compose.ui.text.AnnotatedString untransformedText;
    private final androidx.compose.ui.text.input.EditProcessor processor = new androidx.compose.ui.text.input.EditProcessor();

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasFocus = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState minHeightForSingleLineField = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)), null, 2, null);
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.text.TextLayoutResultProxy> layoutResultState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: handleState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState handleState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.HandleState.None, null, 2, null);

    /* renamed from: showFloatingToolbar$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showFloatingToolbar = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: showSelectionHandleStart$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showSelectionHandleStart = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: showSelectionHandleEnd$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showSelectionHandleEnd = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showCursorHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private boolean isLayoutResultStale = true;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isInTouchMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChangeOriginal = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return kotlin.Unit.INSTANCE;
        }
    };
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            kotlin.jvm.functions.Function1 function1;
            java.lang.String text = textFieldValue.getText();
            androidx.compose.ui.text.AnnotatedString untransformedText = androidx.compose.foundation.text.TextFieldState.this.getUntransformedText();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(text, untransformedText != null ? untransformedText.getText() : null)) {
                androidx.compose.foundation.text.TextFieldState.this.setHandleState(androidx.compose.foundation.text.HandleState.None);
            }
            function1 = androidx.compose.foundation.text.TextFieldState.this.onValueChangeOriginal;
            function1.invoke(textFieldValue);
            androidx.compose.foundation.text.TextFieldState.this.getRecomposeScope().invalidate();
        }
    };
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
            m948invokeKlQnJC8(imeAction.getValue());
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m948invokeKlQnJC8(int i) {
            androidx.compose.foundation.text.KeyboardActionRunner keyboardActionRunner;
            keyboardActionRunner = androidx.compose.foundation.text.TextFieldState.this.keyboardActionRunner;
            keyboardActionRunner.m876runActionKlQnJC8(i);
        }
    };
    private final androidx.compose.ui.graphics.Paint selectionPaint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();

    public TextFieldState(androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.runtime.RecomposeScope recomposeScope, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        this.keyboardActionRunner = new androidx.compose.foundation.text.KeyboardActionRunner(softwareKeyboardController);
    }

    public final androidx.compose.foundation.text.TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(androidx.compose.foundation.text.TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final androidx.compose.runtime.RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final androidx.compose.ui.platform.SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final androidx.compose.ui.text.input.EditProcessor getProcessor() {
        return this.processor;
    }

    public final androidx.compose.ui.text.input.TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(androidx.compose.ui.text.input.TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((java.lang.Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m945getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((androidx.compose.ui.unit.Dp) this.minHeightForSingleLineField.getValue()).m4492unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m946setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final void setLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final androidx.compose.foundation.text.TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    public final androidx.compose.ui.text.AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.HandleState getHandleState() {
        return (androidx.compose.foundation.text.HandleState) this.handleState.getValue();
    }

    public final void setHandleState(androidx.compose.foundation.text.HandleState handleState) {
        this.handleState.setValue(handleState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((java.lang.Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((java.lang.Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((java.lang.Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((java.lang.Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(java.lang.Boolean.valueOf(z));
    }

    /* renamed from: isLayoutResultStale, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((java.lang.Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(java.lang.Boolean.valueOf(z));
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> getOnValueChange() {
        return this.onValueChange;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final androidx.compose.ui.graphics.Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m947updatefnh65Uc(androidx.compose.ui.text.AnnotatedString untransformedText, androidx.compose.ui.text.AnnotatedString visualText, androidx.compose.ui.text.TextStyle textStyle, boolean softWrap, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.ui.focus.FocusManager focusManager, long selectionBackgroundColor) {
        androidx.compose.foundation.text.TextDelegate m916updateTextDelegaterm0N8CA;
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo1992setColor8_81llA(selectionBackgroundColor);
        androidx.compose.foundation.text.KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = untransformedText;
        m916updateTextDelegaterm0N8CA = androidx.compose.foundation.text.TextDelegateKt.m916updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (r23 & 32) != 0 ? true : softWrap, (r23 & 64) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : 0, (r23 & 128) != 0 ? Integer.MAX_VALUE : 0, (r23 & 256) != 0 ? 1 : 0, kotlin.collections.CollectionsKt.emptyList());
        if (this.textDelegate != m916updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m916updateTextDelegaterm0N8CA;
    }
}
