package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public abstract class zzfzw extends AbstractExecutorService implements zzgbn {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgcd.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (I3.b) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final I3.b zza(Runnable runnable) {
        return (I3.b) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final I3.b zzb(Callable callable) {
        return (I3.b) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgcd(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (I3.b) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (I3.b) super.submit(callable);
    }
}
