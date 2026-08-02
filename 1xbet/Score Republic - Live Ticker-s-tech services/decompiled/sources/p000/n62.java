package p000;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n62 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5309j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ y62 f5310k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0002a1 f5311l;

    public /* synthetic */ n62(y62 y62Var, C0002a1 c0002a1, int i) {
        this.f5309j = i;
        this.f5310k = y62Var;
        this.f5311l = c0002a1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:5:0x0009, B:7:0x001f, B:18:0x0030, B:18:0x0030, B:20:0x003e, B:20:0x003e, B:22:0x004a, B:22:0x004a, B:28:0x005c, B:28:0x005c, B:30:0x0060, B:30:0x0060, B:12:0x0027, B:33:0x009a, B:33:0x009a), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TRY_LEAVE, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:5:0x0009, B:7:0x001f, B:18:0x0030, B:18:0x0030, B:20:0x003e, B:20:0x003e, B:22:0x004a, B:22:0x004a, B:28:0x005c, B:28:0x005c, B:30:0x0060, B:30:0x0060, B:12:0x0027, B:33:0x009a, B:33:0x009a), top: B:46:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        C0415l c0415l;
        s72 s72Var;
        switch (this.f5309j) {
            case 0:
                y62 y62Var = this.f5310k;
                try {
                    k70.m2991b(this.f5311l);
                    return;
                } catch (Exception e) {
                    String str = y62Var.f9193c;
                    Log.w("FlagStore", AbstractC0024an.m286i(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                y62 y62Var2 = this.f5310k;
                try {
                    v72 v72Var = (v72) k70.m2991b(this.f5311l);
                    C0415l c0415l2 = new C0415l(v72Var, new vr0(6, 2));
                    boolean z = y62Var2.f9195e;
                    if (z || (c0415l = y62Var2.f9191a) == null) {
                        synchronized (y62Var2) {
                            if (!z) {
                                c0415l = y62Var2.f9191a;
                                if (c0415l != null) {
                                    if (!((v01) c0415l.f4616d).equals((v01) c0415l2.f4616d)) {
                                        s72Var = (s72) y62Var2.f9192b.f8767e.get();
                                        if (s72Var != null) {
                                            s72Var.mo3638a();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            y62Var2.f9191a = c0415l2;
                            ((AtomicInteger) y62Var2.f9197g.f1083k).incrementAndGet();
                        }
                    } else if (!((v01) c0415l.f4616d).equals((v01) c0415l2.f4616d)) {
                        s72Var = (s72) y62Var2.f9192b.f8767e.get();
                        if (s72Var != null) {
                            s72Var.mo3638a();
                            return;
                        }
                        return;
                    }
                    if (y62Var2.f9195e) {
                        x22 x22Var = y62Var2.f9192b;
                        b42 b42Var = (b42) x22Var.f8766d.get();
                        String strM5119t = v72Var.m5119t();
                        b42Var.getClass();
                        strM5119t.getClass();
                        C0305i c0305iM590b = b42.m590b(b42Var.f710a.m1349c(strM5119t));
                        q62 q62Var = new q62(0, y62Var2);
                        mq0 mq0VarM5498a = x22Var.m5498a();
                        int i = AbstractRunnableC0378k.f4237u;
                        C0341j c0341j = new C0341j(c0305iM590b, Throwable.class, q62Var);
                        c0305iM590b.mo995c(c0341j, vk1.m5169f(mq0VarM5498a, c0341j));
                        return;
                    }
                    return;
                } catch (CancellationException | ExecutionException e2) {
                    if (e2.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = y62Var2.f9193c;
                    Log.w("FlagStore", AbstractC0024an.m286i(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e2);
                    return;
                }
        }
    }
}
