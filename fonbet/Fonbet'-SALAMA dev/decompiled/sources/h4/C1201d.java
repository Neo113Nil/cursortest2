package h4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w1.C1719l1;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1201d implements InterfaceC1204g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1203f f13543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13547f;

    public /* synthetic */ C1201d(ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f, Runnable runnable, long j, long j3, TimeUnit timeUnit, int i7) {
        this.f13542a = i7;
        this.f13543b = scheduledExecutorServiceC1203f;
        this.f13544c = runnable;
        this.f13545d = j;
        this.f13546e = j3;
        this.f13547f = timeUnit;
    }

    @Override // h4.InterfaceC1204g
    public final ScheduledFuture a(C1719l1 c1719l1) {
        switch (this.f13542a) {
            case 0:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f = this.f13543b;
                scheduledExecutorServiceC1203f.getClass();
                return scheduledExecutorServiceC1203f.f13553b.scheduleAtFixedRate(new RunnableC1202e(scheduledExecutorServiceC1203f, this.f13544c, c1719l1, 0), this.f13545d, this.f13546e, this.f13547f);
            default:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f2 = this.f13543b;
                scheduledExecutorServiceC1203f2.getClass();
                return scheduledExecutorServiceC1203f2.f13553b.scheduleWithFixedDelay(new RunnableC1202e(scheduledExecutorServiceC1203f2, this.f13544c, c1719l1, 2), this.f13545d, this.f13546e, this.f13547f);
        }
    }
}
