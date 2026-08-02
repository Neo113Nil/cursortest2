package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzazr extends zzaxn implements zzazt {
    public zzazr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzb(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzd(zzazq zzazqVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzazqVar);
        zzda(1, zza);
    }
}
