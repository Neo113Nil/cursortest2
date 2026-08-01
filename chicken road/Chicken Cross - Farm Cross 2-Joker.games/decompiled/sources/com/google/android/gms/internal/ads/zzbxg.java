package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbxg extends zzbev implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            zze(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbew.zzh(parcel);
            zzf(readString);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbwd zza = zzbwc.zza(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            zzh(zza);
        }
        parcel2.writeNoException();
        return true;
    }
}
