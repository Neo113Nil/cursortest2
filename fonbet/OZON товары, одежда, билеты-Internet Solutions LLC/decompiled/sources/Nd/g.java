package Nd;

import Nd.p;
import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.i;
import Td.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class g extends Td.h implements Td.q {

    /* renamed from: l, reason: collision with root package name */
    private static final g f19170l;

    /* renamed from: m, reason: collision with root package name */
    public static Td.r<g> f19171m = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19172a;

    /* renamed from: b, reason: collision with root package name */
    private int f19173b;

    /* renamed from: c, reason: collision with root package name */
    private int f19174c;

    /* renamed from: d, reason: collision with root package name */
    private int f19175d;

    /* renamed from: e, reason: collision with root package name */
    private c f19176e;

    /* renamed from: f, reason: collision with root package name */
    private p f19177f;

    /* renamed from: g, reason: collision with root package name */
    private int f19178g;

    /* renamed from: h, reason: collision with root package name */
    private List<g> f19179h;

    /* renamed from: i, reason: collision with root package name */
    private List<g> f19180i;

    /* renamed from: j, reason: collision with root package name */
    private byte f19181j;

    /* renamed from: k, reason: collision with root package name */
    private int f19182k;

    static class a extends Td.b<g> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new g(dVar, fVar);
        }
    }

    public static final class b extends h.b<g, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19183b;

        /* renamed from: c, reason: collision with root package name */
        private int f19184c;

        /* renamed from: d, reason: collision with root package name */
        private int f19185d;

        /* renamed from: e, reason: collision with root package name */
        private c f19186e = c.TRUE;

        /* renamed from: f, reason: collision with root package name */
        private p f19187f = p.T();

        /* renamed from: g, reason: collision with root package name */
        private int f19188g;

        /* renamed from: h, reason: collision with root package name */
        private List<g> f19189h;

        /* renamed from: i, reason: collision with root package name */
        private List<g> f19190i;

        private b() {
            List<g> list = Collections.EMPTY_LIST;
            this.f19189h = list;
            this.f19190i = list;
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
            g h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(g gVar) {
            i(gVar);
            return this;
        }

        public final g h() {
            g gVar = new g(this);
            int i11 = this.f19183b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            gVar.f19174c = this.f19184c;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            gVar.f19175d = this.f19185d;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            gVar.f19176e = this.f19186e;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            gVar.f19177f = this.f19187f;
            if ((i11 & 16) == 16) {
                i12 |= 16;
            }
            gVar.f19178g = this.f19188g;
            if ((this.f19183b & 32) == 32) {
                this.f19189h = Collections.unmodifiableList(this.f19189h);
                this.f19183b &= -33;
            }
            gVar.f19179h = this.f19189h;
            if ((this.f19183b & 64) == 64) {
                this.f19190i = Collections.unmodifiableList(this.f19190i);
                this.f19183b &= -65;
            }
            gVar.f19180i = this.f19190i;
            gVar.f19173b = i12;
            return gVar;
        }

        public final void i(g gVar) {
            if (gVar == g.v()) {
                return;
            }
            if (gVar.E()) {
                int y11 = gVar.y();
                this.f19183b |= 1;
                this.f19184c = y11;
            }
            if (gVar.H()) {
                int C11 = gVar.C();
                this.f19183b |= 2;
                this.f19185d = C11;
            }
            if (gVar.D()) {
                c u11 = gVar.u();
                u11.getClass();
                this.f19183b |= 4;
                this.f19186e = u11;
            }
            if (gVar.F()) {
                p A11 = gVar.A();
                if ((this.f19183b & 8) != 8 || this.f19187f == p.T()) {
                    this.f19187f = A11;
                } else {
                    p.c s02 = p.s0(this.f19187f);
                    s02.k(A11);
                    this.f19187f = s02.j();
                }
                this.f19183b |= 8;
            }
            if (gVar.G()) {
                int B11 = gVar.B();
                this.f19183b |= 16;
                this.f19188g = B11;
            }
            if (!gVar.f19179h.isEmpty()) {
                if (this.f19189h.isEmpty()) {
                    this.f19189h = gVar.f19179h;
                    this.f19183b &= -33;
                } else {
                    if ((this.f19183b & 32) != 32) {
                        this.f19189h = new ArrayList(this.f19189h);
                        this.f19183b |= 32;
                    }
                    this.f19189h.addAll(gVar.f19179h);
                }
            }
            if (!gVar.f19180i.isEmpty()) {
                if (this.f19190i.isEmpty()) {
                    this.f19190i = gVar.f19180i;
                    this.f19183b &= -65;
                } else {
                    if ((this.f19183b & 64) != 64) {
                        this.f19190i = new ArrayList(this.f19190i);
                        this.f19183b |= 64;
                    }
                    this.f19190i.addAll(gVar.f19180i);
                }
            }
            f(d().b(gVar.f19172a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            g gVar = null;
            try {
                try {
                    ((a) g.f19171m).getClass();
                    i(new g(dVar, fVar));
                } catch (Td.j e11) {
                    g gVar2 = (g) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        if (gVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (gVar != null) {
                    i(gVar);
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
        TRUE(0),
        FALSE(1),
        NULL(2);

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
        g gVar = new g();
        f19170l = gVar;
        gVar.f19174c = 0;
        gVar.f19175d = 0;
        gVar.f19176e = c.TRUE;
        gVar.f19177f = p.T();
        gVar.f19178g = 0;
        List<g> list = Collections.EMPTY_LIST;
        gVar.f19179h = list;
        gVar.f19180i = list;
    }

    g(b bVar) {
        this.f19181j = (byte) -1;
        this.f19182k = -1;
        this.f19172a = bVar.d();
    }

    public static g v() {
        return f19170l;
    }

    public final p A() {
        return this.f19177f;
    }

    public final int B() {
        return this.f19178g;
    }

    public final int C() {
        return this.f19175d;
    }

    public final boolean D() {
        return (this.f19173b & 4) == 4;
    }

    public final boolean E() {
        return (this.f19173b & 1) == 1;
    }

    public final boolean F() {
        return (this.f19173b & 8) == 8;
    }

    public final boolean G() {
        return (this.f19173b & 16) == 16;
    }

    public final boolean H() {
        return (this.f19173b & 2) == 2;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        if ((this.f19173b & 1) == 1) {
            eVar.m(1, this.f19174c);
        }
        if ((this.f19173b & 2) == 2) {
            eVar.m(2, this.f19175d);
        }
        if ((this.f19173b & 4) == 4) {
            eVar.l(3, this.f19176e.getNumber());
        }
        if ((this.f19173b & 8) == 8) {
            eVar.o(4, this.f19177f);
        }
        if ((this.f19173b & 16) == 16) {
            eVar.m(5, this.f19178g);
        }
        for (int i11 = 0; i11 < this.f19179h.size(); i11++) {
            eVar.o(6, this.f19179h.get(i11));
        }
        for (int i12 = 0; i12 < this.f19180i.size(); i12++) {
            eVar.o(7, this.f19180i.get(i12));
        }
        eVar.r(this.f19172a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19182k;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19173b & 1) == 1 ? Td.e.b(1, this.f19174c) : 0;
        if ((this.f19173b & 2) == 2) {
            b11 += Td.e.b(2, this.f19175d);
        }
        if ((this.f19173b & 4) == 4) {
            b11 += Td.e.a(3, this.f19176e.getNumber());
        }
        if ((this.f19173b & 8) == 8) {
            b11 += Td.e.d(4, this.f19177f);
        }
        if ((this.f19173b & 16) == 16) {
            b11 += Td.e.b(5, this.f19178g);
        }
        for (int i12 = 0; i12 < this.f19179h.size(); i12++) {
            b11 += Td.e.d(6, this.f19179h.get(i12));
        }
        for (int i13 = 0; i13 < this.f19180i.size(); i13++) {
            b11 += Td.e.d(7, this.f19180i.get(i13));
        }
        int size = this.f19172a.size() + b11;
        this.f19182k = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19181j;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (F() && !this.f19177f.isInitialized()) {
            this.f19181j = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19179h.size(); i11++) {
            if (!this.f19179h.get(i11).isInitialized()) {
                this.f19181j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f19180i.size(); i12++) {
            if (!this.f19180i.get(i12).isInitialized()) {
                this.f19181j = (byte) 0;
                return false;
            }
        }
        this.f19181j = (byte) 1;
        return true;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.g();
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b g10 = b.g();
        g10.i(this);
        return g10;
    }

    public final c u() {
        return this.f19176e;
    }

    public final int y() {
        return this.f19174c;
    }

    private g() {
        this.f19181j = (byte) -1;
        this.f19182k = -1;
        this.f19172a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    g(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19181j = (byte) -1;
        this.f19182k = -1;
        boolean z11 = false;
        this.f19174c = 0;
        this.f19175d = 0;
        this.f19176e = c.TRUE;
        this.f19177f = p.T();
        this.f19178g = 0;
        List<g> list = Collections.EMPTY_LIST;
        this.f19179h = list;
        this.f19180i = list;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        char c11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 8) {
                            this.f19173b |= 1;
                            this.f19174c = dVar.n();
                        } else if (r11 != 16) {
                            p.c cVar = null;
                            c cVar2 = null;
                            if (r11 == 24) {
                                int n11 = dVar.n();
                                if (n11 == 0) {
                                    cVar2 = c.TRUE;
                                } else if (n11 == 1) {
                                    cVar2 = c.FALSE;
                                } else if (n11 == 2) {
                                    cVar2 = c.NULL;
                                }
                                if (cVar2 == null) {
                                    j11.v(r11);
                                    j11.v(n11);
                                } else {
                                    this.f19173b |= 4;
                                    this.f19176e = cVar2;
                                }
                            } else if (r11 == 34) {
                                if ((this.f19173b & 8) == 8) {
                                    p pVar = this.f19177f;
                                    pVar.getClass();
                                    cVar = p.s0(pVar);
                                }
                                p pVar2 = (p) dVar.i(p.f19325u, fVar);
                                this.f19177f = pVar2;
                                if (cVar != null) {
                                    cVar.k(pVar2);
                                    this.f19177f = cVar.j();
                                }
                                this.f19173b |= 8;
                            } else if (r11 != 40) {
                                Td.r<g> rVar = f19171m;
                                if (r11 == 50) {
                                    int i11 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i11 != 32) {
                                        this.f19179h = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                    this.f19179h.add(dVar.i(rVar, fVar));
                                } else if (r11 != 58) {
                                    if (!dVar.u(r11, j11)) {
                                    }
                                } else {
                                    int i12 = (c11 == true ? 1 : 0) & 64;
                                    c11 = c11;
                                    if (i12 != 64) {
                                        this.f19180i = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | '@';
                                    }
                                    this.f19180i.add(dVar.i(rVar, fVar));
                                }
                            } else {
                                this.f19173b |= 16;
                                this.f19178g = dVar.n();
                            }
                        } else {
                            this.f19173b |= 2;
                            this.f19175d = dVar.n();
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.f19179h = Collections.unmodifiableList(this.f19179h);
                    }
                    if (((c11 == true ? 1 : 0) & 64) == 64) {
                        this.f19180i = Collections.unmodifiableList(this.f19180i);
                    }
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
        if (((c11 == true ? 1 : 0) & 32) == 32) {
            this.f19179h = Collections.unmodifiableList(this.f19179h);
        }
        if (((c11 == true ? 1 : 0) & 64) == 64) {
            this.f19180i = Collections.unmodifiableList(this.f19180i);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19172a = m11.j();
        }
    }
}
