package androidx.camera.video.internal.compat.quirk;

import W.C4852x;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    private static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean h() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        if (e() || f()) {
            return true;
        }
        return ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || g() || h();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean b() {
        return e() || f() || g() || h();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(@NonNull H h11, @NonNull C4852x c4852x) {
        if (e() || f()) {
            if (c4852x != C4852x.f33150d) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (c4852x != C4852x.f33148b && c4852x != C4852x.f33149c) {
                return false;
            }
        } else if (g()) {
            if (h11.e() != 0) {
                return false;
            }
            if (c4852x != C4852x.f33149c && c4852x != C4852x.f33148b) {
                return false;
            }
        } else if (!h() || h11.e() != 1 || c4852x != C4852x.f33150d) {
            return false;
        }
        return true;
    }
}
