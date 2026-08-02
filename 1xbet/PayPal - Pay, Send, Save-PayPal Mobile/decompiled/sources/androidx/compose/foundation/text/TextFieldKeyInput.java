package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010 \u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b \u0010%J\u0015\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J(\u0010,\u001a\u00020\u00162\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b+H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00109R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b:\u00109R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010DR\u0014\u0010E\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010GR\u0014\u0010,\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010I"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)V", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/text/input/EditCommand;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "p0", "Landroidx/compose/ui/text/input/CommitTextCommand;", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "event", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Z", "getEditable", "()Z", "getSingleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/KeyMapping;", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final androidx.compose.foundation.text.KeyMapping Camera2StreamConfigurationMap;
    private final boolean editable;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.DeadKeyCombiner getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final androidx.compose.foundation.text.selection.TextPreparedSelectionState preparedSelectionState;
    private final androidx.compose.foundation.text.selection.TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final androidx.compose.foundation.text.LegacyTextFieldState state;
    private final androidx.compose.foundation.text.UndoManager undoManager;
    private final androidx.compose.ui.text.input.TextFieldValue value;

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, int i) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.getHighResolutionOutputSizeshNQ4ISI = deadKeyCombiner;
        this.Camera2StreamConfigurationMap = keyMapping;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final androidx.compose.foundation.text.LegacyTextFieldState getState() {
        return this.state;
    }

    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1 function1, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyTextFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new androidx.compose.ui.text.input.TextFieldValue((java.lang.String) null, 0L, (androidx.compose.ui.text.TextRange) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i2 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i2 & 512) != 0 ? androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & 1024) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI();
                return highResolutionOutputSizeshNQ4ISI;
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
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
        androidx.compose.ui.text.input.EditProcessor processor = this.state.getProcessor();
        java.util.List<? extends androidx.compose.ui.text.input.EditCommand> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
        mutableList.add(0, new androidx.compose.ui.text.input.FinishComposingTextCommand());
        this.getHighSpeedVideoSizes.invoke(processor.apply(mutableList));
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.text.input.EditCommand editCommand) {
        getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.CollectionsKt.listOf(editCommand));
    }

    private final androidx.compose.ui.text.input.CommitTextCommand getHighSpeedVideoFpsRanges(android.view.KeyEvent p0) {
        java.lang.Integer m2051consumeZmokQxo;
        if (androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m2125isTypedEventZmokQxo(p0) && (m2051consumeZmokQxo = this.getHighResolutionOutputSizeshNQ4ISI.m2051consumeZmokQxo(p0)) != null) {
            return new androidx.compose.ui.text.input.CommitTextCommand(androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(new java.lang.StringBuilder(), m2051consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m2120processZmokQxo(android.view.KeyEvent event) {
        final androidx.compose.foundation.text.KeyCommand mo2054mapZmokQxo;
        androidx.compose.ui.text.input.CommitTextCommand highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(event);
        if (highSpeedVideoFpsRanges != null) {
            if (!this.editable) {
                return false;
            }
            getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) || (mo2054mapZmokQxo = this.Camera2StreamConfigurationMap.mo2054mapZmokQxo(event)) == null || (mo2054mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextFieldKeyInput.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.KeyCommand.this, this, booleanRef, (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
        androidx.compose.foundation.text.UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.KeyCommand keyCommand, androidx.compose.foundation.text.TextFieldKeyInput textFieldKeyInput, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        androidx.compose.ui.text.input.TextFieldValue undo;
        androidx.compose.ui.text.input.TextFieldValue redo;
        switch (androidx.compose.foundation.text.TextFieldKeyInput.WhenMappings.$EnumSwitchMapping$0[keyCommand.ordinal()]) {
            case 1:
                textFieldKeyInput.selectionManager.copy$foundation(false);
                return kotlin.Unit.INSTANCE;
            case 2:
                textFieldKeyInput.selectionManager.paste$foundation();
                return kotlin.Unit.INSTANCE;
            case 3:
                textFieldKeyInput.selectionManager.cut$foundation();
                return kotlin.Unit.INSTANCE;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldKeyInput.Camera2StreamConfigurationMap((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return Camera2StreamConfigurationMap;
                    }
                });
                return kotlin.Unit.INSTANCE;
            case 5:
                textFieldPreparedSelection.collapseRightOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextFieldKeyInput.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                });
                return kotlin.Unit.INSTANCE;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                return kotlin.Unit.INSTANCE;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                return kotlin.Unit.INSTANCE;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                return kotlin.Unit.INSTANCE;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                return kotlin.Unit.INSTANCE;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                return kotlin.Unit.INSTANCE;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                return kotlin.Unit.INSTANCE;
            case 12:
                textFieldPreparedSelection.moveCursorUpByPage();
                return kotlin.Unit.INSTANCE;
            case 13:
                textFieldPreparedSelection.moveCursorDownByPage();
                return kotlin.Unit.INSTANCE;
            case 14:
                textFieldPreparedSelection.moveCursorToLineStart();
                return kotlin.Unit.INSTANCE;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                return kotlin.Unit.INSTANCE;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                return kotlin.Unit.INSTANCE;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                return kotlin.Unit.INSTANCE;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                return kotlin.Unit.INSTANCE;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                return kotlin.Unit.INSTANCE;
            case 20:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.foundation.text.TextFieldKeyInput.getHighSpeedVideoSizes((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return highSpeedVideoSizes;
                    }
                });
                if (deleteIfSelectedOr != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 21:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                });
                if (deleteIfSelectedOr2 != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr2);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 22:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.text.TextFieldKeyInput.getHighSpeedVideoFpsRanges((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return highSpeedVideoFpsRanges;
                    }
                });
                if (deleteIfSelectedOr3 != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr3);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 23:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand inputSizeshNQ4ISI;
                        inputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldKeyInput.getInputSizeshNQ4ISI((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return inputSizeshNQ4ISI;
                    }
                });
                if (deleteIfSelectedOr4 != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr4);
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 24:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand highSpeedVideoSizesFor;
                        highSpeedVideoSizesFor = androidx.compose.foundation.text.TextFieldKeyInput.getHighSpeedVideoSizesFor((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return highSpeedVideoSizesFor;
                    }
                });
                if (deleteIfSelectedOr5 != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr5);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 25:
                java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.text.input.EditCommand outputMinFrameDuration;
                        outputMinFrameDuration = androidx.compose.foundation.text.TextFieldKeyInput.getOutputMinFrameDuration((androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj);
                        return outputMinFrameDuration;
                    }
                });
                if (deleteIfSelectedOr6 != null) {
                    textFieldKeyInput.getHighResolutionOutputSizeshNQ4ISI(deleteIfSelectedOr6);
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 26:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.getHighSpeedVideoFpsRanges(new androidx.compose.ui.text.input.CommitTextCommand(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, 1));
                } else {
                    booleanRef.element = textFieldKeyInput.state.getOnImeActionPerformedWithResult().invoke(androidx.compose.ui.text.input.ImeAction.m8198boximpl(textFieldKeyInput.getHighSpeedVideoFpsRangesFor)).booleanValue();
                }
                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            case 27:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.getHighSpeedVideoFpsRanges(new androidx.compose.ui.text.input.CommitTextCommand("\t", 1));
                } else {
                    booleanRef.element = false;
                }
                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            case 28:
                textFieldPreparedSelection.selectAll();
                return kotlin.Unit.INSTANCE;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 33:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                return kotlin.Unit.INSTANCE;
            case 45:
                textFieldPreparedSelection.deselect();
                return kotlin.Unit.INSTANCE;
            case 46:
                androidx.compose.foundation.text.UndoManager undoManager = textFieldKeyInput.undoManager;
                if (undoManager != null) {
                    undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                }
                androidx.compose.foundation.text.UndoManager undoManager2 = textFieldKeyInput.undoManager;
                if (undoManager2 != null && (undo = undoManager2.undo()) != null) {
                    textFieldKeyInput.getHighSpeedVideoSizes.invoke(undo);
                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 47:
                androidx.compose.foundation.text.UndoManager undoManager3 = textFieldKeyInput.undoManager;
                if (undoManager3 != null && (redo = undoManager3.redo()) != null) {
                    textFieldKeyInput.getHighSpeedVideoSizes.invoke(redo);
                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            case 48:
                androidx.compose.foundation.text.KeyEventHelpers_androidKt.showCharacterPalette();
            case 49:
                kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorLeft();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorRight();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getHighSpeedVideoSizes(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        int precedingCodePointOrEmojiStartIndex = textFieldPreparedSelection.getPrecedingCodePointOrEmojiStartIndex();
        if (precedingCodePointOrEmojiStartIndex == -1) {
            return null;
        }
        return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection()) - precedingCodePointOrEmojiStartIndex, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        int nextCharacterIndex = textFieldPreparedSelection.getNextCharacterIndex();
        if (nextCharacterIndex != -1) {
            return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, nextCharacterIndex - androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        androidx.compose.ui.text.input.DeleteSurroundingTextCommand deleteSurroundingTextCommand;
        java.lang.Integer previousWordOffset = textFieldPreparedSelection.getPreviousWordOffset();
        if (previousWordOffset != null) {
            deleteSurroundingTextCommand = new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection()) - previousWordOffset.intValue(), 0);
        } else {
            deleteSurroundingTextCommand = null;
        }
        return deleteSurroundingTextCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getInputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        java.lang.Integer nextWordOffset = textFieldPreparedSelection.getNextWordOffset();
        return nextWordOffset != null ? new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getHighSpeedVideoSizesFor(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        androidx.compose.ui.text.input.DeleteSurroundingTextCommand deleteSurroundingTextCommand;
        java.lang.Integer lineStartByOffset = textFieldPreparedSelection.getLineStartByOffset();
        if (lineStartByOffset != null) {
            deleteSurroundingTextCommand = new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection()) - lineStartByOffset.intValue(), 0);
        } else {
            deleteSurroundingTextCommand = null;
        }
        return deleteSurroundingTextCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.EditCommand getOutputMinFrameDuration(androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection) {
        java.lang.Integer lineEndByOffset = textFieldPreparedSelection.getLineEndByOffset();
        return lineEndByOffset != null ? new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldPreparedSelection.getSelection())) : null;
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.TextFieldPreparedSelection, kotlin.Unit> p0) {
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = new androidx.compose.foundation.text.selection.TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        p0.invoke(textFieldPreparedSelection);
        if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && kotlin.jvm.internal.Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.getHighSpeedVideoSizes.invoke(textFieldPreparedSelection.getValue());
    }

    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.foundation.text.DeadKeyCombiner deadKeyCombiner, androidx.compose.foundation.text.KeyMapping keyMapping, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.CENTER.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
