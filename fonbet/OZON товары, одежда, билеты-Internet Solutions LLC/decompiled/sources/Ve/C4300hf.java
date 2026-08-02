package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import spay.sdk.view.BnplLogoCompositeView;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.hf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4300hf implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f31187a;

    /* renamed from: b, reason: collision with root package name */
    public final BnplLogoCompositeView f31188b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31189c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f31190d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f31191e;

    public C4300hf(CardView cardView, BnplLogoCompositeView bnplLogoCompositeView, SPayTextView sPayTextView, SPayTextView sPayTextView2, AppCompatImageView appCompatImageView) {
        this.f31187a = cardView;
        this.f31188b = bnplLogoCompositeView;
        this.f31189c = sPayTextView;
        this.f31190d = sPayTextView2;
        this.f31191e = appCompatImageView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31187a;
    }
}
