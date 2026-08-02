package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class CameraUseInconsistentTimebaseQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38497a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f38498b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet f38499c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    static boolean e() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = f38498b;
            str = Build.SOC_MODEL;
            if (hashSet.contains(str.toLowerCase())) {
                return true;
            }
        }
        return ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && f38497a.contains(Build.HARDWARE.toLowerCase())) || f38499c.contains(Build.MODEL.toLowerCase());
    }
}
