package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class H2 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollView f29102a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayMaterialButton f29103b;

    /* renamed from: c, reason: collision with root package name */
    public final CardView f29104c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f29105d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f29106e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f29107f;

    /* renamed from: g, reason: collision with root package name */
    public final Rj f29108g;

    /* renamed from: h, reason: collision with root package name */
    public final C4622sk f29109h;

    /* renamed from: i, reason: collision with root package name */
    public final SPayTextView f29110i;

    /* renamed from: j, reason: collision with root package name */
    public final SPayTextView f29111j;

    /* renamed from: k, reason: collision with root package name */
    public final SPayTextView f29112k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatCheckBox f29113l;

    public H2(NestedScrollView nestedScrollView, SPayMaterialButton sPayMaterialButton, CardView cardView, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton2, RecyclerView recyclerView, Rj rj2, C4622sk c4622sk, SPayTextView sPayTextView2, SPayTextView sPayTextView3, SPayTextView sPayTextView4, AppCompatCheckBox appCompatCheckBox) {
        this.f29102a = nestedScrollView;
        this.f29103b = sPayMaterialButton;
        this.f29104c = cardView;
        this.f29105d = sPayTextView;
        this.f29106e = sPayMaterialButton2;
        this.f29107f = recyclerView;
        this.f29108g = rj2;
        this.f29109h = c4622sk;
        this.f29110i = sPayTextView2;
        this.f29111j = sPayTextView3;
        this.f29112k = sPayTextView4;
        this.f29113l = appCompatCheckBox;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f29102a;
    }
}
