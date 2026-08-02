package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.i;
import Td.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends h.d<r> {

    /* renamed from: m, reason: collision with root package name */
    private static final r f19397m;

    /* renamed from: n, reason: collision with root package name */
    public static Td.r<r> f19398n = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19399b;

    /* renamed from: c, reason: collision with root package name */
    private int f19400c;

    /* renamed from: d, reason: collision with root package name */
    private int f19401d;

    /* renamed from: e, reason: collision with root package name */
    private int f19402e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19403f;

    /* renamed from: g, reason: collision with root package name */
    private c f19404g;

    /* renamed from: h, reason: collision with root package name */
    private List<p> f19405h;

    /* renamed from: i, reason: collision with root package name */
    private List<Integer> f19406i;

    /* renamed from: j, reason: collision with root package name */
    private int f19407j;

    /* renamed from: k, reason: collision with root package name */
    private byte f19408k;

    /* renamed from: l, reason: collision with root package name */
    private int f19409l;

    static class a extends Td.b<r> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new r(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<r, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19410d;

        /* renamed from: e, reason: collision with root package name */
        private int f19411e;

        /* renamed from: f, reason: collision with root package name */
        private int f19412f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f19413g;

        /* renamed from: h, reason: collision with root package name */
        private c f19414h = c.INV;

        /* renamed from: i, reason: collision with root package name */
        private List<p> f19415i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f19416j;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19415i = list;
            this.f19416j = list;
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
            r j11 = j();
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
            k((r) hVar);
            return this;
        }

        public final r j() {
            r rVar = new r(this);
            int i11 = this.f19410d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            rVar.f19401d = this.f19411e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            rVar.f19402e = this.f19412f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            rVar.f19403f = this.f19413g;
            if ((i11 & 8) == 8) {
                i12 |= 8;
            }
            rVar.f19404g = this.f19414h;
            if ((this.f19410d & 16) == 16) {
                this.f19415i = Collections.unmodifiableList(this.f19415i);
                this.f19410d &= -17;
            }
            rVar.f19405h = this.f19415i;
            if ((this.f19410d & 32) == 32) {
                this.f19416j = Collections.unmodifiableList(this.f19416j);
                this.f19410d &= -33;
            }
            rVar.f19406i = this.f19416j;
            rVar.f19400c = i12;
            return rVar;
        }

        public final void k(r rVar) {
            if (rVar == r.H()) {
                return;
            }
            if (rVar.O()) {
                int I11 = rVar.I();
                this.f19410d |= 1;
                this.f19411e = I11;
            }
            if (rVar.P()) {
                int J11 = rVar.J();
                this.f19410d |= 2;
                this.f19412f = J11;
            }
            if (rVar.Q()) {
                boolean K11 = rVar.K();
                this.f19410d |= 4;
                this.f19413g = K11;
            }
            if (rVar.R()) {
                c N11 = rVar.N();
                N11.getClass();
                this.f19410d |= 8;
                this.f19414h = N11;
            }
            if (!rVar.f19405h.isEmpty()) {
                if (this.f19415i.isEmpty()) {
                    this.f19415i = rVar.f19405h;
                    this.f19410d &= -17;
                } else {
                    if ((this.f19410d & 16) != 16) {
                        this.f19415i = new ArrayList(this.f19415i);
                        this.f19410d |= 16;
                    }
                    this.f19415i.addAll(rVar.f19405h);
                }
            }
            if (!rVar.f19406i.isEmpty()) {
                if (this.f19416j.isEmpty()) {
                    this.f19416j = rVar.f19406i;
                    this.f19410d &= -33;
                } else {
                    if ((this.f19410d & 32) != 32) {
                        this.f19416j = new ArrayList(this.f19416j);
                        this.f19410d |= 32;
                    }
                    this.f19416j.addAll(rVar.f19406i);
                }
            }
            h(rVar);
            f(d().b(rVar.f19399b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            r rVar = null;
            try {
                try {
                    ((a) r.f19398n).getClass();
                    k(new r(dVar, fVar));
                } catch (Td.j e11) {
                    r rVar2 = (r) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVar2;
                        if (rVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (rVar != null) {
                    k(rVar);
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
        IN(0),
        OUT(1),
        INV(2);

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
        r rVar = new r(0);
        f19397m = rVar;
        rVar.f19401d = 0;
        rVar.f19402e = 0;
        rVar.f19403f = false;
        rVar.f19404g = c.INV;
        List list = Collections.EMPTY_LIST;
        rVar.f19405h = list;
        rVar.f19406i = list;
    }

    private r() {
        throw null;
    }

    r(b bVar) {
        super(bVar);
        this.f19407j = -1;
        this.f19408k = (byte) -1;
        this.f19409l = -1;
        this.f19399b = bVar.d();
    }

    public static r H() {
        return f19397m;
    }

    public final int I() {
        return this.f19401d;
    }

    public final int J() {
        return this.f19402e;
    }

    public final boolean K() {
        return this.f19403f;
    }

    public final List<Integer> L() {
        return this.f19406i;
    }

    public final List<p> M() {
        return this.f19405h;
    }

    public final c N() {
        return this.f19404g;
    }

    public final boolean O() {
        return (this.f19400c & 1) == 1;
    }

    public final boolean P() {
        return (this.f19400c & 2) == 2;
    }

    public final boolean Q() {
        return (this.f19400c & 4) == 4;
    }

    public final boolean R() {
        return (this.f19400c & 8) == 8;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19400c & 1) == 1) {
            eVar.m(1, this.f19401d);
        }
        if ((this.f19400c & 2) == 2) {
            eVar.m(2, this.f19402e);
        }
        if ((this.f19400c & 4) == 4) {
            boolean z11 = this.f19403f;
            eVar.x(3, 0);
            eVar.q(z11 ? 1 : 0);
        }
        if ((this.f19400c & 8) == 8) {
            eVar.l(4, this.f19404g.getNumber());
        }
        for (int i11 = 0; i11 < this.f19405h.size(); i11++) {
            eVar.o(5, this.f19405h.get(i11));
        }
        if (this.f19406i.size() > 0) {
            eVar.v(50);
            eVar.v(this.f19407j);
        }
        for (int i12 = 0; i12 < this.f19406i.size(); i12++) {
            eVar.n(this.f19406i.get(i12).intValue());
        }
        n11.a(1000, eVar);
        eVar.r(this.f19399b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19397m;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19409l;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19400c & 1) == 1 ? Td.e.b(1, this.f19401d) : 0;
        if ((this.f19400c & 2) == 2) {
            b11 += Td.e.b(2, this.f19402e);
        }
        if ((this.f19400c & 4) == 4) {
            b11 += Td.e.h(3) + 1;
        }
        if ((this.f19400c & 8) == 8) {
            b11 += Td.e.a(4, this.f19404g.getNumber());
        }
        for (int i12 = 0; i12 < this.f19405h.size(); i12++) {
            b11 += Td.e.d(5, this.f19405h.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f19406i.size(); i14++) {
            i13 += Td.e.c(this.f19406i.get(i14).intValue());
        }
        int i15 = b11 + i13;
        if (!this.f19406i.isEmpty()) {
            i15 = i15 + 1 + Td.e.c(i13);
        }
        this.f19407j = i13;
        int size = this.f19399b.size() + i15 + g();
        this.f19409l = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19408k;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!O()) {
            this.f19408k = (byte) 0;
            return false;
        }
        if (!P()) {
            this.f19408k = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19405h.size(); i11++) {
            if (!this.f19405h.get(i11).isInitialized()) {
                this.f19408k = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f19408k = (byte) 1;
            return true;
        }
        this.f19408k = (byte) 0;
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

    private r(int i11) {
        this.f19407j = -1;
        this.f19408k = (byte) -1;
        this.f19409l = -1;
        this.f19399b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    r(Td.d dVar, Td.f fVar) throws Td.j {
        c cVar;
        this.f19407j = -1;
        this.f19408k = (byte) -1;
        this.f19409l = -1;
        this.f19401d = 0;
        this.f19402e = 0;
        this.f19403f = false;
        this.f19404g = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f19405h = list;
        this.f19406i = list;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 8) {
                            this.f19400c |= 1;
                            this.f19401d = dVar.n();
                        } else if (r11 == 16) {
                            this.f19400c |= 2;
                            this.f19402e = dVar.n();
                        } else if (r11 == 24) {
                            this.f19400c |= 4;
                            this.f19403f = dVar.o() != 0;
                        } else if (r11 == 32) {
                            int n11 = dVar.n();
                            if (n11 == 0) {
                                cVar = c.IN;
                            } else if (n11 != 1) {
                                cVar = n11 != 2 ? null : c.INV;
                            } else {
                                cVar = c.OUT;
                            }
                            if (cVar == null) {
                                j11.v(r11);
                                j11.v(n11);
                            } else {
                                this.f19400c |= 8;
                                this.f19404g = cVar;
                            }
                        } else if (r11 == 42) {
                            if ((i11 & 16) != 16) {
                                this.f19405h = new ArrayList();
                                i11 |= 16;
                            }
                            this.f19405h.add(dVar.i(p.f19325u, fVar));
                        } else if (r11 == 48) {
                            if ((i11 & 32) != 32) {
                                this.f19406i = new ArrayList();
                                i11 |= 32;
                            }
                            this.f19406i.add(Integer.valueOf(dVar.n()));
                        } else if (r11 != 50) {
                            if (!p(dVar, j11, fVar, r11)) {
                            }
                        } else {
                            int e11 = dVar.e(dVar.n());
                            if ((i11 & 32) != 32 && dVar.b() > 0) {
                                this.f19406i = new ArrayList();
                                i11 |= 32;
                            }
                            while (dVar.b() > 0) {
                                this.f19406i.add(Integer.valueOf(dVar.n()));
                            }
                            dVar.d(e11);
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if ((i11 & 16) == 16) {
                        this.f19405h = Collections.unmodifiableList(this.f19405h);
                    }
                    if ((i11 & 32) == 32) {
                        this.f19406i = Collections.unmodifiableList(this.f19406i);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19399b = m11.j();
                        throw th3;
                    }
                    this.f19399b = m11.j();
                    m();
                    throw th2;
                }
            } catch (Td.j e12) {
                e12.b(this);
                throw e12;
            } catch (IOException e13) {
                Td.j jVar = new Td.j(e13.getMessage());
                jVar.b(this);
                throw jVar;
            }
        }
        if ((i11 & 16) == 16) {
            this.f19405h = Collections.unmodifiableList(this.f19405h);
        }
        if ((i11 & 32) == 32) {
            this.f19406i = Collections.unmodifiableList(this.f19406i);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19399b = m11.j();
            throw th4;
        }
        this.f19399b = m11.j();
        m();
    }
}
