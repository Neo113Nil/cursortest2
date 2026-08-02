package p000;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nz1 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5567j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ sz1 f5568k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f5569l;

    public /* synthetic */ nz1(sz1 sz1Var, String str, int i) {
        this.f5567j = i;
        this.f5568k = sz1Var;
        this.f5569l = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5567j;
        String str = this.f5569l;
        sz1 sz1Var = this.f5568k;
        switch (i) {
            case 0:
                return new y12(new nz1(sz1Var, str, 1));
            case 1:
                qt1 qt1Var = sz1Var.f1566k.f8823l;
                x62.m5533U(qt1Var);
                uy1 uy1VarM4149E0 = qt1Var.m4149E0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((f02) sz1Var.f7192j).f2245m.m765G();
                map.put("gmp_version", 161000L);
                if (uy1VarM4149E0 != null) {
                    String strM4972O = uy1VarM4149E0.m4972O();
                    if (strM4972O != null) {
                        map.put("app_version", strM4972O);
                    }
                    map.put("app_version_int", Long.valueOf(uy1VarM4149E0.m4974Q()));
                    map.put("dynamite_version", Long.valueOf(uy1VarM4149E0.m4979b()));
                }
                return map;
            default:
                a81 a81Var = new a81(11, sz1Var, str);
                m42 m42Var = new m42("internal.remoteConfig", 0);
                m42Var.f975k.put("getValue", new y12(m42Var, a81Var));
                return m42Var;
        }
    }
}
