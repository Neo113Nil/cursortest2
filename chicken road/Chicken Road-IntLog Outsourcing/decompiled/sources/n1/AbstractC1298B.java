package n1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: n1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1298B {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f11291a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L3.e());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11291a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
