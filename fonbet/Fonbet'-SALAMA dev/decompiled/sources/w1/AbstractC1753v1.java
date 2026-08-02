package w1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: w1.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1753v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f17891a;

    static {
        HashMap hashMap = new HashMap();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        for (EnumC1747t1 enumC1747t1 : EnumC1747t1.values()) {
            enumC1747t1.name();
            int i7 = AbstractC1744s1.f17857a[enumC1747t1.ordinal()];
            ThreadPoolExecutor threadPoolExecutor = (i7 == 1 || i7 == 2) ? new ThreadPoolExecutor(0, availableProcessors, 6L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new J2.a(), new RejectedExecutionHandlerC1750u1()) : new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new J2.a(), new RejectedExecutionHandlerC1750u1());
            C1683c1 c1683c1 = new C1683c1(null, true);
            c1683c1.f17657x = threadPoolExecutor;
            hashMap.put(enumC1747t1, c1683c1);
        }
        f17891a = Collections.unmodifiableMap(hashMap);
    }

    public static synchronized C1683c1 a(EnumC1747t1 enumC1747t1) {
        C1683c1 c1683c1;
        synchronized (AbstractC1753v1.class) {
            c1683c1 = (C1683c1) f17891a.get(enumC1747t1);
        }
        return c1683c1;
    }
}
