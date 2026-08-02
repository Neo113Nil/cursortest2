package Nd;

import Nd.k;
import Nd.n;
import Nd.o;
import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import androidx.recyclerview.widget.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends h.d<l> {

    /* renamed from: j, reason: collision with root package name */
    private static final l f19244j;

    /* renamed from: k, reason: collision with root package name */
    public static Td.r<l> f19245k = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19246b;

    /* renamed from: c, reason: collision with root package name */
    private int f19247c;

    /* renamed from: d, reason: collision with root package name */
    private o f19248d;

    /* renamed from: e, reason: collision with root package name */
    private n f19249e;

    /* renamed from: f, reason: collision with root package name */
    private k f19250f;

    /* renamed from: g, reason: collision with root package name */
    private List<Nd.b> f19251g;

    /* renamed from: h, reason: collision with root package name */
    private byte f19252h;

    /* renamed from: i, reason: collision with root package name */
    private int f19253i;

    static class a extends Td.b<l> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new l(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<l, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19254d;

        /* renamed from: e, reason: collision with root package name */
        private o f19255e = o.h();

        /* renamed from: f, reason: collision with root package name */
        private n f19256f = n.h();

        /* renamed from: g, reason: collision with root package name */
        private k f19257g = k.H();

        /* renamed from: h, reason: collision with root package name */
        private List<Nd.b> f19258h = Collections.EMPTY_LIST;

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
            l j11 = j();
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
            k((l) hVar);
            return this;
        }

        public final l j() {
            l lVar = new l(this);
            int i11 = this.f19254d;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            lVar.f19248d = this.f19255e;
            if ((i11 & 2) == 2) {
                i12 |= 2;
            }
            lVar.f19249e = this.f19256f;
            if ((i11 & 4) == 4) {
                i12 |= 4;
            }
            lVar.f19250f = this.f19257g;
            if ((this.f19254d & 8) == 8) {
                this.f19258h = Collections.unmodifiableList(this.f19258h);
                this.f19254d &= -9;
            }
            lVar.f19251g = this.f19258h;
            lVar.f19247c = i12;
            return lVar;
        }

        public final void k(l lVar) {
            if (lVar == l.F()) {
                return;
            }
            if (lVar.L()) {
                o I11 = lVar.I();
                if ((this.f19254d & 1) != 1 || this.f19255e == o.h()) {
                    this.f19255e = I11;
                } else {
                    o oVar = this.f19255e;
                    o.b g10 = o.b.g();
                    g10.i(oVar);
                    g10.i(I11);
                    this.f19255e = g10.h();
                }
                this.f19254d |= 1;
            }
            if (lVar.K()) {
                n H11 = lVar.H();
                if ((this.f19254d & 2) != 2 || this.f19256f == n.h()) {
                    this.f19256f = H11;
                } else {
                    n nVar = this.f19256f;
                    n.b g11 = n.b.g();
                    g11.i(nVar);
                    g11.i(H11);
                    this.f19256f = g11.h();
                }
                this.f19254d |= 2;
            }
            if (lVar.J()) {
                k G11 = lVar.G();
                if ((this.f19254d & 4) != 4 || this.f19257g == k.H()) {
                    this.f19257g = G11;
                } else {
                    k kVar = this.f19257g;
                    k.b i11 = k.b.i();
                    i11.k(kVar);
                    i11.k(G11);
                    this.f19257g = i11.j();
                }
                this.f19254d |= 4;
            }
            if (!lVar.f19251g.isEmpty()) {
                if (this.f19258h.isEmpty()) {
                    this.f19258h = lVar.f19251g;
                    this.f19254d &= -9;
                } else {
                    if ((this.f19254d & 8) != 8) {
                        this.f19258h = new ArrayList(this.f19258h);
                        this.f19254d |= 8;
                    }
                    this.f19258h.addAll(lVar.f19251g);
                }
            }
            h(lVar);
            f(d().b(lVar.f19246b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            l lVar = null;
            try {
                try {
                    ((a) l.f19245k).getClass();
                    k(new l(dVar, fVar));
                } catch (Td.j e11) {
                    l lVar2 = (l) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        lVar = lVar2;
                        if (lVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (lVar != null) {
                    k(lVar);
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
        l lVar = new l(0);
        f19244j = lVar;
        lVar.f19248d = o.h();
        lVar.f19249e = n.h();
        lVar.f19250f = k.H();
        lVar.f19251g = Collections.EMPTY_LIST;
    }

    private l() {
        throw null;
    }

    l(b bVar) {
        super(bVar);
        this.f19252h = (byte) -1;
        this.f19253i = -1;
        this.f19246b = bVar.d();
    }

    public static l F() {
        return f19244j;
    }

    public final List<Nd.b> E() {
        return this.f19251g;
    }

    public final k G() {
        return this.f19250f;
    }

    public final n H() {
        return this.f19249e;
    }

    public final o I() {
        return this.f19248d;
    }

    public final boolean J() {
        return (this.f19247c & 4) == 4;
    }

    public final boolean K() {
        return (this.f19247c & 2) == 2;
    }

    public final boolean L() {
        return (this.f19247c & 1) == 1;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19247c & 1) == 1) {
            eVar.o(1, this.f19248d);
        }
        if ((this.f19247c & 2) == 2) {
            eVar.o(2, this.f19249e);
        }
        if ((this.f19247c & 4) == 4) {
            eVar.o(3, this.f19250f);
        }
        for (int i11 = 0; i11 < this.f19251g.size(); i11++) {
            eVar.o(4, this.f19251g.get(i11));
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19246b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19244j;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19253i;
        if (i11 != -1) {
            return i11;
        }
        int d11 = (this.f19247c & 1) == 1 ? Td.e.d(1, this.f19248d) : 0;
        if ((this.f19247c & 2) == 2) {
            d11 += Td.e.d(2, this.f19249e);
        }
        if ((this.f19247c & 4) == 4) {
            d11 += Td.e.d(3, this.f19250f);
        }
        for (int i12 = 0; i12 < this.f19251g.size(); i12++) {
            d11 += Td.e.d(4, this.f19251g.get(i12));
        }
        int size = this.f19246b.size() + d11 + g();
        this.f19253i = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19252h;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (K() && !this.f19249e.isInitialized()) {
            this.f19252h = (byte) 0;
            return false;
        }
        if (J() && !this.f19250f.isInitialized()) {
            this.f19252h = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19251g.size(); i11++) {
            if (!this.f19251g.get(i11).isInitialized()) {
                this.f19252h = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f19252h = (byte) 1;
            return true;
        }
        this.f19252h = (byte) 0;
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

    private l(int i11) {
        this.f19252h = (byte) -1;
        this.f19253i = -1;
        this.f19246b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    l(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19252h = (byte) -1;
        this.f19253i = -1;
        this.f19248d = o.h();
        this.f19249e = n.h();
        this.f19250f = k.H();
        this.f19251g = Collections.EMPTY_LIST;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        char c11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        k.b bVar = null;
                        o.b bVar2 = null;
                        n.b bVar3 = null;
                        if (r11 == 10) {
                            if ((this.f19247c & 1) == 1) {
                                o oVar = this.f19248d;
                                oVar.getClass();
                                bVar2 = o.b.g();
                                bVar2.i(oVar);
                            }
                            o oVar2 = (o) dVar.i(o.f19317f, fVar);
                            this.f19248d = oVar2;
                            if (bVar2 != null) {
                                bVar2.i(oVar2);
                                this.f19248d = bVar2.h();
                            }
                            this.f19247c |= 1;
                        } else if (r11 == 18) {
                            if ((this.f19247c & 2) == 2) {
                                n nVar = this.f19249e;
                                nVar.getClass();
                                bVar3 = n.b.g();
                                bVar3.i(nVar);
                            }
                            n nVar2 = (n) dVar.i(n.f19296f, fVar);
                            this.f19249e = nVar2;
                            if (bVar3 != null) {
                                bVar3.i(nVar2);
                                this.f19249e = bVar3.h();
                            }
                            this.f19247c |= 2;
                        } else if (r11 == 26) {
                            if ((this.f19247c & 4) == 4) {
                                k kVar = this.f19250f;
                                kVar.getClass();
                                bVar = k.b.i();
                                bVar.k(kVar);
                            }
                            k kVar2 = (k) dVar.i(k.f19228l, fVar);
                            this.f19250f = kVar2;
                            if (bVar != null) {
                                bVar.k(kVar2);
                                this.f19250f = bVar.j();
                            }
                            this.f19247c |= 4;
                        } else if (r11 != 34) {
                            if (!p(dVar, j11, fVar, r11)) {
                            }
                        } else {
                            int i11 = (c11 == true ? 1 : 0) & '\b';
                            c11 = c11;
                            if (i11 != 8) {
                                this.f19251g = new ArrayList();
                                c11 = '\b';
                            }
                            this.f19251g.add(dVar.i(Nd.b.f19065K, fVar));
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (((c11 == true ? 1 : 0) & '\b') == 8) {
                        this.f19251g = Collections.unmodifiableList(this.f19251g);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19246b = m11.j();
                        throw th3;
                    }
                    this.f19246b = m11.j();
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
        if (((c11 == true ? 1 : 0) & '\b') == 8) {
            this.f19251g = Collections.unmodifiableList(this.f19251g);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19246b = m11.j();
            throw th4;
        }
        this.f19246b = m11.j();
        m();
    }
}
