package com.bytedance.sdk.component.vj.sf.pcc;

import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class sf {
    private static final TimeUnit pcc = TimeUnit.SECONDS;

    public static ExecutorService pcc() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, pcc, new LinkedBlockingQueue(), new pcc(BuildConfig.FLAVOR));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
