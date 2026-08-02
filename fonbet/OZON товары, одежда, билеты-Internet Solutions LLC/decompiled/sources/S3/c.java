package S3;

import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import N3.v;
import N3.w;
import N3.x;
import N3.y;
import j3.C7272n;
import j3.t;
import java.io.IOException;
import m3.C8050C;
import m3.N;

/* loaded from: classes.dex */
public final class c implements InterfaceC3665p {

    /* renamed from: e, reason: collision with root package name */
    private r f25745e;

    /* renamed from: f, reason: collision with root package name */
    private M f25746f;

    /* renamed from: h, reason: collision with root package name */
    private t f25748h;

    /* renamed from: i, reason: collision with root package name */
    private y f25749i;

    /* renamed from: j, reason: collision with root package name */
    private int f25750j;

    /* renamed from: k, reason: collision with root package name */
    private int f25751k;

    /* renamed from: l, reason: collision with root package name */
    private a f25752l;

    /* renamed from: m, reason: collision with root package name */
    private int f25753m;

    /* renamed from: n, reason: collision with root package name */
    private long f25754n;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25741a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f25742b = new C8050C(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25743c = false;

    /* renamed from: d, reason: collision with root package name */
    private final v.a f25744d = new v.a();

    /* renamed from: g, reason: collision with root package name */
    private int f25747g = 0;

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        if (j11 == 0) {
            this.f25747g = 0;
        } else {
            a aVar = this.f25752l;
            if (aVar != null) {
                aVar.e(j12);
            }
        }
        this.f25754n = j12 != 0 ? -1L : 0L;
        this.f25753m = 0;
        this.f25742b.O(0);
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f25745e = rVar;
        this.f25746f = rVar.track(0, 1);
        rVar.endTracks();
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C3659j c3659j = (C3659j) qVar;
        w.c(c3659j, false);
        return w.a(c3659j);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        H bVar;
        boolean z11;
        long j11;
        boolean z12;
        int i11 = this.f25747g;
        if (i11 == 0) {
            this.f25748h = w.d((C3659j) qVar, !this.f25743c);
            this.f25747g = 1;
            return 0;
        }
        byte[] bArr = this.f25741a;
        if (i11 == 1) {
            ((C3659j) qVar).d(bArr, 0, bArr.length, false);
            ((C3659j) qVar).e();
            this.f25747g = 2;
            return 0;
        }
        if (i11 == 2) {
            w.g((C3659j) qVar);
            this.f25747g = 3;
            return 0;
        }
        if (i11 == 3) {
            w.a aVar = new w.a(this.f25749i);
            boolean z13 = false;
            while (!z13) {
                z13 = w.e((C3659j) qVar, aVar);
                y yVar = aVar.f18650a;
                int i12 = N.f74289a;
                this.f25749i = yVar;
            }
            this.f25749i.getClass();
            this.f25750j = Math.max(this.f25749i.f18655c, 6);
            C7272n f7 = this.f25749i.f(bArr, this.f25748h);
            M m11 = this.f25746f;
            C7272n.a a11 = f7.a();
            a11.W("audio/flac");
            m11.a(a11.P());
            M m12 = this.f25746f;
            this.f25749i.e();
            m12.getClass();
            this.f25747g = 4;
            return 0;
        }
        if (i11 == 4) {
            C3659j c3659j = (C3659j) qVar;
            this.f25751k = w.b(c3659j);
            r rVar = this.f25745e;
            int i13 = N.f74289a;
            long position = c3659j.getPosition();
            long length = c3659j.getLength();
            this.f25749i.getClass();
            y yVar2 = this.f25749i;
            y.a aVar2 = yVar2.f18663k;
            if (aVar2 != null && aVar2.f18665a.length > 0) {
                bVar = new x(yVar2, position);
            } else if (length == -1 || yVar2.f18662j <= 0) {
                bVar = new H.b(yVar2.e());
            } else {
                a aVar3 = new a(yVar2, this.f25751k, position, length);
                this.f25752l = aVar3;
                bVar = aVar3.a();
            }
            rVar.seekMap(bVar);
            this.f25747g = 5;
            return 0;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f25746f.getClass();
        this.f25749i.getClass();
        a aVar4 = this.f25752l;
        if (aVar4 != null && aVar4.c()) {
            return this.f25752l.b((C3659j) qVar, g10);
        }
        if (this.f25754n == -1) {
            this.f25754n = v.b((C3659j) qVar, this.f25749i);
            return 0;
        }
        C8050C c8050c = this.f25742b;
        int i14 = c8050c.i();
        if (i14 < 32768) {
            int read = ((C3659j) qVar).read(c8050c.e(), i14, 32768 - i14);
            z11 = read == -1;
            if (!z11) {
                c8050c.Q(i14 + read);
            } else if (c8050c.a() == 0) {
                long j12 = this.f25754n * 1000000;
                y yVar3 = this.f25749i;
                int i15 = N.f74289a;
                this.f25746f.b(j12 / yVar3.f18657e, 1, this.f25753m, 0, null);
                return -1;
            }
        } else {
            z11 = false;
        }
        int f11 = c8050c.f();
        int i16 = this.f25753m;
        int i17 = this.f25750j;
        if (i16 < i17) {
            c8050c.S(Math.min(i17 - i16, c8050c.a()));
        }
        this.f25749i.getClass();
        int f12 = c8050c.f();
        while (true) {
            int i18 = c8050c.i() - 16;
            v.a aVar5 = this.f25744d;
            if (f12 <= i18) {
                c8050c.R(f12);
                if (v.a(c8050c, this.f25749i, this.f25751k, aVar5)) {
                    c8050c.R(f12);
                    j11 = aVar5.f18649a;
                    break;
                }
                f12++;
            } else {
                if (z11) {
                    while (f12 <= c8050c.i() - this.f25750j) {
                        c8050c.R(f12);
                        try {
                            z12 = v.a(c8050c, this.f25749i, this.f25751k, aVar5);
                        } catch (IndexOutOfBoundsException unused) {
                            z12 = false;
                        }
                        if (c8050c.f() > c8050c.i()) {
                            z12 = false;
                        }
                        if (z12) {
                            c8050c.R(f12);
                            j11 = aVar5.f18649a;
                            break;
                        }
                        f12++;
                    }
                    c8050c.R(c8050c.i());
                } else {
                    c8050c.R(f12);
                }
                j11 = -1;
            }
        }
        int f13 = c8050c.f() - f11;
        c8050c.R(f11);
        this.f25746f.e(f13, c8050c);
        int i19 = this.f25753m + f13;
        this.f25753m = i19;
        if (j11 != -1) {
            long j13 = this.f25754n * 1000000;
            y yVar4 = this.f25749i;
            int i21 = N.f74289a;
            this.f25746f.b(j13 / yVar4.f18657e, 1, i19, 0, null);
            this.f25753m = 0;
            this.f25754n = j11;
        }
        int length2 = c8050c.e().length - c8050c.i();
        if (c8050c.a() < 16 && length2 < 16) {
            int a12 = c8050c.a();
            System.arraycopy(c8050c.e(), c8050c.f(), c8050c.e(), 0, a12);
            c8050c.R(0);
            c8050c.Q(a12);
        }
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
