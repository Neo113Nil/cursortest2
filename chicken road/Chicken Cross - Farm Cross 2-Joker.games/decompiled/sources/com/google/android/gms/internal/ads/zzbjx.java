package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbjx extends zzbev implements zzbjy {
    public zzbjx() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zza = zza();
            parcel2.writeNoException();
            parcel2.writeString(zza);
        } else if (i == 2) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i == 3) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            zzc(asInterface);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzd();
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            zze();
            parcel2.writeNoException();
        }
        return true;
    }
}
