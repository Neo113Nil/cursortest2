package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 extends sq1 {

    /* JADX INFO: renamed from: k */
    public Boolean f982k;

    /* JADX INFO: renamed from: l */
    public String f983l;

    /* JADX INFO: renamed from: m */
    public at1 f984m;

    /* JADX INFO: renamed from: n */
    public Boolean f985n;

    /* JADX INFO: renamed from: B */
    public final boolean m760B(String str) {
        f02.m1558k(((f02) this.f7192j).f2250r);
        if (f72.m1691d0((String) jx1.f4184g1.m2715a(null), str) || f72.m1691d0((String) jx1.f4187h1.m2715a(null), str) || f72.m1691d0((String) jx1.f4190i1.m2715a(null), str)) {
            return true;
        }
        return "1".equals(this.f984m.mo481d(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m761C(String str) {
        return "1".equals(this.f984m.mo481d(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: D */
    public final boolean m762D() {
        if (this.f982k == null) {
            Boolean boolM772N = m772N("app_measurement_lite");
            this.f982k = boolM772N;
            if (boolM772N == null) {
                this.f982k = Boolean.FALSE;
            }
        }
        return this.f982k.booleanValue() || !((f02) this.f7192j).f2243k;
    }

    /* JADX INFO: renamed from: E */
    public final String m763E(String str) {
        f02 f02Var = (f02) this.f7192j;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            p80.m3863h(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4600o.m5313b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            ky1 ky1Var4 = f02Var.f2247o;
            f02.m1560m(ky1Var4);
            ky1Var4.f4600o.m5313b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m764F(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(m768J(str, jx1.f4183g0), 500), 100) : 500, 256);
    }

    /* JADX INFO: renamed from: G */
    public final void m765G() {
        ((f02) this.f7192j).getClass();
    }

    /* JADX INFO: renamed from: H */
    public final String m766H(String str, ix1 ix1Var) {
        return TextUtils.isEmpty(str) ? (String) ix1Var.m2715a(null) : (String) ix1Var.m2715a(this.f984m.mo481d(str, ix1Var.f3692a));
    }

    /* JADX INFO: renamed from: I */
    public final long m767I(String str, ix1 ix1Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) ix1Var.m2715a(null)).longValue();
        }
        String strMo481d = this.f984m.mo481d(str, ix1Var.f3692a);
        if (TextUtils.isEmpty(strMo481d)) {
            return ((Long) ix1Var.m2715a(null)).longValue();
        }
        try {
            return ((Long) ix1Var.m2715a(Long.valueOf(Long.parseLong(strMo481d)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) ix1Var.m2715a(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m768J(String str, ix1 ix1Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) ix1Var.m2715a(null)).intValue();
        }
        String strMo481d = this.f984m.mo481d(str, ix1Var.f3692a);
        if (TextUtils.isEmpty(strMo481d)) {
            return ((Integer) ix1Var.m2715a(null)).intValue();
        }
        try {
            return ((Integer) ix1Var.m2715a(Integer.valueOf(Integer.parseInt(strMo481d)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) ix1Var.m2715a(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: K */
    public final double m769K(String str, ix1 ix1Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) ix1Var.m2715a(null)).doubleValue();
        }
        String strMo481d = this.f984m.mo481d(str, ix1Var.f3692a);
        if (TextUtils.isEmpty(strMo481d)) {
            return ((Double) ix1Var.m2715a(null)).doubleValue();
        }
        try {
            return ((Double) ix1Var.m2715a(Double.valueOf(Double.parseDouble(strMo481d)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) ix1Var.m2715a(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m770L(String str, ix1 ix1Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) ix1Var.m2715a(null)).booleanValue();
        }
        String strMo481d = this.f984m.mo481d(str, ix1Var.f3692a);
        return TextUtils.isEmpty(strMo481d) ? ((Boolean) ix1Var.m2715a(null)).booleanValue() : ((Boolean) ix1Var.m2715a(Boolean.valueOf("1".equals(strMo481d)))).booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public final Bundle m771M() {
        f02 f02Var = (f02) this.f7192j;
        try {
            Context context = f02Var.f2242j;
            Context context2 = f02Var.f2242j;
            ky1 ky1Var = f02Var.f2247o;
            if (context.getPackageManager() == null) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5312a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM1501d = tk1.m4792a(context2).m1501d(context2.getPackageName(), 128);
            if (applicationInfoM1501d != null) {
                return applicationInfoM1501d.metaData;
            }
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final Boolean m772N(String str) {
        p80.m3860e(str);
        Bundle bundleM771M = m771M();
        if (bundleM771M != null) {
            if (bundleM771M.containsKey(str)) {
                return Boolean.valueOf(bundleM771M.getBoolean(str));
            }
            return null;
        }
        ky1 ky1Var = ((f02) this.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4600o.m5312a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m773O() {
        ((f02) this.f7192j).getClass();
        Boolean boolM772N = m772N("firebase_analytics_collection_deactivated");
        return boolM772N != null && boolM772N.booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m774P() {
        Boolean boolM772N = m772N("google_analytics_automatic_screen_reporting_enabled");
        return boolM772N == null || boolM772N.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final h12 m775Q(String str, boolean z) {
        Object obj;
        p80.m3860e(str);
        f02 f02Var = (f02) this.f7192j;
        Bundle bundleM771M = m771M();
        if (bundleM771M == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM771M.get(str);
        }
        h12 h12Var = h12.f3002k;
        if (obj == null) {
            return h12Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return h12.f3005n;
        }
        if (Boolean.FALSE.equals(obj)) {
            return h12.f3004m;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return h12.f3003l;
        }
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var2);
        ky1Var2.f4603r.m5313b(str, "Invalid manifest metadata for");
        return h12Var;
    }
}
