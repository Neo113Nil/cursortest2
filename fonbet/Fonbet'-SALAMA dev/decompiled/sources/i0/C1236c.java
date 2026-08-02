package i0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import g0.AbstractC1126h;
import g0.j;
import java.lang.ref.WeakReference;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236c extends AbstractC1126h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13815a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f13816b;

    public C1236c(TextView textView, C1237d c1237d) {
        this.f13815a = new WeakReference(textView);
        this.f13816b = new WeakReference(c1237d);
    }

    @Override // g0.AbstractC1126h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f13815a.get();
        InputFilter inputFilter = (InputFilter) this.f13816b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j a2 = j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence e7 = a2.e(text, 0, length);
                    if (text == e7) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e7);
                    int selectionEnd = Selection.getSelectionEnd(e7);
                    textView.setText(e7);
                    if (e7 instanceof Spannable) {
                        Spannable spannable = (Spannable) e7;
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
