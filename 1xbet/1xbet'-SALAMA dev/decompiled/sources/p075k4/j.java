package p075k4;

import Q0.a;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f14786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f14787d;

    public j(Object obj, Object obj2, h hVar, h hVar2) {
        this.f14784a = obj;
        this.f14785b = obj2;
        g gVar = g.f14783a;
        this.f14786c = hVar == null ? gVar : hVar;
        this.f14787d = hVar2 == null ? gVar : hVar2;
    }

    @Override // p075k4.h
    public final h a() {
        return this.f14786c;
    }

    @Override // p075k4.h
    public final h b(Object obj, Object obj2, Comparator comparator) {
        j jVarL;
        int iCompare = comparator.compare(obj, this.f14784a);
        if (iCompare < 0) {
            jVarL = l(null, null, this.f14786c.b(obj, obj2, comparator), null);
        } else {
            jVarL = iCompare == 0 ? l(obj, obj2, null, null) : l(null, null, null, this.f14787d.b(obj, obj2, comparator));
        }
        return jVarL.m();
    }

    @Override // p075k4.h
    public final void c(a aVar) {
        this.f14786c.c(aVar);
        aVar.c0(this.f14784a, this.f14785b);
        this.f14787d.c(aVar);
    }

    @Override // p075k4.h
    public final h d(Object obj, Comparator comparator) {
        j jVarL;
        if (comparator.compare(obj, this.f14784a) < 0) {
            j jVarO = (this.f14786c.isEmpty() || this.f14786c.e() || ((j) this.f14786c).f14786c.e()) ? this : o();
            jVarL = jVarO.l(null, null, jVarO.f14786c.d(obj, comparator), null);
        } else {
            j jVarQ = this.f14786c.e() ? q() : this;
            h hVar = jVarQ.f14787d;
            if (!hVar.isEmpty() && !hVar.e() && !((j) hVar).f14786c.e()) {
                jVarQ = jVarQ.j();
                if (jVarQ.f14786c.a().e()) {
                    jVarQ = jVarQ.q().j();
                }
            }
            if (comparator.compare(obj, jVarQ.f14784a) == 0) {
                h hVar2 = jVarQ.f14787d;
                if (hVar2.isEmpty()) {
                    return g.f14783a;
                }
                h hVarH = hVar2.h();
                jVarQ = jVarQ.l(hVarH.getKey(), hVarH.getValue(), null, ((j) hVar2).p());
            }
            jVarL = jVarQ.l(null, null, null, jVarQ.f14787d.d(obj, comparator));
        }
        return jVarL.m();
    }

    @Override // p075k4.h
    public final h g() {
        return this.f14787d;
    }

    @Override // p075k4.h
    public final Object getKey() {
        return this.f14784a;
    }

    @Override // p075k4.h
    public final Object getValue() {
        return this.f14785b;
    }

    @Override // p075k4.h
    public final h h() {
        return this.f14786c.isEmpty() ? this : this.f14786c.h();
    }

    @Override // p075k4.h
    public final h i() {
        h hVar = this.f14787d;
        return hVar.isEmpty() ? this : hVar.i();
    }

    @Override // p075k4.h
    public final boolean isEmpty() {
        return false;
    }

    public final j j() {
        h hVar = this.f14786c;
        h hVarF = hVar.f(hVar.e() ? 2 : 1, null, null);
        h hVar2 = this.f14787d;
        return f(e() ? 2 : 1, hVarF, hVar2.f(hVar2.e() ? 2 : 1, null, null));
    }

    @Override // p075k4.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final j f(int i7, h hVar, h hVar2) {
        if (hVar == null) {
            hVar = this.f14786c;
        }
        if (hVar2 == null) {
            hVar2 = this.f14787d;
        }
        Object obj = this.f14784a;
        Object obj2 = this.f14785b;
        return i7 == 1 ? new i(obj, obj2, hVar, hVar2) : new f(obj, obj2, hVar, hVar2);
    }

    public abstract j l(Object obj, Object obj2, h hVar, h hVar2);

    public final j m() {
        j jVarQ;
        h hVar = this.f14787d;
        if (!hVar.e() || this.f14786c.e()) {
            jVarQ = this;
        } else {
            jVarQ = (j) hVar.f(n(), f(1, null, ((j) hVar).f14786c), null);
        }
        if (jVarQ.f14786c.e() && ((j) jVarQ.f14786c).f14786c.e()) {
            jVarQ = jVarQ.q();
        }
        return (jVarQ.f14786c.e() && jVarQ.f14787d.e()) ? jVarQ.j() : jVarQ;
    }

    public abstract int n();

    public final j o() {
        j jVarJ = j();
        h hVar = jVarJ.f14787d;
        if (!hVar.a().e()) {
            return jVarJ;
        }
        j jVarL = jVarJ.l(null, null, null, ((j) hVar).q());
        h hVar2 = jVarL.f14787d;
        return ((j) hVar2.f(jVarL.n(), jVarL.f(1, null, ((j) hVar2).f14786c), null)).j();
    }

    public final h p() {
        if (this.f14786c.isEmpty()) {
            return g.f14783a;
        }
        j jVarO = (this.f14786c.e() || this.f14786c.a().e()) ? this : o();
        return jVarO.l(null, null, ((j) jVarO.f14786c).p(), null).m();
    }

    public final j q() {
        return (j) this.f14786c.f(n(), null, f(1, ((j) this.f14786c).f14787d, null));
    }

    public void r(j jVar) {
        this.f14786c = jVar;
    }
}
