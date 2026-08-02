package Y2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f34543a;

    /* renamed from: b, reason: collision with root package name */
    private j.f f34544b;

    private static class a extends j.f {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f34545a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f34546b;

        a(TextView textView, d dVar) {
            this.f34545a = new WeakReference(textView);
            this.f34546b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.j.f
        public final void b() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f34545a.get();
            InputFilter inputFilter = (InputFilter) this.f34546b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        j c11 = j.c();
                        if (text == null) {
                            length = 0;
                        } else {
                            c11.getClass();
                            length = text.length();
                        }
                        CharSequence n11 = c11.n(0, length, 0, text);
                        if (text == n11) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(n11);
                        int selectionEnd = Selection.getSelectionEnd(n11);
                        textView.setText(n11);
                        if (n11 instanceof Spannable) {
                            Spannable spannable = (Spannable) n11;
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

    d(@NonNull TextView textView) {
        this.f34543a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        TextView textView = this.f34543a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int f7 = j.c().f();
        if (f7 != 0) {
            if (f7 == 1) {
                if ((i14 == 0 && i13 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i11 != 0 || i12 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i11, i12);
                }
                return j.c().n(0, charSequence.length(), 0, charSequence);
            }
            if (f7 != 3) {
                return charSequence;
            }
        }
        j c11 = j.c();
        if (this.f34544b == null) {
            this.f34544b = new a(textView, this);
        }
        c11.o(this.f34544b);
        return charSequence;
    }
}
