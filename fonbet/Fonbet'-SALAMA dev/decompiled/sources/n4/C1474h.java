package n4;

import i4.C1266c;

/* renamed from: n4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1474h implements l4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1473g f15420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q4.j f15422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1479m f15423e;

    public /* synthetic */ C1474h(C1479m c1479m, C1473g c1473g, long j, q4.j jVar, int i7) {
        this.f15419a = i7;
        this.f15423e = c1479m;
        this.f15420b = c1473g;
        this.f15421c = j;
        this.f15422d = jVar;
    }

    @Override // l4.u
    public final void b(String str, String str2) {
        switch (this.f15419a) {
            case 0:
                C1266c c3 = C1479m.c(str, str2);
                C1479m c1479m = this.f15423e;
                C1473g c1473g = this.f15420b;
                C1479m.d(c1479m, "updateChildren", c1473g, c3);
                C1479m.e(c1479m, this.f15421c, c1473g, c3);
                c1479m.i(this.f15422d, c3, c1473g);
                break;
            default:
                C1266c c4 = C1479m.c(str, str2);
                C1479m c1479m2 = this.f15423e;
                C1473g c1473g2 = this.f15420b;
                C1479m.d(c1479m2, "setValue", c1473g2, c4);
                C1479m.e(c1479m2, this.f15421c, c1473g2, c4);
                c1479m2.i(this.f15422d, c4, c1473g2);
                break;
        }
    }
}
