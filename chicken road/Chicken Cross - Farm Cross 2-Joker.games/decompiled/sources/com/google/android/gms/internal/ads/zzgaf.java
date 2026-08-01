package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgaf extends zzbeu implements zzgah {
    zzgaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zze() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeIntArray(null);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeByteArray(bArr);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzh(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzi(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString(str);
        zzcZ.writeString(null);
        zzdb(8, zzcZ);
    }
}
