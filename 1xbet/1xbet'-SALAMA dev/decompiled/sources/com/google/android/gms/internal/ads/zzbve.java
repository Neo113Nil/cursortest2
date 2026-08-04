package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbve extends zzaxn implements zzbvg {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(zzbva zzbvaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbvaVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzi() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzj() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzk() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzl() {
        zzda(3, zza());
    }
}
