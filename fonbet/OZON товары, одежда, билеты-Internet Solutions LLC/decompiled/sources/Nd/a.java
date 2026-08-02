package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.i;
import Td.p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends Td.h implements Td.q {

    /* renamed from: g, reason: collision with root package name */
    private static final a f19013g;

    /* renamed from: h, reason: collision with root package name */
    public static Td.r<a> f19014h = new C0374a();

    /* renamed from: a, reason: collision with root package name */
    private final Td.c f19015a;

    /* renamed from: b, reason: collision with root package name */
    private int f19016b;

    /* renamed from: c, reason: collision with root package name */
    private int f19017c;

    /* renamed from: d, reason: collision with root package name */
    private List<b> f19018d;

    /* renamed from: e, reason: collision with root package name */
    private byte f19019e;

    /* renamed from: f, reason: collision with root package name */
    private int f19020f;

    /* renamed from: Nd.a$a, reason: collision with other inner class name */
    static class C0374a extends Td.b<a> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new a(dVar, fVar);
        }
    }

    public static final class c extends h.b<a, c> implements Td.q {

        /* renamed from: b, reason: collision with root package name */
        private int f19061b;

        /* renamed from: c, reason: collision with root package name */
        private int f19062c;

        /* renamed from: d, reason: collision with root package name */
        private List<b> f19063d = Collections.EMPTY_LIST;

        private c() {
        }

        static c g() {
            return new c();
        }

        @Override // Td.AbstractC4045a.AbstractC0542a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
            j(dVar, fVar);
            return this;
        }

        @Override // Td.p.a
        public final Td.p build() {
            a h11 = h();
            if (h11.isInitialized()) {
                return h11;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        /* renamed from: c */
        public final c clone() {
            c cVar = new c();
            cVar.i(h());
            return cVar;
        }

        @Override // Td.h.b
        public final Object clone() throws CloneNotSupportedException {
            c cVar = new c();
            cVar.i(h());
            return cVar;
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ c e(a aVar) {
            i(aVar);
            return this;
        }

        public final a h() {
            a aVar = new a(this);
            int i11 = (this.f19061b & 1) != 1 ? 0 : 1;
            aVar.f19017c = this.f19062c;
            if ((this.f19061b & 2) == 2) {
                this.f19063d = Collections.unmodifiableList(this.f19063d);
                this.f19061b &= -3;
            }
            aVar.f19018d = this.f19063d;
            aVar.f19016b = i11;
            return aVar;
        }

        public final void i(a aVar) {
            if (aVar == a.m()) {
                return;
            }
            if (aVar.p()) {
                int n11 = aVar.n();
                this.f19061b |= 1;
                this.f19062c = n11;
            }
            if (!aVar.f19018d.isEmpty()) {
                if (this.f19063d.isEmpty()) {
                    this.f19063d = aVar.f19018d;
                    this.f19061b &= -3;
                } else {
                    if ((this.f19061b & 2) != 2) {
                        this.f19063d = new ArrayList(this.f19063d);
                        this.f19061b |= 2;
                    }
                    this.f19063d.addAll(aVar.f19018d);
                }
            }
            f(d().b(aVar.f19015a));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(Td.d dVar, Td.f fVar) throws IOException {
            a aVar = null;
            try {
                try {
                    i((a) ((C0374a) a.f19014h).a(dVar, fVar));
                } catch (Td.j e11) {
                    a aVar2 = (a) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        if (aVar != null) {
                            i(aVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (aVar != null) {
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
        a aVar = new a();
        f19013g = aVar;
        aVar.f19017c = 0;
        aVar.f19018d = Collections.EMPTY_LIST;
    }

    a(c cVar) {
        this.f19019e = (byte) -1;
        this.f19020f = -1;
        this.f19015a = cVar.d();
    }

    public static a m() {
        return f19013g;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        if ((this.f19016b & 1) == 1) {
            eVar.m(1, this.f19017c);
        }
        for (int i11 = 0; i11 < this.f19018d.size(); i11++) {
            eVar.o(2, this.f19018d.get(i11));
        }
        eVar.r(this.f19015a);
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19020f;
        if (i11 != -1) {
            return i11;
        }
        int b11 = (this.f19016b & 1) == 1 ? Td.e.b(1, this.f19017c) : 0;
        for (int i12 = 0; i12 < this.f19018d.size(); i12++) {
            b11 += Td.e.d(2, this.f19018d.get(i12));
        }
        int size = this.f19015a.size() + b11;
        this.f19020f = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19019e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (!p()) {
            this.f19019e = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f19018d.size(); i11++) {
            if (!this.f19018d.get(i11).isInitialized()) {
                this.f19019e = (byte) 0;
                return false;
            }
        }
        this.f19019e = (byte) 1;
        return true;
    }

    public final int j() {
        return this.f19018d.size();
    }

    public final List<b> l() {
        return this.f19018d;
    }

    public final int n() {
        return this.f19017c;
    }

    @Override // Td.p
    public final p.a newBuilderForType() {
        return c.g();
    }

    public final boolean p() {
        return (this.f19016b & 1) == 1;
    }

    @Override // Td.p
    public final p.a toBuilder() {
        c g10 = c.g();
        g10.i(this);
        return g10;
    }

    public static final class b extends Td.h implements Td.q {

        /* renamed from: g, reason: collision with root package name */
        private static final b f19021g;

        /* renamed from: h, reason: collision with root package name */
        public static Td.r<b> f19022h = new C0375a();

        /* renamed from: a, reason: collision with root package name */
        private final Td.c f19023a;

        /* renamed from: b, reason: collision with root package name */
        private int f19024b;

        /* renamed from: c, reason: collision with root package name */
        private int f19025c;

        /* renamed from: d, reason: collision with root package name */
        private c f19026d;

        /* renamed from: e, reason: collision with root package name */
        private byte f19027e;

        /* renamed from: f, reason: collision with root package name */
        private int f19028f;

        /* renamed from: Nd.a$b$a, reason: collision with other inner class name */
        static class C0375a extends Td.b<b> {
            @Override // Td.r
            public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
                return new b(dVar, fVar);
            }
        }

        /* renamed from: Nd.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public static final class C0376b extends h.b<b, C0376b> implements Td.q {

            /* renamed from: b, reason: collision with root package name */
            private int f19029b;

            /* renamed from: c, reason: collision with root package name */
            private int f19030c;

            /* renamed from: d, reason: collision with root package name */
            private c f19031d = c.F();

            private C0376b() {
            }

            static C0376b g() {
                return new C0376b();
            }

            @Override // Td.AbstractC4045a.AbstractC0542a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ AbstractC4045a.AbstractC0542a q1(Td.d dVar, Td.f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }

            @Override // Td.p.a
            public final Td.p build() {
                b h11 = h();
                if (h11.isInitialized()) {
                    return h11;
                }
                throw new Td.v();
            }

            @Override // Td.h.b
            /* renamed from: c */
            public final C0376b clone() {
                C0376b c0376b = new C0376b();
                c0376b.i(h());
                return c0376b;
            }

            @Override // Td.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0376b c0376b = new C0376b();
                c0376b.i(h());
                return c0376b;
            }

            @Override // Td.h.b
            public final /* bridge */ /* synthetic */ C0376b e(b bVar) {
                i(bVar);
                return this;
            }

            public final b h() {
                b bVar = new b(this);
                int i11 = this.f19029b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                bVar.f19025c = this.f19030c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                bVar.f19026d = this.f19031d;
                bVar.f19024b = i12;
                return bVar;
            }

            public final void i(b bVar) {
                if (bVar == b.i()) {
                    return;
                }
                if (bVar.m()) {
                    int j11 = bVar.j();
                    this.f19029b |= 1;
                    this.f19030c = j11;
                }
                if (bVar.n()) {
                    c l11 = bVar.l();
                    if ((this.f19029b & 2) != 2 || this.f19031d == c.F()) {
                        this.f19031d = l11;
                    } else {
                        c cVar = this.f19031d;
                        c.C0378b g10 = c.C0378b.g();
                        g10.i(cVar);
                        g10.i(l11);
                        this.f19031d = g10.h();
                    }
                    this.f19029b |= 2;
                }
                f(d().b(bVar.f19023a));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void j(Td.d dVar, Td.f fVar) throws IOException {
                b bVar = null;
                try {
                    try {
                        ((C0375a) b.f19022h).getClass();
                        i(new b(dVar, fVar));
                    } catch (Td.j e11) {
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
            public final /* bridge */ /* synthetic */ p.a q1(Td.d dVar, Td.f fVar) throws IOException {
                j(dVar, fVar);
                return this;
            }
        }

        static {
            b bVar = new b();
            f19021g = bVar;
            bVar.f19025c = 0;
            bVar.f19026d = c.F();
        }

        b(C0376b c0376b) {
            this.f19027e = (byte) -1;
            this.f19028f = -1;
            this.f19023a = c0376b.d();
        }

        public static b i() {
            return f19021g;
        }

        @Override // Td.p
        public final void a(Td.e eVar) throws IOException {
            getSerializedSize();
            if ((this.f19024b & 1) == 1) {
                eVar.m(1, this.f19025c);
            }
            if ((this.f19024b & 2) == 2) {
                eVar.o(2, this.f19026d);
            }
            eVar.r(this.f19023a);
        }

        @Override // Td.p
        public final int getSerializedSize() {
            int i11 = this.f19028f;
            if (i11 != -1) {
                return i11;
            }
            int b11 = (this.f19024b & 1) == 1 ? Td.e.b(1, this.f19025c) : 0;
            if ((this.f19024b & 2) == 2) {
                b11 += Td.e.d(2, this.f19026d);
            }
            int size = this.f19023a.size() + b11;
            this.f19028f = size;
            return size;
        }

        @Override // Td.q
        public final boolean isInitialized() {
            byte b11 = this.f19027e;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!m()) {
                this.f19027e = (byte) 0;
                return false;
            }
            if (!n()) {
                this.f19027e = (byte) 0;
                return false;
            }
            if (this.f19026d.isInitialized()) {
                this.f19027e = (byte) 1;
                return true;
            }
            this.f19027e = (byte) 0;
            return false;
        }

        public final int j() {
            return this.f19025c;
        }

        public final c l() {
            return this.f19026d;
        }

        public final boolean m() {
            return (this.f19024b & 1) == 1;
        }

        public final boolean n() {
            return (this.f19024b & 2) == 2;
        }

        @Override // Td.p
        public final p.a newBuilderForType() {
            return C0376b.g();
        }

        @Override // Td.p
        public final p.a toBuilder() {
            C0376b g10 = C0376b.g();
            g10.i(this);
            return g10;
        }

        public static final class c extends Td.h implements Td.q {

            /* renamed from: p, reason: collision with root package name */
            private static final c f19032p;

            /* renamed from: q, reason: collision with root package name */
            public static Td.r<c> f19033q = new C0377a();

            /* renamed from: a, reason: collision with root package name */
            private final Td.c f19034a;

            /* renamed from: b, reason: collision with root package name */
            private int f19035b;

            /* renamed from: c, reason: collision with root package name */
            private EnumC0379c f19036c;

            /* renamed from: d, reason: collision with root package name */
            private long f19037d;

            /* renamed from: e, reason: collision with root package name */
            private float f19038e;

            /* renamed from: f, reason: collision with root package name */
            private double f19039f;

            /* renamed from: g, reason: collision with root package name */
            private int f19040g;

            /* renamed from: h, reason: collision with root package name */
            private int f19041h;

            /* renamed from: i, reason: collision with root package name */
            private int f19042i;

            /* renamed from: j, reason: collision with root package name */
            private a f19043j;

            /* renamed from: k, reason: collision with root package name */
            private List<c> f19044k;

            /* renamed from: l, reason: collision with root package name */
            private int f19045l;

            /* renamed from: m, reason: collision with root package name */
            private int f19046m;

            /* renamed from: n, reason: collision with root package name */
            private byte f19047n;

            /* renamed from: o, reason: collision with root package name */
            private int f19048o;

            /* renamed from: Nd.a$b$c$a, reason: collision with other inner class name */
            static class C0377a extends Td.b<c> {
                @Override // Td.r
                public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
                    return new c(dVar, fVar);
                }
            }

            /* renamed from: Nd.a$b$c$b, reason: collision with other inner class name */
            public static final class C0378b extends h.b<c, C0378b> implements Td.q {

                /* renamed from: b, reason: collision with root package name */
                private int f19049b;

                /* renamed from: d, reason: collision with root package name */
                private long f19051d;

                /* renamed from: e, reason: collision with root package name */
                private float f19052e;

                /* renamed from: f, reason: collision with root package name */
                private double f19053f;

                /* renamed from: g, reason: collision with root package name */
                private int f19054g;

                /* renamed from: h, reason: collision with root package name */
                private int f19055h;

                /* renamed from: i, reason: collision with root package name */
                private int f19056i;

                /* renamed from: l, reason: collision with root package name */
                private int f19059l;

                /* renamed from: m, reason: collision with root package name */
                private int f19060m;

                /* renamed from: c, reason: collision with root package name */
                private EnumC0379c f19050c = EnumC0379c.BYTE;

                /* renamed from: j, reason: collision with root package name */
                private a f19057j = a.m();

                /* renamed from: k, reason: collision with root package name */
                private List<c> f19058k = Collections.EMPTY_LIST;

                private C0378b() {
                }

                static C0378b g() {
                    return new C0378b();
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
                public final C0378b clone() {
                    C0378b c0378b = new C0378b();
                    c0378b.i(h());
                    return c0378b;
                }

                @Override // Td.h.b
                public final Object clone() throws CloneNotSupportedException {
                    C0378b c0378b = new C0378b();
                    c0378b.i(h());
                    return c0378b;
                }

                @Override // Td.h.b
                public final /* bridge */ /* synthetic */ C0378b e(c cVar) {
                    i(cVar);
                    return this;
                }

                public final c h() {
                    c cVar = new c(this);
                    int i11 = this.f19049b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    cVar.f19036c = this.f19050c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    cVar.f19037d = this.f19051d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    cVar.f19038e = this.f19052e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    cVar.f19039f = this.f19053f;
                    if ((i11 & 16) == 16) {
                        i12 |= 16;
                    }
                    cVar.f19040g = this.f19054g;
                    if ((i11 & 32) == 32) {
                        i12 |= 32;
                    }
                    cVar.f19041h = this.f19055h;
                    if ((i11 & 64) == 64) {
                        i12 |= 64;
                    }
                    cVar.f19042i = this.f19056i;
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    cVar.f19043j = this.f19057j;
                    if ((this.f19049b & 256) == 256) {
                        this.f19058k = Collections.unmodifiableList(this.f19058k);
                        this.f19049b &= -257;
                    }
                    cVar.f19044k = this.f19058k;
                    if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        i12 |= 256;
                    }
                    cVar.f19045l = this.f19059l;
                    if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                        i12 |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    cVar.f19046m = this.f19060m;
                    cVar.f19035b = i12;
                    return cVar;
                }

                public final void i(c cVar) {
                    if (cVar == c.F()) {
                        return;
                    }
                    if (cVar.W()) {
                        EnumC0379c M11 = cVar.M();
                        M11.getClass();
                        this.f19049b |= 1;
                        this.f19050c = M11;
                    }
                    if (cVar.U()) {
                        long K11 = cVar.K();
                        this.f19049b |= 2;
                        this.f19051d = K11;
                    }
                    if (cVar.T()) {
                        float J11 = cVar.J();
                        this.f19049b |= 4;
                        this.f19052e = J11;
                    }
                    if (cVar.Q()) {
                        double G11 = cVar.G();
                        this.f19049b |= 8;
                        this.f19053f = G11;
                    }
                    if (cVar.V()) {
                        int L11 = cVar.L();
                        this.f19049b |= 16;
                        this.f19054g = L11;
                    }
                    if (cVar.P()) {
                        int E11 = cVar.E();
                        this.f19049b |= 32;
                        this.f19055h = E11;
                    }
                    if (cVar.R()) {
                        int H11 = cVar.H();
                        this.f19049b |= 64;
                        this.f19056i = H11;
                    }
                    if (cVar.N()) {
                        a A11 = cVar.A();
                        if ((this.f19049b & UserVerificationMethods.USER_VERIFY_PATTERN) != 128 || this.f19057j == a.m()) {
                            this.f19057j = A11;
                        } else {
                            a aVar = this.f19057j;
                            c g10 = c.g();
                            g10.i(aVar);
                            g10.i(A11);
                            this.f19057j = g10.h();
                        }
                        this.f19049b |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    if (!cVar.f19044k.isEmpty()) {
                        if (this.f19058k.isEmpty()) {
                            this.f19058k = cVar.f19044k;
                            this.f19049b &= -257;
                        } else {
                            if ((this.f19049b & 256) != 256) {
                                this.f19058k = new ArrayList(this.f19058k);
                                this.f19049b |= 256;
                            }
                            this.f19058k.addAll(cVar.f19044k);
                        }
                    }
                    if (cVar.O()) {
                        int B11 = cVar.B();
                        this.f19049b |= UserVerificationMethods.USER_VERIFY_NONE;
                        this.f19059l = B11;
                    }
                    if (cVar.S()) {
                        int I11 = cVar.I();
                        this.f19049b |= UserVerificationMethods.USER_VERIFY_ALL;
                        this.f19060m = I11;
                    }
                    f(d().b(cVar.f19034a));
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void j(Td.d dVar, Td.f fVar) throws IOException {
                    c cVar = null;
                    try {
                        try {
                            ((C0377a) c.f19033q).getClass();
                            i(new c(dVar, fVar));
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

            /* renamed from: Nd.a$b$c$c, reason: collision with other inner class name */
            public enum EnumC0379c implements i.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);

                private static i.b<EnumC0379c> internalValueMap = new C0380a();
                private final int value;

                /* renamed from: Nd.a$b$c$c$a, reason: collision with other inner class name */
                static class C0380a implements i.b<EnumC0379c> {
                }

                EnumC0379c(int i11) {
                    this.value = i11;
                }

                public static EnumC0379c a(int i11) {
                    switch (i11) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // Td.i.a
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                c cVar = new c();
                f19032p = cVar;
                cVar.X();
            }

            c(C0378b c0378b) {
                this.f19047n = (byte) -1;
                this.f19048o = -1;
                this.f19034a = c0378b.d();
            }

            public static c F() {
                return f19032p;
            }

            private void X() {
                this.f19036c = EnumC0379c.BYTE;
                this.f19037d = 0L;
                this.f19038e = 0.0f;
                this.f19039f = 0.0d;
                this.f19040g = 0;
                this.f19041h = 0;
                this.f19042i = 0;
                this.f19043j = a.m();
                this.f19044k = Collections.EMPTY_LIST;
                this.f19045l = 0;
                this.f19046m = 0;
            }

            public final a A() {
                return this.f19043j;
            }

            public final int B() {
                return this.f19045l;
            }

            public final c C(int i11) {
                return this.f19044k.get(i11);
            }

            public final List<c> D() {
                return this.f19044k;
            }

            public final int E() {
                return this.f19041h;
            }

            public final double G() {
                return this.f19039f;
            }

            public final int H() {
                return this.f19042i;
            }

            public final int I() {
                return this.f19046m;
            }

            public final float J() {
                return this.f19038e;
            }

            public final long K() {
                return this.f19037d;
            }

            public final int L() {
                return this.f19040g;
            }

            public final EnumC0379c M() {
                return this.f19036c;
            }

            public final boolean N() {
                return (this.f19035b & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
            }

            public final boolean O() {
                return (this.f19035b & 256) == 256;
            }

            public final boolean P() {
                return (this.f19035b & 32) == 32;
            }

            public final boolean Q() {
                return (this.f19035b & 8) == 8;
            }

            public final boolean R() {
                return (this.f19035b & 64) == 64;
            }

            public final boolean S() {
                return (this.f19035b & UserVerificationMethods.USER_VERIFY_NONE) == 512;
            }

            public final boolean T() {
                return (this.f19035b & 4) == 4;
            }

            public final boolean U() {
                return (this.f19035b & 2) == 2;
            }

            public final boolean V() {
                return (this.f19035b & 16) == 16;
            }

            public final boolean W() {
                return (this.f19035b & 1) == 1;
            }

            @Override // Td.p
            public final void a(Td.e eVar) throws IOException {
                getSerializedSize();
                if ((this.f19035b & 1) == 1) {
                    eVar.l(1, this.f19036c.getNumber());
                }
                if ((this.f19035b & 2) == 2) {
                    long j11 = this.f19037d;
                    eVar.x(2, 0);
                    eVar.w((j11 >> 63) ^ (j11 << 1));
                }
                if ((this.f19035b & 4) == 4) {
                    float f7 = this.f19038e;
                    eVar.x(3, 5);
                    eVar.t(Float.floatToRawIntBits(f7));
                }
                if ((this.f19035b & 8) == 8) {
                    double d11 = this.f19039f;
                    eVar.x(4, 1);
                    eVar.u(Double.doubleToRawLongBits(d11));
                }
                if ((this.f19035b & 16) == 16) {
                    eVar.m(5, this.f19040g);
                }
                if ((this.f19035b & 32) == 32) {
                    eVar.m(6, this.f19041h);
                }
                if ((this.f19035b & 64) == 64) {
                    eVar.m(7, this.f19042i);
                }
                if ((this.f19035b & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    eVar.o(8, this.f19043j);
                }
                for (int i11 = 0; i11 < this.f19044k.size(); i11++) {
                    eVar.o(9, this.f19044k.get(i11));
                }
                if ((this.f19035b & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    eVar.m(10, this.f19046m);
                }
                if ((this.f19035b & 256) == 256) {
                    eVar.m(11, this.f19045l);
                }
                eVar.r(this.f19034a);
            }

            @Override // Td.p
            public final int getSerializedSize() {
                int i11 = this.f19048o;
                if (i11 != -1) {
                    return i11;
                }
                int a11 = (this.f19035b & 1) == 1 ? Td.e.a(1, this.f19036c.getNumber()) : 0;
                if ((this.f19035b & 2) == 2) {
                    long j11 = this.f19037d;
                    a11 += Td.e.g((j11 >> 63) ^ (j11 << 1)) + Td.e.h(2);
                }
                if ((this.f19035b & 4) == 4) {
                    a11 += Td.e.h(3) + 4;
                }
                if ((this.f19035b & 8) == 8) {
                    a11 += Td.e.h(4) + 8;
                }
                if ((this.f19035b & 16) == 16) {
                    a11 += Td.e.b(5, this.f19040g);
                }
                if ((this.f19035b & 32) == 32) {
                    a11 += Td.e.b(6, this.f19041h);
                }
                if ((this.f19035b & 64) == 64) {
                    a11 += Td.e.b(7, this.f19042i);
                }
                if ((this.f19035b & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    a11 += Td.e.d(8, this.f19043j);
                }
                for (int i12 = 0; i12 < this.f19044k.size(); i12++) {
                    a11 += Td.e.d(9, this.f19044k.get(i12));
                }
                if ((this.f19035b & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    a11 += Td.e.b(10, this.f19046m);
                }
                if ((this.f19035b & 256) == 256) {
                    a11 += Td.e.b(11, this.f19045l);
                }
                int size = this.f19034a.size() + a11;
                this.f19048o = size;
                return size;
            }

            @Override // Td.q
            public final boolean isInitialized() {
                byte b11 = this.f19047n;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (N() && !this.f19043j.isInitialized()) {
                    this.f19047n = (byte) 0;
                    return false;
                }
                for (int i11 = 0; i11 < this.f19044k.size(); i11++) {
                    if (!C(i11).isInitialized()) {
                        this.f19047n = (byte) 0;
                        return false;
                    }
                }
                this.f19047n = (byte) 1;
                return true;
            }

            @Override // Td.p
            public final p.a newBuilderForType() {
                return C0378b.g();
            }

            @Override // Td.p
            public final p.a toBuilder() {
                C0378b g10 = C0378b.g();
                g10.i(this);
                return g10;
            }

            private c() {
                this.f19047n = (byte) -1;
                this.f19048o = -1;
                this.f19034a = Td.c.f27045a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            c(Td.d dVar, Td.f fVar) throws Td.j {
                c cVar;
                this.f19047n = (byte) -1;
                this.f19048o = -1;
                X();
                c.b m11 = Td.c.m();
                Td.e j11 = Td.e.j(m11, 1);
                boolean z11 = false;
                char c11 = 0;
                while (true) {
                    ?? r52 = 256;
                    if (!z11) {
                        try {
                            try {
                                int r11 = dVar.r();
                                switch (r11) {
                                    case 0:
                                        z11 = true;
                                    case 8:
                                        int n11 = dVar.n();
                                        EnumC0379c a11 = EnumC0379c.a(n11);
                                        if (a11 == null) {
                                            j11.v(r11);
                                            j11.v(n11);
                                        } else {
                                            this.f19035b |= 1;
                                            this.f19036c = a11;
                                        }
                                    case 16:
                                        this.f19035b |= 2;
                                        long o11 = dVar.o();
                                        this.f19037d = (-(o11 & 1)) ^ (o11 >>> 1);
                                    case 29:
                                        this.f19035b |= 4;
                                        this.f19038e = Float.intBitsToFloat(dVar.l());
                                    case 33:
                                        this.f19035b |= 8;
                                        this.f19039f = Double.longBitsToDouble(dVar.m());
                                    case 40:
                                        this.f19035b |= 16;
                                        this.f19040g = dVar.n();
                                    case 48:
                                        this.f19035b |= 32;
                                        this.f19041h = dVar.n();
                                    case 56:
                                        this.f19035b |= 64;
                                        this.f19042i = dVar.n();
                                    case 66:
                                        if ((this.f19035b & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                            a aVar = this.f19043j;
                                            aVar.getClass();
                                            cVar = c.g();
                                            cVar.i(aVar);
                                        } else {
                                            cVar = null;
                                        }
                                        a aVar2 = (a) dVar.i(a.f19014h, fVar);
                                        this.f19043j = aVar2;
                                        if (cVar != null) {
                                            cVar.i(aVar2);
                                            this.f19043j = cVar.h();
                                        }
                                        this.f19035b |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                    case 74:
                                        if ((c11 & 256) != 256) {
                                            this.f19044k = new ArrayList();
                                            c11 = 256;
                                        }
                                        this.f19044k.add(dVar.i(f19033q, fVar));
                                    case 80:
                                        this.f19035b |= UserVerificationMethods.USER_VERIFY_NONE;
                                        this.f19046m = dVar.n();
                                    case 88:
                                        this.f19035b |= 256;
                                        this.f19045l = dVar.n();
                                    default:
                                        r52 = dVar.u(r11, j11);
                                        if (r52 == 0) {
                                            z11 = true;
                                        }
                                }
                            } catch (Td.j e11) {
                                e11.b(this);
                                throw e11;
                            } catch (IOException e12) {
                                Td.j jVar = new Td.j(e12.getMessage());
                                jVar.b(this);
                                throw jVar;
                            }
                        } catch (Throwable th2) {
                            if ((c11 & 256) == r52) {
                                this.f19044k = Collections.unmodifiableList(this.f19044k);
                            }
                            try {
                                j11.i();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            throw th2;
                        }
                    } else {
                        if ((c11 & 256) == 256) {
                            this.f19044k = Collections.unmodifiableList(this.f19044k);
                        }
                        try {
                            j11.i();
                            return;
                        } catch (IOException unused2) {
                            return;
                        } finally {
                            this.f19034a = m11.j();
                        }
                    }
                }
            }
        }

        private b() {
            this.f19027e = (byte) -1;
            this.f19028f = -1;
            this.f19023a = Td.c.f27045a;
        }

        b(Td.d dVar, Td.f fVar) throws Td.j {
            c.C0378b c0378b;
            this.f19027e = (byte) -1;
            this.f19028f = -1;
            boolean z11 = false;
            this.f19025c = 0;
            this.f19026d = c.F();
            c.b m11 = Td.c.m();
            Td.e j11 = Td.e.j(m11, 1);
            while (!z11) {
                try {
                    try {
                        int r11 = dVar.r();
                        if (r11 != 0) {
                            if (r11 == 8) {
                                this.f19024b |= 1;
                                this.f19025c = dVar.n();
                            } else if (r11 != 18) {
                                if (!dVar.u(r11, j11)) {
                                }
                            } else {
                                if ((this.f19024b & 2) == 2) {
                                    c cVar = this.f19026d;
                                    cVar.getClass();
                                    c0378b = c.C0378b.g();
                                    c0378b.i(cVar);
                                } else {
                                    c0378b = null;
                                }
                                c cVar2 = (c) dVar.i(c.f19033q, fVar);
                                this.f19026d = cVar2;
                                if (c0378b != null) {
                                    c0378b.i(cVar2);
                                    this.f19026d = c0378b.h();
                                }
                                this.f19024b |= 2;
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
                } catch (Td.j e11) {
                    e11.b(this);
                    throw e11;
                } catch (IOException e12) {
                    Td.j jVar = new Td.j(e12.getMessage());
                    jVar.b(this);
                    throw jVar;
                }
            }
            try {
                j11.i();
            } catch (IOException unused2) {
            } finally {
                this.f19023a = m11.j();
            }
        }
    }

    private a() {
        this.f19019e = (byte) -1;
        this.f19020f = -1;
        this.f19015a = Td.c.f27045a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    a(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19019e = (byte) -1;
        this.f19020f = -1;
        boolean z11 = false;
        this.f19017c = 0;
        this.f19018d = Collections.EMPTY_LIST;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        char c11 = 0;
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 == 8) {
                            this.f19016b |= 1;
                            this.f19017c = dVar.n();
                        } else if (r11 != 18) {
                            if (!dVar.u(r11, j11)) {
                            }
                        } else {
                            if ((c11 & 2) != 2) {
                                this.f19018d = new ArrayList();
                                c11 = 2;
                            }
                            this.f19018d.add(dVar.i(b.f19022h, fVar));
                        }
                    }
                    z11 = true;
                } catch (Throwable th2) {
                    if ((c11 & 2) == 2) {
                        this.f19018d = Collections.unmodifiableList(this.f19018d);
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
        if ((c11 & 2) == 2) {
            this.f19018d = Collections.unmodifiableList(this.f19018d);
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } finally {
            this.f19015a = m11.j();
        }
    }
}
