package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Uh;", "LVe/Bc;", "LVe/pf;", "LVe/an;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Uh extends Bc<C4531pf, C4106an> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_fake_bank, (ViewGroup) null, false);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
        int i11 = R.id.spay_slfb_tv_fake_bank_description;
        if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
            i11 = R.id.spay_slfb_tv_fake_bank_title;
            if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                C4106an c4106an = new C4106an(linearLayoutCompat);
                Intrinsics.checkNotNullExpressionValue(c4106an, "inflate(layoutInflater)");
                return c4106an;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4531pf.class;
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
        C2406m0 c2406m0 = new C2406m0(((C4531pf) u()).f31784f);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4677uh(this, AbstractC5434v.b.STARTED, c2406m0, null, this), 3);
    }
}
