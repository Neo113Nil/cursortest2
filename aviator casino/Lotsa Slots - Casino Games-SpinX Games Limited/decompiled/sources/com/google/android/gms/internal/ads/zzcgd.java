package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes4.dex */
public class zzcgd {
    private final com.google.android.gms.internal.ads.zzcfw zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    public zzcgd() {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        this.zza = zzcfwVar;
        this.zzb = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.internal.ads.zzhbw.zzr(zzcfwVar, new com.google.android.gms.internal.ads.zzcgb(this), com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @java.lang.Deprecated
    public final void zze(com.google.android.gms.internal.ads.zzcga zzcgaVar, com.google.android.gms.internal.ads.zzcfy zzcfyVar) {
        com.google.android.gms.internal.ads.zzhbw.zzr(this.zza, new com.google.android.gms.internal.ads.zzcgc(this, zzcgaVar, zzcfyVar), com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @java.lang.Deprecated
    public final void zzf(java.lang.Object obj) {
        this.zza.zzc(obj);
    }

    @java.lang.Deprecated
    public final void zzg() {
        this.zza.zzd(new java.lang.Exception());
    }

    @java.lang.Deprecated
    public final void zzh(java.lang.Throwable th, java.lang.String str) {
        this.zza.zzd(th);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
        }
    }

    @java.lang.Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzj() {
        return this.zzb;
    }
}
