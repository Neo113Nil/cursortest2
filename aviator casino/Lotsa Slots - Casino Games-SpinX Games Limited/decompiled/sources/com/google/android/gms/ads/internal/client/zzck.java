package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzck extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static com.google.android.gms.ads.internal.client.zzcl zzd(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcl ? (com.google.android.gms.ads.internal.client.zzcl) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zzb(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
