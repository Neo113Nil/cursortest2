package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.E0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public class CaptureFailedRetryQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38397a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    static boolean e() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f38397a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }
}
