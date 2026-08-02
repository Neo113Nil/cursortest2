package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Q2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f11149a;

    /* renamed from: b, reason: collision with root package name */
    public final S f11150b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11152d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0737a0 f11153e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public int f11154g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f11155h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11156j;

    /* renamed from: k, reason: collision with root package name */
    public long f11157k;

    /* renamed from: l, reason: collision with root package name */
    public int f11158l;

    /* renamed from: m, reason: collision with root package name */
    public long f11159m;

    public Q2(String str, int i) {
        C1617tm c1617tm = new C1617tm(4);
        this.f11149a = c1617tm;
        c1617tm.f15724a[0] = -1;
        this.f11150b = new S();
        this.f11159m = -9223372036854775807L;
        this.f11151c = str;
        this.f11152d = i;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f11154g = 0;
        this.f11155h = 0;
        this.f11156j = false;
        this.f11159m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void c(C1617tm c1617tm) {
        AbstractC1668us.F(this.f11153e);
        while (c1617tm.o() > 0) {
            int i = this.f11154g;
            C1617tm c1617tm2 = this.f11149a;
            if (i == 0) {
                byte[] bArr = c1617tm.f15724a;
                int i5 = c1617tm.f15725b;
                int i6 = c1617tm.f15726c;
                while (true) {
                    if (i5 >= i6) {
                        c1617tm.j(i6);
                        break;
                    }
                    int i7 = i5 + 1;
                    byte b3 = bArr[i5];
                    boolean z3 = (b3 & 255) == 255;
                    boolean z5 = this.f11156j && (b3 & 224) == 224;
                    this.f11156j = z3;
                    if (z5) {
                        c1617tm.j(i7);
                        this.f11156j = false;
                        c1617tm2.f15724a[1] = bArr[i5];
                        this.f11155h = 2;
                        this.f11154g = 1;
                        break;
                    }
                    i5 = i7;
                }
            } else if (i != 1) {
                int min = Math.min(c1617tm.o(), this.f11158l - this.f11155h);
                this.f11153e.c(min, c1617tm);
                int i8 = this.f11155h + min;
                this.f11155h = i8;
                if (i8 >= this.f11158l) {
                    AbstractC1668us.a0(this.f11159m != -9223372036854775807L);
                    this.f11153e.d(this.f11159m, 1, this.f11158l, 0, null);
                    this.f11159m += this.f11157k;
                    this.f11155h = 0;
                    this.f11154g = 0;
                }
            } else {
                int min2 = Math.min(c1617tm.o(), 4 - this.f11155h);
                c1617tm.f(c1617tm2.f15724a, this.f11155h, min2);
                int i9 = this.f11155h + min2;
                this.f11155h = i9;
                if (i9 >= 4) {
                    c1617tm2.j(0);
                    int q5 = c1617tm2.q();
                    S s2 = this.f11150b;
                    if (s2.a(q5)) {
                        this.f11158l = s2.f11475b;
                        if (!this.i) {
                            this.f11157k = (s2.f * 1000000) / s2.f11476c;
                            C1649uH c1649uH = new C1649uH();
                            c1649uH.f15839a = this.f;
                            c1649uH.c((String) s2.f11479g);
                            c1649uH.f15849m = 4096;
                            c1649uH.f15831A = s2.f11477d;
                            c1649uH.f15832B = s2.f11476c;
                            c1649uH.f15842d = this.f11151c;
                            c1649uH.f = this.f11152d;
                            this.f11153e.e(new C1407p(c1649uH));
                            this.i = true;
                        }
                        c1617tm2.j(0);
                        this.f11153e.c(4, c1617tm2);
                        this.f11154g = 2;
                    } else {
                        this.f11155h = 0;
                        this.f11154g = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f = c0829c3.f12966e;
        c0829c3.b();
        this.f11153e = h3.w(c0829c3.f12965d, 1);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f11159m = j5;
    }
}
