package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbua extends zzaxn implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbuoVar);
        zzaxp.zzf(zza, zzbugVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbuoVar);
        zzaxp.zzf(zza, zzbugVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzg(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbuoVar);
        zzaxp.zzf(zza, zzbugVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzh(String str, zzbug zzbugVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzf(zza, zzbugVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzi(zzbty zzbtyVar, zzbuh zzbuhVar) {
        throw null;
    }
}
