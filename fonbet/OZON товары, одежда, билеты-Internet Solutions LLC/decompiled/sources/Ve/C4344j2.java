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
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/j2;", "LVe/Bc;", "LVe/g5;", "LVe/yl;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.j2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4344j2 extends Bc<C4261g5, C4794yl> {

    /* renamed from: d, reason: collision with root package name */
    public Dm f31338d;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4261g5) u()).e0(Kl.f29363a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((C4261g5) u()).e0(C4451mm.f31606a);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_card_selection, (ViewGroup) null, false);
        int i11 = R.id.spay_slcs_actv_order_sum;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slcs_actv_order_sum_old;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_slcs_actv_title;
                if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    int i12 = R.id.spay_slcs_rv_cards_list;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i12, inflate);
                    if (recyclerView != null) {
                        C4794yl c4794yl = new C4794yl(constraintLayout, sPayTextView, sPayTextView2, recyclerView);
                        Intrinsics.checkNotNullExpressionValue(c4794yl, "inflate(layoutInflater)");
                        return c4794yl;
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
        return C4261g5.class;
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
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C2406m0 c2406m0 = new C2406m0(((C4261g5) u()).f31085j);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new vr(this, bVar, c2406m0, null, (C4794yl) aVar, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4602s0(this, bVar, new C2406m0(((C4261g5) u()).f31086k), null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        Dm dm = new Dm(new C4251fo(((Boolean) ((C4261g5) u()).f31083h.getValue()).booleanValue(), new Y0(this)), new O6(C4435m6.f31567a), new Op(((Boolean) ((C4261g5) u()).f31083h.getValue()).booleanValue(), E1.f28895b));
        this.f31338d = dm;
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4794yl) aVar).f32599d.setAdapter(dm);
    }
}
