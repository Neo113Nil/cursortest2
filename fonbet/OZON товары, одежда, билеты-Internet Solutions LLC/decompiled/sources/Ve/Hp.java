package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayUserDataCompositeView;

/* loaded from: classes10.dex */
public final class Hp implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29177a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f29178b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f29179c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f29180d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f29181e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f29182f;

    /* renamed from: g, reason: collision with root package name */
    public final SpayUserDataCompositeView f29183g;

    public Hp(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayMaterialButton sPayMaterialButton, RecyclerView recyclerView, RecyclerView recyclerView2, SpayUserDataCompositeView spayUserDataCompositeView) {
        this.f29177a = constraintLayout;
        this.f29178b = sPayTextView;
        this.f29179c = sPayTextView2;
        this.f29180d = sPayMaterialButton;
        this.f29181e = recyclerView;
        this.f29182f = recyclerView2;
        this.f29183g = spayUserDataCompositeView;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f29177a;
    }
}
