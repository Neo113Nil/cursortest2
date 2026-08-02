package p000;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0260gs implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2864j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ScheduledExecutorServiceC0333is f2865k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Runnable f2866l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ nu1 f2867m;

    public /* synthetic */ RunnableC0260gs(ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is, Runnable runnable, nu1 nu1Var, int i) {
        this.f2864j = i;
        this.f2865k = scheduledExecutorServiceC0333is;
        this.f2866l = runnable;
        this.f2867m = nu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2864j;
        final nu1 nu1Var = this.f2867m;
        final Runnable runnable = this.f2866l;
        ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is = this.f2865k;
        switch (i) {
            case 0:
                final int i2 = 0;
                scheduledExecutorServiceC0333is.f3641j.execute(new Runnable() { // from class: es
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        nu1 nu1Var2 = nu1Var;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0407ks scheduledFutureC0407ks = (ScheduledFutureC0407ks) nu1Var2.f5551k;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0407ks.m5018j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0407ks.mo4867k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                scheduledExecutorServiceC0333is.f3641j.execute(new Runnable() { // from class: es
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        nu1 nu1Var2 = nu1Var;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0407ks scheduledFutureC0407ks = (ScheduledFutureC0407ks) nu1Var2.f5551k;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0407ks.m5018j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0407ks.mo4867k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                scheduledExecutorServiceC0333is.f3641j.execute(new Runnable() { // from class: es
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        nu1 nu1Var2 = nu1Var;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0407ks) nu1Var2.f5551k).mo4867k(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0407ks scheduledFutureC0407ks = (ScheduledFutureC0407ks) nu1Var2.f5551k;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0407ks.m5018j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0407ks.mo4867k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
