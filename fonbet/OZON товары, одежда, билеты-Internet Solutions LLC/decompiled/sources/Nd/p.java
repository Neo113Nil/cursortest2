package Nd;

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
public final class p extends h.d<p> {

    /* renamed from: t, reason: collision with root package name */
    private static final p f19324t;

    /* renamed from: u, reason: collision with root package name */
    public static Td.r<p> f19325u = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19326b;

    /* renamed from: c, reason: collision with root package name */
    private int f19327c;

    /* renamed from: d, reason: collision with root package name */
    private List<b> f19328d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19329e;

    /* renamed from: f, reason: collision with root package name */
    private int f19330f;

    /* renamed from: g, reason: collision with root package name */
    private p f19331g;

    /* renamed from: h, reason: collision with root package name */
    private int f19332h;

    /* renamed from: i, reason: collision with root package name */
    private int f19333i;

    /* renamed from: j, reason: collision with root package name */
    private int f19334j;

    /* renamed from: k, reason: collision with root package name */
    private int f19335k;

    /* renamed from: l, reason: collision with root package name */
    private int f19336l;

    /* renamed from: m, reason: collision with root package name */
    private p f19337m;

    /* renamed from: n, reason: collision with root package name */
    private int f19338n;

    /* renamed from: o, reason: collision with root package name */
    private p f19339o;

    /* renamed from: p, reason: collision with root package name */
    private int f19340p;

    /* renamed from: q, reason: collision with root package name */
    private int f19341q;

    /* renamed from: r, reason: collision with root package name */
    private byte f19342r;

    /* renamed from: s, reason: collision with root package name */
    private int f19343s;

    static class a extends Td.b<p> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new p(dVar, fVar);
        }
    }

    public static final class c extends h.c<p, c> {

        /* renamed from: d, reason: collision with root package name */
        private int f19357d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f19359f;

        /* renamed from: g, reason: collision with root package name */
        private int f19360g;

        /* renamed from: i, reason: collision with root package name */
        private int f19362i;

        /* renamed from: j, reason: collision with root package name */
        private int f19363j;

        /* renamed from: k, reason: collision with root package name */
        private int f19364k;

        /* renamed from: l, reason: collision with root package name */
        private int f19365l;

        /* renamed from: m, reason: collision with root package name */
        private int f19366m;

        /* renamed from: o, reason: collision with root package name */
        private int f19368o;

        /* renamed from: q, reason: collision with root package name */
        private int f19370q;

        /* renamed from: r, reason: collision with root package name */
        private int f19371r;

        /* renamed from: e, reason: collision with root package name */
        private List<b> f19358e = Collections.EMPTY_LIST;

        /* renamed from: h, reason: collision with root package name */
        private p f19361h = p.T();

        /* renamed from: n, reason: collision with root package name */
        private p f19367n = p.T();

        /* renamed from: p, reason: collision with root package name */
        private p f19369p = p.T();

        private c() {
        }

        static c i() {
            return new c();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            p j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final h.b clone() {
            c cVar = new c();
            cVar.k(j());
            return cVar;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            c cVar = new c();
            cVar.k(j());
            return cVar;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ h.b e(Td.h hVar) {
            k((p) hVar);
            return this;
        }

        public final p j() {
            p pVar = new p(this);
            int i11 = this.f19357d;
            if ((i11 & 1) == 1) {
                this.f19358e = Collections.unmodifiableList(this.f19358e);
                this.f19357d &= -2;
            }
            pVar.f19328d = this.f19358e;
            int i12 = (i11 & 2) != 2 ? 0 : 1;
            pVar.f19329e = this.f19359f;
            if ((i11 & 4) == 4) {
                i12 |= 2;
            }
            pVar.f19330f = this.f19360g;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            pVar.f19331g = this.f19361h;
            if ((i11 & 16) == 16) {
                i12 |= 8;
            }
            pVar.f19332h = this.f19362i;
            if ((i11 & 32) == 32) {
                i12 |= 16;
            }
            pVar.f19333i = this.f19363j;
            if ((i11 & 64) == 64) {
                i12 |= 32;
            }
            pVar.f19334j = this.f19364k;
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i12 |= 64;
            }
            pVar.f19335k = this.f19365l;
            if ((i11 & 256) == 256) {
                i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            pVar.f19336l = this.f19366m;
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                i12 |= 256;
            }
            pVar.f19337m = this.f19367n;
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                i12 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            pVar.f19338n = this.f19368o;
            if ((i11 & 2048) == 2048) {
                i12 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            pVar.f19339o = this.f19369p;
            if ((i11 & 4096) == 4096) {
                i12 |= 2048;
            }
            pVar.f19340p = this.f19370q;
            if ((i11 & 8192) == 8192) {
                i12 |= 4096;
            }
            pVar.f19341q = this.f19371r;
            pVar.f19327c = i12;
            return pVar;
        }

        public final c k(p pVar) {
            if (pVar == p.T()) {
                return this;
            }
            if (!pVar.f19328d.isEmpty()) {
                if (this.f19358e.isEmpty()) {
                    this.f19358e = pVar.f19328d;
                    this.f19357d &= -2;
                } else {
                    if ((this.f19357d & 1) != 1) {
                        this.f19358e = new ArrayList(this.f19358e);
                        this.f19357d |= 1;
                    }
                    this.f19358e.addAll(pVar.f19328d);
                }
            }
            if (pVar.l0()) {
                m(pVar.Y());
            }
            if (pVar.i0()) {
                int V11 = pVar.V();
                this.f19357d |= 4;
                this.f19360g = V11;
            }
            if (pVar.j0()) {
                p W11 = pVar.W();
                if ((this.f19357d & 8) != 8 || this.f19361h == p.T()) {
                    this.f19361h = W11;
                } else {
                    c s02 = p.s0(this.f19361h);
                    s02.k(W11);
                    this.f19361h = s02.j();
                }
                this.f19357d |= 8;
            }
            if (pVar.k0()) {
                int X9 = pVar.X();
                this.f19357d |= 16;
                this.f19362i = X9;
            }
            if (pVar.g0()) {
                int S11 = pVar.S();
                this.f19357d |= 32;
                this.f19363j = S11;
            }
            if (pVar.p0()) {
                int c02 = pVar.c0();
                this.f19357d |= 64;
                this.f19364k = c02;
            }
            if (pVar.q0()) {
                int d02 = pVar.d0();
                this.f19357d |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.f19365l = d02;
            }
            if (pVar.o0()) {
                int b02 = pVar.b0();
                this.f19357d |= 256;
                this.f19366m = b02;
            }
            if (pVar.m0()) {
                p Z11 = pVar.Z();
                if ((this.f19357d & UserVerificationMethods.USER_VERIFY_NONE) != 512 || this.f19367n == p.T()) {
                    this.f19367n = Z11;
                } else {
                    c s03 = p.s0(this.f19367n);
                    s03.k(Z11);
                    this.f19367n = s03.j();
                }
                this.f19357d |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            if (pVar.n0()) {
                int a02 = pVar.a0();
                this.f19357d |= UserVerificationMethods.USER_VERIFY_ALL;
                this.f19368o = a02;
            }
            if (pVar.e0()) {
                p O11 = pVar.O();
                if ((this.f19357d & 2048) != 2048 || this.f19369p == p.T()) {
                    this.f19369p = O11;
                } else {
                    c s04 = p.s0(this.f19369p);
                    s04.k(O11);
                    this.f19369p = s04.j();
                }
                this.f19357d |= 2048;
            }
            if (pVar.f0()) {
                int P11 = pVar.P();
                this.f19357d |= 4096;
                this.f19370q = P11;
            }
            if (pVar.h0()) {
                int U10 = pVar.U();
                this.f19357d |= 8192;
                this.f19371r = U10;
            }
            h(pVar);
            f(d().b(pVar.f19326b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            p pVar = null;
            try {
                try {
                    ((a) p.f19325u).getClass();
                    k(new p(dVar, fVar));
                } catch (Td.j e11) {
                    p pVar2 = (p) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                        if (pVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (pVar != null) {
                    k(pVar);
                }
                throw th;
            }
        }

        public final void m(boolean z11) {
            this.f19357d |= 2;
            this.f19359f = z11;
        }

        @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
        public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }
    }

    static {
        p pVar = new p(0);
        f19324t = pVar;
        pVar.r0();
    }

    private p() {
        throw null;
    }

    p(c cVar) {
        super(cVar);
        this.f19342r = (byte) -1;
        this.f19343s = -1;
        this.f19326b = cVar.d();
    }

    public static p T() {
        return f19324t;
    }

    private void r0() {
        this.f19328d = Collections.EMPTY_LIST;
        this.f19329e = false;
        this.f19330f = 0;
        p pVar = f19324t;
        this.f19331g = pVar;
        this.f19332h = 0;
        this.f19333i = 0;
        this.f19334j = 0;
        this.f19335k = 0;
        this.f19336l = 0;
        this.f19337m = pVar;
        this.f19338n = 0;
        this.f19339o = pVar;
        this.f19340p = 0;
        this.f19341q = 0;
    }

    public static c s0(p pVar) {
        c i11 = c.i();
        i11.k(pVar);
        return i11;
    }

    public final p O() {
        return this.f19339o;
    }

    public final int P() {
        return this.f19340p;
    }

    public final int Q() {
        return this.f19328d.size();
    }

    public final List<b> R() {
        return this.f19328d;
    }

    public final int S() {
        return this.f19333i;
    }

    public final int U() {
        return this.f19341q;
    }

    public final int V() {
        return this.f19330f;
    }

    public final p W() {
        return this.f19331g;
    }

    public final int X() {
        return this.f19332h;
    }

    public final boolean Y() {
        return this.f19329e;
    }

    public final p Z() {
        return this.f19337m;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19327c & 4096) == 4096) {
            eVar.m(1, this.f19341q);
        }
        for (int i11 = 0; i11 < this.f19328d.size(); i11++) {
            eVar.o(2, this.f19328d.get(i11));
        }
        if ((this.f19327c & 1) == 1) {
            boolean z11 = this.f19329e;
            eVar.x(3, 0);
            eVar.q(z11 ? 1 : 0);
        }
        if ((this.f19327c & 2) == 2) {
            eVar.m(4, this.f19330f);
        }
        if ((this.f19327c & 4) == 4) {
            eVar.o(5, this.f19331g);
        }
        if ((this.f19327c & 16) == 16) {
            eVar.m(6, this.f19333i);
        }
        if ((this.f19327c & 32) == 32) {
            eVar.m(7, this.f19334j);
        }
        if ((this.f19327c & 8) == 8) {
            eVar.m(8, this.f19332h);
        }
        if ((this.f19327c & 64) == 64) {
            eVar.m(9, this.f19335k);
        }
        if ((this.f19327c & 256) == 256) {
            eVar.o(10, this.f19337m);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            eVar.m(11, this.f19338n);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            eVar.m(12, this.f19336l);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            eVar.o(13, this.f19339o);
        }
        if ((this.f19327c & 2048) == 2048) {
            eVar.m(14, this.f19340p);
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19326b);
    }

    public final int a0() {
        return this.f19338n;
    }

    public final int b0() {
        return this.f19336l;
    }

    public final int c0() {
        return this.f19334j;
    }

    public final int d0() {
        return this.f19335k;
    }

    public final boolean e0() {
        return (this.f19327c & UserVerificationMethods.USER_VERIFY_ALL) == 1024;
    }

    public final boolean f0() {
        return (this.f19327c & 2048) == 2048;
    }

    public final boolean g0() {
        return (this.f19327c & 16) == 16;
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19324t;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19343s;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19327c & 4096) == 4096 ? Td.e.b(1, this.f19341q) : 0;
        for (int i12 = 0; i12 < this.f19328d.size(); i12++) {
            b11 += Td.e.d(2, this.f19328d.get(i12));
        }
        if ((this.f19327c & 1) == 1) {
            b11 += Td.e.h(3) + 1;
        }
        if ((this.f19327c & 2) == 2) {
            b11 += Td.e.b(4, this.f19330f);
        }
        if ((this.f19327c & 4) == 4) {
            b11 += Td.e.d(5, this.f19331g);
        }
        if ((this.f19327c & 16) == 16) {
            b11 += Td.e.b(6, this.f19333i);
        }
        if ((this.f19327c & 32) == 32) {
            b11 += Td.e.b(7, this.f19334j);
        }
        if ((this.f19327c & 8) == 8) {
            b11 += Td.e.b(8, this.f19332h);
        }
        if ((this.f19327c & 64) == 64) {
            b11 += Td.e.b(9, this.f19335k);
        }
        if ((this.f19327c & 256) == 256) {
            b11 += Td.e.d(10, this.f19337m);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            b11 += Td.e.b(11, this.f19338n);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            b11 += Td.e.b(12, this.f19336l);
        }
        if ((this.f19327c & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            b11 += Td.e.d(13, this.f19339o);
        }
        if ((this.f19327c & 2048) == 2048) {
            b11 += Td.e.b(14, this.f19340p);
        }
        int size = this.f19326b.size() + b11 + g();
        this.f19343s = size;
        return size;
    }

    public final boolean h0() {
        return (this.f19327c & 4096) == 4096;
    }

    public final boolean i0() {
        return (this.f19327c & 2) == 2;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19342r;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19328d.size(); i11++) {
            if (!this.f19328d.get(i11).isInitialized()) {
                this.f19342r = (byte) 0;
                return false;
            }
        }
        if (j0() && !this.f19331g.isInitialized()) {
            this.f19342r = (byte) 0;
            return false;
        }
        if (m0() && !this.f19337m.isInitialized()) {
            this.f19342r = (byte) 0;
            return false;
        }
        if (e0() && !this.f19339o.isInitialized()) {
            this.f19342r = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19342r = (byte) 1;
            return true;
        }
        this.f19342r = (byte) 0;
        return false;
    }

    public final boolean j0() {
        return (this.f19327c & 4) == 4;
    }

    public final boolean k0() {
        return (this.f19327c & 8) == 8;
    }

    public final boolean l0() {
        return (this.f19327c & 1) == 1;
    }

    public final boolean m0() {
        return (this.f19327c & 256) == 256;
    }

    public final boolean n0() {
        return (this.f19327c & UserVerificationMethods.USER_VERIFY_NONE) == 512;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return c.i();
    }

    public final boolean o0() {
        return (this.f19327c & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
    }

    public final boolean p0() {
        return (this.f19327c & 32) == 32;
    }

    public final boolean q0() {
        return (this.f19327c & 64) == 64;
    }

    @Override // Td.p
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final c toBuilder() {
        return s0(this);
    }

    public static final class b extends Td.h implements Td.q {

        /* renamed from: h, reason: collision with root package name */
        private static final b f19344h;

        /* renamed from: i, reason: collision with root package name */
        public static Td.r<b> f19345i = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f19346a;

        /* renamed from: b, reason: collision with root package name */
        private int f19347b;

        /* renamed from: c, reason: collision with root package name */
        private c f19348c;

        /* renamed from: d, reason: collision with root package name */
        private p f19349d;

        /* renamed from: e, reason: collision with root package name */
        private int f19350e;

        /* renamed from: f, reason: collision with root package name */
        private byte f19351f;

        /* renamed from: g, reason: collision with root package name */
        private int f19352g;

        static class a extends Td.b<b> {
            @Override // Td.r
            public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
                return new b(dVar, fVar);
            }
        }

        /* renamed from: Nd.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public static final class C0383b extends h.b<b, C0383b> implements Td.q {

            /* renamed from: b, reason: collision with root package name */
            private int f19353b;

            /* renamed from: c, reason: collision with root package name */
            private c f19354c = c.INV;

            /* renamed from: d, reason: collision with root package name */
            private p f19355d = p.T();

            /* renamed from: e, reason: collision with root package name */
            private int f19356e;

            private C0383b() {
            }

            static C0383b g() {
                return new C0383b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                b h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new Td.v();
            }

            @Override // Td.h.b
            /* renamed from: c */
            public final C0383b clone() {
                C0383b c0383b = new C0383b();
                c0383b.i(h());
                return c0383b;
            }

            @Override // Td.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0383b c0383b = new C0383b();
                c0383b.i(h());
                return c0383b;
            }

            @Override // Td.h.b
            public final /* bridge */ /* synthetic */ C0383b e(b bVar) {
                i(bVar);
                return this;
            }

            public final b h() {
                b bVar = new b(this);
                int i11 = this.f19353b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                bVar.f19348c = this.f19354c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                bVar.f19349d = this.f19355d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                bVar.f19350e = this.f19356e;
                bVar.f19347b = i12;
                return bVar;
            }

            public final void i(b bVar) {
                if (bVar == b.j()) {
                    return;
                }
                if (bVar.p()) {
                    c l11 = bVar.l();
                    l11.getClass();
                    this.f19353b |= 1;
                    this.f19354c = l11;
                }
                if (bVar.s()) {
                    p m11 = bVar.m();
                    if ((this.f19353b & 2) != 2 || this.f19355d == p.T()) {
                        this.f19355d = m11;
                    } else {
                        c s02 = p.s0(this.f19355d);
                        s02.k(m11);
                        this.f19355d = s02.j();
                    }
                    this.f19353b |= 2;
                }
                if (bVar.u()) {
                    int n11 = bVar.n();
                    this.f19353b |= 4;
                    this.f19356e = n11;
                }
                f(d().b(bVar.f19346a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, Td.f fVar) throws IOException {
                b bVar = null;
                try {
                    try {
                        ((a) b.f19345i).getClass();
                        i(new b(dVar, fVar));
                    } catch (Td.j e11) {
                        b bVar2 = (b) e11.a();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            if (bVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (bVar != null) {
                        i(bVar);
                    }
                    throw th;
                }
            }

            @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, Td.f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        public enum c implements i.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);

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
            b bVar = new b();
            f19344h = bVar;
            bVar.f19348c = c.INV;
            bVar.f19349d = p.T();
            bVar.f19350e = 0;
        }

        b(C0383b c0383b) {
            this.f19351f = (byte) -1;
            this.f19352g = -1;
            this.f19346a = c0383b.d();
        }

        public static b j() {
            return f19344h;
        }

        @Override // Td.p
        public final void a(Td.e eVar) throws IOException {
            getSerializedSize();
            if ((this.f19347b & 1) == 1) {
                eVar.l(1, this.f19348c.getNumber());
            }
            if ((this.f19347b & 2) == 2) {
                eVar.o(2, this.f19349d);
            }
            if ((this.f19347b & 4) == 4) {
                eVar.m(3, this.f19350e);
            }
            eVar.r(this.f19346a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f19352g;
            if (i11 != -1) {
                return i11;
            }
            int a11 = (this.f19347b & 1) == 1 ? Td.e.a(1, this.f19348c.getNumber()) : 0;
            if ((this.f19347b & 2) == 2) {
                a11 += Td.e.d(2, this.f19349d);
            }
            if ((this.f19347b & 4) == 4) {
                a11 += Td.e.b(3, this.f19350e);
            }
            int size = this.f19346a.size() + a11;
            this.f19352g = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f19351f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!s() || this.f19349d.isInitialized()) {
                this.f19351f = (byte) 1;
                return true;
            }
            this.f19351f = (byte) 0;
            return false;
        }

        public final c l() {
            return this.f19348c;
        }

        public final p m() {
            return this.f19349d;
        }

        public final int n() {
            return this.f19350e;
        }

        @Override // Td.p
        public final p.a newBuilderForType() {
            return C0383b.g();
        }

        public final boolean p() {
            return (this.f19347b & 1) == 1;
        }

        public final boolean s() {
            return (this.f19347b & 2) == 2;
        }

        @Override // Td.p
        public final p.a toBuilder() {
            C0383b g10 = C0383b.g();
            g10.i(this);
            return g10;
        }

        public final boolean u() {
            return (this.f19347b & 4) == 4;
        }

        private b() {
            this.f19351f = (byte) -1;
            this.f19352g = -1;
            this.f19346a = Td.c.f27045a;
        }

        b(Td.d dVar, Td.f fVar) throws Td.j {
            this.f19351f = (byte) -1;
            this.f19352g = -1;
            this.f19348c = c.INV;
            this.f19349d = p.T();
            boolean z11 = false;
            this.f19350e = 0;
            c.b m11 = Td.c.m();
            Td.e j11 = Td.e.j(m11, 1);
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            c cVar = null;
                            c cVar2 = null;
                            if (r11 == 8) {
                                int n11 = dVar.n();
                                if (n11 == 0) {
                                    cVar2 = c.IN;
                                } else if (n11 == 1) {
                                    cVar2 = c.OUT;
                                } else if (n11 == 2) {
                                    cVar2 = c.INV;
                                } else if (n11 == 3) {
                                    cVar2 = c.STAR;
                                }
                                if (cVar2 == null) {
                                    j11.v(r11);
                                    j11.v(n11);
                                } else {
                                    this.f19347b |= 1;
                                    this.f19348c = cVar2;
                                }
                            } else if (r11 == 18) {
                                if ((this.f19347b & 2) == 2) {
                                    p pVar = this.f19349d;
                                    pVar.getClass();
                                    cVar = p.s0(pVar);
                                }
                                p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                this.f19349d = pVar2;
                                if (cVar != null) {
                                    cVar.k(pVar2);
                                    this.f19349d = cVar.j();
                                }
                                this.f19347b |= 2;
                            } else if (r11 != 24) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                this.f19347b |= 4;
                                this.f19350e = dVar.n();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            j11.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        throw th2;
                    }
                } catch (Td.j e11) {
                    e11.b(this);
                    throw e11;
                } catch (IOException e12) {
                    Td.j jVar = new Td.j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f19346a = m11.j();
            }
        }
    }

    private p(int i11) {
        this.f19342r = (byte) -1;
        this.f19343s = -1;
        this.f19326b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    p(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19342r = (byte) -1;
        this.f19343s = -1;
        r0();
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    Td.r<p> rVar = f19325u;
                    c cVar = null;
                    switch (r11) {
                        case 0:
                            break;
                        case 8:
                            this.f19327c |= 4096;
                            this.f19341q = dVar.n();
                            continue;
                        case 18:
                            if (!z12) {
                                this.f19328d = new ArrayList();
                                z12 = true;
                            }
                            this.f19328d.add(dVar.i(b.f19345i, fVar));
                            continue;
                        case 24:
                            this.f19327c |= 1;
                            this.f19329e = dVar.o() != 0;
                            continue;
                        case 32:
                            this.f19327c |= 2;
                            this.f19330f = dVar.n();
                            continue;
                        case 42:
                            if ((this.f19327c & 4) == 4) {
                                p pVar = this.f19331g;
                                pVar.getClass();
                                cVar = s0(pVar);
                            }
                            p pVar2 = (p) dVar.i(rVar, fVar);
                            this.f19331g = pVar2;
                            if (cVar != null) {
                                cVar.k(pVar2);
                                this.f19331g = cVar.j();
                            }
                            this.f19327c |= 4;
                            continue;
                        case 48:
                            this.f19327c |= 16;
                            this.f19333i = dVar.n();
                            continue;
                        case 56:
                            this.f19327c |= 32;
                            this.f19334j = dVar.n();
                            continue;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            this.f19327c |= 8;
                            this.f19332h = dVar.n();
                            continue;
                        case 72:
                            this.f19327c |= 64;
                            this.f19335k = dVar.n();
                            continue;
                        case 82:
                            if ((this.f19327c & 256) == 256) {
                                p pVar3 = this.f19337m;
                                pVar3.getClass();
                                cVar = s0(pVar3);
                            }
                            p pVar4 = (p) dVar.i(rVar, fVar);
                            this.f19337m = pVar4;
                            if (cVar != null) {
                                cVar.k(pVar4);
                                this.f19337m = cVar.j();
                            }
                            this.f19327c |= 256;
                            continue;
                        case 88:
                            this.f19327c |= UserVerificationMethods.USER_VERIFY_NONE;
                            this.f19338n = dVar.n();
                            continue;
                        case 96:
                            this.f19327c |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            this.f19336l = dVar.n();
                            continue;
                        case 106:
                            if ((this.f19327c & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                                p pVar5 = this.f19339o;
                                pVar5.getClass();
                                cVar = s0(pVar5);
                            }
                            p pVar6 = (p) dVar.i(rVar, fVar);
                            this.f19339o = pVar6;
                            if (cVar != null) {
                                cVar.k(pVar6);
                                this.f19339o = cVar.j();
                            }
                            this.f19327c |= UserVerificationMethods.USER_VERIFY_ALL;
                            continue;
                        case 112:
                            this.f19327c |= 2048;
                            this.f19340p = dVar.n();
                            continue;
                        default:
                            if (!p(dVar, j11, fVar, r11)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (z12) {
                        this.f19328d = Collections.unmodifiableList(this.f19328d);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19326b = m11.j();
                        throw th3;
                    }
                    this.f19326b = m11.j();
                    m();
                    throw th2;
                }
            } catch (Td.j e11) {
                e11.b(this);
                throw e11;
            } catch (IOException e12) {
                Td.j jVar = new Td.j(e12.getMessage());
                jVar.b(this);
                throw jVar;
            }
        }
        if (z12) {
            this.f19328d = Collections.unmodifiableList(this.f19328d);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19326b = m11.j();
            throw th4;
        }
        this.f19326b = m11.j();
        m();
    }
}
