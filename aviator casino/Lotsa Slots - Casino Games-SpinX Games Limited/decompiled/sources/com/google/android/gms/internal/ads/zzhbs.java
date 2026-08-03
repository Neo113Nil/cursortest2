package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhbs extends com.google.android.gms.internal.ads.zzhbq implements com.google.common.util.concurrent.ListenableFuture {
    protected zzhbs() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future zza() {
        throw null;
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc();
}
