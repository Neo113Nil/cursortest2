package sg.bigo.ads.F0;

import android.text.TextUtils;
import android.text.format.DateUtils;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f12299a = "";

    public static void a(String str) {
        long longValue = ((Long) b.a("sp_ads", "last_impression_ts_" + str, (Object) 0, 1)).longValue();
        if (longValue <= 0 || DateUtils.isToday(longValue)) {
            return;
        }
        b.b("sp_ads", "impression_num_" + str, 0, 0);
        b.b("sp_ads", "last_impression_ts_" + str, 0L, 1);
    }

    public static int b() {
        return ((Integer) b.a("sp_ads", "consent_coppa", (Object) 0, 0)).intValue();
    }

    public static int c() {
        return ((Integer) b.a("sp_ads", "consent_gdpr", (Object) 0, 0)).intValue();
    }

    public static int d() {
        return ((Integer) b.a("sp_ads", "consent_lgpd", (Object) 0, 0)).intValue();
    }

    public static String e() {
        if (!TextUtils.isEmpty(f12299a)) {
            return f12299a;
        }
        String str = (String) b.a("sp_ads_tiny", "sp_ads_uuid", "", 3);
        f12299a = str;
        if (TextUtils.isEmpty(str)) {
            try {
                synchronized (a.class) {
                    if (TextUtils.isEmpty(f12299a)) {
                        f12299a = String.valueOf(UUID.randomUUID());
                    }
                }
                if (!TextUtils.isEmpty(f12299a)) {
                    b.b("sp_ads_tiny", "sp_ads_uuid", f12299a, 3);
                }
            } catch (Throwable unused) {
            }
        }
        return f12299a;
    }

    public static boolean f() {
        return (a() == 2 || d() == 2 || b() == 2) || (((Integer) b.a("sp_ads", "gdpr_check_by_server", (Object) 0, 0)).intValue() == 0 && (c() == 2));
    }

    public static int b(String str) {
        try {
            return ((Integer) b.a(str + "_preferences", "IABTCF_gdprApplies", (Object) 0, 0)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String c(String str) {
        try {
            return (String) b.a(str + "_preferences", "IABTCF_PurposeConsents", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(String str) {
        try {
            return (String) b.a(str + "_preferences", "IABTCF_PurposeLegitimateInterests", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int a() {
        return ((Integer) b.a("sp_ads", "consent_ccpa", (Object) 0, 0)).intValue();
    }
}
