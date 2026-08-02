package p000;

import android.content.Context;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bx1 implements ju1, InterfaceC0300hv, nb1 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ bx1 f1041k = new bx1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ bx1 f1042l = new bx1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ bx1 f1043m = new bx1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ bx1 f1044n = new bx1(3);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ bx1 f1045o = new bx1(5);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1046j;

    public /* synthetic */ bx1(int i) {
        this.f1046j = i;
    }

    /* JADX INFO: renamed from: c */
    public static aa2 m796c(String str) {
        boolean z;
        ha2 ha2VarMo3885h;
        da2 da2Var = ca2.f1207e;
        ga2 ga2VarM4511c = s92.m4511c();
        ha2 ha2Var = ga2VarM4511c.f2681b;
        if (ha2Var == z92.f9710p) {
            ha2Var = null;
            s92.m4510b(ga2VarM4511c, null);
            z = true;
        } else {
            z = false;
        }
        if (ha2Var == null) {
            UUID uuidM4773b = t92.f7371c.m4773b();
            String strM3505a = n92.m3505a(uuidM4773b);
            p61 p61Var = x92.f8873p;
            sc0 sc0Var = (sc0) s92.f7076a.get();
            if (!sc0Var.isEmpty()) {
                sc0Var.forEach(new w92(1));
            }
            ha2VarMo3885h = new y92(uuidM4773b, strM3505a, str, da2Var, p61Var, ga2VarM4511c);
        } else {
            ha2VarMo3885h = ha2Var instanceof p92 ? ((p92) ha2Var).mo3885h(str, da2Var, false, ga2VarM4511c) : ha2Var.mo2247g(str, da2Var, ga2VarM4511c);
        }
        s92.m4510b(ga2VarM4511c, ha2VarMo3885h);
        return new aa2(ha2VarMo3885h, z);
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f1046j) {
            case 0:
                List list = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 1:
                List list2 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            case 2:
                return new Boolean(((Boolean) xr1.f9046b.get()).booleanValue());
            default:
                return new Boolean(((Boolean) qs1.f6585a.get()).booleanValue());
        }
    }

    @Override // p000.InterfaceC0300hv
    /* JADX INFO: renamed from: b */
    public C0263gv mo797b(Context context, String str, InterfaceC0225fv interfaceC0225fv) {
        int iMo1892b;
        C0263gv c0263gv = new C0263gv();
        int iMo1893c = interfaceC0225fv.mo1893c(context, str);
        c0263gv.f2941a = iMo1893c;
        int i = 1;
        int i2 = 0;
        if (iMo1893c != 0) {
            iMo1892b = interfaceC0225fv.mo1892b(context, str, false);
            c0263gv.f2942b = iMo1892b;
        } else {
            iMo1892b = interfaceC0225fv.mo1892b(context, str, true);
            c0263gv.f2942b = iMo1892b;
        }
        int i3 = c0263gv.f2941a;
        if (i3 == 0) {
            if (iMo1892b == 0) {
                i = 0;
            }
            c0263gv.f2943c = i;
            return c0263gv;
        }
        i2 = i3;
        if (i2 >= iMo1892b) {
            i = -1;
        }
        c0263gv.f2943c = i;
        return c0263gv;
    }

    @Override // p000.nb1
    public Object get() {
        Object obj = x22.f8759j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ThreadFactoryC0862x2.f8751k);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof mq0 ? (mq0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new mq0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }
}
