package sg.bigo.ads.I0;

import java.io.File;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12335a = false;
    public static boolean b = false;
    public static int c = 1;
    public static long d;

    public static int a() {
        if (f12335a) {
            return c;
        }
        int intValue = ((Integer) sg.bigo.ads.F0.b.a("sp_ads", "sp_cpu_core_num", (Object) 0, 0)).intValue();
        c = intValue;
        if (intValue != 0) {
            f12335a = true;
            return intValue;
        }
        try {
            c = new File("/sys/devices/system/cpu/").listFiles(new a()).length;
        } catch (Throwable unused) {
        }
        if (c <= 1) {
            c = Runtime.getRuntime().availableProcessors();
        }
        f12335a = true;
        sg.bigo.ads.F0.b.b("sp_ads", "sp_cpu_core_num", Integer.valueOf(c), 0);
        return c;
    }
}
