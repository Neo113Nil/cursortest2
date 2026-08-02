package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Hk;", "LVe/Bc;", "LVe/xb;", "LVe/D;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Hk extends Bc<C4756xb, D> {

    /* renamed from: d, reason: collision with root package name */
    public Sh f29164d;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4756xb) u()).e0(Md.f29470a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((C4756xb) u()).e0(C4587re.f31975a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_no_matching_cards, (ViewGroup) null, false);
        int i11 = R.id.spay_lnmc_aciv_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.spay_lnmc_actv_content;
            SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView != null) {
                i11 = R.id.spay_lnmc_actv_header;
                if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spay_lnmc_fl_container;
                    if (((LinearLayoutCompat) C2548q.d(i11, inflate)) != null) {
                        i11 = R.id.spay_lnmc_mb_cancel;
                        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton != null) {
                            i11 = R.id.spay_lnmc_mb_issue_card;
                            SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                            if (sPayMaterialButton2 != null) {
                                D d11 = new D((ConstraintLayout) inflate, appCompatImageView, sPayTextView, sPayMaterialButton, sPayMaterialButton2);
                                Intrinsics.checkNotNullExpressionValue(d11, "inflate(layoutInflater)");
                                return d11;
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
        return C4756xb.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        D d11 = (D) aVar;
        d11.f28797e.setOnClickListener(new DN.b(this, 5));
        d11.f28796d.setOnClickListener(new GI.c(this, 3));
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            Yj yj2 = c4792yj.f32584a;
            this.f28694c = (InterfaceC4436m7) yj2.f30484l.get();
            this.f29164d = yj2.a();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        D d11 = (D) aVar;
        C2406m0 c2406m0 = new C2406m0(((C4756xb) u()).f32479g);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4647tg(this, bVar, c2406m0, null, d11), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4159ci(this, bVar, new C2406m0(((C4756xb) u()).f32480h), null, d11, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4247fk(this, bVar, new C2406m0(((C4756xb) u()).f32482j), null, this), 3);
    }
}
