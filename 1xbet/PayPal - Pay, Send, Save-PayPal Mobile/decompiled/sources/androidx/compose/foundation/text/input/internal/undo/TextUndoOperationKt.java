package androidx.compose.foundation.text.input.internal.undo;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "op", "", "undo", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "redo"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextUndoOperationKt {
    public static final void undo(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced(mainBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(textUndoOperation.getPreSelection()), androidx.compose.ui.text.TextRange.m8034getEndimpl(textUndoOperation.getPreSelection()));
        textFieldState.Camera2StreamConfigurationMap(textFieldState.getValue$foundation(), androidx.compose.foundation.text.input.TextFieldBuffer.m2170toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer(), 0L, null, null, null, 15, null), true);
    }

    public static final void redo(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced(mainBuffer, androidx.compose.ui.text.TextRange.m8039getStartimpl(textUndoOperation.getPostSelection()), androidx.compose.ui.text.TextRange.m8034getEndimpl(textUndoOperation.getPostSelection()));
        textFieldState.Camera2StreamConfigurationMap(textFieldState.getValue$foundation(), androidx.compose.foundation.text.input.TextFieldBuffer.m2170toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer(), 0L, null, null, null, 15, null), true);
    }
}
