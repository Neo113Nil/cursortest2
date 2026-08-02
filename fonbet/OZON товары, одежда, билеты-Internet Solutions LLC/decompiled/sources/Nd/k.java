package Nd;

import Nd.s;
import Nd.v;
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
public final class k extends h.d<k> {

    /* renamed from: k, reason: collision with root package name */
    private static final k f19227k;

    /* renamed from: l, reason: collision with root package name */
    public static Td.r<k> f19228l = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19229b;

    /* renamed from: c, reason: collision with root package name */
    private int f19230c;

    /* renamed from: d, reason: collision with root package name */
    private List<h> f19231d;

    /* renamed from: e, reason: collision with root package name */
    private List<m> f19232e;

    /* renamed from: f, reason: collision with root package name */
    private List<q> f19233f;

    /* renamed from: g, reason: collision with root package name */
    private s f19234g;

    /* renamed from: h, reason: collision with root package name */
    private v f19235h;

    /* renamed from: i, reason: collision with root package name */
    private byte f19236i;

    /* renamed from: j, reason: collision with root package name */
    private int f19237j;

    static class a extends Td.b<k> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new k(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<k, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19238d;

        /* renamed from: e, reason: collision with root package name */
        private List<h> f19239e;

        /* renamed from: f, reason: collision with root package name */
        private List<m> f19240f;

        /* renamed from: g, reason: collision with root package name */
        private List<q> f19241g;

        /* renamed from: h, reason: collision with root package name */
        private s f19242h;

        /* renamed from: i, reason: collision with root package name */
        private v f19243i;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f19239e = list;
            this.f19240f = list;
            this.f19241g = list;
            this.f19242h = s.j();
            this.f19243i = v.h();
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
            k j11 = j();
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
            k((k) hVar);
            return this;
        }

        public final k j() {
            k kVar = new k(this);
            int i11 = this.f19238d;
            if ((i11 & 1) == 1) {
                this.f19239e = Collections.unmodifiableList(this.f19239e);
                this.f19238d &= -2;
            }
            kVar.f19231d = this.f19239e;
            if ((this.f19238d & 2) == 2) {
                this.f19240f = Collections.unmodifiableList(this.f19240f);
                this.f19238d &= -3;
            }
            kVar.f19232e = this.f19240f;
            if ((this.f19238d & 4) == 4) {
                this.f19241g = Collections.unmodifiableList(this.f19241g);
                this.f19238d &= -5;
            }
            kVar.f19233f = this.f19241g;
            int i12 = (i11 & 8) != 8 ? 0 : 1;
            kVar.f19234g = this.f19242h;
            if ((i11 & 16) == 16) {
                i12 |= 2;
            }
            kVar.f19235h = this.f19243i;
            kVar.f19230c = i12;
            return kVar;
        }

        public final void k(k kVar) {
            if (kVar == k.H()) {
                return;
            }
            if (!kVar.f19231d.isEmpty()) {
                if (this.f19239e.isEmpty()) {
                    this.f19239e = kVar.f19231d;
                    this.f19238d &= -2;
                } else {
                    if ((this.f19238d & 1) != 1) {
                        this.f19239e = new ArrayList(this.f19239e);
                        this.f19238d |= 1;
                    }
                    this.f19239e.addAll(kVar.f19231d);
                }
            }
            if (!kVar.f19232e.isEmpty()) {
                if (this.f19240f.isEmpty()) {
                    this.f19240f = kVar.f19232e;
                    this.f19238d &= -3;
                } else {
                    if ((this.f19238d & 2) != 2) {
                        this.f19240f = new ArrayList(this.f19240f);
                        this.f19238d |= 2;
                    }
                    this.f19240f.addAll(kVar.f19232e);
                }
            }
            if (!kVar.f19233f.isEmpty()) {
                if (this.f19241g.isEmpty()) {
                    this.f19241g = kVar.f19233f;
                    this.f19238d &= -5;
                } else {
                    if ((this.f19238d & 4) != 4) {
                        this.f19241g = new ArrayList(this.f19241g);
                        this.f19238d |= 4;
                    }
                    this.f19241g.addAll(kVar.f19233f);
                }
            }
            if (kVar.N()) {
                s L11 = kVar.L();
                if ((this.f19238d & 8) != 8 || this.f19242h == s.j()) {
                    this.f19242h = L11;
                } else {
                    s.b p11 = s.p(this.f19242h);
                    p11.i(L11);
                    this.f19242h = p11.h();
                }
                this.f19238d |= 8;
            }
            if (kVar.O()) {
                v M11 = kVar.M();
                if ((this.f19238d & 16) != 16 || this.f19243i == v.h()) {
                    this.f19243i = M11;
                } else {
                    v vVar = this.f19243i;
                    v.b g10 = v.b.g();
                    g10.i(vVar);
                    g10.i(M11);
                    this.f19243i = g10.h();
                }
                this.f19238d |= 16;
            }
            h(kVar);
            f(d().b(kVar.f19229b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            k kVar = null;
            try {
                try {
                    ((a) k.f19228l).getClass();
                    k(new k(dVar, fVar));
                } catch (Td.j e11) {
                    k kVar2 = (k) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        kVar = kVar2;
                        if (kVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (kVar != null) {
                    k(kVar);
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
        k kVar = new k(0);
        f19227k = kVar;
        List list = Collections.EMPTY_LIST;
        kVar.f19231d = list;
        kVar.f19232e = list;
        kVar.f19233f = list;
        kVar.f19234g = s.j();
        kVar.f19235h = v.h();
    }

    private k() {
        throw null;
    }

    k(b bVar) {
        super(bVar);
        this.f19236i = (byte) -1;
        this.f19237j = -1;
        this.f19229b = bVar.d();
    }

    public static k H() {
        return f19227k;
    }

    public final List<h> I() {
        return this.f19231d;
    }

    public final List<m> J() {
        return this.f19232e;
    }

    public final List<q> K() {
        return this.f19233f;
    }

    public final s L() {
        return this.f19234g;
    }

    public final v M() {
        return this.f19235h;
    }

    public final boolean N() {
        return (this.f19230c & 1) == 1;
    }

    public final boolean O() {
        return (this.f19230c & 2) == 2;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        for (int i11 = 0; i11 < this.f19231d.size(); i11++) {
            eVar.o(3, this.f19231d.get(i11));
        }
        for (int i12 = 0; i12 < this.f19232e.size(); i12++) {
            eVar.o(4, this.f19232e.get(i12));
        }
        for (int i13 = 0; i13 < this.f19233f.size(); i13++) {
            eVar.o(5, this.f19233f.get(i13));
        }
        if ((this.f19230c & 1) == 1) {
            eVar.o(30, this.f19234g);
        }
        if ((this.f19230c & 2) == 2) {
            eVar.o(32, this.f19235h);
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19229b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19227k;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19237j;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19231d.size(); i13++) {
            i12 += Td.e.d(3, this.f19231d.get(i13));
        }
        for (int i14 = 0; i14 < this.f19232e.size(); i14++) {
            i12 += Td.e.d(4, this.f19232e.get(i14));
        }
        for (int i15 = 0; i15 < this.f19233f.size(); i15++) {
            i12 += Td.e.d(5, this.f19233f.get(i15));
        }
        if ((this.f19230c & 1) == 1) {
            i12 += Td.e.d(30, this.f19234g);
        }
        if ((this.f19230c & 2) == 2) {
            i12 += Td.e.d(32, this.f19235h);
        }
        int size = this.f19229b.size() + i12 + g();
        this.f19237j = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19236i;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19231d.size(); i11++) {
            if (!this.f19231d.get(i11).isInitialized()) {
                this.f19236i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f19232e.size(); i12++) {
            if (!this.f19232e.get(i12).isInitialized()) {
                this.f19236i = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f19233f.size(); i13++) {
            if (!this.f19233f.get(i13).isInitialized()) {
                this.f19236i = (byte) 0;
                return false;
            }
        }
        if (N() && !this.f19234g.isInitialized()) {
            this.f19236i = (byte) 0;
            return false;
        }
        if (f()) {
            this.f19236i = (byte) 1;
            return true;
        }
        this.f19236i = (byte) 0;
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

    private k(int i11) {
        this.f19236i = (byte) -1;
        this.f19237j = -1;
        this.f19229b = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    k(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19236i = (byte) -1;
        this.f19237j = -1;
        List list = Collections.EMPTY_LIST;
        this.f19231d = list;
        this.f19232e = list;
        this.f19233f = list;
        this.f19234g = s.j();
        this.f19235h = v.h();
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        boolean z11 = false;
        char c11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 26) {
                            int i11 = (c11 == true ? 1 : 0) & 1;
                            c11 = c11;
                            if (i11 != 1) {
                                this.f19231d = new ArrayList();
                                c11 = (c11 == true ? 1 : 0) | 1;
                            }
                            this.f19231d.add(dVar.i(h.f19192v, fVar));
                        } else if (r11 == 34) {
                            int i12 = (c11 == true ? 1 : 0) & 2;
                            c11 = c11;
                            if (i12 != 2) {
                                this.f19232e = new ArrayList();
                                c11 = (c11 == true ? 1 : 0) | 2;
                            }
                            this.f19232e.add(dVar.i(m.f19260v, fVar));
                        } else if (r11 != 42) {
                            v.b bVar = null;
                            s.b bVar2 = null;
                            if (r11 == 242) {
                                if ((this.f19230c & 1) == 1) {
                                    s sVar = this.f19234g;
                                    sVar.getClass();
                                    bVar2 = s.p(sVar);
                                }
                                s sVar2 = (s) dVar.i(s.f19418h, fVar);
                                this.f19234g = sVar2;
                                if (bVar2 != null) {
                                    bVar2.i(sVar2);
                                    this.f19234g = bVar2.h();
                                }
                                this.f19230c |= 1;
                            } else if (r11 != 258) {
                                if (!p(dVar, j11, fVar, r11)) {
                                }
                            } else {
                                if ((this.f19230c & 2) == 2) {
                                    v vVar = this.f19235h;
                                    vVar.getClass();
                                    bVar = v.b.g();
                                    bVar.i(vVar);
                                }
                                v vVar2 = (v) dVar.i(v.f19467f, fVar);
                                this.f19235h = vVar2;
                                if (bVar != null) {
                                    bVar.i(vVar2);
                                    this.f19235h = bVar.h();
                                }
                                this.f19230c |= 2;
                            }
                        } else {
                            int i13 = (c11 == true ? 1 : 0) & 4;
                            c11 = c11;
                            if (i13 != 4) {
                                this.f19233f = new ArrayList();
                                c11 = (c11 == true ? 1 : 0) | 4;
                            }
                            this.f19233f.add(dVar.i(q.f19373p, fVar));
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if (((c11 == true ? 1 : 0) & 1) == 1) {
                        this.f19231d = Collections.unmodifiableList(this.f19231d);
                    }
                    if (((c11 == true ? 1 : 0) & 2) == 2) {
                        this.f19232e = Collections.unmodifiableList(this.f19232e);
                    }
                    if (((c11 == true ? 1 : 0) & 4) == 4) {
                        this.f19233f = Collections.unmodifiableList(this.f19233f);
                    }
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f19229b = m11.j();
                        throw th3;
                    }
                    this.f19229b = m11.j();
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
        if (((c11 == true ? 1 : 0) & 1) == 1) {
            this.f19231d = Collections.unmodifiableList(this.f19231d);
        }
        if (((c11 == true ? 1 : 0) & 2) == 2) {
            this.f19232e = Collections.unmodifiableList(this.f19232e);
        }
        if (((c11 == true ? 1 : 0) & 4) == 4) {
            this.f19233f = Collections.unmodifiableList(this.f19233f);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19229b = m11.j();
            throw th4;
        }
        this.f19229b = m11.j();
        m();
    }
}
