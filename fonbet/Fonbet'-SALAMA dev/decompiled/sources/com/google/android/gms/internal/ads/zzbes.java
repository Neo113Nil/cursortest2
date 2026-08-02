package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbes extends zzaxn implements IInterface {
    public zzbes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbts zzbtsVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbtsVar);
        zzda(1, zza);
    }
}
