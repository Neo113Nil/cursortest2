package androidx.compose.foundation.text2.input.internal.undo;

/* compiled from: TextUndoOperation.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"redo", "", "Landroidx/compose/foundation/text2/input/TextFieldState;", "op", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void undo(androidx.compose.foundation.text2.input.TextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation textUndoOperation) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        mainBuffer.setSelection(androidx.compose.ui.text.TextRange.m3964getStartimpl(textUndoOperation.getPreSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textUndoOperation.getPreSelection()));
        androidx.compose.foundation.text2.input.TextFieldCharSequence m1101TextFieldCharSequence3r_uNRQ = androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.m1101TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA());
        textFieldState.setText(m1101TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1101TextFieldCharSequence3r_uNRQ);
    }

    public static final void redo(androidx.compose.foundation.text2.input.TextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation textUndoOperation) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        mainBuffer.setSelection(androidx.compose.ui.text.TextRange.m3964getStartimpl(textUndoOperation.getPostSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textUndoOperation.getPostSelection()));
        androidx.compose.foundation.text2.input.TextFieldCharSequence m1101TextFieldCharSequence3r_uNRQ = androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.m1101TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA());
        textFieldState.setText(m1101TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1101TextFieldCharSequence3r_uNRQ);
    }
}
