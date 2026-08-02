package androidx.camera.core.internal.compat.quirk;

import C.S;
import H.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile I0 f38402a;

    static {
        G0.b().c(c.b(), new K.a());
    }

    public static void a(F0 f02) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        if (("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            z11 = true;
        } else {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Cuttlefish") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                    Build.HARDWARE.contains("ranchu");
                }
            }
            z11 = false;
        }
        if (f02.a(z11, ImageCaptureRotationOptionQuirk.class)) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (f02.a(true, SurfaceOrderQuirk.class)) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (f02.a(CaptureFailedRetryQuirk.e(), CaptureFailedRetryQuirk.class)) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (f02.a(LowMemoryQuirk.e(), LowMemoryQuirk.class)) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (f02.a(LargeJpegImageQuirk.f(), LargeJpegImageQuirk.class)) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (f02.a(IncorrectJpegMetadataQuirk.e(), IncorrectJpegMetadataQuirk.class)) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        f38402a = new I0(arrayList);
        S.a("DeviceQuirks", "core DeviceQuirks = " + I0.d(f38402a));
    }

    public static <T extends E0> T b(@NonNull Class<T> cls) {
        return (T) f38402a.b(cls);
    }

    @NonNull
    public static I0 c() {
        return f38402a;
    }
}
