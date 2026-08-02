package p000;

import android.os.Trace;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s92 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f7076a;

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f7077b;

    /* JADX INFO: renamed from: c */
    public static final C0229fz f7078c;

    static {
        sc0.m4514l(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f7076a = new AtomicReference(w01.f8328s);
        f7077b = new WeakHashMap();
        f7078c = new C0229fz(3);
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public static ha2 m4509a() {
        ga2 ga2VarM4511c = m4511c();
        ha2 ha2Var = ga2VarM4511c.f2681b;
        if (ha2Var != null && ha2Var != z92.f9710p) {
            return ha2Var;
        }
        p61 p61Var = x92.f8873p;
        UUID uuidM4773b = t92.f7371c.m4773b();
        String strM3505a = n92.m3505a(uuidM4773b);
        sc0 sc0Var = (sc0) f7076a.get();
        if (!sc0Var.isEmpty()) {
            sc0Var.forEach(new w92(0));
        }
        return new x92(uuidM4773b, strM3505a, x92.f8873p, ga2VarM4511c);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX INFO: renamed from: b */
    public static ha2 m4510b(ga2 ga2Var, ha2 ha2Var) {
        ga2Var.getClass();
        ha2 ha2Var2 = ga2Var.f2681b;
        if (ha2Var2 != ha2Var) {
            if (ha2Var2 == null) {
                ga2Var.f2680a = Trace.isEnabled();
            }
            if (ga2Var.f2680a) {
                if (ha2Var2 != null) {
                    if (ha2Var != null) {
                        if (((n92) ha2Var2).f5338j == ha2Var && !kd0.m3023w(ha2Var2)) {
                            Trace.endSection();
                        } else if (ha2Var2 == ((n92) ha2Var).f5338j && !kd0.m3023w(ha2Var)) {
                            kd0.m3024x(ha2Var);
                        }
                    }
                    kd0.m3022v(ha2Var2);
                    if (ha2Var != null) {
                        kd0.m3021u(ha2Var);
                    }
                } else if (ha2Var != null) {
                    kd0.m3021u(ha2Var);
                }
            }
            if (ha2Var2 != ha2Var) {
                ga2Var.f2681b = ha2Var;
                return ha2Var2;
            }
        }
        return ha2Var;
    }

    /* JADX INFO: renamed from: c */
    public static ga2 m4511c() {
        return (ga2) f7078c.get();
    }
}
