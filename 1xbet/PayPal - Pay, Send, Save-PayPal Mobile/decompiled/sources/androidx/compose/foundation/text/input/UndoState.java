package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8G¢\u0006\f\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\r8G¢\u0006\f\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/text/input/UndoState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "state", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "", "undo", "()V", "redo", "clearHistory", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "getCanUndo", "()Z", "getCanUndo$annotations", "canUndo", "getCanRedo", "getCanRedo$annotations", "canRedo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UndoState {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.input.TextFieldState getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }

    public UndoState(androidx.compose.foundation.text.input.TextFieldState textFieldState) {
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldState;
    }

    public final boolean getCanUndo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTextUndoManager().getCanUndo();
    }

    public final boolean getCanRedo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTextUndoManager().getCanRedo();
    }

    public final void undo() {
        this.getHighResolutionOutputSizeshNQ4ISI.getTextUndoManager().undo(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void redo() {
        this.getHighResolutionOutputSizeshNQ4ISI.getTextUndoManager().redo(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void clearHistory() {
        this.getHighResolutionOutputSizeshNQ4ISI.getTextUndoManager().clearHistory();
    }
}
