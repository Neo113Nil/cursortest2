package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzblq extends zzaxn implements zzbls {
    public zzblq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zze(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzg(zzblm zzblmVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzblmVar);
        zzda(1, parcelZza);
    }
}
