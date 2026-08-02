package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class InvalidVideoProfilesQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38049a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f38050b = Arrays.asList("cph2417", "cph2451");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f38051c = Arrays.asList("cph2437", "cph2525", "pht110");

    static boolean e() {
        String str = Build.BRAND;
        if ("samsung".equalsIgnoreCase(str) && Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
            return true;
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (f38049a.contains(str2.toLowerCase(locale))) {
            String str3 = Build.ID;
            if (str3.toLowerCase(locale).startsWith("tp1a") || str3.toLowerCase(locale).startsWith("td1a")) {
                return true;
            }
        }
        if ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) {
            String str4 = Build.ID;
            if (str4.toLowerCase(locale).startsWith("tkq1") || str4.toLowerCase(locale).startsWith("tp1a")) {
                return true;
            }
        }
        if (f38050b.contains(str2.toLowerCase(locale)) && Build.VERSION.SDK_INT == 33) {
            return true;
        }
        return f38051c.contains(str2.toLowerCase(locale)) && Build.VERSION.SDK_INT == 33;
    }
}
