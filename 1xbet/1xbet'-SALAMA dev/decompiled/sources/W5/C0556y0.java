package W5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: W5.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0556y0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f7397k = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f7398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D3.p f7399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1.x0 f7400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f7402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledFuture f7403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RunnableC0559z0 f7404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC0559z0 f7405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7406i;
    public final long j;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public C0556y0(A1.x0 x0Var, ScheduledExecutorService scheduledExecutorService, long j, long j3) {
        D3.p pVar = new D3.p(0);
        this.f7401d = 1;
        this.f7404g = new RunnableC0559z0(new RunnableC0550w0(this, 0));
        this.f7405h = new RunnableC0559z0(new RunnableC0550w0(this, 1));
        this.f7400c = x0Var;
        p113p3.f.k(scheduledExecutorService, "scheduler");
        this.f7398a = scheduledExecutorService;
        this.f7399b = pVar;
        this.f7406i = j;
        this.j = j3;
        pVar.f1738b = false;
        pVar.b();
    }

    public final synchronized void a() {
        try {
            D3.p pVar = this.f7399b;
            pVar.f1738b = false;
            pVar.b();
            int i7 = this.f7401d;
            if (i7 == 2) {
                this.f7401d = 3;
            } else if (i7 == 4 || i7 == 5) {
                ScheduledFuture scheduledFuture = this.f7402e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f7401d == 5) {
                    this.f7401d = 1;
                } else {
                    this.f7401d = 2;
                    p113p3.f.q("There should be no outstanding pingFuture", this.f7403f == null);
                    this.f7403f = this.f7398a.schedule(this.f7405h, this.f7406i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i7 = this.f7401d;
            if (i7 == 1) {
                this.f7401d = 2;
                if (this.f7403f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f7398a;
                    RunnableC0559z0 runnableC0559z0 = this.f7405h;
                    long j = this.f7406i;
                    D3.p pVar = this.f7399b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f7403f = scheduledExecutorService.schedule(runnableC0559z0, j - pVar.a(timeUnit), timeUnit);
                }
            } else if (i7 == 5) {
                this.f7401d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
