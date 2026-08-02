package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx1 implements ju1, InterfaceC0300hv, y01, InterfaceC0845wm, nb1 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ dx1 f1872k = new dx1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ dx1 f1873l = new dx1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ dx1 f1874m = new dx1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ dx1 f1875n = new dx1(4);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ dx1 f1876o = new dx1(6);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1877j;

    public /* synthetic */ dx1(int i) {
        this.f1877j = i;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f1877j) {
            case 0:
                List list = jx1.f4164a;
                return (Boolean) ks1.f4509b.get();
            case 1:
                List list2 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(0, 10000L, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) cs1.f1448a.get()).booleanValue());
        }
    }

    @Override // p000.y01
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = e22.f1910k;
    }

    @Override // p000.InterfaceC0300hv
    /* JADX INFO: renamed from: b */
    public C0263gv mo797b(Context context, String str, InterfaceC0225fv interfaceC0225fv) {
        C0263gv c0263gv = new C0263gv();
        int iMo1893c = interfaceC0225fv.mo1893c(context, str);
        c0263gv.f2941a = iMo1893c;
        if (iMo1893c != 0) {
            c0263gv.f2943c = -1;
            return c0263gv;
        }
        int iMo1892b = interfaceC0225fv.mo1892b(context, str, true);
        c0263gv.f2942b = iMo1892b;
        if (iMo1892b != 0) {
            c0263gv.f2943c = 1;
        }
        return c0263gv;
    }

    @Override // p000.nb1
    public /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
            sb.append("Memory state is: ");
            sb.append(i);
            Log.i("PhenotypeProcessReaper", sb.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z = true;
            }
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        return new Boolean(z);
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) {
        zo1 zo1VarM5683d;
        g12 g12Var = (g12) v92Var.m5131g();
        t32 t32VarM4874z = u32.m4874z();
        String str = g12Var.f2575j;
        t32VarM4874z.m5681b();
        ((u32) t32VarM4874z.f9011k).m4875A(str);
        String str2 = g12Var.f2577l;
        t32VarM4874z.m5681b();
        ((u32) t32VarM4874z.f9011k).m4877C(str2);
        boolean z = g12Var.f2580o;
        t32VarM4874z.m5681b();
        ((u32) t32VarM4874z.f9011k).m4880F(z);
        long j = g12Var.f2581p;
        t32VarM4874z.m5681b();
        ((u32) t32VarM4874z.f9011k).m4881G(j);
        byte[] bArr = g12Var.f2576k;
        if (bArr != null) {
            jo1 jo1VarM3063j = ko1.m3063j(bArr, 0, bArr.length);
            t32VarM4874z.m5681b();
            ((u32) t32VarM4874z.f9011k).m4876B(jo1VarM3063j);
        }
        for (e12 e12Var : g12Var.f2578m) {
            for (n12 n12Var : e12Var.f1903k) {
                int i = n12Var.f5256p;
                String str3 = n12Var.f5250j;
                if (i == 1) {
                    w32 w32VarM5501z = x32.m5501z();
                    w32VarM5501z.m5233g(str3);
                    if (i != 1) {
                        C0270h1.m2190f("Not a long type");
                        return null;
                    }
                    long j2 = n12Var.f5251k;
                    w32VarM5501z.m5681b();
                    ((x32) w32VarM5501z.f9011k).m5503C(j2);
                    zo1VarM5683d = w32VarM5501z.m5683d();
                } else if (i == 2) {
                    w32 w32VarM5501z2 = x32.m5501z();
                    w32VarM5501z2.m5233g(str3);
                    if (i != 2) {
                        C0270h1.m2190f("Not a boolean type");
                        return null;
                    }
                    boolean z2 = n12Var.f5252l;
                    w32VarM5501z2.m5681b();
                    ((x32) w32VarM5501z2.f9011k).m5504D(z2);
                    zo1VarM5683d = w32VarM5501z2.m5683d();
                } else if (i == 3) {
                    w32 w32VarM5501z3 = x32.m5501z();
                    w32VarM5501z3.m5233g(str3);
                    if (i != 3) {
                        C0270h1.m2190f("Not a double type");
                        return null;
                    }
                    double d = n12Var.f5253m;
                    w32VarM5501z3.m5681b();
                    ((x32) w32VarM5501z3.f9011k).m5505E(d);
                    zo1VarM5683d = w32VarM5501z3.m5683d();
                } else if (i == 4) {
                    w32 w32VarM5501z4 = x32.m5501z();
                    w32VarM5501z4.m5233g(str3);
                    if (i != 4) {
                        C0270h1.m2190f("Not a String type");
                        return null;
                    }
                    String str4 = n12Var.f5254n;
                    p80.m3863h(str4);
                    w32VarM5501z4.m5681b();
                    ((x32) w32VarM5501z4.f9011k).m5506F(str4);
                    zo1VarM5683d = w32VarM5501z4.m5683d();
                } else {
                    if (i != 5) {
                        C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 24), "Unrecognized flag type: ", i));
                        return null;
                    }
                    w32 w32VarM5501z5 = x32.m5501z();
                    w32VarM5501z5.m5233g(str3);
                    if (i != 5) {
                        C0270h1.m2190f("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = n12Var.f5255o;
                    p80.m3863h(bArr2);
                    jo1 jo1VarM3063j2 = ko1.m3063j(bArr2, 0, bArr2.length);
                    w32VarM5501z5.m5681b();
                    ((x32) w32VarM5501z5.f9011k).m5507G(jo1VarM3063j2);
                    zo1VarM5683d = w32VarM5501z5.m5683d();
                }
                t32VarM4874z.m5681b();
                ((u32) t32VarM4874z.f9011k).m4878D((x32) zo1VarM5683d);
            }
            String[] strArr = e12Var.f1904l;
            if (strArr != null) {
                for (String str5 : strArr) {
                    t32VarM4874z.m5681b();
                    ((u32) t32VarM4874z.f9011k).m4879E(str5);
                }
            }
        }
        return (u32) t32VarM4874z.m5683d();
    }
}
