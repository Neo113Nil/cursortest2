package sg.bigo.ads.w;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5182k1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5236h;
import sg.bigo.ads.i.C5241m;

/* loaded from: classes3.dex */
public final class o extends H2 implements b {
    public final InterfaceC5495a s0;
    public n t0;
    public C5236h u0;

    public o(Activity activity, InterfaceC5495a interfaceC5495a) {
        super(activity);
        this.s0 = interfaceC5495a;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final boolean D0() {
        return false;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        int T = T();
        return (T == 1 || T == 2 || T == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.G();
    }

    @Override // sg.bigo.ads.h.H2
    public final C5231c L0() {
        Pair a2;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null || (a2 = ((C5185l1) abstractC5163f0).a(this.l)) == null) {
            return null;
        }
        return (C5231c) a2.second;
    }

    @Override // sg.bigo.ads.h.H2
    public final C5241m N0() {
        Pair a2;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null || (a2 = ((C5185l1) abstractC5163f0).a(this.l)) == null) {
            return null;
        }
        return (C5241m) a2.first;
    }

    @Override // sg.bigo.ads.h.H2
    public final boolean Q0() {
        q qVar = this.t;
        if (qVar == null) {
            return false;
        }
        Integer a2 = z.a(qVar.a("endpage.companion_first"));
        return 1 == (a2 != null ? a2.intValue() : 0);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        super.R();
        n nVar = this.t0;
        if (nVar == null || nVar.b()) {
            return;
        }
        this.t0.d();
    }

    @Override // sg.bigo.ads.h.H2
    public final boolean R0() {
        return this.z.k == -2;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        n nVar = this.t0;
        if (nVar == null || !nVar.b()) {
            return;
        }
        this.t0.e();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final ValueCallback U() {
        return this.s0.j();
    }

    @Override // sg.bigo.ads.h.H2
    public final void U0() {
        if (this.e == null || l0()) {
            return;
        }
        C5185l1 c5185l1 = (C5185l1) this.e;
        sg.bigo.ads.C.l lVar = this.l;
        C5182k1 c5182k1 = c5185l1.Z;
        if (c5182k1 != null) {
            c5182k1.b(lVar);
        }
    }

    @Override // sg.bigo.ads.h.H2
    public final void a(InterfaceC5087a interfaceC5087a, boolean z, int i) {
        long j;
        if (z) {
            j = i == 0 ? 800L : i * 1000;
        } else {
            j = i * 1000;
            if (j == 0) {
                j = 500;
            }
        }
        m mVar = new m(this, j);
        this.T = mVar;
        mVar.e();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final int a0() {
        int i;
        Q1 q1 = this.z;
        if (q1 == null || (i = q1.o) <= 0) {
            return 5;
        }
        return i;
    }

    @Override // sg.bigo.ads.w.b
    public final View b() {
        Pair a2;
        FrameLayout frameLayout;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null && (a2 = ((C5185l1) abstractC5163f0).a(this.l)) != null) {
            C5241m c5241m = (C5241m) a2.first;
            if (c5241m.f12988a && c5241m.c() && !c5241m.b) {
                c5241m.a(1);
                return c5241m.p.o;
            }
            if (c5241m.f12988a && !c5241m.b && c5241m.h()) {
                Activity activity = this.f12687a;
                if (activity == null) {
                    frameLayout = null;
                } else {
                    C5236h c5236h = this.u0;
                    if (c5236h != null) {
                        c5236h.a();
                    }
                    frameLayout = new FrameLayout(activity);
                    frameLayout.setTag(19);
                    C5236h c5236h2 = new C5236h(c5241m);
                    this.u0 = c5236h2;
                    c5236h2.a(activity, frameLayout);
                }
                if (frameLayout != null) {
                    return frameLayout;
                }
            } else if (!c5241m.c()) {
                c5241m.p.b();
            }
            C5231c c5231c = (C5231c) a2.second;
            if (c5231c.f12978a && c5231c.c()) {
                c5231c.a(1);
                return c5231c.e();
            }
            if (!c5231c.c()) {
                c5231c.b();
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.w.b
    public final void d(int i) {
        InterfaceC5495a interfaceC5495a = this.s0;
        if (interfaceC5495a != null) {
            interfaceC5495a.c(i);
        }
    }

    @Override // sg.bigo.ads.w.b
    public final boolean e() {
        return f(true);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public final void f(int i) {
        super.f(i);
        if (this.z != null && this.m != null) {
            n nVar = new n(this, r6.c * 1000);
            this.t0 = nVar;
            nVar.e();
        }
        d(0);
        T0();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void i0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void j0() {
    }

    @Override // sg.bigo.ads.h.H2
    public final void o(int i) {
        if (l0()) {
            return;
        }
        super.o(i);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final boolean o0() {
        return false;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final void u0() {
        Q1 q1;
        int i;
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        if (!this.H.get()) {
            int i2 = this.z.k;
            if (i2 >= 0) {
                a(interfaceC5087a, false, i2);
                return;
            }
            return;
        }
        if (((sg.bigo.ads.U0.k) interfaceC5087a).V0 != null || (q1 = this.z) == null || (i = q1.n) < 0) {
            return;
        }
        a(interfaceC5087a, true, i);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        super.w();
        n nVar = this.t0;
        if (nVar != null) {
            nVar.a();
            this.t0 = null;
        }
        E e = this.T;
        if (e != null) {
            e.a();
            this.T = null;
        }
        C5236h c5236h = this.u0;
        if (c5236h != null) {
            c5236h.a();
            this.u0 = null;
        }
    }

    @Override // sg.bigo.ads.w.b
    public final void b(int i) {
        InterfaceC5495a interfaceC5495a = this.s0;
        if (interfaceC5495a != null) {
            interfaceC5495a.a(i, i == 11 ? 2 : 1);
        }
    }
}
