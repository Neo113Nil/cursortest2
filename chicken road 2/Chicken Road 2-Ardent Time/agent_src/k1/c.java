package k1;

/* loaded from: classes.dex */
public final class c implements k1.i, java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final k1.i f7948a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.g f7949b;

    public c(k1.i left, k1.g element) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f7948a = left;
        this.f7949b = element;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof k1.c)) {
                return false;
            }
            k1.c cVar = (k1.c) obj;
            cVar.getClass();
            int i2 = 2;
            k1.c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                k1.i iVar = cVar2.f7948a;
                cVar2 = iVar instanceof k1.c ? (k1.c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            k1.c cVar3 = this;
            while (true) {
                k1.i iVar2 = cVar3.f7948a;
                cVar3 = iVar2 instanceof k1.c ? (k1.c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            k1.c cVar4 = this;
            while (true) {
                k1.g gVar = cVar4.f7949b;
                if (!kotlin.jvm.internal.i.a(cVar.m(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                k1.i iVar3 = cVar4.f7948a;
                if (!(iVar3 instanceof k1.c)) {
                    kotlin.jvm.internal.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    k1.g gVar2 = (k1.g) iVar3;
                    z2 = kotlin.jvm.internal.i.a(cVar.m(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (k1.c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    @Override // k1.i
    public final k1.i g(k1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == k1.j.f7951a ? this : (k1.i) context.k(this, new k1.C0922b(1));
    }

    public final int hashCode() {
        return this.f7949b.hashCode() + this.f7948a.hashCode();
    }

    @Override // k1.i
    public final k1.i j(k1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        k1.g gVar = this.f7949b;
        k1.g m2 = gVar.m(key);
        k1.i iVar = this.f7948a;
        if (m2 != null) {
            return iVar;
        }
        k1.i j2 = iVar.j(key);
        return j2 == iVar ? this : j2 == k1.j.f7951a ? gVar : new k1.c(j2, gVar);
    }

    @Override // k1.i
    public final java.lang.Object k(java.lang.Object obj, s1.p pVar) {
        return pVar.invoke(this.f7948a.k(obj, pVar), this.f7949b);
    }

    @Override // k1.i
    public final k1.g m(k1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        k1.c cVar = this;
        while (true) {
            k1.g m2 = cVar.f7949b.m(key);
            if (m2 != null) {
                return m2;
            }
            k1.i iVar = cVar.f7948a;
            if (!(iVar instanceof k1.c)) {
                return iVar.m(key);
            }
            cVar = (k1.c) iVar;
        }
    }

    public final java.lang.String toString() {
        return "[" + ((java.lang.String) k("", new k1.C0922b(0))) + ']';
    }
}
