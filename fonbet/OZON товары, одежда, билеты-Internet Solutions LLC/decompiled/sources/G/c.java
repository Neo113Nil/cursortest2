package G;

import Am.C2438a;
import C.S;
import android.os.SystemClock;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f9600a;

    /* renamed from: b, reason: collision with root package name */
    private static long f9601b;

    public static void a() {
        f9600a = null;
        f9601b = 0L;
    }

    public static int b(int i11, int i12, boolean z11) {
        int i13 = z11 ? ((i12 - i11) + 360) % 360 : (i12 + i11) % 360;
        if (S.h()) {
            StringBuilder a11 = C2438a.a("getRelativeImageRotation: destRotationDegrees=", i11, ", sourceRotationDegrees=", ", isOppositeFacing=", i12);
            a11.append(z11);
            a11.append(", result=");
            a11.append(i13);
            S.a("CameraOrientationUtil", a11.toString());
        }
        return i13;
    }

    public static long c() {
        return f9601b;
    }

    public static String d() {
        return f9600a;
    }

    public static void e() {
        f9600a = UUID.randomUUID().toString();
        f9601b = SystemClock.elapsedRealtimeNanos();
    }

    public static int f(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 90;
        }
        if (i11 == 2) {
            return 180;
        }
        if (i11 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Unsupported surface rotation: "));
    }
}
