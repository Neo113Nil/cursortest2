package h4;

import w1.C1719l1;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1202e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1203f f13549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1719l1 f13551d;

    public /* synthetic */ RunnableC1202e(ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f, Runnable runnable, C1719l1 c1719l1, int i7) {
        this.f13548a = i7;
        this.f13549b = scheduledExecutorServiceC1203f;
        this.f13550c = runnable;
        this.f13551d = c1719l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13548a) {
            case 0:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f = this.f13549b;
                scheduledExecutorServiceC1203f.getClass();
                final C1719l1 c1719l1 = this.f13551d;
                final Runnable runnable = this.f13550c;
                final int i7 = 0;
                scheduledExecutorServiceC1203f.f13552a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1205h) c1719l1.f17771a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC1205h) c1719l1.f17771a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC1205h scheduledFutureC1205h = (ScheduledFutureC1205h) c1719l1.f17771a;
                                try {
                                    runnable2.run();
                                    scheduledFutureC1205h.p(null);
                                    return;
                                } catch (Exception e9) {
                                    scheduledFutureC1205h.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f2 = this.f13549b;
                scheduledExecutorServiceC1203f2.getClass();
                final C1719l1 c1719l12 = this.f13551d;
                final Runnable runnable2 = this.f13550c;
                final int i8 = 2;
                scheduledExecutorServiceC1203f2.f13552a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1205h) c1719l12.f17771a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC1205h) c1719l12.f17771a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC1205h scheduledFutureC1205h = (ScheduledFutureC1205h) c1719l12.f17771a;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1205h.p(null);
                                    return;
                                } catch (Exception e9) {
                                    scheduledFutureC1205h.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC1203f scheduledExecutorServiceC1203f3 = this.f13549b;
                scheduledExecutorServiceC1203f3.getClass();
                final C1719l1 c1719l13 = this.f13551d;
                final Runnable runnable3 = this.f13550c;
                final int i9 = 1;
                scheduledExecutorServiceC1203f3.f13552a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1205h) c1719l13.f17771a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC1205h) c1719l13.f17771a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC1205h scheduledFutureC1205h = (ScheduledFutureC1205h) c1719l13.f17771a;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1205h.p(null);
                                    return;
                                } catch (Exception e9) {
                                    scheduledFutureC1205h.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
