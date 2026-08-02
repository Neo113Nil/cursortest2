package p000;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1529j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Bundle f1530k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v22 f1531l;

    public /* synthetic */ d22(v22 v22Var, Bundle bundle, int i) {
        this.f1529j = i;
        this.f1530k = bundle;
        this.f1531l = v22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1529j;
        Bundle bundle = this.f1530k;
        v22 v22Var = this.f1531l;
        switch (i) {
            case 0:
                v22Var.mo11z();
                v22Var.m3446B();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                p80.m3860e(string);
                p80.m3860e(string2);
                p80.m3863h(bundle.get("value"));
                f02 f02Var = (f02) v22Var.f7192j;
                if (!f02Var.m1565d()) {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5312a("Conditional property not set since app measurement is disabled");
                } else {
                    b72 b72Var = new b72(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        f72 f72Var = f02Var.f2250r;
                        f02.m1558k(f72Var);
                        bundle.getString("app_id");
                        fu1 fu1VarM1728i0 = f72Var.m1728i0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        f02.m1558k(f72Var);
                        bundle.getString("app_id");
                        fu1 fu1VarM1728i1 = f72Var.m1728i0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        f02Var.m1573p().m5072T(new hr1(bundle.getString("app_id"), string2, b72Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), fu1VarM1728i1, bundle.getLong("trigger_timeout"), fu1VarM1728i0, bundle.getLong("time_to_live"), f72Var.m1728i0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                v22Var.mo11z();
                v22Var.m3446B();
                String string3 = bundle.getString("name");
                p80.m3860e(string3);
                f02 f02Var2 = (f02) v22Var.f7192j;
                if (!f02Var2.m1565d()) {
                    ky1 ky1Var2 = f02Var2.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4608w.m5312a("Conditional property not cleared since app measurement is disabled");
                } else {
                    b72 b72Var2 = new b72(0L, null, string3, "");
                    try {
                        f72 f72Var2 = f02Var2.f2250r;
                        f02.m1558k(f72Var2);
                        bundle.getString("app_id");
                        f02Var2.m1573p().m5072T(new hr1(bundle.getString("app_id"), "", b72Var2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), f72Var2.m1728i0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                jg0 jg0Var = v22Var.f8009E;
                f02 f02Var3 = (f02) v22Var.f7192j;
                if (!bundle.isEmpty()) {
                    fz1 fz1Var = f02Var3.f2246n;
                    f72 f72Var3 = f02Var3.f2250r;
                    bt1 bt1Var = f02Var3.f2245m;
                    ky1 ky1Var3 = f02Var3.f2247o;
                    f02.m1558k(fz1Var);
                    Bundle bundle2 = new Bundle(fz1Var.f2548H.m1677x());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            f02.m1558k(f72Var3);
                            if (f72.m1683N0(obj)) {
                                f72.m1684S(jg0Var, null, 27, null, null, 0);
                            }
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4605t.m5314c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (f72.m1692f0(str)) {
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4605t.m5313b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            f02.m1558k(f72Var3);
                            bt1Var.getClass();
                            if (f72Var3.m1699E("param", str, 500, obj)) {
                                f72Var3.m1720R(bundle2, str, obj);
                            }
                        }
                    }
                    f02.m1558k(f72Var3);
                    f72 f72Var4 = ((f02) bt1Var.f7192j).f2250r;
                    f02.m1558k(f72Var4);
                    int i2 = f72Var4.m1730l0(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        f02.m1558k(f72Var3);
                        f72.m1684S(jg0Var, null, 26, null, null, 0);
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4605t.m5312a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                fz1 fz1Var2 = f02Var3.f2246n;
                f02.m1558k(fz1Var2);
                fz1Var2.f2548H.m1649B(bundle);
                f02Var3.m1573p().m5058F(bundle);
                break;
        }
    }
}
