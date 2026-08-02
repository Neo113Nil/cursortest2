package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.AbstractC5434v;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayDotsLoaderView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Cr;", "LVe/Bc;", "LVe/R5;", "LVe/jq;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Cr extends Bc<R5, C4368jq> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_loading, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.spay_sll_actv_local_session_id;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_sll_gl_vertical_middle;
            if (((Guideline) C2548q.d(i11, inflate)) != null) {
                i11 = R.id.spay_sll_group_spinner;
                Group group = (Group) C2548q.d(i11, inflate);
                if (group != null) {
                    i11 = R.id.spay_sll_lottie_spay_logo;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, inflate);
                    if (lottieAnimationView != null) {
                        i11 = R.id.spay_sll_sdlv_progress;
                        if (((SpayDotsLoaderView) C2548q.d(i11, inflate)) != null) {
                            i11 = R.id.spay_sll_tv_loading_text;
                            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                            if (sPayTextView2 != null) {
                                C4368jq c4368jq = new C4368jq(constraintLayout, sPayTextView, group, lottieAnimationView, sPayTextView2);
                                Intrinsics.checkNotNullExpressionValue(c4368jq, "inflate(layoutInflater)");
                                return c4368jq;
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
        return R5.class;
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
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C2406m0 c2406m0 = new C2406m0(((R5) u()).f29831k);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4541pp(this, bVar, c2406m0, null, this, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4110ar(this, bVar, ((R5) u()).f29829i, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        String string = requireContext().getString(R.string.spay_ic_sbpay_loading_lottie);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…_ic_sbpay_loading_lottie)");
        String a11 = C4515p.a(string);
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4368jq) aVar).f31399d.setAnimationFromJson(a11, null);
    }
}
