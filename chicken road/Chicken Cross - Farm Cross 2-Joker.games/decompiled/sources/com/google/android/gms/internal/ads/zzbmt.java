package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbmt extends zzbeu implements zzbmv {
    zzbmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zza() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Uri zzb() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        Uri uri = (Uri) zzbew.zzb(zzda, Uri.CREATOR);
        zzda.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final double zzc() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zzd() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zze() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Map zzf() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        HashMap zzg = zzbew.zzg(zzda);
        zzda.recycle();
        return zzg;
    }
}
