package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhbq extends com.google.android.gms.internal.ads.zzgwd implements java.util.concurrent.Future {
    protected zzhbq() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zza().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    protected abstract java.util.concurrent.Future zza();

    @Override // com.google.android.gms.internal.ads.zzgwd
    protected /* bridge */ /* synthetic */ java.lang.Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return zza().get(j, timeUnit);
    }
}
