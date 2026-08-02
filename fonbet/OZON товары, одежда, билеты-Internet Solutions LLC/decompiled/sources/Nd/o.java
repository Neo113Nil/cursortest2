package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends Td.h implements Td.q {

    /* renamed from: e, reason: collision with root package name */
    private static final o f19316e;

    /* renamed from: f, reason: collision with root package name */
    public static Td.r<o> f19317f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19318a;

    /* renamed from: b, reason: collision with root package name */
    private Td.n f19319b;

    /* renamed from: c, reason: collision with root package name */
    private byte f19320c;

    /* renamed from: d, reason: collision with root package name */
    private int f19321d;

    static class a extends Td.b<o> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new o(dVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.b<o, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19322b;

        /* renamed from: c, reason: collision with root package name */
        private Td.n f19323c = Td.m.f27096b;

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
            o h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(o oVar) {
            i(oVar);
            return this;
        }

        public final o h() {
            o oVar = new o(this);
            if ((this.f19322b & 1) == 1) {
                this.f19323c = this.f19323c.getUnmodifiableView();
                this.f19322b &= -2;
            }
            oVar.f19319b = this.f19323c;
            return oVar;
        }

        public final void i(o oVar) {
            if (oVar == o.h()) {
                return;
            }
            if (!oVar.f19319b.isEmpty()) {
                if (this.f19323c.isEmpty()) {
                    this.f19323c = oVar.f19319b;
                    this.f19322b &= -2;
                } else {
                    if ((this.f19322b & 1) != 1) {
                        this.f19323c = new Td.m(this.f19323c);
                        this.f19322b |= 1;
                    }
                    this.f19323c.addAll(oVar.f19319b);
                }
            }
            f(d().b(oVar.f19318a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            o oVar = null;
            try {
                try {
                    ((a) o.f19317f).getClass();
                    i(new o(dVar));
                } catch (Td.j e11) {
                    o oVar2 = (o) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        oVar = oVar2;
                        if (oVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (oVar != null) {
                    i(oVar);
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
        o oVar = new o();
        f19316e = oVar;
        oVar.f19319b = Td.m.f27096b;
    }

    o(b bVar) {
        this.f19320c = (byte) -1;
        this.f19321d = -1;
        this.f19318a = bVar.d();
    }

    public static o h() {
        return f19316e;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f19319b.size(); i11++) {
            Td.c byteString = this.f19319b.getByteString(i11);
            eVar.x(1, 2);
            eVar.v(byteString.size());
            eVar.r(byteString);
        }
        eVar.r(this.f19318a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19321d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19319b.size(); i13++) {
            Td.c byteString = this.f19319b.getByteString(i13);
            i12 += byteString.size() + Td.e.f(byteString.size());
        }
        int size = this.f19318a.size() + this.f19319b.size() + i12;
        this.f19321d = size;
        return size;
    }

    public final String i(int i11) {
        return (String) this.f19319b.get(i11);
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19320c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.f19320c = (byte) 1;
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

    private o() {
        this.f19320c = (byte) -1;
        this.f19321d = -1;
        this.f19318a = Td.c.f27045a;
    }

    o(Td.d dVar) throws Td.j {
        this.f19320c = (byte) -1;
        this.f19321d = -1;
        this.f19319b = Td.m.f27096b;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 != 10) {
                            if (!dVar.u(r11, j11)) {
                            }
                        } else {
                            Td.c f7 = dVar.f();
                            if (!z12) {
                                this.f19319b = new Td.m();
                                z12 = true;
                            }
                            this.f19319b.L0(f7);
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (z12) {
                        this.f19319b = this.f19319b.getUnmodifiableView();
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
            this.f19319b = this.f19319b.getUnmodifiableView();
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19318a = m11.j();
        }
    }
}
