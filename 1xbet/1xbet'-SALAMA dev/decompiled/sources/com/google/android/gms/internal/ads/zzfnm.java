package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzfnm extends zzaxn implements IInterface {
    public zzfnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfnk zze(zzfni zzfniVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzfniVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfnk zzfnkVar = (zzfnk) zzaxp.zza(parcelZzcZ, zzfnk.CREATOR);
        parcelZzcZ.recycle();
        return zzfnkVar;
    }

    public final zzfnt zzf(zzfnr zzfnrVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzfnrVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfnt zzfntVar = (zzfnt) zzaxp.zza(parcelZzcZ, zzfnt.CREATOR);
        parcelZzcZ.recycle();
        return zzfntVar;
    }

    public final void zzg(zzfnf zzfnfVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzfnfVar);
        zzda(2, parcelZza);
    }
}
