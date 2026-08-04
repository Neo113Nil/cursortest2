package W5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: W5.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0557y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p148u5.c f7408b;

    public /* synthetic */ RunnableC0557y1(p148u5.c cVar, int i7) {
        this.f7407a = i7;
        this.f7408b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7407a) {
            case 0:
                p148u5.c cVar = this.f7408b;
                if (!cVar.f16883b) {
                    cVar.f16888g = null;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = cVar.f16882a - ((D3.p) cVar.f16887f).a(timeUnit);
                    if (jA <= 0) {
                        cVar.f16883b = false;
                        cVar.f16888g = null;
                        ((C0) cVar.f16886e).run();
                    } else {
                        cVar.f16888g = ((ScheduledExecutorService) cVar.f16884c).schedule(new RunnableC0557y1(cVar, 1), jA, timeUnit);
                    }
                }
                break;
            default:
                p148u5.c cVar2 = this.f7408b;
                ((U5.p0) cVar2.f16885d).execute(new RunnableC0557y1(cVar2, 0));
                break;
        }
    }
}
