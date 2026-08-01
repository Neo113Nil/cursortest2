package sg.bigo.ads.X0;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class t {
    public static final t c = new t();

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f12614a;
    public final AtomicInteger b = new AtomicInteger(0);

    public static boolean a(Map map, String str) {
        Long l;
        return map == null || str == null || (l = (Long) map.get(str)) == null || SystemClock.elapsedRealtime() - l.longValue() > 600000;
    }
}
