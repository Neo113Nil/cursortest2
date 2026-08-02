package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class IncorrectJpegMetadataQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38398a = new HashSet(Arrays.asList("A24"));

    static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f38398a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }
}
