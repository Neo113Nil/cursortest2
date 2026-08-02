package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.C1652c;
import v.C1654e;
import v.C1655f;
import v.C1658i;
import v.C1659j;
import v.EnumC1653d;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1669b f17237a = new C1669b();

    public static boolean a(C1654e c1654e) {
        EnumC1653d[] enumC1653dArr = c1654e.f16937U;
        EnumC1653d enumC1653d = enumC1653dArr[0];
        EnumC1653d enumC1653d2 = enumC1653dArr[1];
        C1654e c1654e2 = c1654e.f16938V;
        C1655f c1655f = c1654e2 != null ? (C1655f) c1654e2 : null;
        EnumC1653d enumC1653d3 = EnumC1653d.f16912a;
        if (c1655f != null) {
            EnumC1653d enumC1653d4 = c1655f.f16937U[0];
        }
        if (c1655f != null) {
            EnumC1653d enumC1653d5 = c1655f.f16937U[1];
        }
        EnumC1653d enumC1653d6 = EnumC1653d.f16914c;
        EnumC1653d enumC1653d7 = EnumC1653d.f16913b;
        boolean z4 = enumC1653d == enumC1653d3 || c1654e.B() || enumC1653d == enumC1653d7 || (enumC1653d == enumC1653d6 && c1654e.f16975r == 0 && c1654e.f16941Y == 0.0f && c1654e.u(0)) || (enumC1653d == enumC1653d6 && c1654e.f16975r == 1 && c1654e.v(0, c1654e.r()));
        boolean z7 = enumC1653d2 == enumC1653d3 || c1654e.C() || enumC1653d2 == enumC1653d7 || (enumC1653d2 == enumC1653d6 && c1654e.f16977s == 0 && c1654e.f16941Y == 0.0f && c1654e.u(1)) || (enumC1653d2 == enumC1653d6 && c1654e.f16977s == 1 && c1654e.v(1, c1654e.l()));
        if (c1654e.f16941Y <= 0.0f || !(z4 || z7)) {
            return z4 && z7;
        }
        return true;
    }

    public static m b(C1654e c1654e, int i7, ArrayList arrayList, m mVar) {
        int i8;
        int i9 = i7 == 0 ? c1654e.f16978s0 : c1654e.f16980t0;
        if (i9 != -1 && (mVar == null || i9 != mVar.f17245b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i10);
                if (mVar2.f17245b == i9) {
                    if (mVar != null) {
                        mVar.c(i7, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (c1654e instanceof C1659j) {
                C1659j c1659j = (C1659j) c1654e;
                int i11 = 0;
                while (true) {
                    if (i11 >= c1659j.f17056v0) {
                        i8 = -1;
                        break;
                    }
                    C1654e c1654e2 = c1659j.f17055u0[i11];
                    if ((i7 == 0 && (i8 = c1654e2.f16978s0) != -1) || (i7 == 1 && (i8 = c1654e2.f16980t0) != -1)) {
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        m mVar3 = (m) arrayList.get(i12);
                        if (mVar3.f17245b == i8) {
                            mVar = mVar3;
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f17244a = new ArrayList();
                mVar.f17247d = null;
                mVar.f17248e = -1;
                int i13 = m.f17243f;
                m.f17243f = i13 + 1;
                mVar.f17245b = i13;
                mVar.f17246c = i7;
            }
            arrayList.add(mVar);
        }
        ArrayList arrayList2 = mVar.f17244a;
        if (!arrayList2.contains(c1654e)) {
            arrayList2.add(c1654e);
            if (c1654e instanceof C1658i) {
                C1658i c1658i = (C1658i) c1654e;
                c1658i.f17052x0.c(c1658i.f17053y0 == 0 ? 1 : 0, arrayList, mVar);
            }
            int i14 = mVar.f17245b;
            if (i7 == 0) {
                c1654e.f16978s0 = i14;
                c1654e.f16926J.c(i7, arrayList, mVar);
                c1654e.f16928L.c(i7, arrayList, mVar);
            } else {
                c1654e.f16980t0 = i14;
                c1654e.f16927K.c(i7, arrayList, mVar);
                c1654e.f16930N.c(i7, arrayList, mVar);
                c1654e.f16929M.c(i7, arrayList, mVar);
            }
            c1654e.f16933Q.c(i7, arrayList, mVar);
        }
        return mVar;
    }

    public static void c(int i7, B.d dVar, C1654e c1654e, boolean z4) {
        C1652c c1652c;
        C1652c c1652c2;
        Iterator it;
        boolean z7;
        C1652c c1652c3;
        C1652c c1652c4;
        if (c1654e.f16965m) {
            return;
        }
        if (!(c1654e instanceof C1655f) && c1654e.A() && a(c1654e)) {
            C1655f.W(c1654e, dVar, new C1669b());
        }
        C1652c j = c1654e.j(2);
        C1652c j3 = c1654e.j(4);
        int d7 = j.d();
        int d8 = j3.d();
        HashSet hashSet = j.f16903a;
        EnumC1653d enumC1653d = EnumC1653d.f16914c;
        if (hashSet != null && j.f16905c) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C1652c c1652c5 = (C1652c) it2.next();
                C1654e c1654e2 = c1652c5.f16906d;
                int i8 = i7 + 1;
                boolean a2 = a(c1654e2);
                if (c1654e2.A() && a2) {
                    C1655f.W(c1654e2, dVar, new C1669b());
                }
                C1652c c1652c6 = c1654e2.f16926J;
                C1652c c1652c7 = c1654e2.f16928L;
                if ((c1652c5 == c1652c6 && (c1652c4 = c1652c7.f16908f) != null && c1652c4.f16905c) || (c1652c5 == c1652c7 && (c1652c3 = c1652c6.f16908f) != null && c1652c3.f16905c)) {
                    it = it2;
                    z7 = true;
                } else {
                    it = it2;
                    z7 = false;
                }
                EnumC1653d enumC1653d2 = c1654e2.f16937U[0];
                if (enumC1653d2 != enumC1653d || a2) {
                    if (!c1654e2.A()) {
                        if (c1652c5 == c1652c6 && c1652c7.f16908f == null) {
                            int e7 = c1652c6.e() + d7;
                            c1654e2.K(e7, c1654e2.r() + e7);
                            c(i8, dVar, c1654e2, z4);
                        } else if (c1652c5 == c1652c7 && c1652c6.f16908f == null) {
                            int e8 = d7 - c1652c7.e();
                            c1654e2.K(e8 - c1654e2.r(), e8);
                            c(i8, dVar, c1654e2, z4);
                        } else if (z7 && !c1654e2.y()) {
                            d(i8, dVar, c1654e2, z4);
                        }
                    }
                } else if (enumC1653d2 == enumC1653d && c1654e2.f16982v >= 0 && c1654e2.f16981u >= 0 && ((c1654e2.f16959i0 == 8 || (c1654e2.f16975r == 0 && c1654e2.f16941Y == 0.0f)) && !c1654e2.y() && !c1654e2.f16923G && z7 && !c1654e2.y())) {
                    e(i8, c1654e, dVar, c1654e2, z4);
                }
                it2 = it;
            }
        }
        if (c1654e instanceof C1658i) {
            return;
        }
        HashSet hashSet2 = j3.f16903a;
        if (hashSet2 != null && j3.f16905c) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1652c c1652c8 = (C1652c) it3.next();
                C1654e c1654e3 = c1652c8.f16906d;
                int i9 = i7 + 1;
                boolean a4 = a(c1654e3);
                if (c1654e3.A() && a4) {
                    C1655f.W(c1654e3, dVar, new C1669b());
                }
                C1652c c1652c9 = c1654e3.f16926J;
                C1652c c1652c10 = c1654e3.f16928L;
                boolean z8 = (c1652c8 == c1652c9 && (c1652c2 = c1652c10.f16908f) != null && c1652c2.f16905c) || (c1652c8 == c1652c10 && (c1652c = c1652c9.f16908f) != null && c1652c.f16905c);
                EnumC1653d enumC1653d3 = c1654e3.f16937U[0];
                if (enumC1653d3 != enumC1653d || a4) {
                    if (!c1654e3.A()) {
                        if (c1652c8 == c1652c9 && c1652c10.f16908f == null) {
                            int e9 = c1652c9.e() + d8;
                            c1654e3.K(e9, c1654e3.r() + e9);
                            c(i9, dVar, c1654e3, z4);
                        } else if (c1652c8 == c1652c10 && c1652c9.f16908f == null) {
                            int e10 = d8 - c1652c10.e();
                            c1654e3.K(e10 - c1654e3.r(), e10);
                            c(i9, dVar, c1654e3, z4);
                        } else if (z8 && !c1654e3.y()) {
                            d(i9, dVar, c1654e3, z4);
                        }
                    }
                } else if (enumC1653d3 == enumC1653d && c1654e3.f16982v >= 0 && c1654e3.f16981u >= 0) {
                    if (c1654e3.f16959i0 != 8) {
                        if (c1654e3.f16975r == 0) {
                            if (c1654e3.f16941Y == 0.0f) {
                            }
                        }
                    }
                    if (!c1654e3.y() && !c1654e3.f16923G && z8 && !c1654e3.y()) {
                        e(i9, c1654e, dVar, c1654e3, z4);
                    }
                }
            }
        }
        c1654e.f16965m = true;
    }

    public static void d(int i7, B.d dVar, C1654e c1654e, boolean z4) {
        float f7 = c1654e.f16953f0;
        C1652c c1652c = c1654e.f16926J;
        int d7 = c1652c.f16908f.d();
        C1652c c1652c2 = c1654e.f16928L;
        int d8 = c1652c2.f16908f.d();
        int e7 = c1652c.e() + d7;
        int e8 = d8 - c1652c2.e();
        if (d7 == d8) {
            f7 = 0.5f;
        } else {
            d7 = e7;
            d8 = e8;
        }
        int r7 = c1654e.r();
        int i8 = (d8 - d7) - r7;
        if (d7 > d8) {
            i8 = (d7 - d8) - r7;
        }
        int i9 = ((int) (i8 > 0 ? (f7 * i8) + 0.5f : f7 * i8)) + d7;
        int i10 = i9 + r7;
        if (d7 > d8) {
            i10 = i9 - r7;
        }
        c1654e.K(i9, i10);
        c(i7 + 1, dVar, c1654e, z4);
    }

    public static void e(int i7, C1654e c1654e, B.d dVar, C1654e c1654e2, boolean z4) {
        float f7 = c1654e2.f16953f0;
        C1652c c1652c = c1654e2.f16926J;
        int e7 = c1652c.e() + c1652c.f16908f.d();
        C1652c c1652c2 = c1654e2.f16928L;
        int d7 = c1652c2.f16908f.d() - c1652c2.e();
        if (d7 >= e7) {
            int r7 = c1654e2.r();
            if (c1654e2.f16959i0 != 8) {
                int i8 = c1654e2.f16975r;
                if (i8 == 2) {
                    r7 = (int) (c1654e2.f16953f0 * 0.5f * (c1654e instanceof C1655f ? c1654e.r() : c1654e.f16938V.r()));
                } else if (i8 == 0) {
                    r7 = d7 - e7;
                }
                r7 = Math.max(c1654e2.f16981u, r7);
                int i9 = c1654e2.f16982v;
                if (i9 > 0) {
                    r7 = Math.min(i9, r7);
                }
            }
            int i10 = e7 + ((int) ((f7 * ((d7 - e7) - r7)) + 0.5f));
            c1654e2.K(i10, r7 + i10);
            c(i7 + 1, dVar, c1654e2, z4);
        }
    }

    public static void f(int i7, B.d dVar, C1654e c1654e) {
        float f7 = c1654e.f16955g0;
        C1652c c1652c = c1654e.f16927K;
        int d7 = c1652c.f16908f.d();
        C1652c c1652c2 = c1654e.f16929M;
        int d8 = c1652c2.f16908f.d();
        int e7 = c1652c.e() + d7;
        int e8 = d8 - c1652c2.e();
        if (d7 == d8) {
            f7 = 0.5f;
        } else {
            d7 = e7;
            d8 = e8;
        }
        int l7 = c1654e.l();
        int i8 = (d8 - d7) - l7;
        if (d7 > d8) {
            i8 = (d7 - d8) - l7;
        }
        int i9 = (int) (i8 > 0 ? (f7 * i8) + 0.5f : f7 * i8);
        int i10 = d7 + i9;
        int i11 = i10 + l7;
        if (d7 > d8) {
            i10 = d7 - i9;
            i11 = i10 - l7;
        }
        c1654e.L(i10, i11);
        i(i7 + 1, dVar, c1654e);
    }

    public static void g(int i7, C1654e c1654e, B.d dVar, C1654e c1654e2) {
        float f7 = c1654e2.f16955g0;
        C1652c c1652c = c1654e2.f16927K;
        int e7 = c1652c.e() + c1652c.f16908f.d();
        C1652c c1652c2 = c1654e2.f16929M;
        int d7 = c1652c2.f16908f.d() - c1652c2.e();
        if (d7 >= e7) {
            int l7 = c1654e2.l();
            if (c1654e2.f16959i0 != 8) {
                int i8 = c1654e2.f16977s;
                if (i8 == 2) {
                    l7 = (int) (f7 * 0.5f * (c1654e instanceof C1655f ? c1654e.l() : c1654e.f16938V.l()));
                } else if (i8 == 0) {
                    l7 = d7 - e7;
                }
                l7 = Math.max(c1654e2.f16984x, l7);
                int i9 = c1654e2.f16985y;
                if (i9 > 0) {
                    l7 = Math.min(i9, l7);
                }
            }
            int i10 = e7 + ((int) ((f7 * ((d7 - e7) - l7)) + 0.5f));
            c1654e2.L(i10, l7 + i10);
            i(i7 + 1, dVar, c1654e2);
        }
    }

    public static boolean h(EnumC1653d enumC1653d, EnumC1653d enumC1653d2, EnumC1653d enumC1653d3, EnumC1653d enumC1653d4) {
        EnumC1653d enumC1653d5 = EnumC1653d.f16912a;
        EnumC1653d enumC1653d6 = EnumC1653d.f16915d;
        EnumC1653d enumC1653d7 = EnumC1653d.f16913b;
        return (enumC1653d3 == enumC1653d5 || enumC1653d3 == enumC1653d7 || (enumC1653d3 == enumC1653d6 && enumC1653d != enumC1653d7)) || (enumC1653d4 == enumC1653d5 || enumC1653d4 == enumC1653d7 || (enumC1653d4 == enumC1653d6 && enumC1653d2 != enumC1653d7));
    }

    public static void i(int i7, B.d dVar, C1654e c1654e) {
        C1652c c1652c;
        C1652c c1652c2;
        C1652c c1652c3;
        C1652c c1652c4;
        C1652c c1652c5;
        if (c1654e.f16967n) {
            return;
        }
        if (!(c1654e instanceof C1655f) && c1654e.A() && a(c1654e)) {
            C1655f.W(c1654e, dVar, new C1669b());
        }
        C1652c j = c1654e.j(3);
        C1652c j3 = c1654e.j(5);
        int d7 = j.d();
        int d8 = j3.d();
        HashSet hashSet = j.f16903a;
        EnumC1653d enumC1653d = EnumC1653d.f16914c;
        if (hashSet != null && j.f16905c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1652c c1652c6 = (C1652c) it.next();
                C1654e c1654e2 = c1652c6.f16906d;
                int i8 = i7 + 1;
                boolean a2 = a(c1654e2);
                if (c1654e2.A() && a2) {
                    C1655f.W(c1654e2, dVar, new C1669b());
                }
                C1652c c1652c7 = c1654e2.f16927K;
                C1652c c1652c8 = c1654e2.f16929M;
                boolean z4 = (c1652c6 == c1652c7 && (c1652c5 = c1652c8.f16908f) != null && c1652c5.f16905c) || (c1652c6 == c1652c8 && (c1652c4 = c1652c7.f16908f) != null && c1652c4.f16905c);
                EnumC1653d enumC1653d2 = c1654e2.f16937U[1];
                if (enumC1653d2 != enumC1653d || a2) {
                    if (!c1654e2.A()) {
                        if (c1652c6 == c1652c7 && c1652c8.f16908f == null) {
                            int e7 = c1652c7.e() + d7;
                            c1654e2.L(e7, c1654e2.l() + e7);
                            i(i8, dVar, c1654e2);
                        } else if (c1652c6 == c1652c8 && c1652c7.f16908f == null) {
                            int e8 = d7 - c1652c8.e();
                            c1654e2.L(e8 - c1654e2.l(), e8);
                            i(i8, dVar, c1654e2);
                        } else if (z4 && !c1654e2.z()) {
                            f(i8, dVar, c1654e2);
                        }
                    }
                } else if (enumC1653d2 == enumC1653d && c1654e2.f16985y >= 0 && c1654e2.f16984x >= 0 && (c1654e2.f16959i0 == 8 || (c1654e2.f16977s == 0 && c1654e2.f16941Y == 0.0f))) {
                    if (!c1654e2.z() && !c1654e2.f16923G && z4 && !c1654e2.z()) {
                        g(i8, c1654e, dVar, c1654e2);
                    }
                }
            }
        }
        if (c1654e instanceof C1658i) {
            return;
        }
        HashSet hashSet2 = j3.f16903a;
        if (hashSet2 != null && j3.f16905c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1652c c1652c9 = (C1652c) it2.next();
                C1654e c1654e3 = c1652c9.f16906d;
                int i9 = i7 + 1;
                boolean a4 = a(c1654e3);
                if (c1654e3.A() && a4) {
                    C1655f.W(c1654e3, dVar, new C1669b());
                }
                C1652c c1652c10 = c1654e3.f16927K;
                C1652c c1652c11 = c1654e3.f16929M;
                boolean z7 = (c1652c9 == c1652c10 && (c1652c3 = c1652c11.f16908f) != null && c1652c3.f16905c) || (c1652c9 == c1652c11 && (c1652c2 = c1652c10.f16908f) != null && c1652c2.f16905c);
                EnumC1653d enumC1653d3 = c1654e3.f16937U[1];
                if (enumC1653d3 != enumC1653d || a4) {
                    if (!c1654e3.A()) {
                        if (c1652c9 == c1652c10 && c1652c11.f16908f == null) {
                            int e9 = c1652c10.e() + d8;
                            c1654e3.L(e9, c1654e3.l() + e9);
                            i(i9, dVar, c1654e3);
                        } else if (c1652c9 == c1652c11 && c1652c10.f16908f == null) {
                            int e10 = d8 - c1652c11.e();
                            c1654e3.L(e10 - c1654e3.l(), e10);
                            i(i9, dVar, c1654e3);
                        } else if (z7 && !c1654e3.z()) {
                            f(i9, dVar, c1654e3);
                        }
                    }
                } else if (enumC1653d3 == enumC1653d && c1654e3.f16985y >= 0 && c1654e3.f16984x >= 0) {
                    if (c1654e3.f16959i0 != 8) {
                        if (c1654e3.f16977s == 0) {
                            if (c1654e3.f16941Y == 0.0f) {
                            }
                        }
                    }
                    if (!c1654e3.z() && !c1654e3.f16923G && z7 && !c1654e3.z()) {
                        g(i9, c1654e, dVar, c1654e3);
                    }
                }
            }
        }
        C1652c j7 = c1654e.j(6);
        if (j7.f16903a != null && j7.f16905c) {
            int d9 = j7.d();
            Iterator it3 = j7.f16903a.iterator();
            while (it3.hasNext()) {
                C1652c c1652c12 = (C1652c) it3.next();
                C1654e c1654e4 = c1652c12.f16906d;
                int i10 = i7 + 1;
                boolean a7 = a(c1654e4);
                if (c1654e4.A() && a7) {
                    C1655f.W(c1654e4, dVar, new C1669b());
                }
                if (c1654e4.f16937U[1] != enumC1653d || a7) {
                    if (!c1654e4.A() && c1652c12 == (c1652c = c1654e4.f16930N)) {
                        int e11 = c1652c12.e() + d9;
                        if (c1654e4.f16921E) {
                            int i11 = e11 - c1654e4.c0;
                            int i12 = c1654e4.f16940X + i11;
                            c1654e4.f16946b0 = i11;
                            c1654e4.f16927K.l(i11);
                            c1654e4.f16929M.l(i12);
                            c1652c.l(e11);
                            c1654e4.f16963l = true;
                        }
                        i(i10, dVar, c1654e4);
                    }
                }
            }
        }
        c1654e.f16967n = true;
    }
}
