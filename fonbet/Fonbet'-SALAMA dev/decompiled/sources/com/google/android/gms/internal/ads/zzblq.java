package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzblq extends zzaxn implements zzbls {
    public zzblq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zze(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzg(zzblm zzblmVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzblmVar);
        zzda(1, zza);
    }
}
