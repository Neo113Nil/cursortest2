package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq1 implements e70 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ yq1 f9432k = new yq1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yq1 f9433l = new yq1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yq1 f9434m = new yq1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ yq1 f9435n = new yq1(3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9436j;

    public /* synthetic */ yq1(int i) {
        this.f9436j = i;
    }

    @Override // p000.e70
    public final Object apply(Object obj) {
        switch (this.f9436j) {
            case 0:
                Context context = (Context) obj;
                String strM4869b = zq1.f9910b;
                if (strM4869b == null) {
                    synchronized (zq1.class) {
                        try {
                            strM4869b = zq1.f9910b;
                            if (strM4869b == null) {
                                strM4869b = u22.m4869b(context, "com.google.android.gms.measurement");
                                zq1.f9910b = strM4869b;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strM4869b;
            case 1:
                an0 an0Var = y62.f9189i;
                return "";
            case 2:
                u32 u32Var = (u32) obj;
                u72 u72VarM5113z = v72.m5113z();
                if (u32Var == null) {
                    return (v72) u72VarM5113z.m5683d();
                }
                for (x32 x32Var : u32Var.m4886x()) {
                    w72 w72VarM5593z = x72.m5593z();
                    String strM5509t = x32Var.m5509t();
                    w72VarM5593z.m5681b();
                    ((x72) w72VarM5593z.f9011k).m5594A(strM5509t);
                    int iM5508H = x32Var.m5508H();
                    int i = iM5508H - 1;
                    if (iM5508H == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jM5510u = x32Var.m5510u();
                        w72VarM5593z.m5681b();
                        ((x72) w72VarM5593z.f9011k).m5595B(jM5510u);
                    } else if (i == 1) {
                        boolean zM5511v = x32Var.m5511v();
                        w72VarM5593z.m5681b();
                        ((x72) w72VarM5593z.f9011k).m5596C(zM5511v);
                    } else if (i == 2) {
                        double dM5512w = x32Var.m5512w();
                        w72VarM5593z.m5681b();
                        ((x72) w72VarM5593z.f9011k).m5597D(dM5512w);
                    } else if (i == 3) {
                        String strM5513x = x32Var.m5513x();
                        w72VarM5593z.m5681b();
                        ((x72) w72VarM5593z.f9011k).m5598E(strM5513x);
                    } else {
                        if (i != 4) {
                            C0270h1.m2191g("No known flag type");
                            return null;
                        }
                        ko1 ko1VarM5514y = x32Var.m5514y();
                        w72VarM5593z.m5681b();
                        ((x72) w72VarM5593z.f9011k).m5599F(ko1VarM5514y);
                    }
                    x72 x72Var = (x72) w72VarM5593z.m5683d();
                    u72VarM5113z.m5681b();
                    ((v72) u72VarM5113z.f9011k).m5118F(x72Var);
                }
                String strM4885w = u32Var.m4885w();
                u72VarM5113z.m5681b();
                ((v72) u72VarM5113z.f9011k).m5116D(strM4885w);
                String strM4882t = u32Var.m4882t();
                u72VarM5113z.m5681b();
                ((v72) u72VarM5113z.f9011k).m5114B(strM4882t);
                long jM4887y = u32Var.m4887y();
                u72VarM5113z.m5681b();
                ((v72) u72VarM5113z.f9011k).m5117E(jM4887y);
                if (u32Var.m4883u()) {
                    ko1 ko1VarM4884v = u32Var.m4884v();
                    u72VarM5113z.m5681b();
                    ((v72) u72VarM5113z.f9011k).m5115C(ko1VarM4884v);
                }
                return (v72) u72VarM5113z.m5683d();
            default:
                y32 y32Var = (y32) obj;
                if (y32Var.f9143j != 29514) {
                    throw y32Var;
                }
                z42 z42VarM27w = a52.m27w();
                s42 s42VarM4671G = t42.m4671G();
                long jCurrentTimeMillis = System.currentTimeMillis();
                s42VarM4671G.m5681b();
                ((t42) s42VarM4671G.f9011k).m4679I(jCurrentTimeMillis);
                z42VarM27w.m5681b();
                ((a52) z42VarM27w.f9011k).m30x((t42) s42VarM4671G.m5683d());
                return (a52) z42VarM27w.m5683d();
        }
    }
}
