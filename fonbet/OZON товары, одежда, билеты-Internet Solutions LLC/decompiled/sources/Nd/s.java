package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends Td.h implements Td.q {

    /* renamed from: g, reason: collision with root package name */
    private static final s f19417g;

    /* renamed from: h, reason: collision with root package name */
    public static Td.r<s> f19418h = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19419a;

    /* renamed from: b, reason: collision with root package name */
    private int f19420b;

    /* renamed from: c, reason: collision with root package name */
    private List<p> f19421c;

    /* renamed from: d, reason: collision with root package name */
    private int f19422d;

    /* renamed from: e, reason: collision with root package name */
    private byte f19423e;

    /* renamed from: f, reason: collision with root package name */
    private int f19424f;

    static class a extends Td.b<s> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new s(dVar, fVar);
        }
    }

    public static final class b extends h.b<s, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19425b;

        /* renamed from: c, reason: collision with root package name */
        private List<p> f19426c = Collections.EMPTY_LIST;

        /* renamed from: d, reason: collision with root package name */
        private int f19427d = -1;

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
            s h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(s sVar) {
            i(sVar);
            return this;
        }

        public final s h() {
            s sVar = new s(this);
            int i11 = this.f19425b;
            if ((i11 & 1) == 1) {
                this.f19426c = Collections.unmodifiableList(this.f19426c);
                this.f19425b &= -2;
            }
            sVar.f19421c = this.f19426c;
            int i12 = (i11 & 2) != 2 ? 0 : 1;
            sVar.f19422d = this.f19427d;
            sVar.f19420b = i12;
            return sVar;
        }

        public final void i(s sVar) {
            if (sVar == s.j()) {
                return;
            }
            if (!sVar.f19421c.isEmpty()) {
                if (this.f19426c.isEmpty()) {
                    this.f19426c = sVar.f19421c;
                    this.f19425b &= -2;
                } else {
                    if ((this.f19425b & 1) != 1) {
                        this.f19426c = new ArrayList(this.f19426c);
                        this.f19425b |= 1;
                    }
                    this.f19426c.addAll(sVar.f19421c);
                }
            }
            if (sVar.n()) {
                int l11 = sVar.l();
                this.f19425b |= 2;
                this.f19427d = l11;
            }
            f(d().b(sVar.f19419a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            s sVar = null;
            try {
                try {
                    ((a) s.f19418h).getClass();
                    i(new s(dVar, fVar));
                } catch (Td.j e11) {
                    s sVar2 = (s) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        sVar = sVar2;
                        if (sVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (sVar != null) {
                    i(sVar);
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

    static {
        s sVar = new s();
        f19417g = sVar;
        sVar.f19421c = Collections.EMPTY_LIST;
        sVar.f19422d = -1;
    }

    s(b bVar) {
        this.f19423e = (byte) -1;
        this.f19424f = -1;
        this.f19419a = bVar.d();
    }

    public static s j() {
        return f19417g;
    }

    public static b p(s sVar) {
        b g10 = b.g();
        g10.i(sVar);
        return g10;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f19421c.size(); i11++) {
            eVar.o(1, this.f19421c.get(i11));
        }
        if ((this.f19420b & 1) == 1) {
            eVar.m(2, this.f19422d);
        }
        eVar.r(this.f19419a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19424f;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19421c.size(); i13++) {
            i12 += Td.e.d(1, this.f19421c.get(i13));
        }
        if ((this.f19420b & 1) == 1) {
            i12 += Td.e.b(2, this.f19422d);
        }
        int size = this.f19419a.size() + i12;
        this.f19424f = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19423e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19421c.size(); i11++) {
            if (!this.f19421c.get(i11).isInitialized()) {
                this.f19423e = (byte) 0;
                return false;
            }
        }
        this.f19423e = (byte) 1;
        return true;
    }

    public final int l() {
        return this.f19422d;
    }

    public final List<p> m() {
        return this.f19421c;
    }

    public final boolean n() {
        return (this.f19420b & 1) == 1;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return b.g();
    }

    public final b s() {
        return p(this);
    }

    @Override // Td.p
    public final p.a toBuilder() {
        return p(this);
    }

    private s() {
        this.f19423e = (byte) -1;
        this.f19424f = -1;
        this.f19419a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    s(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19423e = (byte) -1;
        this.f19424f = -1;
        this.f19421c = Collections.EMPTY_LIST;
        this.f19422d = -1;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 10) {
                            if (!z12) {
                                this.f19421c = new ArrayList();
                                z12 = true;
                            }
                            this.f19421c.add(dVar.i(p.f19325u, fVar));
                        } else if (r11 != 16) {
                            if (!dVar.u(r11, j11)) {
                            }
                        } else {
                            this.f19420b |= 1;
                            this.f19422d = dVar.n();
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (z12) {
                        this.f19421c = Collections.unmodifiableList(this.f19421c);
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
        if (z12) {
            this.f19421c = Collections.unmodifiableList(this.f19421c);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19419a = m11.j();
        }
    }
}
