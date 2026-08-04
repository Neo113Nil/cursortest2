package p155w1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1056z1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f17846z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static r f17845A = null;

    public static r i() {
        if (f17845A == null) {
            r rVar = new r(AbstractC1044v1.a(EnumC1038t1.f17872d), false);
            new ArrayList();
            f17845A = rVar;
        }
        return f17845A;
    }

    public final int h(String str, int i7, Map map, boolean z4, boolean z7, String str2) {
        if (!f17846z.get()) {
            AbstractC0997i0.o(2, "Invalid call to logEvent. Flurry is not initialized");
            return 1;
        }
        if (AbstractC0997i0.c(str).length() == 0) {
            return 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        int i8 = map2.size() > 10 ? 4 : 2;
        d(new C0964a(str, i7, map2, z4, z7, str2, jCurrentTimeMillis, jElapsedRealtime));
        return i8;
    }

    public final void j(String str, int i7, HashMap map) {
        if (AbstractC0997i0.k(16)) {
            h(str, i7, map, false, false, null);
        }
    }

    public final void k(String str, String str2, String str3, Map map, StackTraceElement[] stackTraceElementArr) {
        if (!f17846z.get()) {
            AbstractC0997i0.o(2, "Invalid call to onError. Flurry is not initialized");
            return;
        }
        Throwable th = new Throwable(str2);
        th.setStackTrace(stackTraceElementArr);
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        d(new C0980e(str, jCurrentTimeMillis, str2, str3, th, map2));
    }
}
