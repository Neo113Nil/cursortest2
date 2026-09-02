package Y;

import a.AbstractC0018a;
import f0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final i f407b;

    /* renamed from: c, reason: collision with root package name */
    public final g f408c;

    public c(g gVar, i iVar) {
        g0.h.e(iVar, "left");
        this.f407b = iVar;
        this.f408c = gVar;
    }

    @Override // Y.i
    public final Object c(Object obj, p pVar) {
        return pVar.g(this.f407b.c(obj, pVar), this.f408c);
    }

    @Override // Y.i
    public final g d(h hVar) {
        g0.h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g d2 = cVar.f408c.d(hVar);
            if (d2 != null) {
                return d2;
            }
            i iVar = cVar.f407b;
            if (!(iVar instanceof c)) {
                return iVar.d(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // Y.i
    public final i e(h hVar) {
        g0.h.e(hVar, "key");
        g gVar = this.f408c;
        g d2 = gVar.d(hVar);
        i iVar = this.f407b;
        if (d2 != null) {
            return iVar;
        }
        i e2 = iVar.e(hVar);
        return e2 == iVar ? this : e2 == j.f410b ? gVar : new c(gVar, e2);
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f407b;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f407b;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 == i2) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f408c;
                    if (!g0.h.a(cVar.d(gVar.getKey()), gVar)) {
                        z2 = false;
                        break;
                    }
                    i iVar3 = cVar4.f407b;
                    if (!(iVar3 instanceof c)) {
                        g0.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z2 = g0.h.a(cVar.d(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Y.i
    public final /* bridge */ i g(i iVar) {
        return AbstractC0018a.t(this, iVar);
    }

    public final int hashCode() {
        return this.f408c.hashCode() + this.f407b.hashCode();
    }

    public final String toString() {
        return "[" + ((String) c("", new b(0))) + ']';
    }
}
