package Ve;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayBonusCompositeView;

/* loaded from: classes10.dex */
public final class Sc implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f29962a;

    /* renamed from: b, reason: collision with root package name */
    public final CardLogoCompositeView f29963b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f29964c;

    /* renamed from: d, reason: collision with root package name */
    public final CardView f29965d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f29966e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayTextView f29967f;

    /* renamed from: g, reason: collision with root package name */
    public final SPayTextView f29968g;

    /* renamed from: h, reason: collision with root package name */
    public final SpayBonusCompositeView f29969h;

    public Sc(CardView cardView, CardLogoCompositeView cardLogoCompositeView, ConstraintLayout constraintLayout, CardView cardView2, AppCompatImageView appCompatImageView, SPayTextView sPayTextView, SPayTextView sPayTextView2, SpayBonusCompositeView spayBonusCompositeView) {
        this.f29962a = cardView;
        this.f29963b = cardLogoCompositeView;
        this.f29964c = constraintLayout;
        this.f29965d = cardView2;
        this.f29966e = appCompatImageView;
        this.f29967f = sPayTextView;
        this.f29968g = sPayTextView2;
        this.f29969h = spayBonusCompositeView;
    }

    public static Sc a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.spay_rv_item_card_selection, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        int i11 = R.id.spay_rics_card_logo_cv;
        CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) C2548q.d(i11, inflate);
        if (cardLogoCompositeView != null) {
            i11 = R.id.spay_rics_cl_content_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, inflate);
            if (constraintLayout != null) {
                CardView cardView = (CardView) inflate;
                i11 = R.id.spay_rics_iv_status;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, inflate);
                if (appCompatImageView != null) {
                    i11 = R.id.spay_rics_tv_card_description;
                    SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                    if (sPayTextView != null) {
                        i11 = R.id.spay_rics_tv_card_title;
                        SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                        if (sPayTextView2 != null) {
                            i11 = R.id.spay_sbcv_bonus;
                            SpayBonusCompositeView spayBonusCompositeView = (SpayBonusCompositeView) C2548q.d(i11, inflate);
                            if (spayBonusCompositeView != null) {
                                return new Sc(cardView, cardLogoCompositeView, constraintLayout, cardView, appCompatImageView, sPayTextView, sPayTextView2, spayBonusCompositeView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29962a;
    }
}
