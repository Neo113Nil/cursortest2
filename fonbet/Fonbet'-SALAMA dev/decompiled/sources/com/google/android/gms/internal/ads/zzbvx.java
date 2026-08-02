package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbvx extends zzaxn implements IInterface {
    public zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(InterfaceC1506a interfaceC1506a, String str, zzboo zzbooVar, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
