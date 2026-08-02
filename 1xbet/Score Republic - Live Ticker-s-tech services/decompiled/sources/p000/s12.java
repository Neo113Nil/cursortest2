package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s12 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7007j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ v22 f7008k;

    public /* synthetic */ s12(v22 v22Var, int i) {
        this.f7007j = i;
        this.f7008k = v22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7007j;
        v22 v22Var = this.f7008k;
        switch (i) {
            case 0:
                v22Var.m5042X();
                break;
            case 1:
                iz1 iz1Var = v22Var.f8024z;
                f02 f02Var = iz1Var.f3760a;
                a02 a02Var = f02Var.f2248p;
                v22 v22Var2 = f02Var.f2254v;
                fz1 fz1Var = f02Var.f2246n;
                f02.m1560m(a02Var);
                a02Var.mo11z();
                if (iz1Var.m2753d()) {
                    if (iz1Var.m2752c()) {
                        f02.m1558k(fz1Var);
                        fz1Var.f2546F.m5182m(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        f02.m1559l(v22Var2);
                        v22Var2.m5026H("auto", "_cmpx", bundle);
                    } else {
                        f02.m1558k(fz1Var);
                        C0809vn c0809vn = fz1Var.f2546F;
                        String strM5181l = c0809vn.m5181l();
                        if (TextUtils.isEmpty(strM5181l)) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4601p.m5312a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jM821a = fz1Var.f2547G.m821a() / 3600000;
                            Uri uri = Uri.parse(strM5181l);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM821a - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            f02.m1559l(v22Var2);
                            v22Var2.m5026H(str2, "_cmp", (Bundle) pair.second);
                        }
                        c0809vn.m5182m(null);
                    }
                    f02.m1558k(fz1Var);
                    fz1Var.f2547G.m822b(0L);
                    break;
                }
                break;
            case 2:
                v22Var.mo11z();
                f02 f02Var2 = (f02) v22Var.f7192j;
                fz1 fz1Var2 = f02Var2.f2246n;
                ky1 ky1Var2 = f02Var2.f2247o;
                f02.m1558k(fz1Var2);
                yy1 yy1Var = fz1Var2.f2543C;
                if (yy1Var.m5852a()) {
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4607v.m5312a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    bz1 bz1Var = fz1Var2.f2544D;
                    long jM821a2 = bz1Var.m821a();
                    bz1Var.m822b(1 + jM821a2);
                    if (jM821a2 >= 5) {
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4603r.m5312a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        yy1Var.m5853b(true);
                    } else {
                        if (v22Var.f8006B == null) {
                            v22Var.f8006B = new t12(v22Var, f02Var2, 3);
                        }
                        v22Var.f8006B.m4403b(0L);
                    }
                }
                break;
            default:
                v22Var.m5042X();
                break;
        }
    }
}
