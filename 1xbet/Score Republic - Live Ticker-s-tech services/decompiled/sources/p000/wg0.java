package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f8538a;

    /* JADX INFO: renamed from: b */
    public final na1 f8539b;

    /* JADX INFO: renamed from: c */
    public final nu1 f8540c;

    /* JADX INFO: renamed from: d */
    public int f8541d;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture f8542e;

    /* JADX INFO: renamed from: f */
    public ScheduledFuture f8543f;

    /* JADX INFO: renamed from: g */
    public final ek0 f8544g;

    /* JADX INFO: renamed from: h */
    public final ek0 f8545h;

    /* JADX INFO: renamed from: i */
    public final long f8546i;

    /* JADX INFO: renamed from: j */
    public final long f8547j;

    public wg0(nu1 nu1Var, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        na1 na1Var = new na1();
        this.f8541d = 1;
        this.f8544g = new ek0(new ug0(this, 0));
        this.f8545h = new ek0(new ug0(this, 1));
        this.f8540c = nu1Var;
        a90.m127k(scheduledExecutorService, "scheduler");
        this.f8538a = scheduledExecutorService;
        this.f8539b = na1Var;
        this.f8546i = j;
        this.f8547j = j2;
        na1Var.f5351b = false;
        na1Var.m3510b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5328a() {
        try {
            na1 na1Var = this.f8539b;
            na1Var.f5351b = false;
            na1Var.m3510b();
            int i = this.f8541d;
            if (i == 2) {
                this.f8541d = 3;
            } else if (i == 4 || i == 5) {
                ScheduledFuture scheduledFuture = this.f8542e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f8541d == 5) {
                    this.f8541d = 1;
                } else {
                    this.f8541d = 2;
                    a90.m132p("There should be no outstanding pingFuture", this.f8543f == null);
                    this.f8543f = this.f8538a.schedule(this.f8545h, this.f8546i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5329b() {
        try {
            int i = this.f8541d;
            if (i == 1) {
                this.f8541d = 2;
                if (this.f8543f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f8538a;
                    ek0 ek0Var = this.f8545h;
                    long j = this.f8546i;
                    na1 na1Var = this.f8539b;
                    this.f8543f = scheduledExecutorService.schedule(ek0Var, j - na1Var.m3509a(), TimeUnit.NANOSECONDS);
                }
            } else if (i == 5) {
                this.f8541d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
