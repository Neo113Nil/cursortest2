package p154w;

import java.util.Iterator;
import p149v.a;
import p149v.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n {
    @Override // p154w.d
    public final void a(d dVar) {
        a aVar = (a) this.f17256b;
        int i7 = aVar.f16889w0;
        e eVar = this.f17262h;
        Iterator it = eVar.f17241l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((e) it.next()).f17237g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i7 == 0 || i7 == 2) {
            eVar.d(i9 + aVar.f16891y0);
        } else {
            eVar.d(i8 + aVar.f16891y0);
        }
    }

    @Override // p154w.n
    public final void d() {
        e eVar = this.f17256b;
        if (eVar instanceof a) {
            e eVar2 = this.f17262h;
            eVar2.f17232b = true;
            a aVar = (a) eVar;
            int i7 = aVar.f16889w0;
            boolean z4 = aVar.f16890x0;
            int i8 = 0;
            if (i7 == 0) {
                eVar2.f17235e = 4;
                while (i8 < aVar.f17062v0) {
                    e eVar3 = aVar.f17061u0[i8];
                    if (z4 || eVar3.f16965i0 != 8) {
                        e eVar4 = eVar3.f16954d.f17262h;
                        eVar4.f17240k.add(eVar2);
                        eVar2.f17241l.add(eVar4);
                    }
                    i8++;
                }
                m(this.f17256b.f16954d.f17262h);
                m(this.f17256b.f16954d.f17263i);
                return;
            }
            if (i7 == 1) {
                eVar2.f17235e = 5;
                while (i8 < aVar.f17062v0) {
                    e eVar5 = aVar.f17061u0[i8];
                    if (z4 || eVar5.f16965i0 != 8) {
                        e eVar6 = eVar5.f16954d.f17263i;
                        eVar6.f17240k.add(eVar2);
                        eVar2.f17241l.add(eVar6);
                    }
                    i8++;
                }
                m(this.f17256b.f16954d.f17262h);
                m(this.f17256b.f16954d.f17263i);
                return;
            }
            if (i7 == 2) {
                eVar2.f17235e = 6;
                while (i8 < aVar.f17062v0) {
                    e eVar7 = aVar.f17061u0[i8];
                    if (z4 || eVar7.f16965i0 != 8) {
                        e eVar8 = eVar7.f16956e.f17262h;
                        eVar8.f17240k.add(eVar2);
                        eVar2.f17241l.add(eVar8);
                    }
                    i8++;
                }
                m(this.f17256b.f16956e.f17262h);
                m(this.f17256b.f16956e.f17263i);
                return;
            }
            if (i7 != 3) {
                return;
            }
            eVar2.f17235e = 7;
            while (i8 < aVar.f17062v0) {
                e eVar9 = aVar.f17061u0[i8];
                if (z4 || eVar9.f16965i0 != 8) {
                    e eVar10 = eVar9.f16956e.f17263i;
                    eVar10.f17240k.add(eVar2);
                    eVar2.f17241l.add(eVar10);
                }
                i8++;
            }
            m(this.f17256b.f16956e.f17262h);
            m(this.f17256b.f16956e.f17263i);
        }
    }

    @Override // p154w.n
    public final void e() {
        e eVar = this.f17256b;
        if (eVar instanceof a) {
            int i7 = ((a) eVar).f16889w0;
            e eVar2 = this.f17262h;
            if (i7 == 0 || i7 == 1) {
                eVar.f16950a0 = eVar2.f17237g;
            } else {
                eVar.f16952b0 = eVar2.f17237g;
            }
        }
    }

    @Override // p154w.n
    public final void f() {
        this.f17257c = null;
        this.f17262h.c();
    }

    @Override // p154w.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f17262h;
        eVar2.f17240k.add(eVar);
        eVar.f17241l.add(eVar2);
    }
}
