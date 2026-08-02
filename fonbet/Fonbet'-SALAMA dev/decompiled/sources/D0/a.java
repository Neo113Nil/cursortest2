package D0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.C1652c;
import v.C1654e;
import v.C1655f;
import v.C1658i;
import v.C1659j;
import v.EnumC1653d;
import w.C1668a;
import w.C1669b;
import w.C1670c;
import w.InterfaceC1671d;
import w.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1617a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1618b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1619c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1620d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1621e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1622f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1623g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1624h;

    public void a(w.e eVar, int i7, ArrayList arrayList, w.k kVar) {
        n nVar = eVar.f17228d;
        if (nVar.f17251c == null) {
            C1655f c1655f = (C1655f) this.f1619c;
            if (nVar == c1655f.f16948d || nVar == c1655f.f16950e) {
                return;
            }
            if (kVar == null) {
                kVar = new w.k();
                kVar.f17239a = null;
                kVar.f17240b = new ArrayList();
                kVar.f17239a = nVar;
                arrayList.add(kVar);
            }
            nVar.f17251c = kVar;
            kVar.f17240b.add(nVar);
            w.e eVar2 = nVar.f17256h;
            Iterator it = eVar2.f17234k.iterator();
            while (it.hasNext()) {
                InterfaceC1671d interfaceC1671d = (InterfaceC1671d) it.next();
                if (interfaceC1671d instanceof w.e) {
                    a((w.e) interfaceC1671d, i7, arrayList, kVar);
                }
            }
            w.e eVar3 = nVar.f17257i;
            Iterator it2 = eVar3.f17234k.iterator();
            while (it2.hasNext()) {
                InterfaceC1671d interfaceC1671d2 = (InterfaceC1671d) it2.next();
                if (interfaceC1671d2 instanceof w.e) {
                    a((w.e) interfaceC1671d2, i7, arrayList, kVar);
                }
            }
            if (i7 == 1 && (nVar instanceof w.l)) {
                Iterator it3 = ((w.l) nVar).f17241k.f17234k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1671d interfaceC1671d3 = (InterfaceC1671d) it3.next();
                    if (interfaceC1671d3 instanceof w.e) {
                        a((w.e) interfaceC1671d3, i7, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = eVar2.f17235l.iterator();
            while (it4.hasNext()) {
                a((w.e) it4.next(), i7, arrayList, kVar);
            }
            Iterator it5 = eVar3.f17235l.iterator();
            while (it5.hasNext()) {
                a((w.e) it5.next(), i7, arrayList, kVar);
            }
            if (i7 == 1 && (nVar instanceof w.l)) {
                Iterator it6 = ((w.l) nVar).f17241k.f17235l.iterator();
                while (it6.hasNext()) {
                    a((w.e) it6.next(), i7, arrayList, kVar);
                }
            }
        }
    }

    public void b(C1655f c1655f) {
        int i7;
        int i8;
        EnumC1653d enumC1653d;
        Iterator it = c1655f.f17003u0.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            EnumC1653d[] enumC1653dArr = c1654e.f16937U;
            EnumC1653d enumC1653d2 = enumC1653dArr[0];
            EnumC1653d enumC1653d3 = enumC1653dArr[1];
            if (c1654e.f16959i0 == 8) {
                c1654e.f16943a = true;
            } else {
                float f7 = c1654e.f16983w;
                EnumC1653d enumC1653d4 = EnumC1653d.f16914c;
                if (f7 < 1.0f && enumC1653d2 == enumC1653d4) {
                    c1654e.f16975r = 2;
                }
                float f8 = c1654e.f16986z;
                if (f8 < 1.0f && enumC1653d3 == enumC1653d4) {
                    c1654e.f16977s = 2;
                }
                float f9 = c1654e.f16941Y;
                EnumC1653d enumC1653d5 = EnumC1653d.f16913b;
                EnumC1653d enumC1653d6 = EnumC1653d.f16912a;
                if (f9 > 0.0f) {
                    if (enumC1653d2 == enumC1653d4 && (enumC1653d3 == enumC1653d5 || enumC1653d3 == enumC1653d6)) {
                        c1654e.f16975r = 3;
                    } else if (enumC1653d3 == enumC1653d4 && (enumC1653d2 == enumC1653d5 || enumC1653d2 == enumC1653d6)) {
                        c1654e.f16977s = 3;
                    } else if (enumC1653d2 == enumC1653d4 && enumC1653d3 == enumC1653d4) {
                        if (c1654e.f16975r == 0) {
                            c1654e.f16975r = 3;
                        }
                        if (c1654e.f16977s == 0) {
                            c1654e.f16977s = 3;
                        }
                    }
                }
                C1652c c1652c = c1654e.f16928L;
                C1652c c1652c2 = c1654e.f16926J;
                if (enumC1653d2 == enumC1653d4 && c1654e.f16975r == 1 && (c1652c2.f16908f == null || c1652c.f16908f == null)) {
                    enumC1653d2 = enumC1653d5;
                }
                C1652c c1652c3 = c1654e.f16929M;
                C1652c c1652c4 = c1654e.f16927K;
                EnumC1653d enumC1653d7 = (enumC1653d3 == enumC1653d4 && c1654e.f16977s == 1 && (c1652c4.f16908f == null || c1652c3.f16908f == null)) ? enumC1653d5 : enumC1653d3;
                w.j jVar = c1654e.f16948d;
                jVar.f17252d = enumC1653d2;
                int i9 = c1654e.f16975r;
                jVar.f17249a = i9;
                w.l lVar = c1654e.f16950e;
                lVar.f17252d = enumC1653d7;
                Iterator it2 = it;
                int i10 = c1654e.f16977s;
                lVar.f17249a = i10;
                EnumC1653d enumC1653d8 = EnumC1653d.f16915d;
                if ((enumC1653d2 == enumC1653d8 || enumC1653d2 == enumC1653d6 || enumC1653d2 == enumC1653d5) && (enumC1653d7 == enumC1653d8 || enumC1653d7 == enumC1653d6 || enumC1653d7 == enumC1653d5)) {
                    int r7 = c1654e.r();
                    if (enumC1653d2 == enumC1653d8) {
                        i7 = (c1655f.r() - c1652c2.f16909g) - c1652c.f16909g;
                        enumC1653d2 = enumC1653d6;
                    } else {
                        i7 = r7;
                    }
                    int l7 = c1654e.l();
                    if (enumC1653d7 == enumC1653d8) {
                        i8 = (c1655f.l() - c1652c4.f16909g) - c1652c3.f16909g;
                        enumC1653d = enumC1653d6;
                    } else {
                        i8 = l7;
                        enumC1653d = enumC1653d7;
                    }
                    f(c1654e, enumC1653d2, i7, enumC1653d, i8);
                    c1654e.f16948d.f17253e.d(c1654e.r());
                    c1654e.f16950e.f17253e.d(c1654e.l());
                    c1654e.f16943a = true;
                } else {
                    C1652c[] c1652cArr = c1654e.f16934R;
                    if (enumC1653d2 == enumC1653d4 && (enumC1653d7 == enumC1653d5 || enumC1653d7 == enumC1653d6)) {
                        if (i9 == 3) {
                            if (enumC1653d7 == enumC1653d5) {
                                f(c1654e, enumC1653d5, 0, enumC1653d5, 0);
                            }
                            int l8 = c1654e.l();
                            f(c1654e, enumC1653d6, (int) ((l8 * c1654e.f16941Y) + 0.5f), enumC1653d6, l8);
                            c1654e.f16948d.f17253e.d(c1654e.r());
                            c1654e.f16950e.f17253e.d(c1654e.l());
                            c1654e.f16943a = true;
                        } else if (i9 == 1) {
                            f(c1654e, enumC1653d5, 0, enumC1653d7, 0);
                            c1654e.f16948d.f17253e.f17236m = c1654e.r();
                        } else if (i9 == 2) {
                            EnumC1653d enumC1653d9 = c1655f.f16937U[0];
                            if (enumC1653d9 == enumC1653d6 || enumC1653d9 == enumC1653d8) {
                                f(c1654e, enumC1653d6, (int) ((f7 * c1655f.r()) + 0.5f), enumC1653d7, c1654e.l());
                                c1654e.f16948d.f17253e.d(c1654e.r());
                                c1654e.f16950e.f17253e.d(c1654e.l());
                                c1654e.f16943a = true;
                            }
                        } else if (c1652cArr[0].f16908f == null || c1652cArr[1].f16908f == null) {
                            f(c1654e, enumC1653d5, 0, enumC1653d7, 0);
                            c1654e.f16948d.f17253e.d(c1654e.r());
                            c1654e.f16950e.f17253e.d(c1654e.l());
                            c1654e.f16943a = true;
                        }
                    }
                    if (enumC1653d7 == enumC1653d4 && (enumC1653d2 == enumC1653d5 || enumC1653d2 == enumC1653d6)) {
                        if (i10 == 3) {
                            if (enumC1653d2 == enumC1653d5) {
                                f(c1654e, enumC1653d5, 0, enumC1653d5, 0);
                            }
                            int r8 = c1654e.r();
                            float f10 = c1654e.f16941Y;
                            if (c1654e.f16942Z == -1) {
                                f10 = 1.0f / f10;
                            }
                            f(c1654e, enumC1653d6, r8, enumC1653d6, (int) ((r8 * f10) + 0.5f));
                            c1654e.f16948d.f17253e.d(c1654e.r());
                            c1654e.f16950e.f17253e.d(c1654e.l());
                            c1654e.f16943a = true;
                        } else if (i10 == 1) {
                            f(c1654e, enumC1653d2, 0, enumC1653d5, 0);
                            c1654e.f16950e.f17253e.f17236m = c1654e.l();
                        } else if (i10 == 2) {
                            EnumC1653d enumC1653d10 = c1655f.f16937U[1];
                            if (enumC1653d10 == enumC1653d6 || enumC1653d10 == enumC1653d8) {
                                f(c1654e, enumC1653d2, c1654e.r(), enumC1653d6, (int) ((f8 * c1655f.l()) + 0.5f));
                                c1654e.f16948d.f17253e.d(c1654e.r());
                                c1654e.f16950e.f17253e.d(c1654e.l());
                                c1654e.f16943a = true;
                            }
                        } else if (c1652cArr[2].f16908f == null || c1652cArr[3].f16908f == null) {
                            f(c1654e, enumC1653d5, 0, enumC1653d7, 0);
                            c1654e.f16948d.f17253e.d(c1654e.r());
                            c1654e.f16950e.f17253e.d(c1654e.l());
                            c1654e.f16943a = true;
                        }
                    }
                    if (enumC1653d2 == enumC1653d4 && enumC1653d7 == enumC1653d4) {
                        if (i9 == 1 || i10 == 1) {
                            f(c1654e, enumC1653d5, 0, enumC1653d5, 0);
                            c1654e.f16948d.f17253e.f17236m = c1654e.r();
                            c1654e.f16950e.f17253e.f17236m = c1654e.l();
                        } else if (i10 == 2 && i9 == 2) {
                            EnumC1653d[] enumC1653dArr2 = c1655f.f16937U;
                            if (enumC1653dArr2[0] == enumC1653d6 && enumC1653dArr2[1] == enumC1653d6) {
                                f(c1654e, enumC1653d6, (int) ((f7 * c1655f.r()) + 0.5f), enumC1653d6, (int) ((f8 * c1655f.l()) + 0.5f));
                                c1654e.f16948d.f17253e.d(c1654e.r());
                                c1654e.f16950e.f17253e.d(c1654e.l());
                                c1654e.f16943a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f1621e;
        arrayList.clear();
        C1655f c1655f = (C1655f) this.f1620d;
        c1655f.f16948d.f();
        c1655f.f16950e.f();
        arrayList.add(c1655f.f16948d);
        arrayList.add(c1655f.f16950e);
        Iterator it = c1655f.f17003u0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            if (c1654e instanceof C1658i) {
                w.h hVar = new w.h(c1654e);
                c1654e.f16948d.f();
                c1654e.f16950e.f();
                hVar.f17254f = ((C1658i) c1654e).f17053y0;
                arrayList.add(hVar);
            } else {
                if (c1654e.y()) {
                    if (c1654e.f16945b == null) {
                        c1654e.f16945b = new C1670c(c1654e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1654e.f16945b);
                } else {
                    arrayList.add(c1654e.f16948d);
                }
                if (c1654e.z()) {
                    if (c1654e.f16947c == null) {
                        c1654e.f16947c = new C1670c(c1654e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1654e.f16947c);
                } else {
                    arrayList.add(c1654e.f16950e);
                }
                if (c1654e instanceof C1659j) {
                    arrayList.add(new w.i(c1654e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            n nVar = (n) it3.next();
            if (nVar.f17250b != c1655f) {
                nVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f1624h;
        arrayList2.clear();
        C1655f c1655f2 = (C1655f) this.f1619c;
        e(c1655f2.f16948d, 0, arrayList2);
        e(c1655f2.f16950e, 1, arrayList2);
        this.f1617a = false;
    }

    public int d(C1655f c1655f, int i7) {
        ArrayList arrayList;
        int i8;
        int i9;
        long max;
        float f7;
        C1655f c1655f2 = c1655f;
        ArrayList arrayList2 = (ArrayList) this.f1624h;
        int size = arrayList2.size();
        int i10 = 0;
        long j = 0;
        while (i10 < size) {
            n nVar = ((w.k) arrayList2.get(i10)).f17239a;
            if (!(nVar instanceof C1670c) ? !(i7 != 0 ? (nVar instanceof w.l) : (nVar instanceof w.j)) : ((C1670c) nVar).f17254f != i7) {
                w.e eVar = (i7 == 0 ? c1655f2.f16948d : c1655f2.f16950e).f17256h;
                w.e eVar2 = (i7 == 0 ? c1655f2.f16948d : c1655f2.f16950e).f17257i;
                boolean contains = nVar.f17256h.f17235l.contains(eVar);
                w.e eVar3 = nVar.f17257i;
                boolean contains2 = eVar3.f17235l.contains(eVar2);
                long j3 = nVar.j();
                w.e eVar4 = nVar.f17256h;
                if (contains && contains2) {
                    long b7 = w.k.b(eVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i8 = size;
                    long a2 = w.k.a(eVar3, 0L);
                    long j7 = b7 - j3;
                    int i11 = eVar3.f17230f;
                    arrayList = arrayList3;
                    i9 = i10;
                    if (j7 >= (-i11)) {
                        j7 += i11;
                    }
                    long j8 = (-a2) - j3;
                    long j9 = eVar4.f17230f;
                    long j10 = j8 - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    C1654e c1654e = nVar.f17250b;
                    if (i7 == 0) {
                        f7 = c1654e.f16953f0;
                    } else if (i7 == 1) {
                        f7 = c1654e.f16955g0;
                    } else {
                        c1654e.getClass();
                        f7 = -1.0f;
                    }
                    float f8 = f7 > 0.0f ? (long) ((j7 / (1.0f - f7)) + (j10 / f7)) : 0L;
                    max = (eVar4.f17230f + ((((long) ((f8 * f7) + 0.5f)) + j3) + ((long) (((1.0f - f7) * f8) + 0.5f)))) - eVar3.f17230f;
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    i9 = i10;
                    max = contains ? Math.max(w.k.b(eVar4, eVar4.f17230f), eVar4.f17230f + j3) : contains2 ? Math.max(-w.k.a(eVar3, eVar3.f17230f), (-eVar3.f17230f) + j3) : (nVar.j() + eVar4.f17230f) - eVar3.f17230f;
                }
            } else {
                arrayList = arrayList2;
                i8 = size;
                i9 = i10;
                max = 0;
            }
            j = Math.max(j, max);
            i10 = i9 + 1;
            c1655f2 = c1655f;
            size = i8;
            arrayList2 = arrayList;
        }
        return (int) j;
    }

    public void e(n nVar, int i7, ArrayList arrayList) {
        w.e eVar;
        Iterator it = nVar.f17256h.f17234k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = nVar.f17257i;
            if (!hasNext) {
                break;
            }
            InterfaceC1671d interfaceC1671d = (InterfaceC1671d) it.next();
            if (interfaceC1671d instanceof w.e) {
                a((w.e) interfaceC1671d, i7, arrayList, null);
            } else if (interfaceC1671d instanceof n) {
                a(((n) interfaceC1671d).f17256h, i7, arrayList, null);
            }
        }
        Iterator it2 = eVar.f17234k.iterator();
        while (it2.hasNext()) {
            InterfaceC1671d interfaceC1671d2 = (InterfaceC1671d) it2.next();
            if (interfaceC1671d2 instanceof w.e) {
                a((w.e) interfaceC1671d2, i7, arrayList, null);
            } else if (interfaceC1671d2 instanceof n) {
                a(((n) interfaceC1671d2).f17257i, i7, arrayList, null);
            }
        }
        if (i7 == 1) {
            Iterator it3 = ((w.l) nVar).f17241k.f17234k.iterator();
            while (it3.hasNext()) {
                InterfaceC1671d interfaceC1671d3 = (InterfaceC1671d) it3.next();
                if (interfaceC1671d3 instanceof w.e) {
                    a((w.e) interfaceC1671d3, i7, arrayList, null);
                }
            }
        }
    }

    public void f(C1654e c1654e, EnumC1653d enumC1653d, int i7, EnumC1653d enumC1653d2, int i8) {
        C1669b c1669b = (C1669b) this.f1623g;
        c1669b.f17214a = enumC1653d;
        c1669b.f17215b = enumC1653d2;
        c1669b.f17216c = i7;
        c1669b.f17217d = i8;
        ((B.d) this.f1622f).b(c1654e, c1669b);
        c1654e.P(c1669b.f17218e);
        c1654e.M(c1669b.f17219f);
        c1654e.f16921E = c1669b.f17221h;
        c1654e.J(c1669b.f17220g);
    }

    public void g() {
        C1668a c1668a;
        Iterator it = ((C1655f) this.f1619c).f17003u0.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            if (!c1654e.f16943a) {
                EnumC1653d[] enumC1653dArr = c1654e.f16937U;
                boolean z4 = false;
                EnumC1653d enumC1653d = enumC1653dArr[0];
                EnumC1653d enumC1653d2 = enumC1653dArr[1];
                int i7 = c1654e.f16975r;
                int i8 = c1654e.f16977s;
                EnumC1653d enumC1653d3 = EnumC1653d.f16913b;
                EnumC1653d enumC1653d4 = EnumC1653d.f16914c;
                boolean z7 = enumC1653d == enumC1653d3 || (enumC1653d == enumC1653d4 && i7 == 1);
                if (enumC1653d2 == enumC1653d3 || (enumC1653d2 == enumC1653d4 && i8 == 1)) {
                    z4 = true;
                }
                w.f fVar = c1654e.f16948d.f17253e;
                boolean z8 = fVar.j;
                w.f fVar2 = c1654e.f16950e.f17253e;
                boolean z9 = fVar2.j;
                EnumC1653d enumC1653d5 = EnumC1653d.f16912a;
                if (z8 && z9) {
                    f(c1654e, enumC1653d5, fVar.f17231g, enumC1653d5, fVar2.f17231g);
                    c1654e.f16943a = true;
                } else if (z8 && z4) {
                    f(c1654e, enumC1653d5, fVar.f17231g, enumC1653d3, fVar2.f17231g);
                    if (enumC1653d2 == enumC1653d4) {
                        c1654e.f16950e.f17253e.f17236m = c1654e.l();
                    } else {
                        c1654e.f16950e.f17253e.d(c1654e.l());
                        c1654e.f16943a = true;
                    }
                } else if (z9 && z7) {
                    f(c1654e, enumC1653d3, fVar.f17231g, enumC1653d5, fVar2.f17231g);
                    if (enumC1653d == enumC1653d4) {
                        c1654e.f16948d.f17253e.f17236m = c1654e.r();
                    } else {
                        c1654e.f16948d.f17253e.d(c1654e.r());
                        c1654e.f16943a = true;
                    }
                }
                if (c1654e.f16943a && (c1668a = c1654e.f16950e.f17242l) != null) {
                    c1668a.d(c1654e.c0);
                }
            }
        }
    }
}
