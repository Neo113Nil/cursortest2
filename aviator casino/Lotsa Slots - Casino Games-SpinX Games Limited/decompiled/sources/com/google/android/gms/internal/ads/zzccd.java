package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccd extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzccf {
    zzccd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(1, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }
}
