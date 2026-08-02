package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5539j;

    /* JADX INFO: renamed from: k */
    public boolean f5540k;

    /* JADX INFO: renamed from: l */
    public final Object f5541l;

    /* JADX INFO: renamed from: m */
    public final Object f5542m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f5543n;

    public nt0(ot0 ot0Var, mb0 mb0Var) {
        this.f5539j = 0;
        this.f5543n = ot0Var;
        Level level = Level.FINE;
        this.f5541l = new f50(17);
        this.f5540k = true;
        this.f5542m = mb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ja1 ja1VarM2840h;
        Executor executorUnconfigurableExecutorService;
        int iM1001a;
        switch (this.f5539j) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("OkHttpClientTransport");
                while (true) {
                    try {
                        boolean zM3367a = ((mb0) this.f5542m).m3367a(this);
                        ot0 ot0Var = (ot0) this.f5543n;
                        if (!zM3367a) {
                            synchronized (ot0Var.f5895k) {
                                ja1VarM2840h = ((ot0) this.f5543n).f5906v;
                                break;
                            }
                            if (ja1VarM2840h == null) {
                                ja1VarM2840h = ja1.f3883m.m2840h("End of stream or IOException");
                            }
                            ((ot0) this.f5543n).m3783r(0, EnumC0227fx.f2516m, ja1VarM2840h);
                            try {
                                ((mb0) this.f5542m).close();
                            } catch (IOException e) {
                                e = e;
                                ot0.f5869Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            } catch (RuntimeException e2) {
                                if (!"bio == null".equals(e2.getMessage())) {
                                    throw e2;
                                }
                            }
                            break;
                        } else {
                            wg0 wg0Var = ot0Var.f5875F;
                            if (wg0Var != null) {
                                wg0Var.m5328a();
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            ot0 ot0Var2 = (ot0) this.f5543n;
                            EnumC0227fx enumC0227fx = EnumC0227fx.f2515l;
                            ja1 ja1VarM2839g = ja1.f3882l.m2840h("error in frame handler").m2839g(th);
                            Map map = ot0.f5868P;
                            ot0Var2.m3783r(0, enumC0227fx, ja1VarM2839g);
                            try {
                                ((mb0) this.f5542m).close();
                            } catch (IOException e3) {
                                e = e3;
                                ot0.f5869Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            } catch (RuntimeException e4) {
                                if (!"bio == null".equals(e4.getMessage())) {
                                    throw e4;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                ((mb0) this.f5542m).close();
                                break;
                            } catch (IOException e5) {
                                ot0.f5869Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e5);
                            } catch (RuntimeException e6) {
                                if (!"bio == null".equals(e6.getMessage())) {
                                    throw e6;
                                }
                            }
                            ((ot0) this.f5543n).f5892h.m3363l();
                            Thread.currentThread().setName(name);
                            throw th2;
                        }
                        break;
                    }
                    ((ot0) this.f5543n).f5892h.m3363l();
                    Thread.currentThread().setName(name);
                    return;
                }
            case 1:
                Intent intent = (Intent) this.f5541l;
                Context context = (Context) this.f5542m;
                boolean z = this.f5540k;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f5543n;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            C0914yh c0914yh = new C0914yh(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f1360b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hr0("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f1360b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new RunnableC0702sr(context, c0914yh, countDownLatch, 8, false));
                            try {
                                iIntValue = ((Integer) hn0.m2310a(new C0312i6(context).m2550v(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e7) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e8) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e8.toString()));
                            }
                        }
                        iM1001a = iIntValue;
                        break;
                    } else {
                        iM1001a = FirebaseInstanceIdReceiver.m1001a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iM1001a);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th4;
                }
            case 2:
                v42 v42Var = (v42) this.f5543n;
                nx1 nx1Var = v42Var.f8065m;
                if (nx1Var != null) {
                    v42Var.m5071S(nx1Var, this.f5540k ? null : (b72) this.f5542m, (z72) this.f5541l);
                    v42Var.m5066N();
                    return;
                } else {
                    ky1 ky1Var = ((f02) v42Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5312a("Discarding data. Failed to set user property");
                    return;
                }
            case 3:
                v42 v42Var2 = (v42) this.f5543n;
                nx1 nx1Var2 = v42Var2.f8065m;
                if (nx1Var2 != null) {
                    v42Var2.m5071S(nx1Var2, this.f5540k ? null : (fu1) this.f5542m, (z72) this.f5541l);
                    v42Var2.m5066N();
                    return;
                } else {
                    ky1 ky1Var2 = ((f02) v42Var2.f7192j).f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5312a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                v42 v42Var3 = (v42) this.f5543n;
                nx1 nx1Var3 = v42Var3.f8065m;
                if (nx1Var3 != null) {
                    v42Var3.m5071S(nx1Var3, this.f5540k ? null : (hr1) this.f5542m, (z72) this.f5541l);
                    v42Var3.m5066N();
                    return;
                } else {
                    ky1 ky1Var3 = ((f02) v42Var3.f7192j).f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5312a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ nt0(v42 v42Var, z72 z72Var, boolean z, AbstractC0823w0 abstractC0823w0, int i) {
        this.f5539j = i;
        this.f5541l = z72Var;
        this.f5540k = z;
        this.f5542m = abstractC0823w0;
        this.f5543n = v42Var;
    }

    public nt0(v42 v42Var, z72 z72Var, boolean z, hr1 hr1Var) {
        this.f5539j = 4;
        this.f5541l = z72Var;
        this.f5540k = z;
        this.f5542m = hr1Var;
        Objects.requireNonNull(v42Var);
        this.f5543n = v42Var;
    }

    public /* synthetic */ nt0(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f5539j = 1;
        this.f5541l = intent;
        this.f5542m = context;
        this.f5540k = z;
        this.f5543n = pendingResult;
    }
}
