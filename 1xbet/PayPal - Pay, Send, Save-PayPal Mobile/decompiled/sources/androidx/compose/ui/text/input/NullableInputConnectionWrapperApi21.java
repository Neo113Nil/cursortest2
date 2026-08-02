package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u0019\u0010$\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010!J\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010!J\u0019\u00100\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u0010+J\u0017\u00103\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u0001052\b\u0010\u0006\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010+J\u0011\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J)\u0010?\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020=2\u0006\u0010\u0006\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\bA\u0010BR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR(\u0010I\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\bA\u0010F\u001a\u0004\bG\u0010H"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "disposeDelegate", "()V", "closeConnection", "", "", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "getCursorCapsMode", "(I)I", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "", "deleteSurroundingText", "(II)Z", "deleteSurroundingTextInCodePoints", "setComposingText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "finishComposingText", "()Z", "commitText", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "setSelection", "performEditorAction", "(I)Z", "performContextMenuAction", "beginBatchEdit", "endBatchEdit", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "requestCursorUpdates", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Landroid/view/inputmethod/InputContentInfo;", "p2", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/inputmethod/InputConnection;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/inputmethod/InputConnection;", "Camera2StreamConfigurationMap", "()Landroid/view/inputmethod/InputConnection;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
class NullableInputConnectionWrapperApi21 implements androidx.compose.ui.text.input.NullableInputConnectionWrapper {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.view.inputmethod.InputConnection getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return null;
    }

    protected void getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.InputConnection p0) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullableInputConnectionWrapperApi21(android.view.inputmethod.InputConnection inputConnection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = inputConnection;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    protected final android.view.inputmethod.InputConnection getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            getHighResolutionOutputSizeshNQ4ISI(inputConnection);
            this.getHighSpeedVideoSizes = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.getHighSpeedVideoSizes != null) {
            disposeDelegate();
            this.getHighSpeedVideoFpsRangesFor.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(p0);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(p0);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.setComposingText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.commitText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int p0, int p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.setSelection(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int p0) {
        android.view.inputmethod.InputConnection inputConnection = this.getHighSpeedVideoSizes;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(p0);
        }
        return false;
    }
}
