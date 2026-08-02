package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import w.C10368u;

/* loaded from: classes8.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f38052a = new HashSet(Arrays.asList("redmi note 8 pro"));

    static boolean e(@NonNull C10368u c10368u) {
        return f38052a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
