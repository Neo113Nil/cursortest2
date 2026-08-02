package androidx.media3.exoplayer.hls;

import C.o0;
import E0.C2942q;
import F3.C3013s;
import F3.C3016v;
import F3.D;
import F3.F;
import F3.InterfaceC3018x;
import F3.T;
import F3.U;
import F3.V;
import F3.d0;
import I3.y;
import J3.i;
import J3.j;
import N3.C3663n;
import N3.H;
import N3.M;
import N3.r;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.M;
import androidx.media3.exoplayer.hls.f;
import androidx.media3.exoplayer.hls.i;
import androidx.media3.exoplayer.hls.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import b4.C5536l;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.B;
import j3.C7253I;
import j3.C7270l;
import j3.C7272n;
import j3.InterfaceC7268j;
import j3.t;
import j3.u;
import j3.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m3.C8050C;
import m3.N;
import m3.s;
import t3.C9730B;
import t3.I;
import w3.i;
import z3.C10978b;

/* loaded from: classes8.dex */
final class o implements j.a<G3.b>, j.e, V, r, T.c {

    /* renamed from: t0, reason: collision with root package name */
    private static final Set<Integer> f44001t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    private int f44002A;

    /* renamed from: B, reason: collision with root package name */
    private int f44003B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f44004C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f44005D;

    /* renamed from: E, reason: collision with root package name */
    private int f44006E;

    /* renamed from: F, reason: collision with root package name */
    private C7272n f44007F;

    /* renamed from: G, reason: collision with root package name */
    private C7272n f44008G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f44009H;

    /* renamed from: I, reason: collision with root package name */
    private d0 f44010I;

    /* renamed from: J, reason: collision with root package name */
    private Set<C7253I> f44011J;

    /* renamed from: K, reason: collision with root package name */
    private int[] f44012K;

    /* renamed from: L, reason: collision with root package name */
    private int f44013L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f44014M;

    /* renamed from: N, reason: collision with root package name */
    private boolean[] f44015N;

    /* renamed from: O, reason: collision with root package name */
    private boolean[] f44016O;

    /* renamed from: P, reason: collision with root package name */
    private long f44017P;

    /* renamed from: Q, reason: collision with root package name */
    private long f44018Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f44019R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f44020S;

    /* renamed from: X, reason: collision with root package name */
    private boolean f44021X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f44022Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f44023Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f44024a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44025b;

    /* renamed from: c, reason: collision with root package name */
    private final a f44026c;

    /* renamed from: d, reason: collision with root package name */
    private final f f44027d;

    /* renamed from: e, reason: collision with root package name */
    private final J3.b f44028e;

    /* renamed from: f, reason: collision with root package name */
    private final C7272n f44029f;

    /* renamed from: g, reason: collision with root package name */
    private final w3.j f44030g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a f44031h;

    /* renamed from: i, reason: collision with root package name */
    private final J3.h f44032i;

    /* renamed from: j, reason: collision with root package name */
    private final J3.j f44033j = new J3.j("Loader:HlsSampleStreamWrapper");

    /* renamed from: k, reason: collision with root package name */
    private final F.a f44034k;

    /* renamed from: l, reason: collision with root package name */
    private final int f44035l;

    /* renamed from: m, reason: collision with root package name */
    private final f.b f44036m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<g> f44037n;

    /* renamed from: o, reason: collision with root package name */
    private final List<g> f44038o;

    /* renamed from: p, reason: collision with root package name */
    private final l f44039p;

    /* renamed from: q, reason: collision with root package name */
    private final m f44040q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f44041r;

    /* renamed from: r0, reason: collision with root package name */
    private C7270l f44042r0;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList<j> f44043s;

    /* renamed from: s0, reason: collision with root package name */
    private g f44044s0;

    /* renamed from: t, reason: collision with root package name */
    private final Map<String, C7270l> f44045t;

    /* renamed from: u, reason: collision with root package name */
    private G3.b f44046u;

    /* renamed from: v, reason: collision with root package name */
    private c[] f44047v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f44048w;

    /* renamed from: x, reason: collision with root package name */
    private HashSet f44049x;

    /* renamed from: y, reason: collision with root package name */
    private SparseIntArray f44050y;

    /* renamed from: z, reason: collision with root package name */
    private M f44051z;

    public interface a extends V.a<o> {
    }

    private static class b implements M {

        /* renamed from: f, reason: collision with root package name */
        private static final C7272n f44052f;

        /* renamed from: g, reason: collision with root package name */
        private static final C7272n f44053g;

        /* renamed from: a, reason: collision with root package name */
        private final M f44054a;

        /* renamed from: b, reason: collision with root package name */
        private final C7272n f44055b;

        /* renamed from: c, reason: collision with root package name */
        private C7272n f44056c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f44057d;

        /* renamed from: e, reason: collision with root package name */
        private int f44058e;

        static {
            C7272n.a aVar = new C7272n.a();
            aVar.y0("application/id3");
            f44052f = aVar.P();
            C7272n.a aVar2 = new C7272n.a();
            aVar2.y0("application/x-emsg");
            f44053g = aVar2.P();
        }

        public b(M m11, int i11) {
            this.f44054a = m11;
            if (i11 == 1) {
                this.f44055b = f44052f;
            } else {
                if (i11 != 3) {
                    throw new IllegalArgumentException(Ej.b.a(i11, "Unknown metadataType: "));
                }
                this.f44055b = f44053g;
            }
            this.f44057d = new byte[0];
            this.f44058e = 0;
        }

        @Override // N3.M
        public final void a(C7272n c7272n) {
            this.f44056c = c7272n;
            this.f44054a.a(this.f44055b);
        }

        @Override // N3.M
        public final void b(long j11, int i11, int i12, int i13, M.a aVar) {
            this.f44056c.getClass();
            int i14 = this.f44058e - i13;
            C8050C c8050c = new C8050C(Arrays.copyOfRange(this.f44057d, i14 - i12, i14));
            byte[] bArr = this.f44057d;
            System.arraycopy(bArr, i14, bArr, 0, i13);
            this.f44058e = i13;
            String str = this.f44056c.f69127o;
            C7272n c7272n = this.f44055b;
            if (!Objects.equals(str, c7272n.f69127o)) {
                if (!"application/x-emsg".equals(this.f44056c.f69127o)) {
                    s.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f44056c.f69127o);
                    return;
                }
                Y3.a c11 = Y3.b.c(c8050c);
                C7272n c12 = c11.c();
                String str2 = c7272n.f69127o;
                if (c12 == null || !Objects.equals(str2, c12.f69127o)) {
                    s.f("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c11.c());
                    return;
                }
                byte[] b11 = c11.b();
                b11.getClass();
                c8050c = new C8050C(b11);
            }
            int a11 = c8050c.a();
            M m11 = this.f44054a;
            m11.e(a11, c8050c);
            m11.b(j11, i11, a11, 0, aVar);
        }

        @Override // N3.M
        public final int c(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
            int i12 = this.f44058e + i11;
            byte[] bArr = this.f44057d;
            if (bArr.length < i12) {
                this.f44057d = Arrays.copyOf(bArr, (i12 / 2) + i12);
            }
            int read = interfaceC7268j.read(this.f44057d, this.f44058e, i11);
            if (read != -1) {
                this.f44058e += read;
                return read;
            }
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // N3.M
        public final void f(C8050C c8050c, int i11, int i12) {
            int i13 = this.f44058e + i11;
            byte[] bArr = this.f44057d;
            if (bArr.length < i13) {
                this.f44057d = Arrays.copyOf(bArr, (i13 / 2) + i13);
            }
            c8050c.n(this.f44058e, i11, this.f44057d);
            this.f44058e += i11;
        }
    }

    private static final class c extends T {

        /* renamed from: H, reason: collision with root package name */
        private final Map<String, C7270l> f44059H;

        /* renamed from: I, reason: collision with root package name */
        private C7270l f44060I;

        private c() {
            throw null;
        }

        c(J3.b bVar, w3.j jVar, i.a aVar, Map map) {
            super(bVar, jVar, aVar);
            this.f44059H = map;
        }

        public final void Q(C7270l c7270l) {
            this.f44060I = c7270l;
            x();
        }

        @Override // F3.T
        public final C7272n n(C7272n c7272n) {
            C7270l c7270l;
            C7270l c7270l2 = this.f44060I;
            if (c7270l2 == null) {
                c7270l2 = c7272n.f69131s;
            }
            if (c7270l2 != null && (c7270l = this.f44059H.get(c7270l2.f69086c)) != null) {
                c7270l2 = c7270l;
            }
            t tVar = c7272n.f69124l;
            if (tVar != null) {
                int e11 = tVar.e();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= e11) {
                        i12 = -1;
                        break;
                    }
                    t.a d11 = tVar.d(i12);
                    if ((d11 instanceof C5536l) && "com.apple.streaming.transportStreamTimestamp".equals(((C5536l) d11).f55522b)) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1) {
                    if (e11 != 1) {
                        t.a[] aVarArr = new t.a[e11 - 1];
                        while (i11 < e11) {
                            if (i11 != i12) {
                                aVarArr[i11 < i12 ? i11 : i11 - 1] = tVar.d(i11);
                            }
                            i11++;
                        }
                        tVar = new t(aVarArr);
                    }
                }
                if (c7270l2 == c7272n.f69131s || tVar != c7272n.f69124l) {
                    C7272n.a a11 = c7272n.a();
                    a11.c0(c7270l2);
                    a11.r0(tVar);
                    c7272n = a11.P();
                }
                return super.n(c7272n);
            }
            tVar = null;
            if (c7270l2 == c7272n.f69131s) {
            }
            C7272n.a a112 = c7272n.a();
            a112.c0(c7270l2);
            a112.r0(tVar);
            c7272n = a112.P();
            return super.n(c7272n);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.media3.exoplayer.hls.l] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.media3.exoplayer.hls.m] */
    public o(String str, int i11, a aVar, f fVar, Map map, J3.b bVar, long j11, C7272n c7272n, w3.j jVar, i.a aVar2, J3.h hVar, F.a aVar3, int i12) {
        this.f44024a = str;
        this.f44025b = i11;
        this.f44026c = aVar;
        this.f44027d = fVar;
        this.f44045t = map;
        this.f44028e = bVar;
        this.f44029f = c7272n;
        this.f44030g = jVar;
        this.f44031h = aVar2;
        this.f44032i = hVar;
        this.f44034k = aVar3;
        this.f44035l = i12;
        f.b bVar2 = new f.b();
        bVar2.f43929a = null;
        bVar2.f43930b = false;
        bVar2.f43931c = null;
        this.f44036m = bVar2;
        this.f44048w = new int[0];
        Set<Integer> set = f44001t0;
        this.f44049x = new HashSet(set.size());
        this.f44050y = new SparseIntArray(set.size());
        this.f44047v = new c[0];
        this.f44016O = new boolean[0];
        this.f44015N = new boolean[0];
        ArrayList<g> arrayList = new ArrayList<>();
        this.f44037n = arrayList;
        this.f44038o = Collections.unmodifiableList(arrayList);
        this.f44043s = new ArrayList<>();
        this.f44039p = new Runnable() { // from class: androidx.media3.exoplayer.hls.l
            @Override // java.lang.Runnable
            public final void run() {
                o.this.s();
            }
        };
        this.f44040q = new Runnable() { // from class: androidx.media3.exoplayer.hls.m
            @Override // java.lang.Runnable
            public final void run() {
                o.a(o.this);
            }
        };
        this.f44041r = N.p(null);
        this.f44017P = j11;
        this.f44018Q = j11;
    }

    private void B() {
        for (c cVar : this.f44047v) {
            cVar.H(this.f44019R);
        }
        this.f44019R = false;
    }

    public static void a(o oVar) {
        oVar.f44004C = true;
        oVar.s();
    }

    public static void c(o oVar, g gVar) {
        z3.k kVar;
        oVar.getClass();
        kVar = i.this.f43969b;
        ((C10978b) kVar).z(gVar.f43954m);
    }

    private void e() {
        G10.a.h(this.f44005D);
        this.f44010I.getClass();
        this.f44011J.getClass();
    }

    private boolean g(int i11) {
        int i12 = i11;
        while (true) {
            ArrayList<g> arrayList = this.f44037n;
            if (i12 >= arrayList.size()) {
                g gVar = arrayList.get(i11);
                for (int i13 = 0; i13 < this.f44047v.length; i13++) {
                    if (this.f44047v[i13].s() > gVar.h(i13)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i12).p()) {
                return false;
            }
            i12++;
        }
    }

    private static C3663n i(int i11, int i12) {
        s.f("HlsSampleStreamWrapper", "Unmapped track with id " + i11 + " of type " + i12);
        return new C3663n();
    }

    private d0 j(C7253I[] c7253iArr) {
        for (int i11 = 0; i11 < c7253iArr.length; i11++) {
            C7253I c7253i = c7253iArr[i11];
            C7272n[] c7272nArr = new C7272n[c7253i.f68962a];
            for (int i12 = 0; i12 < c7253i.f68962a; i12++) {
                C7272n a11 = c7253i.a(i12);
                c7272nArr[i12] = a11.b(this.f44030g.b(a11));
            }
            c7253iArr[i11] = new C7253I(c7253i.f68963b, c7272nArr);
        }
        return new d0(c7253iArr);
    }

    private static C7272n k(C7272n c7272n, C7272n c7272n2, boolean z11) {
        String str;
        String str2;
        if (c7272n == null) {
            return c7272n2;
        }
        String str3 = c7272n2.f69127o;
        int h11 = u.h(str3);
        String str4 = c7272n.f69123k;
        if (N.v(h11, str4) == 1) {
            str2 = N.w(h11, str4);
            str = u.d(str2);
        } else {
            String b11 = u.b(str4, str3);
            str = str3;
            str2 = b11;
        }
        C7272n.a a11 = c7272n2.a();
        a11.j0(c7272n.f69113a);
        a11.l0(c7272n.f69114b);
        a11.m0(c7272n.f69115c);
        a11.n0(c7272n.f69116d);
        a11.A0(c7272n.f69117e);
        a11.w0(c7272n.f69118f);
        a11.S(z11 ? c7272n.f69120h : -1);
        a11.t0(z11 ? c7272n.f69121i : -1);
        a11.U(str2);
        if (h11 == 2) {
            a11.F0(c7272n.f69134v);
            a11.h0(c7272n.f69135w);
            a11.f0(c7272n.f69138z);
        }
        if (str != null) {
            a11.y0(str);
        }
        int i11 = c7272n.f69102G;
        if (i11 != -1 && h11 == 1) {
            a11.T(i11);
        }
        t tVar = c7272n.f69124l;
        if (tVar != null) {
            t tVar2 = c7272n2.f69124l;
            if (tVar2 != null) {
                tVar = tVar2.b(tVar);
            }
            a11.r0(tVar);
        }
        return a11.P();
    }

    private void l(int i11) {
        ArrayList<g> arrayList;
        G10.a.h(!this.f44033j.i());
        while (true) {
            arrayList = this.f44037n;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (g(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = m().f9677h;
        g gVar = arrayList.get(i11);
        N.W(arrayList, i11, arrayList.size());
        for (int i12 = 0; i12 < this.f44047v.length; i12++) {
            this.f44047v[i12].l(gVar.h(i12));
        }
        if (arrayList.isEmpty()) {
            this.f44018Q = this.f44017P;
        } else {
            ((g) B.b(arrayList)).k();
        }
        this.f44021X = false;
        int i13 = this.f44002A;
        long j12 = gVar.f9676g;
        F.a aVar = this.f44034k;
        aVar.getClass();
        C3016v c3016v = new C3016v(1, i13, null, 3, null, N.g0(j12), N.g0(j11));
        InterfaceC3018x.b bVar = aVar.f8406b;
        bVar.getClass();
        aVar.b(new D(aVar, bVar, c3016v));
    }

    private g m() {
        return (g) o0.b(1, this.f44037n);
    }

    private static int o(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 3;
    }

    private boolean p() {
        return this.f44018Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        int i11;
        if (!this.f44009H && this.f44012K == null && this.f44004C) {
            int i12 = 0;
            for (c cVar : this.f44047v) {
                if (cVar.v() == null) {
                    return;
                }
            }
            d0 d0Var = this.f44010I;
            if (d0Var != null) {
                int i13 = d0Var.f8644a;
                int[] iArr = new int[i13];
                this.f44012K = iArr;
                Arrays.fill(iArr, -1);
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = 0;
                    while (true) {
                        c[] cVarArr = this.f44047v;
                        if (i15 < cVarArr.length) {
                            C7272n v11 = cVarArr[i15].v();
                            G10.a.i(v11);
                            C7272n a11 = this.f44010I.a(i14).a(0);
                            String str = a11.f69127o;
                            String str2 = v11.f69127o;
                            int h11 = u.h(str2);
                            if (h11 == 3) {
                                if (Objects.equals(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || v11.f69107L == a11.f69107L) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i15++;
                            } else if (h11 == u.h(str)) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                    this.f44012K[i14] = i15;
                }
                Iterator<j> it = this.f44043s.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                return;
            }
            int length = this.f44047v.length;
            int i16 = 0;
            int i17 = -1;
            int i18 = -2;
            while (true) {
                int i19 = 1;
                if (i16 >= length) {
                    break;
                }
                C7272n v12 = this.f44047v[i16].v();
                G10.a.i(v12);
                String str3 = v12.f69127o;
                if (u.l(str3)) {
                    i19 = 2;
                } else if (!u.i(str3)) {
                    i19 = u.k(str3) ? 3 : -2;
                }
                if (o(i19) > o(i18)) {
                    i17 = i16;
                    i18 = i19;
                } else if (i19 == i18 && i17 != -1) {
                    i17 = -1;
                }
                i16++;
            }
            C7253I i21 = this.f44027d.i();
            int i22 = i21.f68962a;
            this.f44013L = -1;
            this.f44012K = new int[length];
            for (int i23 = 0; i23 < length; i23++) {
                this.f44012K[i23] = i23;
            }
            C7253I[] c7253iArr = new C7253I[length];
            int i24 = 0;
            while (i24 < length) {
                C7272n v13 = this.f44047v[i24].v();
                G10.a.i(v13);
                String str4 = this.f44024a;
                C7272n c7272n = this.f44029f;
                if (i24 == i17) {
                    C7272n[] c7272nArr = new C7272n[i22];
                    for (int i25 = i12; i25 < i22; i25++) {
                        C7272n a12 = i21.a(i25);
                        if (i18 == 1 && c7272n != null) {
                            a12 = a12.e(c7272n);
                        }
                        c7272nArr[i25] = i22 == 1 ? v13.e(a12) : k(a12, v13, true);
                    }
                    c7253iArr[i24] = new C7253I(str4, c7272nArr);
                    this.f44013L = i24;
                    i11 = 0;
                } else {
                    if (i18 != 2 || !u.i(v13.f69127o)) {
                        c7272n = null;
                    }
                    StringBuilder e11 = C2942q.e(str4, ":muxed:");
                    e11.append(i24 < i17 ? i24 : i24 - 1);
                    i11 = 0;
                    c7253iArr[i24] = new C7253I(e11.toString(), k(c7272n, v13, false));
                }
                i24++;
                i12 = i11;
            }
            int i26 = i12;
            this.f44010I = j(c7253iArr);
            G10.a.h(this.f44011J == null ? 1 : i26);
            this.f44011J = Collections.EMPTY_SET;
            this.f44005D = true;
            ((i.a) this.f44026c).a();
        }
    }

    public final void A() {
        if (this.f44005D) {
            for (c cVar : this.f44047v) {
                cVar.E();
            }
        }
        this.f44027d.r();
        this.f44033j.k(this);
        this.f44041r.removeCallbacksAndMessages(null);
        this.f44009H = true;
        this.f44043s.clear();
    }

    public final boolean C(long j11, boolean z11) {
        g gVar;
        boolean z12;
        boolean J11;
        this.f44017P = j11;
        if (p()) {
            this.f44018Q = j11;
            return true;
        }
        boolean k11 = this.f44027d.k();
        ArrayList<g> arrayList = this.f44037n;
        if (k11) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                gVar = arrayList.get(i11);
                if (gVar.f9676g == j11) {
                    break;
                }
            }
        }
        gVar = null;
        if (this.f44004C && !z11 && !arrayList.isEmpty()) {
            int length = this.f44047v.length;
            for (int i12 = 0; i12 < length; i12++) {
                c cVar = this.f44047v[i12];
                if (gVar != null) {
                    J11 = cVar.I(gVar.h(i12));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    J11 = cVar.J(j11, nextLoadPositionUs == Long.MIN_VALUE || j11 < nextLoadPositionUs);
                }
                if (!J11 && (this.f44016O[i12] || !this.f44014M)) {
                    z12 = false;
                    break;
                }
            }
            z12 = true;
            if (z12) {
                return false;
            }
        }
        this.f44018Q = j11;
        this.f44021X = false;
        arrayList.clear();
        J3.j jVar = this.f44033j;
        if (!jVar.i()) {
            jVar.f();
            B();
            return true;
        }
        if (this.f44004C) {
            for (c cVar2 : this.f44047v) {
                cVar2.j();
            }
        }
        jVar.e();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        if (r3.i() != r14.i().b(r1.f9673d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11, boolean z11) {
        boolean z12;
        e();
        int i11 = this.f44006E;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            j jVar = (j) uArr[i12];
            if (jVar != null && (yVarArr[i12] == null || !zArr[i12])) {
                this.f44006E--;
                jVar.c();
                uArr[i12] = null;
            }
        }
        boolean z13 = z11 || (!this.f44020S ? j11 == this.f44017P : i11 != 0);
        f fVar = this.f44027d;
        y j12 = fVar.j();
        boolean z14 = z13;
        y yVar = j12;
        for (int i13 = 0; i13 < yVarArr.length; i13++) {
            y yVar2 = yVarArr[i13];
            if (yVar2 != null) {
                int c11 = this.f44010I.c(yVar2.g());
                if (c11 == this.f44013L) {
                    fVar.t(yVar2);
                    yVar = yVar2;
                }
                if (uArr[i13] == null) {
                    this.f44006E++;
                    j jVar2 = new j(this, c11);
                    uArr[i13] = jVar2;
                    zArr2[i13] = true;
                    if (this.f44012K != null) {
                        jVar2.a();
                        if (!z14) {
                            c cVar = this.f44047v[this.f44012K[c11]];
                            z14 = (cVar.s() == 0 || cVar.J(j11, true)) ? false : true;
                        }
                    }
                }
            }
        }
        int i14 = this.f44006E;
        ArrayList<g> arrayList = this.f44037n;
        if (i14 == 0) {
            fVar.r();
            this.f44008G = null;
            this.f44019R = true;
            arrayList.clear();
            J3.j jVar3 = this.f44033j;
            if (jVar3.i()) {
                if (this.f44004C) {
                    for (c cVar2 : this.f44047v) {
                        cVar2.j();
                    }
                }
                jVar3.e();
            } else {
                B();
            }
        } else {
            if (!arrayList.isEmpty() && !Objects.equals(yVar, j12)) {
                if (!this.f44020S) {
                    long j13 = j11 < 0 ? -j11 : 0L;
                    g m11 = m();
                    y yVar3 = yVar;
                    yVar3.n(j11, j13, -9223372036854775807L, this.f44038o, fVar.a(m11, j11));
                }
                this.f44019R = true;
                z12 = true;
                z14 = true;
                if (z14) {
                    C(j11, z12);
                    for (int i15 = 0; i15 < uArr.length; i15++) {
                        if (uArr[i15] != null) {
                            zArr2[i15] = true;
                        }
                    }
                }
            }
            z12 = z11;
            if (z14) {
            }
        }
        ArrayList<j> arrayList2 = this.f44043s;
        arrayList2.clear();
        for (U u11 : uArr) {
            if (u11 != null) {
                arrayList2.add((j) u11);
            }
        }
        this.f44020S = true;
        return z14;
    }

    public final void E(C7270l c7270l) {
        if (Objects.equals(this.f44042r0, c7270l)) {
            return;
        }
        this.f44042r0 = c7270l;
        int i11 = 0;
        while (true) {
            c[] cVarArr = this.f44047v;
            if (i11 >= cVarArr.length) {
                return;
            }
            if (this.f44016O[i11]) {
                cVarArr[i11].Q(c7270l);
            }
            i11++;
        }
    }

    public final void F(boolean z11) {
        this.f44027d.s(z11);
    }

    public final void G(long j11) {
        if (this.f44023Z != j11) {
            this.f44023Z = j11;
            for (c cVar : this.f44047v) {
                cVar.K(j11);
            }
        }
    }

    public final int H(int i11, long j11) {
        g next;
        g gVar;
        if (p()) {
            return 0;
        }
        c cVar = this.f44047v[i11];
        int u11 = cVar.u(j11, this.f44021X);
        ArrayList<g> arrayList = this.f44037n;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                gVar = arrayList.get(arrayList.size() - 1);
            }
            gVar = null;
        } else {
            Iterator<g> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                gVar = next;
            }
            gVar = null;
        }
        g gVar2 = gVar;
        if (gVar2 != null && !gVar2.m()) {
            u11 = Math.min(u11, gVar2.h(i11) - cVar.s());
        }
        cVar.N(u11);
        return u11;
    }

    public final void I(int i11) {
        e();
        this.f44012K.getClass();
        int i12 = this.f44012K[i11];
        G10.a.h(this.f44015N[i12]);
        this.f44015N[i12] = false;
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        long j11;
        long j12;
        List<g> list;
        z3.k kVar;
        if (!this.f44021X) {
            J3.j jVar = this.f44033j;
            if (!jVar.i() && !jVar.h()) {
                if (p()) {
                    List<g> list2 = Collections.EMPTY_LIST;
                    long j13 = this.f44018Q;
                    for (c cVar : this.f44047v) {
                        cVar.L(this.f44018Q);
                    }
                    list = list2;
                    j11 = j13;
                    j12 = j11;
                } else {
                    g m12 = m();
                    long i11 = (m12.l() && m12.m()) ? m12.i() : Math.max(this.f44017P, m12.f9676g);
                    long j14 = this.f44017P;
                    boolean z11 = this.f44004C;
                    List<g> list3 = this.f44038o;
                    if (z11) {
                        for (c cVar2 : this.f44047v) {
                            j14 = Math.max(j14, cVar2.q());
                        }
                    }
                    j11 = i11;
                    j12 = j14;
                    list = list3;
                }
                f.b bVar = this.f44036m;
                bVar.f43929a = null;
                bVar.f43930b = false;
                bVar.f43931c = null;
                this.f44027d.d(m11, j11, j12, list, this.f44005D || !list.isEmpty(), this.f44036m);
                boolean z12 = bVar.f43930b;
                G3.b bVar2 = bVar.f43929a;
                Uri uri = bVar.f43931c;
                if (z12) {
                    this.f44018Q = -9223372036854775807L;
                    this.f44021X = true;
                    return true;
                }
                if (bVar2 != null) {
                    if (bVar2 instanceof g) {
                        g gVar = (g) bVar2;
                        ArrayList<g> arrayList = this.f44037n;
                        if (!arrayList.isEmpty()) {
                            if (!m().m()) {
                                l(arrayList.size() - 1);
                            }
                            if (gVar.f43955n && gVar.p()) {
                                int size = arrayList.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        break;
                                    }
                                    long j15 = arrayList.get(size).f9676g;
                                    long j16 = gVar.f9676g;
                                    if (j15 < j16) {
                                        break;
                                    }
                                    if (j15 == j16 && g(size)) {
                                        l(size);
                                        gVar.d();
                                        break;
                                    }
                                    size--;
                                }
                            }
                        }
                        this.f44044s0 = gVar;
                        this.f44007F = gVar.f9673d;
                        this.f44018Q = -9223372036854775807L;
                        arrayList.add(gVar);
                        int i12 = AbstractC5880y.f59142c;
                        AbstractC5880y.a aVar = new AbstractC5880y.a();
                        for (c cVar3 : this.f44047v) {
                            aVar.e(Integer.valueOf(cVar3.w()));
                        }
                        gVar.j(this, aVar.j());
                        for (c cVar4 : this.f44047v) {
                            cVar4.getClass();
                            cVar4.O(gVar.f43952k);
                            if (gVar.p()) {
                                cVar4.P();
                            }
                        }
                    }
                    this.f44046u = bVar2;
                    jVar.l(bVar2, this, this.f44032i.b(bVar2.f9672c));
                    return true;
                }
                if (uri != null) {
                    kVar = i.this.f43969b;
                    ((C10978b) kVar).z(uri);
                    return false;
                }
            }
        }
        return false;
    }

    public final void discardBuffer(long j11, boolean z11) {
        if (!this.f44004C || p()) {
            return;
        }
        int length = this.f44047v.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f44047v[i11].i(j11, z11, this.f44015N[i11]);
        }
    }

    @Override // N3.r
    public final void endTracks() {
        this.f44022Y = true;
        this.f44041r.post(this.f44040q);
    }

    public final int f(int i11) {
        e();
        this.f44012K.getClass();
        int i12 = this.f44012K[i11];
        if (i12 == -1) {
            return this.f44011J.contains(this.f44010I.a(i11)) ? -3 : -2;
        }
        boolean[] zArr = this.f44015N;
        if (zArr[i12]) {
            return -2;
        }
        zArr[i12] = true;
        return i12;
    }

    public final long getAdjustedSeekPositionUs(long j11, I i11) {
        return this.f44027d.b(j11, i11);
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        if (this.f44021X) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.f44018Q;
        }
        long j11 = this.f44017P;
        g m11 = m();
        if (!m11.l()) {
            ArrayList<g> arrayList = this.f44037n;
            m11 = arrayList.size() > 1 ? (g) o0.b(2, arrayList) : null;
        }
        if (m11 != null) {
            j11 = Math.max(j11, m11.f9677h);
        }
        if (this.f44004C) {
            for (c cVar : this.f44047v) {
                j11 = Math.max(j11, cVar.p());
            }
        }
        return j11;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        if (p()) {
            return this.f44018Q;
        }
        if (this.f44021X) {
            return Long.MIN_VALUE;
        }
        return m().f9677h;
    }

    public final d0 getTrackGroups() {
        e();
        return this.f44010I;
    }

    public final void h() {
        if (this.f44005D) {
            return;
        }
        M.a aVar = new M.a();
        aVar.f(this.f44017P);
        continueLoading(aVar.d());
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f44033j.i();
    }

    public final void maybeThrowPrepareError() throws IOException {
        t();
        if (this.f44021X && !this.f44005D) {
            throw v.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final int n() {
        return this.f44013L;
    }

    @Override // J3.j.a
    public final void onLoadCanceled(G3.b bVar, long j11, long j12, boolean z11) {
        G3.b bVar2 = bVar;
        this.f44046u = null;
        long j13 = bVar2.f9670a;
        bVar2.c();
        Map<String, List<String>> b11 = bVar2.b();
        bVar2.a();
        C3013s c3013s = new C3013s(bVar2.f9671b, b11, j12);
        this.f44032i.getClass();
        this.f44034k.d(c3013s, bVar2.f9672c, this.f44025b, bVar2.f9673d, bVar2.f9674e, bVar2.f9675f, bVar2.f9676g, bVar2.f9677h);
        if (z11) {
            return;
        }
        if (p() || this.f44006E == 0) {
            B();
        }
        if (this.f44006E > 0) {
            ((i.a) this.f44026c).c(this);
        }
    }

    @Override // J3.j.a
    public final void onLoadCompleted(G3.b bVar, long j11, long j12) {
        G3.b bVar2 = bVar;
        this.f44046u = null;
        this.f44027d.p(bVar2);
        long j13 = bVar2.f9670a;
        bVar2.c();
        Map<String, List<String>> b11 = bVar2.b();
        bVar2.a();
        C3013s c3013s = new C3013s(bVar2.f9671b, b11, j12);
        this.f44032i.getClass();
        this.f44034k.e(c3013s, bVar2.f9672c, this.f44025b, bVar2.f9673d, bVar2.f9674e, bVar2.f9675f, bVar2.f9676g, bVar2.f9677h);
        if (this.f44005D) {
            ((i.a) this.f44026c).c(this);
            return;
        }
        M.a aVar = new M.a();
        aVar.f(this.f44017P);
        continueLoading(aVar.d());
    }

    @Override // J3.j.a
    public final j.b onLoadError(G3.b bVar, long j11, long j12, IOException iOException, int i11) {
        j.b g10;
        int i12;
        G3.b bVar2 = bVar;
        boolean z11 = bVar2 instanceof g;
        if (z11 && !((g) bVar2).m() && (iOException instanceof p3.s) && ((i12 = ((p3.s) iOException).f80119d) == 410 || i12 == 404)) {
            return J3.j.f13798d;
        }
        long a11 = bVar2.a();
        bVar2.c();
        C3013s c3013s = new C3013s(bVar2.f9671b, bVar2.b(), j12);
        N.g0(bVar2.f9676g);
        N.g0(bVar2.f9677h);
        i.c cVar = new i.c(i11, iOException);
        f fVar = this.f44027d;
        i.a a12 = I3.D.a(fVar.j());
        J3.h hVar = this.f44032i;
        i.b c11 = hVar.c(a12, cVar);
        boolean m11 = (c11 == null || c11.f13794a != 2) ? false : fVar.m(bVar2, c11.f13795b);
        if (m11) {
            if (z11 && a11 == 0) {
                ArrayList<g> arrayList = this.f44037n;
                G10.a.h(arrayList.remove(arrayList.size() - 1) == bVar2);
                if (arrayList.isEmpty()) {
                    this.f44018Q = this.f44017P;
                } else {
                    ((g) B.b(arrayList)).k();
                }
            }
            g10 = J3.j.f13799e;
        } else {
            long a13 = hVar.a(cVar);
            g10 = a13 != -9223372036854775807L ? J3.j.g(a13, false) : J3.j.f13800f;
        }
        j.b bVar3 = g10;
        boolean c12 = bVar3.c();
        this.f44034k.f(c3013s, bVar2.f9672c, this.f44025b, bVar2.f9673d, bVar2.f9674e, bVar2.f9675f, bVar2.f9676g, bVar2.f9677h, iOException, !c12);
        if (!c12) {
            this.f44046u = null;
        }
        if (m11) {
            if (!this.f44005D) {
                M.a aVar = new M.a();
                aVar.f(this.f44017P);
                continueLoading(aVar.d());
                return bVar3;
            }
            ((i.a) this.f44026c).c(this);
        }
        return bVar3;
    }

    @Override // J3.j.a
    public final void onLoadStarted(G3.b bVar, long j11, long j12, int i11) {
        C3013s c3013s;
        G3.b bVar2 = bVar;
        if (i11 == 0) {
            long j13 = bVar2.f9670a;
            c3013s = new C3013s(bVar2.f9671b);
        } else {
            long j14 = bVar2.f9670a;
            bVar2.c();
            Map<String, List<String>> b11 = bVar2.b();
            bVar2.a();
            c3013s = new C3013s(bVar2.f9671b, b11, j12);
        }
        C3013s c3013s2 = c3013s;
        this.f44034k.g(c3013s2, bVar2.f9672c, this.f44025b, bVar2.f9673d, bVar2.f9674e, bVar2.f9675f, bVar2.f9676g, bVar2.f9677h, i11);
    }

    @Override // J3.j.e
    public final void onLoaderReleased() {
        for (c cVar : this.f44047v) {
            cVar.G();
        }
    }

    @Override // F3.T.c
    public final void onUpstreamFormatChanged(C7272n c7272n) {
        this.f44041r.post(this.f44039p);
    }

    public final boolean q(int i11) {
        return !p() && this.f44047v[i11].z(this.f44021X);
    }

    public final boolean r() {
        return this.f44002A == 2;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        J3.j jVar = this.f44033j;
        if (jVar.h() || p()) {
            return;
        }
        boolean i11 = jVar.i();
        f fVar = this.f44027d;
        List<g> list = this.f44038o;
        if (i11) {
            this.f44046u.getClass();
            if (fVar.u(j11, this.f44046u, list)) {
                jVar.e();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && fVar.c(list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            l(size);
        }
        int g10 = fVar.g(j11, list);
        if (g10 < this.f44037n.size()) {
            l(g10);
        }
    }

    @Override // N3.r
    public final void seekMap(H h11) {
    }

    public final void t() throws IOException {
        this.f44033j.j(LinearLayoutManager.INVALID_OFFSET);
        this.f44027d.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.media3.exoplayer.hls.o$c[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.hls.o$c[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [N3.M] */
    /* JADX WARN: Type inference failed for: r6v4, types: [F3.T, androidx.media3.exoplayer.hls.o$c] */
    /* JADX WARN: Type inference failed for: r6v5, types: [N3.n] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // N3.r
    public final N3.M track(int i11, int i12) {
        Integer valueOf = Integer.valueOf(i12);
        Set<Integer> set = f44001t0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f44049x;
        SparseIntArray sparseIntArray = this.f44050y;
        ?? r62 = 0;
        r62 = 0;
        if (contains) {
            G10.a.c(set.contains(Integer.valueOf(i12)));
            int i13 = sparseIntArray.get(i12, -1);
            if (i13 != -1) {
                if (hashSet.add(Integer.valueOf(i12))) {
                    this.f44048w[i13] = i11;
                }
                r62 = this.f44048w[i13] == i11 ? this.f44047v[i13] : i(i11, i12);
            }
        } else {
            int i14 = 0;
            while (true) {
                ?? r22 = this.f44047v;
                if (i14 >= r22.length) {
                    break;
                }
                if (this.f44048w[i14] == i11) {
                    r62 = r22[i14];
                    break;
                }
                i14++;
            }
        }
        if (r62 == 0) {
            if (this.f44022Y) {
                return i(i11, i12);
            }
            int length = this.f44047v.length;
            boolean z11 = i12 == 1 || i12 == 2;
            r62 = new c(this.f44028e, this.f44030g, this.f44031h, this.f44045t);
            r62.L(this.f44017P);
            if (z11) {
                r62.Q(this.f44042r0);
            }
            r62.K(this.f44023Z);
            if (this.f44044s0 != null) {
                r62.O(r2.f43952k);
            }
            r62.M(this);
            int i15 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f44048w, i15);
            this.f44048w = copyOf;
            copyOf[length] = i11;
            c[] cVarArr = this.f44047v;
            int i16 = N.f74289a;
            ?? copyOf2 = Arrays.copyOf(cVarArr, cVarArr.length + 1);
            copyOf2[cVarArr.length] = r62;
            this.f44047v = (c[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f44016O, i15);
            this.f44016O = copyOf3;
            copyOf3[length] = z11;
            this.f44014M |= z11;
            hashSet.add(Integer.valueOf(i12));
            sparseIntArray.append(i12, length);
            if (o(i12) > o(this.f44002A)) {
                this.f44003B = length;
                this.f44002A = i12;
            }
            this.f44015N = Arrays.copyOf(this.f44015N, i15);
        }
        if (i12 != 5) {
            return r62;
        }
        if (this.f44051z == null) {
            this.f44051z = new b(r62, this.f44035l);
        }
        return this.f44051z;
    }

    public final void u(int i11) throws IOException {
        t();
        this.f44047v[i11].B();
    }

    public final void v() {
        this.f44049x.clear();
    }

    public final boolean w(Uri uri, i.c cVar, boolean z11) {
        long j11;
        f fVar = this.f44027d;
        if (!fVar.o(uri)) {
            return true;
        }
        if (!z11) {
            i.b c11 = this.f44032i.c(I3.D.a(fVar.j()), cVar);
            if (c11 != null && c11.f13794a == 2) {
                j11 = c11.f13795b;
                return fVar.q(uri, j11);
            }
        }
        j11 = -9223372036854775807L;
        return fVar.q(uri, j11);
    }

    public final void x() {
        ArrayList<g> arrayList = this.f44037n;
        if (arrayList.isEmpty()) {
            return;
        }
        final g gVar = (g) B.b(arrayList);
        f fVar = this.f44027d;
        int c11 = fVar.c(gVar);
        if (c11 == 1) {
            if (gVar.m()) {
                return;
            }
            gVar.o(fVar.h(gVar));
        } else {
            if (c11 == 0) {
                this.f44041r.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.c(o.this, gVar);
                    }
                });
                return;
            }
            if (c11 != 2 || this.f44021X) {
                return;
            }
            J3.j jVar = this.f44033j;
            if (jVar.i()) {
                jVar.e();
            }
        }
    }

    public final void y(C7253I[] c7253iArr, int... iArr) {
        this.f44010I = j(c7253iArr);
        this.f44011J = new HashSet();
        for (int i11 : iArr) {
            this.f44011J.add(this.f44010I.a(i11));
        }
        this.f44013L = 0;
        Handler handler = this.f44041r;
        final a aVar = this.f44026c;
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.n
            @Override // java.lang.Runnable
            public final void run() {
                ((i.a) o.a.this).a();
            }
        });
        this.f44005D = true;
    }

    public final int z(int i11, C9730B c9730b, s3.f fVar, int i12) {
        C7272n c7272n;
        if (p()) {
            return -3;
        }
        ArrayList<g> arrayList = this.f44037n;
        int i13 = 0;
        if (!arrayList.isEmpty()) {
            int i14 = 0;
            loop0: while (i14 < arrayList.size() - 1) {
                int i15 = arrayList.get(i14).f43952k;
                int length = this.f44047v.length;
                for (int i16 = 0; i16 < length; i16++) {
                    if (this.f44015N[i16] && this.f44047v[i16].D() == i15) {
                        break loop0;
                    }
                }
                i14++;
            }
            N.W(arrayList, 0, i14);
            g gVar = arrayList.get(0);
            C7272n c7272n2 = gVar.f9673d;
            if (!c7272n2.equals(this.f44008G)) {
                this.f44034k.c(this.f44025b, c7272n2, gVar.f9674e, gVar.f9675f, gVar.f9676g);
            }
            this.f44008G = c7272n2;
        }
        if (!arrayList.isEmpty() && !arrayList.get(0).m()) {
            return -3;
        }
        int F11 = this.f44047v[i11].F(c9730b, fVar, i12, this.f44021X);
        if (F11 == -5) {
            C7272n c7272n3 = c9730b.f98980b;
            c7272n3.getClass();
            if (i11 == this.f44003B) {
                int c11 = com.google.common.primitives.b.c(this.f44047v[i11].D());
                while (i13 < arrayList.size() && arrayList.get(i13).f43952k != c11) {
                    i13++;
                }
                if (i13 < arrayList.size()) {
                    c7272n = arrayList.get(i13).f9673d;
                } else {
                    c7272n = this.f44007F;
                    c7272n.getClass();
                }
                c7272n3 = c7272n3.e(c7272n);
            }
            c9730b.f98980b = c7272n3;
        }
        return F11;
    }
}
