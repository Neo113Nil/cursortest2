package Ve;

import B1.C2548q;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.sk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4622sk implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32058a;

    /* renamed from: b, reason: collision with root package name */
    public final CardLogoCompositeView f32059b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f32060c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f32061d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayTextView f32062e;

    public C4622sk(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, CardLogoCompositeView cardLogoCompositeView, SPayTextView sPayTextView, SPayTextView sPayTextView2) {
        this.f32058a = constraintLayout;
        this.f32059b = cardLogoCompositeView;
        this.f32060c = appCompatImageView;
        this.f32061d = sPayTextView;
        this.f32062e = sPayTextView2;
    }

    public static C4622sk a(View view) {
        int i11 = R.id.spay_silsc_card_logo_cv;
        CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) C2548q.d(i11, view);
        if (cardLogoCompositeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R.id.spay_silsc_iv_more_cards;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R.id.spay_silsc_tv_card_description;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, view);
                if (sPayTextView != null) {
                    i11 = R.id.spay_silsc_tv_card_title;
                    SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, view);
                    if (sPayTextView2 != null) {
                        return new C4622sk(appCompatImageView, constraintLayout, cardLogoCompositeView, sPayTextView, sPayTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f32058a;
    }
}
