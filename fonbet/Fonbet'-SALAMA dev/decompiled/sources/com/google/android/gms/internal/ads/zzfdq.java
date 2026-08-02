package com.google.android.gms.internal.ads;

import e1.k;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzfdq implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, k.d(this.zza.getAndIncrement(), "AdWorker(NG) #"));
    }
}
