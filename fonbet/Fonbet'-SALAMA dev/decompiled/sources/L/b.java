package L;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {
    static {
        int i7 = Build.VERSION.SDK_INT;
        a aVar = a.f4180a;
        if (i7 >= 30) {
            aVar.a(30);
        }
        if (i7 >= 30) {
            aVar.a(31);
        }
        if (i7 >= 30) {
            aVar.a(33);
        }
        if (i7 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        t6.h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        t6.h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            if (i7 >= 30) {
                String str = Build.VERSION.CODENAME;
                t6.h.d(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            if (i7 >= 32) {
                String str = Build.VERSION.CODENAME;
                t6.h.d(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
