package p018c2;

import A1.H0;
import A1.X;
import B1.l;
import java.util.ArrayList;
import p139t2.c;
import p151v2.a;
import p151v2.i;
import p151v2.t;

/* JADX INFO: renamed from: c2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758d implements B, A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f10316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f10317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0757c[] f10318c = new C0757c[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10321f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0760f f10322x;

    public C0758d(B b7, boolean z4, long j, long j3) {
        this.f10316a = b7;
        this.f10319d = z4 ? j : -9223372036854775807L;
        this.f10320e = j;
        this.f10321f = j3;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    @Override // p018c2.B
    public final long I(c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long j3;
        boolean z4;
        l lVarE;
        int iA;
        this.f10318c = new C0757c[wArr.length];
        W[] wArr2 = new W[wArr.length];
        int i7 = 0;
        while (true) {
            W w7 = null;
            if (i7 >= wArr.length) {
                break;
            }
            C0757c[] c0757cArr = this.f10318c;
            C0757c c0757c = (C0757c) wArr[i7];
            c0757cArr[i7] = c0757c;
            if (c0757c != null) {
                w7 = c0757c.f10309a;
            }
            wArr2[i7] = w7;
            i7++;
        }
        long jI = this.f10316a.I(cVarArr, zArr, wArr2, zArr2, j);
        if (a()) {
            long j7 = this.f10320e;
            if (j != j7 || j7 == 0) {
                j3 = -9223372036854775807L;
            } else {
                int length = cVarArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        j3 = -9223372036854775807L;
                    } else {
                        c cVar = cVarArr[i8];
                        if (cVar != null) {
                            X x4 = cVar.f16305d[cVar.e()];
                            String str = x4.f283C;
                            ArrayList arrayList = i.f17115a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        String str2 = x4.f312z;
                                        if (str2 != null && (lVarE = i.e(str2)) != null && (iA = lVarE.a()) != 0 && iA != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j3 = jI;
                        }
                        i8++;
                    }
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        this.f10319d = j3;
        if (jI != j) {
            if (jI >= this.f10320e) {
                long j8 = this.f10321f;
                z4 = j8 == Long.MIN_VALUE || jI <= j8;
            }
        }
        a.h(z4);
        for (int i9 = 0; i9 < wArr.length; i9++) {
            W w8 = wArr2[i9];
            if (w8 == null) {
                this.f10318c[i9] = null;
            } else {
                C0757c[] c0757cArr2 = this.f10318c;
                C0757c c0757c2 = c0757cArr2[i9];
                if (c0757c2 == null || c0757c2.f10309a != w8) {
                    c0757cArr2[i9] = new C0757c(this, w8);
                }
            }
            wArr[i9] = this.f10318c[i9];
        }
        return jI;
    }

    @Override // p018c2.B
    public final long M() {
        if (a()) {
            long j = this.f10319d;
            this.f10319d = -9223372036854775807L;
            long jM = M();
            return jM != -9223372036854775807L ? jM : j;
        }
        long jM2 = this.f10316a.M();
        if (jM2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        a.h(jM2 >= this.f10320e);
        long j3 = this.f10321f;
        a.h(j3 == Long.MIN_VALUE || jM2 <= j3);
        return jM2;
    }

    @Override // p018c2.B
    public final f0 P() {
        return this.f10316a.P();
    }

    @Override // p018c2.Y
    public final long T() {
        long jT = this.f10316a.T();
        if (jT != Long.MIN_VALUE) {
            long j = this.f10321f;
            if (j == Long.MIN_VALUE || jT < j) {
                return jT;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p018c2.Y
    public final void Y(long j) {
        this.f10316a.Y(j);
    }

    public final boolean a() {
        return this.f10319d != -9223372036854775807L;
    }

    @Override // p018c2.X
    public final void b(Y y4) {
        A a2 = this.f10317b;
        a2.getClass();
        a2.b(this);
    }

    @Override // p018c2.A
    public final void f(B b7) {
        if (this.f10322x != null) {
            return;
        }
        A a2 = this.f10317b;
        a2.getClass();
        a2.f(this);
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return this.f10316a.isLoading();
    }

    @Override // p018c2.Y
    public final long k() {
        long jK = this.f10316a.k();
        if (jK != Long.MIN_VALUE) {
            long j = this.f10321f;
            if (j == Long.MIN_VALUE || jK < j) {
                return jK;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        long j3 = this.f10320e;
        if (j == j3) {
            return j3;
        }
        long jK = t.k(h6.f101a, 0L, j - j3);
        long j7 = this.f10321f;
        long jK2 = t.k(h6.f102b, 0L, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j);
        if (jK != h6.f101a || jK2 != h6.f102b) {
            h6 = new H0(jK, jK2);
        }
        return this.f10316a.o(j, h6);
    }

    @Override // p018c2.B
    public final void p(A a2, long j) {
        this.f10317b = a2;
        this.f10316a.p(this, j);
    }

    @Override // p018c2.B
    public final void q() throws C0760f {
        C0760f c0760f = this.f10322x;
        if (c0760f != null) {
            throw c0760f;
        }
        this.f10316a.q();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p018c2.B
    public final long v(long j) {
        this.f10319d = -9223372036854775807L;
        boolean z4 = false;
        for (C0757c c0757c : this.f10318c) {
            if (c0757c != null) {
                c0757c.f10310b = false;
            }
        }
        long jV = this.f10316a.v(j);
        if (jV == j) {
            z4 = true;
        } else if (jV >= this.f10320e) {
            long j3 = this.f10321f;
            if (j3 == Long.MIN_VALUE || jV <= j3) {
                z4 = true;
            }
        }
        a.h(z4);
        return jV;
    }

    @Override // p018c2.B
    public final void w(long j) {
        this.f10316a.w(j);
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        return this.f10316a.y(j);
    }
}
