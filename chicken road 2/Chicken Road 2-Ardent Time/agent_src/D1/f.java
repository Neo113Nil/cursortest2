package D1;

/* loaded from: classes.dex */
public abstract class f implements D1.j {

    /* renamed from: a, reason: collision with root package name */
    public final k1.i f230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f231b;

    /* renamed from: c, reason: collision with root package name */
    public final int f232c;

    public f(k1.i iVar, int i2, int i3) {
        this.f230a = iVar;
        this.f231b = i2;
        this.f232c = i3;
    }

    public abstract java.lang.Object a(B1.r rVar, k1.d dVar);

    public abstract D1.f b(k1.i iVar, int i2, int i3);

    @Override // D1.j
    public final C1.d n(k1.i iVar, int i2, int i3) {
        k1.i iVar2 = this.f230a;
        k1.i g2 = iVar.g(iVar2);
        int i4 = this.f232c;
        int i5 = this.f231b;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (kotlin.jvm.internal.i.a(g2, iVar2) && i2 == i5 && i3 == i4) ? this : b(g2, i2, i3);
    }

    @Override // C1.d
    public java.lang.Object o(C1.e eVar, k1.d dVar) {
        D1.d dVar2 = new D1.d(eVar, this, null);
        E1.t tVar = new E1.t(dVar, dVar.getContext());
        java.lang.Object B2 = Q1.d.B(tVar, tVar, dVar2);
        return B2 == l1.EnumC0927a.f8017a ? B2 : h1.C0177i.f3302a;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        k1.j jVar = k1.j.f7951a;
        k1.i iVar = this.f230a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f231b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f232c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + i1.AbstractC0190i.Q(arrayList, ", ", null, null, null, 62) + ']';
    }
}
