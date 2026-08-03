package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbmc extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbme {
    zzbmc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final android.net.Uri zzc() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        android.net.Uri uri = (android.net.Uri) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.net.Uri.CREATOR);
        zzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final double zzd() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final java.util.Map zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(6, zza());
        java.util.HashMap zzg = com.google.android.gms.internal.ads.zzbeg.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
