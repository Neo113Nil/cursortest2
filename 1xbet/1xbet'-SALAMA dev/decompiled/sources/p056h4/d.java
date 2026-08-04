package p056h4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13553f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j, long j3, TimeUnit timeUnit, int i7) {
        this.f13548a = i7;
        this.f13549b = fVar;
        this.f13550c = runnable;
        this.f13551d = j;
        this.f13552e = j3;
        this.f13553f = timeUnit;
    }

    @Override // p056h4.g
    public final ScheduledFuture a(C1010l1 c1010l1) {
        switch (this.f13548a) {
            case 0:
                f fVar = this.f13549b;
                fVar.getClass();
                return fVar.f13559b.scheduleAtFixedRate(new e(fVar, this.f13550c, c1010l1, 0), this.f13551d, this.f13552e, this.f13553f);
            default:
                f fVar2 = this.f13549b;
                fVar2.getClass();
                return fVar2.f13559b.scheduleWithFixedDelay(new e(fVar2, this.f13550c, c1010l1, 2), this.f13551d, this.f13552e, this.f13553f);
        }
    }
}
