package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzcu extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static com.google.android.gms.ads.internal.client.zzcv asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcv ? (com.google.android.gms.ads.internal.client.zzcv) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzct(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzez liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.ads.zzbvc adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
