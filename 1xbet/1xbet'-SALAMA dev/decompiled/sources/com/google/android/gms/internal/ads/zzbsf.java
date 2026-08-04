package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsf extends zzaxn implements zzbsh {
    public zzbsf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze(Intent intent) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(String[] strArr, int[] iArr, p105o3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzaxp.zzf(parcelZza, aVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzh() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzi(p105o3.a aVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzj(p105o3.a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzaVar);
        zzda(6, parcelZza);
    }
}
