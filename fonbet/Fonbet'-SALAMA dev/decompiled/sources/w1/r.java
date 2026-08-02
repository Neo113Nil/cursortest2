package w1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r extends AbstractC1765z1 {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f17840z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public static r f17839A = null;

    public static r i() {
        if (f17839A == null) {
            r rVar = new r(AbstractC1753v1.a(EnumC1747t1.f17866d), false);
            new ArrayList();
            f17839A = rVar;
        }
        return f17839A;
    }

    public final int h(String str, int i7, Map map, boolean z4, boolean z7, String str2) {
        if (!f17840z.get()) {
            AbstractC1706i0.o(2, "Invalid call to logEvent. Flurry is not initialized");
            return 1;
        }
        if (AbstractC1706i0.c(str).length() == 0) {
            return 1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        int i8 = hashMap.size() > 10 ? 4 : 2;
        d(new C1673a(str, i7, hashMap, z4, z7, str2, currentTimeMillis, elapsedRealtime));
        return i8;
    }

    public final void j(String str, int i7, HashMap hashMap) {
        if (AbstractC1706i0.k(16)) {
            h(str, i7, hashMap, false, false, null);
        }
    }

    public final void k(String str, String str2, String str3, Map map, StackTraceElement[] stackTraceElementArr) {
        if (!f17840z.get()) {
            AbstractC1706i0.o(2, "Invalid call to onError. Flurry is not initialized");
            return;
        }
        Throwable th = new Throwable(str2);
        th.setStackTrace(stackTraceElementArr);
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        d(new C1689e(str, currentTimeMillis, str2, str3, th, hashMap));
    }
}
