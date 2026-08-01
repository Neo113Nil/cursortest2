package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzboh extends zzbeu implements zzboj {
    zzboh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }
}
