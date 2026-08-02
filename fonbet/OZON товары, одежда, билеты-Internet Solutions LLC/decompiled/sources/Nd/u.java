package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.i;
import Td.p;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class u extends Td.h implements Td.q {

    /* renamed from: k, reason: collision with root package name */
    private static final u f19447k;

    /* renamed from: l, reason: collision with root package name */
    public static Td.r<u> f19448l = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19449a;

    /* renamed from: b, reason: collision with root package name */
    private int f19450b;

    /* renamed from: c, reason: collision with root package name */
    private int f19451c;

    /* renamed from: d, reason: collision with root package name */
    private int f19452d;

    /* renamed from: e, reason: collision with root package name */
    private c f19453e;

    /* renamed from: f, reason: collision with root package name */
    private int f19454f;

    /* renamed from: g, reason: collision with root package name */
    private int f19455g;

    /* renamed from: h, reason: collision with root package name */
    private d f19456h;

    /* renamed from: i, reason: collision with root package name */
    private byte f19457i;

    /* renamed from: j, reason: collision with root package name */
    private int f19458j;

    static class a extends Td.b<u> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new u(dVar);
        }
    }

    public static final class b extends h.b<u, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19459b;

        /* renamed from: c, reason: collision with root package name */
        private int f19460c;

        /* renamed from: d, reason: collision with root package name */
        private int f19461d;

        /* renamed from: f, reason: collision with root package name */
        private int f19463f;

        /* renamed from: g, reason: collision with root package name */
        private int f19464g;

        /* renamed from: e, reason: collision with root package name */
        private c f19462e = c.ERROR;

        /* renamed from: h, reason: collision with root package name */
        private d f19465h = d.LANGUAGE_VERSION;

        private b() {
        }

        static b g() {
            return new b();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            j(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            u h11 = h();
            if (h11.isInitialized()) {
                return h11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final b clone() {
            b bVar = new b();
            bVar.i(h());
            return bVar;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.i(h());
            return bVar;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ b e(u uVar) {
            i(uVar);
            return this;
        }

        public final u h() {
            u uVar = new u(this);
            int i11 = this.f19459b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            uVar.f19451c = this.f19460c;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            uVar.f19452d = this.f19461d;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            uVar.f19453e = this.f19462e;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            uVar.f19454f = this.f19463f;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            uVar.f19455g = this.f19464g;
            if ((i11 & 32) == 32) {
                i12 |= 32;
            }
            uVar.f19456h = this.f19465h;
            uVar.f19450b = i12;
            return uVar;
        }

        public final void i(u uVar) {
            if (uVar == u.n()) {
                return;
            }
            if (uVar.E()) {
                int v11 = uVar.v();
                this.f19459b |= 1;
                this.f19460c = v11;
            }
            if (uVar.F()) {
                int y11 = uVar.y();
                this.f19459b |= 2;
                this.f19461d = y11;
            }
            if (uVar.C()) {
                c s11 = uVar.s();
                s11.getClass();
                this.f19459b |= 4;
                this.f19462e = s11;
            }
            if (uVar.B()) {
                int p11 = uVar.p();
                this.f19459b |= 8;
                this.f19463f = p11;
            }
            if (uVar.D()) {
                int u11 = uVar.u();
                this.f19459b |= 16;
                this.f19464g = u11;
            }
            if (uVar.G()) {
                d A11 = uVar.A();
                A11.getClass();
                this.f19459b |= 32;
                this.f19465h = A11;
            }
            f(d().b(uVar.f19449a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            u uVar = null;
            try {
                try {
                    ((a) u.f19448l).getClass();
                    i(new u(dVar));
                } catch (Td.j e11) {
                    u uVar2 = (u) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar = uVar2;
                        if (uVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (uVar != null) {
                    i(uVar);
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
        WARNING(0),
        ERROR(1),
        HIDDEN(2);

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

    public enum d implements i.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);

        private static i.b<d> internalValueMap = new a();
        private final int value;

        static class a implements i.b<d> {
        }

        d(int i11) {
            this.value = i11;
        }

        @Override // Td.i.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        u uVar = new u();
        f19447k = uVar;
        uVar.f19451c = 0;
        uVar.f19452d = 0;
        uVar.f19453e = c.ERROR;
        uVar.f19454f = 0;
        uVar.f19455g = 0;
        uVar.f19456h = d.LANGUAGE_VERSION;
    }

    u(b bVar) {
        this.f19457i = (byte) -1;
        this.f19458j = -1;
        this.f19449a = bVar.d();
    }

    public static u n() {
        return f19447k;
    }

    public final d A() {
        return this.f19456h;
    }

    public final boolean B() {
        return (this.f19450b & 8) == 8;
    }

    public final boolean C() {
        return (this.f19450b & 4) == 4;
    }

    public final boolean D() {
        return (this.f19450b & 16) == 16;
    }

    public final boolean E() {
        return (this.f19450b & 1) == 1;
    }

    public final boolean F() {
        return (this.f19450b & 2) == 2;
    }

    public final boolean G() {
        return (this.f19450b & 32) == 32;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        if ((this.f19450b & 1) == 1) {
            eVar.m(1, this.f19451c);
        }
        if ((this.f19450b & 2) == 2) {
            eVar.m(2, this.f19452d);
        }
        if ((this.f19450b & 4) == 4) {
            eVar.l(3, this.f19453e.getNumber());
        }
        if ((this.f19450b & 8) == 8) {
            eVar.m(4, this.f19454f);
        }
        if ((this.f19450b & 16) == 16) {
            eVar.m(5, this.f19455g);
        }
        if ((this.f19450b & 32) == 32) {
            eVar.l(6, this.f19456h.getNumber());
        }
        eVar.r(this.f19449a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19458j;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19450b & 1) == 1 ? Td.e.b(1, this.f19451c) : 0;
        if ((this.f19450b & 2) == 2) {
            b11 += Td.e.b(2, this.f19452d);
        }
        if ((this.f19450b & 4) == 4) {
            b11 += Td.e.a(3, this.f19453e.getNumber());
        }
        if ((this.f19450b & 8) == 8) {
            b11 += Td.e.b(4, this.f19454f);
        }
        if ((this.f19450b & 16) == 16) {
            b11 += Td.e.b(5, this.f19455g);
        }
        if ((this.f19450b & 32) == 32) {
            b11 += Td.e.a(6, this.f19456h.getNumber());
        }
        int size = this.f19449a.size() + b11;
        this.f19458j = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19457i;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.f19457i = (byte) 1;
        return true;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.g();
    }

    public final int p() {
        return this.f19454f;
    }

    public final c s() {
        return this.f19453e;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b g10 = b.g();
        g10.i(this);
        return g10;
    }

    public final int u() {
        return this.f19455g;
    }

    public final int v() {
        return this.f19451c;
    }

    public final int y() {
        return this.f19452d;
    }

    private u() {
        this.f19457i = (byte) -1;
        this.f19458j = -1;
        this.f19449a = Td.c.f27045a;
    }

    u(Td.d dVar) throws Td.j {
        this.f19457i = (byte) -1;
        this.f19458j = -1;
        boolean z11 = false;
        this.f19451c = 0;
        this.f19452d = 0;
        this.f19453e = c.ERROR;
        this.f19454f = 0;
        this.f19455g = 0;
        this.f19456h = d.LANGUAGE_VERSION;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        while (!z11) {
            try {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 8) {
                                this.f19450b |= 1;
                                this.f19451c = dVar.n();
                            } else if (r11 != 16) {
                                d dVar2 = null;
                                c cVar = null;
                                if (r11 == 24) {
                                    int n11 = dVar.n();
                                    if (n11 == 0) {
                                        cVar = c.WARNING;
                                    } else if (n11 == 1) {
                                        cVar = c.ERROR;
                                    } else if (n11 == 2) {
                                        cVar = c.HIDDEN;
                                    }
                                    if (cVar == null) {
                                        j11.v(r11);
                                        j11.v(n11);
                                    } else {
                                        this.f19450b |= 4;
                                        this.f19453e = cVar;
                                    }
                                } else if (r11 == 32) {
                                    this.f19450b |= 8;
                                    this.f19454f = dVar.n();
                                } else if (r11 == 40) {
                                    this.f19450b |= 16;
                                    this.f19455g = dVar.n();
                                } else if (r11 != 48) {
                                    if (!dVar.u(r11, j11)) {
                                    }
                                } else {
                                    int n12 = dVar.n();
                                    if (n12 == 0) {
                                        dVar2 = d.LANGUAGE_VERSION;
                                    } else if (n12 == 1) {
                                        dVar2 = d.COMPILER_VERSION;
                                    } else if (n12 == 2) {
                                        dVar2 = d.API_VERSION;
                                    }
                                    if (dVar2 == null) {
                                        j11.v(r11);
                                        j11.v(n12);
                                    } else {
                                        this.f19450b |= 32;
                                        this.f19456h = dVar2;
                                    }
                                }
                            } else {
                                this.f19450b |= 2;
                                this.f19452d = dVar.n();
                            }
                        }
                        z11 = true;
                    } catch (Td.j e11) {
                        e11.b(this);
                        throw e11;
                    }
                } catch (IOException e12) {
                    Td.j jVar = new Td.j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            } catch (Throwable th2) {
                try {
                    j11.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    throw th3;
                }
                throw th2;
            }
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19449a = m11.j();
        }
    }
}
