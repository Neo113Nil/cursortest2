package x1;

import android.text.InputFilter;
import android.text.Spanned;
import n.C2111E;
import v1.k;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final C2111E f21074a;

    /* renamed from: b, reason: collision with root package name */
    public RunnableC2642c f21075b;

    public d(C2111E c2111e) {
        this.f21074a = c2111e;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i5, Spanned spanned, int i6, int i7) {
        C2111E c2111e = this.f21074a;
        if (c2111e.isInEditMode()) {
            return charSequence;
        }
        int c5 = k.a().c();
        if (c5 != 0) {
            if (c5 == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == c2111e.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i5);
                }
                return k.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (c5 != 3) {
                return charSequence;
            }
        }
        k a5 = k.a();
        if (this.f21075b == null) {
            this.f21075b = new RunnableC2642c(c2111e, this);
        }
        a5.h(this.f21075b);
        return charSequence;
    }
}
