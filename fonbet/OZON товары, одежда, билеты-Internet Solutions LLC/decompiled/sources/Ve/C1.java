package Ve;

import Ae.C2406m0;
import B1.C2548q;
import Ez.ViewOnClickListenerC2979c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/C1;", "LVe/Bc;", "LVe/a9;", "LVe/x1;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C1 extends Bc<C4092a9, C4746x1> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4092a9) u()).e0(Kf.f29351a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((C4092a9) u()).e0(C4301hg.f31192a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_order_bnpl, (ViewGroup) null, false);
        int i11 = R.id.spay_commission;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_lob_mb_apply_payment_in_installments;
            SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
            if (sPayMaterialButton != null) {
                i11 = R.id.spay_lob_mb_decline_payment_in_installments;
                SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                if (sPayMaterialButton2 != null) {
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
                                            i11 = R.id.spay_slob_rv_bnpl_payment_count;
                                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, inflate);
                                            if (recyclerView != null) {
                                                C4746x1 c4746x1 = new C4746x1((NestedScrollView) inflate, sPayTextView, sPayMaterialButton, sPayMaterialButton2, sPayTextView2, sPayTextView3, sPayTextView4, appCompatCheckBox, recyclerView);
                                                Intrinsics.checkNotNullExpressionValue(c4746x1, "inflate(layoutInflater)");
                                                return c4746x1;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4092a9.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4746x1) aVar).f32441c.setOnClickListener(new ViewOnClickListenerC2979c(this, 7));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((C4746x1) aVar2).f32442d.setOnClickListener(new FM.a(this, 7));
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
        C2406m0 c2406m0 = new C2406m0(((C4092a9) u()).f30650h);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4679uj(this, bVar, c2406m0, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Zk(this, bVar, new C2406m0(((C4092a9) u()).f30653k), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Am(this, bVar, new C2406m0(((C4092a9) u()).f30651i), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4165co(this, bVar, new C2406m0(((C4092a9) u()).f30652j), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Mp(this, bVar, ((C4092a9) u()).f30649g, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4658tr(this, bVar, ((C4092a9) u()).f30654l, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4545q0(this, bVar, ((C4092a9) u()).f30655m, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4746x1) aVar).f32446h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ve.B1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C1 this$0 = C1.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4092a9) this$0.u()).e0(new C4504oh(z11));
                X4.a aVar2 = this$0.f28693b;
                if (aVar2 == null) {
                    throw M7.f29463a;
                }
                ((C4746x1) aVar2).f32441c.setEnabled(z11);
            }
        });
        w();
    }
}
