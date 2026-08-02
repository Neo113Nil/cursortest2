package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ZslDisablerQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38061a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f38062b = Arrays.asList("MI 8");

    private static boolean e(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean f() {
        String str = Build.BRAND;
        if ("samsung".equalsIgnoreCase(str) && e(f38061a)) {
            return true;
        }
        return "xiaomi".equalsIgnoreCase(str) && e(f38062b);
    }
}
