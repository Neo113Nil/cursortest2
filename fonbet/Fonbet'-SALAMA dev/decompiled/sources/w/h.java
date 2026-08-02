package w;

import v.C1654e;
import v.C1658i;

/* loaded from: classes.dex */
public final class h extends n {
    @Override // w.InterfaceC1671d
    public final void a(InterfaceC1671d interfaceC1671d) {
        e eVar = this.f17256h;
        if (eVar.f17227c && !eVar.j) {
            eVar.d((int) ((((e) eVar.f17235l.get(0)).f17231g * ((C1658i) this.f17250b).f17049u0) + 0.5f));
        }
    }

    @Override // w.n
    public final void d() {
        C1654e c1654e = this.f17250b;
        C1658i c1658i = (C1658i) c1654e;
        int i7 = c1658i.f17050v0;
        int i8 = c1658i.f17051w0;
        int i9 = c1658i.f17053y0;
        e eVar = this.f17256h;
        if (i9 == 1) {
            if (i7 != -1) {
                eVar.f17235l.add(c1654e.f16938V.f16948d.f17256h);
                this.f17250b.f16938V.f16948d.f17256h.f17234k.add(eVar);
                eVar.f17230f = i7;
            } else if (i8 != -1) {
                eVar.f17235l.add(c1654e.f16938V.f16948d.f17257i);
                this.f17250b.f16938V.f16948d.f17257i.f17234k.add(eVar);
                eVar.f17230f = -i8;
            } else {
                eVar.f17226b = true;
                eVar.f17235l.add(c1654e.f16938V.f16948d.f17257i);
                this.f17250b.f16938V.f16948d.f17257i.f17234k.add(eVar);
            }
            m(this.f17250b.f16948d.f17256h);
            m(this.f17250b.f16948d.f17257i);
            return;
        }
        if (i7 != -1) {
            eVar.f17235l.add(c1654e.f16938V.f16950e.f17256h);
            this.f17250b.f16938V.f16950e.f17256h.f17234k.add(eVar);
            eVar.f17230f = i7;
        } else if (i8 != -1) {
            eVar.f17235l.add(c1654e.f16938V.f16950e.f17257i);
            this.f17250b.f16938V.f16950e.f17257i.f17234k.add(eVar);
            eVar.f17230f = -i8;
        } else {
            eVar.f17226b = true;
            eVar.f17235l.add(c1654e.f16938V.f16950e.f17257i);
            this.f17250b.f16938V.f16950e.f17257i.f17234k.add(eVar);
        }
        m(this.f17250b.f16950e.f17256h);
        m(this.f17250b.f16950e.f17257i);
    }

    @Override // w.n
    public final void e() {
        C1654e c1654e = this.f17250b;
        int i7 = ((C1658i) c1654e).f17053y0;
        e eVar = this.f17256h;
        if (i7 == 1) {
            c1654e.f16944a0 = eVar.f17231g;
        } else {
            c1654e.f16946b0 = eVar.f17231g;
        }
    }

    @Override // w.n
    public final void f() {
        this.f17256h.c();
    }

    @Override // w.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f17256h;
        eVar2.f17234k.add(eVar);
        eVar.f17235l.add(eVar2);
    }
}
