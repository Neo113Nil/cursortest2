package W5;

import U5.AbstractC0442i;
import U5.C0443j;
import U5.InterfaceC0444k;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: W5.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0489b1 implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0558z f7131B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0558z f7132C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f7133D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f7134E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f7135F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7136G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f7137H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile boolean f7138I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0484a f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f7141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f7142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0444k f7143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f7144f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7147z;

    public C0489b1(AbstractC0484a abstractC0484a, int i7, d2 d2Var, h2 h2Var) {
        C0443j c0443j = C0443j.f6510b;
        this.f7146y = 1;
        this.f7147z = 5;
        this.f7132C = new C0558z();
        this.f7134E = false;
        this.f7135F = -1;
        this.f7137H = false;
        this.f7138I = false;
        this.f7139a = abstractC0484a;
        this.f7143e = c0443j;
        this.f7140b = i7;
        this.f7141c = d2Var;
        p113p3.f.k(h2Var, "transportTracer");
        this.f7142d = h2Var;
    }

    public final void a() {
        String str;
        if (this.f7134E) {
            return;
        }
        boolean z4 = true;
        this.f7134E = true;
        while (!this.f7138I && this.f7133D > 0 && e()) {
            try {
                int iE = p136t.e.e(this.f7146y);
                if (iE == 0) {
                    d();
                } else {
                    if (iE != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i7 = this.f7146y;
                        if (i7 != 1) {
                            str = i7 != 2 ? "null" : "BODY";
                        } else {
                            str = "HEADER";
                        }
                        sb.append(str);
                        throw new AssertionError(sb.toString());
                    }
                    c();
                    this.f7133D--;
                }
            } catch (Throwable th) {
                this.f7134E = false;
                throw th;
            }
        }
        if (this.f7138I) {
            close();
            this.f7134E = false;
            return;
        }
        if (this.f7137H) {
            if (this.f7132C.f7416c != 0) {
                z4 = false;
            }
            if (z4) {
                close();
            }
        }
        this.f7134E = false;
    }

    public final boolean b() {
        return this.f7132C == null;
    }

    public final void c() {
        Object z4;
        int i7 = this.f7135F;
        long j = this.f7136G;
        d2 d2Var = this.f7141c;
        for (AbstractC0442i abstractC0442i : d2Var.f7182a) {
            abstractC0442i.d(i7, j);
        }
        this.f7136G = 0;
        if (this.f7130A) {
            InterfaceC0444k interfaceC0444k = this.f7143e;
            if (interfaceC0444k == C0443j.f6510b) {
                throw new U5.n0(U5.l0.f6543m.g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                C0558z c0558z = this.f7131B;
                C0548v1 c0548v1 = AbstractC0551w1.f7386a;
                C0545u1 c0545u1 = new C0545u1();
                p113p3.f.k(c0558z, "buffer");
                c0545u1.f7378a = c0558z;
                z4 = new Z0(interfaceC0444k.h(c0545u1), this.f7140b, d2Var);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } else {
            long j3 = this.f7131B.f7416c;
            for (AbstractC0442i abstractC0442i2 : d2Var.f7182a) {
                abstractC0442i2.f(j3);
            }
            C0558z c0558z2 = this.f7131B;
            C0548v1 c0548v2 = AbstractC0551w1.f7386a;
            C0545u1 c0545u2 = new C0545u1();
            p113p3.f.k(c0558z2, "buffer");
            c0545u2.f7378a = c0558z2;
            z4 = c0545u2;
        }
        this.f7131B.getClass();
        this.f7131B = null;
        AbstractC0484a abstractC0484a = this.f7139a;
        p096n1.e eVar = new p096n1.e(9);
        eVar.f15314b = z4;
        abstractC0484a.j.J(eVar);
        this.f7146y = 1;
        this.f7147z = 5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (b()) {
            return;
        }
        C0558z c0558z = this.f7131B;
        boolean z4 = c0558z != null && c0558z.f7416c > 0;
        try {
            C0558z c0558z2 = this.f7132C;
            if (c0558z2 != null) {
                c0558z2.close();
            }
            C0558z c0558z3 = this.f7131B;
            if (c0558z3 != null) {
                c0558z3.close();
            }
            this.f7132C = null;
            this.f7131B = null;
            this.f7139a.c(z4);
        } catch (Throwable th) {
            this.f7132C = null;
            this.f7131B = null;
            throw th;
        }
    }

    public final void d() {
        int iH = this.f7131B.h();
        if ((iH & 254) != 0) {
            throw new U5.n0(U5.l0.f6543m.g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f7130A = (iH & 1) != 0;
        C0558z c0558z = this.f7131B;
        c0558z.a(4);
        int iH2 = c0558z.h() | (c0558z.h() << 24) | (c0558z.h() << 16) | (c0558z.h() << 8);
        this.f7147z = iH2;
        if (iH2 < 0 || iH2 > this.f7140b) {
            U5.l0 l0Var = U5.l0.f6541k;
            Locale locale = Locale.US;
            throw new U5.n0(l0Var.g("gRPC message exceeds maximum size " + this.f7140b + ": " + iH2));
        }
        int i7 = this.f7135F + 1;
        this.f7135F = i7;
        for (AbstractC0442i abstractC0442i : this.f7141c.f7182a) {
            abstractC0442i.c(i7);
        }
        h2 h2Var = this.f7142d;
        ((A0) h2Var.f7233c).c();
        ((f2) h2Var.f7232b).d();
        this.f7146y = 2;
    }

    public final boolean e() throws Throwable {
        d2 d2Var = this.f7141c;
        int i7 = 0;
        try {
            if (this.f7131B == null) {
                this.f7131B = new C0558z();
            }
            int i8 = 0;
            while (true) {
                try {
                    int i9 = this.f7147z - this.f7131B.f7416c;
                    if (i9 <= 0) {
                        if (i8 <= 0) {
                            return true;
                        }
                        this.f7139a.a(i8);
                        if (this.f7146y != 2) {
                            return true;
                        }
                        d2Var.a(i8);
                        this.f7136G += i8;
                        return true;
                    }
                    int i10 = this.f7132C.f7416c;
                    if (i10 == 0) {
                        if (i8 > 0) {
                            this.f7139a.a(i8);
                            if (this.f7146y == 2) {
                                d2Var.a(i8);
                                this.f7136G += i8;
                            }
                        }
                        return false;
                    }
                    int iMin = Math.min(i9, i10);
                    i8 += iMin;
                    this.f7131B.k(this.f7132C.d(iMin));
                } catch (Throwable th) {
                    int i11 = i8;
                    th = th;
                    i7 = i11;
                    if (i7 > 0) {
                        this.f7139a.a(i7);
                        if (this.f7146y == 2) {
                            d2Var.a(i7);
                            this.f7136G += i7;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
