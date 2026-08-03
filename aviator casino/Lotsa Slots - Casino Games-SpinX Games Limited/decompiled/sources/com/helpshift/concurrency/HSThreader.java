package com.helpshift.concurrency;

/* loaded from: classes.dex */
public interface HSThreader {
    java.util.concurrent.atomic.AtomicBoolean submit(java.lang.Runnable runnable);
}
