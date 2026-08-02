package V;

import P.C0352h;
import P.InterfaceC0351g;
import P.InterfaceC0366w;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class p implements InterfaceC0366w {
    public final C0352h a(View view, C0352h c0352h) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0352h);
        }
        if (c0352h.f5068a.k() == 2) {
            return c0352h;
        }
        InterfaceC0351g interfaceC0351g = c0352h.f5068a;
        ClipData e7 = interfaceC0351g.e();
        int c3 = interfaceC0351g.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z4 = false;
        for (int i7 = 0; i7 < e7.getItemCount(); i7++) {
            ClipData.Item itemAt = e7.getItemAt(i7);
            if ((c3 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z4) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z4 = true;
                }
            }
        }
        return null;
    }
}
