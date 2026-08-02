package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.PhoneNumberCompositeView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Z4 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30560a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f30561b;

    /* renamed from: c, reason: collision with root package name */
    public final PhoneNumberCompositeView f30562c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f30563d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f30564e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayTextView f30565f;

    public Z4(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, PhoneNumberCompositeView phoneNumberCompositeView, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton, SPayTextView sPayTextView2) {
        this.f30560a = constraintLayout;
        this.f30561b = appCompatButton;
        this.f30562c = phoneNumberCompositeView;
        this.f30563d = sPayTextView;
        this.f30564e = sPayMaterialButton;
        this.f30565f = sPayTextView2;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f30560a;
    }
}
