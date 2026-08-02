package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbom extends zzaxn implements zzboo {
    public zzbom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbor zzb(String str) {
        zzbor zzbopVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbopVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbopVar = queryLocalInterface instanceof zzbor ? (zzbor) queryLocalInterface : new zzbop(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbqn zzc(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbqn zzb = zzbqm.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zzd(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
