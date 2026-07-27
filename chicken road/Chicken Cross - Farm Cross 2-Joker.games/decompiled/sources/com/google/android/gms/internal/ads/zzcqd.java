package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcqd implements zzebu {
    private final Long zza;
    private final String zzb;
    private final zzcpp zzc;
    private final zzcqf zzd;

    zzcqd(zzcpp zzcppVar, zzcqf zzcqfVar, Long l, String str) {
        this.zzc = zzcppVar;
        this.zzd = zzcqfVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzebu
    public final zzecd zza() {
        long longValue = this.zza.longValue();
        zzcqf zzcqfVar = this.zzd;
        return zzece.zza(longValue, zzcqfVar.zzd(), zzcqfVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebu
    public final zzech zzb() {
        long longValue = this.zza.longValue();
        zzcqf zzcqfVar = this.zzd;
        return zzeci.zza(longValue, zzcqfVar.zzd(), zzcqfVar.zza(), this.zzc, this.zzb);
    }
}
