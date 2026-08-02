package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
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
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvq zzbvqVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbvqVar);
        zzda(3, zza);
    }
}
