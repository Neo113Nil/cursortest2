package Ve;

import Ae.C2406m0;
import Ax.ViewOnClickListenerC2451a;
import B1.C2548q;
import android.os.Bundle;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/n2;", "LVe/Bc;", "LVe/Y3;", "LVe/Zn;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.n2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4460n2 extends Bc<Y3, Zn> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((Y3) u()).f0(zr.f32685a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((Y3) u()).f0(C4284h.f31130a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        w();
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_deny_block, (ViewGroup) null, false);
        int i11 = R.id.spay_fdb_actv_message;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_fdb_actv_title;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_fdb_llc_container;
                if (((LinearLayoutCompat) C2548q.d(i11, inflate)) != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
                    int i12 = R.id.spay_fdb_mb_return_to_shop;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i12, inflate);
                    if (sPayMaterialButton != null) {
                        Zn zn = new Zn(linearLayoutCompat, sPayTextView, sPayTextView2, sPayMaterialButton);
                        Intrinsics.checkNotNullExpressionValue(zn, "inflate(layoutInflater)");
                        return zn;
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
        return Y3.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Zn) aVar).f30616d.setOnClickListener(new ViewOnClickListenerC2451a(this, 7));
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
        C2406m0 c2406m0 = new C2406m0(((Y3) u()).f30431g);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new I1(this, bVar, c2406m0, null, (Zn) aVar), 3);
    }
}
