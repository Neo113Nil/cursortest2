package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/K4;", "LVe/Bc;", "LVe/q5;", "LVe/or;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K4 extends Bc<C4550q5, C4514or> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_no_card, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.spay_lnc_aciv_image;
        if (((AppCompatImageView) C2548q.d(i11, inflate)) != null) {
            i11 = R.id.spay_lnc_actv_content;
            if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                i11 = R.id.spay_lnc_actv_header;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView != null) {
                    i11 = R.id.spay_lnc_mb_cancel;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        C4514or c4514or = new C4514or(constraintLayout, sPayTextView, sPayMaterialButton);
                        Intrinsics.checkNotNullExpressionValue(c4514or, "inflate(layoutInflater)");
                        return c4514or;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4550q5.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4514or) aVar).f31752c.setOnClickListener(new HY.c(this, 4));
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
        Ae.M0 m02 = ((C4550q5) u()).f31842d;
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4231f4(this, bVar, m02, null, this), 3);
        C2406m0 c2406m0 = new C2406m0(((C4550q5) u()).f31843e);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new P1(this, bVar, c2406m0, null, (C4514or) aVar), 3);
    }
}
