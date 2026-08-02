package x1;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import n.C2111E;
import v1.k;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2642c extends v1.h implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f21072k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f21073l;

    public RunnableC2642c(C2111E c2111e, d dVar) {
        this.f21072k = new WeakReference(c2111e);
        this.f21073l = new WeakReference(dVar);
    }

    @Override // v1.h
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f21072k.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f21072k.get();
        InputFilter inputFilter = (InputFilter) this.f21073l.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    k a5 = k.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a5.getClass();
                        length = text.length();
                    }
                    CharSequence g5 = a5.g(0, length, 0, text);
                    if (text == g5) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(g5);
                    int selectionEnd = Selection.getSelectionEnd(g5);
                    textView.setText(g5);
                    if (g5 instanceof Spannable) {
                        Spannable spannable = (Spannable) g5;
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
