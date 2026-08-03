package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbqs extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbqt {
    public zzbqs() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static com.google.android.gms.internal.ads.zzbqt zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbqt ? (com.google.android.gms.internal.ads.zzbqt) queryLocalInterface : new com.google.android.gms.internal.ads.zzbqr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(readString);
        } else {
            if (i != 2) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
