package sg.bigo.ads.P;

/* loaded from: classes3.dex */
public final class x {
    public final int d;

    /* renamed from: a, reason: collision with root package name */
    public String f12496a = "";
    public long b = 0;
    public long c = 0;
    public long e = 0;
    public long f = 0;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public boolean n = false;

    public x(int i) {
        this.d = i;
    }

    public final void a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (this.b <= 0) {
                long j = this.j;
                if (j > 0) {
                    this.b = currentTimeMillis - j;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            this.n = true;
            if (this.c <= 0) {
                long j2 = this.k;
                if (j2 > 0) {
                    this.c = currentTimeMillis - j2;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.e <= 0) {
                long j3 = this.l;
                if (j3 > 0) {
                    this.e = currentTimeMillis - j3;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4 && this.f <= 0) {
            long j4 = this.m;
            if (j4 > 0) {
                this.f = currentTimeMillis - j4;
            }
        }
    }

    public final void b(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (this.j <= 0) {
                this.j = currentTimeMillis;
            }
        } else if (i == 2) {
            if (this.k <= 0) {
                this.k = currentTimeMillis;
            }
        } else {
            if (i != 3) {
                return;
            }
            if (this.l <= 0) {
                this.l = currentTimeMillis;
            }
            if (this.m <= 0) {
                this.m = currentTimeMillis;
            }
        }
    }
}
