package Km0;

import android.text.InputFilter;
import android.text.Spanned;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        return SpayOtpTextView.a(charSequence, i11, i12, spanned, i13, i14);
    }
}
