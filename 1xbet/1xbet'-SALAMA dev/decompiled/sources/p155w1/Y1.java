package p155w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends C2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f17619e = new AtomicInteger(0);

    public static void c(String str, int i7, HashMap map, boolean z4, boolean z7, String str2, long j, long j3) {
        HashMap map2;
        if (map.size() > 10) {
            map2 = new HashMap();
            map2.put("fl.parameter.limit.exceeded", String.valueOf(map.size()));
            map.clear();
        } else {
            map2 = null;
        }
        C1050x1.z().A(new Y1(new Z1(AbstractC0997i0.c(str), f17619e.incrementAndGet(), i7, map, map2, new ArrayList(), z4, z7, str2, j, j3)));
    }

    @Override // p155w1.C2
    public final D2 a() {
        return D2.ANALYTICS_EVENT;
    }
}
