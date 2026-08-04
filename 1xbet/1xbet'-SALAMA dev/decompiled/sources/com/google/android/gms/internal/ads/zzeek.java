package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzeek extends zzbqg {
    final /* synthetic */ zzeem zza;
    private final zzebu zzb;

    public /* synthetic */ zzeek(zzeem zzeemVar, zzebu zzebuVar, zzeel zzeelVar) {
        this.zza = zzeemVar;
        this.zzb = zzebuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zze(String str) {
        ((zzedi) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzedi) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzg(zzbpd zzbpdVar) {
        this.zza.zzc = zzbpdVar;
        ((zzedi) this.zzb.zzc).zzo();
    }
}
