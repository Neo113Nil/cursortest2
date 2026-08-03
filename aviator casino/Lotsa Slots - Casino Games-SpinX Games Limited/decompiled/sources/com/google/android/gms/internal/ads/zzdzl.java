package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzl {
    private final com.google.android.gms.internal.ads.zzdzq zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.Map zzc;

    public zzdzl(com.google.android.gms.internal.ads.zzdzq zzdzqVar, java.util.concurrent.Executor executor) {
        this.zza = zzdzqVar;
        this.zzc = zzdzqVar.zza();
        this.zzb = executor;
    }

    public final com.google.android.gms.internal.ads.zzdzk zza() {
        com.google.android.gms.internal.ads.zzdzk zzdzkVar = new com.google.android.gms.internal.ads.zzdzk(this);
        zzdzkVar.zzj();
        return zzdzkVar;
    }

    public final void zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznc)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzk zza = zza();
            zza.zzc("action", "pecr");
            zza.zzd();
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzq zzc() {
        return this.zza;
    }

    final /* synthetic */ java.util.concurrent.Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zze() {
        return this.zzc;
    }
}
