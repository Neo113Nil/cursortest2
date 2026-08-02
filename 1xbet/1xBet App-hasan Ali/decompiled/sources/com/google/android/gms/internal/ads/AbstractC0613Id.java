package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0613Id {

    /* renamed from: a, reason: collision with root package name */
    public static final C0606Hd f9539a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0606Hd f9540b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0606Hd f9541c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0592Fd f9542d;

    /* renamed from: e, reason: collision with root package name */
    public static final Vw f9543e;
    public static final C0606Hd f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0606Hd f9544g;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        A7 a7 = F7.Qa;
        Q2.r rVar = Q2.r.f5053d;
        if (rVar.f5056c.b(a7) != null) {
            D7 d7 = rVar.f5056c;
            if (((Boolean) d7.b(a7)).booleanValue()) {
                A7 a72 = F7.Ra;
                if (d7.b(a72) != null) {
                    A7 a73 = F7.Sa;
                    if (d7.b(a73) != null) {
                        threadPoolExecutor = new ThreadPoolExecutor(((Integer) d7.b(a72)).intValue(), ((Integer) d7.b(a72)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0831c5("Default"));
                        threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) d7.b(a73)).booleanValue());
                        f9539a = new C0606Hd((Executor) threadPoolExecutor);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC0831c5("Loader"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(true);
                        f9540b = new C0606Hd((Executor) threadPoolExecutor2);
                        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC0831c5("Activeview"));
                        threadPoolExecutor3.allowCoreThreadTimeOut(true);
                        f9541c = new C0606Hd((Executor) threadPoolExecutor3);
                        C0592Fd c0592Fd = new C0592Fd(3, new ThreadFactoryC0831c5("Schedule"));
                        f9542d = c0592Fd;
                        f9543e = new Vw(c0592Fd);
                        f = new C0606Hd(new ExecutorC0599Gd());
                        f9544g = new C0606Hd(Ew.f8627k);
                    }
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC0831c5("Default"));
        f9539a = new C0606Hd((Executor) threadPoolExecutor);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC0831c5("Loader"));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        f9540b = new C0606Hd((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC0831c5("Activeview"));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        f9541c = new C0606Hd((Executor) threadPoolExecutor32);
        C0592Fd c0592Fd2 = new C0592Fd(3, new ThreadFactoryC0831c5("Schedule"));
        f9542d = c0592Fd2;
        f9543e = new Vw(c0592Fd2);
        f = new C0606Hd(new ExecutorC0599Gd());
        f9544g = new C0606Hd(Ew.f8627k);
    }
}
