package T3;

import N3.C3659j;
import N3.E;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.q;
import N3.r;
import androidx.recyclerview.widget.m;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class c implements InterfaceC3665p {

    /* renamed from: f, reason: collision with root package name */
    private r f26578f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26580h;

    /* renamed from: i, reason: collision with root package name */
    private long f26581i;

    /* renamed from: j, reason: collision with root package name */
    private int f26582j;

    /* renamed from: k, reason: collision with root package name */
    private int f26583k;

    /* renamed from: l, reason: collision with root package name */
    private int f26584l;

    /* renamed from: m, reason: collision with root package name */
    private long f26585m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26586n;

    /* renamed from: o, reason: collision with root package name */
    private a f26587o;

    /* renamed from: p, reason: collision with root package name */
    private f f26588p;

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f26573a = new C8050C(4);

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f26574b = new C8050C(9);

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f26575c = new C8050C(11);

    /* renamed from: d, reason: collision with root package name */
    private final C8050C f26576d = new C8050C();

    /* renamed from: e, reason: collision with root package name */
    private final d f26577e = new d();

    /* renamed from: g, reason: collision with root package name */
    private int f26579g = 1;

    private C8050C g(C3659j c3659j) throws IOException {
        int i11 = this.f26584l;
        C8050C c8050c = this.f26576d;
        if (i11 > c8050c.b()) {
            c8050c.P(0, new byte[Math.max(c8050c.b() * 2, this.f26584l)]);
        } else {
            c8050c.R(0);
        }
        c8050c.Q(this.f26584l);
        c3659j.b(c8050c.e(), 0, this.f26584l, false);
        return c8050c;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        if (j11 == 0) {
            this.f26579g = 1;
            this.f26580h = false;
        } else {
            this.f26579g = 3;
        }
        this.f26582j = 0;
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f26578f = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C8050C c8050c = this.f26573a;
        C3659j c3659j = (C3659j) qVar;
        c3659j.d(c8050c.e(), 0, 3, false);
        c8050c.R(0);
        if (c8050c.H() == 4607062) {
            c3659j.d(c8050c.e(), 0, 2, false);
            c8050c.R(0);
            if ((c8050c.L() & m.e.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                c3659j.d(c8050c.e(), 0, 4, false);
                c8050c.R(0);
                int p11 = c8050c.p();
                c3659j.e();
                c3659j.i(p11, false);
                c3659j.d(c8050c.e(), 0, 4, false);
                c8050c.R(0);
                if (c8050c.p() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0005 A[SYNTHETIC] */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(q qVar, G g10) throws IOException {
        boolean z11;
        boolean z12;
        G10.a.i(this.f26578f);
        while (true) {
            int i11 = this.f26579g;
            if (i11 == 1) {
                C8050C c8050c = this.f26574b;
                if (!((C3659j) qVar).b(c8050c.e(), 0, 9, true)) {
                    return -1;
                }
                c8050c.R(0);
                c8050c.S(4);
                int E11 = c8050c.E();
                boolean z13 = (E11 & 4) != 0;
                boolean z14 = (E11 & 1) != 0;
                if (z13 && this.f26587o == null) {
                    this.f26587o = new a(this.f26578f.track(8, 1));
                }
                if (z14 && this.f26588p == null) {
                    this.f26588p = new f(this.f26578f.track(9, 2));
                }
                this.f26578f.endTracks();
                this.f26582j = c8050c.p() - 5;
                this.f26579g = 2;
            } else if (i11 == 2) {
                ((C3659j) qVar).m(this.f26582j, false);
                this.f26582j = 0;
                this.f26579g = 3;
            } else if (i11 == 3) {
                C8050C c8050c2 = this.f26575c;
                if (!((C3659j) qVar).b(c8050c2.e(), 0, 11, true)) {
                    return -1;
                }
                c8050c2.R(0);
                this.f26583k = c8050c2.E();
                this.f26584l = c8050c2.H();
                this.f26585m = c8050c2.H();
                this.f26585m = ((c8050c2.E() << 24) | this.f26585m) * 1000;
                c8050c2.S(3);
                this.f26579g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.f26580h;
                d dVar = this.f26577e;
                long j11 = z15 ? this.f26581i + this.f26585m : dVar.a() == -9223372036854775807L ? 0L : this.f26585m;
                int i12 = this.f26583k;
                if (i12 != 8 || this.f26587o == null) {
                    if (i12 == 9 && this.f26588p != null) {
                        if (!this.f26586n) {
                            this.f26578f.seekMap(new H.b(-9223372036854775807L));
                            this.f26586n = true;
                        }
                        f fVar = this.f26588p;
                        C8050C g11 = g((C3659j) qVar);
                        if (fVar.a(g11) && fVar.b(j11, g11)) {
                            z11 = true;
                        }
                    } else if (i12 != 18 || this.f26586n) {
                        ((C3659j) qVar).m(this.f26584l, false);
                        z11 = false;
                        z12 = false;
                        if (!this.f26580h && z11) {
                            this.f26580h = true;
                            this.f26581i = dVar.a() != -9223372036854775807L ? -this.f26585m : 0L;
                        }
                        this.f26582j = 4;
                        this.f26579g = 2;
                        if (!z12) {
                            return 0;
                        }
                    } else {
                        C8050C g12 = g((C3659j) qVar);
                        dVar.getClass();
                        dVar.d(j11, g12);
                        long a11 = dVar.a();
                        if (a11 != -9223372036854775807L) {
                            this.f26578f.seekMap(new E(a11, dVar.b(), dVar.c()));
                            this.f26586n = true;
                        }
                    }
                    z11 = false;
                } else {
                    if (!this.f26586n) {
                        this.f26578f.seekMap(new H.b(-9223372036854775807L));
                        this.f26586n = true;
                    }
                    a aVar = this.f26587o;
                    C8050C g13 = g((C3659j) qVar);
                    aVar.a(g13);
                    z11 = aVar.b(j11, g13);
                }
                z12 = true;
                if (!this.f26580h) {
                    this.f26580h = true;
                    this.f26581i = dVar.a() != -9223372036854775807L ? -this.f26585m : 0L;
                }
                this.f26582j = 4;
                this.f26579g = 2;
                if (!z12) {
                }
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
