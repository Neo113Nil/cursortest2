package Nd;

import Nd.p;
import Nd.s;
import Nd.v;
import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.i;
import Td.p;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends h.d<b> {

    /* renamed from: J, reason: collision with root package name */
    private static final b f19064J;

    /* renamed from: K, reason: collision with root package name */
    public static Td.r<b> f19065K = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f19066A;

    /* renamed from: B, reason: collision with root package name */
    private List<p> f19067B;

    /* renamed from: C, reason: collision with root package name */
    private List<Integer> f19068C;

    /* renamed from: D, reason: collision with root package name */
    private int f19069D;

    /* renamed from: E, reason: collision with root package name */
    private s f19070E;

    /* renamed from: F, reason: collision with root package name */
    private List<Integer> f19071F;

    /* renamed from: G, reason: collision with root package name */
    private v f19072G;

    /* renamed from: H, reason: collision with root package name */
    private byte f19073H;

    /* renamed from: I, reason: collision with root package name */
    private int f19074I;

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19075b;

    /* renamed from: c, reason: collision with root package name */
    private int f19076c;

    /* renamed from: d, reason: collision with root package name */
    private int f19077d;

    /* renamed from: e, reason: collision with root package name */
    private int f19078e;

    /* renamed from: f, reason: collision with root package name */
    private int f19079f;

    /* renamed from: g, reason: collision with root package name */
    private List<r> f19080g;

    /* renamed from: h, reason: collision with root package name */
    private List<p> f19081h;

    /* renamed from: i, reason: collision with root package name */
    private List<Integer> f19082i;

    /* renamed from: j, reason: collision with root package name */
    private int f19083j;

    /* renamed from: k, reason: collision with root package name */
    private List<Integer> f19084k;

    /* renamed from: l, reason: collision with root package name */
    private int f19085l;

    /* renamed from: m, reason: collision with root package name */
    private List<p> f19086m;

    /* renamed from: n, reason: collision with root package name */
    private List<Integer> f19087n;

    /* renamed from: o, reason: collision with root package name */
    private int f19088o;

    /* renamed from: p, reason: collision with root package name */
    private List<Nd.c> f19089p;

    /* renamed from: q, reason: collision with root package name */
    private List<h> f19090q;

    /* renamed from: r, reason: collision with root package name */
    private List<m> f19091r;

    /* renamed from: s, reason: collision with root package name */
    private List<q> f19092s;

    /* renamed from: t, reason: collision with root package name */
    private List<f> f19093t;

    /* renamed from: u, reason: collision with root package name */
    private List<Integer> f19094u;

    /* renamed from: v, reason: collision with root package name */
    private int f19095v;

    /* renamed from: w, reason: collision with root package name */
    private int f19096w;

    /* renamed from: x, reason: collision with root package name */
    private p f19097x;

    /* renamed from: y, reason: collision with root package name */
    private int f19098y;

    /* renamed from: z, reason: collision with root package name */
    private List<Integer> f19099z;

    static class a extends Td.b<b> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new b(dVar, fVar, 0);
        }
    }

    /* renamed from: Nd.b$b, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C0381b extends h.c<b, C0381b> {

        /* renamed from: A, reason: collision with root package name */
        private List<Integer> f19100A;

        /* renamed from: B, reason: collision with root package name */
        private v f19101B;

        /* renamed from: d, reason: collision with root package name */
        private int f19102d;

        /* renamed from: e, reason: collision with root package name */
        private int f19103e = 6;

        /* renamed from: f, reason: collision with root package name */
        private int f19104f;

        /* renamed from: g, reason: collision with root package name */
        private int f19105g;

        /* renamed from: h, reason: collision with root package name */
        private List<r> f19106h;

        /* renamed from: i, reason: collision with root package name */
        private List<p> f19107i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f19108j;

        /* renamed from: k, reason: collision with root package name */
        private List<Integer> f19109k;

        /* renamed from: l, reason: collision with root package name */
        private List<p> f19110l;

        /* renamed from: m, reason: collision with root package name */
        private List<Integer> f19111m;

        /* renamed from: n, reason: collision with root package name */
        private List<Nd.c> f19112n;

        /* renamed from: o, reason: collision with root package name */
        private List<h> f19113o;

        /* renamed from: p, reason: collision with root package name */
        private List<m> f19114p;

        /* renamed from: q, reason: collision with root package name */
        private List<q> f19115q;

        /* renamed from: r, reason: collision with root package name */
        private List<f> f19116r;

        /* renamed from: s, reason: collision with root package name */
        private List<Integer> f19117s;

        /* renamed from: t, reason: collision with root package name */
        private int f19118t;

        /* renamed from: u, reason: collision with root package name */
        private p f19119u;

        /* renamed from: v, reason: collision with root package name */
        private int f19120v;

        /* renamed from: w, reason: collision with root package name */
        private List<Integer> f19121w;

        /* renamed from: x, reason: collision with root package name */
        private List<p> f19122x;

        /* renamed from: y, reason: collision with root package name */
        private List<Integer> f19123y;

        /* renamed from: z, reason: collision with root package name */
        private s f19124z;

        private C0381b() {
            List list = Collections.EMPTY_LIST;
            this.f19106h = list;
            this.f19107i = list;
            this.f19108j = list;
            this.f19109k = list;
            this.f19110l = list;
            this.f19111m = list;
            this.f19112n = list;
            this.f19113o = list;
            this.f19114p = list;
            this.f19115q = list;
            this.f19116r = list;
            this.f19117s = list;
            this.f19119u = p.T();
            this.f19121w = list;
            this.f19122x = list;
            this.f19123y = list;
            this.f19124z = s.j();
            this.f19100A = list;
            this.f19101B = v.h();
        }

        static C0381b i() {
            return new C0381b();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            b j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final h.b clone() {
            C0381b c0381b = new C0381b();
            c0381b.k(j());
            return c0381b;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            C0381b c0381b = new C0381b();
            c0381b.k(j());
            return c0381b;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ h.b e(Td.h hVar) {
            k((b) hVar);
            return this;
        }

        public final b j() {
            b bVar = new b(this);
            int i11 = this.f19102d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            bVar.f19077d = this.f19103e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            bVar.f19078e = this.f19104f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            bVar.f19079f = this.f19105g;
            if ((this.f19102d & 8) == 8) {
                this.f19106h = Collections.unmodifiableList(this.f19106h);
                this.f19102d &= -9;
            }
            bVar.f19080g = this.f19106h;
            if ((this.f19102d & 16) == 16) {
                this.f19107i = Collections.unmodifiableList(this.f19107i);
                this.f19102d &= -17;
            }
            bVar.f19081h = this.f19107i;
            if ((this.f19102d & 32) == 32) {
                this.f19108j = Collections.unmodifiableList(this.f19108j);
                this.f19102d &= -33;
            }
            bVar.f19082i = this.f19108j;
            if ((this.f19102d & 64) == 64) {
                this.f19109k = Collections.unmodifiableList(this.f19109k);
                this.f19102d &= -65;
            }
            bVar.f19084k = this.f19109k;
            if ((this.f19102d & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                this.f19110l = Collections.unmodifiableList(this.f19110l);
                this.f19102d &= -129;
            }
            bVar.f19086m = this.f19110l;
            if ((this.f19102d & 256) == 256) {
                this.f19111m = Collections.unmodifiableList(this.f19111m);
                this.f19102d &= -257;
            }
            bVar.f19087n = this.f19111m;
            if ((this.f19102d & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.f19112n = Collections.unmodifiableList(this.f19112n);
                this.f19102d &= -513;
            }
            bVar.f19089p = this.f19112n;
            if ((this.f19102d & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                this.f19113o = Collections.unmodifiableList(this.f19113o);
                this.f19102d &= -1025;
            }
            bVar.f19090q = this.f19113o;
            if ((this.f19102d & 2048) == 2048) {
                this.f19114p = Collections.unmodifiableList(this.f19114p);
                this.f19102d &= -2049;
            }
            bVar.f19091r = this.f19114p;
            if ((this.f19102d & 4096) == 4096) {
                this.f19115q = Collections.unmodifiableList(this.f19115q);
                this.f19102d &= -4097;
            }
            bVar.f19092s = this.f19115q;
            if ((this.f19102d & 8192) == 8192) {
                this.f19116r = Collections.unmodifiableList(this.f19116r);
                this.f19102d &= -8193;
            }
            bVar.f19093t = this.f19116r;
            if ((this.f19102d & 16384) == 16384) {
                this.f19117s = Collections.unmodifiableList(this.f19117s);
                this.f19102d &= -16385;
            }
            bVar.f19094u = this.f19117s;
            if ((i11 & 32768) == 32768) {
                i12 |= 8;
            }
            bVar.f19096w = this.f19118t;
            if ((i11 & 65536) == 65536) {
                i12 |= 16;
            }
            bVar.f19097x = this.f19119u;
            if ((i11 & 131072) == 131072) {
                i12 |= 32;
            }
            bVar.f19098y = this.f19120v;
            if ((this.f19102d & 262144) == 262144) {
                this.f19121w = Collections.unmodifiableList(this.f19121w);
                this.f19102d &= -262145;
            }
            bVar.f19099z = this.f19121w;
            if ((this.f19102d & 524288) == 524288) {
                this.f19122x = Collections.unmodifiableList(this.f19122x);
                this.f19102d &= -524289;
            }
            bVar.f19067B = this.f19122x;
            if ((this.f19102d & 1048576) == 1048576) {
                this.f19123y = Collections.unmodifiableList(this.f19123y);
                this.f19102d &= -1048577;
            }
            bVar.f19068C = this.f19123y;
            if ((i11 & 2097152) == 2097152) {
                i12 |= 64;
            }
            bVar.f19070E = this.f19124z;
            if ((this.f19102d & 4194304) == 4194304) {
                this.f19100A = Collections.unmodifiableList(this.f19100A);
                this.f19102d &= -4194305;
            }
            bVar.f19071F = this.f19100A;
            if ((i11 & 8388608) == 8388608) {
                i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            bVar.f19072G = this.f19101B;
            bVar.f19076c = i12;
            return bVar;
        }

        public final void k(b bVar) {
            if (bVar == b.r0()) {
                return;
            }
            if (bVar.P0()) {
                int t02 = bVar.t0();
                this.f19102d |= 1;
                this.f19103e = t02;
            }
            if (bVar.Q0()) {
                int u02 = bVar.u0();
                this.f19102d |= 2;
                this.f19104f = u02;
            }
            if (bVar.O0()) {
                int n02 = bVar.n0();
                this.f19102d |= 4;
                this.f19105g = n02;
            }
            if (!bVar.f19080g.isEmpty()) {
                if (this.f19106h.isEmpty()) {
                    this.f19106h = bVar.f19080g;
                    this.f19102d &= -9;
                } else {
                    if ((this.f19102d & 8) != 8) {
                        this.f19106h = new ArrayList(this.f19106h);
                        this.f19102d |= 8;
                    }
                    this.f19106h.addAll(bVar.f19080g);
                }
            }
            if (!bVar.f19081h.isEmpty()) {
                if (this.f19107i.isEmpty()) {
                    this.f19107i = bVar.f19081h;
                    this.f19102d &= -17;
                } else {
                    if ((this.f19102d & 16) != 16) {
                        this.f19107i = new ArrayList(this.f19107i);
                        this.f19102d |= 16;
                    }
                    this.f19107i.addAll(bVar.f19081h);
                }
            }
            if (!bVar.f19082i.isEmpty()) {
                if (this.f19108j.isEmpty()) {
                    this.f19108j = bVar.f19082i;
                    this.f19102d &= -33;
                } else {
                    if ((this.f19102d & 32) != 32) {
                        this.f19108j = new ArrayList(this.f19108j);
                        this.f19102d |= 32;
                    }
                    this.f19108j.addAll(bVar.f19082i);
                }
            }
            if (!bVar.f19084k.isEmpty()) {
                if (this.f19109k.isEmpty()) {
                    this.f19109k = bVar.f19084k;
                    this.f19102d &= -65;
                } else {
                    if ((this.f19102d & 64) != 64) {
                        this.f19109k = new ArrayList(this.f19109k);
                        this.f19102d |= 64;
                    }
                    this.f19109k.addAll(bVar.f19084k);
                }
            }
            if (!bVar.f19086m.isEmpty()) {
                if (this.f19110l.isEmpty()) {
                    this.f19110l = bVar.f19086m;
                    this.f19102d &= -129;
                } else {
                    if ((this.f19102d & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                        this.f19110l = new ArrayList(this.f19110l);
                        this.f19102d |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    this.f19110l.addAll(bVar.f19086m);
                }
            }
            if (!bVar.f19087n.isEmpty()) {
                if (this.f19111m.isEmpty()) {
                    this.f19111m = bVar.f19087n;
                    this.f19102d &= -257;
                } else {
                    if ((this.f19102d & 256) != 256) {
                        this.f19111m = new ArrayList(this.f19111m);
                        this.f19102d |= 256;
                    }
                    this.f19111m.addAll(bVar.f19087n);
                }
            }
            if (!bVar.f19089p.isEmpty()) {
                if (this.f19112n.isEmpty()) {
                    this.f19112n = bVar.f19089p;
                    this.f19102d &= -513;
                } else {
                    if ((this.f19102d & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.f19112n = new ArrayList(this.f19112n);
                        this.f19102d |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.f19112n.addAll(bVar.f19089p);
                }
            }
            if (!bVar.f19090q.isEmpty()) {
                if (this.f19113o.isEmpty()) {
                    this.f19113o = bVar.f19090q;
                    this.f19102d &= -1025;
                } else {
                    if ((this.f19102d & UserVerificationMethods.USER_VERIFY_ALL) != 1024) {
                        this.f19113o = new ArrayList(this.f19113o);
                        this.f19102d |= UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    this.f19113o.addAll(bVar.f19090q);
                }
            }
            if (!bVar.f19091r.isEmpty()) {
                if (this.f19114p.isEmpty()) {
                    this.f19114p = bVar.f19091r;
                    this.f19102d &= -2049;
                } else {
                    if ((this.f19102d & 2048) != 2048) {
                        this.f19114p = new ArrayList(this.f19114p);
                        this.f19102d |= 2048;
                    }
                    this.f19114p.addAll(bVar.f19091r);
                }
            }
            if (!bVar.f19092s.isEmpty()) {
                if (this.f19115q.isEmpty()) {
                    this.f19115q = bVar.f19092s;
                    this.f19102d &= -4097;
                } else {
                    if ((this.f19102d & 4096) != 4096) {
                        this.f19115q = new ArrayList(this.f19115q);
                        this.f19102d |= 4096;
                    }
                    this.f19115q.addAll(bVar.f19092s);
                }
            }
            if (!bVar.f19093t.isEmpty()) {
                if (this.f19116r.isEmpty()) {
                    this.f19116r = bVar.f19093t;
                    this.f19102d &= -8193;
                } else {
                    if ((this.f19102d & 8192) != 8192) {
                        this.f19116r = new ArrayList(this.f19116r);
                        this.f19102d |= 8192;
                    }
                    this.f19116r.addAll(bVar.f19093t);
                }
            }
            if (!bVar.f19094u.isEmpty()) {
                if (this.f19117s.isEmpty()) {
                    this.f19117s = bVar.f19094u;
                    this.f19102d &= -16385;
                } else {
                    if ((this.f19102d & 16384) != 16384) {
                        this.f19117s = new ArrayList(this.f19117s);
                        this.f19102d |= 16384;
                    }
                    this.f19117s.addAll(bVar.f19094u);
                }
            }
            if (bVar.R0()) {
                int w02 = bVar.w0();
                this.f19102d |= 32768;
                this.f19118t = w02;
            }
            if (bVar.S0()) {
                p x02 = bVar.x0();
                if ((this.f19102d & 65536) != 65536 || this.f19119u == p.T()) {
                    this.f19119u = x02;
                } else {
                    p.c s02 = p.s0(this.f19119u);
                    s02.k(x02);
                    this.f19119u = s02.j();
                }
                this.f19102d |= 65536;
            }
            if (bVar.T0()) {
                int y02 = bVar.y0();
                this.f19102d |= 131072;
                this.f19120v = y02;
            }
            if (!bVar.f19099z.isEmpty()) {
                if (this.f19121w.isEmpty()) {
                    this.f19121w = bVar.f19099z;
                    this.f19102d &= -262145;
                } else {
                    if ((this.f19102d & 262144) != 262144) {
                        this.f19121w = new ArrayList(this.f19121w);
                        this.f19102d |= 262144;
                    }
                    this.f19121w.addAll(bVar.f19099z);
                }
            }
            if (!bVar.f19067B.isEmpty()) {
                if (this.f19122x.isEmpty()) {
                    this.f19122x = bVar.f19067B;
                    this.f19102d &= -524289;
                } else {
                    if ((this.f19102d & 524288) != 524288) {
                        this.f19122x = new ArrayList(this.f19122x);
                        this.f19102d |= 524288;
                    }
                    this.f19122x.addAll(bVar.f19067B);
                }
            }
            if (!bVar.f19068C.isEmpty()) {
                if (this.f19123y.isEmpty()) {
                    this.f19123y = bVar.f19068C;
                    this.f19102d &= -1048577;
                } else {
                    if ((this.f19102d & 1048576) != 1048576) {
                        this.f19123y = new ArrayList(this.f19123y);
                        this.f19102d |= 1048576;
                    }
                    this.f19123y.addAll(bVar.f19068C);
                }
            }
            if (bVar.U0()) {
                s M02 = bVar.M0();
                if ((this.f19102d & 2097152) != 2097152 || this.f19124z == s.j()) {
                    this.f19124z = M02;
                } else {
                    s.b p11 = s.p(this.f19124z);
                    p11.i(M02);
                    this.f19124z = p11.h();
                }
                this.f19102d |= 2097152;
            }
            if (!bVar.f19071F.isEmpty()) {
                if (this.f19100A.isEmpty()) {
                    this.f19100A = bVar.f19071F;
                    this.f19102d &= -4194305;
                } else {
                    if ((this.f19102d & 4194304) != 4194304) {
                        this.f19100A = new ArrayList(this.f19100A);
                        this.f19102d |= 4194304;
                    }
                    this.f19100A.addAll(bVar.f19071F);
                }
            }
            if (bVar.W0()) {
                v N02 = bVar.N0();
                if ((this.f19102d & 8388608) != 8388608 || this.f19101B == v.h()) {
                    this.f19101B = N02;
                } else {
                    v vVar = this.f19101B;
                    v.b g10 = v.b.g();
                    g10.i(vVar);
                    g10.i(N02);
                    this.f19101B = g10.h();
                }
                this.f19102d |= 8388608;
            }
            h(bVar);
            f(d().b(bVar.f19075b));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            b bVar = null;
            try {
                try {
                    k((b) ((a) b.f19065K).a(dVar, fVar));
                } catch (Td.j e11) {
                    b bVar2 = (b) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVar2;
                        if (bVar != null) {
                            k(bVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (bVar != null) {
                }
                throw th;
            }
        }

        @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
        public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }
    }

    public enum c implements i.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        OBJECT(5),
        COMPANION_OBJECT(6);

        private static i.b<c> internalValueMap = new a();
        private final int value;

        static class a implements i.b<c> {
        }

        c(int i11) {
            this.value = i11;
        }

        @Override // Td.i.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        b bVar = new b(0);
        f19064J = bVar;
        bVar.X0();
    }

    private b() {
        throw null;
    }

    /* synthetic */ b(Td.d dVar, Td.f fVar, int i11) throws Td.j {
        this(dVar, fVar);
    }

    private void X0() {
        this.f19077d = 6;
        this.f19078e = 0;
        this.f19079f = 0;
        List list = Collections.EMPTY_LIST;
        this.f19080g = list;
        this.f19081h = list;
        this.f19082i = list;
        this.f19084k = list;
        this.f19086m = list;
        this.f19087n = list;
        this.f19089p = list;
        this.f19090q = list;
        this.f19091r = list;
        this.f19092s = list;
        this.f19093t = list;
        this.f19094u = list;
        this.f19096w = 0;
        this.f19097x = p.T();
        this.f19098y = 0;
        this.f19099z = list;
        this.f19067B = list;
        this.f19068C = list;
        this.f19070E = s.j();
        this.f19071F = list;
        this.f19072G = v.h();
    }

    public static b r0() {
        return f19064J;
    }

    public final List<Integer> A0() {
        return this.f19099z;
    }

    public final int B0() {
        return this.f19067B.size();
    }

    public final int C0() {
        return this.f19068C.size();
    }

    public final List<Integer> D0() {
        return this.f19068C;
    }

    public final List<p> E0() {
        return this.f19067B;
    }

    public final List<Integer> F0() {
        return this.f19084k;
    }

    public final List<m> G0() {
        return this.f19091r;
    }

    public final List<Integer> H0() {
        return this.f19094u;
    }

    public final List<Integer> I0() {
        return this.f19082i;
    }

    public final List<p> J0() {
        return this.f19081h;
    }

    public final List<q> K0() {
        return this.f19092s;
    }

    public final List<r> L0() {
        return this.f19080g;
    }

    public final s M0() {
        return this.f19070E;
    }

    public final v N0() {
        return this.f19072G;
    }

    public final boolean O0() {
        return (this.f19076c & 4) == 4;
    }

    public final boolean P0() {
        return (this.f19076c & 1) == 1;
    }

    public final boolean Q0() {
        return (this.f19076c & 2) == 2;
    }

    public final boolean R0() {
        return (this.f19076c & 8) == 8;
    }

    public final boolean S0() {
        return (this.f19076c & 16) == 16;
    }

    public final boolean T0() {
        return (this.f19076c & 32) == 32;
    }

    public final boolean U0() {
        return (this.f19076c & 64) == 64;
    }

    public final boolean W0() {
        return (this.f19076c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19076c & 1) == 1) {
            eVar.m(1, this.f19077d);
        }
        if (this.f19082i.size() > 0) {
            eVar.v(18);
            eVar.v(this.f19083j);
        }
        for (int i11 = 0; i11 < this.f19082i.size(); i11++) {
            eVar.n(this.f19082i.get(i11).intValue());
        }
        if ((this.f19076c & 2) == 2) {
            eVar.m(3, this.f19078e);
        }
        if ((this.f19076c & 4) == 4) {
            eVar.m(4, this.f19079f);
        }
        for (int i12 = 0; i12 < this.f19080g.size(); i12++) {
            eVar.o(5, this.f19080g.get(i12));
        }
        for (int i13 = 0; i13 < this.f19081h.size(); i13++) {
            eVar.o(6, this.f19081h.get(i13));
        }
        if (this.f19084k.size() > 0) {
            eVar.v(58);
            eVar.v(this.f19085l);
        }
        for (int i14 = 0; i14 < this.f19084k.size(); i14++) {
            eVar.n(this.f19084k.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.f19089p.size(); i15++) {
            eVar.o(8, this.f19089p.get(i15));
        }
        for (int i16 = 0; i16 < this.f19090q.size(); i16++) {
            eVar.o(9, this.f19090q.get(i16));
        }
        for (int i17 = 0; i17 < this.f19091r.size(); i17++) {
            eVar.o(10, this.f19091r.get(i17));
        }
        for (int i18 = 0; i18 < this.f19092s.size(); i18++) {
            eVar.o(11, this.f19092s.get(i18));
        }
        for (int i19 = 0; i19 < this.f19093t.size(); i19++) {
            eVar.o(13, this.f19093t.get(i19));
        }
        if (this.f19094u.size() > 0) {
            eVar.v(130);
            eVar.v(this.f19095v);
        }
        for (int i21 = 0; i21 < this.f19094u.size(); i21++) {
            eVar.n(this.f19094u.get(i21).intValue());
        }
        if ((this.f19076c & 8) == 8) {
            eVar.m(17, this.f19096w);
        }
        if ((this.f19076c & 16) == 16) {
            eVar.o(18, this.f19097x);
        }
        if ((this.f19076c & 32) == 32) {
            eVar.m(19, this.f19098y);
        }
        for (int i22 = 0; i22 < this.f19086m.size(); i22++) {
            eVar.o(20, this.f19086m.get(i22));
        }
        if (this.f19087n.size() > 0) {
            eVar.v(170);
            eVar.v(this.f19088o);
        }
        for (int i23 = 0; i23 < this.f19087n.size(); i23++) {
            eVar.n(this.f19087n.get(i23).intValue());
        }
        if (this.f19099z.size() > 0) {
            eVar.v(178);
            eVar.v(this.f19066A);
        }
        for (int i24 = 0; i24 < this.f19099z.size(); i24++) {
            eVar.n(this.f19099z.get(i24).intValue());
        }
        for (int i25 = 0; i25 < this.f19067B.size(); i25++) {
            eVar.o(23, this.f19067B.get(i25));
        }
        if (this.f19068C.size() > 0) {
            eVar.v(194);
            eVar.v(this.f19069D);
        }
        for (int i26 = 0; i26 < this.f19068C.size(); i26++) {
            eVar.n(this.f19068C.get(i26).intValue());
        }
        if ((this.f19076c & 64) == 64) {
            eVar.o(30, this.f19070E);
        }
        for (int i27 = 0; i27 < this.f19071F.size(); i27++) {
            eVar.m(31, this.f19071F.get(i27).intValue());
        }
        if ((this.f19076c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            eVar.o(32, this.f19072G);
        }
        n11.a(19000, eVar);
        eVar.r(this.f19075b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19064J;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19074I;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19076c & 1) == 1 ? Td.e.b(1, this.f19077d) : 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19082i.size(); i13++) {
            i12 += Td.e.c(this.f19082i.get(i13).intValue());
        }
        int i14 = b11 + i12;
        if (!this.f19082i.isEmpty()) {
            i14 = i14 + 1 + Td.e.c(i12);
        }
        this.f19083j = i12;
        if ((this.f19076c & 2) == 2) {
            i14 += Td.e.b(3, this.f19078e);
        }
        if ((this.f19076c & 4) == 4) {
            i14 += Td.e.b(4, this.f19079f);
        }
        for (int i15 = 0; i15 < this.f19080g.size(); i15++) {
            i14 += Td.e.d(5, this.f19080g.get(i15));
        }
        for (int i16 = 0; i16 < this.f19081h.size(); i16++) {
            i14 += Td.e.d(6, this.f19081h.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f19084k.size(); i18++) {
            i17 += Td.e.c(this.f19084k.get(i18).intValue());
        }
        int i19 = i14 + i17;
        if (!this.f19084k.isEmpty()) {
            i19 = i19 + 1 + Td.e.c(i17);
        }
        this.f19085l = i17;
        for (int i21 = 0; i21 < this.f19089p.size(); i21++) {
            i19 += Td.e.d(8, this.f19089p.get(i21));
        }
        for (int i22 = 0; i22 < this.f19090q.size(); i22++) {
            i19 += Td.e.d(9, this.f19090q.get(i22));
        }
        for (int i23 = 0; i23 < this.f19091r.size(); i23++) {
            i19 += Td.e.d(10, this.f19091r.get(i23));
        }
        for (int i24 = 0; i24 < this.f19092s.size(); i24++) {
            i19 += Td.e.d(11, this.f19092s.get(i24));
        }
        for (int i25 = 0; i25 < this.f19093t.size(); i25++) {
            i19 += Td.e.d(13, this.f19093t.get(i25));
        }
        int i26 = 0;
        for (int i27 = 0; i27 < this.f19094u.size(); i27++) {
            i26 += Td.e.c(this.f19094u.get(i27).intValue());
        }
        int i28 = i19 + i26;
        if (!this.f19094u.isEmpty()) {
            i28 = i28 + 2 + Td.e.c(i26);
        }
        this.f19095v = i26;
        if ((this.f19076c & 8) == 8) {
            i28 += Td.e.b(17, this.f19096w);
        }
        if ((this.f19076c & 16) == 16) {
            i28 += Td.e.d(18, this.f19097x);
        }
        if ((this.f19076c & 32) == 32) {
            i28 += Td.e.b(19, this.f19098y);
        }
        for (int i29 = 0; i29 < this.f19086m.size(); i29++) {
            i28 += Td.e.d(20, this.f19086m.get(i29));
        }
        int i31 = 0;
        for (int i32 = 0; i32 < this.f19087n.size(); i32++) {
            i31 += Td.e.c(this.f19087n.get(i32).intValue());
        }
        int i33 = i28 + i31;
        if (!this.f19087n.isEmpty()) {
            i33 = i33 + 2 + Td.e.c(i31);
        }
        this.f19088o = i31;
        int i34 = 0;
        for (int i35 = 0; i35 < this.f19099z.size(); i35++) {
            i34 += Td.e.c(this.f19099z.get(i35).intValue());
        }
        int i36 = i33 + i34;
        if (!this.f19099z.isEmpty()) {
            i36 = i36 + 2 + Td.e.c(i34);
        }
        this.f19066A = i34;
        for (int i37 = 0; i37 < this.f19067B.size(); i37++) {
            i36 += Td.e.d(23, this.f19067B.get(i37));
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f19068C.size(); i39++) {
            i38 += Td.e.c(this.f19068C.get(i39).intValue());
        }
        int i41 = i36 + i38;
        if (!this.f19068C.isEmpty()) {
            i41 = i41 + 2 + Td.e.c(i38);
        }
        this.f19069D = i38;
        if ((this.f19076c & 64) == 64) {
            i41 += Td.e.d(30, this.f19070E);
        }
        int i42 = 0;
        for (int i43 = 0; i43 < this.f19071F.size(); i43++) {
            i42 += Td.e.c(this.f19071F.get(i43).intValue());
        }
        int size = (this.f19071F.size() * 2) + i41 + i42;
        if ((this.f19076c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            size += Td.e.d(32, this.f19072G);
        }
        int size2 = this.f19075b.size() + size + g();
        this.f19074I = size2;
        return size2;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19073H;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!Q0()) {
            this.f19073H = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19080g.size(); i11++) {
            if (!this.f19080g.get(i11).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f19081h.size(); i12++) {
            if (!this.f19081h.get(i12).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f19086m.size(); i13++) {
            if (!this.f19086m.get(i13).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f19089p.size(); i14++) {
            if (!this.f19089p.get(i14).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f19090q.size(); i15++) {
            if (!this.f19090q.get(i15).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f19091r.size(); i16++) {
            if (!this.f19091r.get(i16).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f19092s.size(); i17++) {
            if (!this.f19092s.get(i17).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f19093t.size(); i18++) {
            if (!this.f19093t.get(i18).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        if (S0() && !this.f19097x.isInitialized()) {
            this.f19073H = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f19067B.size(); i19++) {
            if (!this.f19067B.get(i19).isInitialized()) {
                this.f19073H = (byte) 0;
                return false;
            }
        }
        if (U0() && !this.f19070E.isInitialized()) {
            this.f19073H = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19073H = (byte) 1;
            return true;
        }
        this.f19073H = (byte) 0;
        return false;
    }

    public final int n0() {
        return this.f19079f;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return C0381b.i();
    }

    public final List<Nd.c> o0() {
        return this.f19089p;
    }

    public final List<Integer> p0() {
        return this.f19087n;
    }

    public final List<p> q0() {
        return this.f19086m;
    }

    public final List<f> s0() {
        return this.f19093t;
    }

    public final int t0() {
        return this.f19077d;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        C0381b i11 = C0381b.i();
        i11.k(this);
        return i11;
    }

    public final int u0() {
        return this.f19078e;
    }

    public final List<h> v0() {
        return this.f19090q;
    }

    public final int w0() {
        return this.f19096w;
    }

    public final p x0() {
        return this.f19097x;
    }

    public final int y0() {
        return this.f19098y;
    }

    public final int z0() {
        return this.f19099z.size();
    }

    b(C0381b c0381b) {
        super(c0381b);
        this.f19083j = -1;
        this.f19085l = -1;
        this.f19088o = -1;
        this.f19095v = -1;
        this.f19066A = -1;
        this.f19069D = -1;
        this.f19073H = (byte) -1;
        this.f19074I = -1;
        this.f19075b = c0381b.d();
    }

    private b(int i11) {
        this.f19083j = -1;
        this.f19085l = -1;
        this.f19088o = -1;
        this.f19095v = -1;
        this.f19066A = -1;
        this.f19069D = -1;
        this.f19073H = (byte) -1;
        this.f19074I = -1;
        this.f19075b = Td.c.f27045a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private b(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19083j = -1;
        this.f19085l = -1;
        this.f19088o = -1;
        this.f19095v = -1;
        this.f19066A = -1;
        this.f19069D = -1;
        this.f19073H = (byte) -1;
        this.f19074I = -1;
        X0();
        c.b m11 = Td.c.m();
        boolean z11 = true;
        Td.e j11 = Td.e.j(m11, 1);
        boolean z12 = false;
        char c11 = 0;
        while (true) {
            boolean z13 = z11;
            if (!z12) {
                try {
                    try {
                        int r11 = dVar.r();
                        switch (r11) {
                            case 0:
                                z12 = z13;
                                z11 = z13;
                                c11 = c11;
                            case 8:
                                this.f19076c |= 1;
                                this.f19077d = dVar.h();
                                z11 = z13;
                                c11 = c11;
                            case 16:
                                int i11 = (c11 == true ? 1 : 0) & 32;
                                c11 = c11;
                                if (i11 != 32) {
                                    this.f19082i = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | ' ';
                                }
                                this.f19082i.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 18:
                                int e11 = dVar.e(dVar.n());
                                int i12 = (c11 == true ? 1 : 0) & 32;
                                c11 = c11;
                                if (i12 != 32) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19082i = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19082i.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e11);
                                z11 = z13;
                                c11 = c11;
                            case 24:
                                this.f19076c |= 2;
                                this.f19078e = dVar.h();
                                z11 = z13;
                                c11 = c11;
                            case 32:
                                this.f19076c |= 4;
                                this.f19079f = dVar.h();
                                z11 = z13;
                                c11 = c11;
                            case 42:
                                int i13 = (c11 == true ? 1 : 0) & 8;
                                c11 = c11;
                                if (i13 != 8) {
                                    this.f19080g = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | '\b';
                                }
                                this.f19080g.add(dVar.i(r.f19398n, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 50:
                                int i14 = (c11 == true ? 1 : 0) & 16;
                                c11 = c11;
                                if (i14 != 16) {
                                    this.f19081h = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 16;
                                }
                                this.f19081h.add(dVar.i(p.f19325u, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 56:
                                int i15 = (c11 == true ? 1 : 0) & 64;
                                c11 = c11;
                                if (i15 != 64) {
                                    this.f19084k = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | '@';
                                }
                                this.f19084k.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 58:
                                int e12 = dVar.e(dVar.n());
                                int i16 = (c11 == true ? 1 : 0) & 64;
                                c11 = c11;
                                if (i16 != 64) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19084k = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | '@';
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19084k.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e12);
                                z11 = z13;
                                c11 = c11;
                            case 66:
                                int i17 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                c11 = c11;
                                if (i17 != 512) {
                                    this.f19089p = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 512;
                                }
                                this.f19089p.add(dVar.i(Nd.c.f19126j, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 74:
                                int i18 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL;
                                c11 = c11;
                                if (i18 != 1024) {
                                    this.f19090q = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 1024;
                                }
                                this.f19090q.add(dVar.i(h.f19192v, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 82:
                                int i19 = (c11 == true ? 1 : 0) & 2048;
                                c11 = c11;
                                if (i19 != 2048) {
                                    this.f19091r = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 2048;
                                }
                                this.f19091r.add(dVar.i(m.f19260v, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 90:
                                int i21 = (c11 == true ? 1 : 0) & 4096;
                                c11 = c11;
                                if (i21 != 4096) {
                                    this.f19092s = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 4096;
                                }
                                this.f19092s.add(dVar.i(q.f19373p, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 106:
                                int i22 = (c11 == true ? 1 : 0) & 8192;
                                c11 = c11;
                                if (i22 != 8192) {
                                    this.f19093t = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 8192;
                                }
                                this.f19093t.add(dVar.i(f.f19162h, fVar));
                                z11 = z13;
                                c11 = c11;
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                int i23 = (c11 == true ? 1 : 0) & 16384;
                                c11 = c11;
                                if (i23 != 16384) {
                                    this.f19094u = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 16384;
                                }
                                this.f19094u.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 130:
                                int e13 = dVar.e(dVar.n());
                                int i24 = (c11 == true ? 1 : 0) & 16384;
                                c11 = c11;
                                if (i24 != 16384) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19094u = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19094u.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e13);
                                z11 = z13;
                                c11 = c11;
                            case 136:
                                this.f19076c |= 8;
                                this.f19096w = dVar.h();
                                z11 = z13;
                                c11 = c11;
                            case 146:
                                p.c builder = (this.f19076c & 16) == 16 ? this.f19097x.toBuilder() : null;
                                p pVar = (p) dVar.i(p.f19325u, fVar);
                                this.f19097x = pVar;
                                if (builder != null) {
                                    builder.k(pVar);
                                    this.f19097x = builder.j();
                                }
                                this.f19076c |= 16;
                                z11 = z13;
                                c11 = c11;
                            case 152:
                                this.f19076c |= 32;
                                this.f19098y = dVar.h();
                                z11 = z13;
                                c11 = c11;
                            case 162:
                                int i25 = (c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_PATTERN;
                                c11 = c11;
                                if (i25 != 128) {
                                    this.f19086m = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 128;
                                }
                                this.f19086m.add(dVar.i(p.f19325u, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 168:
                                int i26 = (c11 == true ? 1 : 0) & 256;
                                c11 = c11;
                                if (i26 != 256) {
                                    this.f19087n = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 256;
                                }
                                this.f19087n.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 170:
                                int e14 = dVar.e(dVar.n());
                                int i27 = (c11 == true ? 1 : 0) & 256;
                                c11 = c11;
                                if (i27 != 256) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19087n = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 256;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19087n.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e14);
                                z11 = z13;
                                c11 = c11;
                            case 176:
                                int i28 = (c11 == true ? 1 : 0) & 262144;
                                c11 = c11;
                                if (i28 != 262144) {
                                    this.f19099z = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 0;
                                }
                                this.f19099z.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 178:
                                int e15 = dVar.e(dVar.n());
                                int i29 = (c11 == true ? 1 : 0) & 262144;
                                c11 = c11;
                                if (i29 != 262144) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19099z = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19099z.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e15);
                                z11 = z13;
                                c11 = c11;
                            case 186:
                                int i31 = (c11 == true ? 1 : 0) & 524288;
                                c11 = c11;
                                if (i31 != 524288) {
                                    this.f19067B = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 0;
                                }
                                this.f19067B.add(dVar.i(p.f19325u, fVar));
                                z11 = z13;
                                c11 = c11;
                            case 192:
                                int i32 = (c11 == true ? 1 : 0) & 1048576;
                                c11 = c11;
                                if (i32 != 1048576) {
                                    this.f19068C = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 0;
                                }
                                this.f19068C.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case 194:
                                int e16 = dVar.e(dVar.n());
                                int i33 = (c11 == true ? 1 : 0) & 1048576;
                                c11 = c11;
                                if (i33 != 1048576) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19068C = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19068C.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e16);
                                z11 = z13;
                                c11 = c11;
                            case 242:
                                s.b s11 = (this.f19076c & 64) == 64 ? this.f19070E.s() : null;
                                s sVar = (s) dVar.i(s.f19418h, fVar);
                                this.f19070E = sVar;
                                if (s11 != null) {
                                    s11.i(sVar);
                                    this.f19070E = s11.h();
                                }
                                this.f19076c |= 64;
                                z11 = z13;
                                c11 = c11;
                            case 248:
                                int i34 = (c11 == true ? 1 : 0) & 4194304;
                                c11 = c11;
                                if (i34 != 4194304) {
                                    this.f19071F = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 0;
                                }
                                this.f19071F.add(Integer.valueOf(dVar.h()));
                                z11 = z13;
                                c11 = c11;
                            case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                int e17 = dVar.e(dVar.n());
                                int i35 = (c11 == true ? 1 : 0) & 4194304;
                                c11 = c11;
                                if (i35 != 4194304) {
                                    c11 = c11;
                                    if (dVar.b() > 0) {
                                        this.f19071F = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.f19071F.add(Integer.valueOf(dVar.h()));
                                }
                                dVar.d(e17);
                                z11 = z13;
                                c11 = c11;
                            case 258:
                                try {
                                    v.b l11 = (this.f19076c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 ? this.f19072G.l() : null;
                                    v vVar = (v) dVar.i(v.f19467f, fVar);
                                    this.f19072G = vVar;
                                    if (l11 != null) {
                                        l11.i(vVar);
                                        this.f19072G = l11.h();
                                    }
                                    this.f19076c |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                    z11 = z13;
                                    c11 = c11;
                                } catch (Td.j e18) {
                                    e = e18;
                                    e.b(this);
                                    throw e;
                                } catch (IOException e19) {
                                    e = e19;
                                    Td.j jVar = new Td.j(e.getMessage());
                                    jVar.b(this);
                                    throw jVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                                        this.f19082i = Collections.unmodifiableList(this.f19082i);
                                    }
                                    if (((c11 == true ? 1 : 0) & 8) == 8) {
                                        this.f19080g = Collections.unmodifiableList(this.f19080g);
                                    }
                                    if (((c11 == true ? 1 : 0) & 16) == 16) {
                                        this.f19081h = Collections.unmodifiableList(this.f19081h);
                                    }
                                    if (((c11 == true ? 1 : 0) & 64) == 64) {
                                        this.f19084k = Collections.unmodifiableList(this.f19084k);
                                    }
                                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                                        this.f19089p = Collections.unmodifiableList(this.f19089p);
                                    }
                                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                                        this.f19090q = Collections.unmodifiableList(this.f19090q);
                                    }
                                    if (((c11 == true ? 1 : 0) & 2048) == 2048) {
                                        this.f19091r = Collections.unmodifiableList(this.f19091r);
                                    }
                                    if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                                        this.f19092s = Collections.unmodifiableList(this.f19092s);
                                    }
                                    if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                                        this.f19093t = Collections.unmodifiableList(this.f19093t);
                                    }
                                    if (((c11 == true ? 1 : 0) & 16384) == 16384) {
                                        this.f19094u = Collections.unmodifiableList(this.f19094u);
                                    }
                                    if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                        this.f19086m = Collections.unmodifiableList(this.f19086m);
                                    }
                                    if (((c11 == true ? 1 : 0) & 256) == 256) {
                                        this.f19087n = Collections.unmodifiableList(this.f19087n);
                                    }
                                    if (((c11 == true ? 1 : 0) & 262144) == 262144) {
                                        this.f19099z = Collections.unmodifiableList(this.f19099z);
                                    }
                                    if (((c11 == true ? 1 : 0) & 524288) == 524288) {
                                        this.f19067B = Collections.unmodifiableList(this.f19067B);
                                    }
                                    if (((c11 == true ? 1 : 0) & 1048576) == 1048576) {
                                        this.f19068C = Collections.unmodifiableList(this.f19068C);
                                    }
                                    if (((c11 == true ? 1 : 0) & 4194304) == 4194304) {
                                        this.f19071F = Collections.unmodifiableList(this.f19071F);
                                    }
                                    try {
                                        j11.i();
                                    } catch (IOException unused) {
                                    } catch (Throwable th3) {
                                        this.f19075b = m11.j();
                                        throw th3;
                                    }
                                    this.f19075b = m11.j();
                                    m();
                                    throw th;
                                }
                            default:
                                if (p(dVar, j11, fVar, r11)) {
                                    z11 = z13;
                                    c11 = c11;
                                }
                                z12 = z13;
                                z11 = z13;
                                c11 = c11;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Td.j e21) {
                    e = e21;
                } catch (IOException e22) {
                    e = e22;
                }
            } else {
                if (((c11 == true ? 1 : 0) & 32) == 32) {
                    this.f19082i = Collections.unmodifiableList(this.f19082i);
                }
                if (((c11 == true ? 1 : 0) & 8) == 8) {
                    this.f19080g = Collections.unmodifiableList(this.f19080g);
                }
                if (((c11 == true ? 1 : 0) & 16) == 16) {
                    this.f19081h = Collections.unmodifiableList(this.f19081h);
                }
                if (((c11 == true ? 1 : 0) & 64) == 64) {
                    this.f19084k = Collections.unmodifiableList(this.f19084k);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.f19089p = Collections.unmodifiableList(this.f19089p);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                    this.f19090q = Collections.unmodifiableList(this.f19090q);
                }
                if (((c11 == true ? 1 : 0) & 2048) == 2048) {
                    this.f19091r = Collections.unmodifiableList(this.f19091r);
                }
                if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                    this.f19092s = Collections.unmodifiableList(this.f19092s);
                }
                if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                    this.f19093t = Collections.unmodifiableList(this.f19093t);
                }
                if (((c11 == true ? 1 : 0) & 16384) == 16384) {
                    this.f19094u = Collections.unmodifiableList(this.f19094u);
                }
                if (((c11 == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    this.f19086m = Collections.unmodifiableList(this.f19086m);
                }
                if (((c11 == true ? 1 : 0) & 256) == 256) {
                    this.f19087n = Collections.unmodifiableList(this.f19087n);
                }
                if (((c11 == true ? 1 : 0) & 262144) == 262144) {
                    this.f19099z = Collections.unmodifiableList(this.f19099z);
                }
                if (((c11 == true ? 1 : 0) & 524288) == 524288) {
                    this.f19067B = Collections.unmodifiableList(this.f19067B);
                }
                if (((c11 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f19068C = Collections.unmodifiableList(this.f19068C);
                }
                if (((c11 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f19071F = Collections.unmodifiableList(this.f19071F);
                }
                try {
                    j11.i();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f19075b = m11.j();
                    throw th5;
                }
                this.f19075b = m11.j();
                m();
                return;
            }
        }
    }
}
