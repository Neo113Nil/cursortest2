package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzazr extends zzaxn implements zzazt {
    public zzazr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzb(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzd(zzazq zzazqVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzazqVar);
        zzda(1, parcelZza);
    }
}
