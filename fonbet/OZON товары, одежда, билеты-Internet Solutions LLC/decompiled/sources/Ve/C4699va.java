package Ve;

import Ae.C2406m0;
import B1.C2548q;
import Gw.ViewOnClickListenerC3131a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.BnplButtonCompositeView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;
import spay.sdk.view.SpayBnplGraphCompositeView;
import spay.sdk.view.SpayBonusOverallCompositeView;
import spay.sdk.view.SpayUserDataCompositeView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/va;", "LVe/Bc;", "LVe/i4;", "LVe/S0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.va, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4699va extends Bc<C4318i4, S0> {

    /* renamed from: d, reason: collision with root package name */
    public Dm f32267d;

    /* renamed from: e, reason: collision with root package name */
    public C4665u5 f32268e;

    /* renamed from: f, reason: collision with root package name */
    public L8 f32269f;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4318i4) u()).f0(We.f30271a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        ((C4318i4) u()).f0(C4760xf.f32487a);
        super.onStop();
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View d11;
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_order, (ViewGroup) null, false);
        int i11 = R.id.spay_slo_acb_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) C2548q.d(i11, inflate);
        if (appCompatButton != null) {
            i11 = R.id.spay_slo_composite_btn_bnpl;
            BnplButtonCompositeView bnplButtonCompositeView = (BnplButtonCompositeView) C2548q.d(i11, inflate);
            if (bnplButtonCompositeView != null) {
                i11 = R.id.spay_slo_cv_card_selection_button;
                CardView cardView = (CardView) C2548q.d(i11, inflate);
                if (cardView != null && (d11 = C2548q.d((i11 = R.id.spay_slo_include_compound_wallet), inflate)) != null) {
                    Rj a11 = Rj.a(d11);
                    i11 = R.id.spay_slo_include_selected_card;
                    View d12 = C2548q.d(i11, inflate);
                    if (d12 != null) {
                        C4622sk a12 = C4622sk.a(d12);
                        i11 = R.id.spay_slo_inlude_no_card_error;
                        View d13 = C2548q.d(i11, inflate);
                        if (d13 != null) {
                            int i12 = R.id.spay_silnc_iv_alert_image;
                            if (((AppCompatImageView) C2548q.d(i12, d13)) != null) {
                                i12 = R.id.spay_silnc_tv_choose_another_way;
                                if (((SPayTextView) C2548q.d(i12, d13)) != null) {
                                    i12 = R.id.spay_silnc_tv_no_card_text;
                                    if (((SPayTextView) C2548q.d(i12, d13)) != null) {
                                        i11 = R.id.spay_slo_mb_pay;
                                        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                                        if (sPayMaterialButton != null) {
                                            i11 = R.id.spay_slo_root;
                                            if (((ConstraintLayout) C2548q.d(i11, inflate)) != null) {
                                                i11 = R.id.spay_slo_rv_amount;
                                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, inflate);
                                                if (recyclerView != null) {
                                                    i11 = R.id.spay_slo_rv_hint_helper;
                                                    RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, inflate);
                                                    if (recyclerView2 != null) {
                                                        i11 = R.id.spay_slo_sbgcv_graph;
                                                        SpayBnplGraphCompositeView spayBnplGraphCompositeView = (SpayBnplGraphCompositeView) C2548q.d(i11, inflate);
                                                        if (spayBnplGraphCompositeView != null) {
                                                            i11 = R.id.spay_slo_sbocv_bonus;
                                                            SpayBonusOverallCompositeView spayBonusOverallCompositeView = (SpayBonusOverallCompositeView) C2548q.d(i11, inflate);
                                                            if (spayBonusOverallCompositeView != null) {
                                                                i11 = R.id.spay_slo_sudcv_user_data;
                                                                SpayUserDataCompositeView spayUserDataCompositeView = (SpayUserDataCompositeView) C2548q.d(i11, inflate);
                                                                if (spayUserDataCompositeView != null) {
                                                                    i11 = R.id.spay_slo_tv_client_name;
                                                                    SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                                                                    if (sPayTextView != null) {
                                                                        i11 = R.id.spay_spasibo_btn;
                                                                        SpasiboBonusesButtonCompositeView spasiboBonusesButtonCompositeView = (SpasiboBonusesButtonCompositeView) C2548q.d(i11, inflate);
                                                                        if (spasiboBonusesButtonCompositeView != null) {
                                                                            S0 s02 = new S0((NestedScrollView) inflate, appCompatButton, bnplButtonCompositeView, cardView, a11, a12, sPayMaterialButton, recyclerView, recyclerView2, spayBnplGraphCompositeView, spayBonusOverallCompositeView, spayUserDataCompositeView, sPayTextView, spasiboBonusesButtonCompositeView);
                                                                            Intrinsics.checkNotNullExpressionValue(s02, "inflate(layoutInflater)");
                                                                            return s02;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(d13.getResources().getResourceName(i12)));
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
        return C4318i4.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((S0) aVar).f29931g.setOnClickListener(new ViewOnClickListenerC3131a(this, 4));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar2).f29926b.setOnClickListener(new Am.b(this, 8));
        X4.a aVar3 = this.f28693b;
        if (aVar3 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar3).f29927c.setOnClickListener(new FK.a(this, 8));
        X4.a aVar4 = this.f28693b;
        if (aVar4 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar4).f29928d.setOnClickListener(new AS.a(this, 9));
        X4.a aVar5 = this.f28693b;
        if (aVar5 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar5).f29938n.a(new C4676ug(this));
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
        S0 s02 = (S0) aVar;
        C2406m0 c2406m0 = new C2406m0(((C4318i4) u()).f31255r);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4510on(this, bVar, c2406m0, null, s02, requireContext, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Ro(this, bVar, ((C4318i4) u()).f31257t, null, s02), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4827zq(this, bVar, new C2406m0(((C4318i4) u()).f31254q), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new r(this, bVar, new C2406m0(((C4318i4) u()).f31258u), null, s02, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4401l1(this, bVar, new C2406m0(((C4318i4) u()).f31256s), null, s02), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4086a3(this, bVar, ((C4318i4) u()).f31261x, null, s02), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new N4(this, bVar, new C2406m0(((C4318i4) u()).f31260w), null, s02), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4751x6(this, bVar, new C2406m0(((C4318i4) u()).f31263z), null, s02, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4322i8(this, bVar, new Ei(new C2406m0(((C4318i4) u()).f31238B)), null, this, s02), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4479nl(this, bVar, ((C4318i4) u()).f31240D, null, s02, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Qm(this, bVar, ((C4318i4) u()).f31252o, null, s02), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        this.f32269f = new L8();
        this.f32267d = new Dm(new C4732wf(Ve.f30200a), new Od(C4384kd.f31437a));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        RecyclerView recyclerView = ((S0) aVar).f29932h;
        recyclerView.setLayoutManager(linearLayoutManager);
        Dm dm = this.f32267d;
        if (dm == null) {
            Intrinsics.n("amountAdapter");
            throw null;
        }
        recyclerView.setAdapter(dm);
        new C4394kn(new C4496o9(this)).attachToRecyclerView(recyclerView);
        C4665u5 c4665u5 = new C4665u5(new Jd(), new Q9(this));
        this.f32268e = c4665u5;
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar2).f29933i.setAdapter(c4665u5);
        w();
    }
}
