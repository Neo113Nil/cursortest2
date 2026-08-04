package p098n4;

import p063i4.c;
import p083l4.u;
import p120q4.j;

/* JADX INFO: renamed from: n4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0935h implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0934g f15426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0940m f15429e;

    public /* synthetic */ C0935h(C0940m c0940m, C0934g c0934g, long j, j jVar, int i7) {
        this.f15425a = i7;
        this.f15429e = c0940m;
        this.f15426b = c0934g;
        this.f15427c = j;
        this.f15428d = jVar;
    }

    @Override // p083l4.u
    public final void b(String str, String str2) {
        switch (this.f15425a) {
            case 0:
                c cVarC = C0940m.c(str, str2);
                C0940m c0940m = this.f15429e;
                C0934g c0934g = this.f15426b;
                C0940m.d(c0940m, "updateChildren", c0934g, cVarC);
                C0940m.e(c0940m, this.f15427c, c0934g, cVarC);
                c0940m.i(this.f15428d, cVarC, c0934g);
                break;
            default:
                c cVarC2 = C0940m.c(str, str2);
                C0940m c0940m2 = this.f15429e;
                C0934g c0934g2 = this.f15426b;
                C0940m.d(c0940m2, "setValue", c0934g2, cVarC2);
                C0940m.e(c0940m2, this.f15427c, c0934g2, cVarC2);
                c0940m2.i(this.f15428d, cVarC2, c0934g2);
                break;
        }
    }
}
