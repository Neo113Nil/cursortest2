package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbex extends zzbeu implements zzbez {
    zzbex(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final Bundle zze(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        Parcel zzda = zzda(1, zzcZ);
        Bundle bundle2 = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle2;
    }
}
