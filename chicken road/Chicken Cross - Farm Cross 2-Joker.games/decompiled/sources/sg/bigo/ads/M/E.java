package sg.bigo.ads.M;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5236h;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.InterfaceC5257b;

/* loaded from: classes3.dex */
public final class E implements InterfaceC5003u {
    public C5241m b;
    public C5231c c;
    public final sg.bigo.ads.L.N d;
    public final int h;
    public C5236h i;

    /* renamed from: a, reason: collision with root package name */
    public int f12425a = 1;
    public boolean e = false;
    public int f = 1;
    public boolean g = false;

    public E(sg.bigo.ads.L.N n, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P.c cVar) {
        int i = 0;
        this.h = 0;
        this.d = n;
        sg.bigo.ads.C.l lVar = n.U;
        boolean z = lVar instanceof sg.bigo.ads.C.t;
        C5241m c5241m = new C5241m(lVar, pVar, cVar, z ? ((sg.bigo.ads.C.t) lVar).k0 : null, z ? ((sg.bigo.ads.C.t) lVar).l0 : null);
        this.b = c5241m;
        C5231c c5231c = new C5231c(c5241m.f12988a, lVar, pVar, cVar, z ? ((sg.bigo.ads.C.t) lVar).k0 : null, z ? ((sg.bigo.ads.C.t) lVar).l0 : null);
        this.c = c5231c;
        C5241m c5241m2 = this.b;
        boolean z2 = c5241m2.f12988a;
        if (z2) {
            i = 1;
        } else if (c5231c.f12978a) {
            i = 2;
        }
        this.h = i;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        bVar.E = i;
        bVar.F = (z2 || (c5231c.b instanceof C5252f)) ? 1 : 2;
        c5241m2.o = 1;
        C5241m c5241m3 = this.b;
        c5241m3.p.l = new D(n);
        c5241m3.a(n.k.f);
        C5231c c5231c2 = this.c;
        if (c5231c2 != null) {
            D d = new D(n);
            InterfaceC5257b interfaceC5257b = c5231c2.b;
            if (interfaceC5257b instanceof C5252f) {
                ((C5252f) interfaceC5257b).l = d;
            }
            C c = new C(n);
            if (interfaceC5257b instanceof sg.bigo.ads.j.l) {
                ((sg.bigo.ads.j.l) interfaceC5257b).k = c;
            }
            c5231c2.a(n.k.f);
        }
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z) {
        if (z) {
            if (this.g) {
                C5241m c5241m = this.b;
                if (c5241m != null) {
                    c5241m.p.d();
                    return;
                }
                return;
            }
            C5231c c5231c = this.c;
            if (c5231c != null) {
                c5231c.d();
                return;
            }
            return;
        }
        if (this.g) {
            C5241m c5241m2 = this.b;
            if (c5241m2 != null) {
                c5241m2.p.pause();
                return;
            }
            return;
        }
        C5231c c5231c2 = this.c;
        if (c5231c2 != null) {
            c5231c2.pause();
        }
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final int b() {
        throw null;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void d() {
        this.f12425a = 4;
        C5236h c5236h = this.i;
        if (c5236h != null) {
            c5236h.a();
            this.i = null;
        }
        C5241m c5241m = this.b;
        if (c5241m != null) {
            c5241m.a();
            this.b = null;
        }
        C5231c c5231c = this.c;
        if (c5231c != null) {
            c5231c.a();
            this.c = null;
        }
    }

    public final boolean e() {
        C5241m c5241m;
        C5231c c5231c;
        return f() || ((c5241m = this.b) != null && c5241m.f12988a && !c5241m.b && this.b.h()) || ((c5231c = this.c) != null && c5231c.f12978a && c5231c.c() && this.c.e() != null);
    }

    public final boolean f() {
        C5241m c5241m = this.b;
        return (c5241m == null || !c5241m.f12988a || !c5241m.c() || this.b.b || this.b.p.o == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    @Override // sg.bigo.ads.M.InterfaceC5003u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        int i2;
        this.f12425a = 2;
        if (this.f == 2) {
            viewGroup.removeViewAt(1);
        }
        if (f()) {
            this.b.f();
            View view = this.b.p.o;
            viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
            if (view != null) {
                view.setTag(19);
            }
            this.b.a(1);
            this.e = true;
            this.g = true;
        } else {
            C5241m c5241m = this.b;
            if (c5241m != null && c5241m.f12988a && !c5241m.b && this.b.h()) {
                if (this.b != null) {
                    Context context = viewGroup.getContext();
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setTag(19);
                    X.a(frameLayout, viewGroup, new FrameLayout.LayoutParams(-1, -1), 1);
                    C5236h c5236h = this.i;
                    if (c5236h != null) {
                        c5236h.a();
                    }
                    C5236h c5236h2 = new C5236h(this.b);
                    this.i = c5236h2;
                    c5236h2.a(context, frameLayout);
                }
                this.e = true;
                this.g = true;
            } else {
                View e = this.c.e();
                viewGroup.addView(e, 1, new FrameLayout.LayoutParams(-1, -1));
                if (e != null) {
                    e.setTag(20);
                }
                this.c.a(1);
                this.e = true;
                i2 = 7;
                int i3 = this.f != 2 ? 9 : 8;
                sg.bigo.ads.s1.b.a(this.d.U.e(), i2, i);
                this.d.U.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (ArrayList) null, i3, null);
            }
        }
        i2 = 5;
        if (this.f != 2) {
        }
        sg.bigo.ads.s1.b.a(this.d.U.e(), i2, i);
        this.d.U.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (ArrayList) null, i3, null);
    }
}
