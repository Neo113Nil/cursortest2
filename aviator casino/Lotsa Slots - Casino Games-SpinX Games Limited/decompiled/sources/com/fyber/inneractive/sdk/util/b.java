package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class b implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }
}
