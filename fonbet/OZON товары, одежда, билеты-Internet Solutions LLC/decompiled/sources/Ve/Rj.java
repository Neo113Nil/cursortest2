package Ve;

import B1.C2548q;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Rj implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29858a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f29859b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f29860c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f29861d;

    /* renamed from: e, reason: collision with root package name */
    public final CardLogoCompositeView f29862e;

    public Rj(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, CardLogoCompositeView cardLogoCompositeView, SPayTextView sPayTextView, SPayTextView sPayTextView2) {
        this.f29858a = constraintLayout;
        this.f29859b = appCompatImageView;
        this.f29860c = sPayTextView;
        this.f29861d = sPayTextView2;
        this.f29862e = cardLogoCompositeView;
    }

    public static Rj a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R.id.spay_silcw_compound_wallet_iv_more_cards;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R.id.spay_silcw_tv_wallet_amount;
            SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, view);
            if (sPayTextView != null) {
                i11 = R.id.spay_silcw_tv_wallet_card_info;
                SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, view);
                if (sPayTextView2 != null) {
                    i11 = R.id.spay_silcw_wallet_logo_cv;
                    CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) C2548q.d(i11, view);
                    if (cardLogoCompositeView != null) {
                        return new Rj(appCompatImageView, constraintLayout, cardLogoCompositeView, sPayTextView, sPayTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f29858a;
    }
}
