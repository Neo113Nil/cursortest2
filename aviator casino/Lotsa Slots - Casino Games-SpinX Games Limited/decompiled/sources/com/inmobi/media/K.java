package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f4790a;

    static {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        com.inmobi.media.core.config.models.AdConfig adConfig = (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("K-AD", "name");
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new com.inmobi.media.I9("K-AD", false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4790a = threadPoolExecutor;
    }
}
