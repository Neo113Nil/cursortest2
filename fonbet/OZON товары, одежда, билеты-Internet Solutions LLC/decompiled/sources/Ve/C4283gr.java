package Ve;

import B1.C2548q;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/gr;", "LVe/Bc;", "LVe/k4;", "LVe/l3;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.gr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4283gr extends Bc<C4375k4, C4403l3> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_pay_binding_error, (ViewGroup) null, false);
        int i11 = R.id.spay_slpbine_actv_subtitle;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slpbine_actv_title;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_slpbine_lottie_failure;
                if (((LottieAnimationView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spay_slpbine_mb_close_button;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        i11 = R.id.spay_slpbine_mb_pay_other_button;
                        SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton2 != null) {
                            C4403l3 c4403l3 = new C4403l3((ConstraintLayout) inflate, sPayTextView, sPayTextView2, sPayMaterialButton, sPayMaterialButton2);
                            Intrinsics.checkNotNullExpressionValue(c4403l3, "inflate(layoutInflater)");
                            return c4403l3;
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
        return C4375k4.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4403l3) aVar).f31504e.setOnClickListener(new Il.a(this, 4));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((C4403l3) aVar2).f31503d.setOnClickListener(new Go.e(this, 3));
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
        Ae.M0 m02 = ((C4375k4) u()).f31418f;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Cq(this, AbstractC5434v.b.STARTED, m02, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4403l3 c4403l3 = (C4403l3) aVar;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("subTitle") : null;
        if (string == null) {
            string = "";
        }
        c4403l3.f31501b.setText(string);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
    }
}
