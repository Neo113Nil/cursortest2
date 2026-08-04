package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvj extends zzaxn implements zzbvl {
    public zzbvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zze(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzf(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzg(p105o3.a aVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeInt(i7);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzh(p105o3.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzi(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzj(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzk(p105o3.a aVar, int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzl(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzm(p105o3.a aVar, zzbvm zzbvmVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzbvmVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzn(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzo(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzp(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(5, parcelZza);
    }
}
