package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.E0;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38040a;

    static {
        HashSet hashSet = new HashSet();
        f38040a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }

    static boolean e() {
        HashSet hashSet = f38040a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return hashSet.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
