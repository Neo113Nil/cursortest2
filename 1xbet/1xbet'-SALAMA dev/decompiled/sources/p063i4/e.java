package p063i4;

import p098n4.C0934g;
import p098n4.C0940m;
import p120q4.j;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f13999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p120q4.e f14000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f14001d;

    public /* synthetic */ e(f fVar, r rVar, p120q4.e eVar, int i7) {
        this.f13998a = i7;
        this.f14001d = fVar;
        this.f13999b = rVar;
        this.f14000c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13998a) {
            case 0:
                f fVar = this.f14001d;
                ((C0940m) fVar.f1723b).s((C0934g) fVar.f1725d, this.f13999b, (j) this.f14000c.f15864b);
                break;
            default:
                f fVar2 = this.f14001d;
                ((C0940m) fVar2.f1723b).s(((C0934g) fVar2.f1725d).t(c.f17177d), this.f13999b, (j) this.f14000c.f15864b);
                break;
        }
    }
}
