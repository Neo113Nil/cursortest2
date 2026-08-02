package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzfnm extends zzaxn implements IInterface {
    public zzfnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfnk zze(zzfni zzfniVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzfniVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzfnk zzfnkVar = (zzfnk) zzaxp.zza(zzcZ, zzfnk.CREATOR);
        zzcZ.recycle();
        return zzfnkVar;
    }

    public final zzfnt zzf(zzfnr zzfnrVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzfnrVar);
        Parcel zzcZ = zzcZ(3, zza);
        zzfnt zzfntVar = (zzfnt) zzaxp.zza(zzcZ, zzfnt.CREATOR);
        zzcZ.recycle();
        return zzfntVar;
    }

    public final void zzg(zzfnf zzfnfVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzfnfVar);
        zzda(2, zza);
    }
}
