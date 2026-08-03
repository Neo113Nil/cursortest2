package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhbv {
    private final boolean zza;
    private final com.google.android.gms.internal.ads.zzgwm zzb;

    /* synthetic */ zzhbv(boolean z, com.google.android.gms.internal.ads.zzgwm zzgwmVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgwmVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzhbk(this.zzb, this.zza, executor, callable);
    }
}
