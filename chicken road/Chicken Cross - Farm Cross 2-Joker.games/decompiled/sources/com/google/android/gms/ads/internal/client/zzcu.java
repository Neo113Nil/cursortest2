package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcu extends zzbev implements zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcv asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcv ? (zzcv) queryLocalInterface : new zzct(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzez liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzbew.zzd(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            zzbvu adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzbew.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
