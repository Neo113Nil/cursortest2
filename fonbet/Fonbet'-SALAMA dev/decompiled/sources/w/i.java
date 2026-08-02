package w;

import java.util.Iterator;
import v.C1650a;
import v.C1654e;

/* loaded from: classes.dex */
public final class i extends n {
    @Override // w.InterfaceC1671d
    public final void a(InterfaceC1671d interfaceC1671d) {
        C1650a c1650a = (C1650a) this.f17250b;
        int i7 = c1650a.f16883w0;
        e eVar = this.f17256h;
        Iterator it = eVar.f17235l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((e) it.next()).f17231g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i7 == 0 || i7 == 2) {
            eVar.d(i9 + c1650a.f16885y0);
        } else {
            eVar.d(i8 + c1650a.f16885y0);
        }
    }

    @Override // w.n
    public final void d() {
        C1654e c1654e = this.f17250b;
        if (c1654e instanceof C1650a) {
            e eVar = this.f17256h;
            eVar.f17226b = true;
            C1650a c1650a = (C1650a) c1654e;
            int i7 = c1650a.f16883w0;
            boolean z4 = c1650a.f16884x0;
            int i8 = 0;
            if (i7 == 0) {
                eVar.f17229e = 4;
                while (i8 < c1650a.f17056v0) {
                    C1654e c1654e2 = c1650a.f17055u0[i8];
                    if (z4 || c1654e2.f16959i0 != 8) {
                        e eVar2 = c1654e2.f16948d.f17256h;
                        eVar2.f17234k.add(eVar);
                        eVar.f17235l.add(eVar2);
                    }
                    i8++;
                }
                m(this.f17250b.f16948d.f17256h);
                m(this.f17250b.f16948d.f17257i);
                return;
            }
            if (i7 == 1) {
                eVar.f17229e = 5;
                while (i8 < c1650a.f17056v0) {
                    C1654e c1654e3 = c1650a.f17055u0[i8];
                    if (z4 || c1654e3.f16959i0 != 8) {
                        e eVar3 = c1654e3.f16948d.f17257i;
                        eVar3.f17234k.add(eVar);
                        eVar.f17235l.add(eVar3);
                    }
                    i8++;
                }
                m(this.f17250b.f16948d.f17256h);
                m(this.f17250b.f16948d.f17257i);
                return;
            }
            if (i7 == 2) {
                eVar.f17229e = 6;
                while (i8 < c1650a.f17056v0) {
                    C1654e c1654e4 = c1650a.f17055u0[i8];
                    if (z4 || c1654e4.f16959i0 != 8) {
                        e eVar4 = c1654e4.f16950e.f17256h;
                        eVar4.f17234k.add(eVar);
                        eVar.f17235l.add(eVar4);
                    }
                    i8++;
                }
                m(this.f17250b.f16950e.f17256h);
                m(this.f17250b.f16950e.f17257i);
                return;
            }
            if (i7 != 3) {
                return;
            }
            eVar.f17229e = 7;
            while (i8 < c1650a.f17056v0) {
                C1654e c1654e5 = c1650a.f17055u0[i8];
                if (z4 || c1654e5.f16959i0 != 8) {
                    e eVar5 = c1654e5.f16950e.f17257i;
                    eVar5.f17234k.add(eVar);
                    eVar.f17235l.add(eVar5);
                }
                i8++;
            }
            m(this.f17250b.f16950e.f17256h);
            m(this.f17250b.f16950e.f17257i);
        }
    }

    @Override // w.n
    public final void e() {
        C1654e c1654e = this.f17250b;
        if (c1654e instanceof C1650a) {
            int i7 = ((C1650a) c1654e).f16883w0;
            e eVar = this.f17256h;
            if (i7 == 0 || i7 == 1) {
                c1654e.f16944a0 = eVar.f17231g;
            } else {
                c1654e.f16946b0 = eVar.f17231g;
            }
        }
    }

    @Override // w.n
    public final void f() {
        this.f17251c = null;
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
