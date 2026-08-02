package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* renamed from: Ve.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4400l0 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31483a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayMaterialButton f31484b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f31485c;

    /* renamed from: d, reason: collision with root package name */
    public final SpayOtpTextView f31486d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayTextView f31487e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayTextView f31488f;

    /* renamed from: g, reason: collision with root package name */
    public final SPayTextView f31489g;

    public C4400l0(ConstraintLayout constraintLayout, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2, SpayOtpTextView spayOtpTextView, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayTextView sPayTextView3) {
        this.f31483a = constraintLayout;
        this.f31484b = sPayMaterialButton;
        this.f31485c = sPayMaterialButton2;
        this.f31486d = spayOtpTextView;
        this.f31487e = sPayTextView;
        this.f31488f = sPayTextView2;
        this.f31489g = sPayTextView3;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31483a;
    }
}
