package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayUserDataCompositeView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/J4;", "LVe/Bc;", "LVe/N9;", "LVe/Hp;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class J4 extends Bc<N9, Hp> {

    /* renamed from: d, reason: collision with root package name */
    public C4665u5 f29265d;

    /* renamed from: e, reason: collision with root package name */
    public Dm f29266e;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((N9) u()).e0(C4102aj.f30678a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((N9) u()).e0(Ej.f28937a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_heplers, (ViewGroup) null, false);
        int i11 = R.id.spay_slh_actv_merchant_name;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slh_actv_order_amount;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                i11 = R.id.spay_slh_mb_cancel;
                SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                if (sPayMaterialButton != null) {
                    i11 = R.id.spay_slh_rv_helpers;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, inflate);
                    if (recyclerView != null) {
                        i11 = R.id.spay_slh_rv_hint_helper;
                        RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, inflate);
                        if (recyclerView2 != null) {
                            i11 = R.id.spay_slh_sudcv_user_data;
                            SpayUserDataCompositeView spayUserDataCompositeView = (SpayUserDataCompositeView) C2548q.d(i11, inflate);
                            if (spayUserDataCompositeView != null) {
                                Hp hp2 = new Hp(constraintLayout, sPayTextView, sPayTextView2, sPayMaterialButton, recyclerView, recyclerView2, spayUserDataCompositeView);
                                Intrinsics.checkNotNullExpressionValue(hp2, "inflate(layoutInflater)");
                                return hp2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return N9.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Hp) aVar).f29180d.setOnClickListener(new D90.c(this, 6));
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            Yj yj2 = c4792yj.f32584a;
            this.f28694c = (InterfaceC4436m7) yj2.f30484l.get();
            yj2.a();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C2406m0 c2406m0 = new C2406m0(((N9) u()).f29538j);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4480nm(this, bVar, c2406m0, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C0(this, bVar, new C2406m0(((N9) u()).f29542n), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Kn(this, bVar, new C2406m0(((N9) u()).f29540l), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4570qp(this, bVar, new C2406m0(((N9) u()).f29543o), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4139br(this, bVar, ((N9) u()).f29544p, null, (Hp) aVar, requireContext), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        int i11 = 1;
        int i12 = 0;
        C4665u5 c4665u5 = new C4665u5(new Jd(), new C4286h1(this, i12));
        this.f29265d = c4665u5;
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        RecyclerView recyclerView = ((Hp) aVar).f29182f;
        recyclerView.setAdapter(c4665u5);
        recyclerView.addOnItemTouchListener(new O1());
        Dm dm = new Dm(new C4298hd(new Ml0.e(this, i11)), new Ra(new X2(this, i12)), new C4528pc(new C4372k1(this, 1)));
        this.f29266e = dm;
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        RecyclerView recyclerView2 = ((Hp) aVar2).f29181e;
        recyclerView2.setAdapter(dm);
        Context context = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int i13 = R.dimen.spay_8dp;
        Intrinsics.checkNotNullParameter(context, "<this>");
        recyclerView2.addItemDecoration(new C4501oe(context.getResources().getDimensionPixelSize(i13)));
        new C4394kn(new C4202e4()).attachToRecyclerView(recyclerView2);
    }
}
