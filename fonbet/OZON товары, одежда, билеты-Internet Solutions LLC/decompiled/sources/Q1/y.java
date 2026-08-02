package Q1;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
class y implements InterfaceInputConnectionC3854x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1 f22921a;

    /* renamed from: b, reason: collision with root package name */
    private InputConnection f22922b;

    public y(@NotNull InputConnection inputConnection, @NotNull Function1 function1) {
        this.f22921a = function1;
        this.f22922b = inputConnection;
    }

    @Override // Q1.InterfaceInputConnectionC3854x
    public final void a() {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            inputConnection.closeConnection();
            this.f22922b = null;
        }
    }

    protected final InputConnection b() {
        return this.f22922b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f22922b != null) {
            a();
            this.f22921a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        InputConnection b11 = b();
        if (b11 != null) {
            return b11.commitContent(inputContentInfo, i11, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        InputConnection b11 = b();
        if (b11 != null) {
            return b11.deleteSurroundingTextInCodePoints(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i11);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection b11 = b();
        if (b11 != null) {
            return b11.getHandler();
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        InputConnection inputConnection = this.f22922b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i11, i12);
        }
        return false;
    }
}
