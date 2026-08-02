package h2;

import A1.X;
import A1.x0;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import android.net.Uri;
import android.util.Pair;
import c2.C0796b;
import c2.e0;
import e2.InterfaceC1014k;
import e3.C1023h;
import i2.C1247c;
import i2.C1249e;
import i2.C1251g;
import i2.C1254j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u2.C1640q;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import u2.U;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: h2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187i {

    /* renamed from: a, reason: collision with root package name */
    public final C1181c f13374a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1636m f13375b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1636m f13376c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.c f13377d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f13378e;

    /* renamed from: f, reason: collision with root package name */
    public final X[] f13379f;

    /* renamed from: g, reason: collision with root package name */
    public final C1247c f13380g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f13381h;

    /* renamed from: i, reason: collision with root package name */
    public final List f13382i;

    /* renamed from: k, reason: collision with root package name */
    public final B1.p f13383k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13384l;

    /* renamed from: n, reason: collision with root package name */
    public C0796b f13386n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f13387o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13388p;

    /* renamed from: q, reason: collision with root package name */
    public t2.c f13389q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13391s;
    public final C1023h j = new C1023h(16);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f13385m = t.f17158f;

    /* renamed from: r, reason: collision with root package name */
    public long f13390r = -9223372036854775807L;

    public C1187i(C1181c c1181c, C1247c c1247c, Uri[] uriArr, X[] xArr, x0 x0Var, U u4, u1.c cVar, List list, B1.p pVar) {
        this.f13374a = c1181c;
        this.f13380g = c1247c;
        this.f13378e = uriArr;
        this.f13379f = xArr;
        this.f13377d = cVar;
        this.f13382i = list;
        this.f13383k = pVar;
        InterfaceC1636m a2 = ((InterfaceC1635l) x0Var.f613b).a();
        this.f13375b = a2;
        if (u4 != null) {
            a2.x(u4);
        }
        this.f13376c = ((InterfaceC1635l) x0Var.f613b).a();
        this.f13381h = new e0("", xArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((xArr[i7].f308e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        e0 e0Var = this.f13381h;
        int[] Z6 = Q0.a.Z(arrayList);
        C1185g c1185g = new C1185g(e0Var, Z6);
        c1185g.f13369g = c1185g.i(e0Var.f10344d[Z6[0]]);
        this.f13389q = c1185g;
    }

    public final InterfaceC1014k[] a(C1189k c1189k, long j) {
        int i7;
        List list;
        int a2 = c1189k == null ? -1 : this.f13381h.a(c1189k.f12596d);
        int length = this.f13389q.f16298c.length;
        InterfaceC1014k[] interfaceC1014kArr = new InterfaceC1014k[length];
        boolean z4 = false;
        int i8 = 0;
        while (i8 < length) {
            int i9 = this.f13389q.f16298c[i8];
            Uri uri = this.f13378e[i9];
            C1247c c1247c = this.f13380g;
            if (c1247c.c(uri)) {
                C1254j a4 = c1247c.a(z4, uri);
                a4.getClass();
                long j3 = a4.f13891h - c1247c.f13854E;
                i7 = i8;
                Pair c3 = c(c1189k, i9 != a2 ? true : z4, a4, j3, j);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                int i10 = (int) (longValue - a4.f13893k);
                if (i10 >= 0) {
                    AbstractC0167z abstractC0167z = a4.f13900r;
                    if (abstractC0167z.size() >= i10) {
                        ArrayList arrayList = new ArrayList();
                        if (i10 < abstractC0167z.size()) {
                            if (intValue != -1) {
                                C1251g c1251g = (C1251g) abstractC0167z.get(i10);
                                if (intValue == 0) {
                                    arrayList.add(c1251g);
                                } else if (intValue < c1251g.f13870D.size()) {
                                    AbstractC0167z abstractC0167z2 = c1251g.f13870D;
                                    arrayList.addAll(abstractC0167z2.subList(intValue, abstractC0167z2.size()));
                                }
                                i10++;
                            }
                            arrayList.addAll(abstractC0167z.subList(i10, abstractC0167z.size()));
                            intValue = 0;
                        }
                        if (a4.f13896n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            AbstractC0167z abstractC0167z3 = a4.f13901s;
                            if (intValue < abstractC0167z3.size()) {
                                arrayList.addAll(abstractC0167z3.subList(intValue, abstractC0167z3.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        interfaceC1014kArr[i7] = new C1184f(j3, list);
                    }
                }
                C0165x c0165x = AbstractC0167z.f2083b;
                list = L.f2000e;
                interfaceC1014kArr[i7] = new C1184f(j3, list);
            } else {
                interfaceC1014kArr[i8] = InterfaceC1014k.f12640s;
                i7 = i8;
            }
            i8 = i7 + 1;
            z4 = false;
        }
        return interfaceC1014kArr;
    }

    public final int b(C1189k c1189k) {
        if (c1189k.f13397F == -1) {
            return 1;
        }
        C1254j a2 = this.f13380g.a(false, this.f13378e[this.f13381h.a(c1189k.f12596d)]);
        a2.getClass();
        int i7 = (int) (c1189k.f12639A - a2.f13893k);
        if (i7 < 0) {
            return 1;
        }
        AbstractC0167z abstractC0167z = a2.f13900r;
        AbstractC0167z abstractC0167z2 = i7 < abstractC0167z.size() ? ((C1251g) abstractC0167z.get(i7)).f13870D : a2.f13901s;
        int size = abstractC0167z2.size();
        int i8 = c1189k.f13397F;
        if (i8 >= size) {
            return 2;
        }
        C1249e c1249e = (C1249e) abstractC0167z2.get(i8);
        if (c1249e.f13865D) {
            return 0;
        }
        return t.a(Uri.parse(AbstractC1664a.C(a2.f13924a, c1249e.f13873a)), c1189k.f12594b.f16808a) ? 1 : 2;
    }

    public final Pair c(C1189k c1189k, boolean z4, C1254j c1254j, long j, long j3) {
        boolean z7 = true;
        if (c1189k != null && !z4) {
            boolean z8 = c1189k.f13416Y;
            long j7 = c1189k.f12639A;
            int i7 = c1189k.f13397F;
            if (!z8) {
                return new Pair(Long.valueOf(j7), Integer.valueOf(i7));
            }
            if (i7 == -1) {
                j7 = c1189k.a();
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i7 != -1 ? i7 + 1 : -1));
        }
        long j8 = c1254j.f13903u + j;
        if (c1189k != null && !this.f13388p) {
            j3 = c1189k.f12599x;
        }
        boolean z9 = c1254j.f13897o;
        long j9 = c1254j.f13893k;
        AbstractC0167z abstractC0167z = c1254j.f13900r;
        if (!z9 && j3 >= j8) {
            return new Pair(Long.valueOf(j9 + abstractC0167z.size()), -1);
        }
        long j10 = j3 - j;
        Long valueOf = Long.valueOf(j10);
        int i8 = 0;
        if (this.f13380g.f13853D && c1189k != null) {
            z7 = false;
        }
        int d7 = t.d(abstractC0167z, valueOf, z7);
        long j11 = d7 + j9;
        if (d7 >= 0) {
            C1251g c1251g = (C1251g) abstractC0167z.get(d7);
            long j12 = c1251g.f13877e + c1251g.f13875c;
            AbstractC0167z abstractC0167z2 = c1254j.f13901s;
            AbstractC0167z abstractC0167z3 = j10 < j12 ? c1251g.f13870D : abstractC0167z2;
            while (true) {
                if (i8 >= abstractC0167z3.size()) {
                    break;
                }
                C1249e c1249e = (C1249e) abstractC0167z3.get(i8);
                if (j10 >= c1249e.f13877e + c1249e.f13875c) {
                    i8++;
                } else if (c1249e.f13864C) {
                    j11 += abstractC0167z3 == abstractC0167z2 ? 1L : 0L;
                    r1 = i8;
                }
            }
        }
        return new Pair(Long.valueOf(j11), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1183e d(Uri uri, int i7) {
        if (uri == null) {
            return null;
        }
        C1023h c1023h = this.j;
        byte[] bArr = (byte[]) ((C1182d) c1023h.f12667a).remove(uri);
        if (bArr != null) {
            return null;
        }
        C1640q c1640q = new C1640q(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        X x4 = this.f13379f[i7];
        int g3 = this.f13389q.g();
        Object f7 = this.f13389q.f();
        byte[] bArr2 = this.f13385m;
        C1183e c1183e = new C1183e(this.f13376c, c1640q, 3, x4, g3, f7, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = t.f17158f;
        }
        c1183e.f13364A = bArr2;
        return c1183e;
    }
}
