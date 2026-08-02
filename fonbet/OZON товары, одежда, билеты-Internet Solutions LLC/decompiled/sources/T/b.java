package T;

import C.S;
import H.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile I0 f26358a;

    static {
        G0.b().c(c.b(), new a());
    }

    public static void a(F0 f02) {
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        if (f02.a(("google".equalsIgnoreCase(str) && "redfin".equalsIgnoreCase(Build.DEVICE)) || "motorola".equalsIgnoreCase(str) || "realme".equalsIgnoreCase(str), ExtensionDisabledQuirk.class)) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (f02.a(str.equalsIgnoreCase("SAMSUNG"), CrashWhenOnDisableTooSoon.class)) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (f02.a(str.equalsIgnoreCase("SAMSUNG"), GetAvailableKeysNeedsOnInit.class)) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (f02.a(str.equalsIgnoreCase("Xiaomi"), CaptureOutputSurfaceOccupiedQuirk.class)) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        f26358a = new I0(arrayList);
        S.a("DeviceQuirks", "extensions DeviceQuirks = " + I0.d(f26358a));
    }

    public static E0 b() {
        return f26358a.b(CaptureOutputSurfaceOccupiedQuirk.class);
    }
}
