package p056h4;

import B4.G;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13544e;

    public /* synthetic */ b(f fVar, Object obj, long j, TimeUnit timeUnit, int i7) {
        this.f13540a = i7;
        this.f13541b = fVar;
        this.f13544e = obj;
        this.f13542c = j;
        this.f13543d = timeUnit;
    }

    @Override // p056h4.g
    public final ScheduledFuture a(C1010l1 c1010l1) {
        switch (this.f13540a) {
            case 0:
                f fVar = this.f13541b;
                fVar.getClass();
                return fVar.f13559b.schedule(new e(fVar, (Runnable) this.f13544e, c1010l1, 1), this.f13542c, this.f13543d);
            default:
                f fVar2 = this.f13541b;
                fVar2.getClass();
                return fVar2.f13559b.schedule(new G(fVar2, (Callable) this.f13544e, c1010l1, 2), this.f13542c, this.f13543d);
        }
    }
}
