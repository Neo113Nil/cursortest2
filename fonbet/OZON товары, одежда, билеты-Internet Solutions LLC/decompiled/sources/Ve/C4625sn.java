package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/sn;", "LVe/Ko;", "LVe/wo;", "LVe/E5;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.sn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4625sn extends Ko<C4741wo, E5> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_processing_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.spay_slpp_actv_processing_message;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slpp_actv_title;
            if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                i11 = R.id.spay_slpp_lottie_success;
                if (((LottieAnimationView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spay_slpp_mb_btn_close;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        E5 e52 = new E5(constraintLayout, sPayTextView, sPayMaterialButton);
                        Intrinsics.checkNotNullExpressionValue(e52, "inflate(layoutInflater)");
                        return e52;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4741wo.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((E5) aVar).f28907c.setOnClickListener(new D90.c(this, 7));
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
        C2406m0 c2406m0 = new C2406m0(((C4741wo) u()).f32387f);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Um(this, AbstractC5434v.b.STARTED, c2406m0, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        w();
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        MediaPlayer.create(context, R.raw.spay_processing_payment_sound).start();
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        String string = requireContext().getString(R.string.spay_processing_payment_text);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…_processing_payment_text)");
        ((E5) aVar).f28906b.setText(C4515p.a(string));
    }
}
