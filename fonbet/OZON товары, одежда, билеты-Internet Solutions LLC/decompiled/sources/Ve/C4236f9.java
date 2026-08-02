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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/f9;", "LVe/Bc;", "LVe/Na;", "LVe/yn;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.f9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4236f9 extends Bc<Na, C4796yn> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((Na) u()).f0(M5.f29460a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((Na) u()).f0(C4522p6.f31763a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_deny, (ViewGroup) null, false);
        int i11 = R.id.spay_fd_actv_message;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_fd_actv_title;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_fd_llc_container;
                if (((LinearLayoutCompat) C2548q.d(i11, inflate)) != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
                    int i12 = R.id.spay_fdb_mb_to_payment_methods;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i12, inflate);
                    if (sPayMaterialButton != null) {
                        C4796yn c4796yn = new C4796yn(linearLayoutCompat, sPayTextView, sPayTextView2, sPayMaterialButton);
                        Intrinsics.checkNotNullExpressionValue(c4796yn, "inflate(layoutInflater)");
                        return c4796yn;
                    }
                    i11 = i12;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return Na.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4796yn) aVar).f32608d.setOnClickListener(new BQ.b(this, 3));
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
        C2406m0 c2406m0 = new C2406m0(((Na) u()).f29547g);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new B8(this, bVar, c2406m0, null, (C4796yn) aVar), 3);
    }
}
