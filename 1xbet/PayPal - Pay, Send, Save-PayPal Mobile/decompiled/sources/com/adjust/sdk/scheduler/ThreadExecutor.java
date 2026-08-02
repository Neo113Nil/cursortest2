package com.adjust.sdk.scheduler;

/* loaded from: classes7.dex */
public interface ThreadExecutor {
    void submit(java.lang.Runnable runnable);

    void teardown();
}
