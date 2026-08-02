package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010-J+\u00104\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\b2\u0006\u0010/\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u0010-J\u0017\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010-J\u0019\u0010H\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u0010-J\u0017\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010Z\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J)\u0010_\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0006\u0010%\u001a\u00020\u00112\b\u0010^\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010a\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR+\u0010l\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\f0g¢\u0006\u0002\bi0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010d\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010nR\u0014\u0010j\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010o"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "session", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/EditorInfo;)V", "", "beginBatchEdit", "()Z", "endBatchEdit", "", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "reqModes", "getCursorCapsMode", "(I)I", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "", "action", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "Lkotlin/ExtensionFunctionType;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "Landroid/view/inputmethod/InputConnection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatelessInputConnection implements android.view.inputmethod.InputConnection {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.internal.ImeEditCommandScope, kotlin.Unit>> getHighSpeedVideoFpsRangesFor = new androidx.compose.runtime.collection.MutableVector<>(new kotlin.jvm.functions.Function1[16], 0);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextInputSession getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.view.inputmethod.InputConnection Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1 getHighResolutionOutputSizeshNQ4ISI;

    public static final /* synthetic */ void access$logDebug(androidx.compose.foundation.text.input.internal.StatelessInputConnection statelessInputConnection, java.lang.String str) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int states) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(androidx.compose.foundation.text.input.internal.TextInputSession textInputSession, android.view.inputmethod.EditorInfo editorInfo) {
        this.getHighSpeedVideoSizes = textInputSession;
        ?? r3 = new android.view.inputmethod.InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int flags, android.os.Bundle opts) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) {
                return true;
            }

            {
                super(this, false);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = r3;
        this.Camera2StreamConfigurationMap = androidx.core.view.inputmethod.InputConnectionCompat.createWrapper((android.view.inputmethod.InputConnection) r3, editorInfo, new androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfo, int flags, android.os.Bundle opts) {
                androidx.compose.foundation.text.input.internal.TextInputSession textInputSession2;
                if ((flags & 1) != 0) {
                    try {
                        inputContentInfo.requestPermission();
                        java.lang.Object unwrap = inputContentInfo.unwrap();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(unwrap, "");
                        android.os.Parcelable parcelable = (android.os.Parcelable) unwrap;
                        opts = opts == null ? new android.os.Bundle() : new android.os.Bundle(opts);
                        opts.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (java.lang.Exception e) {
                        androidx.compose.foundation.text.input.internal.StatelessInputConnection.access$logDebug(androidx.compose.foundation.text.input.internal.StatelessInputConnection.this, "Can't insert content from IME; requestPermission() failed, ".concat(java.lang.String.valueOf(e)));
                        return false;
                    }
                }
                textInputSession2 = androidx.compose.foundation.text.input.internal.StatelessInputConnection.this.getHighSpeedVideoSizes;
                return textInputSession2.onCommitContent(androidx.compose.foundation.text.input.internal.StatelessInputConnection_androidKt.toTransferableContent(inputContentInfo, opts));
            }
        });
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighSpeedVideoFpsRanges = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence text, int newCursorPosition) {
        java.util.Objects.toString(text);
        if (text == null) {
            return true;
        }
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText(this.getHighSpeedVideoSizes, text.toString(), newCursorPosition);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int start, int end) {
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion(this.getHighSpeedVideoSizes, start, end);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence text, int newCursorPosition) {
        java.util.Objects.toString(text);
        if (text == null) {
            return true;
        }
        androidx.compose.foundation.text.input.internal.TextInputSession textInputSession = this.getHighSpeedVideoSizes;
        java.lang.String obj = text.toString();
        android.text.Spanned spanned = text instanceof android.text.Spanned ? (android.text.Spanned) text : null;
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText(textInputSession, obj, newCursorPosition, spanned != null ? androidx.compose.foundation.text.input.internal.StatelessInputConnection_androidKt.toAnnotationList(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints(this.getHighSpeedVideoSizes, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int beforeLength, int afterLength) {
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText(this.getHighSpeedVideoSizes, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int start, int end) {
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection(this.getHighSpeedVideoSizes, start, end);
        this.getHighSpeedVideoSizes.updateTouchMode(false);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText(this.getHighSpeedVideoSizes);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent event) {
        this.getHighSpeedVideoSizes.sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int cursorUpdateMode) {
        this.getHighSpeedVideoSizes.requestCursorUpdates(cursorUpdateMode);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture gesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer consumer) {
        java.util.Objects.toString(gesture);
        java.util.Objects.toString(executor);
        java.util.Objects.toString(consumer);
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl.INSTANCE.ac_(this.getHighSpeedVideoSizes, gesture, executor, consumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture gesture, android.os.CancellationSignal cancellationSignal) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl.INSTANCE.ad_(this.getHighSpeedVideoSizes, gesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int editorAction) {
        int m8213getDefaulteUduSuo;
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
        this.getHighSpeedVideoSizes.mo2208onImeActionKlQnJC8(m8213getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo text) {
        java.util.Objects.toString(text != null ? text.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) {
        return this.Camera2StreamConfigurationMap.performPrivateCommand(action, data);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int flags, android.os.Bundle opts) {
        return androidx.compose.foundation.text.input.internal.Api25CommitContentImpl.INSTANCE.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, inputContentInfo, flags, opts);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        return this.getHighSpeedVideoSizes.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.getHighSpeedVideoSizes.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int reqModes) {
        return android.text.TextUtils.getCapsMode(this.getHighSpeedVideoSizes.getText(), androidx.compose.ui.text.TextRange.m8037getMinimpl(this.getHighSpeedVideoSizes.getText().getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags) {
        return androidx.compose.foundation.text.input.internal.StatelessInputConnection_androidKt.access$toExtractedText(this.getHighSpeedVideoSizes.getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.getHighSpeedVideoSizes.getText().getSelection())) {
            return null;
        }
        return androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(this.getHighSpeedVideoSizes.getText()).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int maxChars, int flags) {
        return androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getTextAfterSelection(this.getHighSpeedVideoSizes.getText(), maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getTextBeforeSelection(this.getHighSpeedVideoSizes.getText(), maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        return false;
     */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performContextMenuAction(int id) {
        switch (id) {
            case android.R.id.selectAll:
                androidx.compose.foundation.text.input.internal.TextInputSession textInputSession = this.getHighSpeedVideoSizes;
                androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection(textInputSession, 0, textInputSession.getText().length());
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
    }
}
