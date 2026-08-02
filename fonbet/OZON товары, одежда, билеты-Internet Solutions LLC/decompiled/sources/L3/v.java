package L3;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.C5449k;
import m3.InterfaceC8064f;
import m3.N;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final C3571k f16439a;

    /* renamed from: b, reason: collision with root package name */
    private final y f16440b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16441c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16442d;

    /* renamed from: g, reason: collision with root package name */
    private long f16445g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16448j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16451m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16452n;

    /* renamed from: e, reason: collision with root package name */
    private int f16443e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f16444f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f16446h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f16447i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    private float f16449k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC8064f f16450l = InterfaceC8064f.f74315a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f16453a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private long f16454b = -9223372036854775807L;

        static void a(a aVar) {
            aVar.f16453a = -9223372036854775807L;
            aVar.f16454b = -9223372036854775807L;
        }

        public final long f() {
            return this.f16453a;
        }

        public final long g() {
            return this.f16454b;
        }
    }

    public v(Context context, C3571k c3571k, long j11) {
        this.f16439a = c3571k;
        this.f16441c = j11;
        this.f16440b = new y(context);
    }

    public final void a() {
        if (this.f16443e == 0) {
            this.f16443e = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ba, code lost:
    
        if (r4 > 100000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
    
        if (r22 >= r26) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j11, long j12, long j13, long j14, boolean z11, boolean z12, a aVar) throws C5449k {
        long j15;
        boolean z13;
        a.a(aVar);
        if (this.f16442d && this.f16444f == -9223372036854775807L) {
            this.f16444f = j12;
        }
        long j16 = this.f16446h;
        y yVar = this.f16440b;
        if (j16 != j11) {
            yVar.e(j11);
            this.f16446h = j11;
        }
        long j17 = (long) ((j11 - j12) / this.f16449k);
        if (this.f16442d) {
            j17 -= N.Q(this.f16450l.elapsedRealtime()) - j13;
        }
        aVar.f16453a = j17;
        if (!z11 || z12) {
            boolean z14 = this.f16451m;
            C3571k c3571k = this.f16439a;
            if (z14) {
                long j18 = aVar.f16453a;
                boolean z15 = false;
                if (this.f16447i == -9223372036854775807L || this.f16448j) {
                    int i11 = this.f16443e;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            j15 = -9223372036854775807L;
                        } else if (i11 == 2) {
                            j15 = -9223372036854775807L;
                        } else {
                            if (i11 != 3) {
                                throw new IllegalStateException();
                            }
                            j15 = -9223372036854775807L;
                            long Q11 = N.Q(this.f16450l.elapsedRealtime()) - this.f16445g;
                            if (this.f16442d) {
                                long j19 = this.f16444f;
                                if (j19 != -9223372036854775807L) {
                                    if (j19 != j12) {
                                        if (j18 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = true;
                    } else {
                        j15 = -9223372036854775807L;
                        z13 = this.f16442d;
                    }
                    if (!z13) {
                        return 0;
                    }
                    if (!this.f16442d || j12 == this.f16444f) {
                        return 5;
                    }
                    long nanoTime = this.f16450l.nanoTime();
                    aVar.f16454b = yVar.b((aVar.f16453a * 1000) + nanoTime);
                    aVar.f16453a = (aVar.f16454b - nanoTime) / 1000;
                    boolean z16 = (this.f16447i == j15 || this.f16448j) ? false : true;
                    if (c3571k.E1(aVar.f16453a, j12, z12, z16)) {
                        return 4;
                    }
                    if (aVar.f16453a < -30000 && !z12) {
                        z15 = true;
                    }
                    if (!z15) {
                        return aVar.f16453a > 50000 ? 5 : 1;
                    }
                    if (!z16) {
                        return 2;
                    }
                } else {
                    j15 = -9223372036854775807L;
                }
                z13 = false;
                if (!z13) {
                }
            } else {
                this.f16452n = true;
                if (c3571k.E1(aVar.f16453a, j12, z12, true)) {
                    return 4;
                }
                if (!this.f16442d || aVar.f16453a >= 30000) {
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean c(boolean z11) {
        if (z11 && (this.f16443e == 3 || (!this.f16451m && this.f16452n))) {
            this.f16447i = -9223372036854775807L;
            return true;
        }
        if (this.f16447i == -9223372036854775807L) {
            return false;
        }
        if (this.f16450l.elapsedRealtime() < this.f16447i) {
            return true;
        }
        this.f16447i = -9223372036854775807L;
        return false;
    }

    public final void d(boolean z11) {
        this.f16448j = z11;
        long j11 = this.f16441c;
        this.f16447i = j11 > 0 ? this.f16450l.elapsedRealtime() + j11 : -9223372036854775807L;
    }

    public final boolean e() {
        boolean z11 = this.f16443e != 3;
        this.f16443e = 3;
        this.f16445g = N.Q(this.f16450l.elapsedRealtime());
        return z11;
    }

    public final void f() {
        this.f16442d = true;
        this.f16445g = N.Q(this.f16450l.elapsedRealtime());
        this.f16440b.h();
    }

    public final void g() {
        this.f16442d = false;
        this.f16447i = -9223372036854775807L;
        this.f16440b.i();
    }

    public final void h(int i11) {
        if (i11 == 0) {
            this.f16443e = 1;
        } else if (i11 == 1) {
            this.f16443e = 0;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException();
            }
            this.f16443e = Math.min(this.f16443e, 2);
        }
    }

    public final void i() {
        this.f16440b.g();
        this.f16446h = -9223372036854775807L;
        this.f16444f = -9223372036854775807L;
        this.f16443e = Math.min(this.f16443e, 1);
        this.f16447i = -9223372036854775807L;
    }

    public final void j(int i11) {
        this.f16440b.k(i11);
    }

    public final void k(InterfaceC8064f interfaceC8064f) {
        this.f16450l = interfaceC8064f;
    }

    public final void l(float f7) {
        this.f16440b.d(f7);
    }

    public final void m(Surface surface) {
        this.f16451m = surface != null;
        this.f16452n = false;
        this.f16440b.j(surface);
        this.f16443e = Math.min(this.f16443e, 1);
    }

    public final void n(float f7) {
        G10.a.c(f7 > 0.0f);
        if (f7 == this.f16449k) {
            return;
        }
        this.f16449k = f7;
        this.f16440b.f(f7);
    }
}
