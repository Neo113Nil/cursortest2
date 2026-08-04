package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzdnc implements zzheg {
    private final zzhep zza;

    public zzdnc(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbd.zza.EnumC0000zza enumC0000zza = ((zzcuh) this.zza).zza().zzo.zza == 3 ? zzbbd.zza.EnumC0000zza.REWARDED_INTERSTITIAL : zzbbd.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
        zzheo.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
