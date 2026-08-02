package Ve;

import B1.C2548q;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/sa;", "LVe/Bc;", "LVe/A7;", "LVe/Rr;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.sa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4612sa extends Bc<A7, Rr> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_no_internet, (ViewGroup) null, false);
        int i11 = R.id.spaySlniActvSubtitle;
        if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
            i11 = R.id.spaySlniActvTitle;
            if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                i11 = R.id.spaySlniLottieFailure;
                if (((LottieAnimationView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spaySlniMbToPaymentMethodsButton;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        i11 = R.id.spaySlniMbTryAgainButton;
                        SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton2 != null) {
                            Rr rr = new Rr((ConstraintLayout) inflate, sPayMaterialButton, sPayMaterialButton2);
                            Intrinsics.checkNotNullExpressionValue(rr, "inflate(layoutInflater)");
                            return rr;
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
        return A7.class;
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f28694c = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
        }
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Rr) aVar).f29880c.setOnClickListener(new FG.a(this, 9));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((Rr) aVar2).f29879b.setOnClickListener(new BC.a(this, 4));
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
    }
}
