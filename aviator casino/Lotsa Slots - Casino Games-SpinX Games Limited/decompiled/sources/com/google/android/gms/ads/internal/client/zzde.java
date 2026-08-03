package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzde extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzdg {
    zzde(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(1, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final java.lang.String zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }
}
