package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbom extends zzaxn implements zzboo {
    public zzbom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbor zzb(String str) {
        zzbor zzbopVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbopVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbopVar = iInterfaceQueryLocalInterface instanceof zzbor ? (zzbor) iInterfaceQueryLocalInterface : new zzbop(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbqn zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzbqn zzbqnVarZzb = zzbqm.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbqnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zzd(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
