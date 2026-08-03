package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpl implements com.google.android.gms.internal.ads.zzeaw {
    private final java.lang.Long zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzcox zzc;
    private final com.google.android.gms.internal.ads.zzcpn zzd;

    zzcpl(com.google.android.gms.internal.ads.zzcox zzcoxVar, com.google.android.gms.internal.ads.zzcpn zzcpnVar, java.lang.Long l, java.lang.String str) {
        this.zzc = zzcoxVar;
        this.zzd = zzcpnVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final com.google.android.gms.internal.ads.zzebf zza() {
        long longValue = this.zza.longValue();
        com.google.android.gms.internal.ads.zzcpn zzcpnVar = this.zzd;
        return com.google.android.gms.internal.ads.zzebg.zza(longValue, zzcpnVar.zzd(), zzcpnVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final com.google.android.gms.internal.ads.zzebj zzb() {
        long longValue = this.zza.longValue();
        com.google.android.gms.internal.ads.zzcpn zzcpnVar = this.zzd;
        return com.google.android.gms.internal.ads.zzebk.zza(longValue, zzcpnVar.zzd(), zzcpnVar.zza(), this.zzc, this.zzb);
    }
}
