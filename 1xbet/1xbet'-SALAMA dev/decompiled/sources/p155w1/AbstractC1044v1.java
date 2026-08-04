package p155w1;

import J2.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w1.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1044v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f17897a;

    static {
        HashMap map = new HashMap();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        for (EnumC1038t1 enumC1038t1 : EnumC1038t1.values()) {
            enumC1038t1.name();
            int i7 = AbstractC1035s1.f17863a[enumC1038t1.ordinal()];
            ThreadPoolExecutor threadPoolExecutor = (i7 == 1 || i7 == 2) ? new ThreadPoolExecutor(0, iAvailableProcessors, 6L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new RejectedExecutionHandlerC1041u1()) : new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new RejectedExecutionHandlerC1041u1());
            C0974c1 c0974c1 = new C0974c1(null, true);
            c0974c1.f17663x = threadPoolExecutor;
            map.put(enumC1038t1, c0974c1);
        }
        f17897a = Collections.unmodifiableMap(map);
    }

    public static synchronized C0974c1 a(EnumC1038t1 enumC1038t1) {
        return (C0974c1) f17897a.get(enumC1038t1);
    }
}
