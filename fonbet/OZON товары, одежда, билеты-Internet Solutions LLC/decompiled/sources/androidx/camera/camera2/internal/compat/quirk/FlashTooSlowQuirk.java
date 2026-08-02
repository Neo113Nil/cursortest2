package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import w.C10368u;

/* loaded from: classes8.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38041a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    static boolean e(@NonNull C10368u c10368u) {
        Iterator<String> it = f38041a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
            }
        }
        return false;
    }
}
