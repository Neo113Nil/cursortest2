package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38496a = Arrays.asList("cph1920", "cph1923", "cph2015", "cph2083");

    static boolean e() {
        String str = Build.BRAND;
        if ("oppo".equalsIgnoreCase(str)) {
            if (f38496a.contains(Build.MODEL.toLowerCase(Locale.ROOT))) {
                return true;
            }
        }
        if ("lge".equalsIgnoreCase(str) && "lg-m250".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("realme".equalsIgnoreCase(str) && "rmx1941".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("Xiaomi".equalsIgnoreCase(str) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("vivo".equalsIgnoreCase(str) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return "vivo".equalsIgnoreCase(str) && "VIVO Y17".equalsIgnoreCase(Build.MODEL);
    }
}
