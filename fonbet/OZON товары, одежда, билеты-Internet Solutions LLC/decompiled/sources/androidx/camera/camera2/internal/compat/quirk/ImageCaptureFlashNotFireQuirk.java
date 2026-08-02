package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.C10368u;

/* loaded from: classes8.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38044a = Arrays.asList("itel w6004");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f38045b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean e(@NonNull C10368u c10368u) {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (f38045b.contains(str.toLowerCase(locale)) && ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f38044a.contains(str.toLowerCase(locale));
    }
}
