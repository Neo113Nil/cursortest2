package P;

/* loaded from: classes.dex */
public final class Z implements a4.g, U0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Z f4430l = new Z(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Z f4431m = new Z(1);

    /* renamed from: n, reason: collision with root package name */
    public static final Z f4432n = new Z(2);

    /* renamed from: o, reason: collision with root package name */
    public static final Z f4433o = new Z(3);

    /* renamed from: p, reason: collision with root package name */
    public static final Z f4434p = new Z(4);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4435k;

    public /* synthetic */ Z(int i) {
        this.f4435k = i;
    }

    public static final void b(Z z3) {
        s4.M m5;
        Object obj;
        V.b bVar;
        s4.M m6 = F0.f4288x;
        do {
            m5 = F0.f4288x;
            obj = (S.b) m5.getValue();
            bVar = (V.b) obj;
            U.c cVar = bVar.f5920m;
            V.a aVar = (V.a) cVar.get(z3);
            if (aVar != null) {
                int hashCode = z3 != null ? z3.hashCode() : 0;
                U.n nVar = cVar.f5811k;
                U.n v4 = nVar.v(hashCode, z3, 0);
                if (nVar != v4) {
                    cVar = v4 == null ? U.c.f5810m : new U.c(v4, cVar.f5812l - 1);
                }
                W.b bVar2 = W.b.f5999a;
                Object obj2 = aVar.f5915a;
                boolean z5 = obj2 != bVar2;
                Object obj3 = aVar.f5916b;
                if (z5) {
                    Object obj4 = cVar.get(obj2);
                    kotlin.jvm.internal.l.c(obj4);
                    cVar = cVar.a(obj2, new V.a(((V.a) obj4).f5915a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    kotlin.jvm.internal.l.c(obj5);
                    cVar = cVar.a(obj3, new V.a(obj2, ((V.a) obj5).f5916b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f5918k : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f5919l;
                }
                bVar = new V.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = t4.c.f19596b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!m5.j(obj, bVar));
    }

    @Override // P.U0
    public boolean a(Object obj, Object obj2) {
        switch (this.f4435k) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f4435k) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
