package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w52 {

    /* JADX INFO: renamed from: a */
    public static final q01 f8437a;

    static {
        nc0 nc0Var = qc0.f6464k;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        oa2.m3655b(24, objArr);
        f8437a = qc0.m4055j(24, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m5283a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5284b(wn1 wn1Var, v01 v01Var, v01 v01Var2, n81 n81Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        v52 v52Var;
        char c;
        int iM5285c = m5285c(wn1Var);
        if (iM5285c > 0 && (i2 != 1 || i != 1)) {
            cArr[iM5285c] = '2';
        }
        if (m5289g(wn1Var, v01Var2) == xn1.f9001k) {
            c = '3';
        } else {
            if (wn1Var == wn1.f8593k && i3 == 1 && n81Var.f5334m.equals(str)) {
                if (iM5285c > 0 && cArr[iM5285c] != '2') {
                    cArr[iM5285c] = '1';
                }
                return true;
            }
            if (v01Var.containsKey(wn1Var) && (v52Var = (v52) v01Var.get(wn1Var)) != null) {
                int iOrdinal = v52Var.ordinal();
                xn1 xn1Var = xn1.f9003m;
                if (iOrdinal != 0) {
                    xn1 xn1Var2 = xn1.f9002l;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m5289g(wn1Var, v01Var2) == xn1Var ? m5288f(wn1Var, cArr, str3, z2) : m5287e(wn1Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return m5289g(wn1Var, v01Var2) == xn1Var2 ? m5287e(wn1Var, cArr, str2, z) : m5288f(wn1Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (m5289g(wn1Var, v01Var2) != xn1Var2) {
                        return m5288f(wn1Var, cArr, str3, z2);
                    }
                } else if (m5289g(wn1Var, v01Var2) != xn1Var) {
                    return m5287e(wn1Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iM5285c <= 0 || cArr[iM5285c] == '2') {
            return false;
        }
        cArr[iM5285c] = c;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final int m5285c(wn1 wn1Var) {
        if (wn1Var == wn1.f8593k) {
            return 1;
        }
        if (wn1Var == wn1.f8595m) {
            return 2;
        }
        if (wn1Var == wn1.f8596n) {
            return 3;
        }
        return wn1Var == wn1.f8597o ? 4 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static final String m5286d(wn1 wn1Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < wn1Var.mo739a()) ? "0" : String.valueOf(str.charAt(wn1Var.mo739a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= wn1Var.mo739a()) {
            strValueOf = String.valueOf(str2.charAt(wn1Var.mo739a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5287e(wn1 wn1Var, char[] cArr, String str, boolean z) {
        char c;
        int iM5285c = m5285c(wn1Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= wn1Var.mo739a()) {
                char cCharAt = str.charAt(wn1Var.mo739a() - 1);
                boolean z2 = cCharAt == '1';
                if (iM5285c > 0 && cArr[iM5285c] != '2') {
                    cArr[iM5285c] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM5285c > 0 && cArr[iM5285c] != '2') {
            cArr[iM5285c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5288f(wn1 wn1Var, char[] cArr, String str, boolean z) {
        char c;
        int iM5285c = m5285c(wn1Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= wn1Var.mo739a()) {
                char cCharAt = str.charAt(wn1Var.mo739a() - 1);
                boolean z2 = cCharAt == '1';
                if (iM5285c > 0 && cArr[iM5285c] != '2') {
                    cArr[iM5285c] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM5285c > 0 && cArr[iM5285c] != '2') {
            cArr[iM5285c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final xn1 m5289g(wn1 wn1Var, v01 v01Var) {
        Object obj = v01Var.get(wn1Var);
        if (obj == null) {
            obj = xn1.f9004n;
        }
        return (xn1) obj;
    }
}
