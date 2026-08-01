package sg.bigo.ads.p0;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.p0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5429c {

    /* renamed from: a, reason: collision with root package name */
    public static String f13236a = "";
    public static int b = 0;
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static boolean f = true;
    public static final SharedPreferencesOnSharedPreferenceChangeListenerC5428b g = new SharedPreferencesOnSharedPreferenceChangeListenerC5428b();
    public static Context h;

    public static int a() {
        if (h == null || !sg.bigo.ads.F0.b.a()) {
            return b;
        }
        b = a(h) ? sg.bigo.ads.F0.a.b(h.getPackageName()) : -1;
        return b;
    }

    public static String b() {
        String str = "";
        if (I.a((CharSequence) e) && d()) {
            try {
                str = (String) sg.bigo.ads.F0.b.a(h.getPackageName() + "_preferences", AndroidTcfDataSource.TCF_TCSTRING_KEY, "", 3);
            } catch (Exception unused) {
            }
            e = str;
        }
        return e;
    }

    public static String c() {
        String str = "";
        if (I.a((CharSequence) d) && d()) {
            try {
                str = (String) sg.bigo.ads.F0.b.a(h.getPackageName() + "_preferences", "IABTCF_VendorConsents", "", 3);
            } catch (Exception unused) {
            }
            d = str;
        }
        return d;
    }

    public static boolean d() {
        return h != null;
    }

    public static boolean a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || !sg.bigo.ads.F0.b.a()) {
            return false;
        }
        String str = context.getPackageName() + "_preferences";
        Context context2 = sg.bigo.ads.F0.b.f12300a;
        if (context2 == null) {
            AbstractC5496a.a("SharedPreferenceManager", "sContext is null");
            sharedPreferences = null;
        } else {
            sharedPreferences = context2.getSharedPreferences(str, 0);
        }
        if (sharedPreferences != null) {
            return sharedPreferences.contains("IABTCF_gdprApplies");
        }
        return false;
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences;
        h = context;
        String packageName = context.getPackageName();
        SharedPreferencesOnSharedPreferenceChangeListenerC5428b sharedPreferencesOnSharedPreferenceChangeListenerC5428b = g;
        String str = packageName + "_preferences";
        Context context2 = sg.bigo.ads.F0.b.f12300a;
        if (context2 == null) {
            AbstractC5496a.a("SharedPreferenceManager", "sContext is null");
            sharedPreferences = null;
        } else {
            sharedPreferences = context2.getSharedPreferences(str, 0);
        }
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC5428b);
        }
    }
}
