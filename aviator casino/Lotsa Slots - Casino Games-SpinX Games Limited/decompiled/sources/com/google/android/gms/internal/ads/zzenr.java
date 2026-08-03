package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzenr implements com.google.android.gms.internal.ads.zzdno {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelv zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzens zzc;

    zzenr(com.google.android.gms.internal.ads.zzens zzensVar, com.google.android.gms.internal.ads.zzelv zzelvVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzelvVar;
        this.zzb = zzfkfVar;
        java.util.Objects.requireNonNull(zzensVar);
        this.zzc = zzensVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) throws com.google.android.gms.internal.ads.zzdnn {
        try {
            com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) this.zza.zzb;
            zzflwVar.zzs(z);
            if (this.zzc.zzc().clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbt)).intValue()) {
                zzflwVar.zzd();
            } else {
                zzflwVar.zze(context);
            }
        } catch (com.google.android.gms.internal.ads.zzflf e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new com.google.android.gms.internal.ads.zzdnn(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zzb;
    }
}
