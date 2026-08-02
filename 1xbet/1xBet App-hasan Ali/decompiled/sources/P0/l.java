package P0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class l implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final A.B f4663a;

    /* renamed from: b, reason: collision with root package name */
    public G.D f4664b;

    public l(G.D d5, A.B b3) {
        this.f4663a = b3;
        this.f4664b = d5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            if (d5 != null) {
                a(d5);
                this.f4664b = null;
            }
            this.f4663a.c(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.deleteSurroundingText(i, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.getTextAfterCursor(i, i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.getTextBeforeCursor(i, i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.setComposingRegion(i, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.setSelection(i, i5);
        }
        return false;
    }

    public void a(G.D d5) {
    }
}
