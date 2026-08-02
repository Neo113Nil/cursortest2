package t;

import a.AbstractC0444a;
import java.util.List;
import java.util.NoSuchElementException;
import l4.C2062d;
import x0.InterfaceC2632s;
import x0.O;
import x0.P;
import x0.Q;
import x0.Z;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2395g implements O {

    /* renamed from: a, reason: collision with root package name */
    public final C2400l f19377a;

    public C2395g(C2400l c2400l) {
        this.f19377a = c2400l;
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
        Z z3;
        Z z5;
        int i;
        int i5;
        int i6;
        int size = list.size();
        Z[] zArr = new Z[size];
        int size2 = list.size();
        long j6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            z3 = null;
            if (i8 >= size2) {
                break;
            }
            x0.N n5 = (x0.N) list.get(i8);
            Object k5 = n5.k();
            C2397i c2397i = k5 instanceof C2397i ? (C2397i) k5 : null;
            if (c2397i != null && ((Boolean) c2397i.f19378k.getValue()).booleanValue()) {
                Z e3 = n5.e(j5);
                long b3 = AbstractC0444a.b(e3.f20973k, e3.f20974l);
                zArr[i8] = e3;
                j6 = b3;
            }
            i8++;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            x0.N n6 = (x0.N) list.get(i9);
            if (zArr[i9] == null) {
                zArr[i9] = n6.e(j5);
            }
        }
        if (q5.t()) {
            i5 = (int) (j6 >> 32);
        } else {
            if (size == 0) {
                z5 = null;
            } else {
                z5 = zArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = z5 != null ? z5.f20973k : 0;
                    C2062d c2062d = new C2062d(1, i10, 1);
                    int i12 = c2062d.f17853m;
                    int i13 = c2062d.f17852l;
                    boolean z6 = i12 <= 0 ? 1 >= i13 : 1 <= i13;
                    int i14 = z6 ? 1 : i13;
                    while (z6) {
                        if (i14 != i13) {
                            i = i14 + i12;
                            z6 = z6;
                        } else {
                            if (!z6) {
                                throw new NoSuchElementException();
                            }
                            z6 = false;
                            i = i14;
                        }
                        Z z7 = zArr[i14];
                        int i15 = z7 != null ? z7.f20973k : 0;
                        if (i11 < i15) {
                            z5 = z7;
                            i14 = i;
                            i11 = i15;
                        } else {
                            i14 = i;
                        }
                    }
                }
            }
            i5 = z5 != null ? z5.f20973k : 0;
        }
        if (q5.t()) {
            i7 = (int) (4294967295L & j6);
        } else {
            if (size != 0) {
                z3 = zArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = z3 != null ? z3.f20974l : 0;
                    C2062d c2062d2 = new C2062d(1, i16, 1);
                    int i18 = c2062d2.f17853m;
                    int i19 = c2062d2.f17852l;
                    boolean z8 = i18 <= 0 ? 1 >= i19 : 1 <= i19;
                    int i20 = z8 ? 1 : i19;
                    while (z8) {
                        if (i20 != i19) {
                            i6 = i20 + i18;
                            z8 = z8;
                        } else {
                            if (!z8) {
                                throw new NoSuchElementException();
                            }
                            z8 = false;
                            i6 = i20;
                        }
                        Z z9 = zArr[i20];
                        int i21 = z9 != null ? z9.f20974l : 0;
                        i20 = i6;
                        if (i17 < i21) {
                            z3 = z9;
                            i17 = i21;
                        }
                    }
                }
            }
            if (z3 != null) {
                i7 = z3.f20974l;
            }
        }
        if (!q5.t()) {
            this.f19377a.f19387c.setValue(new W0.l(AbstractC0444a.b(i5, i7)));
        }
        return q5.i(i5, i7, X3.w.f6091k, new C2394f(zArr, this, i5, i7));
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
