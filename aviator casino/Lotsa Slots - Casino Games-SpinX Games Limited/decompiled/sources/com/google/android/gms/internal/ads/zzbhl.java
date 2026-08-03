package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhl {
    private com.google.android.gms.internal.ads.zzbha zza;
    private boolean zzb;
    private final android.content.Context zzc;
    private final java.lang.Object zzd = new java.lang.Object();

    zzbhl(android.content.Context context) {
        this.zzc = context;
    }

    final java.util.concurrent.Future zza(com.google.android.gms.internal.ads.zzbhb zzbhbVar) {
        com.google.android.gms.internal.ads.zzbhf zzbhfVar = new com.google.android.gms.internal.ads.zzbhf(this);
        com.google.android.gms.internal.ads.zzbhj zzbhjVar = new com.google.android.gms.internal.ads.zzbhj(this, zzbhbVar, zzbhfVar);
        com.google.android.gms.internal.ads.zzbhk zzbhkVar = new com.google.android.gms.internal.ads.zzbhk(this, zzbhfVar);
        synchronized (this.zzd) {
            com.google.android.gms.internal.ads.zzbha zzbhaVar = new com.google.android.gms.internal.ads.zzbha(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbhjVar, zzbhkVar);
            this.zza = zzbhaVar;
            zzbhaVar.checkAvailabilityAndConnect();
        }
        return zzbhfVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbha zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ java.lang.Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            com.google.android.gms.internal.ads.zzbha zzbhaVar = this.zza;
            if (zzbhaVar == null) {
                return;
            }
            zzbhaVar.disconnect();
            this.zza = null;
            android.os.Binder.flushPendingCommands();
        }
    }
}
