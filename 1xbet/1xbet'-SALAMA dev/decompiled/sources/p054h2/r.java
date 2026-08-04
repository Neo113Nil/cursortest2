package p054h2;

import A1.C0011c;
import A1.K0;
import A1.X;
import B.v;
import C1.C0095a;
import E1.h;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import F1.j;
import F1.m;
import H2.o;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
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
import p018c2.C0756b;
import p018c2.C0774u;
import p018c2.C0779z;
import p018c2.U;
import p018c2.Y;
import p018c2.e0;
import p018c2.f0;
import p032e2.e;
import p061i2.b;
import p118q2.g;
import p139t2.c;
import p146u2.C0958q;
import p146u2.D;
import p146u2.F;
import p146u2.H;
import p146u2.I;
import p146u2.InterfaceC0954m;
import p146u2.K;
import p151v2.a;
import p151v2.i;
import p151v2.s;
import p151v2.t;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class r implements F, I, Y, m, U {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Set f13475p0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final K f13476A = new K("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p018c2.I f13477B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f13478C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0011c f13479D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f13480E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final List f13481F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final o f13482G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final o f13483H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Handler f13484I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f13485J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Map f13486K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public e f13487L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public q[] f13488M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int[] f13489N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final HashSet f13490O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final SparseIntArray f13491P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p f13492Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f13493R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f13494S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f13495T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f13496U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f13497V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public X f13498W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public X f13499X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13500Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public f0 f13501Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13502a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Set f13503a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13504b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int[] f13505b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p096n1.e f13506c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f13507d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f13508d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p146u2.r f13509e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean[] f13510e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X f13511f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean[] f13512f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f13513g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f13514h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f13515i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f13516j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13517k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13518l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f13519m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public DrmInitData f13520n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public k f13521o0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f13522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B1.m f13523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final M4.e f13524z;

    /* JADX WARN: Type inference failed for: r1v12, types: [h2.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h2.o] */
    public r(String str, int i7, p096n1.e eVar, i iVar, Map map, p146u2.r rVar, long j, X x4, h hVar, B1.m mVar, M4.e eVar2, p018c2.I i8, int i9) {
        this.f13502a = str;
        this.f13504b = i7;
        this.f13506c = eVar;
        this.f13507d = iVar;
        this.f13486K = map;
        this.f13509e = rVar;
        this.f13511f = x4;
        this.f13522x = hVar;
        this.f13523y = mVar;
        this.f13524z = eVar2;
        this.f13477B = i8;
        this.f13478C = i9;
        C0011c c0011c = new C0011c(5);
        c0011c.f333c = null;
        c0011c.f332b = false;
        c0011c.f334d = null;
        this.f13479D = c0011c;
        this.f13489N = new int[0];
        Set set = f13475p0;
        this.f13490O = new HashSet(set.size());
        this.f13491P = new SparseIntArray(set.size());
        this.f13488M = new q[0];
        this.f13512f0 = new boolean[0];
        this.f13510e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f13480E = arrayList;
        this.f13481F = Collections.unmodifiableList(arrayList);
        this.f13485J = new ArrayList();
        final int i10 = 0;
        this.f13482G = new Runnable(this) { // from class: h2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f13465b;

            {
                this.f13465b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f13465b.u();
                        break;
                    default:
                        r rVar2 = this.f13465b;
                        rVar2.f13495T = true;
                        rVar2.u();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f13483H = new Runnable(this) { // from class: h2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f13465b;

            {
                this.f13465b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f13465b.u();
                        break;
                    default:
                        r rVar2 = this.f13465b;
                        rVar2.f13495T = true;
                        rVar2.u();
                        break;
                }
            }
        };
        this.f13484I = t.m(null);
        this.f13513g0 = j;
        this.f13514h0 = j;
    }

    public static j d(int i7, int i8) {
        Log.w("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new j();
    }

    public static X f(X x4, X x7, boolean z4) {
        String strC;
        String strQ;
        if (x4 == null) {
            return x7;
        }
        String str = x7.f283C;
        int iG = i.g(str);
        String str2 = x4.f312z;
        if (t.p(iG, str2) == 1) {
            strQ = t.q(iG, str2);
            strC = i.c(strQ);
        } else {
            String strA = i.a(str2, str);
            strC = str;
            strQ = strA;
        }
        Format$Builder format$BuilderA = x7.a();
        format$BuilderA.f10528a = x4.f304a;
        format$BuilderA.f10529b = x4.f305b;
        format$BuilderA.f10530c = x4.f306c;
        format$BuilderA.f10531d = x4.f307d;
        format$BuilderA.f10532e = x4.f308e;
        format$BuilderA.f10533f = z4 ? x4.f309f : -1;
        format$BuilderA.f10534g = z4 ? x4.f310x : -1;
        format$BuilderA.f10535h = strQ;
        if (iG == 2) {
            format$BuilderA.f10542p = x4.f288H;
            format$BuilderA.f10543q = x4.f289I;
            format$BuilderA.f10544r = x4.f290J;
        }
        if (strC != null) {
            format$BuilderA.f10537k = strC;
        }
        int i7 = x4.f296P;
        if (i7 != -1 && iG == 1) {
            format$BuilderA.f10550x = i7;
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
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            format$BuilderA.f10536i = metadata;
        }
        return new X(format$BuilderA);
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
        for (q qVar : this.f13488M) {
            qVar.y(this.f13515i0);
        }
        this.f13515i0 = false;
    }

    public final boolean B(long j, boolean z4) {
        this.f13513g0 = j;
        if (t()) {
            this.f13514h0 = j;
            return true;
        }
        if (this.f13495T && !z4) {
            int length = this.f13488M.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f13488M[i7].z(j, false) || (!this.f13512f0[i7] && this.f13508d0)) {
                }
            }
            return false;
        }
        this.f13514h0 = j;
        this.f13517k0 = false;
        this.f13480E.clear();
        K k7 = this.f13476A;
        if (k7.d()) {
            if (this.f13495T) {
                for (q qVar : this.f13488M) {
                    qVar.h();
                }
            }
            k7.a();
        } else {
            k7.f16733c = null;
            A();
        }
        return true;
    }

    @Override // p018c2.Y
    public final long T() {
        long j;
        if (this.f13517k0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f13514h0;
        }
        long jMax = this.f13513g0;
        k kVarJ = j();
        if (!kVarJ.f13422Y) {
            ArrayList arrayList = this.f13480E;
            kVarJ = arrayList.size() > 1 ? (k) arrayList.get(arrayList.size() - 2) : null;
        }
        if (kVarJ != null) {
            jMax = Math.max(jMax, kVarJ.f12606y);
        }
        if (this.f13495T) {
            for (q qVar : this.f13488M) {
                synchronized (qVar) {
                    j = qVar.f10288v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    @Override // p018c2.Y
    public final void Y(long j) {
        int size;
        K k7 = this.f13476A;
        if (k7.b() || t()) {
            return;
        }
        boolean zD = k7.d();
        i iVar = this.f13507d;
        if (zD) {
            this.f13487L.getClass();
            if (iVar.f13392n != null) {
                return;
            }
            iVar.f13395q.getClass();
            return;
        }
        List list = this.f13481F;
        int size2 = list.size();
        while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
            size2--;
        }
        if (size2 < list.size()) {
            h(size2);
        }
        if (iVar.f13392n == null) {
            c cVar = iVar.f13395q;
            if (cVar.f16304c.length < 2) {
                size = list.size();
            } else {
                size = cVar.d(j, list);
            }
        } else {
            size = list.size();
        }
        if (size < this.f13480E.size()) {
            h(size);
        }
    }

    @Override // p146u2.I
    public final void a() {
        for (q qVar : this.f13488M) {
            qVar.y(true);
            C1010l1 c1010l1 = qVar.f10275h;
            if (c1010l1 != null) {
                c1010l1.F(qVar.f10272e);
                qVar.f10275h = null;
                qVar.f10274g = null;
            }
        }
    }

    @Override // p018c2.U
    public final void b() {
        this.f13484I.post(this.f13482G);
    }

    public final void c() {
        a.h(this.f13496U);
        this.f13501Z.getClass();
        this.f13503a0.getClass();
    }

    public final f0 e(e0[] e0VarArr) {
        for (int i7 = 0; i7 < e0VarArr.length; i7++) {
            e0 e0Var = e0VarArr[i7];
            X[] xArr = new X[e0Var.f10341a];
            for (int i8 = 0; i8 < e0Var.f10341a; i8++) {
                X x4 = e0Var.f10344d[i8];
                int iB = this.f13522x.b(x4);
                Format$Builder format$BuilderA = x4.a();
                format$BuilderA.f10527D = iB;
                xArr[i8] = new X(format$BuilderA);
            }
            e0VarArr[i7] = new e0(e0Var.f10342b, xArr);
        }
        return new f0(e0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p146u2.F
    public final void g(H h6, long j, long j3) {
        e eVar = (e) h6;
        this.f13487L = null;
        i iVar = this.f13507d;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            iVar.f13391m = eVar2.f13370A;
            Uri uri = eVar2.f12600b.f16814a;
            byte[] bArr = eVar2.f13372C;
            bArr.getClass();
            p033e3.h hVar = iVar.j;
            hVar.getClass();
            uri.getClass();
        }
        long j7 = eVar.f12599a;
        Uri uri2 = eVar.f12607z.f16761c;
        C0774u c0774u = new C0774u();
        this.f13524z.getClass();
        this.f13477B.f(c0774u, eVar.f12601c, this.f13504b, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
        if (this.f13496U) {
            this.f13506c.b(this);
        } else {
            y(this.f13513g0);
        }
    }

    public final void h(int i7) {
        ArrayList arrayList;
        a.h(!this.f13476A.d());
        int i8 = i7;
        loop0: while (true) {
            arrayList = this.f13480E;
            if (i8 >= arrayList.size()) {
                i8 = -1;
                break;
            }
            int i9 = i8;
            while (true) {
                if (i9 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i8);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.f13488M.length) {
                            break loop0;
                        }
                        if (this.f13488M[i10].n() > kVar.e(i10)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (((k) arrayList.get(i9)).f13402E) {
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
        long j = j().f12606y;
        k kVar2 = (k) arrayList.get(i8);
        t.J(arrayList, i8, arrayList.size());
        for (int i11 = 0; i11 < this.f13488M.length; i11++) {
            this.f13488M[i11].j(kVar2.e(i11));
        }
        if (arrayList.isEmpty()) {
            this.f13514h0 = this.f13513g0;
        } else {
            ((k) AbstractC0158p.f(arrayList)).f13424a0 = true;
        }
        this.f13517k0 = false;
        int i12 = this.f13493R;
        long j3 = kVar2.f12605x;
        p018c2.I i13 = this.f13477B;
        i13.m(new C0779z(1, i12, null, 3, null, i13.a(j3), i13.a(j)));
    }

    @Override // p146u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        boolean zA;
        Q1.e eVar;
        int i8;
        e eVar2 = (e) h6;
        boolean z4 = eVar2 instanceof k;
        if (z4 && !((k) eVar2).f13425b0 && (iOException instanceof D) && ((i8 = ((D) iOException).f16715d) == 410 || i8 == 404)) {
            return K.f16728d;
        }
        long j = eVar2.f12607z.f16760b;
        Uri uri = eVar2.f12607z.f16761c;
        C0774u c0774u = new C0774u();
        t.N(eVar2.f12605x);
        t.N(eVar2.f12606y);
        v vVar = new v(iOException, i7, 11);
        i iVar = this.f13507d;
        o oVarA = g.a(iVar.f13395q);
        this.f13524z.getClass();
        Q1.e eVarT = M4.e.t(oVarA, vVar);
        if (eVarT == null || eVarT.f5785a != 2) {
            zA = false;
        } else {
            c cVar = iVar.f13395q;
            zA = cVar.a(cVar.h(iVar.f13387h.a(eVar2.f12602d)), eVarT.f5786b);
        }
        if (zA) {
            if (z4 && j == 0) {
                ArrayList arrayList = this.f13480E;
                a.h(((k) arrayList.remove(arrayList.size() - 1)) == eVar2);
                if (arrayList.isEmpty()) {
                    this.f13514h0 = this.f13513g0;
                } else {
                    ((k) AbstractC0158p.f(arrayList)).f13424a0 = true;
                }
            }
            eVar = K.f16729e;
        } else {
            long jV = M4.e.v(vVar);
            eVar = jV != -9223372036854775807L ? new Q1.e(jV, 0, false) : K.f16730f;
        }
        boolean zA2 = eVar.a();
        this.f13477B.h(c0774u, eVar2.f12601c, this.f13504b, eVar2.f12602d, eVar2.f12603e, eVar2.f12604f, eVar2.f12605x, eVar2.f12606y, iOException, !zA2);
        if (!zA2) {
            this.f13487L = null;
        }
        if (zA) {
            if (this.f13496U) {
                this.f13506c.b(this);
            } else {
                y(this.f13513g0);
            }
        }
        return eVar;
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return this.f13476A.d();
    }

    public final k j() {
        ArrayList arrayList = this.f13480E;
        return (k) arrayList.get(arrayList.size() - 1);
    }

    @Override // p018c2.Y
    public final long k() {
        if (t()) {
            return this.f13514h0;
        }
        if (this.f13517k0) {
            return Long.MIN_VALUE;
        }
        return j().f12606y;
    }

    @Override // p146u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        e eVar = (e) h6;
        this.f13487L = null;
        long j7 = eVar.f12599a;
        Uri uri = eVar.f12607z.f16761c;
        C0774u c0774u = new C0774u();
        this.f13524z.getClass();
        this.f13477B.d(c0774u, eVar.f12601c, this.f13504b, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
        if (z4) {
            return;
        }
        if (t() || this.f13497V == 0) {
            A();
        }
        if (this.f13497V > 0) {
            this.f13506c.b(this);
        }
    }

    @Override // F1.m
    public final void n() {
        this.f13518l0 = true;
        this.f13484I.post(this.f13483H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h2.q[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [F1.v] */
    /* JADX WARN: Type inference failed for: r6v4, types: [c2.V, h2.q] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // F1.m
    public final F1.v r(int i7, int i8) {
        Integer numValueOf = Integer.valueOf(i8);
        Set set = f13475p0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f13490O;
        SparseIntArray sparseIntArray = this.f13491P;
        ?? qVar = 0;
        qVar = 0;
        if (zContains) {
            a.f(set.contains(Integer.valueOf(i8)));
            int i9 = sparseIntArray.get(i8, -1);
            if (i9 != -1) {
                if (hashSet.add(Integer.valueOf(i8))) {
                    this.f13489N[i9] = i7;
                }
                qVar = this.f13489N[i9] == i7 ? this.f13488M[i9] : d(i7, i8);
            }
        } else {
            int i10 = 0;
            while (true) {
                ?? r7 = this.f13488M;
                if (i10 >= r7.length) {
                    break;
                }
                if (this.f13489N[i10] == i7) {
                    qVar = r7[i10];
                    break;
                }
                i10++;
            }
        }
        if (qVar == 0) {
            if (this.f13518l0) {
                return d(i7, i8);
            }
            int length = this.f13488M.length;
            boolean z4 = i8 == 1 || i8 == 2;
            qVar = new q(this.f13509e, this.f13522x, this.f13523y, this.f13486K);
            qVar.f10286t = this.f13513g0;
            if (z4) {
                qVar.f13474I = this.f13520n0;
                qVar.f10292z = true;
            }
            long j = this.f13519m0;
            if (qVar.f10266F != j) {
                qVar.f10266F = j;
                qVar.f10292z = true;
            }
            k kVar = this.f13521o0;
            if (kVar != null) {
                qVar.f10263C = kVar.f13399B;
            }
            qVar.f10273f = this;
            int i11 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f13489N, i11);
            this.f13489N = iArrCopyOf;
            iArrCopyOf[length] = i7;
            q[] qVarArr = this.f13488M;
            int i12 = t.f17159a;
            ?? CopyOf = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            CopyOf[qVarArr.length] = qVar;
            this.f13488M = (q[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f13512f0, i11);
            this.f13512f0 = zArrCopyOf;
            zArrCopyOf[length] = z4;
            this.f13508d0 |= z4;
            hashSet.add(Integer.valueOf(i8));
            sparseIntArray.append(i8, length);
            if (s(i8) > s(this.f13493R)) {
                this.f13494S = length;
                this.f13493R = i8;
            }
            this.f13510e0 = Arrays.copyOf(this.f13510e0, i11);
        }
        if (i8 != 5) {
            return qVar;
        }
        if (this.f13492Q == null) {
            this.f13492Q = new p(qVar, this.f13478C);
        }
        return this.f13492Q;
    }

    public final boolean t() {
        return this.f13514h0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        int i7;
        if (!this.f13500Y && this.f13505b0 == null && this.f13495T) {
            int i8 = 0;
            for (q qVar : this.f13488M) {
                if (qVar.q() == null) {
                    return;
                }
            }
            f0 f0Var = this.f13501Z;
            if (f0Var != null) {
                int i9 = f0Var.f10347a;
                int[] iArr = new int[i9];
                this.f13505b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        q[] qVarArr = this.f13488M;
                        if (i11 >= qVarArr.length) {
                            break;
                        }
                        X xQ = qVarArr[i11].q();
                        a.i(xQ);
                        X x4 = this.f13501Z.a(i10).f10344d[0];
                        String str = x4.f283C;
                        String str2 = xQ.f283C;
                        int iG = i.g(str2);
                        if (iG != 3) {
                            if (iG == i.g(str)) {
                                this.f13505b0[i10] = i11;
                                break;
                            }
                            i11++;
                        } else {
                            if (t.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || xQ.f301U == x4.f301U)) {
                                this.f13505b0[i10] = i11;
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                }
                Iterator it = this.f13485J.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a();
                }
                return;
            }
            int length = this.f13488M.length;
            int i12 = 0;
            int i13 = -1;
            int i14 = -2;
            while (true) {
                int i15 = 1;
                if (i12 >= length) {
                    break;
                }
                X xQ2 = this.f13488M[i12].q();
                a.i(xQ2);
                String str3 = xQ2.f283C;
                if (i.j(str3)) {
                    i15 = 2;
                } else if (!i.h(str3)) {
                    i15 = i.i(str3) ? 3 : -2;
                }
                if (s(i15) > s(i14)) {
                    i13 = i12;
                    i14 = i15;
                } else if (i15 == i14 && i13 != -1) {
                    i13 = -1;
                }
                i12++;
            }
            e0 e0Var = this.f13507d.f13387h;
            int i16 = e0Var.f10341a;
            this.c0 = -1;
            this.f13505b0 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                this.f13505b0[i17] = i17;
            }
            e0[] e0VarArr = new e0[length];
            int i18 = 0;
            while (i18 < length) {
                X xQ3 = this.f13488M[i18].q();
                a.i(xQ3);
                String str4 = this.f13502a;
                X x7 = this.f13511f;
                if (i18 == i13) {
                    X[] xArr = new X[i16];
                    for (int i19 = i8; i19 < i16; i19++) {
                        X xD = e0Var.f10344d[i19];
                        if (i14 == 1 && x7 != null) {
                            xD = xD.d(x7);
                        }
                        xArr[i19] = i16 == 1 ? xQ3.d(xD) : f(xD, xQ3, true);
                    }
                    e0VarArr[i18] = new e0(str4, xArr);
                    this.c0 = i18;
                    i7 = 0;
                } else {
                    if (i14 != 2 || !i.h(xQ3.f283C)) {
                        x7 = null;
                    }
                    StringBuilder sbD = p136t.e.d(str4, ":muxed:");
                    sbD.append(i18 < i13 ? i18 : i18 - 1);
                    i7 = 0;
                    e0VarArr[i18] = new e0(sbD.toString(), f(x7, xQ3, false));
                }
                i18++;
                i8 = i7;
            }
            int i20 = i8;
            this.f13501Z = e(e0VarArr);
            a.h(this.f13503a0 == null ? 1 : i20);
            this.f13503a0 = Collections.emptySet();
            this.f13496U = true;
            this.f13506c.z();
        }
    }

    public final void x() throws IOException {
        this.f13476A.c();
        i iVar = this.f13507d;
        C0756b c0756b = iVar.f13392n;
        if (c0756b != null) {
            throw c0756b;
        }
        Uri uri = iVar.f13393o;
        if (uri == null || !iVar.f13397s) {
            return;
        }
        b bVar = (b) iVar.f13386g.f13864d.get(uri);
        bVar.f13847b.c();
        IOException iOException = bVar.f13844A;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0300  */
    /* JADX WARN: Code duplicated, block: B:159:0x0305  */
    /* JADX WARN: Code duplicated, block: B:161:0x0311  */
    /* JADX WARN: Code duplicated, block: B:162:0x0313  */
    /* JADX WARN: Code duplicated, block: B:165:0x032b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0330  */
    /* JADX WARN: Code duplicated, block: B:168:0x0334  */
    /* JADX WARN: Code duplicated, block: B:170:0x034e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:173:0x0355  */
    /* JADX WARN: Code duplicated, block: B:174:0x035f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0364  */
    /* JADX WARN: Code duplicated, block: B:178:0x036f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0375 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0377  */
    /* JADX WARN: Code duplicated, block: B:183:0x0379  */
    /* JADX WARN: Code duplicated, block: B:185:0x037c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0386  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:211:0x0406  */
    /* JADX WARN: Code duplicated, block: B:219:0x0416  */
    /* JADX WARN: Code duplicated, block: B:222:0x0422  */
    /* JADX WARN: Code duplicated, block: B:225:0x0449  */
    /* JADX WARN: Code duplicated, block: B:254:0x0551  */
    /* JADX WARN: Code duplicated, block: B:97:0x0240 A[PHI: r1
      0x0240: PHI (r1v40 A1.c) = (r1v20 A1.c), (r1v20 A1.c), (r1v42 A1.c), (r1v43 A1.c) binds: [B:115:0x0288, B:122:0x029b, B:105:0x0264, B:96:0x022f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p018c2.Y
    public final boolean y(long j) {
        long jMax;
        List listEmptyList;
        i iVar;
        C0011c c0011c;
        k kVar;
        p061i2.j jVar;
        int i7;
        Uri uri;
        h hVar;
        boolean z4;
        boolean z7;
        X x4;
        int iG;
        Object objF;
        boolean z8;
        p033e3.h hVar2;
        byte[] bArr;
        byte[] bArr2;
        Map mapEmptyMap;
        Uri uriD;
        int i8;
        boolean z9;
        byte[] bArrD;
        InterfaceC0954m interfaceC0954m;
        InterfaceC0954m aVar;
        p061i2.g gVar;
        Uri uri2;
        C0958q c0958q;
        InterfaceC0954m interfaceC0954m2;
        boolean z10;
        int i9;
        Uri uri3;
        C0095a c0095a;
        X1.c cVar;
        b bVar;
        SparseArray sparseArray;
        s sVar;
        C0011c c0011c2;
        k kVar2;
        C0958q c0958q2;
        boolean z11;
        boolean z12;
        b bVar2;
        boolean z13;
        byte[] bArrD2;
        InterfaceC0954m aVar2;
        String str;
        int i10;
        if (!this.f13517k0) {
            K k7 = this.f13476A;
            if (!k7.d() && !k7.b()) {
                if (t()) {
                    listEmptyList = Collections.emptyList();
                    jMax = this.f13514h0;
                    for (q qVar : this.f13488M) {
                        qVar.f10286t = this.f13514h0;
                    }
                } else {
                    k kVarJ = j();
                    jMax = kVarJ.f13422Y ? kVarJ.f12606y : Math.max(this.f13513g0, kVarJ.f12605x);
                    listEmptyList = this.f13481F;
                }
                List list = listEmptyList;
                long j3 = jMax;
                C0011c c0011c3 = this.f13479D;
                c0011c3.f333c = null;
                c0011c3.f332b = false;
                c0011c3.f334d = null;
                boolean z14 = this.f13496U || !list.isEmpty();
                i iVar2 = this.f13507d;
                k kVar3 = list.isEmpty() ? null : (k) AbstractC0158p.f(list);
                long jMax2 = j3 - j;
                int iA = kVar3 == null ? -1 : iVar2.f13387h.a(kVar3.f12602d);
                long j7 = iVar2.f13396r;
                long j8 = -9223372036854775807L;
                long jMax3 = j7 != -9223372036854775807L ? j7 - j : -9223372036854775807L;
                if (kVar3 == null || iVar2.f13394p) {
                    iVar = iVar2;
                    c0011c = c0011c3;
                } else {
                    c0011c = c0011c3;
                    iVar = iVar2;
                    long j9 = kVar3.f12606y - kVar3.f12605x;
                    jMax2 = Math.max(0L, jMax2 - j9);
                    if (jMax3 != -9223372036854775807L) {
                        jMax3 = Math.max(0L, jMax3 - j9);
                    }
                }
                i iVar3 = iVar;
                k kVar4 = kVar3;
                iVar3.f13395q.l(jMax2, jMax3, list, iVar3.a(kVar3, j3));
                c cVar2 = iVar3.f13395q;
                int i11 = cVar2.f16304c[cVar2.e()];
                boolean z15 = iA != i11;
                Uri[] uriArr = iVar3.f13384e;
                Uri uri4 = uriArr[i11];
                p061i2.c cVar3 = iVar3.f13386g;
                if (cVar3.c(uri4)) {
                    C0011c c0011c4 = c0011c;
                    p061i2.j jVarA = cVar3.a(true, uri4);
                    jVarA.getClass();
                    iVar3.f13394p = jVarA.f13932c;
                    boolean z16 = jVarA.f13903o;
                    long j10 = jVarA.f13897h;
                    if (!z16) {
                        j8 = (jVarA.f13909u + j10) - cVar3.f13860E;
                    }
                    iVar3.f13396r = j8;
                    long j11 = j10 - cVar3.f13860E;
                    C0011c c0011c5 = c0011c4;
                    long j12 = j11;
                    h hVar3 = null;
                    Pair pairC = iVar3.c(kVar4, z15, jVarA, j11, j3);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue = ((Integer) pairC.second).intValue();
                    if (jLongValue >= jVarA.f13899k || kVar4 == null || !z15) {
                        kVar = kVar4;
                        jVar = jVarA;
                        i7 = i11;
                        uri = uri4;
                    } else {
                        uri = uriArr[iA];
                        p061i2.j jVarA2 = cVar3.a(true, uri);
                        jVarA2.getClass();
                        j12 = jVarA2.f13897h - cVar3.f13860E;
                        kVar = kVar4;
                        Pair pairC2 = iVar3.c(kVar4, false, jVarA2, j12, j3);
                        jLongValue = ((Long) pairC2.first).longValue();
                        iIntValue = ((Integer) pairC2.second).intValue();
                        jVar = jVarA2;
                        i7 = iA;
                    }
                    long j13 = jVar.f13899k;
                    if (jLongValue < j13) {
                        iVar3.f13392n = new C0756b();
                    } else {
                        int i12 = (int) (jLongValue - j13);
                        AbstractC0167z abstractC0167z = jVar.f13906r;
                        int size = abstractC0167z.size();
                        AbstractC0167z abstractC0167z2 = jVar.f13907s;
                        if (i12 == size) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            hVar = iIntValue < abstractC0167z2.size() ? new h((p061i2.h) abstractC0167z2.get(iIntValue), jLongValue, iIntValue) : hVar3;
                        } else {
                            p061i2.g gVar2 = (p061i2.g) abstractC0167z.get(i12);
                            if (iIntValue == -1) {
                                hVar = new h(gVar2, jLongValue, -1);
                            } else if (iIntValue < gVar2.f13876D.size()) {
                                hVar3 = new h((p061i2.h) gVar2.f13876D.get(iIntValue), jLongValue, iIntValue);
                            } else {
                                int i13 = i12 + 1;
                                if (i13 < abstractC0167z.size()) {
                                    hVar3 = new h((p061i2.h) abstractC0167z.get(i13), jLongValue + 1, -1);
                                } else if (abstractC0167z2.isEmpty()) {
                                    hVar = null;
                                } else {
                                    hVar3 = new h((p061i2.h) abstractC0167z2.get(0), jLongValue + 1, 0);
                                }
                            }
                        }
                        if (hVar == null) {
                            if (jVar.f13903o) {
                                c0011c5 = c0011c5;
                                if (z14 || abstractC0167z.isEmpty()) {
                                    c0011c5.f332b = true;
                                } else {
                                    hVar = new h((p061i2.h) AbstractC0158p.f(abstractC0167z), (j13 + ((long) abstractC0167z.size())) - 1, -1);
                                }
                            } else {
                                c0011c5 = c0011c5;
                                c0011c5.f334d = uri;
                                iVar3.f13397s &= uri.equals(iVar3.f13393o);
                                iVar3.f13393o = uri;
                            }
                            c0011c2 = c0011c5;
                        } else {
                            c0011c5 = c0011c5;
                        }
                        iVar3.f13397s = false;
                        iVar3.f13393o = null;
                        p061i2.h hVar4 = hVar.f13376a;
                        p061i2.g gVar3 = hVar4.f13880b;
                        String str2 = jVar.f13930a;
                        Uri uriD2 = (gVar3 == null || (str = gVar3.f13885x) == null) ? null : a.D(str2, str);
                        e eVarD = iVar3.d(uriD2, i7);
                        c0011c5.f333c = eVarD;
                        if (eVarD == null) {
                            String str3 = hVar4.f13885x;
                            Uri uriD3 = str3 == null ? null : a.D(str2, str3);
                            e eVarD2 = iVar3.d(uriD3, i7);
                            c0011c5.f333c = eVarD2;
                            if (eVarD2 != null) {
                                c0011c2 = c0011c5;
                            } else {
                                long j14 = hVar4.f13883e;
                                if (kVar == null) {
                                    AtomicInteger atomicInteger = k.c0;
                                } else {
                                    if (!uri.equals(kVar.f13401D) || !kVar.f13422Y) {
                                        long j15 = j12 + j14;
                                        boolean z17 = hVar4 instanceof p061i2.e;
                                        boolean z18 = jVar.f13932c;
                                        if (z17) {
                                            z18 = ((p061i2.e) hVar4).f13870C || (hVar.f13378c == 0 && z18);
                                        }
                                        z4 = !z18 || j15 < kVar.f12606y;
                                    }
                                    z7 = hVar.f13379d;
                                    if (z4 || !z7) {
                                        x4 = iVar3.f13385f[i7];
                                        iG = iVar3.f13395q.g();
                                        objF = iVar3.f13395q.f();
                                        z8 = iVar3.f13390l;
                                        hVar2 = iVar3.j;
                                        if (uriD3 == null) {
                                            hVar2.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((d) hVar2.f12673a).get(uriD3);
                                        }
                                        if (uriD2 == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((d) hVar2.f12673a).get(uriD2);
                                        }
                                        AtomicInteger atomicInteger2 = k.c0;
                                        mapEmptyMap = Collections.emptyMap();
                                        uriD = a.D(str2, hVar4.f13879a);
                                        if (z7) {
                                            i8 = 8;
                                        } else {
                                            i8 = 0;
                                        }
                                        if (uriD != null) {
                                            throw new IllegalStateException("The uri must be set.");
                                        }
                                        C0958q c0958q3 = new C0958q(uriD, 1, null, mapEmptyMap, hVar4.f13887z, hVar4.f13877A, null, i8);
                                        if (bArr != null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            String str4 = hVar4.f13886y;
                                            str4.getClass();
                                            bArrD = k.d(str4);
                                        } else {
                                            bArrD = null;
                                        }
                                        interfaceC0954m = iVar3.f13381b;
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            aVar = new a(interfaceC0954m, bArr, bArrD);
                                        } else {
                                            aVar = interfaceC0954m;
                                        }
                                        gVar = hVar4.f13880b;
                                        if (gVar != null) {
                                            if (bArr2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                String str5 = gVar.f13886y;
                                                str5.getClass();
                                                bArrD2 = k.d(str5);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z19 = z13;
                                            uri2 = uri;
                                            c0958q = new C0958q(a.D(str2, gVar.f13879a), 1, null, Collections.emptyMap(), gVar.f13887z, gVar.f13877A, null, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                aVar2 = new a(interfaceC0954m, bArr2, bArrD2);
                                            } else {
                                                aVar2 = interfaceC0954m;
                                            }
                                            z10 = z19;
                                            interfaceC0954m2 = aVar2;
                                        } else {
                                            uri2 = uri;
                                            c0958q = null;
                                            interfaceC0954m2 = null;
                                            z10 = false;
                                        }
                                        long j16 = j12 + j14;
                                        long j17 = j16 + hVar4.f13881c;
                                        i9 = jVar.j + hVar4.f13882d;
                                        if (kVar != 0) {
                                            kVar2 = kVar;
                                            c0958q2 = kVar2.f13405H;
                                            if (c0958q != c0958q2 || (c0958q != null && c0958q2 != null && c0958q.f16814a.equals(c0958q2.f16814a) && c0958q.f16818e == c0958q2.f16818e)) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            uri3 = uri2;
                                            if (uri3.equals(kVar2.f13401D) || !kVar2.f13422Y) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            if (z11 || !z12 || kVar2.f13424a0 || kVar2.f13400C != i9) {
                                                bVar2 = null;
                                            } else {
                                                bVar2 = kVar2.f13417T;
                                            }
                                            X1.c cVar4 = kVar2.f13413P;
                                            c0095a = kVar2.f13414Q;
                                            bVar = bVar2;
                                            cVar = cVar4;
                                        } else {
                                            uri3 = uri2;
                                            X1.c cVar5 = new X1.c(null);
                                            c0095a = new C0095a(10);
                                            cVar = cVar5;
                                            bVar = null;
                                        }
                                        C0095a c0095a2 = c0095a;
                                        boolean z20 = !z7;
                                        sparseArray = (SparseArray) iVar3.f13383d.f16597b;
                                        sVar = (s) sparseArray.get(i9);
                                        if (sVar == null) {
                                            sVar = new s(9223372036854775806L);
                                            sparseArray.put(i9, sVar);
                                        }
                                        k kVar5 = new k(iVar3.f13380a, aVar, c0958q3, x4, z9, interfaceC0954m2, c0958q, z10, uri3, iVar3.f13388i, iG, objF, j16, j17, hVar.f13377b, hVar.f13378c, z20, i9, hVar4.f13878B, z8, sVar, hVar4.f13884f, bVar, cVar, c0095a2, z4, iVar3.f13389k);
                                        c0011c2 = c0011c5;
                                        c0011c2.f333c = kVar5;
                                    }
                                }
                                z4 = false;
                                z7 = hVar.f13379d;
                                if (z4) {
                                }
                                x4 = iVar3.f13385f[i7];
                                iG = iVar3.f13395q.g();
                                objF = iVar3.f13395q.f();
                                z8 = iVar3.f13390l;
                                hVar2 = iVar3.j;
                                if (uriD3 == null) {
                                    hVar2.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((d) hVar2.f12673a).get(uriD3);
                                }
                                if (uriD2 == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((d) hVar2.f12673a).get(uriD2);
                                }
                                AtomicInteger atomicInteger3 = k.c0;
                                mapEmptyMap = Collections.emptyMap();
                                uriD = a.D(str2, hVar4.f13879a);
                                if (z7) {
                                    i8 = 8;
                                } else {
                                    i8 = 0;
                                }
                                if (uriD != null) {
                                    throw new IllegalStateException("The uri must be set.");
                                }
                                C0958q c0958q4 = new C0958q(uriD, 1, null, mapEmptyMap, hVar4.f13887z, hVar4.f13877A, null, i8);
                                if (bArr != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    String str6 = hVar4.f13886y;
                                    str6.getClass();
                                    bArrD = k.d(str6);
                                } else {
                                    bArrD = null;
                                }
                                interfaceC0954m = iVar3.f13381b;
                                if (bArr != null) {
                                    bArrD.getClass();
                                    aVar = new a(interfaceC0954m, bArr, bArrD);
                                } else {
                                    aVar = interfaceC0954m;
                                }
                                gVar = hVar4.f13880b;
                                if (gVar != null) {
                                    if (bArr2 != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        String str7 = gVar.f13886y;
                                        str7.getClass();
                                        bArrD2 = k.d(str7);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    boolean z110 = z13;
                                    uri2 = uri;
                                    c0958q = new C0958q(a.D(str2, gVar.f13879a), 1, null, Collections.emptyMap(), gVar.f13887z, gVar.f13877A, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        aVar2 = new a(interfaceC0954m, bArr2, bArrD2);
                                    } else {
                                        aVar2 = interfaceC0954m;
                                    }
                                    z10 = z110;
                                    interfaceC0954m2 = aVar2;
                                } else {
                                    uri2 = uri;
                                    c0958q = null;
                                    interfaceC0954m2 = null;
                                    z10 = false;
                                }
                                long j18 = j12 + j14;
                                long j19 = j18 + hVar4.f13881c;
                                i9 = jVar.j + hVar4.f13882d;
                                if (kVar != 0) {
                                    kVar2 = kVar;
                                    c0958q2 = kVar2.f13405H;
                                    if (c0958q != c0958q2) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    uri3 = uri2;
                                    if (uri3.equals(kVar2.f13401D)) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        bVar2 = null;
                                    } else {
                                        bVar2 = null;
                                    }
                                    X1.c cVar6 = kVar2.f13413P;
                                    c0095a = kVar2.f13414Q;
                                    bVar = bVar2;
                                    cVar = cVar6;
                                } else {
                                    uri3 = uri2;
                                    X1.c cVar7 = new X1.c(null);
                                    c0095a = new C0095a(10);
                                    cVar = cVar7;
                                    bVar = null;
                                }
                                C0095a c0095a3 = c0095a;
                                boolean z21 = !z7;
                                sparseArray = (SparseArray) iVar3.f13383d.f16597b;
                                sVar = (s) sparseArray.get(i9);
                                if (sVar == null) {
                                    sVar = new s(9223372036854775806L);
                                    sparseArray.put(i9, sVar);
                                }
                                k kVar6 = new k(iVar3.f13380a, aVar, c0958q4, x4, z9, interfaceC0954m2, c0958q, z10, uri3, iVar3.f13388i, iG, objF, j18, j19, hVar.f13377b, hVar.f13378c, z21, i9, hVar4.f13878B, z8, sVar, hVar4.f13884f, bVar, cVar, c0095a3, z4, iVar3.f13389k);
                                c0011c2 = c0011c5;
                                c0011c2.f333c = kVar6;
                            }
                        } else {
                            c0011c2 = c0011c5;
                        }
                    }
                    c0011c2 = c0011c5;
                } else {
                    C0011c c0011c6 = c0011c;
                    c0011c6.f334d = uri4;
                    iVar3.f13397s &= uri4.equals(iVar3.f13393o);
                    iVar3.f13393o = uri4;
                    c0011c2 = c0011c6;
                }
                boolean z22 = c0011c2.f332b;
                e eVar = (e) c0011c2.f333c;
                Uri uri5 = (Uri) c0011c2.f334d;
                if (z22) {
                    this.f13514h0 = -9223372036854775807L;
                    this.f13517k0 = true;
                    return true;
                }
                if (eVar == null) {
                    if (uri5 == null) {
                        return false;
                    }
                    b bVar3 = (b) ((l) this.f13506c.f15314b).f13441b.f13864d.get(uri5);
                    bVar3.c(bVar3.f13846a);
                    return false;
                }
                if (eVar instanceof k) {
                    k kVar7 = (k) eVar;
                    this.f13521o0 = kVar7;
                    this.f13498W = kVar7.f12602d;
                    this.f13514h0 = -9223372036854775807L;
                    this.f13480E.add(kVar7);
                    C0165x c0165x = AbstractC0167z.f2083b;
                    AbstractC0158p.a(4, "initialCapacity");
                    Object[] objArrCopyOf = new Object[4];
                    q[] qVarArr = this.f13488M;
                    int length = qVarArr.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length) {
                        q qVar2 = qVarArr[i14];
                        Integer numValueOf = Integer.valueOf(qVar2.f10283q + qVar2.f10282p);
                        int i16 = i15 + 1;
                        if (objArrCopyOf.length < i16) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i16));
                        }
                        objArrCopyOf[i15] = numValueOf;
                        i14++;
                        i15 = i16;
                    }
                    L lB = AbstractC0167z.B(i15, objArrCopyOf);
                    kVar7.f13418U = this;
                    kVar7.f13423Z = lB;
                    q[] qVarArr2 = this.f13488M;
                    int length2 = qVarArr2.length;
                    int i17 = 0;
                    while (i17 < length2) {
                        q qVar3 = qVarArr2[i17];
                        qVar3.getClass();
                        qVar3.f10263C = kVar7.f13399B;
                        if (kVar7.f13402E) {
                            i10 = 1;
                            qVar3.f10267G = true;
                        } else {
                            i10 = 1;
                        }
                        i17 += i10;
                    }
                }
                this.f13487L = eVar;
                k7.f(eVar, this, this.f13524z.u(eVar.f12601c));
                this.f13477B.k(new C0774u(eVar.f12600b), eVar.f12601c, this.f13504b, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
                return true;
            }
        }
        return false;
    }

    public final void z(e0[] e0VarArr, int... iArr) {
        this.f13501Z = e(e0VarArr);
        this.f13503a0 = new HashSet();
        for (int i7 : iArr) {
            this.f13503a0.add(this.f13501Z.a(i7));
        }
        this.c0 = 0;
        this.f13484I.post(new K0(this.f13506c, 27));
        this.f13496U = true;
    }

    @Override // F1.m
    public final void m(F1.s sVar) {
    }
}
