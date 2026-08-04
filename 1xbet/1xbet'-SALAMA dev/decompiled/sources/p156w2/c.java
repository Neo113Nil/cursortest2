package p156w2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f17973g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17974h;

    public final boolean a() {
        return this.f17970d > 15 && this.f17974h == 0;
    }

    public final void b(long j) {
        long j3 = this.f17970d;
        if (j3 == 0) {
            this.f17967a = j;
        } else if (j3 == 1) {
            long j7 = j - this.f17967a;
            this.f17968b = j7;
            this.f17972f = j7;
            this.f17971e = 1L;
        } else {
            long j8 = j - this.f17969c;
            int i7 = (int) (j3 % 15);
            long jAbs = Math.abs(j8 - this.f17968b);
            boolean[] zArr = this.f17973g;
            if (jAbs <= 1000000) {
                this.f17971e++;
                this.f17972f += j8;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f17974h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f17974h++;
            }
        }
        this.f17970d++;
        this.f17969c = j;
    }

    public final void c() {
        this.f17970d = 0L;
        this.f17971e = 0L;
        this.f17972f = 0L;
        this.f17974h = 0;
        Arrays.fill(this.f17973g, false);
    }
}
