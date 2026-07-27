package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcag extends zzbeu implements zzcai {
    zzcag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(List list) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeTypedList(list);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(2, zzcZ);
    }
}
