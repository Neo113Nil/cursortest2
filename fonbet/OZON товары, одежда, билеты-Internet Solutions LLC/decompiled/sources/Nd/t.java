package Nd;

import Nd.p;
import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import androidx.recyclerview.widget.m;
import java.io.IOException;

/* loaded from: classes.dex */
public final class t extends h.d<t> {

    /* renamed from: l, reason: collision with root package name */
    private static final t f19428l;

    /* renamed from: m, reason: collision with root package name */
    public static Td.r<t> f19429m = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19430b;

    /* renamed from: c, reason: collision with root package name */
    private int f19431c;

    /* renamed from: d, reason: collision with root package name */
    private int f19432d;

    /* renamed from: e, reason: collision with root package name */
    private int f19433e;

    /* renamed from: f, reason: collision with root package name */
    private p f19434f;

    /* renamed from: g, reason: collision with root package name */
    private int f19435g;

    /* renamed from: h, reason: collision with root package name */
    private p f19436h;

    /* renamed from: i, reason: collision with root package name */
    private int f19437i;

    /* renamed from: j, reason: collision with root package name */
    private byte f19438j;

    /* renamed from: k, reason: collision with root package name */
    private int f19439k;

    static class a extends Td.b<t> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new t(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<t, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19440d;

        /* renamed from: e, reason: collision with root package name */
        private int f19441e;

        /* renamed from: f, reason: collision with root package name */
        private int f19442f;

        /* renamed from: h, reason: collision with root package name */
        private int f19444h;

        /* renamed from: j, reason: collision with root package name */
        private int f19446j;

        /* renamed from: g, reason: collision with root package name */
        private p f19443g = p.T();

        /* renamed from: i, reason: collision with root package name */
        private p f19445i = p.T();

        private b() {
        }

        static b i() {
            return new b();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            l(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            t j11 = j();
            if (j11.isInitialized()) {
                return j11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final h.b clone() {
            b bVar = new b();
            bVar.k(j());
            return bVar;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.k(j());
            return bVar;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ h.b e(Td.h hVar) {
            k((t) hVar);
            return this;
        }

        public final t j() {
            t tVar = new t(this);
            int i11 = this.f19440d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            tVar.f19432d = this.f19441e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            tVar.f19433e = this.f19442f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            tVar.f19434f = this.f19443g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            tVar.f19435g = this.f19444h;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            tVar.f19436h = this.f19445i;
            if ((i11 & 32) == 32) {
                i12 |= 32;
            }
            tVar.f19437i = this.f19446j;
            tVar.f19431c = i12;
            return tVar;
        }

        public final void k(t tVar) {
            if (tVar == t.F()) {
                return;
            }
            if (tVar.M()) {
                int G11 = tVar.G();
                this.f19440d |= 1;
                this.f19441e = G11;
            }
            if (tVar.N()) {
                int H11 = tVar.H();
                this.f19440d |= 2;
                this.f19442f = H11;
            }
            if (tVar.O()) {
                p I11 = tVar.I();
                if ((this.f19440d & 4) != 4 || this.f19443g == p.T()) {
                    this.f19443g = I11;
                } else {
                    p.c s02 = p.s0(this.f19443g);
                    s02.k(I11);
                    this.f19443g = s02.j();
                }
                this.f19440d |= 4;
            }
            if (tVar.P()) {
                int J11 = tVar.J();
                this.f19440d |= 8;
                this.f19444h = J11;
            }
            if (tVar.Q()) {
                p K11 = tVar.K();
                if ((this.f19440d & 16) != 16 || this.f19445i == p.T()) {
                    this.f19445i = K11;
                } else {
                    p.c s03 = p.s0(this.f19445i);
                    s03.k(K11);
                    this.f19445i = s03.j();
                }
                this.f19440d |= 16;
            }
            if (tVar.R()) {
                int L11 = tVar.L();
                this.f19440d |= 32;
                this.f19446j = L11;
            }
            h(tVar);
            f(d().b(tVar.f19430b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            t tVar = null;
            try {
                try {
                    ((a) t.f19429m).getClass();
                    k(new t(dVar, fVar));
                } catch (Td.j e11) {
                    t tVar2 = (t) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        if (tVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (tVar != null) {
                    k(tVar);
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

    static {
        t tVar = new t(0);
        f19428l = tVar;
        tVar.f19432d = 0;
        tVar.f19433e = 0;
        tVar.f19434f = p.T();
        tVar.f19435g = 0;
        tVar.f19436h = p.T();
        tVar.f19437i = 0;
    }

    private t() {
        throw null;
    }

    t(b bVar) {
        super(bVar);
        this.f19438j = (byte) -1;
        this.f19439k = -1;
        this.f19430b = bVar.d();
    }

    public static t F() {
        return f19428l;
    }

    public final int G() {
        return this.f19432d;
    }

    public final int H() {
        return this.f19433e;
    }

    public final p I() {
        return this.f19434f;
    }

    public final int J() {
        return this.f19435g;
    }

    public final p K() {
        return this.f19436h;
    }

    public final int L() {
        return this.f19437i;
    }

    public final boolean M() {
        return (this.f19431c & 1) == 1;
    }

    public final boolean N() {
        return (this.f19431c & 2) == 2;
    }

    public final boolean O() {
        return (this.f19431c & 4) == 4;
    }

    public final boolean P() {
        return (this.f19431c & 8) == 8;
    }

    public final boolean Q() {
        return (this.f19431c & 16) == 16;
    }

    public final boolean R() {
        return (this.f19431c & 32) == 32;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19431c & 1) == 1) {
            eVar.m(1, this.f19432d);
        }
        if ((this.f19431c & 2) == 2) {
            eVar.m(2, this.f19433e);
        }
        if ((this.f19431c & 4) == 4) {
            eVar.o(3, this.f19434f);
        }
        if ((this.f19431c & 16) == 16) {
            eVar.o(4, this.f19436h);
        }
        if ((this.f19431c & 8) == 8) {
            eVar.m(5, this.f19435g);
        }
        if ((this.f19431c & 32) == 32) {
            eVar.m(6, this.f19437i);
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19430b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19428l;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19439k;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19431c & 1) == 1 ? Td.e.b(1, this.f19432d) : 0;
        if ((this.f19431c & 2) == 2) {
            b11 += Td.e.b(2, this.f19433e);
        }
        if ((this.f19431c & 4) == 4) {
            b11 += Td.e.d(3, this.f19434f);
        }
        if ((this.f19431c & 16) == 16) {
            b11 += Td.e.d(4, this.f19436h);
        }
        if ((this.f19431c & 8) == 8) {
            b11 += Td.e.b(5, this.f19435g);
        }
        if ((this.f19431c & 32) == 32) {
            b11 += Td.e.b(6, this.f19437i);
        }
        int size = this.f19430b.size() + b11 + g();
        this.f19439k = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19438j;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!N()) {
            this.f19438j = (byte) 0;
            return false;
        }
        if (O() && !this.f19434f.isInitialized()) {
            this.f19438j = (byte) 0;
            return false;
        }
        if (Q() && !this.f19436h.isInitialized()) {
            this.f19438j = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19438j = (byte) 1;
            return true;
        }
        this.f19438j = (byte) 0;
        return false;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.i();
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b i11 = b.i();
        i11.k(this);
        return i11;
    }

    private t(int i11) {
        this.f19438j = (byte) -1;
        this.f19439k = -1;
        this.f19430b = Td.c.f27045a;
    }

    t(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19438j = (byte) -1;
        this.f19439k = -1;
        boolean z11 = false;
        this.f19432d = 0;
        this.f19433e = 0;
        this.f19434f = p.T();
        this.f19435g = 0;
        this.f19436h = p.T();
        this.f19437i = 0;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 8) {
                            this.f19431c |= 1;
                            this.f19432d = dVar.n();
                        } else if (r11 != 16) {
                            p.c cVar = null;
                            if (r11 == 26) {
                                if ((this.f19431c & 4) == 4) {
                                    p pVar = this.f19434f;
                                    pVar.getClass();
                                    cVar = p.s0(pVar);
                                }
                                p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                this.f19434f = pVar2;
                                if (cVar != null) {
                                    cVar.k(pVar2);
                                    this.f19434f = cVar.j();
                                }
                                this.f19431c |= 4;
                            } else if (r11 == 34) {
                                if ((this.f19431c & 16) == 16) {
                                    p pVar3 = this.f19436h;
                                    pVar3.getClass();
                                    cVar = p.s0(pVar3);
                                }
                                p pVar4 = (p) dVar.i(p.f19325u, fVar);
                                this.f19436h = pVar4;
                                if (cVar != null) {
                                    cVar.k(pVar4);
                                    this.f19436h = cVar.j();
                                }
                                this.f19431c |= 16;
                            } else if (r11 == 40) {
                                this.f19431c |= 8;
                                this.f19435g = dVar.n();
                            } else if (r11 != 48) {
                                if (!p(dVar, j11, fVar, r11)) {
                                }
                            } else {
                                this.f19431c |= 32;
                                this.f19437i = dVar.n();
                            }
                        } else {
                            this.f19431c |= 2;
                            this.f19433e = dVar.n();
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19430b = m11.j();
                        throw th3;
                    }
                    this.f19430b = m11.j();
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
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19430b = m11.j();
            throw th4;
        }
        this.f19430b = m11.j();
        m();
    }
}
