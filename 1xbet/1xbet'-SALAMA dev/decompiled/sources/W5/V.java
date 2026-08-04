package W5;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f7071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f7072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7073e;

    public final long a() {
        long j = this.f7073e;
        double d7 = j;
        this.f7073e = Math.min((long) (this.f7071c * d7), this.f7070b);
        double d8 = this.f7072d;
        double d9 = (-d8) * d7;
        double d10 = d8 * d7;
        p113p3.f.e(d10 >= d9);
        return j + ((long) ((this.f7069a.nextDouble() * (d10 - d9)) + d9));
    }
}
