package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaci implements com.google.android.gms.internal.ads.zzacj {
    final /* synthetic */ java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdt zzb;

    zzaci(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        this.zza = executor;
        this.zzb = zzdtVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
