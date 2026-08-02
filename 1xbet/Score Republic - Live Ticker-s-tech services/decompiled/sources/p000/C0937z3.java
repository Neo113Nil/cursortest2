package p000;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937z3 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9589a;

    /* JADX INFO: renamed from: b */
    public final oy0 f9590b;

    public /* synthetic */ C0937z3(oy0 oy0Var, int i) {
        this.f9589a = i;
        this.f9590b = oy0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        pl0 pl0Var;
        List list;
        switch (this.f9589a) {
            case 0:
                w30 w30Var = ((C0900y3) this.f9590b.get()).f9139b;
                yd0.m5765d(w30Var);
                return w30Var;
            case 1:
                return new C0900y3((InterfaceC0826w3) this.f9590b.get());
            case 2:
                C0666rs c0666rs = new C0666rs();
                c0666rs.f6946a = new HashMap();
                c0666rs.f6947b = new HashMap();
                c0666rs.f6948c = new HashMap();
                c0666rs.f6949d = new HashMap();
                return c0666rs;
            case 3:
                Application application = (Application) this.f9590b.get();
                r40 r40Var = new r40();
                C0013ac c0013ac = r40Var.f6709n;
                c0013ac.getClass();
                r20 r20Var = new r20(3, c0013ac);
                int i = g20.f2582j;
                zg1.m5906q("capacity", i);
                w30 w30VarM1972c = new r30(r20Var, i).m1972c();
                w30VarM1972c.m5230f();
                application.registerActivityLifecycleCallbacks(r40Var);
                return w30VarM1972c;
            case 4:
                String str = (String) this.f9590b.get();
                Logger logger = pl0.f6201c;
                synchronized (pl0.class) {
                    try {
                        if (pl0.f6202d == null) {
                            List<nl0> listM3408j = AbstractC0477mo.m3408j(nl0.class, pl0.m3963a(), nl0.class.getClassLoader(), new aa0(6));
                            pl0.f6202d = new pl0();
                            for (nl0 nl0Var : listM3408j) {
                                pl0.f6201c.fine("Service loader found " + nl0Var);
                                pl0 pl0Var2 = pl0.f6202d;
                                synchronized (pl0Var2) {
                                    nl0Var.getClass();
                                    pl0Var2.f6203a.add(nl0Var);
                                    break;
                                }
                            }
                            pl0 pl0Var3 = pl0.f6202d;
                            synchronized (pl0Var3) {
                                ArrayList arrayList = new ArrayList(pl0Var3.f6203a);
                                Collections.sort(arrayList, Collections.reverseOrder(new ol0(0)));
                                pl0Var3.f6204b = Collections.unmodifiableList(arrayList);
                            }
                        }
                        pl0Var = pl0.f6202d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (pl0Var) {
                    list = pl0Var.f6204b;
                }
                if ((list.isEmpty() ? null : (nl0) list.get(0)) != null) {
                    return new it0(str).f3646g.m3048N();
                }
                throw new C0694sj("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact", 4);
            case 5:
                return new w90((jd0) this.f9590b.get());
            case 6:
                return new yc0((by0) this.f9590b.get());
            case 7:
                return new by0((Application) this.f9590b.get(), "fiam_eligible_campaigns_cache_file");
            case 8:
                return new by0((Application) this.f9590b.get(), "fiam_impressions_store_file");
            case 9:
                return new by0((Application) this.f9590b.get(), "rate_limit_store_file");
            default:
                return new py0((Application) this.f9590b.get());
        }
    }

    public /* synthetic */ C0937z3(Object obj, oy0 oy0Var, int i) {
        this.f9589a = i;
        this.f9590b = oy0Var;
    }
}
