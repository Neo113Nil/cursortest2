package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbqb implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ java.util.Map zzd;
    final /* synthetic */ java.util.Map zze;

    zzbqb(com.google.android.gms.internal.ads.zzbqd zzbqdVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, java.util.Map map2) {
        this.zzb = z;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
        java.util.Objects.requireNonNull(zzbqdVar);
        this.zza = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((com.google.android.gms.internal.ads.zzdky) this.zzc).zzdu();
        }
        this.zza = true;
        java.util.Map map = this.zzd;
        map.put((java.lang.String) this.zze.get("event_id"), java.lang.Boolean.valueOf(z));
        ((com.google.android.gms.internal.ads.zzbsm) this.zzc).zze("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}
