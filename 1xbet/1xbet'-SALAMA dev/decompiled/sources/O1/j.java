package O1;

import C1.C0095a;
import F1.m;
import F1.v;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f4958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f4959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f4960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4965i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4968m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4957a = new f(0);
    public P2 j = new P2(18, (char) 0);

    public void a(long j) {
        this.f4963g = j;
    }

    public abstract long b(C0095a c0095a);

    public abstract boolean c(C0095a c0095a, long j, P2 p5);

    public void d(boolean z4) {
        if (z4) {
            this.j = new P2(18, (char) 0);
            this.f4962f = 0L;
            this.f4964h = 0;
        } else {
            this.f4964h = 1;
        }
        this.f4961e = -1L;
        this.f4963g = 0L;
    }
}
