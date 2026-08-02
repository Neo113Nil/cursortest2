package u2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public int f16818c;

    /* renamed from: d, reason: collision with root package name */
    public int f16819d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16816a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f16817b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f16820e = 0;

    /* renamed from: f, reason: collision with root package name */
    public C1624a[] f16821f = new C1624a[100];

    public final synchronized void a(int i7) {
        boolean z4 = i7 < this.f16818c;
        this.f16818c = i7;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, v2.t.g(this.f16818c, this.f16817b) - this.f16819d);
        int i7 = this.f16820e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f16821f, max, i7, (Object) null);
        this.f16820e = max;
    }
}
