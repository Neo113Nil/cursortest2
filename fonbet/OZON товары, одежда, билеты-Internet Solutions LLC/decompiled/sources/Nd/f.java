package Nd;

import Td.AbstractC4045a;
import Td.c;
import Td.h;
import Td.p;
import androidx.recyclerview.widget.m;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f extends h.d<f> {

    /* renamed from: g, reason: collision with root package name */
    private static final f f19161g;

    /* renamed from: h, reason: collision with root package name */
    public static Td.r<f> f19162h = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Td.c f19163b;

    /* renamed from: c, reason: collision with root package name */
    private int f19164c;

    /* renamed from: d, reason: collision with root package name */
    private int f19165d;

    /* renamed from: e, reason: collision with root package name */
    private byte f19166e;

    /* renamed from: f, reason: collision with root package name */
    private int f19167f;

    static class a extends Td.b<f> {
        @Override // Td.r
        public final Object a(Td.d dVar, Td.f fVar) throws Td.j {
            return new f(dVar, fVar);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends h.c<f, b> {

        /* renamed from: d, reason: collision with root package name */
        private int f19168d;

        /* renamed from: e, reason: collision with root package name */
        private int f19169e;

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
            f fVar = new f(this);
            int i11 = (this.f19168d & 1) != 1 ? 0 : 1;
            fVar.f19165d = this.f19169e;
            fVar.f19164c = i11;
            if (fVar.isInitialized()) {
                return fVar;
            }
            throw new Td.v();
        }

        @Override // Td.h.b
        public final /* bridge */ /* synthetic */ h.b e(Td.h hVar) {
            k((f) hVar);
            return this;
        }

        @Override // Td.h.b
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final b clone() {
            b bVar = new b();
            f fVar = new f(this);
            int i11 = (this.f19168d & 1) != 1 ? 0 : 1;
            fVar.f19165d = this.f19169e;
            fVar.f19164c = i11;
            bVar.k(fVar);
            return bVar;
        }

        public final void k(f fVar) {
            if (fVar == f.A()) {
                return;
            }
            if (fVar.C()) {
                int B11 = fVar.B();
                this.f19168d |= 1;
                this.f19169e = B11;
            }
            h(fVar);
            f(d().b(fVar.f19163b));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(Td.d dVar, Td.f fVar) throws IOException {
            f fVar2 = null;
            try {
                try {
                    ((a) f.f19162h).getClass();
                    k(new f(dVar, fVar));
                } catch (Td.j e11) {
                    f fVar3 = (f) e11.a();
                    try {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        fVar2 = fVar3;
                        if (fVar2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (fVar2 != null) {
                    k(fVar2);
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
        f fVar = new f(0);
        f19161g = fVar;
        fVar.f19165d = 0;
    }

    private f() {
        throw null;
    }

    f(b bVar) {
        super(bVar);
        this.f19166e = (byte) -1;
        this.f19167f = -1;
        this.f19163b = bVar.d();
    }

    public static f A() {
        return f19161g;
    }

    public final int B() {
        return this.f19165d;
    }

    public final boolean C() {
        return (this.f19164c & 1) == 1;
    }

    @Override // Td.p
    public final void a(Td.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a n11 = n();
        if ((this.f19164c & 1) == 1) {
            eVar.m(1, this.f19165d);
        }
        n11.a(m.e.DEFAULT_DRAG_ANIMATION_DURATION, eVar);
        eVar.r(this.f19163b);
    }

    @Override // Td.q
    public final Td.p getDefaultInstanceForType() {
        return f19161g;
    }

    @Override // Td.p
    public final int getSerializedSize() {
        int i11 = this.f19167f;
        if (i11 != -1) {
            return i11;
        }
        int size = this.f19163b.size() + ((this.f19164c & 1) == 1 ? Td.e.b(1, this.f19165d) : 0) + g();
        this.f19167f = size;
        return size;
    }

    @Override // Td.q
    public final boolean isInitialized() {
        byte b11 = this.f19166e;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        if (f()) {
            this.f19166e = (byte) 1;
            return true;
        }
        this.f19166e = (byte) 0;
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

    private f(int i11) {
        this.f19166e = (byte) -1;
        this.f19167f = -1;
        this.f19163b = Td.c.f27045a;
    }

    f(Td.d dVar, Td.f fVar) throws Td.j {
        this.f19166e = (byte) -1;
        this.f19167f = -1;
        boolean z11 = false;
        this.f19165d = 0;
        c.b m11 = Td.c.m();
        Td.e j11 = Td.e.j(m11, 1);
        while (!z11) {
            try {
                try {
                    int r11 = dVar.r();
                    if (r11 != 0) {
                        if (r11 != 8) {
                            if (!p(dVar, j11, fVar, r11)) {
                            }
                        } else {
                            this.f19164c |= 1;
                            this.f19165d = dVar.n();
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
                    this.f19163b = m11.j();
                    throw th3;
                }
                this.f19163b = m11.j();
                m();
                throw th2;
            }
        }
        try {
            j11.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19163b = m11.j();
            throw th4;
        }
        this.f19163b = m11.j();
        m();
    }
}
