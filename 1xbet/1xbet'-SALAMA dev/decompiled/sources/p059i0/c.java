package p059i0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p046g0.h;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f13822b;

    public c(TextView textView, d dVar) {
        this.f13821a = new WeakReference(textView);
        this.f13822b = new WeakReference(dVar);
    }

    @Override // p046g0.h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f13821a.get();
        InputFilter inputFilter = (InputFilter) this.f13822b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j jVarA = j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        jVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = jVarA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
