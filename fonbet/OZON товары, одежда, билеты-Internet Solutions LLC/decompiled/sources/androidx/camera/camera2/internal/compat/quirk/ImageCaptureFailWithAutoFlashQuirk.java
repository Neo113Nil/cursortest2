package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.C10368u;

/* loaded from: classes8.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38042a = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean e(@NonNull C10368u c10368u) {
        return f38042a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
