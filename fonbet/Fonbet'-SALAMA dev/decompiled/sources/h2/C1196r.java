package h2;

import A1.C0011c;
import A1.K0;
import A1.X;
import B.v;
import C1.C0095a;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c2.C0796b;
import c2.C0814u;
import c2.C0819z;
import c2.U;
import c2.Y;
import c2.e0;
import c2.f0;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import e2.AbstractC1008e;
import e3.C1023h;
import i2.AbstractC1252h;
import i2.C1246b;
import i2.C1247c;
import i2.C1249e;
import i2.C1251g;
import i2.C1254j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import n1.C1450e;
import u2.C1640q;
import u2.D;
import u2.F;
import u2.H;
import u2.I;
import u2.InterfaceC1636m;
import u2.K;
import v2.AbstractC1664a;
import v2.t;
import w1.C1719l1;

/* renamed from: h2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196r implements F, I, Y, F1.m, U {

    /* renamed from: p0, reason: collision with root package name */
    public static final Set f13469p0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public final K f13470A = new K("Loader:HlsSampleStreamWrapper");

    /* renamed from: B, reason: collision with root package name */
    public final c2.I f13471B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13472C;

    /* renamed from: D, reason: collision with root package name */
    public final C0011c f13473D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f13474E;

    /* renamed from: F, reason: collision with root package name */
    public final List f13475F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC1193o f13476G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC1193o f13477H;

    /* renamed from: I, reason: collision with root package name */
    public final Handler f13478I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f13479J;

    /* renamed from: K, reason: collision with root package name */
    public final Map f13480K;

    /* renamed from: L, reason: collision with root package name */
    public AbstractC1008e f13481L;

    /* renamed from: M, reason: collision with root package name */
    public C1195q[] f13482M;

    /* renamed from: N, reason: collision with root package name */
    public int[] f13483N;

    /* renamed from: O, reason: collision with root package name */
    public final HashSet f13484O;

    /* renamed from: P, reason: collision with root package name */
    public final SparseIntArray f13485P;

    /* renamed from: Q, reason: collision with root package name */
    public C1194p f13486Q;

    /* renamed from: R, reason: collision with root package name */
    public int f13487R;

    /* renamed from: S, reason: collision with root package name */
    public int f13488S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f13489T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f13490U;

    /* renamed from: V, reason: collision with root package name */
    public int f13491V;

    /* renamed from: W, reason: collision with root package name */
    public X f13492W;

    /* renamed from: X, reason: collision with root package name */
    public X f13493X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13494Y;

    /* renamed from: Z, reason: collision with root package name */
    public f0 f13495Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f13496a;

    /* renamed from: a0, reason: collision with root package name */
    public Set f13497a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f13498b;

    /* renamed from: b0, reason: collision with root package name */
    public int[] f13499b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1450e f13500c;
    public int c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1187i f13501d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f13502d0;

    /* renamed from: e, reason: collision with root package name */
    public final u2.r f13503e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean[] f13504e0;

    /* renamed from: f, reason: collision with root package name */
    public final X f13505f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean[] f13506f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f13507g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f13508h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f13509i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13510j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f13511k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f13512l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f13513m0;

    /* renamed from: n0, reason: collision with root package name */
    public DrmInitData f13514n0;

    /* renamed from: o0, reason: collision with root package name */
    public C1189k f13515o0;

    /* renamed from: x, reason: collision with root package name */
    public final E1.h f13516x;

    /* renamed from: y, reason: collision with root package name */
    public final B1.m f13517y;

    /* renamed from: z, reason: collision with root package name */
    public final M4.e f13518z;

    /* JADX WARN: Type inference failed for: r1v12, types: [h2.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h2.o] */
    public C1196r(String str, int i7, C1450e c1450e, C1187i c1187i, Map map, u2.r rVar, long j, X x4, E1.h hVar, B1.m mVar, M4.e eVar, c2.I i8, int i9) {
        this.f13496a = str;
        this.f13498b = i7;
        this.f13500c = c1450e;
        this.f13501d = c1187i;
        this.f13480K = map;
        this.f13503e = rVar;
        this.f13505f = x4;
        this.f13516x = hVar;
        this.f13517y = mVar;
        this.f13518z = eVar;
        this.f13471B = i8;
        this.f13472C = i9;
        C0011c c0011c = new C0011c(5);
        c0011c.f333c = null;
        c0011c.f332b = false;
        c0011c.f334d = null;
        this.f13473D = c0011c;
        this.f13483N = new int[0];
        Set set = f13469p0;
        this.f13484O = new HashSet(set.size());
        this.f13485P = new SparseIntArray(set.size());
        this.f13482M = new C1195q[0];
        this.f13506f0 = new boolean[0];
        this.f13504e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f13474E = arrayList;
        this.f13475F = Collections.unmodifiableList(arrayList);
        this.f13479J = new ArrayList();
        final int i10 = 0;
        this.f13476G = new Runnable(this) { // from class: h2.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1196r f13459b;

            {
                this.f13459b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f13459b.u();
                        break;
                    default:
                        C1196r c1196r = this.f13459b;
                        c1196r.f13489T = true;
                        c1196r.u();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f13477H = new Runnable(this) { // from class: h2.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1196r f13459b;

            {
                this.f13459b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f13459b.u();
                        break;
                    default:
                        C1196r c1196r = this.f13459b;
                        c1196r.f13489T = true;
                        c1196r.u();
                        break;
                }
            }
        };
        this.f13478I = t.m(null);
        this.f13507g0 = j;
        this.f13508h0 = j;
    }

    public static F1.j d(int i7, int i8) {
        Log.w("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new F1.j();
    }

    public static X f(X x4, X x7, boolean z4) {
        String str;
        String str2;
        if (x4 == null) {
            return x7;
        }
        String str3 = x7.f283C;
        int g3 = v2.i.g(str3);
        String str4 = x4.f312z;
        if (t.p(g3, str4) == 1) {
            str2 = t.q(g3, str4);
            str = v2.i.c(str2);
        } else {
            String a2 = v2.i.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        Format$Builder a4 = x7.a();
        a4.f10528a = x4.f304a;
        a4.f10529b = x4.f305b;
        a4.f10530c = x4.f306c;
        a4.f10531d = x4.f307d;
        a4.f10532e = x4.f308e;
        a4.f10533f = z4 ? x4.f309f : -1;
        a4.f10534g = z4 ? x4.f310x : -1;
        a4.f10535h = str2;
        if (g3 == 2) {
            a4.f10542p = x4.f288H;
            a4.f10543q = x4.f289I;
            a4.f10544r = x4.f290J;
        }
        if (str != null) {
            a4.f10537k = str;
        }
        int i7 = x4.f296P;
        if (i7 != -1 && g3 == 1) {
            a4.f10550x = i7;
        }
        Metadata metadata = x4.f281A;
        if (metadata != null) {
            Metadata metadata2 = x7.f281A;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f10562a;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    Metadata.Entry[] entryArr2 = metadata2.f10562a;
                    Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata((Metadata.Entry[]) copyOf);
                }
            }
            a4.f10536i = metadata;
        }
        return new X(a4);
    }

    public static int s(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        for (C1195q c1195q : this.f13482M) {
            c1195q.y(this.f13509i0);
        }
        this.f13509i0 = false;
    }

    public final boolean B(long j, boolean z4) {
        int i7;
        this.f13507g0 = j;
        if (t()) {
            this.f13508h0 = j;
            return true;
        }
        if (this.f13489T && !z4) {
            int length = this.f13482M.length;
            for (0; i7 < length; i7 + 1) {
                i7 = (this.f13482M[i7].z(j, false) || (!this.f13506f0[i7] && this.f13502d0)) ? i7 + 1 : 0;
            }
            return false;
        }
        this.f13508h0 = j;
        this.f13511k0 = false;
        this.f13474E.clear();
        K k7 = this.f13470A;
        if (k7.d()) {
            if (this.f13489T) {
                for (C1195q c1195q : this.f13482M) {
                    c1195q.h();
                }
            }
            k7.a();
        } else {
            k7.f16727c = null;
            A();
        }
        return true;
    }

    @Override // c2.Y
    public final long T() {
        long j;
        if (this.f13511k0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f13508h0;
        }
        long j3 = this.f13507g0;
        C1189k j7 = j();
        if (!j7.f13416Y) {
            ArrayList arrayList = this.f13474E;
            j7 = arrayList.size() > 1 ? (C1189k) arrayList.get(arrayList.size() - 2) : null;
        }
        if (j7 != null) {
            j3 = Math.max(j3, j7.f12600y);
        }
        if (this.f13489T) {
            for (C1195q c1195q : this.f13482M) {
                synchronized (c1195q) {
                    j = c1195q.f10288v;
                }
                j3 = Math.max(j3, j);
            }
        }
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // c2.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(long j) {
        int size;
        K k7 = this.f13470A;
        if (k7.b() || t()) {
            return;
        }
        boolean d7 = k7.d();
        C1187i c1187i = this.f13501d;
        if (d7) {
            this.f13481L.getClass();
            if (c1187i.f13386n != null) {
                return;
            }
            c1187i.f13389q.getClass();
            return;
        }
        List list = this.f13475F;
        int size2 = list.size();
        while (size2 > 0 && c1187i.b((C1189k) list.get(size2 - 1)) == 2) {
            size2--;
        }
        if (size2 < list.size()) {
            h(size2);
        }
        if (c1187i.f13386n == null) {
            t2.c cVar = c1187i.f13389q;
            if (cVar.f16298c.length >= 2) {
                size = cVar.d(j, list);
                if (size >= this.f13474E.size()) {
                    h(size);
                    return;
                }
                return;
            }
        }
        size = list.size();
        if (size >= this.f13474E.size()) {
        }
    }

    @Override // u2.I
    public final void a() {
        for (C1195q c1195q : this.f13482M) {
            c1195q.y(true);
            C1719l1 c1719l1 = c1195q.f10275h;
            if (c1719l1 != null) {
                c1719l1.F(c1195q.f10272e);
                c1195q.f10275h = null;
                c1195q.f10274g = null;
            }
        }
    }

    @Override // c2.U
    public final void b() {
        this.f13478I.post(this.f13476G);
    }

    public final void c() {
        AbstractC1664a.h(this.f13490U);
        this.f13495Z.getClass();
        this.f13497a0.getClass();
    }

    public final f0 e(e0[] e0VarArr) {
        for (int i7 = 0; i7 < e0VarArr.length; i7++) {
            e0 e0Var = e0VarArr[i7];
            X[] xArr = new X[e0Var.f10341a];
            for (int i8 = 0; i8 < e0Var.f10341a; i8++) {
                X x4 = e0Var.f10344d[i8];
                int b7 = this.f13516x.b(x4);
                Format$Builder a2 = x4.a();
                a2.f10527D = b7;
                xArr[i8] = new X(a2);
            }
            e0VarArr[i7] = new e0(e0Var.f10342b, xArr);
        }
        return new f0(e0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.F
    public final void g(H h6, long j, long j3) {
        AbstractC1008e abstractC1008e = (AbstractC1008e) h6;
        this.f13481L = null;
        C1187i c1187i = this.f13501d;
        if (abstractC1008e instanceof C1183e) {
            C1183e c1183e = (C1183e) abstractC1008e;
            c1187i.f13385m = c1183e.f13364A;
            Uri uri = c1183e.f12594b.f16808a;
            byte[] bArr = c1183e.f13366C;
            bArr.getClass();
            C1023h c1023h = c1187i.j;
            c1023h.getClass();
            uri.getClass();
        }
        long j7 = abstractC1008e.f12593a;
        Uri uri2 = abstractC1008e.f12601z.f16755c;
        C0814u c0814u = new C0814u();
        this.f13518z.getClass();
        this.f13471B.f(c0814u, abstractC1008e.f12595c, this.f13498b, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
        if (this.f13490U) {
            this.f13500c.b(this);
        } else {
            y(this.f13507g0);
        }
    }

    public final void h(int i7) {
        ArrayList arrayList;
        AbstractC1664a.h(!this.f13470A.d());
        int i8 = i7;
        loop0: while (true) {
            arrayList = this.f13474E;
            if (i8 >= arrayList.size()) {
                i8 = -1;
                break;
            }
            int i9 = i8;
            while (true) {
                if (i9 >= arrayList.size()) {
                    C1189k c1189k = (C1189k) arrayList.get(i8);
                    for (int i10 = 0; i10 < this.f13482M.length; i10++) {
                        if (this.f13482M[i10].n() > c1189k.e(i10)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((C1189k) arrayList.get(i9)).f13396E) {
                    break;
                } else {
                    i9++;
                }
            }
            i8++;
        }
        if (i8 == -1) {
            return;
        }
        long j = j().f12600y;
        C1189k c1189k2 = (C1189k) arrayList.get(i8);
        t.J(arrayList, i8, arrayList.size());
        for (int i11 = 0; i11 < this.f13482M.length; i11++) {
            this.f13482M[i11].j(c1189k2.e(i11));
        }
        if (arrayList.isEmpty()) {
            this.f13508h0 = this.f13507g0;
        } else {
            ((C1189k) AbstractC0158p.f(arrayList)).f13418a0 = true;
        }
        this.f13511k0 = false;
        int i12 = this.f13487R;
        long j3 = c1189k2.f12599x;
        c2.I i13 = this.f13471B;
        i13.m(new C0819z(1, i12, null, 3, null, i13.a(j3), i13.a(j)));
    }

    @Override // u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        boolean z4;
        Q1.e eVar;
        int i8;
        AbstractC1008e abstractC1008e = (AbstractC1008e) h6;
        boolean z7 = abstractC1008e instanceof C1189k;
        if (z7 && !((C1189k) abstractC1008e).f13419b0 && (iOException instanceof D) && ((i8 = ((D) iOException).f16709d) == 410 || i8 == 404)) {
            return K.f16722d;
        }
        long j = abstractC1008e.f12601z.f16754b;
        Uri uri = abstractC1008e.f12601z.f16755c;
        C0814u c0814u = new C0814u();
        t.N(abstractC1008e.f12599x);
        t.N(abstractC1008e.f12600y);
        v vVar = new v(iOException, i7, 11);
        C1187i c1187i = this.f13501d;
        H2.o a2 = q2.g.a(c1187i.f13389q);
        this.f13518z.getClass();
        Q1.e t7 = M4.e.t(a2, vVar);
        if (t7 == null || t7.f5785a != 2) {
            z4 = false;
        } else {
            t2.c cVar = c1187i.f13389q;
            z4 = cVar.a(cVar.h(c1187i.f13381h.a(abstractC1008e.f12596d)), t7.f5786b);
        }
        if (z4) {
            if (z7 && j == 0) {
                ArrayList arrayList = this.f13474E;
                AbstractC1664a.h(((C1189k) arrayList.remove(arrayList.size() - 1)) == abstractC1008e);
                if (arrayList.isEmpty()) {
                    this.f13508h0 = this.f13507g0;
                } else {
                    ((C1189k) AbstractC0158p.f(arrayList)).f13418a0 = true;
                }
            }
            eVar = K.f16723e;
        } else {
            long v6 = M4.e.v(vVar);
            eVar = v6 != -9223372036854775807L ? new Q1.e(v6, 0, false) : K.f16724f;
        }
        boolean a4 = eVar.a();
        this.f13471B.h(c0814u, abstractC1008e.f12595c, this.f13498b, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y, iOException, !a4);
        if (!a4) {
            this.f13481L = null;
        }
        if (z4) {
            if (this.f13490U) {
                this.f13500c.b(this);
            } else {
                y(this.f13507g0);
            }
        }
        return eVar;
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return this.f13470A.d();
    }

    public final C1189k j() {
        return (C1189k) this.f13474E.get(r0.size() - 1);
    }

    @Override // c2.Y
    public final long k() {
        if (t()) {
            return this.f13508h0;
        }
        if (this.f13511k0) {
            return Long.MIN_VALUE;
        }
        return j().f12600y;
    }

    @Override // u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        AbstractC1008e abstractC1008e = (AbstractC1008e) h6;
        this.f13481L = null;
        long j7 = abstractC1008e.f12593a;
        Uri uri = abstractC1008e.f12601z.f16755c;
        C0814u c0814u = new C0814u();
        this.f13518z.getClass();
        this.f13471B.d(c0814u, abstractC1008e.f12595c, this.f13498b, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
        if (z4) {
            return;
        }
        if (t() || this.f13491V == 0) {
            A();
        }
        if (this.f13491V > 0) {
            this.f13500c.b(this);
        }
    }

    @Override // F1.m
    public final void n() {
        this.f13512l0 = true;
        this.f13478I.post(this.f13477H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [F1.j] */
    @Override // F1.m
    public final F1.v r(int i7, int i8) {
        Integer valueOf = Integer.valueOf(i8);
        Set set = f13469p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f13484O;
        SparseIntArray sparseIntArray = this.f13485P;
        C1195q c1195q = null;
        if (contains) {
            AbstractC1664a.f(set.contains(Integer.valueOf(i8)));
            int i9 = sparseIntArray.get(i8, -1);
            if (i9 != -1) {
                if (hashSet.add(Integer.valueOf(i8))) {
                    this.f13483N[i9] = i7;
                }
                c1195q = this.f13483N[i9] == i7 ? this.f13482M[i9] : d(i7, i8);
            }
        } else {
            int i10 = 0;
            while (true) {
                C1195q[] c1195qArr = this.f13482M;
                if (i10 >= c1195qArr.length) {
                    break;
                }
                if (this.f13483N[i10] == i7) {
                    c1195q = c1195qArr[i10];
                    break;
                }
                i10++;
            }
        }
        if (c1195q == null) {
            if (this.f13512l0) {
                return d(i7, i8);
            }
            int length = this.f13482M.length;
            boolean z4 = i8 == 1 || i8 == 2;
            c1195q = new C1195q(this.f13503e, this.f13516x, this.f13517y, this.f13480K);
            c1195q.f10286t = this.f13507g0;
            if (z4) {
                c1195q.f13468I = this.f13514n0;
                c1195q.f10292z = true;
            }
            long j = this.f13513m0;
            if (c1195q.f10266F != j) {
                c1195q.f10266F = j;
                c1195q.f10292z = true;
            }
            C1189k c1189k = this.f13515o0;
            if (c1189k != null) {
                c1195q.f10263C = c1189k.f13393B;
            }
            c1195q.f10273f = this;
            int i11 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f13483N, i11);
            this.f13483N = copyOf;
            copyOf[length] = i7;
            C1195q[] c1195qArr2 = this.f13482M;
            int i12 = t.f17153a;
            Object[] copyOf2 = Arrays.copyOf(c1195qArr2, c1195qArr2.length + 1);
            copyOf2[c1195qArr2.length] = c1195q;
            this.f13482M = (C1195q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f13506f0, i11);
            this.f13506f0 = copyOf3;
            copyOf3[length] = z4;
            this.f13502d0 |= z4;
            hashSet.add(Integer.valueOf(i8));
            sparseIntArray.append(i8, length);
            if (s(i8) > s(this.f13487R)) {
                this.f13488S = length;
                this.f13487R = i8;
            }
            this.f13504e0 = Arrays.copyOf(this.f13504e0, i11);
        }
        if (i8 != 5) {
            return c1195q;
        }
        if (this.f13486Q == null) {
            this.f13486Q = new C1194p(c1195q, this.f13472C);
        }
        return this.f13486Q;
    }

    public final boolean t() {
        return this.f13508h0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        int i7;
        if (!this.f13494Y && this.f13499b0 == null && this.f13489T) {
            int i8 = 0;
            for (C1195q c1195q : this.f13482M) {
                if (c1195q.q() == null) {
                    return;
                }
            }
            f0 f0Var = this.f13495Z;
            if (f0Var != null) {
                int i9 = f0Var.f10347a;
                int[] iArr = new int[i9];
                this.f13499b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        C1195q[] c1195qArr = this.f13482M;
                        if (i11 < c1195qArr.length) {
                            X q7 = c1195qArr[i11].q();
                            AbstractC1664a.i(q7);
                            X x4 = this.f13495Z.a(i10).f10344d[0];
                            String str = x4.f283C;
                            String str2 = q7.f283C;
                            int g3 = v2.i.g(str2);
                            if (g3 == 3) {
                                if (t.a(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q7.f301U == x4.f301U) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i11++;
                            } else if (g3 == v2.i.g(str)) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    this.f13499b0[i10] = i11;
                }
                Iterator it = this.f13479J.iterator();
                while (it.hasNext()) {
                    ((C1192n) it.next()).a();
                }
                return;
            }
            int length = this.f13482M.length;
            int i12 = 0;
            int i13 = -1;
            int i14 = -2;
            while (true) {
                int i15 = 1;
                if (i12 >= length) {
                    break;
                }
                X q8 = this.f13482M[i12].q();
                AbstractC1664a.i(q8);
                String str3 = q8.f283C;
                if (v2.i.j(str3)) {
                    i15 = 2;
                } else if (!v2.i.h(str3)) {
                    i15 = v2.i.i(str3) ? 3 : -2;
                }
                if (s(i15) > s(i14)) {
                    i13 = i12;
                    i14 = i15;
                } else if (i15 == i14 && i13 != -1) {
                    i13 = -1;
                }
                i12++;
            }
            e0 e0Var = this.f13501d.f13381h;
            int i16 = e0Var.f10341a;
            this.c0 = -1;
            this.f13499b0 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                this.f13499b0[i17] = i17;
            }
            e0[] e0VarArr = new e0[length];
            int i18 = 0;
            while (i18 < length) {
                X q9 = this.f13482M[i18].q();
                AbstractC1664a.i(q9);
                String str4 = this.f13496a;
                X x7 = this.f13505f;
                if (i18 == i13) {
                    X[] xArr = new X[i16];
                    for (int i19 = i8; i19 < i16; i19++) {
                        X x8 = e0Var.f10344d[i19];
                        if (i14 == 1 && x7 != null) {
                            x8 = x8.d(x7);
                        }
                        xArr[i19] = i16 == 1 ? q9.d(x8) : f(x8, q9, true);
                    }
                    e0VarArr[i18] = new e0(str4, xArr);
                    this.c0 = i18;
                    i7 = 0;
                } else {
                    if (i14 != 2 || !v2.i.h(q9.f283C)) {
                        x7 = null;
                    }
                    StringBuilder d7 = t.e.d(str4, ":muxed:");
                    d7.append(i18 < i13 ? i18 : i18 - 1);
                    i7 = 0;
                    e0VarArr[i18] = new e0(d7.toString(), f(x7, q9, false));
                }
                i18++;
                i8 = i7;
            }
            int i20 = i8;
            this.f13495Z = e(e0VarArr);
            AbstractC1664a.h(this.f13497a0 == null ? 1 : i20);
            this.f13497a0 = Collections.emptySet();
            this.f13490U = true;
            this.f13500c.z();
        }
    }

    public final void x() {
        this.f13470A.c();
        C1187i c1187i = this.f13501d;
        C0796b c0796b = c1187i.f13386n;
        if (c0796b != null) {
            throw c0796b;
        }
        Uri uri = c1187i.f13387o;
        if (uri == null || !c1187i.f13391s) {
            return;
        }
        C1246b c1246b = (C1246b) c1187i.f13380g.f13858d.get(uri);
        c1246b.f13841b.c();
        IOException iOException = c1246b.f13838A;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    @Override // c2.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(long j) {
        long max;
        List list;
        C1187i c1187i;
        C0011c c0011c;
        Uri[] uriArr;
        Uri uri;
        C1189k c1189k;
        C1254j c1254j;
        int i7;
        Uri uri2;
        long j3;
        C1186h c1186h;
        C0011c c0011c2;
        C1183e d7;
        Uri uri3;
        boolean z4;
        boolean z7;
        byte[] bArr;
        Uri D7;
        byte[] bArr2;
        InterfaceC1636m interfaceC1636m;
        Uri uri4;
        C1189k c1189k2;
        C1640q c1640q;
        InterfaceC1636m interfaceC1636m2;
        boolean z8;
        Uri uri5;
        C0095a c0095a;
        X1.c cVar;
        C1180b c1180b;
        C0011c c0011c3;
        byte[] bArr3;
        InterfaceC1636m interfaceC1636m3;
        String str;
        int i8;
        if (!this.f13511k0) {
            K k7 = this.f13470A;
            if (!k7.d() && !k7.b()) {
                if (t()) {
                    list = Collections.emptyList();
                    max = this.f13508h0;
                    for (C1195q c1195q : this.f13482M) {
                        c1195q.f10286t = this.f13508h0;
                    }
                } else {
                    C1189k j7 = j();
                    max = j7.f13416Y ? j7.f12600y : Math.max(this.f13507g0, j7.f12599x);
                    list = this.f13475F;
                }
                List list2 = list;
                long j8 = max;
                C0011c c0011c4 = this.f13473D;
                c0011c4.f333c = null;
                c0011c4.f332b = false;
                c0011c4.f334d = null;
                boolean z9 = this.f13490U || !list2.isEmpty();
                C1187i c1187i2 = this.f13501d;
                C1189k c1189k3 = list2.isEmpty() ? null : (C1189k) AbstractC0158p.f(list2);
                long j9 = j8 - j;
                int a2 = c1189k3 == null ? -1 : c1187i2.f13381h.a(c1189k3.f12596d);
                long j10 = c1187i2.f13390r;
                long j11 = -9223372036854775807L;
                long j12 = j10 != -9223372036854775807L ? j10 - j : -9223372036854775807L;
                if (c1189k3 == null || c1187i2.f13388p) {
                    c1187i = c1187i2;
                    c0011c = c0011c4;
                } else {
                    c0011c = c0011c4;
                    c1187i = c1187i2;
                    long j13 = c1189k3.f12600y - c1189k3.f12599x;
                    j9 = Math.max(0L, j9 - j13);
                    if (j12 != -9223372036854775807L) {
                        j12 = Math.max(0L, j12 - j13);
                    }
                }
                C1187i c1187i3 = c1187i;
                C1189k c1189k4 = c1189k3;
                c1187i3.f13389q.l(j9, j12, list2, c1187i3.a(c1189k3, j8));
                t2.c cVar2 = c1187i3.f13389q;
                int i9 = cVar2.f16298c[cVar2.e()];
                boolean z10 = a2 != i9;
                Uri[] uriArr2 = c1187i3.f13378e;
                Uri uri6 = uriArr2[i9];
                C1247c c1247c = c1187i3.f13380g;
                if (c1247c.c(uri6)) {
                    C0011c c0011c5 = c0011c;
                    C1254j a4 = c1247c.a(true, uri6);
                    a4.getClass();
                    c1187i3.f13388p = a4.f13926c;
                    boolean z11 = a4.f13897o;
                    long j14 = a4.f13891h;
                    if (z11) {
                        uriArr = uriArr2;
                        uri = uri6;
                    } else {
                        uriArr = uriArr2;
                        uri = uri6;
                        j11 = (a4.f13903u + j14) - c1247c.f13854E;
                    }
                    c1187i3.f13390r = j11;
                    long j15 = j14 - c1247c.f13854E;
                    C0011c c0011c6 = c0011c5;
                    long j16 = j15;
                    C1186h c1186h2 = null;
                    Uri[] uriArr3 = uriArr;
                    Uri uri7 = uri;
                    Pair c3 = c1187i3.c(c1189k4, z10, a4, j15, j8);
                    long longValue = ((Long) c3.first).longValue();
                    int intValue = ((Integer) c3.second).intValue();
                    if (longValue >= a4.f13893k) {
                        c1189k = c1189k4;
                    } else if (c1189k4 == null || !z10) {
                        c1189k = c1189k4;
                    } else {
                        uri2 = uriArr3[a2];
                        C1254j a7 = c1247c.a(true, uri2);
                        a7.getClass();
                        j16 = a7.f13891h - c1247c.f13854E;
                        c1189k = c1189k4;
                        Pair c4 = c1187i3.c(c1189k4, false, a7, j16, j8);
                        longValue = ((Long) c4.first).longValue();
                        intValue = ((Integer) c4.second).intValue();
                        c1254j = a7;
                        i7 = a2;
                        j3 = c1254j.f13893k;
                        if (longValue >= j3) {
                            c1187i3.f13386n = new C0796b();
                        } else {
                            int i10 = (int) (longValue - j3);
                            AbstractC0167z abstractC0167z = c1254j.f13900r;
                            int size = abstractC0167z.size();
                            AbstractC0167z abstractC0167z2 = c1254j.f13901s;
                            if (i10 == size) {
                                if (intValue == -1) {
                                    intValue = 0;
                                }
                                if (intValue < abstractC0167z2.size()) {
                                    c1186h = new C1186h((AbstractC1252h) abstractC0167z2.get(intValue), longValue, intValue);
                                    if (c1186h == null) {
                                        if (c1254j.f13897o) {
                                            c0011c2 = c0011c6;
                                            if (z9 || abstractC0167z.isEmpty()) {
                                                c0011c2.f332b = true;
                                            } else {
                                                c1186h = new C1186h((AbstractC1252h) AbstractC0158p.f(abstractC0167z), (j3 + abstractC0167z.size()) - 1, -1);
                                            }
                                        } else {
                                            c0011c2 = c0011c6;
                                            c0011c2.f334d = uri2;
                                            c1187i3.f13391s &= uri2.equals(c1187i3.f13387o);
                                            c1187i3.f13387o = uri2;
                                        }
                                        c0011c3 = c0011c2;
                                    } else {
                                        c0011c2 = c0011c6;
                                    }
                                    c1187i3.f13391s = false;
                                    c1187i3.f13387o = null;
                                    AbstractC1252h abstractC1252h = c1186h.f13370a;
                                    C1251g c1251g = abstractC1252h.f13874b;
                                    String str2 = c1254j.f13924a;
                                    Uri D8 = (c1251g != null || (str = c1251g.f13879x) == null) ? null : AbstractC1664a.D(str2, str);
                                    d7 = c1187i3.d(D8, i7);
                                    c0011c2.f333c = d7;
                                    if (d7 == null) {
                                        String str3 = abstractC1252h.f13879x;
                                        Uri D9 = str3 == null ? null : AbstractC1664a.D(str2, str3);
                                        C1183e d8 = c1187i3.d(D9, i7);
                                        c0011c2.f333c = d8;
                                        if (d8 == null) {
                                            long j17 = abstractC1252h.f13877e;
                                            if (c1189k == null) {
                                                AtomicInteger atomicInteger = C1189k.c0;
                                            } else if (!uri2.equals(c1189k.f13395D) || !c1189k.f13416Y) {
                                                long j18 = j16 + j17;
                                                boolean z12 = abstractC1252h instanceof C1249e;
                                                boolean z13 = c1254j.f13926c;
                                                if (z12) {
                                                    z13 = ((C1249e) abstractC1252h).f13864C || (c1186h.f13372c == 0 && z13);
                                                }
                                                uri3 = uri2;
                                                c0011c6 = c0011c2;
                                                z4 = !z13 || j18 < c1189k.f12600y;
                                                z7 = c1186h.f13373d;
                                                if (z4 || !z7) {
                                                    X x4 = c1187i3.f13379f[i7];
                                                    int g3 = c1187i3.f13389q.g();
                                                    Object f7 = c1187i3.f13389q.f();
                                                    boolean z14 = c1187i3.f13384l;
                                                    C1023h c1023h = c1187i3.j;
                                                    if (D9 != null) {
                                                        c1023h.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((C1182d) c1023h.f12667a).get(D9);
                                                    }
                                                    byte[] bArr4 = D8 != null ? null : (byte[]) ((C1182d) c1023h.f12667a).get(D8);
                                                    AtomicInteger atomicInteger2 = C1189k.c0;
                                                    Map emptyMap = Collections.emptyMap();
                                                    D7 = AbstractC1664a.D(str2, abstractC1252h.f13873a);
                                                    int i11 = !z7 ? 8 : 0;
                                                    if (D7 != null) {
                                                        throw new IllegalStateException("The uri must be set.");
                                                    }
                                                    C1640q c1640q2 = new C1640q(D7, 1, null, emptyMap, abstractC1252h.f13881z, abstractC1252h.f13871A, null, i11);
                                                    boolean z15 = bArr != null;
                                                    if (z15) {
                                                        String str4 = abstractC1252h.f13880y;
                                                        str4.getClass();
                                                        bArr2 = C1189k.d(str4);
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    InterfaceC1636m interfaceC1636m4 = c1187i3.f13375b;
                                                    if (bArr != null) {
                                                        bArr2.getClass();
                                                        interfaceC1636m = new C1179a(interfaceC1636m4, bArr, bArr2);
                                                    } else {
                                                        interfaceC1636m = interfaceC1636m4;
                                                    }
                                                    C1251g c1251g2 = abstractC1252h.f13874b;
                                                    if (c1251g2 != null) {
                                                        boolean z16 = bArr4 != null;
                                                        if (z16) {
                                                            String str5 = c1251g2.f13880y;
                                                            str5.getClass();
                                                            bArr3 = C1189k.d(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        boolean z17 = z16;
                                                        uri4 = uri3;
                                                        c1189k2 = c1189k;
                                                        c1640q = new C1640q(AbstractC1664a.D(str2, c1251g2.f13873a), 1, null, Collections.emptyMap(), c1251g2.f13881z, c1251g2.f13871A, null, 0);
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            interfaceC1636m3 = new C1179a(interfaceC1636m4, bArr4, bArr3);
                                                        } else {
                                                            interfaceC1636m3 = interfaceC1636m4;
                                                        }
                                                        z8 = z17;
                                                        interfaceC1636m2 = interfaceC1636m3;
                                                    } else {
                                                        uri4 = uri3;
                                                        c1189k2 = c1189k;
                                                        c1640q = null;
                                                        interfaceC1636m2 = null;
                                                        z8 = false;
                                                    }
                                                    long j19 = j16 + j17;
                                                    long j20 = j19 + abstractC1252h.f13875c;
                                                    int i12 = c1254j.j + abstractC1252h.f13876d;
                                                    if (c1189k2 != null) {
                                                        C1189k c1189k5 = c1189k2;
                                                        C1640q c1640q3 = c1189k5.f13399H;
                                                        uri5 = uri4;
                                                        C1180b c1180b2 = ((c1640q == c1640q3 || (c1640q != null && c1640q3 != null && c1640q.f16808a.equals(c1640q3.f16808a) && (c1640q.f16812e > c1640q3.f16812e ? 1 : (c1640q.f16812e == c1640q3.f16812e ? 0 : -1)) == 0)) && (uri5.equals(c1189k5.f13395D) && c1189k5.f13416Y) && !c1189k5.f13418a0 && c1189k5.f13394C == i12) ? c1189k5.f13411T : null;
                                                        X1.c cVar3 = c1189k5.f13407P;
                                                        c0095a = c1189k5.f13408Q;
                                                        c1180b = c1180b2;
                                                        cVar = cVar3;
                                                    } else {
                                                        uri5 = uri4;
                                                        X1.c cVar4 = new X1.c(null);
                                                        c0095a = new C0095a(10);
                                                        cVar = cVar4;
                                                        c1180b = null;
                                                    }
                                                    C0095a c0095a2 = c0095a;
                                                    boolean z18 = !z7;
                                                    SparseArray sparseArray = (SparseArray) c1187i3.f13377d.f16591b;
                                                    v2.s sVar = (v2.s) sparseArray.get(i12);
                                                    if (sVar == null) {
                                                        sVar = new v2.s(9223372036854775806L);
                                                        sparseArray.put(i12, sVar);
                                                    }
                                                    C1189k c1189k6 = new C1189k(c1187i3.f13374a, interfaceC1636m, c1640q2, x4, z15, interfaceC1636m2, c1640q, z8, uri5, c1187i3.f13382i, g3, f7, j19, j20, c1186h.f13371b, c1186h.f13372c, z18, i12, abstractC1252h.f13872B, z14, sVar, abstractC1252h.f13878f, c1180b, cVar, c0095a2, z4, c1187i3.f13383k);
                                                    c0011c3 = c0011c6;
                                                    c0011c3.f333c = c1189k6;
                                                }
                                            }
                                            uri3 = uri2;
                                            c0011c6 = c0011c2;
                                            z4 = false;
                                            z7 = c1186h.f13373d;
                                            if (z4) {
                                            }
                                            X x42 = c1187i3.f13379f[i7];
                                            int g32 = c1187i3.f13389q.g();
                                            Object f72 = c1187i3.f13389q.f();
                                            boolean z142 = c1187i3.f13384l;
                                            C1023h c1023h2 = c1187i3.j;
                                            if (D9 != null) {
                                            }
                                            if (D8 != null) {
                                            }
                                            AtomicInteger atomicInteger22 = C1189k.c0;
                                            Map emptyMap2 = Collections.emptyMap();
                                            D7 = AbstractC1664a.D(str2, abstractC1252h.f13873a);
                                            if (!z7) {
                                            }
                                            if (D7 != null) {
                                            }
                                        }
                                    }
                                    c0011c3 = c0011c2;
                                }
                                c1186h = c1186h2;
                                if (c1186h == null) {
                                }
                                c1187i3.f13391s = false;
                                c1187i3.f13387o = null;
                                AbstractC1252h abstractC1252h2 = c1186h.f13370a;
                                C1251g c1251g3 = abstractC1252h2.f13874b;
                                String str22 = c1254j.f13924a;
                                if (c1251g3 != null) {
                                }
                                d7 = c1187i3.d(D8, i7);
                                c0011c2.f333c = d7;
                                if (d7 == null) {
                                }
                                c0011c3 = c0011c2;
                            } else {
                                C1251g c1251g4 = (C1251g) abstractC0167z.get(i10);
                                if (intValue == -1) {
                                    c1186h = new C1186h(c1251g4, longValue, -1);
                                } else {
                                    if (intValue < c1251g4.f13870D.size()) {
                                        c1186h2 = new C1186h((AbstractC1252h) c1251g4.f13870D.get(intValue), longValue, intValue);
                                    } else {
                                        int i13 = i10 + 1;
                                        if (i13 < abstractC0167z.size()) {
                                            c1186h2 = new C1186h((AbstractC1252h) abstractC0167z.get(i13), longValue + 1, -1);
                                        } else if (abstractC0167z2.isEmpty()) {
                                            c1186h = null;
                                        } else {
                                            c1186h2 = new C1186h((AbstractC1252h) abstractC0167z2.get(0), longValue + 1, 0);
                                        }
                                    }
                                    c1186h = c1186h2;
                                }
                                if (c1186h == null) {
                                }
                                c1187i3.f13391s = false;
                                c1187i3.f13387o = null;
                                AbstractC1252h abstractC1252h22 = c1186h.f13370a;
                                C1251g c1251g32 = abstractC1252h22.f13874b;
                                String str222 = c1254j.f13924a;
                                if (c1251g32 != null) {
                                }
                                d7 = c1187i3.d(D8, i7);
                                c0011c2.f333c = d7;
                                if (d7 == null) {
                                }
                                c0011c3 = c0011c2;
                            }
                        }
                        c0011c3 = c0011c6;
                    }
                    c1254j = a4;
                    i7 = i9;
                    uri2 = uri7;
                    j3 = c1254j.f13893k;
                    if (longValue >= j3) {
                    }
                    c0011c3 = c0011c6;
                } else {
                    C0011c c0011c7 = c0011c;
                    c0011c7.f334d = uri6;
                    c1187i3.f13391s &= uri6.equals(c1187i3.f13387o);
                    c1187i3.f13387o = uri6;
                    c0011c3 = c0011c7;
                }
                boolean z19 = c0011c3.f332b;
                AbstractC1008e abstractC1008e = (AbstractC1008e) c0011c3.f333c;
                Uri uri8 = (Uri) c0011c3.f334d;
                if (z19) {
                    this.f13508h0 = -9223372036854775807L;
                    this.f13511k0 = true;
                    return true;
                }
                if (abstractC1008e == null) {
                    if (uri8 == null) {
                        return false;
                    }
                    C1246b c1246b = (C1246b) ((C1190l) this.f13500c.f15308b).f13435b.f13858d.get(uri8);
                    c1246b.c(c1246b.f13840a);
                    return false;
                }
                if (abstractC1008e instanceof C1189k) {
                    C1189k c1189k7 = (C1189k) abstractC1008e;
                    this.f13515o0 = c1189k7;
                    this.f13492W = c1189k7.f12596d;
                    this.f13508h0 = -9223372036854775807L;
                    this.f13474E.add(c1189k7);
                    C0165x c0165x = AbstractC0167z.f2083b;
                    AbstractC0158p.a(4, "initialCapacity");
                    Object[] objArr = new Object[4];
                    C1195q[] c1195qArr = this.f13482M;
                    int length = c1195qArr.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length) {
                        C1195q c1195q2 = c1195qArr[i14];
                        Integer valueOf = Integer.valueOf(c1195q2.f10283q + c1195q2.f10282p);
                        int i16 = i15 + 1;
                        if (objArr.length < i16) {
                            objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i16));
                        }
                        objArr[i15] = valueOf;
                        i14++;
                        i15 = i16;
                    }
                    L B7 = AbstractC0167z.B(i15, objArr);
                    c1189k7.f13412U = this;
                    c1189k7.f13417Z = B7;
                    C1195q[] c1195qArr2 = this.f13482M;
                    int length2 = c1195qArr2.length;
                    int i17 = 0;
                    while (i17 < length2) {
                        C1195q c1195q3 = c1195qArr2[i17];
                        c1195q3.getClass();
                        c1195q3.f10263C = c1189k7.f13393B;
                        if (c1189k7.f13396E) {
                            i8 = 1;
                            c1195q3.f10267G = true;
                        } else {
                            i8 = 1;
                        }
                        i17 += i8;
                    }
                }
                this.f13481L = abstractC1008e;
                k7.f(abstractC1008e, this, this.f13518z.u(abstractC1008e.f12595c));
                this.f13471B.k(new C0814u(abstractC1008e.f12594b), abstractC1008e.f12595c, this.f13498b, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
                return true;
            }
        }
        return false;
    }

    public final void z(e0[] e0VarArr, int... iArr) {
        this.f13495Z = e(e0VarArr);
        this.f13497a0 = new HashSet();
        for (int i7 : iArr) {
            this.f13497a0.add(this.f13495Z.a(i7));
        }
        this.c0 = 0;
        this.f13478I.post(new K0(this.f13500c, 27));
        this.f13490U = true;
    }

    @Override // F1.m
    public final void m(F1.s sVar) {
    }
}
