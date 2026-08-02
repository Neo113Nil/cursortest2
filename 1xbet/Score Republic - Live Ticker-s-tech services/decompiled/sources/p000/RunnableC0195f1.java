package p000;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0195f1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2259j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2260k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2261l;

    public /* synthetic */ RunnableC0195f1(C0915yi c0915yi, ListenableFuture listenableFuture, int i) {
        this.f2259j = 1;
        this.f2260k = c0915yi;
        this.f2261l = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0554or interfaceC0554or;
        switch (this.f2259j) {
            case 0:
                C0232g1 c0232g1 = (C0232g1) this.f2260k;
                C0561oy c0561oy = (C0561oy) this.f2261l;
                c0232g1.getClass();
                try {
                    n80.m3496e("Updating active experiment: ".concat(c0561oy.toString()));
                    c0232g1.f2572a.m4466a(new C0158e1(c0561oy.m3808o(), c0561oy.m3813t(), c0561oy.m3811r(), new Date(c0561oy.m3809p()), c0561oy.m3812s(), c0561oy.m3810q()));
                    return;
                } catch (C0122d1 e) {
                    Log.e("FIAM.Headless", "Unable to set experiment as active with ABT, missing analytics?\n" + e.getMessage());
                    return;
                }
            case 1:
                C0915yi c0915yi = (C0915yi) this.f2260k;
                ListenableFuture listenableFuture = (ListenableFuture) this.f2261l;
                try {
                    if (!listenableFuture.isCancelled()) {
                        try {
                            k70.m2991b(listenableFuture);
                        } catch (Error | RuntimeException e2) {
                            c0915yi.m5803r(e2);
                        } catch (ExecutionException e3) {
                            c0915yi.m5803r(e3.getCause());
                        }
                        break;
                    } else {
                        c0915yi.f9305u = null;
                        c0915yi.cancel(false);
                    }
                    c0915yi.m5802q(null);
                    return;
                } catch (Throwable th) {
                    c0915yi.m5802q(null);
                    throw th;
                }
            case 2:
                ((C0915yi) this.f2260k).m5802q((lc0) this.f2261l);
                return;
            case 3:
                ExecutorC0237g5 executorC0237g5 = (ExecutorC0237g5) this.f2260k;
                try {
                    ((Runnable) this.f2261l).run();
                    return;
                } finally {
                    executorC0237g5.m1986a();
                }
            case 4:
                AbstractActivityC0790v4 abstractActivityC0790v4 = (AbstractActivityC0790v4) this.f2260k;
                abstractActivityC0790v4.f2430j.m437a(new C0916yj((gu0) this.f2261l, abstractActivityC0790v4));
                return;
            case 5:
                tu0 tu0Var = (tu0) this.f2260k;
                my0 my0Var = (my0) this.f2261l;
                if (tu0Var.f7604b != tu0.f7602d) {
                    C0270h1.m2191g("provide() can be called only once.");
                    return;
                }
                synchronized (tu0Var) {
                    interfaceC0554or = tu0Var.f7603a;
                    tu0Var.f7603a = null;
                    tu0Var.f7604b = my0Var;
                    break;
                }
                interfaceC0554or.mo1169a(my0Var);
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f2260k;
                my0 my0Var2 = (my0) this.f2261l;
                synchronized (hh0Var) {
                    try {
                        if (hh0Var.f3211b == null) {
                            hh0Var.f3210a.add(my0Var2);
                        } else {
                            hh0Var.f3211b.add(my0Var2.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 7:
                ThreadFactoryC0883xn threadFactoryC0883xn = (ThreadFactoryC0883xn) this.f2260k;
                Runnable runnable = (Runnable) this.f2261l;
                Process.setThreadPriority(threadFactoryC0883xn.f8998l);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC0883xn.f8999m;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 8:
                Callable callable = (Callable) this.f2260k;
                ScheduledFutureC0407ks scheduledFutureC0407ks = (ScheduledFutureC0407ks) ((nu1) this.f2261l).f5551k;
                try {
                    scheduledFutureC0407ks.m5018j(callable.call());
                    return;
                } catch (Exception e4) {
                    scheduledFutureC0407ks.mo4867k(e4);
                    return;
                }
            case 9:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2260k;
                qc1 qc1Var = (qc1) this.f2261l;
                try {
                    qc1Var.m4061b(firebaseMessaging.m1008a());
                    return;
                } catch (Exception e5) {
                    qc1Var.m4060a(e5);
                    return;
                }
            case 10:
                dc0 dc0Var = (dc0) this.f2260k;
                qc1 qc1Var2 = (qc1) this.f2261l;
                try {
                    qc1Var2.m4061b(dc0Var.m1155a());
                    return;
                } catch (Exception e6) {
                    qc1Var2.m4060a(e6);
                    return;
                }
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f2260k;
                JobParameters jobParameters = (JobParameters) this.f2261l;
                int i = JobInfoSchedulerService.f1324j;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                ((C0940z6) this.f2260k).m5864b((Typeface) this.f2261l);
                return;
        }
    }

    public /* synthetic */ RunnableC0195f1(int i, Object obj, Object obj2) {
        this.f2259j = i;
        this.f2260k = obj;
        this.f2261l = obj2;
    }
}
