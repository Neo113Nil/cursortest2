package Ve;

import Ae.C2406m0;
import B1.C2548q;
import Gw.ViewOnClickListenerC3131a;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/N5;", "LVe/Bc;", "LVe/u7;", "LVe/Co;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N5 extends Bc<C4667u7, Co> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4667u7) u()).f0(C4745x0.f32438a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((C4667u7) u()).f0(C4171d1.f30844a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_review_hint, (ViewGroup) null, false);
        int i11 = R.id.spay_frh_actv_hyperlink;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_frh_actv_message;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_frh_actv_title;
                SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView3 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
                    i11 = R.id.spay_frh_mb_cancel;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        i11 = R.id.spay_frh_mb_confirm;
                        SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton2 != null) {
                            Co co = new Co(linearLayoutCompat, sPayTextView, sPayTextView2, sPayTextView3, sPayMaterialButton, sPayMaterialButton2);
                            Intrinsics.checkNotNullExpressionValue(co, "inflate(layoutInflater)");
                            return co;
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
        return C4667u7.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        Co co = (Co) aVar;
        co.f28782f.setOnClickListener(new ViewOnClickListenerC3131a(this, 3));
        co.f28781e.setOnClickListener(new Am.b(this, 7));
        co.f28778b.setOnClickListener(new FK.a(this, 7));
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
        C2406m0 c2406m0 = new C2406m0(((C4667u7) u()).f32187g);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4405l5(this, bVar, c2406m0, null, (Co) aVar), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4720w3(this, bVar, new C2406m0(((C4667u7) u()).f32190j), null, this), 3);
    }
}
