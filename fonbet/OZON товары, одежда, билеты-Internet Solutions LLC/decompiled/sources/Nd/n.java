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
public final class n extends Td.h implements Td.q {

    /* renamed from: e, reason: collision with root package name */
    private static final n f19295e;

    /* renamed from: f, reason: collision with root package name */
    public static Td.r<n> f19296f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19297a;

    /* renamed from: b, reason: collision with root package name */
    private List<c> f19298b;

    /* renamed from: c, reason: collision with root package name */
    private byte f19299c;

    /* renamed from: d, reason: collision with root package name */
    private int f19300d;

    static class a extends Td.b<n> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new n(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.b<n, b> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19301b;

        /* renamed from: c, reason: collision with root package name */
        private List<c> f19302c = Collections.EMPTY_LIST;

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
            n h11 = h();
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
        public final /* bridge */ /* synthetic */ b e(n nVar) {
            i(nVar);
            return this;
        }

        public final n h() {
            n nVar = new n(this);
            if ((this.f19301b & 1) == 1) {
                this.f19302c = Collections.unmodifiableList(this.f19302c);
                this.f19301b &= -2;
            }
            nVar.f19298b = this.f19302c;
            return nVar;
        }

        public final void i(n nVar) {
            if (nVar == n.h()) {
                return;
            }
            if (!nVar.f19298b.isEmpty()) {
                if (this.f19302c.isEmpty()) {
                    this.f19302c = nVar.f19298b;
                    this.f19301b &= -2;
                } else {
                    if ((this.f19301b & 1) != 1) {
                        this.f19302c = new ArrayList(this.f19302c);
                        this.f19301b |= 1;
                    }
                    this.f19302c.addAll(nVar.f19298b);
                }
            }
            f(d().b(nVar.f19297a));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            n nVar = null;
            try {
                try {
                    ((a) n.f19296f).getClass();
                    i(new n(dVar, fVar));
                } catch (Td.j e11) {
                    n nVar2 = (n) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = nVar2;
                        if (nVar != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (nVar != null) {
                    i(nVar);
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
        n nVar = new n();
        f19295e = nVar;
        nVar.f19298b = Collections.EMPTY_LIST;
    }

    n(b bVar) {
        this.f19299c = (byte) -1;
        this.f19300d = -1;
        this.f19297a = bVar.d();
    }

    public static n h() {
        return f19295e;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        for (int i11 = 0; i11 < this.f19298b.size(); i11++) {
            eVar.o(1, this.f19298b.get(i11));
        }
        eVar.r(this.f19297a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19300d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19298b.size(); i13++) {
            i12 += Td.e.d(1, this.f19298b.get(i13));
        }
        int size = this.f19297a.size() + i12;
        this.f19300d = size;
        return size;
    }

    public final c i(int i11) {
        return this.f19298b.get(i11);
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19299c;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        for (int i11 = 0; i11 < this.f19298b.size(); i11++) {
            if (!i(i11).isInitialized()) {
                this.f19299c = (byte) 0;
                return false;
            }
        }
        this.f19299c = (byte) 1;
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

    public static final class c extends Td.h implements Td.q {

        /* renamed from: h, reason: collision with root package name */
        private static final c f19303h;

        /* renamed from: i, reason: collision with root package name */
        public static Td.r<c> f19304i = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f19305a;

        /* renamed from: b, reason: collision with root package name */
        private int f19306b;

        /* renamed from: c, reason: collision with root package name */
        private int f19307c;

        /* renamed from: d, reason: collision with root package name */
        private int f19308d;

        /* renamed from: e, reason: collision with root package name */
        private EnumC0382c f19309e;

        /* renamed from: f, reason: collision with root package name */
        private byte f19310f;

        /* renamed from: g, reason: collision with root package name */
        private int f19311g;

        static class a extends Td.b<c> {
            @Override // Td.r
            public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
                return new c(dVar);
            }
        }

        /* loaded from: classes10.dex */
        public static final class b extends h.b<c, b> implements Td.q {

            /* renamed from: b, reason: collision with root package name */
            private int f19312b;

            /* renamed from: d, reason: collision with root package name */
            private int f19314d;

            /* renamed from: c, reason: collision with root package name */
            private int f19313c = -1;

            /* renamed from: e, reason: collision with root package name */
            private EnumC0382c f19315e = EnumC0382c.PACKAGE;

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
                c h11 = h();
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
            public final /* bridge */ /* synthetic */ b e(c cVar) {
                i(cVar);
                return this;
            }

            public final c h() {
                c cVar = new c(this);
                int i11 = this.f19312b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                cVar.f19307c = this.f19313c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                cVar.f19308d = this.f19314d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                cVar.f19309e = this.f19315e;
                cVar.f19306b = i12;
                return cVar;
            }

            public final void i(c cVar) {
                if (cVar == c.j()) {
                    return;
                }
                if (cVar.s()) {
                    int m11 = cVar.m();
                    this.f19312b |= 1;
                    this.f19313c = m11;
                }
                if (cVar.u()) {
                    int n11 = cVar.n();
                    this.f19312b |= 2;
                    this.f19314d = n11;
                }
                if (cVar.p()) {
                    EnumC0382c l11 = cVar.l();
                    l11.getClass();
                    this.f19312b |= 4;
                    this.f19315e = l11;
                }
                f(d().b(cVar.f19305a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, Td.f fVar) throws IOException {
                c cVar = null;
                try {
                    try {
                        ((a) c.f19304i).getClass();
                        i(new c(dVar));
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
                        i(cVar);
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

        /* renamed from: Nd.n$c$c, reason: collision with other inner class name */
        public enum EnumC0382c implements i.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);

            private static i.b<EnumC0382c> internalValueMap = new a();
            private final int value;

            /* renamed from: Nd.n$c$c$a */
            static class a implements i.b<EnumC0382c> {
            }

            EnumC0382c(int i11) {
                this.value = i11;
            }

            @Override // Td.i.a
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            c cVar = new c();
            f19303h = cVar;
            cVar.f19307c = -1;
            cVar.f19308d = 0;
            cVar.f19309e = EnumC0382c.PACKAGE;
        }

        c(b bVar) {
            this.f19310f = (byte) -1;
            this.f19311g = -1;
            this.f19305a = bVar.d();
        }

        public static c j() {
            return f19303h;
        }

        @Override // Td.p
        public final void a(Td.e eVar) throws IOException {
            getSerializedSize();
            if ((this.f19306b & 1) == 1) {
                eVar.m(1, this.f19307c);
            }
            if ((this.f19306b & 2) == 2) {
                eVar.m(2, this.f19308d);
            }
            if ((this.f19306b & 4) == 4) {
                eVar.l(3, this.f19309e.getNumber());
            }
            eVar.r(this.f19305a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f19311g;
            if (i11 != -1) {
                return i11;
            }
            int b11 = (this.f19306b & 1) == 1 ? Td.e.b(1, this.f19307c) : 0;
            if ((this.f19306b & 2) == 2) {
                b11 += Td.e.b(2, this.f19308d);
            }
            if ((this.f19306b & 4) == 4) {
                b11 += Td.e.a(3, this.f19309e.getNumber());
            }
            int size = this.f19305a.size() + b11;
            this.f19311g = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f19310f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (u()) {
                this.f19310f = (byte) 1;
                return true;
            }
            this.f19310f = (byte) 0;
            return false;
        }

        public final EnumC0382c l() {
            return this.f19309e;
        }

        public final int m() {
            return this.f19307c;
        }

        public final int n() {
            return this.f19308d;
        }

        @Override // Td.p
        public final p.a newBuilderForType() {
            return b.g();
        }

        public final boolean p() {
            return (this.f19306b & 4) == 4;
        }

        public final boolean s() {
            return (this.f19306b & 1) == 1;
        }

        @Override // Td.p
        public final p.a toBuilder() {
            b g10 = b.g();
            g10.i(this);
            return g10;
        }

        public final boolean u() {
            return (this.f19306b & 2) == 2;
        }

        private c() {
            this.f19310f = (byte) -1;
            this.f19311g = -1;
            this.f19305a = Td.c.f27045a;
        }

        c(Td.d dVar) throws Td.j {
            EnumC0382c enumC0382c;
            this.f19310f = (byte) -1;
            this.f19311g = -1;
            this.f19307c = -1;
            boolean z11 = false;
            this.f19308d = 0;
            this.f19309e = EnumC0382c.PACKAGE;
            c.b m11 = Td.c.m();
            Td.e j11 = Td.e.j(m11, 1);
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 8) {
                                this.f19306b |= 1;
                                this.f19307c = dVar.n();
                            } else if (r11 == 16) {
                                this.f19306b |= 2;
                                this.f19308d = dVar.n();
                            } else if (r11 != 24) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                int n11 = dVar.n();
                                if (n11 == 0) {
                                    enumC0382c = EnumC0382c.CLASS;
                                } else if (n11 != 1) {
                                    enumC0382c = n11 != 2 ? null : EnumC0382c.LOCAL;
                                } else {
                                    enumC0382c = EnumC0382c.PACKAGE;
                                }
                                if (enumC0382c == null) {
                                    j11.v(r11);
                                    j11.v(n11);
                                } else {
                                    this.f19306b |= 4;
                                    this.f19309e = enumC0382c;
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
                    try {
                        j11.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    throw th2;
                }
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f19305a = m11.j();
            }
        }
    }

    private n() {
        this.f19299c = (byte) -1;
        this.f19300d = -1;
        this.f19297a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    n(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19299c = (byte) -1;
        this.f19300d = -1;
        this.f19298b = Collections.EMPTY_LIST;
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
                                this.f19298b = new ArrayList();
                                z12 = true;
                            }
                            this.f19298b.add(dVar.i(c.f19304i, fVar));
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
                    this.f19298b = Collections.unmodifiableList(this.f19298b);
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
            this.f19298b = Collections.unmodifiableList(this.f19298b);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19297a = m11.j();
        }
    }
}
