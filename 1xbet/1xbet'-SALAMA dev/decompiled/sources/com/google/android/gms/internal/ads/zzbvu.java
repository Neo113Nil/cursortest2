package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvu extends zzaxn implements zzbvw {
    public zzbvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zze() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvq zzbvqVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbvqVar);
        zzda(3, parcelZza);
    }
}
