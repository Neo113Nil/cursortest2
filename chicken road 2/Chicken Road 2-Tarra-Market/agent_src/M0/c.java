package M0;

import U0.p;
import a.AbstractC0009a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f223a;

    /* renamed from: b, reason: collision with root package name */
    public final g f224b;

    public c(g gVar, i left) {
        kotlin.jvm.internal.j.e(left, "left");
        this.f223a = left;
        this.f224b = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f223a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f223a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f224b;
                if (!kotlin.jvm.internal.j.a(cVar.i(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f223a;
                if (!(iVar3 instanceof c)) {
                    kotlin.jvm.internal.j.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = kotlin.jvm.internal.j.a(cVar.i(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    @Override // M0.i
    public final i g(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        g gVar = this.f224b;
        g i2 = gVar.i(key);
        i iVar = this.f223a;
        if (i2 != null) {
            return iVar;
        }
        i g2 = iVar.g(key);
        return g2 == iVar ? this : g2 == j.f226a ? gVar : new c(gVar, g2);
    }

    public final int hashCode() {
        return this.f224b.hashCode() + this.f223a.hashCode();
    }

    @Override // M0.i
    public final g i(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        c cVar = this;
        while (true) {
            g i2 = cVar.f224b.i(key);
            if (i2 != null) {
                return i2;
            }
            i iVar = cVar.f223a;
            if (!(iVar instanceof c)) {
                return iVar.i(key);
            }
            cVar = (c) iVar;
        }
    }

    @Override // M0.i
    public final Object j(Object obj, p pVar) {
        return pVar.invoke(this.f223a.j(obj, pVar), this.f224b);
    }

    @Override // M0.i
    public final i k(i iVar) {
        return AbstractC0009a.w(this, iVar);
    }

    public final String toString() {
        return "[" + ((String) j("", new b(0))) + ']';
    }
}
