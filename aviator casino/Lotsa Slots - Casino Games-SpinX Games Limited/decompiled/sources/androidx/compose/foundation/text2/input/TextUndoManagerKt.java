package androidx.compose.foundation.text2.input;

/* compiled from: TextUndoManager.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a.\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"TEXT_UNDO_CAPACITY", "", "isNewLineInsert", "", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z", "merge", io.ktor.http.LinkHeader.Rel.Next, "recordChanges", "", "Landroidx/compose/foundation/text2/input/TextUndoManager;", "pre", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "post", "changes", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "allowMerge", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    public static final androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation merge(androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation textUndoOperation, androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= androidx.compose.foundation.text.UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(textUndoOperation) || isNewLineInsert(textUndoOperation2) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == androidx.compose.foundation.text2.input.internal.undo.TextEditType.Insert && textUndoOperation.getIndex() + textUndoOperation.getPostText().length() == textUndoOperation2.getIndex()) {
            return new androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation(textUndoOperation.getIndex(), "", textUndoOperation.getPostText() + textUndoOperation2.getPostText(), textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getTextEditType() == androidx.compose.foundation.text2.input.internal.undo.TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == androidx.compose.foundation.text2.input.internal.undo.TextDeleteType.Start || textUndoOperation.getDeletionType() == androidx.compose.foundation.text2.input.internal.undo.TextDeleteType.End)) {
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex() + textUndoOperation2.getPreText().length()) {
                return new androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation(textUndoOperation2.getIndex(), textUndoOperation2.getPreText() + textUndoOperation.getPreText(), "", textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                return new androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation(textUndoOperation.getIndex(), textUndoOperation.getPreText() + textUndoOperation2.getPreText(), "", textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static /* synthetic */ void recordChanges$default(androidx.compose.foundation.text2.input.TextUndoManager textUndoManager, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2, androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList changeList, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        recordChanges(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, z);
    }

    public static final void recordChanges(androidx.compose.foundation.text2.input.TextUndoManager textUndoManager, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2, androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList changeList, boolean z) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.getSelectionInChars(), textFieldCharSequence2.getSelectionInChars(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long mo1088getOriginalRangejx7JFs = changeList.mo1088getOriginalRangejx7JFs(0);
            long mo1089getRangejx7JFs = changeList.mo1089getRangejx7JFs(0);
            if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(mo1088getOriginalRangejx7JFs) && androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(mo1089getRangejx7JFs)) {
                return;
            }
            textUndoManager.record(new androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation(androidx.compose.ui.text.TextRange.m3962getMinimpl(mo1088getOriginalRangejx7JFs), androidx.compose.ui.text.TextRangeKt.m3971substringFDrldGo(textFieldCharSequence, mo1088getOriginalRangejx7JFs), androidx.compose.ui.text.TextRangeKt.m3971substringFDrldGo(textFieldCharSequence2, mo1089getRangejx7JFs), textFieldCharSequence.getSelectionInChars(), textFieldCharSequence2.getSelectionInChars(), 0L, z, 32, null));
        }
    }

    private static final boolean isNewLineInsert(androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation textUndoOperation) {
        return kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation.getPostText(), "\n") || kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation.getPostText(), io.ktor.sse.ServerSentEventKt.END_OF_LINE);
    }
}
