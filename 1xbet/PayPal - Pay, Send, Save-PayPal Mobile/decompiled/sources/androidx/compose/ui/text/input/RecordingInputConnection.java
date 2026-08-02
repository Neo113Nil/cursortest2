package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00101J\u0019\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b6\u00107J!\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u00107J\u0019\u0010B\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u001bH\u0016¢\u0006\u0004\bL\u00107J\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u001bH\u0016¢\u0006\u0004\bQ\u0010RJ#\u0010W\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010\\\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020Y2\u0006\u0010/\u001a\u00020\u001b2\b\u0010[\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b\\\u0010]R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010a\u001a\u0004\bb\u0010\u0015R\u0016\u0010e\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR*\u0010g\u001a\u00020\u00022\u0006\u0010f\u001a\u00020\u00028\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010dR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010aR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00100o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\be\u0010pR\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010a"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/ui/text/input/InputEventCallback2;", "eventCallback", "", "autoCorrect", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "state", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputMethodManager;)V", "Landroidx/compose/ui/text/input/EditCommand;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/input/EditCommand;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "Z", "getAutoCorrect", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "mTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecordingInputConnection implements android.view.inputmethod.InputConnection {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private final boolean autoCorrect;
    private final androidx.compose.ui.text.input.InputEventCallback2 eventCallback;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.text.input.TextFieldValue mTextFieldValue;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.text.input.EditCommand> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap = true;

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    public RecordingInputConnection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.InputEventCallback2 inputEventCallback2, boolean z) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    public final androidx.compose.ui.text.input.InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getMTextFieldValue$ui, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    public final void setMTextFieldValue$ui(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    public final void updateInputState(androidx.compose.ui.text.input.TextFieldValue state, androidx.compose.ui.text.input.InputMethodManager inputMethodManager) {
        if (this.Camera2StreamConfigurationMap) {
            setMTextFieldValue$ui(state);
            if (this.getHighSpeedVideoFpsRangesFor) {
                inputMethodManager.updateExtractedText(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.text.input.InputState_androidKt.toExtractedText(state));
            }
            androidx.compose.ui.text.TextRange composition = state.getComposition();
            int m8037getMinimpl = composition != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            androidx.compose.ui.text.TextRange composition2 = state.getComposition();
            inputMethodManager.updateSelection(androidx.compose.ui.text.TextRange.m8037getMinimpl(state.getSelection()), androidx.compose.ui.text.TextRange.m8036getMaximpl(state.getSelection()), m8037getMinimpl, composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return getHighSpeedVideoFpsRangesFor();
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        int i = this.getHighSpeedVideoSizes - 1;
        this.getHighSpeedVideoSizes = i;
        if (i == 0 && !this.getHighSpeedVideoFpsRanges.isEmpty()) {
            this.eventCallback.onEditCommands(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighSpeedVideoFpsRanges));
            this.getHighSpeedVideoFpsRanges.clear();
        }
        return this.getHighSpeedVideoSizes > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int maxChars, int flags) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return androidx.compose.ui.text.input.TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.getHighSpeedVideoFpsRangesFor = z;
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI = request != null ? request.token : 0;
        }
        return androidx.compose.ui.text.input.InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int reqModes) {
        return android.text.TextUtils.getCapsMode(this.mTextFieldValue.getText(), androidx.compose.ui.text.TextRange.m8037getMinimpl(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        this.getHighSpeedVideoSizes++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence text, int newCursorPosition) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.CommitTextCommand(java.lang.String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int start, int end) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.SetComposingRegionCommand(start, end));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence text, int newCursorPosition) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.SetComposingTextCommand(java.lang.String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int start, int end) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.SetSelectionCommand(start, end));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent event) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        this.eventCallback.onKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.Camera2StreamConfigurationMap;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (cursorUpdateMode & 1) != 0;
        boolean z8 = (cursorUpdateMode & 2) != 0;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            boolean z9 = (cursorUpdateMode & 16) != 0;
            boolean z10 = (cursorUpdateMode & 8) != 0;
            boolean z11 = (cursorUpdateMode & 4) != 0;
            if (android.os.Build.VERSION.SDK_INT >= 34 && (cursorUpdateMode & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z4 = z10;
                z = z11;
                z3 = z9;
            } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int id) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        switch (id) {
            case android.R.id.selectAll:
                getHighSpeedVideoFpsRangesFor(new androidx.compose.ui.text.input.SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                break;
            case android.R.id.cut:
                sendKeyEvent(new android.view.KeyEvent(0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE));
                sendKeyEvent(new android.view.KeyEvent(1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE));
                break;
            case android.R.id.copy:
                sendKeyEvent(new android.view.KeyEvent(0, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE));
                sendKeyEvent(new android.view.KeyEvent(1, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE));
                break;
            case android.R.id.paste:
                sendKeyEvent(new android.view.KeyEvent(0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE));
                sendKeyEvent(new android.view.KeyEvent(1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE));
                break;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int editorAction) {
        int m8213getDefaulteUduSuo;
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        if (editorAction == 0) {
            m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo();
        } else {
            switch (editorAction) {
                case 2:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8215getGoeUduSuo();
                    break;
                case 3:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo();
                    break;
                case 4:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8220getSendeUduSuo();
                    break;
                case 5:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo();
                    break;
                case 6:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo();
                    break;
                case 7:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo();
                    break;
                default:
                    m8213getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo();
                    break;
            }
        }
        this.eventCallback.mo8232onImeActionKlQnJC8(m8213getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo text) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z = this.Camera2StreamConfigurationMap;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int states) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int flags, android.os.Bundle opts) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            return false;
        }
        return z;
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.EditCommand p0) {
        this.getHighSpeedVideoSizes++;
        try {
            this.getHighSpeedVideoFpsRanges.add(p0);
        } finally {
            getHighSpeedVideoFpsRangesFor();
        }
    }
}
