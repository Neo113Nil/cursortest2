package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", io.ktor.http.LinkHeader.Rel.Next, "merge", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "Landroidx/compose/foundation/text/input/TextUndoManager;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "pre", "post", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "changes", "", "allowMerge", "", "recordChanges", "(Landroidx/compose/foundation/text/input/TextUndoManager;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Z)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextUndoManagerKt {
    public static final androidx.compose.foundation.text.input.internal.undo.TextUndoOperation merge(androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation, androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= androidx.compose.foundation.text.UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation.getPostText(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) || kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation.getPostText(), io.ktor.sse.ServerSentEventKt.END_OF_LINE) || kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation2.getPostText(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) || kotlin.jvm.internal.Intrinsics.areEqual(textUndoOperation2.getPostText(), io.ktor.sse.ServerSentEventKt.END_OF_LINE) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == androidx.compose.foundation.text.input.internal.undo.TextEditType.Insert && textUndoOperation.getIndex() + textUndoOperation.getPostText().length() == textUndoOperation2.getIndex()) {
            int index = textUndoOperation.getIndex();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(textUndoOperation.getPostText());
            sb.append(textUndoOperation2.getPostText());
            return new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(index, "", sb.toString(), textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getTextEditType() == androidx.compose.foundation.text.input.internal.undo.TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == androidx.compose.foundation.text.input.internal.undo.TextDeleteType.Start || textUndoOperation.getDeletionType() == androidx.compose.foundation.text.input.internal.undo.TextDeleteType.End)) {
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex() + textUndoOperation2.getPreText().length()) {
                int index2 = textUndoOperation2.getIndex();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(textUndoOperation2.getPreText());
                sb2.append(textUndoOperation.getPreText());
                return new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(index2, sb2.toString(), "", textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                int index3 = textUndoOperation.getIndex();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(textUndoOperation.getPreText());
                sb3.append(textUndoOperation2.getPreText());
                return new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(index3, sb3.toString(), "", textUndoOperation.getPreSelection(), textUndoOperation2.getPostSelection(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static /* synthetic */ void recordChanges$default(androidx.compose.foundation.text.input.TextUndoManager textUndoManager, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList changeList, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        recordChanges(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, z);
    }

    public static final void recordChanges(androidx.compose.foundation.text.input.TextUndoManager textUndoManager, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList changeList, boolean z) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.getSelection(), textFieldCharSequence2.getSelection(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long mo2177getOriginalRangejx7JFs = changeList.mo2177getOriginalRangejx7JFs(0);
            long mo2178getRangejx7JFs = changeList.mo2178getRangejx7JFs(0);
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(mo2177getOriginalRangejx7JFs) && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(mo2178getRangejx7JFs)) {
                return;
            }
            textUndoManager.record(new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2177getOriginalRangejx7JFs), androidx.compose.ui.text.TextRangeKt.m8046substringFDrldGo(textFieldCharSequence, mo2177getOriginalRangejx7JFs), androidx.compose.ui.text.TextRangeKt.m8046substringFDrldGo(textFieldCharSequence2, mo2178getRangejx7JFs), textFieldCharSequence.getSelection(), textFieldCharSequence2.getSelection(), 0L, z, 32, null));
        }
    }
}
