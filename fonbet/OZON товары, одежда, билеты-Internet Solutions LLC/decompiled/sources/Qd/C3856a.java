package Qd;

import Nd.k;
import Nd.m;
import Nd.p;
import Nd.r;
import Td.AbstractC4045a;
import Td.c;
import Td.e;
import Td.f;
import Td.h;
import Td.i;
import Td.j;
import Td.p;
import Td.q;
import Td.v;
import Td.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Qd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3856a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.f<Nd.c, b> f23232a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.f<Nd.h, b> f23233b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.f<Nd.h, Integer> f23234c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.f<m, c> f23235d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.f<m, Integer> f23236e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.f<p, List<Nd.a>> f23237f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.f<p, Boolean> f23238g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.f<r, List<Nd.a>> f23239h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.f<Nd.b, Integer> f23240i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.f<Nd.b, List<m>> f23241j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.f<Nd.b, Integer> f23242k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.f<Nd.b, Integer> f23243l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.f<k, Integer> f23244m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.f<k, List<m>> f23245n;

    static {
        Nd.c E11 = Nd.c.E();
        b i11 = b.i();
        b i12 = b.i();
        y yVar = y.MESSAGE;
        f23232a = h.d(E11, i11, i12, 100, yVar, b.class);
        f23233b = h.d(Nd.h.V(), b.i(), b.i(), 100, yVar, b.class);
        Nd.h V11 = Nd.h.V();
        y yVar2 = y.INT32;
        f23234c = h.d(V11, 0, null, 101, yVar2, Integer.class);
        f23235d = h.d(m.T(), c.m(), c.m(), 100, yVar, c.class);
        f23236e = h.d(m.T(), 0, null, 101, yVar2, Integer.class);
        f23237f = h.b(p.T(), Nd.a.m(), 100, yVar, Nd.a.class);
        f23238g = h.d(p.T(), Boolean.FALSE, null, 101, y.BOOL, Boolean.class);
        f23239h = h.b(r.H(), Nd.a.m(), 100, yVar, Nd.a.class);
        f23240i = h.d(Nd.b.r0(), 0, null, 101, yVar2, Integer.class);
        f23241j = h.b(Nd.b.r0(), m.T(), 102, yVar, m.class);
        f23242k = h.d(Nd.b.r0(), 0, null, 103, yVar2, Integer.class);
        f23243l = h.d(Nd.b.r0(), 0, null, 104, yVar2, Integer.class);
        f23244m = h.d(k.H(), 0, null, 101, yVar2, Integer.class);
        f23245n = h.b(k.H(), m.T(), 102, yVar, m.class);
    }

    /* renamed from: Qd.a$a, reason: collision with other inner class name */
    public static final class C0461a extends h implements q {

        /* renamed from: g, reason: collision with root package name */
        private static final C0461a f23246g;

        /* renamed from: h, reason: collision with root package name */
        public static Td.r<C0461a> f23247h = new C0462a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f23248a;

        /* renamed from: b, reason: collision with root package name */
        private int f23249b;

        /* renamed from: c, reason: collision with root package name */
        private int f23250c;

        /* renamed from: d, reason: collision with root package name */
        private int f23251d;

        /* renamed from: e, reason: collision with root package name */
        private byte f23252e;

        /* renamed from: f, reason: collision with root package name */
        private int f23253f;

        /* renamed from: Qd.a$a$a, reason: collision with other inner class name */
        static class C0462a extends Td.b<C0461a> {
            @Override // Td.r
            public final Object a(Td.d dVar, f fVar) throws j {
                return new C0461a(dVar);
            }
        }

        /* renamed from: Qd.a$a$b */
        /* loaded from: classes10.dex */
        public static final class b extends h.b<C0461a, b> implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f23254b;

            /* renamed from: c, reason: collision with root package name */
            private int f23255c;

            /* renamed from: d, reason: collision with root package name */
            private int f23256d;

            static b g() {
                return new b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                C0461a h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new v();
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
            public final /* bridge */ /* synthetic */ b e(C0461a c0461a) {
                i(c0461a);
                return this;
            }

            public final C0461a h() {
                C0461a c0461a = new C0461a(this);
                int i11 = this.f23254b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                c0461a.f23250c = this.f23255c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                c0461a.f23251d = this.f23256d;
                c0461a.f23249b = i12;
                return c0461a;
            }

            public final void i(C0461a c0461a) {
                if (c0461a == C0461a.i()) {
                    return;
                }
                if (c0461a.n()) {
                    int l11 = c0461a.l();
                    this.f23254b |= 1;
                    this.f23255c = l11;
                }
                if (c0461a.m()) {
                    int j11 = c0461a.j();
                    this.f23254b |= 2;
                    this.f23256d = j11;
                }
                f(d().b(c0461a.f23248a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, f fVar) throws IOException {
                C0461a c0461a = null;
                try {
                    try {
                        ((C0462a) C0461a.f23247h).getClass();
                        i(new C0461a(dVar));
                    } catch (j e11) {
                        C0461a c0461a2 = (C0461a) e11.a();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            c0461a = c0461a2;
                            if (c0461a != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (c0461a != null) {
                        i(c0461a);
                    }
                    throw th;
                }
            }

            @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        static {
            C0461a c0461a = new C0461a();
            f23246g = c0461a;
            c0461a.f23250c = 0;
            c0461a.f23251d = 0;
        }

        C0461a(b bVar) {
            this.f23252e = (byte) -1;
            this.f23253f = -1;
            this.f23248a = bVar.d();
        }

        public static C0461a i() {
            return f23246g;
        }

        @Override // Td.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.f23249b & 1) == 1) {
                eVar.m(1, this.f23250c);
            }
            if ((this.f23249b & 2) == 2) {
                eVar.m(2, this.f23251d);
            }
            eVar.r(this.f23248a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f23253f;
            if (i11 != -1) {
                return i11;
            }
            int b11 = (this.f23249b & 1) == 1 ? e.b(1, this.f23250c) : 0;
            if ((this.f23249b & 2) == 2) {
                b11 += e.b(2, this.f23251d);
            }
            int size = this.f23248a.size() + b11;
            this.f23253f = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f23252e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f23252e = (byte) 1;
            return true;
        }

        public final int j() {
            return this.f23251d;
        }

        public final int l() {
            return this.f23250c;
        }

        public final boolean m() {
            return (this.f23249b & 2) == 2;
        }

        public final boolean n() {
            return (this.f23249b & 1) == 1;
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

        private C0461a() {
            this.f23252e = (byte) -1;
            this.f23253f = -1;
            this.f23248a = Td.c.f27045a;
        }

        C0461a(Td.d dVar) throws j {
            this.f23252e = (byte) -1;
            this.f23253f = -1;
            boolean z11 = false;
            this.f23250c = 0;
            this.f23251d = 0;
            c.b m11 = Td.c.m();
            e j11 = e.j(m11, 1);
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 8) {
                                this.f23249b |= 1;
                                this.f23250c = dVar.n();
                            } else if (r11 != 16) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                this.f23249b |= 2;
                                this.f23251d = dVar.n();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            j11.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        throw th2;
                    }
                } catch (j e11) {
                    e11.b(this);
                    throw e11;
                } catch (IOException e12) {
                    j jVar = new j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f23248a = m11.j();
            }
        }
    }

    /* renamed from: Qd.a$b */
    public static final class b extends h implements q {

        /* renamed from: g, reason: collision with root package name */
        private static final b f23257g;

        /* renamed from: h, reason: collision with root package name */
        public static Td.r<b> f23258h = new C0463a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f23259a;

        /* renamed from: b, reason: collision with root package name */
        private int f23260b;

        /* renamed from: c, reason: collision with root package name */
        private int f23261c;

        /* renamed from: d, reason: collision with root package name */
        private int f23262d;

        /* renamed from: e, reason: collision with root package name */
        private byte f23263e;

        /* renamed from: f, reason: collision with root package name */
        private int f23264f;

        /* renamed from: Qd.a$b$a, reason: collision with other inner class name */
        static class C0463a extends Td.b<b> {
            @Override // Td.r
            public final Object a(Td.d dVar, f fVar) throws j {
                return new b(dVar);
            }
        }

        /* renamed from: Qd.a$b$b, reason: collision with other inner class name */
        public static final class C0464b extends h.b<b, C0464b> implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f23265b;

            /* renamed from: c, reason: collision with root package name */
            private int f23266c;

            /* renamed from: d, reason: collision with root package name */
            private int f23267d;

            static C0464b g() {
                return new C0464b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                b h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new v();
            }

            @Override // Td.h.b
            /* renamed from: c */
            public final C0464b clone() {
                C0464b c0464b = new C0464b();
                c0464b.i(h());
                return c0464b;
            }

            @Override // Td.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0464b c0464b = new C0464b();
                c0464b.i(h());
                return c0464b;
            }

            @Override // Td.h.b
            public final /* bridge */ /* synthetic */ C0464b e(b bVar) {
                i(bVar);
                return this;
            }

            public final b h() {
                b bVar = new b(this);
                int i11 = this.f23265b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                bVar.f23261c = this.f23266c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                bVar.f23262d = this.f23267d;
                bVar.f23260b = i12;
                return bVar;
            }

            public final void i(b bVar) {
                if (bVar == b.i()) {
                    return;
                }
                if (bVar.n()) {
                    int l11 = bVar.l();
                    this.f23265b |= 1;
                    this.f23266c = l11;
                }
                if (bVar.m()) {
                    int j11 = bVar.j();
                    this.f23265b |= 2;
                    this.f23267d = j11;
                }
                f(d().b(bVar.f23259a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, f fVar) throws IOException {
                b bVar = null;
                try {
                    try {
                        ((C0463a) b.f23258h).getClass();
                        i(new b(dVar));
                    } catch (j e11) {
                        b bVar2 = (b) e11.a();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            if (bVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (bVar != null) {
                        i(bVar);
                    }
                    throw th;
                }
            }

            @Override // Td.AbstractC4045a.AbstractC0542a, Td.p.a
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        static {
            b bVar = new b();
            f23257g = bVar;
            bVar.f23261c = 0;
            bVar.f23262d = 0;
        }

        b(C0464b c0464b) {
            this.f23263e = (byte) -1;
            this.f23264f = -1;
            this.f23259a = c0464b.d();
        }

        public static b i() {
            return f23257g;
        }

        public static C0464b p(b bVar) {
            C0464b g10 = C0464b.g();
            g10.i(bVar);
            return g10;
        }

        @Override // Td.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.f23260b & 1) == 1) {
                eVar.m(1, this.f23261c);
            }
            if ((this.f23260b & 2) == 2) {
                eVar.m(2, this.f23262d);
            }
            eVar.r(this.f23259a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f23264f;
            if (i11 != -1) {
                return i11;
            }
            int b11 = (this.f23260b & 1) == 1 ? e.b(1, this.f23261c) : 0;
            if ((this.f23260b & 2) == 2) {
                b11 += e.b(2, this.f23262d);
            }
            int size = this.f23259a.size() + b11;
            this.f23264f = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f23263e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f23263e = (byte) 1;
            return true;
        }

        public final int j() {
            return this.f23262d;
        }

        public final int l() {
            return this.f23261c;
        }

        public final boolean m() {
            return (this.f23260b & 2) == 2;
        }

        public final boolean n() {
            return (this.f23260b & 1) == 1;
        }

        @Override // Td.p
        public final p.a newBuilderForType() {
            return C0464b.g();
        }

        @Override // Td.p
        public final p.a toBuilder() {
            return p(this);
        }

        private b() {
            this.f23263e = (byte) -1;
            this.f23264f = -1;
            this.f23259a = Td.c.f27045a;
        }

        b(Td.d dVar) throws j {
            this.f23263e = (byte) -1;
            this.f23264f = -1;
            boolean z11 = false;
            this.f23261c = 0;
            this.f23262d = 0;
            c.b m11 = Td.c.m();
            e j11 = e.j(m11, 1);
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 8) {
                                this.f23260b |= 1;
                                this.f23261c = dVar.n();
                            } else if (r11 != 16) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                this.f23260b |= 2;
                                this.f23262d = dVar.n();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            j11.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        throw th2;
                    }
                } catch (j e11) {
                    e11.b(this);
                    throw e11;
                } catch (IOException e12) {
                    j jVar = new j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f23259a = m11.j();
            }
        }
    }

    /* renamed from: Qd.a$c */
    public static final class c extends h implements q {

        /* renamed from: j, reason: collision with root package name */
        private static final c f23268j;

        /* renamed from: k, reason: collision with root package name */
        public static Td.r<c> f23269k = new C0465a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f23270a;

        /* renamed from: b, reason: collision with root package name */
        private int f23271b;

        /* renamed from: c, reason: collision with root package name */
        private C0461a f23272c;

        /* renamed from: d, reason: collision with root package name */
        private b f23273d;

        /* renamed from: e, reason: collision with root package name */
        private b f23274e;

        /* renamed from: f, reason: collision with root package name */
        private b f23275f;

        /* renamed from: g, reason: collision with root package name */
        private b f23276g;

        /* renamed from: h, reason: collision with root package name */
        private byte f23277h;

        /* renamed from: i, reason: collision with root package name */
        private int f23278i;

        /* renamed from: Qd.a$c$a, reason: collision with other inner class name */
        static class C0465a extends Td.b<c> {
            @Override // Td.r
            public final Object a(Td.d dVar, f fVar) throws j {
                return new c(dVar, fVar);
            }
        }

        /* renamed from: Qd.a$c$b */
        public static final class b extends h.b<c, b> implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f23279b;

            /* renamed from: c, reason: collision with root package name */
            private C0461a f23280c = C0461a.i();

            /* renamed from: d, reason: collision with root package name */
            private b f23281d = b.i();

            /* renamed from: e, reason: collision with root package name */
            private b f23282e = b.i();

            /* renamed from: f, reason: collision with root package name */
            private b f23283f = b.i();

            /* renamed from: g, reason: collision with root package name */
            private b f23284g = b.i();

            private b() {
            }

            static b g() {
                return new b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                c h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new v();
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
                int i11 = this.f23279b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                cVar.f23272c = this.f23280c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                cVar.f23273d = this.f23281d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                cVar.f23274e = this.f23282e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                cVar.f23275f = this.f23283f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                cVar.f23276g = this.f23284g;
                cVar.f23271b = i12;
                return cVar;
            }

            public final void i(c cVar) {
                if (cVar == c.m()) {
                    return;
                }
                if (cVar.A()) {
                    C0461a p11 = cVar.p();
                    if ((this.f23279b & 1) != 1 || this.f23280c == C0461a.i()) {
                        this.f23280c = p11;
                    } else {
                        C0461a c0461a = this.f23280c;
                        C0461a.b g10 = C0461a.b.g();
                        g10.i(c0461a);
                        g10.i(p11);
                        this.f23280c = g10.h();
                    }
                    this.f23279b |= 1;
                }
                if (cVar.D()) {
                    b v11 = cVar.v();
                    if ((this.f23279b & 2) != 2 || this.f23281d == b.i()) {
                        this.f23281d = v11;
                    } else {
                        b.C0464b p12 = b.p(this.f23281d);
                        p12.i(v11);
                        this.f23281d = p12.h();
                    }
                    this.f23279b |= 2;
                }
                if (cVar.B()) {
                    b s11 = cVar.s();
                    if ((this.f23279b & 4) != 4 || this.f23282e == b.i()) {
                        this.f23282e = s11;
                    } else {
                        b.C0464b p13 = b.p(this.f23282e);
                        p13.i(s11);
                        this.f23282e = p13.h();
                    }
                    this.f23279b |= 4;
                }
                if (cVar.C()) {
                    b u11 = cVar.u();
                    if ((this.f23279b & 8) != 8 || this.f23283f == b.i()) {
                        this.f23283f = u11;
                    } else {
                        b.C0464b p14 = b.p(this.f23283f);
                        p14.i(u11);
                        this.f23283f = p14.h();
                    }
                    this.f23279b |= 8;
                }
                if (cVar.y()) {
                    b n11 = cVar.n();
                    if ((this.f23279b & 16) != 16 || this.f23284g == b.i()) {
                        this.f23284g = n11;
                    } else {
                        b.C0464b p15 = b.p(this.f23284g);
                        p15.i(n11);
                        this.f23284g = p15.h();
                    }
                    this.f23279b |= 16;
                }
                f(d().b(cVar.f23270a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, f fVar) throws IOException {
                c cVar = null;
                try {
                    try {
                        ((C0465a) c.f23269k).getClass();
                        i(new c(dVar, fVar));
                    } catch (j e11) {
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
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        static {
            c cVar = new c();
            f23268j = cVar;
            cVar.f23272c = C0461a.i();
            cVar.f23273d = b.i();
            cVar.f23274e = b.i();
            cVar.f23275f = b.i();
            cVar.f23276g = b.i();
        }

        c(b bVar) {
            this.f23277h = (byte) -1;
            this.f23278i = -1;
            this.f23270a = bVar.d();
        }

        public static c m() {
            return f23268j;
        }

        public final boolean A() {
            return (this.f23271b & 1) == 1;
        }

        public final boolean B() {
            return (this.f23271b & 4) == 4;
        }

        public final boolean C() {
            return (this.f23271b & 8) == 8;
        }

        public final boolean D() {
            return (this.f23271b & 2) == 2;
        }

        @Override // Td.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.f23271b & 1) == 1) {
                eVar.o(1, this.f23272c);
            }
            if ((this.f23271b & 2) == 2) {
                eVar.o(2, this.f23273d);
            }
            if ((this.f23271b & 4) == 4) {
                eVar.o(3, this.f23274e);
            }
            if ((this.f23271b & 8) == 8) {
                eVar.o(4, this.f23275f);
            }
            if ((this.f23271b & 16) == 16) {
                eVar.o(5, this.f23276g);
            }
            eVar.r(this.f23270a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f23278i;
            if (i11 != -1) {
                return i11;
            }
            int d11 = (this.f23271b & 1) == 1 ? e.d(1, this.f23272c) : 0;
            if ((this.f23271b & 2) == 2) {
                d11 += e.d(2, this.f23273d);
            }
            if ((this.f23271b & 4) == 4) {
                d11 += e.d(3, this.f23274e);
            }
            if ((this.f23271b & 8) == 8) {
                d11 += e.d(4, this.f23275f);
            }
            if ((this.f23271b & 16) == 16) {
                d11 += e.d(5, this.f23276g);
            }
            int size = this.f23270a.size() + d11;
            this.f23278i = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f23277h;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f23277h = (byte) 1;
            return true;
        }

        public final b n() {
            return this.f23276g;
        }

        @Override // Td.p
        public final p.a newBuilderForType() {
            return b.g();
        }

        public final C0461a p() {
            return this.f23272c;
        }

        public final b s() {
            return this.f23274e;
        }

        @Override // Td.p
        public final p.a toBuilder() {
            b g10 = b.g();
            g10.i(this);
            return g10;
        }

        public final b u() {
            return this.f23275f;
        }

        public final b v() {
            return this.f23273d;
        }

        public final boolean y() {
            return (this.f23271b & 16) == 16;
        }

        private c() {
            this.f23277h = (byte) -1;
            this.f23278i = -1;
            this.f23270a = Td.c.f27045a;
        }

        c(Td.d dVar, f fVar) throws j {
            this.f23277h = (byte) -1;
            this.f23278i = -1;
            this.f23272c = C0461a.i();
            this.f23273d = b.i();
            this.f23274e = b.i();
            this.f23275f = b.i();
            this.f23276g = b.i();
            c.b m11 = Td.c.m();
            e j11 = e.j(m11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            b.C0464b c0464b = null;
                            C0461a.b bVar = null;
                            b.C0464b c0464b2 = null;
                            b.C0464b c0464b3 = null;
                            b.C0464b c0464b4 = null;
                            if (r11 == 10) {
                                if ((this.f23271b & 1) == 1) {
                                    C0461a c0461a = this.f23272c;
                                    c0461a.getClass();
                                    bVar = C0461a.b.g();
                                    bVar.i(c0461a);
                                }
                                C0461a c0461a2 = (C0461a) dVar.i(C0461a.f23247h, fVar);
                                this.f23272c = c0461a2;
                                if (bVar != null) {
                                    bVar.i(c0461a2);
                                    this.f23272c = bVar.h();
                                }
                                this.f23271b |= 1;
                            } else if (r11 == 18) {
                                if ((this.f23271b & 2) == 2) {
                                    b bVar2 = this.f23273d;
                                    bVar2.getClass();
                                    c0464b2 = b.p(bVar2);
                                }
                                b bVar3 = (b) dVar.i(b.f23258h, fVar);
                                this.f23273d = bVar3;
                                if (c0464b2 != null) {
                                    c0464b2.i(bVar3);
                                    this.f23273d = c0464b2.h();
                                }
                                this.f23271b |= 2;
                            } else if (r11 == 26) {
                                if ((this.f23271b & 4) == 4) {
                                    b bVar4 = this.f23274e;
                                    bVar4.getClass();
                                    c0464b3 = b.p(bVar4);
                                }
                                b bVar5 = (b) dVar.i(b.f23258h, fVar);
                                this.f23274e = bVar5;
                                if (c0464b3 != null) {
                                    c0464b3.i(bVar5);
                                    this.f23274e = c0464b3.h();
                                }
                                this.f23271b |= 4;
                            } else if (r11 == 34) {
                                if ((this.f23271b & 8) == 8) {
                                    b bVar6 = this.f23275f;
                                    bVar6.getClass();
                                    c0464b4 = b.p(bVar6);
                                }
                                b bVar7 = (b) dVar.i(b.f23258h, fVar);
                                this.f23275f = bVar7;
                                if (c0464b4 != null) {
                                    c0464b4.i(bVar7);
                                    this.f23275f = c0464b4.h();
                                }
                                this.f23271b |= 8;
                            } else if (r11 != 42) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                if ((this.f23271b & 16) == 16) {
                                    b bVar8 = this.f23276g;
                                    bVar8.getClass();
                                    c0464b = b.p(bVar8);
                                }
                                b bVar9 = (b) dVar.i(b.f23258h, fVar);
                                this.f23276g = bVar9;
                                if (c0464b != null) {
                                    c0464b.i(bVar9);
                                    this.f23276g = c0464b.h();
                                }
                                this.f23271b |= 16;
                            }
                        }
                        z11 = true;
                    } catch (j e11) {
                        e11.b(this);
                        throw e11;
                    } catch (IOException e12) {
                        j jVar = new j(e12.getMessage());
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
                this.f23270a = m11.j();
            }
        }
    }

    /* renamed from: Qd.a$d */
    public static final class d extends h implements q {

        /* renamed from: g, reason: collision with root package name */
        private static final d f23285g;

        /* renamed from: h, reason: collision with root package name */
        public static Td.r<d> f23286h = new C0466a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f23287a;

        /* renamed from: b, reason: collision with root package name */
        private List<c> f23288b;

        /* renamed from: c, reason: collision with root package name */
        private List<Integer> f23289c;

        /* renamed from: d, reason: collision with root package name */
        private int f23290d;

        /* renamed from: e, reason: collision with root package name */
        private byte f23291e;

        /* renamed from: f, reason: collision with root package name */
        private int f23292f;

        /* renamed from: Qd.a$d$a, reason: collision with other inner class name */
        static class C0466a extends Td.b<d> {
            @Override // Td.r
            public final Object a(Td.d dVar, f fVar) throws j {
                return new d(dVar, fVar);
            }
        }

        /* renamed from: Qd.a$d$b */
        /* loaded from: classes10.dex */
        public static final class b extends h.b<d, b> implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f23293b;

            /* renamed from: c, reason: collision with root package name */
            private List<c> f23294c;

            /* renamed from: d, reason: collision with root package name */
            private List<Integer> f23295d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f23294c = list;
                this.f23295d = list;
            }

            static b g() {
                return new b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                d h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new v();
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
                if ((this.f23293b & 1) == 1) {
                    this.f23294c = Collections.unmodifiableList(this.f23294c);
                    this.f23293b &= -2;
                }
                dVar.f23288b = this.f23294c;
                if ((this.f23293b & 2) == 2) {
                    this.f23295d = Collections.unmodifiableList(this.f23295d);
                    this.f23293b &= -3;
                }
                dVar.f23289c = this.f23295d;
                return dVar;
            }

            public final void i(d dVar) {
                if (dVar == d.j()) {
                    return;
                }
                if (!dVar.f23288b.isEmpty()) {
                    if (this.f23294c.isEmpty()) {
                        this.f23294c = dVar.f23288b;
                        this.f23293b &= -2;
                    } else {
                        if ((this.f23293b & 1) != 1) {
                            this.f23294c = new ArrayList(this.f23294c);
                            this.f23293b |= 1;
                        }
                        this.f23294c.addAll(dVar.f23288b);
                    }
                }
                if (!dVar.f23289c.isEmpty()) {
                    if (this.f23295d.isEmpty()) {
                        this.f23295d = dVar.f23289c;
                        this.f23293b &= -3;
                    } else {
                        if ((this.f23293b & 2) != 2) {
                            this.f23295d = new ArrayList(this.f23295d);
                            this.f23293b |= 2;
                        }
                        this.f23295d.addAll(dVar.f23289c);
                    }
                }
                f(d().b(dVar.f23287a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, f fVar) throws IOException {
                d dVar2 = null;
                try {
                    try {
                        ((C0466a) d.f23286h).getClass();
                        i(new d(dVar, fVar));
                    } catch (j e11) {
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
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        static {
            d dVar = new d();
            f23285g = dVar;
            List list = Collections.EMPTY_LIST;
            dVar.f23288b = list;
            dVar.f23289c = list;
        }

        d(b bVar) {
            this.f23290d = -1;
            this.f23291e = (byte) -1;
            this.f23292f = -1;
            this.f23287a = bVar.d();
        }

        public static d j() {
            return f23285g;
        }

        @Override // Td.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f23288b.size(); i11++) {
                eVar.o(1, this.f23288b.get(i11));
            }
            if (this.f23289c.size() > 0) {
                eVar.v(42);
                eVar.v(this.f23290d);
            }
            for (int i12 = 0; i12 < this.f23289c.size(); i12++) {
                eVar.n(this.f23289c.get(i12).intValue());
            }
            eVar.r(this.f23287a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f23292f;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f23288b.size(); i13++) {
                i12 += e.d(1, this.f23288b.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f23289c.size(); i15++) {
                i14 += e.c(this.f23289c.get(i15).intValue());
            }
            int i16 = i12 + i14;
            if (!this.f23289c.isEmpty()) {
                i16 = i16 + 1 + e.c(i14);
            }
            this.f23290d = i14;
            int size = this.f23287a.size() + i16;
            this.f23292f = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f23291e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f23291e = (byte) 1;
            return true;
        }

        public final List<Integer> l() {
            return this.f23289c;
        }

        public final List<c> m() {
            return this.f23288b;
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

        /* renamed from: Qd.a$d$c */
        public static final class c extends h implements q {

            /* renamed from: m, reason: collision with root package name */
            private static final c f23296m;

            /* renamed from: n, reason: collision with root package name */
            public static Td.r<c> f23297n = new C0467a();

            /* renamed from: a, reason: collision with root package name */
            private final Td.c f23298a;

            /* renamed from: b, reason: collision with root package name */
            private int f23299b;

            /* renamed from: c, reason: collision with root package name */
            private int f23300c;

            /* renamed from: d, reason: collision with root package name */
            private int f23301d;

            /* renamed from: e, reason: collision with root package name */
            private Object f23302e;

            /* renamed from: f, reason: collision with root package name */
            private EnumC0468c f23303f;

            /* renamed from: g, reason: collision with root package name */
            private List<Integer> f23304g;

            /* renamed from: h, reason: collision with root package name */
            private int f23305h;

            /* renamed from: i, reason: collision with root package name */
            private List<Integer> f23306i;

            /* renamed from: j, reason: collision with root package name */
            private int f23307j;

            /* renamed from: k, reason: collision with root package name */
            private byte f23308k;

            /* renamed from: l, reason: collision with root package name */
            private int f23309l;

            /* renamed from: Qd.a$d$c$a, reason: collision with other inner class name */
            static class C0467a extends Td.b<c> {
                @Override // Td.r
                public final Object a(Td.d dVar, f fVar) throws j {
                    return new c(dVar);
                }
            }

            /* renamed from: Qd.a$d$c$b */
            /* loaded from: classes10.dex */
            public static final class b extends h.b<c, b> implements q {

                /* renamed from: b, reason: collision with root package name */
                private int f23310b;

                /* renamed from: d, reason: collision with root package name */
                private int f23312d;

                /* renamed from: g, reason: collision with root package name */
                private List<Integer> f23315g;

                /* renamed from: h, reason: collision with root package name */
                private List<Integer> f23316h;

                /* renamed from: c, reason: collision with root package name */
                private int f23311c = 1;

                /* renamed from: e, reason: collision with root package name */
                private Object f23313e = "";

                /* renamed from: f, reason: collision with root package name */
                private EnumC0468c f23314f = EnumC0468c.NONE;

                private b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f23315g = list;
                    this.f23316h = list;
                }

                static b g() {
                    return new b();
                }

                @Override // Td.AbstractC4045a.AbstractC0542a
                /* renamed from: b */
                public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, f fVar) throws IOException {
                    j(dVar, fVar);
                    return this;
                }

                @Override // Td.p.a
                public final Td.p build() {
                    c h11 = h();
                    if (h11.isInitialized()) {
                        return h11;
                    }
                    throw new v();
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
                    int i11 = this.f23310b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    cVar.f23300c = this.f23311c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    cVar.f23301d = this.f23312d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    cVar.f23302e = this.f23313e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    cVar.f23303f = this.f23314f;
                    if ((this.f23310b & 16) == 16) {
                        this.f23315g = Collections.unmodifiableList(this.f23315g);
                        this.f23310b &= -17;
                    }
                    cVar.f23304g = this.f23315g;
                    if ((this.f23310b & 32) == 32) {
                        this.f23316h = Collections.unmodifiableList(this.f23316h);
                        this.f23310b &= -33;
                    }
                    cVar.f23306i = this.f23316h;
                    cVar.f23299b = i12;
                    return cVar;
                }

                public final void i(c cVar) {
                    if (cVar == c.u()) {
                        return;
                    }
                    if (cVar.I()) {
                        int A11 = cVar.A();
                        this.f23310b |= 1;
                        this.f23311c = A11;
                    }
                    if (cVar.H()) {
                        int y11 = cVar.y();
                        this.f23310b |= 2;
                        this.f23312d = y11;
                    }
                    if (cVar.J()) {
                        this.f23310b |= 4;
                        this.f23313e = cVar.f23302e;
                    }
                    if (cVar.G()) {
                        EnumC0468c v11 = cVar.v();
                        v11.getClass();
                        this.f23310b |= 8;
                        this.f23314f = v11;
                    }
                    if (!cVar.f23304g.isEmpty()) {
                        if (this.f23315g.isEmpty()) {
                            this.f23315g = cVar.f23304g;
                            this.f23310b &= -17;
                        } else {
                            if ((this.f23310b & 16) != 16) {
                                this.f23315g = new ArrayList(this.f23315g);
                                this.f23310b |= 16;
                            }
                            this.f23315g.addAll(cVar.f23304g);
                        }
                    }
                    if (!cVar.f23306i.isEmpty()) {
                        if (this.f23316h.isEmpty()) {
                            this.f23316h = cVar.f23306i;
                            this.f23310b &= -33;
                        } else {
                            if ((this.f23310b & 32) != 32) {
                                this.f23316h = new ArrayList(this.f23316h);
                                this.f23310b |= 32;
                            }
                            this.f23316h.addAll(cVar.f23306i);
                        }
                    }
                    f(d().b(cVar.f23298a));
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void j(Td.d dVar, f fVar) throws IOException {
                    c cVar = null;
                    try {
                        try {
                            ((C0467a) c.f23297n).getClass();
                            i(new c(dVar));
                        } catch (j e11) {
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
                public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, f fVar) throws IOException {
                    j(dVar, fVar);
                    return this;
                }
            }

            /* renamed from: Qd.a$d$c$c, reason: collision with other inner class name */
            public enum EnumC0468c implements i.a {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                private static i.b<EnumC0468c> internalValueMap = new C0469a();
                private final int value;

                /* renamed from: Qd.a$d$c$c$a, reason: collision with other inner class name */
                static class C0469a implements i.b<EnumC0468c> {
                }

                EnumC0468c(int i11) {
                    this.value = i11;
                }

                @Override // Td.i.a
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                c cVar = new c();
                f23296m = cVar;
                cVar.f23300c = 1;
                cVar.f23301d = 0;
                cVar.f23302e = "";
                cVar.f23303f = EnumC0468c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                cVar.f23304g = list;
                cVar.f23306i = list;
            }

            c(b bVar) {
                this.f23305h = -1;
                this.f23307j = -1;
                this.f23308k = (byte) -1;
                this.f23309l = -1;
                this.f23298a = bVar.d();
            }

            public static c u() {
                return f23296m;
            }

            public final int A() {
                return this.f23300c;
            }

            public final int B() {
                return this.f23306i.size();
            }

            public final List<Integer> C() {
                return this.f23306i;
            }

            public final String D() {
                Object obj = this.f23302e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                Td.c cVar = (Td.c) obj;
                String s11 = cVar.s();
                if (cVar.k()) {
                    this.f23302e = s11;
                }
                return s11;
            }

            public final int E() {
                return this.f23304g.size();
            }

            public final List<Integer> F() {
                return this.f23304g;
            }

            public final boolean G() {
                return (this.f23299b & 8) == 8;
            }

            public final boolean H() {
                return (this.f23299b & 2) == 2;
            }

            public final boolean I() {
                return (this.f23299b & 1) == 1;
            }

            public final boolean J() {
                return (this.f23299b & 4) == 4;
            }

            @Override // Td.p
            public final void a(e eVar) throws IOException {
                Td.c cVar;
                getSerializedSize();
                if ((this.f23299b & 1) == 1) {
                    eVar.m(1, this.f23300c);
                }
                if ((this.f23299b & 2) == 2) {
                    eVar.m(2, this.f23301d);
                }
                if ((this.f23299b & 8) == 8) {
                    eVar.l(3, this.f23303f.getNumber());
                }
                if (this.f23304g.size() > 0) {
                    eVar.v(34);
                    eVar.v(this.f23305h);
                }
                for (int i11 = 0; i11 < this.f23304g.size(); i11++) {
                    eVar.n(this.f23304g.get(i11).intValue());
                }
                if (this.f23306i.size() > 0) {
                    eVar.v(42);
                    eVar.v(this.f23307j);
                }
                for (int i12 = 0; i12 < this.f23306i.size(); i12++) {
                    eVar.n(this.f23306i.get(i12).intValue());
                }
                if ((this.f23299b & 4) == 4) {
                    Object obj = this.f23302e;
                    if (obj instanceof String) {
                        cVar = Td.c.e((String) obj);
                        this.f23302e = cVar;
                    } else {
                        cVar = (Td.c) obj;
                    }
                    eVar.x(6, 2);
                    eVar.v(cVar.size());
                    eVar.r(cVar);
                }
                eVar.r(this.f23298a);
            }

            @Override // Td.p
            public final int getSerializedSize() {
                Td.c cVar;
                int i11 = this.f23309l;
                if (i11 != -1) {
                    return i11;
                }
                int b11 = (this.f23299b & 1) == 1 ? e.b(1, this.f23300c) : 0;
                if ((this.f23299b & 2) == 2) {
                    b11 += e.b(2, this.f23301d);
                }
                if ((this.f23299b & 8) == 8) {
                    b11 += e.a(3, this.f23303f.getNumber());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.f23304g.size(); i13++) {
                    i12 += e.c(this.f23304g.get(i13).intValue());
                }
                int i14 = b11 + i12;
                if (!this.f23304g.isEmpty()) {
                    i14 = i14 + 1 + e.c(i12);
                }
                this.f23305h = i12;
                int i15 = 0;
                for (int i16 = 0; i16 < this.f23306i.size(); i16++) {
                    i15 += e.c(this.f23306i.get(i16).intValue());
                }
                int i17 = i14 + i15;
                if (!this.f23306i.isEmpty()) {
                    i17 = i17 + 1 + e.c(i15);
                }
                this.f23307j = i15;
                if ((this.f23299b & 4) == 4) {
                    Object obj = this.f23302e;
                    if (obj instanceof String) {
                        cVar = Td.c.e((String) obj);
                        this.f23302e = cVar;
                    } else {
                        cVar = (Td.c) obj;
                    }
                    i17 += cVar.size() + e.f(cVar.size()) + e.h(6);
                }
                int size = this.f23298a.size() + i17;
                this.f23309l = size;
                return size;
            }

            @Override // Td.q
            public final boolean isInitialized() {
                byte b11 = this.f23308k;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                this.f23308k = (byte) 1;
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

            public final EnumC0468c v() {
                return this.f23303f;
            }

            public final int y() {
                return this.f23301d;
            }

            private c() {
                this.f23305h = -1;
                this.f23307j = -1;
                this.f23308k = (byte) -1;
                this.f23309l = -1;
                this.f23298a = Td.c.f27045a;
            }

            c(Td.d dVar) throws j {
                EnumC0468c enumC0468c;
                this.f23305h = -1;
                this.f23307j = -1;
                this.f23308k = (byte) -1;
                this.f23309l = -1;
                this.f23300c = 1;
                boolean z11 = false;
                this.f23301d = 0;
                this.f23302e = "";
                this.f23303f = EnumC0468c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f23304g = list;
                this.f23306i = list;
                c.b m11 = Td.c.m();
                e j11 = e.j(m11, 1);
                int i11 = 0;
                while (!z11) {
                    try {
                        try {
                            int r11 = dVar.r();
                            if (r11 != 0) {
                                if (r11 == 8) {
                                    this.f23299b |= 1;
                                    this.f23300c = dVar.n();
                                } else if (r11 == 16) {
                                    this.f23299b |= 2;
                                    this.f23301d = dVar.n();
                                } else if (r11 == 24) {
                                    int n11 = dVar.n();
                                    if (n11 == 0) {
                                        enumC0468c = EnumC0468c.NONE;
                                    } else if (n11 != 1) {
                                        enumC0468c = n11 != 2 ? null : EnumC0468c.DESC_TO_CLASS_ID;
                                    } else {
                                        enumC0468c = EnumC0468c.INTERNAL_TO_CLASS_ID;
                                    }
                                    if (enumC0468c == null) {
                                        j11.v(r11);
                                        j11.v(n11);
                                    } else {
                                        this.f23299b |= 8;
                                        this.f23303f = enumC0468c;
                                    }
                                } else if (r11 == 32) {
                                    if ((i11 & 16) != 16) {
                                        this.f23304g = new ArrayList();
                                        i11 |= 16;
                                    }
                                    this.f23304g.add(Integer.valueOf(dVar.n()));
                                } else if (r11 == 34) {
                                    int e11 = dVar.e(dVar.n());
                                    if ((i11 & 16) != 16 && dVar.b() > 0) {
                                        this.f23304g = new ArrayList();
                                        i11 |= 16;
                                    }
                                    while (dVar.b() > 0) {
                                        this.f23304g.add(Integer.valueOf(dVar.n()));
                                    }
                                    dVar.d(e11);
                                } else if (r11 == 40) {
                                    if ((i11 & 32) != 32) {
                                        this.f23306i = new ArrayList();
                                        i11 |= 32;
                                    }
                                    this.f23306i.add(Integer.valueOf(dVar.n()));
                                } else if (r11 == 42) {
                                    int e12 = dVar.e(dVar.n());
                                    if ((i11 & 32) != 32 && dVar.b() > 0) {
                                        this.f23306i = new ArrayList();
                                        i11 |= 32;
                                    }
                                    while (dVar.b() > 0) {
                                        this.f23306i.add(Integer.valueOf(dVar.n()));
                                    }
                                    dVar.d(e12);
                                } else if (r11 != 50) {
                                    if (!dVar.u(r11, j11)) {
                                    }
                                } else {
                                    Td.c f7 = dVar.f();
                                    this.f23299b |= 4;
                                    this.f23302e = f7;
                                }
                            }
                            z11 = true;
                        } catch (j e13) {
                            e13.b(this);
                            throw e13;
                        } catch (IOException e14) {
                            j jVar = new j(e14.getMessage());
                            jVar.b(this);
                            throw jVar;
                        }
                    } catch (Throwable th2) {
                        if ((i11 & 16) == 16) {
                            this.f23304g = Collections.unmodifiableList(this.f23304g);
                        }
                        if ((i11 & 32) == 32) {
                            this.f23306i = Collections.unmodifiableList(this.f23306i);
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
                if ((i11 & 16) == 16) {
                    this.f23304g = Collections.unmodifiableList(this.f23304g);
                }
                if ((i11 & 32) == 32) {
                    this.f23306i = Collections.unmodifiableList(this.f23306i);
                }
                try {
                    j11.i();
                } catch (IOException unused2) {
                } finally {
                    this.f23298a = m11.j();
                }
            }
        }

        private d() {
            this.f23290d = -1;
            this.f23291e = (byte) -1;
            this.f23292f = -1;
            this.f23287a = Td.c.f27045a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Td.d dVar, f fVar) throws j {
            this.f23290d = -1;
            this.f23291e = (byte) -1;
            this.f23292f = -1;
            List list = Collections.EMPTY_LIST;
            this.f23288b = list;
            this.f23289c = list;
            c.b m11 = Td.c.m();
            e j11 = e.j(m11, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 10) {
                                if ((i11 & 1) != 1) {
                                    this.f23288b = new ArrayList();
                                    i11 |= 1;
                                }
                                this.f23288b.add(dVar.i(c.f23297n, fVar));
                            } else if (r11 == 40) {
                                if ((i11 & 2) != 2) {
                                    this.f23289c = new ArrayList();
                                    i11 |= 2;
                                }
                                this.f23289c.add(Integer.valueOf(dVar.n()));
                            } else if (r11 != 42) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                int e11 = dVar.e(dVar.n());
                                if ((i11 & 2) != 2 && dVar.b() > 0) {
                                    this.f23289c = new ArrayList();
                                    i11 |= 2;
                                }
                                while (dVar.b() > 0) {
                                    this.f23289c.add(Integer.valueOf(dVar.n()));
                                }
                                dVar.d(e11);
                            }
                        }
                        z11 = true;
                    } catch (j e12) {
                        e12.b(this);
                        throw e12;
                    } catch (IOException e13) {
                        j jVar = new j(e13.getMessage());
                        jVar.b(this);
                        throw jVar;
                    }
                } catch (Throwable th2) {
                    if ((i11 & 1) == 1) {
                        this.f23288b = Collections.unmodifiableList(this.f23288b);
                    }
                    if ((i11 & 2) == 2) {
                        this.f23289c = Collections.unmodifiableList(this.f23289c);
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
            if ((i11 & 1) == 1) {
                this.f23288b = Collections.unmodifiableList(this.f23288b);
            }
            if ((i11 & 2) == 2) {
                this.f23289c = Collections.unmodifiableList(this.f23289c);
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f23287a = m11.j();
            }
        }
    }
}
