package Z;

import P.AbstractC0316s0;
import S3.C0416t;
import java.util.ArrayList;
import java.util.HashMap;
import r.C2322H;
import r.P;

/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6175n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final i4.c f6176e;
    public final i4.c f;

    /* renamed from: g, reason: collision with root package name */
    public int f6177g;

    /* renamed from: h, reason: collision with root package name */
    public C2322H f6178h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public j f6179j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f6180k;

    /* renamed from: l, reason: collision with root package name */
    public int f6181l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6182m;

    public b(long j5, j jVar, i4.c cVar, i4.c cVar2) {
        super(j5, jVar);
        this.f6176e = cVar;
        this.f = cVar2;
        this.f6179j = j.f6198o;
        this.f6180k = f6175n;
        this.f6181l = 1;
    }

    public final void A(long j5) {
        synchronized (l.f6208c) {
            this.f6179j = this.f6179j.g(j5);
        }
    }

    public final void B(j jVar) {
        synchronized (l.f6208c) {
            this.f6179j = this.f6179j.f(jVar);
        }
    }

    public void C(C2322H c2322h) {
        this.f6178h = c2322h;
    }

    public b D(i4.c cVar, i4.c cVar2) {
        if (this.f6189c) {
            AbstractC0316s0.a("Cannot use a disposed snapshot");
        }
        if (this.f6182m && this.f6190d < 0) {
            AbstractC0316s0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f6208c;
        synchronized (obj) {
            try {
                long j5 = l.f6210e;
                long j6 = 1;
                l.f6210e = j5 + j6;
                l.f6209d = l.f6209d.g(j5);
                j d5 = d();
                r(d5.g(j5));
                try {
                    c cVar3 = new c(j5, l.e(d5, g() + j6, j5), l.l(cVar, e(), true), l.b(cVar2, i()), this);
                    if (this.f6182m || this.f6189c) {
                        return cVar3;
                    }
                    long g5 = g();
                    synchronized (obj) {
                        long j7 = l.f6210e;
                        l.f6210e = j7 + j6;
                        s(j7);
                        l.f6209d = l.f6209d.g(g());
                    }
                    r(l.e(d(), g5 + j6, g()));
                    return cVar3;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // Z.f
    public final void b() {
        l.f6209d = l.f6209d.d(g()).c(this.f6179j);
    }

    @Override // Z.f
    public void c() {
        if (this.f6189c) {
            return;
        }
        this.f6189c = true;
        synchronized (l.f6208c) {
            o();
        }
        l();
    }

    @Override // Z.f
    public boolean f() {
        return false;
    }

    @Override // Z.f
    public int h() {
        return this.f6177g;
    }

    @Override // Z.f
    public i4.c i() {
        return this.f;
    }

    @Override // Z.f
    public void k() {
        this.f6181l++;
    }

    @Override // Z.f
    public void l() {
        if (this.f6181l <= 0) {
            AbstractC0316s0.a("no pending nested snapshots");
        }
        int i = this.f6181l - 1;
        this.f6181l = i;
        if (i != 0 || this.f6182m) {
            return;
        }
        C2322H x5 = x();
        if (x5 != null) {
            if (this.f6182m) {
                AbstractC0316s0.b("Unsupported operation on a snapshot that has been applied");
            }
            C(null);
            long g5 = g();
            Object[] objArr = x5.f18934b;
            long[] jArr = x5.f18933a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                for (w c5 = ((u) objArr[(i5 << 3) + i7]).c(); c5 != null; c5 = c5.f6243b) {
                                    long j6 = c5.f6242a;
                                    if (j6 == g5 || X3.m.V(this.f6179j, Long.valueOf(j6))) {
                                        C0416t c0416t = l.f6206a;
                                        c5.f6242a = 0L;
                                    }
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        a();
    }

    @Override // Z.f
    public void m() {
        if (this.f6182m || this.f6189c) {
            return;
        }
        v();
    }

    @Override // Z.f
    public void n(u uVar) {
        C2322H x5 = x();
        if (x5 == null) {
            int i = P.f18958a;
            x5 = new C2322H();
            C(x5);
        }
        x5.a(uVar);
    }

    @Override // Z.f
    public final void p() {
        int length = this.f6180k.length;
        for (int i = 0; i < length; i++) {
            l.v(this.f6180k[i]);
        }
        o();
    }

    @Override // Z.f
    public void t(int i) {
        this.f6177g = i;
    }

    @Override // Z.f
    public f u(i4.c cVar) {
        if (this.f6189c) {
            AbstractC0316s0.a("Cannot use a disposed snapshot");
        }
        if (this.f6182m && this.f6190d < 0) {
            AbstractC0316s0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g5 = g();
        boolean z3 = this instanceof a;
        A(g());
        Object obj = l.f6208c;
        synchronized (obj) {
            try {
                long j5 = l.f6210e;
                long j6 = 1;
                l.f6210e = j5 + j6;
                l.f6209d = l.f6209d.g(j5);
                try {
                    d dVar = new d(j5, l.e(d(), g5 + j6, j5), l.l(cVar, e(), true), this);
                    if (this.f6182m || this.f6189c) {
                        return dVar;
                    }
                    long g6 = g();
                    synchronized (obj) {
                        long j7 = l.f6210e;
                        l.f6210e = j7 + j6;
                        s(j7);
                        l.f6209d = l.f6209d.g(g());
                    }
                    r(l.e(d(), g6 + j6, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j5;
        A(g());
        if (this.f6182m || this.f6189c) {
            return;
        }
        long g5 = g();
        synchronized (l.f6208c) {
            long j6 = l.f6210e;
            j5 = 1;
            l.f6210e = j6 + j5;
            s(j6);
            l.f6209d = l.f6209d.g(g());
        }
        r(l.e(d(), g5 + j5, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q w() {
        HashMap hashMap;
        X3.v vVar;
        C2322H c2322h;
        long j5;
        long j6;
        ArrayList arrayList;
        int size;
        int i;
        C2322H x5 = x();
        if (x5 != null) {
            long j7 = l.f6213j.f6188b;
            hashMap = l.c(j7, this, l.f6209d.d(j7));
        } else {
            hashMap = null;
        }
        X3.v vVar2 = X3.v.f6090k;
        synchronized (l.f6208c) {
            try {
                l.d(this);
                if (x5 != null && x5.f18936d != 0) {
                    a aVar = l.f6213j;
                    q z3 = z(l.f6210e, x5, hashMap, l.f6209d.d(aVar.f6188b));
                    if (!z3.equals(h.f6191b)) {
                        return z3;
                    }
                    b();
                    c2322h = aVar.f6178h;
                    l.w(aVar, l.f6206a);
                    C(null);
                    aVar.f6178h = null;
                    vVar = l.f6212h;
                    this.f6182m = true;
                    if (c2322h != null) {
                        R.h hVar = new R.h(c2322h);
                        if (!c2322h.g()) {
                            int size2 = vVar.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                ((i4.e) vVar.get(i5)).invoke(hVar, this);
                            }
                        }
                    }
                    if (x5 != null && x5.h()) {
                        R.h hVar2 = new R.h(x5);
                        size = vVar.size();
                        for (i = 0; i < size; i++) {
                            ((i4.e) vVar.get(i)).invoke(hVar2, this);
                        }
                    }
                    synchronized (l.f6208c) {
                        try {
                            p();
                            l.g();
                            if (c2322h != null) {
                                Object[] objArr = c2322h.f18934b;
                                long[] jArr = c2322h.f18933a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    j5 = 128;
                                    while (true) {
                                        long j8 = jArr[i6];
                                        j6 = 255;
                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                            for (int i8 = 0; i8 < i7; i8++) {
                                                if ((j8 & 255) < 128) {
                                                    l.r((u) objArr[(i6 << 3) + i8]);
                                                }
                                                j8 >>= 8;
                                            }
                                            if (i7 != 8) {
                                                break;
                                            }
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (x5 != null) {
                                        Object[] objArr2 = x5.f18934b;
                                        long[] jArr2 = x5.f18933a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i9 = 0;
                                            while (true) {
                                                long j9 = jArr2[i9];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                    for (int i11 = 0; i11 < i10; i11++) {
                                                        if ((j9 & j6) < j5) {
                                                            l.r((u) objArr2[(i9 << 3) + i11]);
                                                        }
                                                        j9 >>= 8;
                                                    }
                                                    if (i10 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i9 == length2) {
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i12 = 0; i12 < size3; i12++) {
                                            l.r((u) arrayList.get(i12));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j5 = 128;
                            j6 = 255;
                            if (x5 != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return h.f6191b;
                }
                b();
                a aVar2 = l.f6213j;
                C2322H c2322h2 = aVar2.f6178h;
                l.w(aVar2, l.f6206a);
                if (c2322h2 == null || !c2322h2.h()) {
                    vVar = vVar2;
                    c2322h = null;
                } else {
                    vVar = l.f6212h;
                    c2322h = c2322h2;
                }
                this.f6182m = true;
                if (c2322h != null) {
                }
                if (x5 != null) {
                    R.h hVar22 = new R.h(x5);
                    size = vVar.size();
                    while (i < size) {
                    }
                }
                synchronized (l.f6208c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C2322H x() {
        return this.f6178h;
    }

    @Override // Z.f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public i4.c e() {
        return this.f6176e;
    }

    public final q z(long j5, C2322H c2322h, HashMap hashMap, j jVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j6;
        ArrayList arrayList4;
        w f;
        j f5 = d().g(g()).f(this.f6179j);
        Object[] objArr3 = c2322h.f18934b;
        long[] jArr3 = c2322h.f18933a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j7 = jArr3[i5];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j7 & 255) < 128) {
                            objArr2 = objArr3;
                            u uVar = (u) objArr3[(i5 << 3) + i7];
                            jArr2 = jArr3;
                            w c5 = uVar.c();
                            i = i7;
                            ArrayList arrayList5 = arrayList3;
                            w t5 = l.t(c5, j5, jVar);
                            if (t5 == null) {
                                jVar3 = f5;
                                arrayList4 = arrayList2;
                                j6 = j7;
                            } else {
                                arrayList4 = arrayList2;
                                j6 = j7;
                                w t6 = l.t(c5, g(), f5);
                                if (t6 == null) {
                                    jVar3 = f5;
                                } else {
                                    jVar3 = f5;
                                    if (t6.f6242a != 1 && !t5.equals(t6)) {
                                        w t7 = l.t(c5, g(), d());
                                        if (t7 == null) {
                                            l.s();
                                            throw null;
                                        }
                                        if (hashMap == null || (f = (w) hashMap.get(t5)) == null) {
                                            f = uVar.f(t6, t5, t7);
                                        }
                                        if (f == null) {
                                            return new g();
                                        }
                                        if (!f.equals(t7)) {
                                            if (f.equals(t5)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new W3.h(uVar, t5.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(uVar);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!f.equals(t6) ? new W3.h(uVar, f) : new W3.h(uVar, t6.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            jVar3 = f5;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i7;
                            j6 = j7;
                        }
                        j7 = j6 >> 8;
                        i7 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        f5 = jVar3;
                    }
                    jVar2 = f5;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    jVar2 = f5;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i5 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i5++;
                jArr3 = jArr;
                objArr3 = objArr;
                f5 = jVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i8 = 0; i8 < size; i8++) {
                W3.h hVar = (W3.h) arrayList3.get(i8);
                u uVar2 = (u) hVar.f6036k;
                w wVar = (w) hVar.f6037l;
                wVar.f6242a = j5;
                synchronized (l.f6208c) {
                    wVar.f6243b = uVar2.c();
                    uVar2.e(wVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                c2322h.k((u) arrayList2.get(i9));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = X3.m.i0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return h.f6191b;
    }
}
