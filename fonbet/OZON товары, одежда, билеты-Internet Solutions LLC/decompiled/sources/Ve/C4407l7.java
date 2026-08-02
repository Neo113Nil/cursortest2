package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayBonusOverallCompositeView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/l7;", "LVe/Ko;", "LVe/ca;", "LVe/k7;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.l7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4407l7 extends Ko<C4151ca, C4378k7> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_success_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.spay_slsp_actv_local_session_id;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slsp_actv_order_sum;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_slsp_actv_shop_name;
                SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView3 != null) {
                    i11 = R.id.spay_slsp_lottie_success;
                    if (((LottieAnimationView) C2548q.d(i11, inflate)) != null) {
                        i11 = R.id.spay_slsp_sbocv_bonus;
                        SpayBonusOverallCompositeView spayBonusOverallCompositeView = (SpayBonusOverallCompositeView) C2548q.d(i11, inflate);
                        if (spayBonusOverallCompositeView != null) {
                            i11 = R.id.spay_slsp_tv_close;
                            if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                                i11 = R.id.f151spay_slsp_v_btn_close;
                                CardView cardView = (CardView) C2548q.d(i11, inflate);
                                if (cardView != null) {
                                    C4378k7 c4378k7 = new C4378k7(constraintLayout, sPayTextView, sPayTextView2, sPayTextView3, spayBonusOverallCompositeView, cardView);
                                    Intrinsics.checkNotNullExpressionValue(c4378k7, "inflate(layoutInflater)");
                                    return c4378k7;
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
        return C4151ca.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4378k7) aVar).f31426f.setOnClickListener(new OD.a(this, 2));
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
        C4378k7 c4378k7 = (C4378k7) aVar;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C2406m0 c2406m0 = new C2406m0(((C4151ca) u()).f30788f);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4774y1(this, bVar, c2406m0, null, c4378k7, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4432m3(this, bVar, new C2406m0(((C4151ca) u()).f30789g), null, c4378k7, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4088a5(this, bVar, ((C4151ca) u()).f30790h, null, c4378k7), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new J6(this, bVar, ((C4151ca) u()).f31541e, null, c4378k7), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        MediaPlayer.create(context, R.raw.spay_success_payment_sound).start();
    }
}
