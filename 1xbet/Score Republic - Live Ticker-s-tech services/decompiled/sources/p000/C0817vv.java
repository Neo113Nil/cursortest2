package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: vv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0817vv implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f8272a;

    /* JADX INFO: renamed from: b */
    public C0780uv f8273b;

    public C0817vv(TextView textView) {
        this.f8272a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f8272a;
        if (!textView.isInEditMode()) {
            int iM3995b = C0595pv.m3994a().m3995b();
            if (iM3995b != 0) {
                if (iM3995b == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return C0595pv.m3994a().m3998e(charSequence, 0, charSequence.length());
                    }
                }
            }
            C0595pv c0595pvM3994a = C0595pv.m3994a();
            if (this.f8273b == null) {
                this.f8273b = new C0780uv(textView, this);
            }
            c0595pvM3994a.m3999f(this.f8273b);
            return charSequence;
        }
        return charSequence;
    }
}
