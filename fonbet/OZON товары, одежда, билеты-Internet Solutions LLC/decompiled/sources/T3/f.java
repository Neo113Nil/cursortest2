package T3;

import N3.C3653d;
import N3.M;
import T3.e;
import j3.C7272n;
import j3.v;
import m3.C8050C;
import n3.C8434g;

/* loaded from: classes8.dex */
final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f26593b;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f26594c;

    /* renamed from: d, reason: collision with root package name */
    private int f26595d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26596e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26597f;

    /* renamed from: g, reason: collision with root package name */
    private int f26598g;

    public f(M m11) {
        super(m11);
        this.f26593b = new C8050C(C8434g.f76385a);
        this.f26594c = new C8050C(4);
    }

    protected final boolean a(C8050C c8050c) throws e.a {
        int E11 = c8050c.E();
        int i11 = (E11 >> 4) & 15;
        int i12 = E11 & 15;
        if (i12 != 7) {
            throw new e.a(Ej.b.a(i12, "Video format not supported: "));
        }
        this.f26598g = i11;
        return i11 != 5;
    }

    protected final boolean b(long j11, C8050C c8050c) throws v {
        int E11 = c8050c.E();
        long q11 = (c8050c.q() * 1000) + j11;
        M m11 = this.f26592a;
        if (E11 == 0 && !this.f26596e) {
            C8050C c8050c2 = new C8050C(new byte[c8050c.a()]);
            c8050c.n(0, c8050c.a(), c8050c2.e());
            C3653d a11 = C3653d.a(c8050c2);
            this.f26595d = a11.f18569b;
            C7272n.a aVar = new C7272n.a();
            aVar.W("video/x-flv");
            aVar.y0("video/avc");
            aVar.U(a11.f18579l);
            aVar.F0(a11.f18570c);
            aVar.h0(a11.f18571d);
            aVar.u0(a11.f18578k);
            aVar.k0(a11.f18568a);
            m11.a(aVar.P());
            this.f26596e = true;
            return false;
        }
        if (E11 == 1 && this.f26596e) {
            int i11 = this.f26598g == 1 ? 1 : 0;
            if (this.f26597f || i11 != 0) {
                C8050C c8050c3 = this.f26594c;
                byte[] e11 = c8050c3.e();
                e11[0] = 0;
                e11[1] = 0;
                e11[2] = 0;
                int i12 = 4 - this.f26595d;
                int i13 = 0;
                while (c8050c.a() > 0) {
                    c8050c.n(i12, this.f26595d, c8050c3.e());
                    c8050c3.R(0);
                    int I11 = c8050c3.I();
                    C8050C c8050c4 = this.f26593b;
                    c8050c4.R(0);
                    m11.e(4, c8050c4);
                    m11.e(I11, c8050c);
                    i13 = i13 + 4 + I11;
                }
                this.f26592a.b(q11, i11, i13, 0, null);
                this.f26597f = true;
                return true;
            }
        }
        return false;
    }
}
