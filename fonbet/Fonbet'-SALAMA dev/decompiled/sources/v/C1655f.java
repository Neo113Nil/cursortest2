package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import w.C1669b;
import w.C1670c;
import w.n;
import w1.C1726n0;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655f extends C1654e {

    /* renamed from: A0, reason: collision with root package name */
    public final t.c f16987A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f16988B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f16989C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f16990D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f16991E0;

    /* renamed from: F0, reason: collision with root package name */
    public C1651b[] f16992F0;

    /* renamed from: G0, reason: collision with root package name */
    public C1651b[] f16993G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f16994H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f16995I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f16996J0;

    /* renamed from: K0, reason: collision with root package name */
    public WeakReference f16997K0;

    /* renamed from: L0, reason: collision with root package name */
    public WeakReference f16998L0;

    /* renamed from: M0, reason: collision with root package name */
    public WeakReference f16999M0;

    /* renamed from: N0, reason: collision with root package name */
    public WeakReference f17000N0;

    /* renamed from: O0, reason: collision with root package name */
    public final HashSet f17001O0;

    /* renamed from: P0, reason: collision with root package name */
    public final C1669b f17002P0;

    /* renamed from: u0, reason: collision with root package name */
    public ArrayList f17003u0 = new ArrayList();

    /* renamed from: v0, reason: collision with root package name */
    public final C1726n0 f17004v0 = new C1726n0(this);

    /* renamed from: w0, reason: collision with root package name */
    public final D0.a f17005w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f17006x0;

    /* renamed from: y0, reason: collision with root package name */
    public B.d f17007y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f17008z0;

    public C1655f() {
        D0.a aVar = new D0.a();
        aVar.f1617a = true;
        aVar.f1618b = true;
        aVar.f1621e = new ArrayList();
        new ArrayList();
        aVar.f1622f = null;
        aVar.f1623g = new C1669b();
        aVar.f1624h = new ArrayList();
        aVar.f1619c = this;
        aVar.f1620d = this;
        this.f17005w0 = aVar;
        this.f17007y0 = null;
        this.f17008z0 = false;
        this.f16987A0 = new t.c();
        this.f16990D0 = 0;
        this.f16991E0 = 0;
        this.f16992F0 = new C1651b[4];
        this.f16993G0 = new C1651b[4];
        this.f16994H0 = 257;
        this.f16995I0 = false;
        this.f16996J0 = false;
        this.f16997K0 = null;
        this.f16998L0 = null;
        this.f16999M0 = null;
        this.f17000N0 = null;
        this.f17001O0 = new HashSet();
        this.f17002P0 = new C1669b();
    }

    public static void W(C1654e c1654e, B.d dVar, C1669b c1669b) {
        int i7;
        int i8;
        if (dVar == null) {
            return;
        }
        if (c1654e.f16959i0 == 8 || (c1654e instanceof C1658i) || (c1654e instanceof C1650a)) {
            c1669b.f17218e = 0;
            c1669b.f17219f = 0;
            return;
        }
        EnumC1653d[] enumC1653dArr = c1654e.f16937U;
        c1669b.f17214a = enumC1653dArr[0];
        c1669b.f17215b = enumC1653dArr[1];
        c1669b.f17216c = c1654e.r();
        c1669b.f17217d = c1654e.l();
        c1669b.f17222i = false;
        c1669b.j = 0;
        EnumC1653d enumC1653d = c1669b.f17214a;
        EnumC1653d enumC1653d2 = EnumC1653d.f16914c;
        boolean z4 = enumC1653d == enumC1653d2;
        boolean z7 = c1669b.f17215b == enumC1653d2;
        boolean z8 = z4 && c1654e.f16941Y > 0.0f;
        boolean z9 = z7 && c1654e.f16941Y > 0.0f;
        EnumC1653d enumC1653d3 = EnumC1653d.f16913b;
        EnumC1653d enumC1653d4 = EnumC1653d.f16912a;
        if (z4 && c1654e.u(0) && c1654e.f16975r == 0 && !z8) {
            c1669b.f17214a = enumC1653d3;
            if (z7 && c1654e.f16977s == 0) {
                c1669b.f17214a = enumC1653d4;
            }
            z4 = false;
        }
        if (z7 && c1654e.u(1) && c1654e.f16977s == 0 && !z9) {
            c1669b.f17215b = enumC1653d3;
            if (z4 && c1654e.f16975r == 0) {
                c1669b.f17215b = enumC1653d4;
            }
            z7 = false;
        }
        if (c1654e.B()) {
            c1669b.f17214a = enumC1653d4;
            z4 = false;
        }
        if (c1654e.C()) {
            c1669b.f17215b = enumC1653d4;
            z7 = false;
        }
        int[] iArr = c1654e.f16979t;
        if (z8) {
            if (iArr[0] == 4) {
                c1669b.f17214a = enumC1653d4;
            } else if (!z7) {
                if (c1669b.f17215b == enumC1653d4) {
                    i8 = c1669b.f17217d;
                } else {
                    c1669b.f17214a = enumC1653d3;
                    dVar.b(c1654e, c1669b);
                    i8 = c1669b.f17219f;
                }
                c1669b.f17214a = enumC1653d4;
                c1669b.f17216c = (int) (c1654e.f16941Y * i8);
            }
        }
        if (z9) {
            if (iArr[1] == 4) {
                c1669b.f17215b = enumC1653d4;
            } else if (!z4) {
                if (c1669b.f17214a == enumC1653d4) {
                    i7 = c1669b.f17216c;
                } else {
                    c1669b.f17215b = enumC1653d3;
                    dVar.b(c1654e, c1669b);
                    i7 = c1669b.f17218e;
                }
                c1669b.f17215b = enumC1653d4;
                if (c1654e.f16942Z == -1) {
                    c1669b.f17217d = (int) (i7 / c1654e.f16941Y);
                } else {
                    c1669b.f17217d = (int) (c1654e.f16941Y * i7);
                }
            }
        }
        dVar.b(c1654e, c1669b);
        c1654e.P(c1669b.f17218e);
        c1654e.M(c1669b.f17219f);
        c1654e.f16921E = c1669b.f17221h;
        c1654e.J(c1669b.f17220g);
        c1669b.j = 0;
    }

    @Override // v.C1654e
    public final void D() {
        this.f16987A0.t();
        this.f16988B0 = 0;
        this.f16989C0 = 0;
        this.f17003u0.clear();
        super.D();
    }

    @Override // v.C1654e
    public final void G(C1726n0 c1726n0) {
        super.G(c1726n0);
        int size = this.f17003u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1654e) this.f17003u0.get(i7)).G(c1726n0);
        }
    }

    @Override // v.C1654e
    public final void Q(boolean z4, boolean z7) {
        super.Q(z4, z7);
        int size = this.f17003u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1654e) this.f17003u0.get(i7)).Q(z4, z7);
        }
    }

    public final void S(C1654e c1654e, int i7) {
        if (i7 == 0) {
            int i8 = this.f16990D0 + 1;
            C1651b[] c1651bArr = this.f16993G0;
            if (i8 >= c1651bArr.length) {
                this.f16993G0 = (C1651b[]) Arrays.copyOf(c1651bArr, c1651bArr.length * 2);
            }
            C1651b[] c1651bArr2 = this.f16993G0;
            int i9 = this.f16990D0;
            c1651bArr2[i9] = new C1651b(c1654e, 0, this.f17008z0);
            this.f16990D0 = i9 + 1;
            return;
        }
        if (i7 == 1) {
            int i10 = this.f16991E0 + 1;
            C1651b[] c1651bArr3 = this.f16992F0;
            if (i10 >= c1651bArr3.length) {
                this.f16992F0 = (C1651b[]) Arrays.copyOf(c1651bArr3, c1651bArr3.length * 2);
            }
            C1651b[] c1651bArr4 = this.f16992F0;
            int i11 = this.f16991E0;
            c1651bArr4[i11] = new C1651b(c1654e, 1, this.f17008z0);
            this.f16991E0 = i11 + 1;
        }
    }

    public final void T(t.c cVar) {
        boolean X6 = X(64);
        b(cVar, X6);
        int size = this.f17003u0.size();
        boolean z4 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C1654e c1654e = (C1654e) this.f17003u0.get(i7);
            boolean[] zArr = c1654e.f16936T;
            zArr[0] = false;
            zArr[1] = false;
            if (c1654e instanceof C1650a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                C1654e c1654e2 = (C1654e) this.f17003u0.get(i8);
                if (c1654e2 instanceof C1650a) {
                    C1650a c1650a = (C1650a) c1654e2;
                    for (int i9 = 0; i9 < c1650a.f17056v0; i9++) {
                        C1654e c1654e3 = c1650a.f17055u0[i9];
                        if (c1650a.f16884x0 || c1654e3.c()) {
                            int i10 = c1650a.f16883w0;
                            if (i10 == 0 || i10 == 1) {
                                c1654e3.f16936T[0] = true;
                            } else if (i10 == 2 || i10 == 3) {
                                c1654e3.f16936T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f17001O0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            C1654e c1654e4 = (C1654e) this.f17003u0.get(i11);
            c1654e4.getClass();
            boolean z7 = c1654e4 instanceof AbstractC1662m;
            if (z7 || (c1654e4 instanceof C1658i)) {
                if (z7) {
                    hashSet.add(c1654e4);
                } else {
                    c1654e4.b(cVar, X6);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1662m abstractC1662m = (AbstractC1662m) ((C1654e) it.next());
                for (int i12 = 0; i12 < abstractC1662m.f17056v0; i12++) {
                    if (hashSet.contains(abstractC1662m.f17055u0[i12])) {
                        abstractC1662m.b(cVar, X6);
                        hashSet.remove(abstractC1662m);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1654e) it2.next()).b(cVar, X6);
                }
                hashSet.clear();
            }
        }
        boolean z8 = t.c.f16228p;
        EnumC1653d enumC1653d = EnumC1653d.f16913b;
        if (z8) {
            HashSet hashSet2 = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                C1654e c1654e5 = (C1654e) this.f17003u0.get(i13);
                c1654e5.getClass();
                if (!(c1654e5 instanceof AbstractC1662m) && !(c1654e5 instanceof C1658i)) {
                    hashSet2.add(c1654e5);
                }
            }
            a(this, cVar, hashSet2, this.f16937U[0] == enumC1653d ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1654e c1654e6 = (C1654e) it3.next();
                AbstractC1660k.b(this, cVar, c1654e6);
                c1654e6.b(cVar, X6);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                C1654e c1654e7 = (C1654e) this.f17003u0.get(i14);
                if (c1654e7 instanceof C1655f) {
                    EnumC1653d[] enumC1653dArr = c1654e7.f16937U;
                    EnumC1653d enumC1653d2 = enumC1653dArr[0];
                    EnumC1653d enumC1653d3 = enumC1653dArr[1];
                    EnumC1653d enumC1653d4 = EnumC1653d.f16912a;
                    if (enumC1653d2 == enumC1653d) {
                        c1654e7.N(enumC1653d4);
                    }
                    if (enumC1653d3 == enumC1653d) {
                        c1654e7.O(enumC1653d4);
                    }
                    c1654e7.b(cVar, X6);
                    if (enumC1653d2 == enumC1653d) {
                        c1654e7.N(enumC1653d2);
                    }
                    if (enumC1653d3 == enumC1653d) {
                        c1654e7.O(enumC1653d3);
                    }
                } else {
                    AbstractC1660k.b(this, cVar, c1654e7);
                    if (!(c1654e7 instanceof AbstractC1662m) && !(c1654e7 instanceof C1658i)) {
                        c1654e7.b(cVar, X6);
                    }
                }
            }
        }
        if (this.f16990D0 > 0) {
            AbstractC1660k.a(this, cVar, null, 0);
        }
        if (this.f16991E0 > 0) {
            AbstractC1660k.a(this, cVar, null, 1);
        }
    }

    public final boolean U(int i7, boolean z4) {
        boolean z7;
        EnumC1653d enumC1653d;
        boolean z8;
        D0.a aVar = this.f17005w0;
        C1655f c1655f = (C1655f) aVar.f1619c;
        boolean z9 = false;
        EnumC1653d k7 = c1655f.k(0);
        EnumC1653d k8 = c1655f.k(1);
        int s7 = c1655f.s();
        int t7 = c1655f.t();
        ArrayList arrayList = (ArrayList) aVar.f1621e;
        EnumC1653d enumC1653d2 = EnumC1653d.f16912a;
        if (z4 && (k7 == (enumC1653d = EnumC1653d.f16913b) || k8 == enumC1653d)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z8 = z4;
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f17254f == i7 && !nVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z8 && k7 == enumC1653d) {
                    c1655f.N(enumC1653d2);
                    c1655f.P(aVar.d(c1655f, 0));
                    c1655f.f16948d.f17253e.d(c1655f.r());
                }
            } else if (z8 && k8 == enumC1653d) {
                c1655f.O(enumC1653d2);
                c1655f.M(aVar.d(c1655f, 1));
                c1655f.f16950e.f17253e.d(c1655f.l());
            }
        }
        EnumC1653d enumC1653d3 = EnumC1653d.f16915d;
        if (i7 == 0) {
            EnumC1653d enumC1653d4 = c1655f.f16937U[0];
            if (enumC1653d4 == enumC1653d2 || enumC1653d4 == enumC1653d3) {
                int r7 = c1655f.r() + s7;
                c1655f.f16948d.f17257i.d(r7);
                c1655f.f16948d.f17253e.d(r7 - s7);
                z7 = true;
            }
            z7 = false;
        } else {
            EnumC1653d enumC1653d5 = c1655f.f16937U[1];
            if (enumC1653d5 == enumC1653d2 || enumC1653d5 == enumC1653d3) {
                int l7 = c1655f.l() + t7;
                c1655f.f16950e.f17257i.d(l7);
                c1655f.f16950e.f17253e.d(l7 - t7);
                z7 = true;
            }
            z7 = false;
        }
        aVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            if (nVar2.f17254f == i7 && (nVar2.f17250b != c1655f || nVar2.f17255g)) {
                nVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            n nVar3 = (n) it3.next();
            if (nVar3.f17254f == i7 && (z7 || nVar3.f17250b != c1655f)) {
                if (!nVar3.f17256h.j) {
                    break;
                }
                if (!nVar3.f17257i.j) {
                    break;
                }
                if (!(nVar3 instanceof C1670c) && !nVar3.f17253e.j) {
                    break;
                }
            }
        }
        c1655f.N(k7);
        c1655f.O(k8);
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x087e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x088a A[LOOP:13: B:273:0x0888->B:274:0x088a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x062e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0656  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        int i7;
        int i8;
        EnumC1653d enumC1653d;
        C1652c c1652c;
        int i9;
        t.c cVar;
        EnumC1653d enumC1653d2;
        C1652c c1652c2;
        int i10;
        int i11;
        EnumC1653d enumC1653d3;
        EnumC1653d enumC1653d4;
        EnumC1653d enumC1653d5;
        boolean z4;
        char c3;
        int i12;
        int i13;
        boolean z7;
        boolean z8;
        int i14;
        ArrayList arrayList;
        boolean z9;
        C1652c c1652c3;
        boolean z10;
        boolean z11;
        int max;
        int max2;
        ?? r7;
        int i15;
        int i16;
        int i17;
        int max3;
        int max4;
        WeakReference weakReference;
        t.c cVar2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        t.c cVar3;
        C1652c c1652c4;
        EnumC1653d enumC1653d6;
        EnumC1653d enumC1653d7;
        w.m mVar;
        w.m mVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        int b7;
        w.m mVar3;
        w.m mVar4;
        EnumC1653d enumC1653d8;
        this.f16944a0 = 0;
        this.f16946b0 = 0;
        this.f16995I0 = false;
        this.f16996J0 = false;
        int size = this.f17003u0.size();
        int max5 = Math.max(0, r());
        int max6 = Math.max(0, l());
        EnumC1653d[] enumC1653dArr = this.f16937U;
        EnumC1653d enumC1653d9 = enumC1653dArr[1];
        EnumC1653d enumC1653d10 = enumC1653dArr[0];
        int i22 = this.f17006x0;
        EnumC1653d enumC1653d11 = EnumC1653d.f16914c;
        C1652c c1652c5 = this.f16927K;
        C1652c c1652c6 = this.f16926J;
        EnumC1653d enumC1653d12 = EnumC1653d.f16912a;
        if (i22 == 0 && AbstractC1660k.c(this.f16994H0, 1)) {
            B.d dVar = this.f17007y0;
            EnumC1653d[] enumC1653dArr2 = this.f16937U;
            EnumC1653d enumC1653d13 = enumC1653dArr2[0];
            EnumC1653d enumC1653d14 = enumC1653dArr2[1];
            F();
            ArrayList arrayList2 = this.f17003u0;
            int size2 = arrayList2.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((C1654e) arrayList2.get(i23)).F();
            }
            boolean z12 = this.f17008z0;
            if (enumC1653d13 == enumC1653d12) {
                i8 = max6;
                K(0, r());
            } else {
                i8 = max6;
                c1652c6.l(0);
                this.f16944a0 = 0;
            }
            boolean z13 = false;
            int i24 = 0;
            boolean z14 = false;
            while (i24 < size2) {
                C1652c c1652c7 = c1652c6;
                C1654e c1654e = (C1654e) arrayList2.get(i24);
                int i25 = max5;
                if (c1654e instanceof C1658i) {
                    C1658i c1658i = (C1658i) c1654e;
                    enumC1653d8 = enumC1653d9;
                    if (c1658i.f17053y0 == 1) {
                        int i26 = c1658i.f17050v0;
                        if (i26 != -1) {
                            c1658i.S(i26);
                        } else if (c1658i.f17051w0 != -1 && B()) {
                            c1658i.S(r() - c1658i.f17051w0);
                        } else if (B()) {
                            c1658i.S((int) ((c1658i.f17049u0 * r()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    enumC1653d8 = enumC1653d9;
                    if ((c1654e instanceof C1650a) && ((C1650a) c1654e).W() == 0) {
                        z14 = true;
                    }
                }
                i24++;
                max5 = i25;
                c1652c6 = c1652c7;
                enumC1653d9 = enumC1653d8;
            }
            i7 = max5;
            enumC1653d = enumC1653d9;
            c1652c = c1652c6;
            if (z13) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C1654e c1654e2 = (C1654e) arrayList2.get(i27);
                    if (c1654e2 instanceof C1658i) {
                        C1658i c1658i2 = (C1658i) c1654e2;
                        if (c1658i2.f17053y0 == 1) {
                            w.g.c(0, dVar, c1658i2, z12);
                        }
                    }
                }
            }
            w.g.c(0, dVar, this, z12);
            if (z14) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C1654e c1654e3 = (C1654e) arrayList2.get(i28);
                    if (c1654e3 instanceof C1650a) {
                        C1650a c1650a = (C1650a) c1654e3;
                        if (c1650a.W() == 0 && c1650a.V()) {
                            w.g.c(1, dVar, c1650a, z12);
                        }
                    }
                }
            }
            if (enumC1653d14 == enumC1653d12) {
                L(0, l());
            } else {
                c1652c5.l(0);
                this.f16946b0 = 0;
            }
            boolean z15 = false;
            boolean z16 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                C1654e c1654e4 = (C1654e) arrayList2.get(i29);
                if (c1654e4 instanceof C1658i) {
                    C1658i c1658i3 = (C1658i) c1654e4;
                    if (c1658i3.f17053y0 == 0) {
                        int i30 = c1658i3.f17050v0;
                        if (i30 != -1) {
                            c1658i3.S(i30);
                        } else if (c1658i3.f17051w0 != -1 && C()) {
                            c1658i3.S(l() - c1658i3.f17051w0);
                        } else if (C()) {
                            c1658i3.S((int) ((c1658i3.f17049u0 * l()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((c1654e4 instanceof C1650a) && ((C1650a) c1654e4).W() == 1) {
                    z16 = true;
                }
            }
            if (z15) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C1654e c1654e5 = (C1654e) arrayList2.get(i31);
                    if (c1654e5 instanceof C1658i) {
                        C1658i c1658i4 = (C1658i) c1654e5;
                        if (c1658i4.f17053y0 == 0) {
                            w.g.i(1, dVar, c1658i4);
                        }
                    }
                }
            }
            w.g.i(0, dVar, this);
            if (z16) {
                for (int i32 = 0; i32 < size2; i32++) {
                    C1654e c1654e6 = (C1654e) arrayList2.get(i32);
                    if (c1654e6 instanceof C1650a) {
                        C1650a c1650a2 = (C1650a) c1654e6;
                        if (c1650a2.W() == 1 && c1650a2.V()) {
                            w.g.i(1, dVar, c1650a2);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                C1654e c1654e7 = (C1654e) arrayList2.get(i33);
                if (c1654e7.A() && w.g.a(c1654e7)) {
                    W(c1654e7, dVar, w.g.f17237a);
                    if (!(c1654e7 instanceof C1658i)) {
                        w.g.c(0, dVar, c1654e7, z12);
                        w.g.i(0, dVar, c1654e7);
                    } else if (((C1658i) c1654e7).f17053y0 == 0) {
                        w.g.i(0, dVar, c1654e7);
                    } else {
                        w.g.c(0, dVar, c1654e7, z12);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                C1654e c1654e8 = (C1654e) this.f17003u0.get(i34);
                if (c1654e8.A() && !(c1654e8 instanceof C1658i) && !(c1654e8 instanceof C1650a) && !(c1654e8 instanceof AbstractC1662m) && !c1654e8.f16923G) {
                    EnumC1653d k7 = c1654e8.k(0);
                    EnumC1653d k8 = c1654e8.k(1);
                    if (k7 != enumC1653d11 || c1654e8.f16975r == 1 || k8 != enumC1653d11 || c1654e8.f16977s == 1) {
                        W(c1654e8, this.f17007y0, new C1669b());
                    }
                }
            }
        } else {
            i7 = max5;
            i8 = max6;
            enumC1653d = enumC1653d9;
            c1652c = c1652c6;
        }
        EnumC1653d enumC1653d15 = EnumC1653d.f16913b;
        t.c cVar4 = this.f16987A0;
        if (size > 2) {
            EnumC1653d enumC1653d16 = enumC1653d;
            if ((enumC1653d10 == enumC1653d15 || enumC1653d16 == enumC1653d15) && AbstractC1660k.c(this.f16994H0, 1024)) {
                B.d dVar2 = this.f17007y0;
                ArrayList arrayList3 = this.f17003u0;
                int size3 = arrayList3.size();
                int i35 = 0;
                while (i35 < size3) {
                    C1654e c1654e9 = (C1654e) arrayList3.get(i35);
                    EnumC1653d[] enumC1653dArr3 = this.f16937U;
                    EnumC1653d enumC1653d17 = enumC1653dArr3[0];
                    EnumC1653d enumC1653d18 = enumC1653dArr3[1];
                    c1652c2 = c1652c5;
                    EnumC1653d[] enumC1653dArr4 = c1654e9.f16937U;
                    i9 = size;
                    if (!w.g.h(enumC1653d17, enumC1653d18, enumC1653dArr4[0], enumC1653dArr4[1]) || (c1654e9 instanceof C1657h)) {
                        enumC1653d4 = enumC1653d15;
                        cVar = cVar4;
                        enumC1653d6 = enumC1653d10;
                        enumC1653d7 = enumC1653d16;
                        enumC1653d5 = enumC1653d12;
                        break;
                    }
                    i35++;
                    c1652c5 = c1652c2;
                    size = i9;
                }
                i9 = size;
                c1652c2 = c1652c5;
                int i36 = 0;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                while (i36 < size3) {
                    EnumC1653d enumC1653d19 = enumC1653d16;
                    C1654e c1654e10 = (C1654e) arrayList3.get(i36);
                    EnumC1653d enumC1653d20 = enumC1653d10;
                    EnumC1653d[] enumC1653dArr5 = this.f16937U;
                    EnumC1653d enumC1653d21 = enumC1653d12;
                    EnumC1653d enumC1653d22 = enumC1653dArr5[0];
                    EnumC1653d enumC1653d23 = enumC1653dArr5[1];
                    t.c cVar5 = cVar4;
                    EnumC1653d[] enumC1653dArr6 = c1654e10.f16937U;
                    EnumC1653d enumC1653d24 = enumC1653d15;
                    if (!w.g.h(enumC1653d22, enumC1653d23, enumC1653dArr6[0], enumC1653dArr6[1])) {
                        W(c1654e10, dVar2, this.f17002P0);
                    }
                    boolean z17 = c1654e10 instanceof C1658i;
                    if (z17) {
                        C1658i c1658i5 = (C1658i) c1654e10;
                        if (c1658i5.f17053y0 == 0) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c1658i5);
                        }
                        if (c1658i5.f17053y0 == 1) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c1658i5);
                        }
                    }
                    if (c1654e10 instanceof C1659j) {
                        if (c1654e10 instanceof C1650a) {
                            C1650a c1650a3 = (C1650a) c1654e10;
                            if (c1650a3.W() == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c1650a3);
                            }
                            if (c1650a3.W() == 1) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(c1650a3);
                            }
                        } else {
                            C1659j c1659j = (C1659j) c1654e10;
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(c1659j);
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(c1659j);
                        }
                    }
                    if (c1654e10.f16926J.f16908f == null && c1654e10.f16928L.f16908f == null && !z17 && !(c1654e10 instanceof C1650a)) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(c1654e10);
                    }
                    if (c1654e10.f16927K.f16908f == null && c1654e10.f16929M.f16908f == null && c1654e10.f16930N.f16908f == null && !z17 && !(c1654e10 instanceof C1650a)) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        ArrayList arrayList10 = arrayList9;
                        arrayList10.add(c1654e10);
                        arrayList9 = arrayList10;
                    }
                    i36++;
                    enumC1653d10 = enumC1653d20;
                    enumC1653d16 = enumC1653d19;
                    enumC1653d12 = enumC1653d21;
                    cVar4 = cVar5;
                    enumC1653d15 = enumC1653d24;
                }
                EnumC1653d enumC1653d25 = enumC1653d15;
                t.c cVar6 = cVar4;
                enumC1653d6 = enumC1653d10;
                enumC1653d7 = enumC1653d16;
                EnumC1653d enumC1653d26 = enumC1653d12;
                ArrayList arrayList11 = new ArrayList();
                if (arrayList4 != null) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        w.g.b((C1658i) it.next(), 0, arrayList11, null);
                    }
                }
                int i37 = 0;
                w.m mVar5 = null;
                if (arrayList5 != null) {
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        C1659j c1659j2 = (C1659j) it2.next();
                        w.m b8 = w.g.b(c1659j2, i37, arrayList11, mVar5);
                        c1659j2.T(i37, arrayList11, b8);
                        b8.a(arrayList11);
                        i37 = 0;
                        mVar5 = null;
                    }
                }
                HashSet hashSet = j(2).f16903a;
                if (hashSet != null) {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        w.g.b(((C1652c) it3.next()).f16906d, 0, arrayList11, null);
                    }
                }
                HashSet hashSet2 = j(4).f16903a;
                if (hashSet2 != null) {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        w.g.b(((C1652c) it4.next()).f16906d, 0, arrayList11, null);
                    }
                }
                HashSet hashSet3 = j(7).f16903a;
                if (hashSet3 != null) {
                    Iterator it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        w.g.b(((C1652c) it5.next()).f16906d, 0, arrayList11, null);
                    }
                }
                w.m mVar6 = null;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        w.g.b((C1654e) it6.next(), 0, arrayList11, null);
                    }
                }
                if (arrayList6 != null) {
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        w.g.b((C1658i) it7.next(), 1, arrayList11, null);
                    }
                }
                int i38 = 1;
                if (arrayList7 != null) {
                    Iterator it8 = arrayList7.iterator();
                    while (it8.hasNext()) {
                        C1659j c1659j3 = (C1659j) it8.next();
                        w.m b9 = w.g.b(c1659j3, i38, arrayList11, mVar6);
                        c1659j3.T(i38, arrayList11, b9);
                        b9.a(arrayList11);
                        i38 = 1;
                        mVar6 = null;
                    }
                }
                HashSet hashSet4 = j(3).f16903a;
                if (hashSet4 != null) {
                    Iterator it9 = hashSet4.iterator();
                    while (it9.hasNext()) {
                        w.g.b(((C1652c) it9.next()).f16906d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet5 = j(6).f16903a;
                if (hashSet5 != null) {
                    Iterator it10 = hashSet5.iterator();
                    while (it10.hasNext()) {
                        w.g.b(((C1652c) it10.next()).f16906d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet6 = j(5).f16903a;
                if (hashSet6 != null) {
                    Iterator it11 = hashSet6.iterator();
                    while (it11.hasNext()) {
                        w.g.b(((C1652c) it11.next()).f16906d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet7 = j(7).f16903a;
                if (hashSet7 != null) {
                    Iterator it12 = hashSet7.iterator();
                    while (it12.hasNext()) {
                        w.g.b(((C1652c) it12.next()).f16906d, 1, arrayList11, null);
                    }
                }
                if (arrayList9 != null) {
                    Iterator it13 = arrayList9.iterator();
                    while (it13.hasNext()) {
                        w.g.b((C1654e) it13.next(), 1, arrayList11, null);
                    }
                }
                for (int i39 = 0; i39 < size3; i39++) {
                    C1654e c1654e11 = (C1654e) arrayList3.get(i39);
                    EnumC1653d[] enumC1653dArr7 = c1654e11.f16937U;
                    if (enumC1653dArr7[0] == enumC1653d11 && enumC1653dArr7[1] == enumC1653d11) {
                        int i40 = c1654e11.f16978s0;
                        int size4 = arrayList11.size();
                        int i41 = 0;
                        while (true) {
                            if (i41 >= size4) {
                                mVar3 = null;
                                break;
                            }
                            mVar3 = (w.m) arrayList11.get(i41);
                            if (i40 == mVar3.f17245b) {
                                break;
                            } else {
                                i41++;
                            }
                        }
                        int i42 = c1654e11.f16980t0;
                        int size5 = arrayList11.size();
                        int i43 = 0;
                        while (true) {
                            if (i43 >= size5) {
                                mVar4 = null;
                                break;
                            }
                            mVar4 = (w.m) arrayList11.get(i43);
                            if (i42 == mVar4.f17245b) {
                                break;
                            } else {
                                i43++;
                            }
                        }
                        if (mVar3 != null && mVar4 != null) {
                            mVar3.c(0, mVar4);
                            mVar4.f17246c = 2;
                            arrayList11.remove(mVar3);
                        }
                    }
                }
                if (arrayList11.size() > 1) {
                    enumC1653d4 = enumC1653d25;
                    if (this.f16937U[0] == enumC1653d4) {
                        Iterator it14 = arrayList11.iterator();
                        int i44 = 0;
                        mVar = null;
                        while (it14.hasNext()) {
                            w.m mVar7 = (w.m) it14.next();
                            if (mVar7.f17246c != 1) {
                                t.c cVar7 = cVar6;
                                int b10 = mVar7.b(cVar7, 0);
                                if (b10 > i44) {
                                    mVar = mVar7;
                                    i44 = b10;
                                }
                                cVar6 = cVar7;
                            }
                        }
                        cVar = cVar6;
                        enumC1653d5 = enumC1653d26;
                        if (mVar != null) {
                            N(enumC1653d5);
                            P(i44);
                            if (this.f16937U[1] == enumC1653d4) {
                                Iterator it15 = arrayList11.iterator();
                                int i45 = 0;
                                mVar2 = null;
                                while (it15.hasNext()) {
                                    w.m mVar8 = (w.m) it15.next();
                                    if (mVar8.f17246c != 0 && (b7 = mVar8.b(cVar, 1)) > i45) {
                                        mVar2 = mVar8;
                                        i45 = b7;
                                    }
                                }
                                if (mVar2 != null) {
                                    O(enumC1653d5);
                                    M(i45);
                                    if (mVar == null || mVar2 != null) {
                                        enumC1653d2 = enumC1653d6;
                                        if (enumC1653d2 == enumC1653d4) {
                                            i18 = i7;
                                            if (i18 >= r() || i18 <= 0) {
                                                i19 = r();
                                                enumC1653d3 = enumC1653d7;
                                                if (enumC1653d3 != enumC1653d4) {
                                                    i20 = i8;
                                                    if (i20 >= l() || i20 <= 0) {
                                                        i21 = l();
                                                        i10 = i21;
                                                        i11 = i19;
                                                        z4 = true;
                                                        boolean z18 = !X(64) || X(128);
                                                        cVar.getClass();
                                                        cVar.f16236g = false;
                                                        if (this.f16994H0 == 0 && z18) {
                                                            c3 = 1;
                                                            cVar.f16236g = true;
                                                        } else {
                                                            c3 = 1;
                                                        }
                                                        ArrayList arrayList12 = this.f17003u0;
                                                        EnumC1653d[] enumC1653dArr8 = this.f16937U;
                                                        boolean z19 = enumC1653dArr8[0] != enumC1653d4 || enumC1653dArr8[c3] == enumC1653d4;
                                                        this.f16990D0 = 0;
                                                        this.f16991E0 = 0;
                                                        i12 = i9;
                                                        for (i13 = 0; i13 < i12; i13++) {
                                                            C1654e c1654e12 = (C1654e) this.f17003u0.get(i13);
                                                            if (c1654e12 instanceof C1655f) {
                                                                ((C1655f) c1654e12).V();
                                                            }
                                                        }
                                                        boolean X6 = X(64);
                                                        boolean z20 = z4;
                                                        int i46 = 0;
                                                        z7 = true;
                                                        while (z7) {
                                                            int i47 = i46 + 1;
                                                            try {
                                                                cVar.t();
                                                                z9 = z7;
                                                                try {
                                                                    this.f16990D0 = 0;
                                                                    this.f16991E0 = 0;
                                                                    h(cVar);
                                                                    for (int i48 = 0; i48 < i12; i48++) {
                                                                        ((C1654e) this.f17003u0.get(i48)).h(cVar);
                                                                    }
                                                                    T(cVar);
                                                                    try {
                                                                        weakReference = this.f16997K0;
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        i14 = i10;
                                                                        arrayList = arrayList12;
                                                                        c1652c3 = c1652c2;
                                                                        z10 = z20;
                                                                    }
                                                                } catch (Exception e8) {
                                                                    e = e8;
                                                                    i14 = i10;
                                                                    arrayList = arrayList12;
                                                                    c1652c3 = c1652c2;
                                                                    z10 = z20;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr = AbstractC1660k.f17057a;
                                                                    if (z9) {
                                                                    }
                                                                    if (z19) {
                                                                    }
                                                                    max = Math.max(this.f16949d0, r());
                                                                    if (max > r()) {
                                                                    }
                                                                    max2 = Math.max(this.f16951e0, l());
                                                                    if (max2 > l()) {
                                                                    }
                                                                    if (!z10) {
                                                                    }
                                                                    i15 = i14;
                                                                    z20 = z10;
                                                                    i16 = 8;
                                                                    if (i47 > i16) {
                                                                    }
                                                                    i46 = i47;
                                                                    i10 = i15;
                                                                    c1652c2 = c1652c3;
                                                                    arrayList12 = arrayList;
                                                                }
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                i14 = i10;
                                                                arrayList = arrayList12;
                                                                z9 = z7;
                                                            }
                                                            if (weakReference != null) {
                                                                try {
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    i14 = i10;
                                                                    arrayList = arrayList12;
                                                                    c1652c3 = c1652c2;
                                                                    z10 = z20;
                                                                }
                                                                if (weakReference.get() != null) {
                                                                    C1652c c1652c8 = (C1652c) this.f16997K0.get();
                                                                    C1652c c1652c9 = c1652c2;
                                                                    z10 = z20;
                                                                    try {
                                                                        t.f k9 = cVar.k(c1652c9);
                                                                        c1652c3 = c1652c9;
                                                                        try {
                                                                            cVar2 = this.f16987A0;
                                                                            i14 = i10;
                                                                            arrayList = arrayList12;
                                                                        } catch (Exception e11) {
                                                                            e = e11;
                                                                            i14 = i10;
                                                                            arrayList = arrayList12;
                                                                            z9 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = AbstractC1660k.f17057a;
                                                                            if (z9) {
                                                                            }
                                                                            if (z19) {
                                                                            }
                                                                            max = Math.max(this.f16949d0, r());
                                                                            if (max > r()) {
                                                                            }
                                                                            max2 = Math.max(this.f16951e0, l());
                                                                            if (max2 > l()) {
                                                                            }
                                                                            if (!z10) {
                                                                            }
                                                                            i15 = i14;
                                                                            z20 = z10;
                                                                            i16 = 8;
                                                                            if (i47 > i16) {
                                                                            }
                                                                            i46 = i47;
                                                                            i10 = i15;
                                                                            c1652c2 = c1652c3;
                                                                            arrayList12 = arrayList;
                                                                        }
                                                                        try {
                                                                            cVar2.f(cVar2.k(c1652c8), k9, 0, 5);
                                                                            this.f16997K0 = null;
                                                                            weakReference2 = this.f16999M0;
                                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                                C1652c c1652c10 = (C1652c) this.f16999M0.get();
                                                                                t.f k10 = cVar.k(this.f16929M);
                                                                                t.c cVar8 = this.f16987A0;
                                                                                cVar8.f(k10, cVar8.k(c1652c10), 0, 5);
                                                                                this.f16999M0 = null;
                                                                            }
                                                                            weakReference3 = this.f16998L0;
                                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                                C1652c c1652c11 = (C1652c) this.f16998L0.get();
                                                                                c1652c4 = c1652c;
                                                                                try {
                                                                                    t.f k11 = cVar.k(c1652c4);
                                                                                    t.c cVar9 = this.f16987A0;
                                                                                    c1652c = c1652c4;
                                                                                    cVar9.f(cVar9.k(c1652c11), k11, 0, 5);
                                                                                    this.f16998L0 = null;
                                                                                } catch (Exception e12) {
                                                                                    e = e12;
                                                                                    c1652c = c1652c4;
                                                                                    z9 = true;
                                                                                    e.printStackTrace();
                                                                                    System.out.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr22 = AbstractC1660k.f17057a;
                                                                                    if (z9) {
                                                                                    }
                                                                                    if (z19) {
                                                                                    }
                                                                                    max = Math.max(this.f16949d0, r());
                                                                                    if (max > r()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f16951e0, l());
                                                                                    if (max2 > l()) {
                                                                                    }
                                                                                    if (!z10) {
                                                                                    }
                                                                                    i15 = i14;
                                                                                    z20 = z10;
                                                                                    i16 = 8;
                                                                                    if (i47 > i16) {
                                                                                    }
                                                                                    i46 = i47;
                                                                                    i10 = i15;
                                                                                    c1652c2 = c1652c3;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                            }
                                                                            weakReference4 = this.f17000N0;
                                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                                C1652c c1652c12 = (C1652c) this.f17000N0.get();
                                                                                t.f k12 = cVar.k(this.f16928L);
                                                                                try {
                                                                                    cVar3 = this.f16987A0;
                                                                                } catch (Exception e13) {
                                                                                    e = e13;
                                                                                    z9 = true;
                                                                                    e.printStackTrace();
                                                                                    System.out.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr222 = AbstractC1660k.f17057a;
                                                                                    if (z9) {
                                                                                    }
                                                                                    if (z19) {
                                                                                    }
                                                                                    max = Math.max(this.f16949d0, r());
                                                                                    if (max > r()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f16951e0, l());
                                                                                    if (max2 > l()) {
                                                                                    }
                                                                                    if (!z10) {
                                                                                    }
                                                                                    i15 = i14;
                                                                                    z20 = z10;
                                                                                    i16 = 8;
                                                                                    if (i47 > i16) {
                                                                                    }
                                                                                    i46 = i47;
                                                                                    i10 = i15;
                                                                                    c1652c2 = c1652c3;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                                try {
                                                                                    cVar3.f(k12, cVar3.k(c1652c12), 0, 5);
                                                                                } catch (Exception e14) {
                                                                                    e = e14;
                                                                                    z9 = true;
                                                                                    e.printStackTrace();
                                                                                    System.out.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr2222 = AbstractC1660k.f17057a;
                                                                                    if (z9) {
                                                                                    }
                                                                                    if (z19) {
                                                                                    }
                                                                                    max = Math.max(this.f16949d0, r());
                                                                                    if (max > r()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f16951e0, l());
                                                                                    if (max2 > l()) {
                                                                                    }
                                                                                    if (!z10) {
                                                                                    }
                                                                                    i15 = i14;
                                                                                    z20 = z10;
                                                                                    i16 = 8;
                                                                                    if (i47 > i16) {
                                                                                    }
                                                                                    i46 = i47;
                                                                                    i10 = i15;
                                                                                    c1652c2 = c1652c3;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                                try {
                                                                                    this.f17000N0 = null;
                                                                                } catch (Exception e15) {
                                                                                    e = e15;
                                                                                    z9 = true;
                                                                                    e.printStackTrace();
                                                                                    System.out.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr22222 = AbstractC1660k.f17057a;
                                                                                    if (z9) {
                                                                                    }
                                                                                    if (z19) {
                                                                                    }
                                                                                    max = Math.max(this.f16949d0, r());
                                                                                    if (max > r()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f16951e0, l());
                                                                                    if (max2 > l()) {
                                                                                    }
                                                                                    if (!z10) {
                                                                                    }
                                                                                    i15 = i14;
                                                                                    z20 = z10;
                                                                                    i16 = 8;
                                                                                    if (i47 > i16) {
                                                                                    }
                                                                                    i46 = i47;
                                                                                    i10 = i15;
                                                                                    c1652c2 = c1652c3;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                            }
                                                                            cVar.p();
                                                                            z9 = true;
                                                                        } catch (Exception e16) {
                                                                            e = e16;
                                                                            z9 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222222 = AbstractC1660k.f17057a;
                                                                            if (z9) {
                                                                            }
                                                                            if (z19) {
                                                                            }
                                                                            max = Math.max(this.f16949d0, r());
                                                                            if (max > r()) {
                                                                            }
                                                                            max2 = Math.max(this.f16951e0, l());
                                                                            if (max2 > l()) {
                                                                            }
                                                                            if (!z10) {
                                                                            }
                                                                            i15 = i14;
                                                                            z20 = z10;
                                                                            i16 = 8;
                                                                            if (i47 > i16) {
                                                                            }
                                                                            i46 = i47;
                                                                            i10 = i15;
                                                                            c1652c2 = c1652c3;
                                                                            arrayList12 = arrayList;
                                                                        }
                                                                    } catch (Exception e17) {
                                                                        e = e17;
                                                                        i14 = i10;
                                                                        arrayList = arrayList12;
                                                                        c1652c3 = c1652c9;
                                                                    }
                                                                    boolean[] zArr2222222 = AbstractC1660k.f17057a;
                                                                    if (z9) {
                                                                        zArr2222222[2] = false;
                                                                        boolean X7 = X(64);
                                                                        R(cVar, X7);
                                                                        int size6 = this.f17003u0.size();
                                                                        int i49 = 0;
                                                                        z11 = false;
                                                                        while (i49 < size6) {
                                                                            C1654e c1654e13 = (C1654e) this.f17003u0.get(i49);
                                                                            c1654e13.R(cVar, X7);
                                                                            boolean z21 = X7;
                                                                            int i50 = size6;
                                                                            if (c1654e13.f16956h != -1 || c1654e13.f16958i != -1) {
                                                                                z11 = true;
                                                                            }
                                                                            i49++;
                                                                            X7 = z21;
                                                                            size6 = i50;
                                                                        }
                                                                    } else {
                                                                        R(cVar, X6);
                                                                        for (int i51 = 0; i51 < i12; i51++) {
                                                                            ((C1654e) this.f17003u0.get(i51)).R(cVar, X6);
                                                                        }
                                                                        z11 = false;
                                                                    }
                                                                    if (z19 && i47 < 8 && zArr2222222[2]) {
                                                                        int i52 = 0;
                                                                        int i53 = 0;
                                                                        for (i17 = 0; i17 < i12; i17++) {
                                                                            C1654e c1654e14 = (C1654e) this.f17003u0.get(i17);
                                                                            i53 = Math.max(i53, c1654e14.r() + c1654e14.f16944a0);
                                                                            i52 = Math.max(i52, c1654e14.l() + c1654e14.f16946b0);
                                                                        }
                                                                        max3 = Math.max(this.f16949d0, i53);
                                                                        max4 = Math.max(this.f16951e0, i52);
                                                                        if (enumC1653d2 == enumC1653d4 && r() < max3) {
                                                                            P(max3);
                                                                            this.f16937U[0] = enumC1653d4;
                                                                            z11 = true;
                                                                            z10 = true;
                                                                        }
                                                                        if (enumC1653d3 == enumC1653d4 && l() < max4) {
                                                                            M(max4);
                                                                            this.f16937U[1] = enumC1653d4;
                                                                            z11 = true;
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                    max = Math.max(this.f16949d0, r());
                                                                    if (max > r()) {
                                                                        P(max);
                                                                        this.f16937U[0] = enumC1653d5;
                                                                        z11 = true;
                                                                        z10 = true;
                                                                    }
                                                                    max2 = Math.max(this.f16951e0, l());
                                                                    if (max2 > l()) {
                                                                        M(max2);
                                                                        r7 = 1;
                                                                        this.f16937U[1] = enumC1653d5;
                                                                        z11 = true;
                                                                        z10 = true;
                                                                    } else {
                                                                        r7 = 1;
                                                                    }
                                                                    if (!z10) {
                                                                        if (this.f16937U[0] == enumC1653d4 && i11 > 0 && r() > i11) {
                                                                            this.f16995I0 = r7;
                                                                            this.f16937U[0] = enumC1653d5;
                                                                            P(i11);
                                                                            z11 = r7;
                                                                            z10 = z11;
                                                                        }
                                                                        if (this.f16937U[r7] == enumC1653d4 && i14 > 0) {
                                                                            i15 = i14;
                                                                            if (l() > i15) {
                                                                                this.f16996J0 = r7;
                                                                                this.f16937U[r7] = enumC1653d5;
                                                                                M(i15);
                                                                                i16 = 8;
                                                                                z20 = true;
                                                                                z11 = true;
                                                                                z7 = i47 > i16 ? false : z11;
                                                                                i46 = i47;
                                                                                i10 = i15;
                                                                                c1652c2 = c1652c3;
                                                                                arrayList12 = arrayList;
                                                                            }
                                                                            z20 = z10;
                                                                            i16 = 8;
                                                                            if (i47 > i16) {
                                                                            }
                                                                            i46 = i47;
                                                                            i10 = i15;
                                                                            c1652c2 = c1652c3;
                                                                            arrayList12 = arrayList;
                                                                        }
                                                                    }
                                                                    i15 = i14;
                                                                    z20 = z10;
                                                                    i16 = 8;
                                                                    if (i47 > i16) {
                                                                    }
                                                                    i46 = i47;
                                                                    i10 = i15;
                                                                    c1652c2 = c1652c3;
                                                                    arrayList12 = arrayList;
                                                                }
                                                            }
                                                            i14 = i10;
                                                            arrayList = arrayList12;
                                                            c1652c3 = c1652c2;
                                                            z10 = z20;
                                                            weakReference2 = this.f16999M0;
                                                            if (weakReference2 != null) {
                                                                C1652c c1652c102 = (C1652c) this.f16999M0.get();
                                                                t.f k102 = cVar.k(this.f16929M);
                                                                t.c cVar82 = this.f16987A0;
                                                                cVar82.f(k102, cVar82.k(c1652c102), 0, 5);
                                                                this.f16999M0 = null;
                                                            }
                                                            weakReference3 = this.f16998L0;
                                                            if (weakReference3 != null) {
                                                                C1652c c1652c112 = (C1652c) this.f16998L0.get();
                                                                c1652c4 = c1652c;
                                                                t.f k112 = cVar.k(c1652c4);
                                                                t.c cVar92 = this.f16987A0;
                                                                c1652c = c1652c4;
                                                                cVar92.f(cVar92.k(c1652c112), k112, 0, 5);
                                                                this.f16998L0 = null;
                                                            }
                                                            weakReference4 = this.f17000N0;
                                                            if (weakReference4 == null) {
                                                            }
                                                            cVar.p();
                                                            z9 = true;
                                                            boolean[] zArr22222222 = AbstractC1660k.f17057a;
                                                            if (z9) {
                                                            }
                                                            if (z19) {
                                                                int i522 = 0;
                                                                int i532 = 0;
                                                                while (i17 < i12) {
                                                                }
                                                                max3 = Math.max(this.f16949d0, i532);
                                                                max4 = Math.max(this.f16951e0, i522);
                                                                if (enumC1653d2 == enumC1653d4) {
                                                                    P(max3);
                                                                    this.f16937U[0] = enumC1653d4;
                                                                    z11 = true;
                                                                    z10 = true;
                                                                }
                                                                if (enumC1653d3 == enumC1653d4) {
                                                                    M(max4);
                                                                    this.f16937U[1] = enumC1653d4;
                                                                    z11 = true;
                                                                    z10 = true;
                                                                }
                                                            }
                                                            max = Math.max(this.f16949d0, r());
                                                            if (max > r()) {
                                                            }
                                                            max2 = Math.max(this.f16951e0, l());
                                                            if (max2 > l()) {
                                                            }
                                                            if (!z10) {
                                                            }
                                                            i15 = i14;
                                                            z20 = z10;
                                                            i16 = 8;
                                                            if (i47 > i16) {
                                                            }
                                                            i46 = i47;
                                                            i10 = i15;
                                                            c1652c2 = c1652c3;
                                                            arrayList12 = arrayList;
                                                        }
                                                        z8 = z20;
                                                        this.f17003u0 = arrayList12;
                                                        if (z8) {
                                                            EnumC1653d[] enumC1653dArr9 = this.f16937U;
                                                            enumC1653dArr9[0] = enumC1653d2;
                                                            enumC1653dArr9[1] = enumC1653d3;
                                                        }
                                                        G(cVar.f16240l);
                                                    }
                                                    M(i20);
                                                    this.f16996J0 = true;
                                                } else {
                                                    i20 = i8;
                                                }
                                                i21 = i20;
                                                i10 = i21;
                                                i11 = i19;
                                                z4 = true;
                                                if (X(64)) {
                                                }
                                                cVar.getClass();
                                                cVar.f16236g = false;
                                                if (this.f16994H0 == 0) {
                                                }
                                                c3 = 1;
                                                ArrayList arrayList122 = this.f17003u0;
                                                EnumC1653d[] enumC1653dArr82 = this.f16937U;
                                                if (enumC1653dArr82[0] != enumC1653d4) {
                                                }
                                                this.f16990D0 = 0;
                                                this.f16991E0 = 0;
                                                i12 = i9;
                                                while (i13 < i12) {
                                                }
                                                boolean X62 = X(64);
                                                boolean z202 = z4;
                                                int i462 = 0;
                                                z7 = true;
                                                while (z7) {
                                                }
                                                z8 = z202;
                                                this.f17003u0 = arrayList122;
                                                if (z8) {
                                                }
                                                G(cVar.f16240l);
                                            }
                                            P(i18);
                                            this.f16995I0 = true;
                                        } else {
                                            i18 = i7;
                                        }
                                        i19 = i18;
                                        enumC1653d3 = enumC1653d7;
                                        if (enumC1653d3 != enumC1653d4) {
                                        }
                                        i21 = i20;
                                        i10 = i21;
                                        i11 = i19;
                                        z4 = true;
                                        if (X(64)) {
                                        }
                                        cVar.getClass();
                                        cVar.f16236g = false;
                                        if (this.f16994H0 == 0) {
                                        }
                                        c3 = 1;
                                        ArrayList arrayList1222 = this.f17003u0;
                                        EnumC1653d[] enumC1653dArr822 = this.f16937U;
                                        if (enumC1653dArr822[0] != enumC1653d4) {
                                        }
                                        this.f16990D0 = 0;
                                        this.f16991E0 = 0;
                                        i12 = i9;
                                        while (i13 < i12) {
                                        }
                                        boolean X622 = X(64);
                                        boolean z2022 = z4;
                                        int i4622 = 0;
                                        z7 = true;
                                        while (z7) {
                                        }
                                        z8 = z2022;
                                        this.f17003u0 = arrayList1222;
                                        if (z8) {
                                        }
                                        G(cVar.f16240l);
                                    }
                                }
                            }
                            mVar2 = null;
                            if (mVar == null) {
                            }
                            enumC1653d2 = enumC1653d6;
                            if (enumC1653d2 == enumC1653d4) {
                            }
                            i19 = i18;
                            enumC1653d3 = enumC1653d7;
                            if (enumC1653d3 != enumC1653d4) {
                            }
                            i21 = i20;
                            i10 = i21;
                            i11 = i19;
                            z4 = true;
                            if (X(64)) {
                            }
                            cVar.getClass();
                            cVar.f16236g = false;
                            if (this.f16994H0 == 0) {
                            }
                            c3 = 1;
                            ArrayList arrayList12222 = this.f17003u0;
                            EnumC1653d[] enumC1653dArr8222 = this.f16937U;
                            if (enumC1653dArr8222[0] != enumC1653d4) {
                            }
                            this.f16990D0 = 0;
                            this.f16991E0 = 0;
                            i12 = i9;
                            while (i13 < i12) {
                            }
                            boolean X6222 = X(64);
                            boolean z20222 = z4;
                            int i46222 = 0;
                            z7 = true;
                            while (z7) {
                            }
                            z8 = z20222;
                            this.f17003u0 = arrayList12222;
                            if (z8) {
                            }
                            G(cVar.f16240l);
                        }
                    } else {
                        enumC1653d5 = enumC1653d26;
                        cVar = cVar6;
                    }
                    mVar = null;
                    if (this.f16937U[1] == enumC1653d4) {
                    }
                    mVar2 = null;
                    if (mVar == null) {
                    }
                    enumC1653d2 = enumC1653d6;
                    if (enumC1653d2 == enumC1653d4) {
                    }
                    i19 = i18;
                    enumC1653d3 = enumC1653d7;
                    if (enumC1653d3 != enumC1653d4) {
                    }
                    i21 = i20;
                    i10 = i21;
                    i11 = i19;
                    z4 = true;
                    if (X(64)) {
                    }
                    cVar.getClass();
                    cVar.f16236g = false;
                    if (this.f16994H0 == 0) {
                    }
                    c3 = 1;
                    ArrayList arrayList122222 = this.f17003u0;
                    EnumC1653d[] enumC1653dArr82222 = this.f16937U;
                    if (enumC1653dArr82222[0] != enumC1653d4) {
                    }
                    this.f16990D0 = 0;
                    this.f16991E0 = 0;
                    i12 = i9;
                    while (i13 < i12) {
                    }
                    boolean X62222 = X(64);
                    boolean z202222 = z4;
                    int i462222 = 0;
                    z7 = true;
                    while (z7) {
                    }
                    z8 = z202222;
                    this.f17003u0 = arrayList122222;
                    if (z8) {
                    }
                    G(cVar.f16240l);
                }
                enumC1653d5 = enumC1653d26;
                cVar = cVar6;
                enumC1653d4 = enumC1653d25;
                i10 = i8;
                i11 = i7;
                enumC1653d2 = enumC1653d6;
                enumC1653d3 = enumC1653d7;
                z4 = false;
                if (X(64)) {
                }
                cVar.getClass();
                cVar.f16236g = false;
                if (this.f16994H0 == 0) {
                }
                c3 = 1;
                ArrayList arrayList1222222 = this.f17003u0;
                EnumC1653d[] enumC1653dArr822222 = this.f16937U;
                if (enumC1653dArr822222[0] != enumC1653d4) {
                }
                this.f16990D0 = 0;
                this.f16991E0 = 0;
                i12 = i9;
                while (i13 < i12) {
                }
                boolean X622222 = X(64);
                boolean z2022222 = z4;
                int i4622222 = 0;
                z7 = true;
                while (z7) {
                }
                z8 = z2022222;
                this.f17003u0 = arrayList1222222;
                if (z8) {
                }
                G(cVar.f16240l);
            }
            i9 = size;
            cVar = cVar4;
            enumC1653d2 = enumC1653d10;
            c1652c2 = c1652c5;
            enumC1653d3 = enumC1653d16;
            i10 = i8;
            i11 = i7;
        } else {
            i9 = size;
            cVar = cVar4;
            enumC1653d2 = enumC1653d10;
            c1652c2 = c1652c5;
            i10 = i8;
            i11 = i7;
            enumC1653d3 = enumC1653d;
        }
        enumC1653d4 = enumC1653d15;
        enumC1653d5 = enumC1653d12;
        z4 = false;
        if (X(64)) {
        }
        cVar.getClass();
        cVar.f16236g = false;
        if (this.f16994H0 == 0) {
        }
        c3 = 1;
        ArrayList arrayList12222222 = this.f17003u0;
        EnumC1653d[] enumC1653dArr8222222 = this.f16937U;
        if (enumC1653dArr8222222[0] != enumC1653d4) {
        }
        this.f16990D0 = 0;
        this.f16991E0 = 0;
        i12 = i9;
        while (i13 < i12) {
        }
        boolean X6222222 = X(64);
        boolean z20222222 = z4;
        int i46222222 = 0;
        z7 = true;
        while (z7) {
        }
        z8 = z20222222;
        this.f17003u0 = arrayList12222222;
        if (z8) {
        }
        G(cVar.f16240l);
    }

    public final boolean X(int i7) {
        return (this.f16994H0 & i7) == i7;
    }

    @Override // v.C1654e
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f16939W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f16940X);
        sb.append("\n");
        Iterator it = this.f17003u0.iterator();
        while (it.hasNext()) {
            ((C1654e) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
