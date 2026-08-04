package p065i6;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14072b;

    public c(g gVar, i iVar) {
        h.e(iVar, RRWebVideoEvent.JsonKeys.LEFT);
        h.e(gVar, "element");
        this.f14071a = iVar;
        this.f14072b = gVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i7 = 2;
            c cVar2 = cVar;
            int i8 = 2;
            while (true) {
                i iVar = cVar2.f14071a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i8++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f14071a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 != i7) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f14072b;
                if (!h.a(cVar.get(gVar.getKey()), gVar)) {
                    zA = false;
                    break;
                }
                i iVar3 = cVar4.f14071a;
                if (!(iVar3 instanceof c)) {
                    h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    zA = h.a(cVar.get(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.f14071a.fold(obj, function2), this.f14072b);
    }

    @Override // p065i6.i
    public final g get(h hVar) {
        h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f14072b.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f14071a;
            if (!(iVar instanceof c)) {
                return iVar.get(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f14072b.hashCode() + this.f14071a.hashCode();
    }

    @Override // p065i6.i
    public final i minusKey(h hVar) {
        h.e(hVar, "key");
        g gVar = this.f14072b;
        g gVar2 = gVar.get(hVar);
        i iVar = this.f14071a;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(hVar);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.f14074a ? gVar : new c(gVar, iVarMinusKey);
    }

    @Override // p065i6.i
    public final i plus(i iVar) {
        h.e(iVar, "context");
        return iVar == j.f14074a ? this : (i) iVar.fold(this, new b(1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b(0))) + ']';
    }
}
