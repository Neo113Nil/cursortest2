package i0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import g0.j;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13817a;

    /* renamed from: b, reason: collision with root package name */
    public C1236c f13818b;

    public C1237d(TextView textView) {
        this.f13817a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f13817a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b7 = j.a().b();
        if (b7 != 0) {
            if (b7 == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
            if (b7 != 3) {
                return charSequence;
            }
        }
        j a2 = j.a();
        if (this.f13818b == null) {
            this.f13818b = new C1236c(textView, this);
        }
        a2.f(this.f13818b);
        return charSequence;
    }
}
