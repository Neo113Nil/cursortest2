package x1;

import android.text.InputFilter;
import n.C2111E;
import v.AbstractC2527w;
import v1.k;

/* loaded from: classes.dex */
public final class g extends AbstractC2527w {

    /* renamed from: a, reason: collision with root package name */
    public final f f21081a;

    public g(C2111E c2111e) {
        this.f21081a = new f(c2111e);
    }

    @Override // v.AbstractC2527w
    public final InputFilter[] d(InputFilter[] inputFilterArr) {
        return !k.d() ? inputFilterArr : this.f21081a.d(inputFilterArr);
    }

    @Override // v.AbstractC2527w
    public final void g(boolean z3) {
        if (k.d()) {
            this.f21081a.g(z3);
        }
    }

    @Override // v.AbstractC2527w
    public final void h(boolean z3) {
        boolean d5 = k.d();
        f fVar = this.f21081a;
        if (d5) {
            fVar.h(z3);
        } else {
            fVar.f21080c = z3;
        }
    }
}
