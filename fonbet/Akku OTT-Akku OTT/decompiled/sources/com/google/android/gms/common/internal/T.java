package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class T extends zza implements V {
    @Override // com.google.android.gms.common.internal.V
    public final boolean h(com.google.android.gms.common.E e, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, e);
        zzc.zze(zza, bVar);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.common.internal.V
    public final com.google.android.gms.common.C t(com.google.android.gms.common.A a) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, a);
        Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.C c = (com.google.android.gms.common.C) zzc.zza(zzB, com.google.android.gms.common.C.CREATOR);
        zzB.recycle();
        return c;
    }

    @Override // com.google.android.gms.common.internal.V
    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
