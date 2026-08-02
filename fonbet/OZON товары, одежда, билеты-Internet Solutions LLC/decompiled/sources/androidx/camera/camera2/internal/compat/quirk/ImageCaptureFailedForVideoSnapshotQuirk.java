package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38043a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    static boolean e() {
        String str;
        HashSet hashSet = f38043a;
        String str2 = Build.MODEL;
        Locale locale = Locale.US;
        if (hashSet.contains(str2.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str3 = Build.HARDWARE;
        if (str3.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        String str4 = Build.BRAND;
        if ("itel".equalsIgnoreCase(str4) && str3.toLowerCase(locale).startsWith("sp")) {
            return true;
        }
        return "HUAWEI".equalsIgnoreCase(str4) && "FIG-LX1".equalsIgnoreCase(str2);
    }
}
