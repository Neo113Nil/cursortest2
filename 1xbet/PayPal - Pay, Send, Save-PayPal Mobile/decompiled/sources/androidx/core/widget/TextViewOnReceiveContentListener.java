package androidx.core.widget;

/* loaded from: classes3.dex */
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    @Override // androidx.core.view.OnReceiveContentListener
    public final androidx.core.view.ContentInfoCompat onReceiveContent(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
        java.lang.CharSequence coerceToStyledText;
        if (contentInfoCompat.getSource() == 2) {
            return contentInfoCompat;
        }
        android.content.ClipData clip = contentInfoCompat.getClip();
        int flags = contentInfoCompat.getFlags();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clip.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = clip.getItemAt(i);
            if ((flags & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof android.text.Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    editable.insert(android.text.Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = android.text.Selection.getSelectionStart(editable);
                    int selectionEnd = android.text.Selection.getSelectionEnd(editable);
                    int max = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
                    int max2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
                    android.text.Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
