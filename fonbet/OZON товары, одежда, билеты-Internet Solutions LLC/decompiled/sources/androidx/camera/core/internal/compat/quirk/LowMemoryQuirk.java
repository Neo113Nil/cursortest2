package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public class LowMemoryQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38401a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean e() {
        return f38401a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
