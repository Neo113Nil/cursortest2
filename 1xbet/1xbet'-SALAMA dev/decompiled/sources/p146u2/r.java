package p146u2;

import java.util.Arrays;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16825d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16822a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16823b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16826e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0942a[] f16827f = new C0942a[100];

    public final synchronized void a(int i7) {
        boolean z4 = i7 < this.f16824c;
        this.f16824c = i7;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, t.g(this.f16824c, this.f16823b) - this.f16825d);
        int i7 = this.f16826e;
        if (iMax >= i7) {
            return;
        }
        Arrays.fill(this.f16827f, iMax, i7, (Object) null);
        this.f16826e = iMax;
    }
}
