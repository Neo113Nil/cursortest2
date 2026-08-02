package a4;

import S3.L;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471b implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final h f6646k;

    /* renamed from: l, reason: collision with root package name */
    public final f f6647l;

    public C0471b(f fVar, h hVar) {
        l.f("left", hVar);
        l.f("element", fVar);
        this.f6646k = hVar;
        this.f6647l = fVar;
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(this.f6646k.A(eVar, obj), this.f6647l);
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0471b) {
            C0471b c0471b = (C0471b) obj;
            c0471b.getClass();
            int i = 2;
            C0471b c0471b2 = c0471b;
            int i5 = 2;
            while (true) {
                h hVar = c0471b2.f6646k;
                c0471b2 = hVar instanceof C0471b ? (C0471b) hVar : null;
                if (c0471b2 == null) {
                    break;
                }
                i5++;
            }
            C0471b c0471b3 = this;
            while (true) {
                h hVar2 = c0471b3.f6646k;
                c0471b3 = hVar2 instanceof C0471b ? (C0471b) hVar2 : null;
                if (c0471b3 == null) {
                    break;
                }
                i++;
            }
            if (i5 == i) {
                C0471b c0471b4 = this;
                while (true) {
                    f fVar = c0471b4.f6647l;
                    if (!l.a(c0471b.l(fVar.getKey()), fVar)) {
                        z3 = false;
                        break;
                    }
                    h hVar3 = c0471b4.f6646k;
                    if (!(hVar3 instanceof C0471b)) {
                        l.d("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", hVar3);
                        f fVar2 = (f) hVar3;
                        z3 = l.a(c0471b.l(fVar2.getKey()), fVar2);
                        break;
                    }
                    c0471b4 = (C0471b) hVar3;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6647l.hashCode() + this.f6646k.hashCode();
    }

    @Override // a4.h
    public final f l(g gVar) {
        l.f("key", gVar);
        C0471b c0471b = this;
        while (true) {
            f l5 = c0471b.f6647l.l(gVar);
            if (l5 != null) {
                return l5;
            }
            h hVar = c0471b.f6646k;
            if (!(hVar instanceof C0471b)) {
                return hVar.l(gVar);
            }
            c0471b = (C0471b) hVar;
        }
    }

    @Override // a4.h
    public final h m(h hVar) {
        l.f("context", hVar);
        return hVar == i.f6649k ? this : (h) hVar.A(new L(6), this);
    }

    @Override // a4.h
    public final h r(g gVar) {
        l.f("key", gVar);
        f fVar = this.f6647l;
        f l5 = fVar.l(gVar);
        h hVar = this.f6646k;
        if (l5 != null) {
            return hVar;
        }
        h r5 = hVar.r(gVar);
        return r5 == hVar ? this : r5 == i.f6649k ? fVar : new C0471b(fVar, r5);
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("["), (String) A(new L(5), ""), ']');
    }
}
