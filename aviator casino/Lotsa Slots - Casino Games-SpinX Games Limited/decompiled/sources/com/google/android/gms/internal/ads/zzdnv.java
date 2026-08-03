package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdnv implements com.google.android.gms.internal.ads.zzcxw {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final com.google.android.gms.internal.ads.zzinj zzd;
    private final com.google.android.gms.internal.ads.zzdqd zze;

    zzdnv(java.util.Map map, java.util.Map map2, java.util.Map map3, com.google.android.gms.internal.ads.zzinj zzinjVar, com.google.android.gms.internal.ads.zzdqd zzdqdVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzinjVar;
        this.zze = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final com.google.android.gms.internal.ads.zzels zza(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzels zza;
        com.google.android.gms.internal.ads.zzels zzelsVar = (com.google.android.gms.internal.ads.zzels) this.zza.get(str);
        if (zzelsVar != null) {
            return zzelsVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            com.google.android.gms.internal.ads.zzeny zzenyVar = (com.google.android.gms.internal.ads.zzeny) this.zzc.get(str);
            if (zzenyVar != null) {
                return com.google.android.gms.internal.ads.zzcyb.zza(zzenyVar);
            }
            zza = (com.google.android.gms.internal.ads.zzels) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zza = ((com.google.android.gms.internal.ads.zzcxw) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzcyb.zzb(zza);
    }
}
