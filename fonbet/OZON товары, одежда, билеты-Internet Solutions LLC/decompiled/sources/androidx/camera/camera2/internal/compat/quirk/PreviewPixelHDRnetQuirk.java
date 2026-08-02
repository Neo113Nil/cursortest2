package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class PreviewPixelHDRnetQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38056a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean e() {
        if ("Google".equals(Build.MANUFACTURER)) {
            return f38056a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
        }
        return false;
    }
}
