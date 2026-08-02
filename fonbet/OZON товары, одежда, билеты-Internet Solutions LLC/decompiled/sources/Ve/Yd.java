package Ve;

import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Yd;", "LVe/Ko;", "LVe/Ce;", "LVe/I6;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Yd extends Ko<Ce, I6> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_sdk_version_deprecated_error, (ViewGroup) null, false);
        int i11 = R.id.spay_slsvde_actv_to_payment_methods;
        if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
            i11 = R.id.spay_slsvde_cv_to_payment_methods;
            CardView cardView = (CardView) C2548q.d(i11, inflate);
            if (cardView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                int i12 = R.id.spay_slsvde_tv_otp_error;
                if (((SPayTextView) C2548q.d(i12, inflate)) != null) {
                    I6 i62 = new I6(frameLayout, cardView);
                    Intrinsics.checkNotNullExpressionValue(i62, "inflate(layoutInflater)");
                    return i62;
                }
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return Ce.class;
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
        CardView cardView = ((I6) aVar).f29217b;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.spaySlsvdeCvToPaymentMethods");
        cardView.setOnClickListener(new ViewOnClickListenerC4702vd(new kotlin.jvm.internal.L(), this));
    }
}
