package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010%J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"H\u0016¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010)J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b/\u0010)J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020 2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020 2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u00108J\u0019\u0010:\u001a\u0004\u0018\u00010 2\u0006\u00106\u001a\u00020\"H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\"H\u0016¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u00106\u001a\u00020\"H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bE\u0010>J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\"H\u0016¢\u0006\u0004\bG\u0010>J+\u0010N\u001a\u00020\u00132\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010S\u001a\u00020\u00062\u0006\u0010I\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010Z\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\"H\u0016¢\u0006\u0004\b`\u0010>J\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\"2\u0006\u0010d\u001a\u00020\"H\u0016¢\u0006\u0004\be\u0010fJ#\u0010k\u001a\u00020\u00062\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bk\u0010lJ)\u0010p\u001a\u00020\u00062\u0006\u0010n\u001a\u00020m2\u0006\u00106\u001a\u00020\"2\b\u0010o\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010z\u001a\u0004\b{\u0010|R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R2\u0010\u0084\u0001\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00028\u0001@AX\u0081\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u0018\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0081\u0001R\u0018\u0010\u0080\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010uR\u001d\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u008a\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u008b\u0001R\u0017\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010u"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "eventCallback", "", "autoCorrect", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputEventCallback2;ZLandroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;)V", "state", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "Landroidx/compose/ui/text/input/EditCommand;", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/input/EditCommand;)V", "beginBatchEdit", "()Z", "endBatchEdit", "Camera2StreamConfigurationMap", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "Z", "getAutoCorrect", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue$foundation", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue$foundation", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecordingInputConnection implements android.view.inputmethod.InputConnection {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private final boolean autoCorrect;
    private final androidx.compose.foundation.text.input.internal.InputEventCallback2 eventCallback;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.text.input.EditCommand> getHighSpeedVideoFpsRanges;
    private final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState;
    private final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager;
    private androidx.compose.ui.text.input.TextFieldValue textFieldValue;
    private final androidx.compose.ui.platform.ViewConfiguration viewConfiguration;

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    public RecordingInputConnection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.input.internal.InputEventCallback2 inputEventCallback2, boolean z, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = true;
    }

    public /* synthetic */ RecordingInputConnection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.input.internal.InputEventCallback2 inputEventCallback2, boolean z, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, inputEventCallback2, z, (i & 8) != 0 ? null : legacyTextFieldState, (i & 16) != 0 ? null : textFieldSelectionManager, (i & 32) != 0 ? null : viewConfiguration);
    }

    public final androidx.compose.foundation.text.input.internal.InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final androidx.compose.foundation.text.LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* renamed from: getTextFieldValue$foundation, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getTextFieldValue() {
        return this.textFieldValue;
    }

    public final void setTextFieldValue$foundation(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void updateInputState(androidx.compose.ui.text.input.TextFieldValue state, androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager) {
        if (this.Camera2StreamConfigurationMap) {
            setTextFieldValue$foundation(state);
            if (this.getHighSpeedVideoFpsRangesFor) {
                inputMethodManager.updateExtractedText(this.getHighSpeedVideoSizes, androidx.compose.foundation.text.input.internal.RecordingInputConnection_androidKt.access$toExtractedText(state));
            }
            androidx.compose.ui.text.TextRange composition = state.getComposition();
            int m8037getMinimpl = composition != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            androidx.compose.ui.text.TextRange composition2 = state.getComposition();
            inputMethodManager.updateSelection(androidx.compose.ui.text.TextRange.m8037getMinimpl(state.getSelection()), androidx.compose.ui.text.TextRange.m8036getMaximpl(state.getSelection()), m8037getMinimpl, composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return Camera2StreamConfigurationMap();
    }

    private final boolean Camera2StreamConfigurationMap() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI - 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == 0 && !this.getHighSpeedVideoFpsRanges.isEmpty()) {
            this.eventCallback.onEditCommands(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighSpeedVideoFpsRanges));
            this.getHighSpeedVideoFpsRanges.clear();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int maxChars, int flags) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextAfterSelection(this.textFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.textFieldValue.getSelection())) {
            return null;
        }
        return androidx.compose.ui.text.input.TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.getHighSpeedVideoFpsRangesFor = z;
        if (z) {
            this.getHighSpeedVideoSizes = request != null ? request.token : 0;
        }
        return androidx.compose.foundation.text.input.internal.RecordingInputConnection_androidKt.access$toExtractedText(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture gesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer consumer) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl.INSTANCE.aa_(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, this.viewConfiguration, executor, consumer, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.foundation.text.input.internal.RecordingInputConnection.$r8$lambda$lPJqS3X2xfiamSVxS2KGY6TlKv0(androidx.compose.foundation.text.input.internal.RecordingInputConnection.this, (androidx.compose.ui.text.input.EditCommand) obj);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture gesture, android.os.CancellationSignal cancellationSignal) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl.INSTANCE.ab_(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int reqModes) {
        return android.text.TextUtils.getCapsMode(this.textFieldValue.getText(), androidx.compose.ui.text.TextRange.m8037getMinimpl(this.textFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence text, int newCursorPosition) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoSizes(new androidx.compose.ui.text.input.CommitTextCommand(java.lang.String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int start, int end) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoSizes(new androidx.compose.ui.text.input.SetComposingRegionCommand(start, end));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence text, int newCursorPosition) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighSpeedVideoSizes(new androidx.compose.ui.text.input.SetComposingTextCommand(java.lang.String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoSizes(new androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoSizes(new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int start, int end) {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoSizes(new androidx.compose.ui.text.input.SetSelectionCommand(start, end));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.Camera2StreamConfigurationMap;
        if (!z) {
            return z;
        }
        getHighSpeedVideoSizes(new androidx.compose.ui.text.input.FinishComposingTextCommand());
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
                getHighSpeedVideoSizes(new androidx.compose.ui.text.input.SetSelectionCommand(0, this.textFieldValue.getText().length()));
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
        this.eventCallback.mo2235onImeActionKlQnJC8(m8213getDefaulteUduSuo);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$lPJqS3X2xfiamSVxS2KGY6TlKv0(androidx.compose.foundation.text.input.internal.RecordingInputConnection recordingInputConnection, androidx.compose.ui.text.input.EditCommand editCommand) {
        recordingInputConnection.getHighResolutionOutputSizeshNQ4ISI++;
        try {
            recordingInputConnection.getHighSpeedVideoFpsRanges.add(editCommand);
            recordingInputConnection.Camera2StreamConfigurationMap();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            recordingInputConnection.Camera2StreamConfigurationMap();
            throw th;
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.text.input.EditCommand p0) {
        this.getHighResolutionOutputSizeshNQ4ISI++;
        try {
            this.getHighSpeedVideoFpsRanges.add(p0);
        } finally {
            Camera2StreamConfigurationMap();
        }
    }
}
