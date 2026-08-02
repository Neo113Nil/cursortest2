package A5;

import android.os.SystemClock;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f435a = new n();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final File f436b = new File("/proc/self/fd");

    /* renamed from: c, reason: collision with root package name */
    private static int f437c = 30;

    /* renamed from: d, reason: collision with root package name */
    private static long f438d = SystemClock.uptimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private static boolean f439e = true;

    public final synchronized boolean a() {
        try {
            int i11 = f437c;
            f437c = i11 + 1;
            if (i11 >= 30 || SystemClock.uptimeMillis() > f438d + 30000) {
                f437c = 0;
                f438d = SystemClock.uptimeMillis();
                String[] list = f436b.list();
                if (list == null) {
                    list = new String[0];
                }
                f439e = list.length < 800;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f439e;
    }
}
