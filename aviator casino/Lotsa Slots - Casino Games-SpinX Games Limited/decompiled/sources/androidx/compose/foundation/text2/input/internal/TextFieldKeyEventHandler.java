package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldKeyEventHandler.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J2\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170$¢\u0006\u0002\b&H\u0082\bJ\u0013\u0010'\u001a\u0004\u0018\u00010(*\u00020\u0010H\u0002¢\u0006\u0002\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "", "()V", "deadKeyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "preparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "onKeyEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "editable", "singleLine", "onSubmit", "Lkotlin/Function0;", "", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZZLkotlin/jvm/functions/Function0;)Z", "onPreKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "preparedSelectionContext", "state", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "getVisibleTextLayoutHeight", "", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;
    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelectionState preparedSelectionState = new androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelectionState();
    private final androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner = new androidx.compose.foundation.text.DeadKeyCombiner();
    private final androidx.compose.foundation.text.KeyMapping keyMapping = androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    /* compiled from: TextFieldKeyEventHandler.kt */
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

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1116onPreKeyEventMyFupTE(android.view.KeyEvent event, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController) {
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldState.getText().getSelectionInChars()) || !androidx.compose.foundation.text.KeyEventHelpers_androidKt.m873cancelsTextSelectionZmokQxo(event)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public boolean m1145onKeyEvent6ptp14s(android.view.KeyEvent event, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean editable, boolean singleLine, kotlin.jvm.functions.Function0<kotlin.Unit> onSubmit) {
        java.lang.Float visibleTextLayoutHeight;
        androidx.compose.ui.text.TextRange m3952boximpl;
        java.lang.Integer m872consumeZmokQxo;
        boolean z = false;
        if (!androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY())) {
            return false;
        }
        if (androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m936isTypedEventZmokQxo(event) && (m872consumeZmokQxo = this.deadKeyCombiner.m872consumeZmokQxo(event)) != null) {
            java.lang.String sb = androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(new java.lang.StringBuilder(2), m872consumeZmokQxo.intValue()).toString();
            if (!editable) {
                return false;
            }
            androidx.compose.foundation.text2.input.TextFieldState textFieldState2 = textFieldState.textFieldState;
            androidx.compose.foundation.text2.input.InputTransformation inputTransformation = textFieldState.inputTransformation;
            androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
            androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState2.getText();
            textFieldState2.getMainBuffer().getChangeTracker().clearChanges();
            androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState2.getMainBuffer();
            mainBuffer.commitComposition();
            androidx.compose.foundation.text2.input.internal.EditCommandKt.commitText(mainBuffer, sb, 1);
            if (textFieldState2.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState2.getMainBuffer().m1120getSelectiond9O1mEE()) || !kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState2.getMainBuffer().m1119getCompositionMzsxiRA())) {
                textFieldState2.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
            }
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        androidx.compose.foundation.text.KeyCommand mo874mapZmokQxo = this.keyMapping.mo874mapZmokQxo(event);
        if (mo874mapZmokQxo == null || (mo874mapZmokQxo.getEditsText() && !editable)) {
            return false;
        }
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) == null) {
            return true;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection = new androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection(textFieldState, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
        switch (androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler.WhenMappings.$EnumSwitchMapping$0[mo874mapZmokQxo.ordinal()]) {
            case 1:
                textFieldSelectionState.copy(false);
                z = true;
                break;
            case 2:
                textFieldSelectionState.paste();
                z = true;
                break;
            case 3:
                textFieldSelectionState.cut();
                z = true;
                break;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection2) {
                        invoke2(textFieldPreparedSelection2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection2) {
                        textFieldPreparedSelection2.moveCursorLeft();
                    }
                });
                z = true;
                break;
            case 5:
                textFieldPreparedSelection.collapseRightOr(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection2) {
                        invoke2(textFieldPreparedSelection2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection2) {
                        textFieldPreparedSelection2.moveCursorRight();
                    }
                });
                z = true;
                break;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                z = true;
                break;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                z = true;
                break;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                z = true;
                break;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                z = true;
                break;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                z = true;
                break;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                z = true;
                break;
            case 12:
                textFieldPreparedSelection.moveCursorUpByPage();
                z = true;
                break;
            case 13:
                textFieldPreparedSelection.moveCursorDownByPage();
                z = true;
                break;
            case 14:
                textFieldPreparedSelection.moveCursorToLineStart();
                z = true;
                break;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                z = true;
                break;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                z = true;
                break;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                z = true;
                break;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                z = true;
                break;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                z = true;
                break;
            case 20:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(textFieldPreparedSelection.getPrecedingCharacterIndex());
                    if (valueOf.intValue() == -1) {
                        valueOf = null;
                    }
                    m3952boximpl = valueOf != null ? androidx.compose.ui.text.TextRange.m3952boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(valueOf.intValue(), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection.getSelection()))) : null;
                    if (m3952boximpl != null) {
                        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", m3952boximpl.getPackedValue(), null, 4, null);
                    }
                }
                z = true;
                break;
            case 21:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(textFieldPreparedSelection.getNextCharacterIndex());
                    if (valueOf2.intValue() == -1) {
                        valueOf2 = null;
                    }
                    m3952boximpl = valueOf2 != null ? androidx.compose.ui.text.TextRange.m3952boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldPreparedSelection.getSelection()), valueOf2.intValue())) : null;
                    if (m3952boximpl != null) {
                        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", m3952boximpl.getPackedValue(), null, 4, null);
                    }
                }
                z = true;
                break;
            case 22:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", androidx.compose.ui.text.TextRangeKt.TextRange(textFieldPreparedSelection.getPreviousWordOffset(), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection.getSelection())), null, 4, null);
                }
                z = true;
                break;
            case 23:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldPreparedSelection.getSelection()), textFieldPreparedSelection.getNextWordOffset()), null, 4, null);
                }
                z = true;
                break;
            case 24:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", androidx.compose.ui.text.TextRangeKt.TextRange(textFieldPreparedSelection.getLineStartByOffset(), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection.getSelection())), null, 4, null);
                }
                z = true;
                break;
            case 25:
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldPreparedSelection.getSelection()), textFieldPreparedSelection.getLineEndByOffset()), null, 4, null);
                }
                z = true;
                break;
            case 26:
                if (!singleLine) {
                    androidx.compose.foundation.text2.input.TextFieldState textFieldState3 = textFieldState.textFieldState;
                    androidx.compose.foundation.text2.input.InputTransformation inputTransformation2 = textFieldState.inputTransformation;
                    androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
                    androidx.compose.foundation.text2.input.TextFieldCharSequence text2 = textFieldState3.getText();
                    textFieldState3.getMainBuffer().getChangeTracker().clearChanges();
                    androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer2 = textFieldState3.getMainBuffer();
                    mainBuffer2.commitComposition();
                    androidx.compose.foundation.text2.input.internal.EditCommandKt.commitText(mainBuffer2, "\n", 1);
                    if (textFieldState3.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !androidx.compose.ui.text.TextRange.m3957equalsimpl0(text2.getSelectionInChars(), textFieldState3.getMainBuffer().m1120getSelectiond9O1mEE()) || !kotlin.jvm.internal.Intrinsics.areEqual(text2.getCompositionInChars(), textFieldState3.getMainBuffer().m1119getCompositionMzsxiRA())) {
                        textFieldState3.commitEditAsUser(text2, inputTransformation2, true, textFieldEditUndoBehavior2);
                    }
                } else {
                    onSubmit.invoke();
                }
                z = true;
                break;
            case 27:
                if (!singleLine) {
                    androidx.compose.foundation.text2.input.TextFieldState textFieldState4 = textFieldState.textFieldState;
                    androidx.compose.foundation.text2.input.InputTransformation inputTransformation3 = textFieldState.inputTransformation;
                    androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
                    androidx.compose.foundation.text2.input.TextFieldCharSequence text3 = textFieldState4.getText();
                    textFieldState4.getMainBuffer().getChangeTracker().clearChanges();
                    androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer3 = textFieldState4.getMainBuffer();
                    mainBuffer3.commitComposition();
                    androidx.compose.foundation.text2.input.internal.EditCommandKt.commitText(mainBuffer3, "\t", 1);
                    if (textFieldState4.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !androidx.compose.ui.text.TextRange.m3957equalsimpl0(text3.getSelectionInChars(), textFieldState4.getMainBuffer().m1120getSelectiond9O1mEE()) || !kotlin.jvm.internal.Intrinsics.areEqual(text3.getCompositionInChars(), textFieldState4.getMainBuffer().m1119getCompositionMzsxiRA())) {
                        textFieldState4.commitEditAsUser(text3, inputTransformation3, true, textFieldEditUndoBehavior3);
                    }
                    z = true;
                    break;
                }
                break;
            case 28:
                textFieldPreparedSelection.selectAll();
                z = true;
                break;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                z = true;
                break;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                z = true;
                break;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                z = true;
                break;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                z = true;
                break;
            case 33:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                z = true;
                break;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                z = true;
                break;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                z = true;
                break;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                z = true;
                break;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                z = true;
                break;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                z = true;
                break;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                z = true;
                break;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                z = true;
                break;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                z = true;
                break;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                z = true;
                break;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                z = true;
                break;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                z = true;
                break;
            case 45:
                textFieldPreparedSelection.deselect();
                z = true;
                break;
            case 46:
                textFieldState.undo();
                z = true;
                break;
            case 47:
                textFieldState.redo();
                z = true;
                break;
            case 48:
                androidx.compose.foundation.text.KeyEventHelpers_androidKt.showCharacterPalette();
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (!androidx.compose.ui.text.TextRange.m3957equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelectionInChars())) {
            textFieldState.m1171selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
        }
        return z;
    }

    private final void preparedSelectionContext(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState state, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit> block) {
        java.lang.Float visibleTextLayoutHeight;
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) == null) {
            return;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection = new androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection(state, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelectionInChars())) {
            return;
        }
        state.m1171selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Float getVisibleTextLayoutHeight(androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState) {
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return null;
        }
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return null;
        }
        androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            if (!decoratorNodeCoordinates.isAttached()) {
                decoratorNodeCoordinates = null;
            }
            if (decoratorNodeCoordinates != null) {
                rect = androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                if (rect == null) {
                    return java.lang.Float.valueOf(androidx.compose.ui.geometry.Size.m1937getHeightimpl(rect.m1904getSizeNHjbRc()));
                }
                return null;
            }
        }
        rect = null;
        if (rect == null) {
        }
    }
}
