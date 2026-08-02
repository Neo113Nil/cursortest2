package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/dm;", "LVe/Bc;", "LVe/D1;", "LVe/H2;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.dm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4192dm extends Bc<D1, H2> {
    @Override // Ve.Bc
    public final X4.a t() {
        View d11;
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_parts_order_bnpl, (ViewGroup) null, false);
        int i11 = R.id.spay_cancel_btn;
        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
        if (sPayMaterialButton != null) {
            i11 = R.id.spay_card_selection_button;
            CardView cardView = (CardView) C2548q.d(i11, inflate);
            if (cardView != null) {
                i11 = R.id.spay_commission;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView != null) {
                    i11 = R.id.spay_pay_parts_btn;
                    SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton2 != null) {
                        i11 = R.id.spay_payments_list;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, inflate);
                        if (recyclerView != null && (d11 = C2548q.d((i11 = R.id.spay_slo_include_compound_wallet), inflate)) != null) {
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
                                                i11 = R.id.spay_slob_actv_agreement_conditions;
                                                SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                                                if (sPayTextView2 != null) {
                                                    i11 = R.id.spay_slob_actv_header;
                                                    SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                                                    if (sPayTextView3 != null) {
                                                        i11 = R.id.spay_slob_actv_total;
                                                        SPayTextView sPayTextView4 = (SPayTextView) C2548q.d(i11, inflate);
                                                        if (sPayTextView4 != null) {
                                                            i11 = R.id.spay_slob_chck_agreement_conditions;
                                                            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C2548q.d(i11, inflate);
                                                            if (appCompatCheckBox != null) {
                                                                i11 = R.id.spay_slob_fl_total;
                                                                if (((FrameLayout) C2548q.d(i11, inflate)) != null) {
                                                                    i11 = R.id.spay_slob_root;
                                                                    if (((ConstraintLayout) C2548q.d(i11, inflate)) != null) {
                                                                        H2 h22 = new H2((NestedScrollView) inflate, sPayMaterialButton, cardView, sPayTextView, sPayMaterialButton2, recyclerView, a11, a12, sPayTextView2, sPayTextView3, sPayTextView4, appCompatCheckBox);
                                                                        Intrinsics.checkNotNullExpressionValue(h22, "inflate(layoutInflater)");
                                                                        return h22;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return D1.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        final H2 h22 = (H2) aVar;
        h22.f29106e.setOnClickListener(new AI.b(this, 12));
        h22.f29103b.setOnClickListener(new Dc0.j(this, 4));
        h22.f29104c.setOnClickListener(new CC.a(this, 5));
        h22.f29113l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ve.cm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                H2 this_with = H2.this;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                C4192dm this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this_with.f29106e.setEnabled(z11);
                ((D1) this$0.u()).e0(new C4624sm(z11));
            }
        });
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f28694c = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        H2 h22 = (H2) aVar;
        C2406m0 c2406m0 = new C2406m0(((D1) u()).f28809m);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4440mb(this, bVar, c2406m0, null, h22), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Wc(this, bVar, new C2406m0(((D1) u()).f28813q), null, h22), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new He(this, bVar, new C2406m0(((D1) u()).f28810n), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4329ig(this, bVar, new C2406m0(((D1) u()).f28814r), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Qh(this, bVar, new C2406m0(((D1) u()).f28812p), null, h22, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4708vj(this, bVar, ((D1) u()).f28806j, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4104al(this, bVar, ((D1) u()).f28807k, null, h22), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        w();
    }
}
