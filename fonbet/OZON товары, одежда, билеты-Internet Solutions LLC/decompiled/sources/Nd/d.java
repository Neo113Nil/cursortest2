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
public final class d extends Td.h implements Td.q {

    /* renamed from: e, reason: collision with root package name */
    private static final d f19138e;

    /* renamed from: f, reason: collision with root package name */
    public static Td.r<d> f19139f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19140a;

    /* renamed from: b, reason: collision with root package name */
    private List<e> f19141b;

    /* renamed from: c, reason: collision with root package name */
    private byte f19142c;

    /* renamed from: d, reason: collision with root package name */
    private int f19143d;

    static class a extends Td.b<d> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new d(dVar, fVar);
        }
    }

    public static final class b extends h.b<d, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19144b;

        /* renamed from: c, reason: collision with root package name */
        private List<e> f19145c = Collections.EMPTY_LIST;

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
            d h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(d dVar) {
            i(dVar);
            return this;
        }

        public final d h() {
            d dVar = new d(this);
            if ((this.f19144b & 1) == 1) {
                this.f19145c = Collections.unmodifiableList(this.f19145c);
                this.f19144b &= -2;
            }
            dVar.f19141b = this.f19145c;
            return dVar;
        }

        public final void i(d dVar) {
            if (dVar == d.h()) {
                return;
            }
            if (!dVar.f19141b.isEmpty()) {
                if (this.f19145c.isEmpty()) {
                    this.f19145c = dVar.f19141b;
                    this.f19144b &= -2;
                } else {
                    if ((this.f19144b & 1) != 1) {
                        this.f19145c = new ArrayList(this.f19145c);
                        this.f19144b |= 1;
                    }
                    this.f19145c.addAll(dVar.f19141b);
                }
            }
            f(d().b(dVar.f19140a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            d dVar2 = null;
            try {
                try {
                    ((a) d.f19139f).getClass();
                    i(new d(dVar, fVar));
                } catch (Td.j e11) {
                    d dVar3 = (d) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        dVar2 = dVar3;
                        if (dVar2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (dVar2 != null) {
                    i(dVar2);
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
        d dVar = new d();
        f19138e = dVar;
        dVar.f19141b = Collections.EMPTY_LIST;
    }

    d(b bVar) {
        this.f19142c = (byte) -1;
        this.f19143d = -1;
        this.f19140a = bVar.d();
    }

    public static d h() {
        return f19138e;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f19141b.size(); i11++) {
            eVar.o(1, this.f19141b.get(i11));
        }
        eVar.r(this.f19140a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19143d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19141b.size(); i13++) {
            i12 += Td.e.d(1, this.f19141b.get(i13));
        }
        int size = this.f19140a.size() + i12;
        this.f19143d = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19142c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19141b.size(); i11++) {
            if (!this.f19141b.get(i11).isInitialized()) {
                this.f19142c = (byte) 0;
                return false;
            }
        }
        this.f19142c = (byte) 1;
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

    private d() {
        this.f19142c = (byte) -1;
        this.f19143d = -1;
        this.f19140a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    d(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19142c = (byte) -1;
        this.f19143d = -1;
        this.f19141b = Collections.EMPTY_LIST;
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
                            if (!z12) {
                                this.f19141b = new ArrayList();
                                z12 = true;
                            }
                            this.f19141b.add(dVar.i(e.f19147j, fVar));
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
                if (z12) {
                    this.f19141b = Collections.unmodifiableList(this.f19141b);
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
        if (z12) {
            this.f19141b = Collections.unmodifiableList(this.f19141b);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19140a = m11.j();
        }
    }
}
