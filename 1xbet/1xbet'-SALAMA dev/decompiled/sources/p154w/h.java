package p154w;

import p149v.e;
import p149v.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {
    @Override // p154w.d
    public final void a(d dVar) {
        e eVar = this.f17262h;
        if (eVar.f17233c && !eVar.j) {
            eVar.d((int) ((((e) eVar.f17241l.get(0)).f17237g * ((i) this.f17256b).f17055u0) + 0.5f));
        }
    }

    @Override // p154w.n
    public final void d() {
        e eVar = this.f17256b;
        i iVar = (i) eVar;
        int i7 = iVar.f17056v0;
        int i8 = iVar.f17057w0;
        int i9 = iVar.f17059y0;
        e eVar2 = this.f17262h;
        if (i9 == 1) {
            if (i7 != -1) {
                eVar2.f17241l.add(eVar.f16944V.f16954d.f17262h);
                this.f17256b.f16944V.f16954d.f17262h.f17240k.add(eVar2);
                eVar2.f17236f = i7;
            } else if (i8 != -1) {
                eVar2.f17241l.add(eVar.f16944V.f16954d.f17263i);
                this.f17256b.f16944V.f16954d.f17263i.f17240k.add(eVar2);
                eVar2.f17236f = -i8;
            } else {
                eVar2.f17232b = true;
                eVar2.f17241l.add(eVar.f16944V.f16954d.f17263i);
                this.f17256b.f16944V.f16954d.f17263i.f17240k.add(eVar2);
            }
            m(this.f17256b.f16954d.f17262h);
            m(this.f17256b.f16954d.f17263i);
            return;
        }
        if (i7 != -1) {
            eVar2.f17241l.add(eVar.f16944V.f16956e.f17262h);
            this.f17256b.f16944V.f16956e.f17262h.f17240k.add(eVar2);
            eVar2.f17236f = i7;
        } else if (i8 != -1) {
            eVar2.f17241l.add(eVar.f16944V.f16956e.f17263i);
            this.f17256b.f16944V.f16956e.f17263i.f17240k.add(eVar2);
            eVar2.f17236f = -i8;
        } else {
            eVar2.f17232b = true;
            eVar2.f17241l.add(eVar.f16944V.f16956e.f17263i);
            this.f17256b.f16944V.f16956e.f17263i.f17240k.add(eVar2);
        }
        m(this.f17256b.f16956e.f17262h);
        m(this.f17256b.f16956e.f17263i);
    }

    @Override // p154w.n
    public final void e() {
        e eVar = this.f17256b;
        int i7 = ((i) eVar).f17059y0;
        e eVar2 = this.f17262h;
        if (i7 == 1) {
            eVar.f16950a0 = eVar2.f17237g;
        } else {
            eVar.f16952b0 = eVar2.f17237g;
        }
    }

    @Override // p154w.n
    public final void f() {
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
