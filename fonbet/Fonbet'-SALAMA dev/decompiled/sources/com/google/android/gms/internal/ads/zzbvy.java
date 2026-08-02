package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbvy extends zzaxn implements zzbwa {
    public zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg() {
        zzda(1, zza());
    }
}
