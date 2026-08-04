package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbua extends zzaxn implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbuoVar);
        zzaxp.zzf(parcelZza, zzbugVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbuoVar);
        zzaxp.zzf(parcelZza, zzbugVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzg(zzbuo zzbuoVar, zzbug zzbugVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbuoVar);
        zzaxp.zzf(parcelZza, zzbugVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzh(String str, zzbug zzbugVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbugVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzi(zzbty zzbtyVar, zzbuh zzbuhVar) {
        throw null;
    }
}
