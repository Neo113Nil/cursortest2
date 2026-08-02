package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v.C10132s;
import w.C10368u;

/* loaded from: classes8.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements E0 {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f38058b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C10368u f38059a;

    public TorchFlashRequiredFor3aUpdateQuirk(@NonNull C10368u c10368u) {
        this.f38059a = c10368u;
    }

    static boolean f(@NonNull C10368u c10368u) {
        Iterator<String> it = f38058b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return ((Integer) c10368u.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            }
        }
        return false;
    }

    public final boolean e() {
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 28 && C10132s.E(this.f38059a, 5) == 5) {
            z11 = true;
        }
        return !z11;
    }
}
