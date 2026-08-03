package androidx.compose.foundation.text;

/* compiled from: TextFieldKeyInput.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ!\u0010+\u001a\u00020\u00172\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b.H\u0002J\u0018\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001c\u00104\u001a\u0004\u0018\u0001052\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107J\f\u00108\u001a\u00020\u0017*\u000209H\u0002J\u0012\u00108\u001a\u00020\u0017*\b\u0012\u0004\u0012\u0002090:H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "state", "Landroidx/compose/foundation/text/TextFieldState;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "", "singleLine", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "keyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "onValueChange", "Lkotlin/Function1;", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEditable", "()Z", "I", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSingleLine", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "commandExecutionContext", "block", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "process", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "typedCommand", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "apply", "Landroidx/compose/ui/text/input/EditCommand;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;
    private final androidx.compose.foundation.text.DeadKeyCombiner keyCombiner;
    private final androidx.compose.foundation.text.KeyMapping keyMapping;
    private final androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange;
    private final androidx.compose.foundation.text.selection.TextPreparedSelectionState preparedSelectionState;
    private final androidx.compose.foundation.text.selection.TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final androidx.compose.foundation.text.TextFieldState state;
    private final androidx.compose.foundation.text.UndoManager undoManager;
    private final androidx.compose.ui.text.input.TextFieldValue value;

    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, int i) {
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = function1;
        this.imeAction = i;
    }

    public final androidx.compose.foundation.text.TextFieldState getState() {
        return this.state;
    }

    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1 function1, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new androidx.compose.ui.text.input.TextFieldValue((java.lang.String) null, 0L, (androidx.compose.ui.text.TextRange) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i2 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i2 & 512) != 0 ? androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & 1024) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                invoke2(textFieldValue2);
                return kotlin.Unit.INSTANCE;
            }
        } : function1, i, null);
    }

    public final androidx.compose.ui.text.input.TextFieldValue getValue() {
        return this.value;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final androidx.compose.foundation.text.selection.TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final androidx.compose.foundation.text.UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
        androidx.compose.ui.text.input.EditProcessor processor = this.state.getProcessor();
        java.util.List<? extends androidx.compose.ui.text.input.EditCommand> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
        mutableList.add(0, new androidx.compose.ui.text.input.FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(mutableList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(androidx.compose.ui.text.input.EditCommand editCommand) {
        apply(kotlin.collections.CollectionsKt.listOf(editCommand));
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final androidx.compose.ui.text.input.CommitTextCommand m931typedCommandZmokQxo(android.view.KeyEvent event) {
        java.lang.Integer m872consumeZmokQxo;
        if (androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m936isTypedEventZmokQxo(event) && (m872consumeZmokQxo = this.keyCombiner.m872consumeZmokQxo(event)) != null) {
            return new androidx.compose.ui.text.input.CommitTextCommand(androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(new java.lang.StringBuilder(), m872consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m932processZmokQxo(android.view.KeyEvent event) {
        final androidx.compose.foundation.text.KeyCommand mo874mapZmokQxo;
        androidx.compose.ui.text.input.CommitTextCommand m931typedCommandZmokQxo = m931typedCommandZmokQxo(event);
        if (m931typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(m931typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY()) || (mo874mapZmokQxo = this.keyMapping.mo874mapZmokQxo(event)) == null || (mo874mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        commandExecutionContext(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            /* compiled from: TextFieldKeyInput.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.foundation.text.KeyCommand.values().length];
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.COPY.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.PASTE.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.CUT.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (java.lang.NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (java.lang.NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (java.lang.NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (java.lang.NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.UP.ordinal()] = 10;
                    } catch (java.lang.NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DOWN.ordinal()] = 11;
                    } catch (java.lang.NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (java.lang.NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (java.lang.NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (java.lang.NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (java.lang.NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (java.lang.NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (java.lang.NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.HOME.ordinal()] = 18;
                    } catch (java.lang.NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.END.ordinal()] = 19;
                    } catch (java.lang.NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (java.lang.NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (java.lang.NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (java.lang.NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (java.lang.NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (java.lang.NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (java.lang.NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (java.lang.NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.TAB.ordinal()] = 27;
                    } catch (java.lang.NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (java.lang.NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (java.lang.NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (java.lang.NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (java.lang.NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (java.lang.NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (java.lang.NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (java.lang.NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (java.lang.NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (java.lang.NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (java.lang.NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (java.lang.NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (java.lang.NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (java.lang.NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (java.lang.NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (java.lang.NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (java.lang.NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (java.lang.NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (java.lang.NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.UNDO.ordinal()] = 46;
                    } catch (java.lang.NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.REDO.ordinal()] = 47;
                    } catch (java.lang.NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[androidx.compose.foundation.text.KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (java.lang.NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
                invoke2(textFieldPreparedSelection);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
                int i;
                androidx.compose.ui.text.input.TextFieldValue undo;
                kotlin.jvm.functions.Function1 function1;
                androidx.compose.ui.text.input.TextFieldValue redo;
                kotlin.jvm.functions.Function1 function12;
                switch (androidx.compose.foundation.text.TextFieldKeyInput$process$2.WhenMappings.$EnumSwitchMapping$0[androidx.compose.foundation.text.KeyCommand.this.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        break;
                    case 20:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection()) - textFieldPreparedSelection2.getPrecedingCharacterIndex(), 0);
                            }
                        });
                        if (deleteIfSelectedOr != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr);
                            break;
                        }
                        break;
                    case 21:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                int nextCharacterIndex = textFieldPreparedSelection2.getNextCharacterIndex();
                                if (nextCharacterIndex != -1) {
                                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, nextCharacterIndex - androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr2 != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr2);
                            break;
                        }
                        break;
                    case 22:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                androidx.compose.ui.text.input.DeleteSurroundingTextCommand deleteSurroundingTextCommand;
                                java.lang.Integer previousWordOffset = textFieldPreparedSelection2.getPreviousWordOffset();
                                if (previousWordOffset != null) {
                                    deleteSurroundingTextCommand = new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection()) - previousWordOffset.intValue(), 0);
                                } else {
                                    deleteSurroundingTextCommand = null;
                                }
                                return deleteSurroundingTextCommand;
                            }
                        });
                        if (deleteIfSelectedOr3 != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr3);
                            break;
                        }
                        break;
                    case 23:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                java.lang.Integer nextWordOffset = textFieldPreparedSelection2.getNextWordOffset();
                                return nextWordOffset != null ? new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection())) : null;
                            }
                        });
                        if (deleteIfSelectedOr4 != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr4);
                            break;
                        }
                        break;
                    case 24:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                androidx.compose.ui.text.input.DeleteSurroundingTextCommand deleteSurroundingTextCommand;
                                java.lang.Integer lineStartByOffset = textFieldPreparedSelection2.getLineStartByOffset();
                                if (lineStartByOffset != null) {
                                    deleteSurroundingTextCommand = new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection()) - lineStartByOffset.intValue(), 0);
                                } else {
                                    deleteSurroundingTextCommand = null;
                                }
                                return deleteSurroundingTextCommand;
                            }
                        });
                        if (deleteIfSelectedOr5 != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr5);
                            break;
                        }
                        break;
                    case 25:
                        java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.TextFieldPreparedSelection, androidx.compose.ui.text.input.EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.ui.text.input.EditCommand invoke(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2) {
                                java.lang.Integer lineEndByOffset = textFieldPreparedSelection2.getLineEndByOffset();
                                return lineEndByOffset != null ? new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection2.getSelection())) : null;
                            }
                        });
                        if (deleteIfSelectedOr6 != null) {
                            this.apply((java.util.List<? extends androidx.compose.ui.text.input.EditCommand>) deleteIfSelectedOr6);
                            break;
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.apply(new androidx.compose.ui.text.input.CommitTextCommand("\n", 1));
                            break;
                        } else {
                            kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed = this.getState().getOnImeActionPerformed();
                            i = this.imeAction;
                            onImeActionPerformed.invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(i));
                            break;
                        }
                    case 27:
                        if (!this.getSingleLine()) {
                            this.apply(new androidx.compose.ui.text.input.CommitTextCommand("\t", 1));
                            break;
                        } else {
                            booleanRef.element = false;
                            break;
                        }
                    case 28:
                        textFieldPreparedSelection.selectAll();
                        break;
                    case 29:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case 34:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        break;
                    case 35:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        break;
                    case 36:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        break;
                    case 41:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        break;
                    case 44:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        break;
                    case 45:
                        textFieldPreparedSelection.deselect();
                        break;
                    case 46:
                        androidx.compose.foundation.text.UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                        }
                        androidx.compose.foundation.text.UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (undo = undoManager2.undo()) != null) {
                            function1 = this.onValueChange;
                            function1.invoke(undo);
                            break;
                        }
                        break;
                    case 47:
                        androidx.compose.foundation.text.UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (redo = undoManager3.redo()) != null) {
                            function12 = this.onValueChange;
                            function12.invoke(redo);
                            break;
                        }
                        break;
                    case 48:
                        androidx.compose.foundation.text.KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
            }
        });
        androidx.compose.foundation.text.UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    private final void commandExecutionContext(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.TextFieldPreparedSelection, kotlin.Unit> block) {
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = new androidx.compose.foundation.text.selection.TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && kotlin.jvm.internal.Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }
}
