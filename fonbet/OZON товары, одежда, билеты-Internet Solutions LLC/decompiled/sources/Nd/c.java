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
public final class c extends h.d<c> {

    /* renamed from: i, reason: collision with root package name */
    private static final c f19125i;

    /* renamed from: j, reason: collision with root package name */
    public static Td.r<c> f19126j = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19127b;

    /* renamed from: c, reason: collision with root package name */
    private int f19128c;

    /* renamed from: d, reason: collision with root package name */
    private int f19129d;

    /* renamed from: e, reason: collision with root package name */
    private List<t> f19130e;

    /* renamed from: f, reason: collision with root package name */
    private List<Integer> f19131f;

    /* renamed from: g, reason: collision with root package name */
    private byte f19132g;

    /* renamed from: h, reason: collision with root package name */
    private int f19133h;

    static class a extends Td.b<c> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new c(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<c, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19134d;

        /* renamed from: e, reason: collision with root package name */
        private int f19135e = 6;

        /* renamed from: f, reason: collision with root package name */
        private List<t> f19136f;

        /* renamed from: g, reason: collision with root package name */
        private List<Integer> f19137g;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19136f = list;
            this.f19137g = list;
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
            c j11 = j();
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
            k((c) hVar);
            return this;
        }

        public final c j() {
            c cVar = new c(this);
            int i11 = (this.f19134d & 1) != 1 ? 0 : 1;
            cVar.f19129d = this.f19135e;
            if ((this.f19134d & 2) == 2) {
                this.f19136f = Collections.unmodifiableList(this.f19136f);
                this.f19134d &= -3;
            }
            cVar.f19130e = this.f19136f;
            if ((this.f19134d & 4) == 4) {
                this.f19137g = Collections.unmodifiableList(this.f19137g);
                this.f19134d &= -5;
            }
            cVar.f19131f = this.f19137g;
            cVar.f19128c = i11;
            return cVar;
        }

        public final void k(c cVar) {
            if (cVar == c.E()) {
                return;
            }
            if (cVar.H()) {
                int F11 = cVar.F();
                this.f19134d |= 1;
                this.f19135e = F11;
            }
            if (!cVar.f19130e.isEmpty()) {
                if (this.f19136f.isEmpty()) {
                    this.f19136f = cVar.f19130e;
                    this.f19134d &= -3;
                } else {
                    if ((this.f19134d & 2) != 2) {
                        this.f19136f = new ArrayList(this.f19136f);
                        this.f19134d |= 2;
                    }
                    this.f19136f.addAll(cVar.f19130e);
                }
            }
            if (!cVar.f19131f.isEmpty()) {
                if (this.f19137g.isEmpty()) {
                    this.f19137g = cVar.f19131f;
                    this.f19134d &= -5;
                } else {
                    if ((this.f19134d & 4) != 4) {
                        this.f19137g = new ArrayList(this.f19137g);
                        this.f19134d |= 4;
                    }
                    this.f19137g.addAll(cVar.f19131f);
                }
            }
            h(cVar);
            f(d().b(cVar.f19127b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            c cVar = null;
            try {
                try {
                    ((a) c.f19126j).getClass();
                    k(new c(dVar, fVar));
                } catch (Td.j e11) {
                    c cVar2 = (c) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar = cVar2;
                        if (cVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (cVar != null) {
                    k(cVar);
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
        c cVar = new c(0);
        f19125i = cVar;
        cVar.f19129d = 6;
        List list = Collections.EMPTY_LIST;
        cVar.f19130e = list;
        cVar.f19131f = list;
    }

    private c() {
        throw null;
    }

    c(b bVar) {
        super(bVar);
        this.f19132g = (byte) -1;
        this.f19133h = -1;
        this.f19127b = bVar.d();
    }

    public static c E() {
        return f19125i;
    }

    public final int F() {
        return this.f19129d;
    }

    public final List<t> G() {
        return this.f19130e;
    }

    public final boolean H() {
        return (this.f19128c & 1) == 1;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19128c & 1) == 1) {
            eVar.m(1, this.f19129d);
        }
        for (int i11 = 0; i11 < this.f19130e.size(); i11++) {
            eVar.o(2, this.f19130e.get(i11));
        }
        for (int i12 = 0; i12 < this.f19131f.size(); i12++) {
            eVar.m(31, this.f19131f.get(i12).intValue());
        }
        n11.a(19000, eVar);
        eVar.r(this.f19127b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19125i;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19133h;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19128c & 1) == 1 ? Td.e.b(1, this.f19129d) : 0;
        for (int i12 = 0; i12 < this.f19130e.size(); i12++) {
            b11 += Td.e.d(2, this.f19130e.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f19131f.size(); i14++) {
            i13 += Td.e.c(this.f19131f.get(i14).intValue());
        }
        int size = this.f19127b.size() + (this.f19131f.size() * 2) + b11 + i13 + g();
        this.f19133h = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19132g;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19130e.size(); i11++) {
            if (!this.f19130e.get(i11).isInitialized()) {
                this.f19132g = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f19132g = (byte) 1;
            return true;
        }
        this.f19132g = (byte) 0;
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

    private c(int i11) {
        this.f19132g = (byte) -1;
        this.f19133h = -1;
        this.f19127b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    c(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19132g = (byte) -1;
        this.f19133h = -1;
        this.f19129d = 6;
        List list = Collections.EMPTY_LIST;
        this.f19130e = list;
        this.f19131f = list;
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
                            this.f19128c |= 1;
                            this.f19129d = dVar.n();
                        } else if (r11 == 18) {
                            if ((i11 & 2) != 2) {
                                this.f19130e = new ArrayList();
                                i11 |= 2;
                            }
                            this.f19130e.add(dVar.i(t.f19429m, fVar));
                        } else if (r11 == 248) {
                            if ((i11 & 4) != 4) {
                                this.f19131f = new ArrayList();
                                i11 |= 4;
                            }
                            this.f19131f.add(Integer.valueOf(dVar.n()));
                        } else if (r11 != 250) {
                            if (!p(dVar, j11, fVar, r11)) {
                            }
                        } else {
                            int e11 = dVar.e(dVar.n());
                            if ((i11 & 4) != 4 && dVar.b() > 0) {
                                this.f19131f = new ArrayList();
                                i11 |= 4;
                            }
                            while (dVar.b() > 0) {
                                this.f19131f.add(Integer.valueOf(dVar.n()));
                            }
                            dVar.d(e11);
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if ((i11 & 2) == 2) {
                        this.f19130e = Collections.unmodifiableList(this.f19130e);
                    }
                    if ((i11 & 4) == 4) {
                        this.f19131f = Collections.unmodifiableList(this.f19131f);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19127b = m11.j();
                        throw th3;
                    }
                    this.f19127b = m11.j();
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
        if ((i11 & 2) == 2) {
            this.f19130e = Collections.unmodifiableList(this.f19130e);
        }
        if ((i11 & 4) == 4) {
            this.f19131f = Collections.unmodifiableList(this.f19131f);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19127b = m11.j();
            throw th4;
        }
        this.f19127b = m11.j();
        m();
    }
}
