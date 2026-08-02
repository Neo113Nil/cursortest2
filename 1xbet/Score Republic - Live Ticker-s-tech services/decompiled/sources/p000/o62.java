package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o62 extends d62 {
    /* JADX INFO: renamed from: D */
    public static final boolean m3630D(String str) {
        String str2 = (String) jx1.f4212t.m2715a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.m809I().m3449t()) goto L28;
     */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m62 m3631B(String str) {
        f02 f02Var = (f02) this.f7192j;
        x62 x62Var = this.f1566k;
        qt1 qt1Var = x62Var.f8823l;
        sz1 sz1Var = x62Var.f8821j;
        x62.m5533U(qt1Var);
        uy1 uy1VarM4149E0 = qt1Var.m4149E0(str);
        e32 e32Var = e32.f1939k;
        m62 m62Var = null;
        if (uy1VarM4149E0 == null || !uy1VarM4149E0.m5003z()) {
            return new m62(m3632C(str), Collections.EMPTY_MAP, e32Var, null);
        }
        q02 q02VarM4223u = r02.m4223u();
        q02VarM4223u.m5681b();
        ((r02) q02VarM4223u.f9011k).m4230z(2);
        int iM2768c = j11.m2768c(uy1VarM4149E0.m4997t());
        if (iM2768c == 0) {
            C0270h1.m2192h("null reference");
        }
        q02VarM4223u.m4023g(iM2768c);
        String strM4963F = uy1VarM4149E0.m4963F();
        x62.m5533U(sz1Var);
        by1 by1VarM4617M = sz1Var.m4617M(str);
        if (by1VarM4617M != null) {
            qt1 qt1Var2 = x62Var.f8823l;
            x62.m5533U(qt1Var2);
            uy1 uy1VarM4149E1 = qt1Var2.m4149E0(str);
            if (uy1VarM4149E1 != null) {
                if (!by1VarM4617M.m808H() || by1VarM4617M.m809I().m3449t() != 100) {
                    f72 f72Var = f02Var.f2250r;
                    f02.m1558k(f72Var);
                    if (!f72Var.m1726g0(str, uy1VarM4149E1.m4961D())) {
                        if (!TextUtils.isEmpty(strM4963F)) {
                        }
                    }
                }
                String strM4962E = uy1VarM4149E0.m4962E();
                q02VarM4223u.m5681b();
                ((r02) q02VarM4223u.f9011k).m4230z(2);
                x62.m5533U(sz1Var);
                by1 by1VarM4617M2 = sz1Var.m4617M(uy1VarM4149E0.m4962E());
                if (by1VarM4617M2 == null || !by1VarM4617M2.m808H()) {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5313b(strM4962E, "[sgtm] Missing sgtm_setting in remote config. appId");
                    q02VarM4223u.m5681b();
                    ((r02) q02VarM4223u.f9011k).m4225A(4);
                } else {
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(uy1VarM4149E0.m4961D())) {
                        map.put("x-gtm-server-preview", uy1VarM4149E0.m4961D());
                    }
                    String strM3450u = by1VarM4617M2.m809I().m3450u();
                    int iM2768c2 = j11.m2768c(uy1VarM4149E0.m4997t());
                    if (iM2768c2 != 0 && iM2768c2 != 2) {
                        q02VarM4223u.m4023g(iM2768c2);
                    } else if (m3630D(uy1VarM4149E0.m4962E())) {
                        q02VarM4223u.m4023g(11);
                    } else if (TextUtils.isEmpty(strM3450u)) {
                        q02VarM4223u.m4023g(12);
                    } else {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4608w.m5313b(strM4962E, "[sgtm] Eligible for client side upload. appId");
                        q02VarM4223u.m5681b();
                        ((r02) q02VarM4223u.f9011k).m4230z(3);
                        q02VarM4223u.m4023g(2);
                        m62Var = new m62(strM3450u, map, e32.f1942n, (r02) q02VarM4223u.m5683d());
                    }
                    by1VarM4617M2.m809I().getClass();
                    by1VarM4617M2.m809I().getClass();
                    f02Var.getClass();
                    ky1 ky1Var3 = f02Var.f2247o;
                    if (TextUtils.isEmpty(strM3450u)) {
                        q02VarM4223u.m5681b();
                        ((r02) q02VarM4223u.f9011k).m4225A(6);
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4608w.m5313b(uy1VarM4149E0.m4962E(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4608w.m5313b(strM4962E, "[sgtm] Eligible for local service direct upload. appId");
                        q02VarM4223u.m5681b();
                        ((r02) q02VarM4223u.f9011k).m4230z(5);
                        q02VarM4223u.m5681b();
                        ((r02) q02VarM4223u.f9011k).m4225A(2);
                        m62Var = new m62(strM3450u, map, e32.f1941m, (r02) q02VarM4223u.m5683d());
                    }
                }
                return m62Var != null ? m62Var : new m62(m3632C(str), Collections.EMPTY_MAP, e32Var, (r02) q02VarM4223u.m5683d());
            }
        }
        q02VarM4223u.m5681b();
        ((r02) q02VarM4223u.f9011k).m4225A(3);
        return new m62(m3632C(str), Collections.EMPTY_MAP, e32Var, (r02) q02VarM4223u.m5683d());
    }

    /* JADX INFO: renamed from: C */
    public final String m3632C(String str) {
        sz1 sz1Var = this.f1566k.f8821j;
        x62.m5533U(sz1Var);
        String strM4618N = sz1Var.m4618N(str);
        if (TextUtils.isEmpty(strM4618N)) {
            return (String) jx1.f4208r.m2715a(null);
        }
        Uri uri = Uri.parse((String) jx1.f4208r.m2715a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM4618N).length() + 1 + String.valueOf(authority).length());
        sb.append(strM4618N);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
