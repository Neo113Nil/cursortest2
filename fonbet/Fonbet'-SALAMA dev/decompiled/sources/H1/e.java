package H1;

import F1.r;
import F1.t;
import F1.v;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v f3218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3222e;

    /* renamed from: f, reason: collision with root package name */
    public int f3223f;

    /* renamed from: g, reason: collision with root package name */
    public int f3224g;

    /* renamed from: h, reason: collision with root package name */
    public int f3225h;

    /* renamed from: i, reason: collision with root package name */
    public int f3226i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f3227k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f3228l;

    public e(int i7, int i8, long j, int i9, v vVar) {
        boolean z4 = true;
        if (i8 != 1 && i8 != 2) {
            z4 = false;
        }
        AbstractC1664a.f(z4);
        this.f3221d = j;
        this.f3222e = i9;
        this.f3218a = vVar;
        int i10 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f3219b = (i8 == 2 ? 1667497984 : 1651965952) | i10;
        this.f3220c = i8 == 2 ? i10 | 1650720768 : -1;
        this.f3227k = new long[512];
        this.f3228l = new int[512];
    }

    public final t a(int i7) {
        return new t(((this.f3221d * 1) / this.f3222e) * this.f3228l[i7], this.f3227k[i7]);
    }

    public final r b(long j) {
        int i7 = (int) (j / ((this.f3221d * 1) / this.f3222e));
        int e7 = v2.t.e(this.f3228l, i7, true, true);
        if (this.f3228l[e7] == i7) {
            t a2 = a(e7);
            return new r(a2, a2);
        }
        t a4 = a(e7);
        int i8 = e7 + 1;
        return i8 < this.f3227k.length ? new r(a4, a(i8)) : new r(a4, a4);
    }
}
