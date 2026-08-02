package W5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u5.C1649c;

/* renamed from: W5.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0557y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1649c f7408b;

    public /* synthetic */ RunnableC0557y1(C1649c c1649c, int i7) {
        this.f7407a = i7;
        this.f7408b = c1649c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7407a) {
            case 0:
                C1649c c1649c = this.f7408b;
                if (!c1649c.f16877b) {
                    c1649c.f16882g = null;
                    break;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a2 = c1649c.f16876a - ((D3.p) c1649c.f16881f).a(timeUnit);
                    if (a2 <= 0) {
                        c1649c.f16877b = false;
                        c1649c.f16882g = null;
                        ((C0) c1649c.f16880e).run();
                        break;
                    } else {
                        c1649c.f16882g = ((ScheduledExecutorService) c1649c.f16878c).schedule(new RunnableC0557y1(c1649c, 1), a2, timeUnit);
                        break;
                    }
                }
            default:
                C1649c c1649c2 = this.f7408b;
                ((U5.p0) c1649c2.f16879d).execute(new RunnableC0557y1(c1649c2, 0));
                break;
        }
    }
}
