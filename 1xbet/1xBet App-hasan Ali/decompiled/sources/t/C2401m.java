package t;

import a.AbstractC0444a;
import java.util.ArrayList;
import java.util.List;
import x0.InterfaceC2632s;
import x0.O;
import x0.P;
import x0.Q;
import x0.Z;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2401m implements O {

    /* renamed from: a, reason: collision with root package name */
    public final r f19389a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19390b;

    public C2401m(r rVar) {
        this.f19389a = rVar;
    }

    @Override // x0.O
    public final int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x0.N) list.get(0)).U(i));
            int N5 = X3.n.N(list);
            int i5 = 1;
            if (1 <= N5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x0.N) list.get(i5)).U(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == N5) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // x0.O
    public final int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x0.N) list.get(0)).L(i));
            int N5 = X3.n.N(list);
            int i5 = 1;
            if (1 <= N5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x0.N) list.get(i5)).L(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == N5) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // x0.O
    public final P c(Q q5, List list, long j5) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((x0.N) list.get(i)).e(j5));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i5 = ((Z) obj).f20973k;
            int N5 = X3.n.N(arrayList);
            if (1 <= N5) {
                int i6 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i6);
                    int i7 = ((Z) obj3).f20973k;
                    if (i5 < i7) {
                        obj = obj3;
                        i5 = i7;
                    }
                    if (i6 == N5) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Z z3 = (Z) obj;
        int i8 = z3 != null ? z3.f20973k : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i9 = ((Z) obj2).f20974l;
            int N6 = X3.n.N(arrayList);
            if (1 <= N6) {
                int i10 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i10);
                    int i11 = ((Z) obj4).f20974l;
                    if (i9 < i11) {
                        obj2 = obj4;
                        i9 = i11;
                    }
                    if (i10 == N6) {
                        break;
                    }
                    i10++;
                }
            }
        }
        Z z5 = (Z) obj2;
        int i12 = z5 != null ? z5.f20974l : 0;
        boolean t5 = q5.t();
        r rVar = this.f19389a;
        if (t5) {
            this.f19390b = true;
            rVar.f19404a.setValue(new W0.l(AbstractC0444a.b(i8, i12)));
        } else if (!this.f19390b) {
            rVar.f19404a.setValue(new W0.l(AbstractC0444a.b(i8, i12)));
        }
        return q5.i(i8, i12, X3.w.f6091k, new I.J(3, arrayList));
    }

    @Override // x0.O
    public final int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x0.N) list.get(0)).f(i));
            int N5 = X3.n.N(list);
            int i5 = 1;
            if (1 <= N5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x0.N) list.get(i5)).f(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == N5) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // x0.O
    public final int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x0.N) list.get(0)).T(i));
            int N5 = X3.n.N(list);
            int i5 = 1;
            if (1 <= N5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x0.N) list.get(i5)).T(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == N5) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
