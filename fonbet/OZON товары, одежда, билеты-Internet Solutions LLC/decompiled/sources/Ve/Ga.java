package Ve;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* loaded from: classes10.dex */
public final class Ga implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpayOtpTextView f29066a;

    public Ga(SpayOtpTextView spayOtpTextView) {
        this.f29066a = spayOtpTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s11, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(s11, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s11, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(s11, "s");
        SpayOtpTextView spayOtpTextView = this.f29066a;
        if (i12 > i13) {
            W8 w82 = spayOtpTextView.f98899b;
            if (w82 != null) {
                w82.setText(R.string.spay_empty_string);
            }
        } else {
            spayOtpTextView.setOTP(s11);
            spayOtpTextView.setFocus(s11.length());
        }
        InterfaceC4122ba spayOtpListener = spayOtpTextView.getSpayOtpListener();
        if (spayOtpListener != null) {
            String code = s11.toString();
            Intrinsics.checkNotNullParameter(code, "code");
            Pm pm = ((C4276gk) spayOtpListener).f31116a;
            ((Z2) pm.u()).e0(new C3(code));
            if (s11.length() == spayOtpTextView.f98903f) {
                String otp = s11.toString();
                Intrinsics.checkNotNullParameter(otp, "otp");
                ((Z2) pm.u()).e0(new C3(otp));
            }
        }
    }
}
