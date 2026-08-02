package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Kd;", "LVe/Bc;", "LVe/Se;", "LVe/Oq;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Kd extends Bc<Se, Oq> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_logger, (ViewGroup) null, false);
        int i11 = R.id.logger_back_btn;
        CardView cardView = (CardView) C2548q.d(i11, inflate);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            int i12 = R.id.loggerScrollContainer;
            if (((NestedScrollView) C2548q.d(i12, inflate)) != null) {
                i12 = R.id.loggerTextView;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i12, inflate);
                if (sPayTextView != null) {
                    Oq oq = new Oq(constraintLayout, cardView, sPayTextView);
                    Intrinsics.checkNotNullExpressionValue(oq, "inflate(layoutInflater)");
                    return oq;
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return Se.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Oq) aVar).f29648b.setOnClickListener(new BQ.b(this, 4));
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
        C2406m0 c2406m0 = new C2406m0(((Se) u()).f29974g);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4269gd(this, AbstractC5434v.b.STARTED, c2406m0, null, this), 3);
    }
}
