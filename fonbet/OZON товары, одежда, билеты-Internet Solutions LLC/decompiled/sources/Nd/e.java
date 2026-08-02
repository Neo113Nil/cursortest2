package Nd;

import Nd.g;
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
public final class e extends Td.h implements Td.q {

    /* renamed from: i, reason: collision with root package name */
    private static final e f19146i;

    /* renamed from: j, reason: collision with root package name */
    public static Td.r<e> f19147j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19148a;

    /* renamed from: b, reason: collision with root package name */
    private int f19149b;

    /* renamed from: c, reason: collision with root package name */
    private c f19150c;

    /* renamed from: d, reason: collision with root package name */
    private List<g> f19151d;

    /* renamed from: e, reason: collision with root package name */
    private g f19152e;

    /* renamed from: f, reason: collision with root package name */
    private d f19153f;

    /* renamed from: g, reason: collision with root package name */
    private byte f19154g;

    /* renamed from: h, reason: collision with root package name */
    private int f19155h;

    static class a extends Td.b<e> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new e(dVar, fVar);
        }
    }

    public static final class b extends h.b<e, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19156b;

        /* renamed from: c, reason: collision with root package name */
        private c f19157c = c.RETURNS_CONSTANT;

        /* renamed from: d, reason: collision with root package name */
        private List<g> f19158d = Collections.EMPTY_LIST;

        /* renamed from: e, reason: collision with root package name */
        private g f19159e = g.v();

        /* renamed from: f, reason: collision with root package name */
        private d f19160f = d.AT_MOST_ONCE;

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
            e h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(e eVar) {
            i(eVar);
            return this;
        }

        public final e h() {
            e eVar = new e(this);
            int i11 = this.f19156b;
            int i12 = (i11 & 1) != 1 ? 0 : 1;
            eVar.f19150c = this.f19157c;
            if ((this.f19156b & 2) == 2) {
                this.f19158d = Collections.unmodifiableList(this.f19158d);
                this.f19156b &= -3;
            }
            eVar.f19151d = this.f19158d;
            if ((i11 & 4) == 4) {
                i12 |= 2;
            }
            eVar.f19152e = this.f19159e;
            if ((i11 & 8) == 8) {
                i12 |= 4;
            }
            eVar.f19153f = this.f19160f;
            eVar.f19149b = i12;
            return eVar;
        }

        public final void i(e eVar) {
            if (eVar == e.n()) {
                return;
            }
            if (eVar.v()) {
                c p11 = eVar.p();
                p11.getClass();
                this.f19156b |= 1;
                this.f19157c = p11;
            }
            if (!eVar.f19151d.isEmpty()) {
                if (this.f19158d.isEmpty()) {
                    this.f19158d = eVar.f19151d;
                    this.f19156b &= -3;
                } else {
                    if ((this.f19156b & 2) != 2) {
                        this.f19158d = new ArrayList(this.f19158d);
                        this.f19156b |= 2;
                    }
                    this.f19158d.addAll(eVar.f19151d);
                }
            }
            if (eVar.u()) {
                g m11 = eVar.m();
                if ((this.f19156b & 4) != 4 || this.f19159e == g.v()) {
                    this.f19159e = m11;
                } else {
                    g gVar = this.f19159e;
                    g.b g10 = g.b.g();
                    g10.i(gVar);
                    g10.i(m11);
                    this.f19159e = g10.h();
                }
                this.f19156b |= 4;
            }
            if (eVar.y()) {
                d s11 = eVar.s();
                s11.getClass();
                this.f19156b |= 8;
                this.f19160f = s11;
            }
            f(d().b(eVar.f19148a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            e eVar = null;
            try {
                try {
                    ((a) e.f19147j).getClass();
                    i(new e(dVar, fVar));
                } catch (Td.j e11) {
                    e eVar2 = (e) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        if (eVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (eVar != null) {
                    i(eVar);
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
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);

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
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);

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
        e eVar = new e();
        f19146i = eVar;
        eVar.f19150c = c.RETURNS_CONSTANT;
        eVar.f19151d = Collections.EMPTY_LIST;
        eVar.f19152e = g.v();
        eVar.f19153f = d.AT_MOST_ONCE;
    }

    e(b bVar) {
        this.f19154g = (byte) -1;
        this.f19155h = -1;
        this.f19148a = bVar.d();
    }

    public static e n() {
        return f19146i;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        if ((this.f19149b & 1) == 1) {
            eVar.l(1, this.f19150c.getNumber());
        }
        for (int i11 = 0; i11 < this.f19151d.size(); i11++) {
            eVar.o(2, this.f19151d.get(i11));
        }
        if ((this.f19149b & 2) == 2) {
            eVar.o(3, this.f19152e);
        }
        if ((this.f19149b & 4) == 4) {
            eVar.l(4, this.f19153f.getNumber());
        }
        eVar.r(this.f19148a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19155h;
        if (i11 != -1) {
            return i11;
        }
        int a11 = (this.f19149b & 1) == 1 ? Td.e.a(1, this.f19150c.getNumber()) : 0;
        for (int i12 = 0; i12 < this.f19151d.size(); i12++) {
            a11 += Td.e.d(2, this.f19151d.get(i12));
        }
        if ((this.f19149b & 2) == 2) {
            a11 += Td.e.d(3, this.f19152e);
        }
        if ((this.f19149b & 4) == 4) {
            a11 += Td.e.a(4, this.f19153f.getNumber());
        }
        int size = this.f19148a.size() + a11;
        this.f19155h = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19154g;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19151d.size(); i11++) {
            if (!this.f19151d.get(i11).isInitialized()) {
                this.f19154g = (byte) 0;
                return false;
            }
        }
        if (!u() || this.f19152e.isInitialized()) {
            this.f19154g = (byte) 1;
            return true;
        }
        this.f19154g = (byte) 0;
        return false;
    }

    public final g m() {
        return this.f19152e;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.g();
    }

    public final c p() {
        return this.f19150c;
    }

    public final d s() {
        return this.f19153f;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        b g10 = b.g();
        g10.i(this);
        return g10;
    }

    public final boolean u() {
        return (this.f19149b & 2) == 2;
    }

    public final boolean v() {
        return (this.f19149b & 1) == 1;
    }

    public final boolean y() {
        return (this.f19149b & 4) == 4;
    }

    private e() {
        this.f19154g = (byte) -1;
        this.f19155h = -1;
        this.f19148a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19154g = (byte) -1;
        this.f19155h = -1;
        this.f19150c = c.RETURNS_CONSTANT;
        this.f19151d = Collections.EMPTY_LIST;
        this.f19152e = g.v();
        this.f19153f = d.AT_MOST_ONCE;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        char c11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        d dVar2 = null;
                        c cVar = null;
                        g.b bVar = null;
                        if (r11 == 8) {
                            int n11 = dVar.n();
                            if (n11 == 0) {
                                cVar = c.RETURNS_CONSTANT;
                            } else if (n11 == 1) {
                                cVar = c.CALLS;
                            } else if (n11 == 2) {
                                cVar = c.RETURNS_NOT_NULL;
                            }
                            if (cVar == null) {
                                j11.v(r11);
                                j11.v(n11);
                            } else {
                                this.f19149b |= 1;
                                this.f19150c = cVar;
                            }
                        } else if (r11 == 18) {
                            int i11 = (c11 == true ? 1 : 0) & 2;
                            c11 = c11;
                            if (i11 != 2) {
                                this.f19151d = new ArrayList();
                                c11 = 2;
                            }
                            this.f19151d.add(dVar.i(g.f19171m, fVar));
                        } else if (r11 == 26) {
                            if ((this.f19149b & 2) == 2) {
                                g gVar = this.f19152e;
                                gVar.getClass();
                                bVar = g.b.g();
                                bVar.i(gVar);
                            }
                            g gVar2 = (g) dVar.i(g.f19171m, fVar);
                            this.f19152e = gVar2;
                            if (bVar != null) {
                                bVar.i(gVar2);
                                this.f19152e = bVar.h();
                            }
                            this.f19149b |= 2;
                        } else if (r11 != 32) {
                            if (!dVar.u(r11, j11)) {
                            }
                        } else {
                            int n12 = dVar.n();
                            if (n12 == 0) {
                                dVar2 = d.AT_MOST_ONCE;
                            } else if (n12 == 1) {
                                dVar2 = d.EXACTLY_ONCE;
                            } else if (n12 == 2) {
                                dVar2 = d.AT_LEAST_ONCE;
                            }
                            if (dVar2 == null) {
                                j11.v(r11);
                                j11.v(n12);
                            } else {
                                this.f19149b |= 4;
                                this.f19153f = dVar2;
                            }
                        }
                    }
                    z11 = true;
                } catch (Td.j e11) {
                    e11.b(this);
                    throw e11;
                } catch (IOException e12) {
                    Td.j jVar = new Td.j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            } catch (Throwable th2) {
                if (((c11 == true ? 1 : 0) & 2) == 2) {
                    this.f19151d = Collections.unmodifiableList(this.f19151d);
                }
                try {
                    j11.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    throw th3;
                }
                throw th2;
            }
        }
        if (((c11 == true ? 1 : 0) & 2) == 2) {
            this.f19151d = Collections.unmodifiableList(this.f19151d);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19148a = m11.j();
        }
    }
}
