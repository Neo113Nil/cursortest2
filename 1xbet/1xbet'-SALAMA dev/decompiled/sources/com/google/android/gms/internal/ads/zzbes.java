package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbes extends zzaxn implements IInterface {
    public zzbes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbts zzbtsVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbtsVar);
        zzda(1, parcelZza);
    }
}
