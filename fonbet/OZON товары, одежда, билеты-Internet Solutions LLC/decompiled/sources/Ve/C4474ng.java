package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/ng;", "LVe/Bc;", "LVe/Vh;", "LVe/bp;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.ng, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4474ng extends Bc<Vh, C4137bp> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((Vh) u()).f0(C4125bd.f30729a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((Vh) u()).f0(Fd.f28995a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_review_otp, (ViewGroup) null, false);
        int i11 = R.id.spay_fro_actv_message;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_fro_actv_title;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
                i11 = R.id.spay_fro_mb_cancel;
                SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                if (sPayMaterialButton != null) {
                    i11 = R.id.spay_fro_mb_confirm;
                    SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton2 != null) {
                        C4137bp c4137bp = new C4137bp(linearLayoutCompat, sPayTextView, sPayTextView2, sPayMaterialButton, sPayMaterialButton2);
                        Intrinsics.checkNotNullExpressionValue(c4137bp, "inflate(layoutInflater)");
                        return c4137bp;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return Vh.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4137bp c4137bp = (C4137bp) aVar;
        c4137bp.f30749e.setOnClickListener(new DS.a(this, 9));
        c4137bp.f30748d.setOnClickListener(new BS.a(this, 7));
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
        C2406m0 c2406m0 = new C2406m0(((Vh) u()).f30205g);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Pf(this, AbstractC5434v.b.STARTED, c2406m0, null, this), 3);
    }
}
