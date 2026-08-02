package h4;

import B4.G;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w1.C1719l1;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1199b implements InterfaceC1204g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1203f f13535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13536c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13538e;

    public /* synthetic */ C1199b(ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f, Object obj, long j, TimeUnit timeUnit, int i7) {
        this.f13534a = i7;
        this.f13535b = scheduledExecutorServiceC1203f;
        this.f13538e = obj;
        this.f13536c = j;
        this.f13537d = timeUnit;
    }

    @Override // h4.InterfaceC1204g
    public final ScheduledFuture a(C1719l1 c1719l1) {
        switch (this.f13534a) {
            case 0:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f = this.f13535b;
                scheduledExecutorServiceC1203f.getClass();
                return scheduledExecutorServiceC1203f.f13553b.schedule(new RunnableC1202e(scheduledExecutorServiceC1203f, (Runnable) this.f13538e, c1719l1, 1), this.f13536c, this.f13537d);
            default:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f2 = this.f13535b;
                scheduledExecutorServiceC1203f2.getClass();
                return scheduledExecutorServiceC1203f2.f13553b.schedule(new G(scheduledExecutorServiceC1203f2, (Callable) this.f13538e, c1719l1, 2), this.f13536c, this.f13537d);
        }
    }
}
