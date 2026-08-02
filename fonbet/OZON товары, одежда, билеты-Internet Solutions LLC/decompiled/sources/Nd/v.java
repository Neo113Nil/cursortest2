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
public final class v extends Td.h implements Td.q {

    /* renamed from: e, reason: collision with root package name */
    private static final v f19466e;

    /* renamed from: f, reason: collision with root package name */
    public static Td.r<v> f19467f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19468a;

    /* renamed from: b, reason: collision with root package name */
    private List<u> f19469b;

    /* renamed from: c, reason: collision with root package name */
    private byte f19470c;

    /* renamed from: d, reason: collision with root package name */
    private int f19471d;

    static class a extends Td.b<v> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new v(dVar, fVar);
        }
    }

    public static final class b extends h.b<v, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19472b;

        /* renamed from: c, reason: collision with root package name */
        private List<u> f19473c = Collections.EMPTY_LIST;

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
            v h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(v vVar) {
            i(vVar);
            return this;
        }

        public final v h() {
            v vVar = new v(this);
            if ((this.f19472b & 1) == 1) {
                this.f19473c = Collections.unmodifiableList(this.f19473c);
                this.f19472b &= -2;
            }
            vVar.f19469b = this.f19473c;
            return vVar;
        }

        public final void i(v vVar) {
            if (vVar == v.h()) {
                return;
            }
            if (!vVar.f19469b.isEmpty()) {
                if (this.f19473c.isEmpty()) {
                    this.f19473c = vVar.f19469b;
                    this.f19472b &= -2;
                } else {
                    if ((this.f19472b & 1) != 1) {
                        this.f19473c = new ArrayList(this.f19473c);
                        this.f19472b |= 1;
                    }
                    this.f19473c.addAll(vVar.f19469b);
                }
            }
            f(d().b(vVar.f19468a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            v vVar = null;
            try {
                try {
                    ((a) v.f19467f).getClass();
                    i(new v(dVar, fVar));
                } catch (Td.j e11) {
                    v vVar2 = (v) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = vVar2;
                        if (vVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (vVar != null) {
                    i(vVar);
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
        v vVar = new v();
        f19466e = vVar;
        vVar.f19469b = Collections.EMPTY_LIST;
    }

    v(b bVar) {
        this.f19470c = (byte) -1;
        this.f19471d = -1;
        this.f19468a = bVar.d();
    }

    public static v h() {
        return f19466e;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f19469b.size(); i11++) {
            eVar.o(1, this.f19469b.get(i11));
        }
        eVar.r(this.f19468a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19471d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19469b.size(); i13++) {
            i12 += Td.e.d(1, this.f19469b.get(i13));
        }
        int size = this.f19468a.size() + i12;
        this.f19471d = size;
        return size;
    }

    public final int i() {
        return this.f19469b.size();
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19470c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.f19470c = (byte) 1;
        return true;
    }

    public final List<u> j() {
        return this.f19469b;
    }

    public final b l() {
        b g10 = b.g();
        g10.i(this);
        return g10;
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

    private v() {
        this.f19470c = (byte) -1;
        this.f19471d = -1;
        this.f19468a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    v(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19470c = (byte) -1;
        this.f19471d = -1;
        this.f19469b = Collections.EMPTY_LIST;
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
                                this.f19469b = new ArrayList();
                                z12 = true;
                            }
                            this.f19469b.add(dVar.i(u.f19448l, fVar));
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
                    this.f19469b = Collections.unmodifiableList(this.f19469b);
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
            this.f19469b = Collections.unmodifiableList(this.f19469b);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19468a = m11.j();
        }
    }
}
