package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 {

    /* JADX INFO: renamed from: a */
    public final f02 f3760a;

    public iz1(x62 x62Var) {
        this.f3760a = x62Var.f8832u;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2750a() {
        f02 f02Var = this.f3760a;
        try {
            C0186et c0186etM4792a = tk1.m4792a(f02Var.f2242j);
            if (c0186etM4792a != null) {
                return c0186etM4792a.m1502e("com.android.vending", 128).versionCode >= 80837300;
            }
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5313b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2751b(Bundle bundle, String str) {
        String string;
        f02 f02Var = this.f3760a;
        a02 a02Var = f02Var.f2248p;
        fz1 fz1Var = f02Var.f2246n;
        f02.m1560m(a02Var);
        a02Var.mo11z();
        if (f02Var.m1565d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        f02.m1558k(fz1Var);
        fz1Var.f2546F.m5182m(string);
        bz1 bz1Var = fz1Var.f2547G;
        f02Var.f2252t.getClass();
        bz1Var.m822b(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public boolean m2752c() {
        if (!m2753d()) {
            return false;
        }
        f02 f02Var = this.f3760a;
        f02Var.f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fz1 fz1Var = f02Var.f2246n;
        f02.m1558k(fz1Var);
        return jCurrentTimeMillis - fz1Var.f2547G.m821a() > f02Var.f2245m.m767I(null, jx1.f4189i0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2753d() {
        fz1 fz1Var = this.f3760a.f2246n;
        f02.m1558k(fz1Var);
        return fz1Var.f2547G.m821a() > 0;
    }

    public iz1(f02 f02Var) {
        this.f3760a = f02Var;
    }
}
