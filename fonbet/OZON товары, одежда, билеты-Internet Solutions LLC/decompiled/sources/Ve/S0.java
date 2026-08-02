package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.view.BnplButtonCompositeView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;
import spay.sdk.view.SpayBnplGraphCompositeView;
import spay.sdk.view.SpayBonusOverallCompositeView;
import spay.sdk.view.SpayUserDataCompositeView;

/* loaded from: classes10.dex */
public final class S0 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollView f29925a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f29926b;

    /* renamed from: c, reason: collision with root package name */
    public final BnplButtonCompositeView f29927c;

    /* renamed from: d, reason: collision with root package name */
    public final CardView f29928d;

    /* renamed from: e, reason: collision with root package name */
    public final Rj f29929e;

    /* renamed from: f, reason: collision with root package name */
    public final C4622sk f29930f;

    /* renamed from: g, reason: collision with root package name */
    public final SPayMaterialButton f29931g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f29932h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f29933i;

    /* renamed from: j, reason: collision with root package name */
    public final SpayBnplGraphCompositeView f29934j;

    /* renamed from: k, reason: collision with root package name */
    public final SpayBonusOverallCompositeView f29935k;

    /* renamed from: l, reason: collision with root package name */
    public final SpayUserDataCompositeView f29936l;

    /* renamed from: m, reason: collision with root package name */
    public final SPayTextView f29937m;

    /* renamed from: n, reason: collision with root package name */
    public final SpasiboBonusesButtonCompositeView f29938n;

    public S0(NestedScrollView nestedScrollView, AppCompatButton appCompatButton, BnplButtonCompositeView bnplButtonCompositeView, CardView cardView, Rj rj2, C4622sk c4622sk, SPayMaterialButton sPayMaterialButton, RecyclerView recyclerView, RecyclerView recyclerView2, SpayBnplGraphCompositeView spayBnplGraphCompositeView, SpayBonusOverallCompositeView spayBonusOverallCompositeView, SpayUserDataCompositeView spayUserDataCompositeView, SPayTextView sPayTextView, SpasiboBonusesButtonCompositeView spasiboBonusesButtonCompositeView) {
        this.f29925a = nestedScrollView;
        this.f29926b = appCompatButton;
        this.f29927c = bnplButtonCompositeView;
        this.f29928d = cardView;
        this.f29929e = rj2;
        this.f29930f = c4622sk;
        this.f29931g = sPayMaterialButton;
        this.f29932h = recyclerView;
        this.f29933i = recyclerView2;
        this.f29934j = spayBnplGraphCompositeView;
        this.f29935k = spayBonusOverallCompositeView;
        this.f29936l = spayUserDataCompositeView;
        this.f29937m = sPayTextView;
        this.f29938n = spasiboBonusesButtonCompositeView;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f29925a;
    }
}
