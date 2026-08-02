package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Y1 extends C2 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f17613e = new AtomicInteger(0);

    public static void c(String str, int i7, HashMap hashMap, boolean z4, boolean z7, String str2, long j, long j3) {
        HashMap hashMap2;
        if (hashMap.size() > 10) {
            hashMap2 = new HashMap();
            hashMap2.put("fl.parameter.limit.exceeded", String.valueOf(hashMap.size()));
            hashMap.clear();
        } else {
            hashMap2 = null;
        }
        C1759x1.z().A(new Y1(new Z1(AbstractC1706i0.c(str), f17613e.incrementAndGet(), i7, hashMap, hashMap2, new ArrayList(), z4, z7, str2, j, j3)));
    }

    @Override // w1.C2
    public final D2 a() {
        return D2.ANALYTICS_EVENT;
    }
}
