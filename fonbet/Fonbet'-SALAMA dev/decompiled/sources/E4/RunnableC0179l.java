package E4;

import A1.C0043s0;
import F2.C0247p;
import G4.C0279l;
import G4.RunnableC0275h;
import G4.X;
import U5.Q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import w1.C1726n0;
import w1.F0;

/* renamed from: E4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0179l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2203b;

    public /* synthetic */ RunnableC0179l(t tVar, int i7) {
        this.f2202a = i7;
        this.f2203b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2202a) {
            case 0:
                t tVar = this.f2203b;
                C0043s0 c0043s0 = tVar.f2236h;
                c0043s0.getClass();
                Q0.a.v(1, "RemoteStore", "Shutting down", new Object[0]);
                F0 f02 = (F0) c0043s0.f557g;
                Runnable runnable = (Runnable) f02.f17375d;
                if (runnable != null) {
                    runnable.run();
                    f02.f17375d = null;
                }
                c0043s0.f552b = false;
                c0043s0.c();
                C0247p c0247p = ((K4.j) c0043s0.f556f).f4026c.f4056d;
                c0247p.getClass();
                try {
                    Q q7 = (Q) Tasks.await((Task) c0247p.f2706a);
                    q7.w();
                    try {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (!q7.s(1L, timeUnit)) {
                            Q0.a.v(1, K4.r.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                            q7.x();
                            if (!q7.s(60L, timeUnit)) {
                                Q0.a.v(2, K4.r.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                            }
                        }
                    } catch (InterruptedException unused) {
                        q7.x();
                        Q0.a.v(2, K4.r.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException unused2) {
                    Q0.a.v(2, K4.r.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e7) {
                    Q0.a.v(2, K4.r.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e7);
                }
                ((K4.u) c0043s0.f558h).e(1);
                tVar.f2234f.L();
                X x4 = tVar.f2239l;
                if (x4 != null) {
                    x4.stop();
                }
                C1726n0 c1726n0 = tVar.f2238k;
                if (c1726n0 != null) {
                    c1726n0.stop();
                    break;
                }
                break;
            case 1:
                this.f2203b.f2236h.e();
                break;
            case 2:
                C0043s0 c0043s02 = this.f2203b.f2236h;
                c0043s02.f552b = false;
                c0043s02.c();
                ((K4.u) c0043s02.f558h).e(3);
                break;
            default:
                C0279l c0279l = this.f2203b.f2235g;
                c0279l.getClass();
                c0279l.f2991a.H(new RunnableC0275h(c0279l, 2), "Delete All Indexes");
                break;
        }
    }
}
