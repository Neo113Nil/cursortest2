package w2;

import java.util.Arrays;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768c {

    /* renamed from: a, reason: collision with root package name */
    public long f17961a;

    /* renamed from: b, reason: collision with root package name */
    public long f17962b;

    /* renamed from: c, reason: collision with root package name */
    public long f17963c;

    /* renamed from: d, reason: collision with root package name */
    public long f17964d;

    /* renamed from: e, reason: collision with root package name */
    public long f17965e;

    /* renamed from: f, reason: collision with root package name */
    public long f17966f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f17967g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f17968h;

    public final boolean a() {
        return this.f17964d > 15 && this.f17968h == 0;
    }

    public final void b(long j) {
        long j3 = this.f17964d;
        if (j3 == 0) {
            this.f17961a = j;
        } else if (j3 == 1) {
            long j7 = j - this.f17961a;
            this.f17962b = j7;
            this.f17966f = j7;
            this.f17965e = 1L;
        } else {
            long j8 = j - this.f17963c;
            int i7 = (int) (j3 % 15);
            long abs = Math.abs(j8 - this.f17962b);
            boolean[] zArr = this.f17967g;
            if (abs <= 1000000) {
                this.f17965e++;
                this.f17966f += j8;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f17968h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f17968h++;
            }
        }
        this.f17964d++;
        this.f17963c = j;
    }

    public final void c() {
        this.f17964d = 0L;
        this.f17965e = 0L;
        this.f17966f = 0L;
        this.f17968h = 0;
        Arrays.fill(this.f17967g, false);
    }
}
