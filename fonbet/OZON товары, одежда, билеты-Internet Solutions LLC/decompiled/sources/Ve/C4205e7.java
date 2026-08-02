package Ve;

import android.text.Editable;
import android.text.TextWatcher;
import spay.sdk.view.PhoneNumberCompositeView;

/* renamed from: Ve.e7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4205e7 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberCompositeView f30914a;

    public C4205e7(PhoneNumberCompositeView phoneNumberCompositeView) {
        this.f30914a = phoneNumberCompositeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PhoneNumberCompositeView phoneNumberCompositeView = this.f30914a;
        if (phoneNumberCompositeView.f98874a || editable == null) {
            return;
        }
        phoneNumberCompositeView.f98874a = true;
        String a11 = PhoneNumberCompositeView.a(editable.toString());
        a11.getClass();
        phoneNumberCompositeView.setText(a11);
        phoneNumberCompositeView.setSelection(a11.length());
        phoneNumberCompositeView.f98874a = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
