package p059i0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f13823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f13824b;

    public d(TextView textView) {
        this.f13823a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f13823a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        j jVarA = j.a();
        if (this.f13824b == null) {
            this.f13824b = new c(textView, this);
        }
        jVarA.f(this.f13824b);
        return charSequence;
    }
}
