package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzbxl implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbxl(zzbxm zzbxmVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, k.d(this.zza.getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #"));
    }
}
