package A0;

import P.C0327y;
import P.InterfaceC0319u;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import game.betting133.sports1xbet.R;

/* loaded from: classes.dex */
public final class K1 implements InterfaceC0319u, InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final F f315k;

    /* renamed from: l, reason: collision with root package name */
    public final C0327y f316l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.L f318n;

    /* renamed from: o, reason: collision with root package name */
    public X.d f319o = G0.f272a;

    public K1(F f, C0327y c0327y) {
        this.f315k = f;
        this.f316l = c0327y;
    }

    public final void a() {
        if (!this.f317m) {
            this.f317m = true;
            this.f315k.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.L l5 = this.f318n;
            if (l5 != null) {
                l5.k(this);
            }
        }
        this.f316l.l();
    }

    public final void c(i4.e eVar) {
        this.f315k.setOnViewTreeOwnersAvailable(new C0028g0(7, this, (X.d) eVar));
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        if (enumC0486o == EnumC0486o.ON_DESTROY) {
            a();
        } else {
            if (enumC0486o != EnumC0486o.ON_CREATE || this.f317m) {
                return;
            }
            c(this.f319o);
        }
    }
}
