package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f6683a;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        AdConfig adConfig = (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Intrinsics.checkNotNullParameter("L-AD", "name");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new ThreadFactoryC3932na("L-AD", false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6683a = threadPoolExecutor;
    }
}
